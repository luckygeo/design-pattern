package me.design.adapter.sub;

/**
 * Created on 2017/7/27
 */
public class IUserImpl implements IUser {
    @Override
    public void getMobile() {
        System.out.println("获取本地员工电话号码");
    }

    @Override
    public void getUserName() {
        System.out.println("获取本地员工姓名");
    }
}
