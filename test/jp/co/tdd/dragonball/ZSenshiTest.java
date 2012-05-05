package jp.co.tdd.dragonball;

import junit.framework.TestCase;

public class ZSenshiTest extends TestCase {

    public void testSentoryoku() {

        ZSenshi goku = new ZSenshi(ZSenshi.GOKU);
        ZSenshi pikkoro = new ZSenshi(ZSenshi.PIKKORO);
        ZSenshi kuririn = new ZSenshi(ZSenshi.KURIRIN);

        assertNotNull("Z戦士は戦闘力を持つ", goku.getSentoryoku());
        assertNotNull("Z戦士は戦闘力を持つ", pikkoro.getSentoryoku());
        assertNotNull("Z戦士は戦闘力を持つ", kuririn.getSentoryoku());

        assertTrue("ピッコロはクリリンより強い", pikkoro.getSentoryoku()
                > kuririn.getSentoryoku());
        assertTrue("悟空はピッコロよりスゲー強い", goku.getSentoryoku()
                > pikkoro.getSentoryoku());

    }

}
