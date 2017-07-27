package me.design.adapter;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created on 2017/7/26
 */
public class SocketAdapterTest extends TestCase {
    @Test
    public void testPowerWithTwoRound() throws Exception {

        DBSocketInterface dbSocketInterface = new SocketAdapter(new GBSocketInterfaceImpl());
        dbSocketInterface.powerWithTwoRound();

    }

}