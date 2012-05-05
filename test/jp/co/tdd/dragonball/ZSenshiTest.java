package jp.co.tdd.dragonball;

import junit.framework.TestCase;

public class ZSenshiTest extends TestCase {

    public void testSentoryoku() {

        ZSenshi senshi = new Goku();
        assertNotNull("Z戦士は戦闘力を持つ", senshi.getSentoryoku());

        senshi = new Pikkoro();
        assertNotNull("Z戦士は戦闘力を持つ", senshi.getSentoryoku());

        senshi = new Kuririn();
        assertNotNull("Z戦士は戦闘力を持つ", senshi.getSentoryoku());

        ZSenshi goku = new Goku();
        ZSenshi pikkoro = new Pikkoro();
        ZSenshi kuririn = new Kuririn();

        assertTrue("ピッコロはクリリンより強い", pikkoro.getSentoryoku()
                > kuririn.getSentoryoku());
        assertTrue("悟空はピッコロよりスゲー強い", goku.getSentoryoku()
                > pikkoro.getSentoryoku());

    }

    public void testBukujutu() {

        ZSenshi goku = new Goku();
        ZSenshi pikkoro = new Pikkoro();
        ZSenshi kuririn = new Kuririn();

        assertEquals("悟空の舞空術", "目にもとまらぬ速さで飛んだ！！"
                ,goku.bukujutsu());
        assertEquals("ピッコロの舞空術", "ビュンと飛んだ！！"
                ,pikkoro.bukujutsu());
        assertEquals("クリリンの舞空術", "普通に飛んだ！！"
                ,kuririn.bukujutsu());
    }

}
