package jp.co.tdd.dragonball;

public class Pikkoro implements ZSenshi {

    public int getSentoryoku() {
        return 1800000;
    }

    public String bukujutsu() {
        String bukujutu = "ビュンと飛んだ！！";
        System.out.println(bukujutu);
        return bukujutu;
    }

}
