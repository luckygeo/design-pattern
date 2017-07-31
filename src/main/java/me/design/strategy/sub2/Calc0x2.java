package me.design.strategy.sub2;

import static me.design.strategy.Constant.ADD_SYMBOL;

/**
 * Created on 2017/7/28
 */
public class Calc0x2 {
    public int exec(int a, int b, String symbol) {
        return ADD_SYMBOL.equals(symbol) ? a + b : a - b;
    }
}
