package test;

import jecna.Ctverec;

import static org.junit.jupiter.api.Assertions.*;

class CtverecTest {

    @org.junit.jupiter.api.Test
    void getStrana() {
        Ctverec c = new Ctverec(5);
        assertEquals(5, c.getStrana(), "nefunkční getter");
    }

    @org.junit.jupiter.api.Test
    void setStrana() {
        fail("Missing");
    }
}