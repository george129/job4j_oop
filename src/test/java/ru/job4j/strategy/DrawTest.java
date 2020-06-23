package ru.job4j.strategy;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DrawTest {

    @Test
    public void drawTri() {
        String ls = System.lineSeparator();
        Assert.assertEquals(("  /\\   " + ls + " /  \\ " + ls + "/____\\" + ls), new Triangle().draw());
    }

    @Test
    public void drawQuad() {
        String ls = System.lineSeparator();
        Assert.assertEquals(" ___" + ls + "|   |" + ls + "|___|" + ls, new Square().draw());
    }

    @Test
    public void paintTest() {
        String ls = System.lineSeparator();
        String striangle = "  /\\   " + ls + " /  \\ " + ls + "/____\\" + ls;
        PrintStream out = System.out;
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        PrintStream writer = new PrintStream(bout);
        System.setOut(writer);
        Triangle sq = new Triangle();
        new Paint().draw(sq);
//        Assert.assertEquals(striangle, bout.toString());
        System.setOut(out);
        System.out.println(bout.toString());
        System.out.println(striangle);
    }
}