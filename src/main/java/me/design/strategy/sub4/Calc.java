package me.design.strategy.sub4;

/**
 * Created on 2017/7/28
 */
public enum Calc{

    ADD("+"){
        @Override
        public int exec(int a, int b){
            return a + b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b){
            return a - b;
        }
    };



    String valuess= "";

    Calc(String valuess){
        this.valuess = valuess;
    }

    public String getValuess(){
        return this.valuess;
    }

    public abstract int exec(int a, int b);



}