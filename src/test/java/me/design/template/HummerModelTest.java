package me.design.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2017/8/1
 */
public class HummerModelTest {
    @Test
    public void run() throws Exception {
        HummerModel hummerModel2 = new Hummer2ModelImpl();

        hummerModel2.run();
        HummerModel hummerModel1 = new Hummer1ModelImpl();

        hummerModel1.run();

    }

}