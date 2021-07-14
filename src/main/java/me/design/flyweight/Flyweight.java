package me.design.flyweight;

/**
 * @author: i
 * @createDate: 2021/7/14
 * @version: 1.0
 */
public abstract class Flyweight {
    //内部状态
    private String intrinsic;

    //外部状态
    private final String extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public abstract void operate(int extrinsic);
}
