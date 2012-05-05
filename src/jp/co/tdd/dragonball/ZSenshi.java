package jp.co.tdd.dragonball;

public abstract class ZSenshi {

  public abstract int getSentoryoku();

  public abstract String getBukujutsuSokudo();

  public String bukujutsu() {
      String bukujutu = getBukujutsuSokudo() + "飛んだ！！";
      System.out.println(bukujutu);
      return bukujutu;
  }

}
