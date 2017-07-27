package me.design.adapter;

/**
 * Created on 2017/7/26
 */
public class DBHotel {

    private DBSocketInterface dbSocketInterface;

    public DBHotel(){

    }

    public DBHotel(DBSocketInterface dbSocket) {
        this.dbSocketInterface = dbSocket;
    }

    public void charge(){
        System.out.println("充电。。。。");
    }
}
