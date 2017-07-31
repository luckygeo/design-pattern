package me.design.strategy.sub5;

/**
 * Created on 2017/7/31
 */
public enum Year {

    JAN(MonType.Big),
    Feb(MonType.Middle);

    private final MonType monType;

    Year(MonType monType) {
        this.monType = monType;
    }

    public int ContainDays(int year) {
        return monType.getNum(year);
    }



    public enum MonType implements Count {
        Big {
            @Override
            public int getNum(int month) {
                return 31;
            }
        },
        Middle {
            @Override
            public int getNum(int month) {
                return 30;
            }
        },
        Special {
            @Override
            public int getNum(int month) {

               /* if ((month % 4 == 0 && month % 100 != 0) || month % 400 == 0) {
                    return 28;
                }
                return 29;*/
                return (month % 4 == 0 && month % 100 != 0) || month % 400 == 0 ? 28 : 29;
            }
        }


    }

    }


