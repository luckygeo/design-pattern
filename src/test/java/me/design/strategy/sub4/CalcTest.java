package me.design.strategy.sub4;

import junit.framework.TestCase;

/**
 * Created on 2017/7/31
 */
public class CalcTest extends TestCase {
    public void testExec() throws Exception {
        System.out.println(Calc.ADD.exec(8, 9));
        System.out.println(Calc.SUB.exec(8, 9));
    }

}