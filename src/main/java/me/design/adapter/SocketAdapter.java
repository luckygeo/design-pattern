package me.design.adapter;

/**
 * Created on 2017/7/26
 */
public class SocketAdapter implements DBSocketInterface{
    //组合新接口
    private GBSocketInterface gbSocketInterface;

    public SocketAdapter(GBSocketInterface gbSocketInterface) {
        this.gbSocketInterface = gbSocketInterface;
    }

    @Override
    public void powerWithTwoRound() {
        gbSocketInterface.powerWithThreeFlat();
    }
}
