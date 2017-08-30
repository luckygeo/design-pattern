package me.design.singleton;

import junit.framework.TestCase;

/**
 * Created on 2017/7/31
 */
public class EmperorTest extends TestCase {
    public void testSay() throws Exception {
        Emperor emperor = Emperor.getInstace();
        emperor.say();

        Emperor emperor1 = Emperor.getInstace();

        emperor1.say();
    }

}