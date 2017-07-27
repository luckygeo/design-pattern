package me.design.adapter.sub;

import junit.framework.TestCase;

/**
 * Created on 2017/7/27
 */
public class UserAdapterTest extends TestCase {
    public void testGetMobile() throws Exception {
        UserAdapter userAdapter = new UserAdapter();
        userAdapter.getMobile();
        userAdapter.getUserName();
    }

    public void testGetUserName() throws Exception {
    }

}