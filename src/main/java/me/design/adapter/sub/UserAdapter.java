package me.design.adapter.sub;

/**
 * Created on 2017/7/27
 */
public class UserAdapter extends OutIUserImpl implements IUser{

    @Override
    public void getMobile() {
        String mobile = getUserInfo().get("mobile");
        System.out.println(mobile);
    }

    @Override
    public void getUserName() {
        String name = getUserInfo().get("name");
        System.out.println(name);
    }
}
