package me.design.strategy.sub3;

/**
 * Created on 2017/7/28
 */
public class Client {
    public static void main(String[] args) {
        Context con = null;
        Calc calc = new CalcImplAdd();
        con = new Context(calc);
        System.out.println(con.exec(4, 5));

        con = new Context(new CalcImplSub());
        System.out.println(con.exec(4,5));
    }
}
