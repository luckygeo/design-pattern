package me.design.singleton;

/**
 * Created on 2017/7/31
 */
public class Emperor {
    private static final  Emperor emperor = new Emperor();

    private Emperor(){

    }

    public static Emperor getInstace(){
        return emperor;
    }

    public static void say(){
        System.out.println("国无二主，我是唯一");
    }
}
