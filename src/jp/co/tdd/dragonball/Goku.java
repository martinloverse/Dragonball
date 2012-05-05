package jp.co.tdd.dragonball;

public class Goku implements ZSenshi {

    public int getSentoryoku() {
        return 150000000;
    }

    public String bukujutsu() {
        String bukujutu = "目にもとまらぬ速さで飛んだ！！";
        System.out.println(bukujutu);
        return bukujutu;
    }

}
