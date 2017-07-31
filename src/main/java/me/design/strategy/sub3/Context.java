package me.design.strategy.sub3;

/**
 * Created on 2017/7/28
 */
public class Context {
    private Calc calc = null;

    public Context(Calc calc) {
        this.calc = calc;
    }

    public int exec(int a, int b) {
        return this.calc.calc(a, b);
    }
}
