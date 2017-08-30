package me.design.singleton;

/**
 * Created on 2017/7/31
 */
public class EmperorLanHan {
    private final static EmperorLanHan emperorLanHan = null;

    private EmperorLanHan() {

    }

    public static EmperorLanHan getInstance() {
        if (emperorLanHan == null) {
            synchronized (EmperorLanHan.class){
                if(emperorLanHan == null)
                    return new EmperorLanHan();
            }
        }
        return emperorLanHan;
    }
}
