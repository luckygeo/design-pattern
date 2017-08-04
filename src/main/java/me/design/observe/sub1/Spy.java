package me.design.observe.sub1;

/**
 * Created on 2017/8/3
 */
public class Spy implements Runnable {

    public Spy(IHanFeiZiImpl hanFeiZi, ILiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true) {
            if (this.type.equals("br")) {
                if (hanFeiZi.isHavingBreakFast()) {
                    liSi.update("韩非字正在吃饭");
                }
                else {
                    System.out.println("继续监控中。。。。");
                }
            }else{
                if (hanFeiZi.isHavingFun()) {
                    liSi.update("韩非字正在娱乐");
                }
            }
        }
    }

    private IHanFeiZiImpl hanFeiZi;

    private ILiSi liSi;

    private String type;




}
