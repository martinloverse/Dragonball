package jp.co.tdd.dragonball;

import junit.framework.TestCase;

public class ZSenshiTest extends TestCase {

    public void testSentoryoku() {
        ZSenshi goku = new ZSenshi();
        assertNotNull("Z戦士は戦闘力を持つ", goku.getSentoryoku());
    }

}
