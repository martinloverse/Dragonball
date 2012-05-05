package jp.co.tdd.dragonball;

public class ZSenshi {

    public static final String GOKU = "GOKU";
    public static final String PIKKORO = "PIKKORO";
    public static final String KURIRIN = "KURIRIN";

    private int sentoryoku;

    public ZSenshi(String name) {
        if(name.equals(GOKU)) {
            //悟空：フリーザ戦クリリンのことかー！時　ウィキペディアより
            this.sentoryoku = 150000000;
        } else if (name.equals(PIKKORO)) {
            //ピッコロ：フリーザ戦時　ウィキペディアより
            this.sentoryoku = 1800000;
        } else if (name.equals(KURIRIN)) {
            //クリリン：フリーザ戦時　ウィキペディアより
            this.sentoryoku = 13000;
        }
    }

    public int getSentoryoku() {
        return this.sentoryoku;
    }

}
