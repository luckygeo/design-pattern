package me.design.strategy.sub5;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created on 2017/7/31
 */
public class YearTest extends TestCase {
    @Test
    public void testYear() {
        System.out.println(Year.valueOf("Feb"));
        int d = Year.MonType.Special.getNum(2012);
        System.out.println(d);
    }

}