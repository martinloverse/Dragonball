package jp.co.tdd.dragonball;

import junit.framework.TestCase;

public class ZSenshiTest extends TestCase {

    public void testSentoryoku() {
        ZSenshi goku = new ZSenshi();
        ZSenshi pikkoro = new ZSenshi();
        ZSenshi kuririn = new ZSenshi();

        assertNotNull("Z戦士は戦闘力を持つ", goku.getSentoryoku());
        assertNotNull("Z戦士は戦闘力を持つ", pikkoro.getSentoryoku());
        assertNotNull("Z戦士は戦闘力を持つ", kuririn.getSentoryoku());

    }

}
