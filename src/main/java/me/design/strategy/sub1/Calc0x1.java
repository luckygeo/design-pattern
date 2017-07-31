package me.design.strategy.sub1;


import static me.design.strategy.Constant.ADD_SYMBOL;
import static me.design.strategy.Constant.SUB_SYMBOL;

/**
 * Created on 2017/7/28
 */
public class Calc0x1 {



    private int add(int a, int b){
        return a + b;
    }

    private int sub(int a, int b){
        return a - b;
    }

    public int exec(int a, int b, String symbol) {
        if(ADD_SYMBOL.equals(symbol))
            return add(a, b);
        if (SUB_SYMBOL.equals(symbol))
            return sub(a, b);
        return 0;

    }
}
