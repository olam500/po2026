package agh.po.lab3.src;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
public class CodingBatTest {

    @org.junit.Test
    public void close10() {
        CodingBat cb = new CodingBat();
        assertEquals(7, cb.close10(3, 7));
        assertEquals(3, cb.close10(1, 3));
        assertEquals(0, cb.close10(9, 11));
    }
    @org.junit.Test
    public void intMax() {
        CodingBat cb = new CodingBat();
        assertEquals(3, cb.intMax(1, 2, 3));
        assertEquals(3, cb.intMax(1, 3, 2));
        assertEquals(3, cb.intMax(3, 2, 1));
    }
    @org.junit.Test
    public void sum13() {
        CodingBat cb = new CodingBat();
        assertEquals(6, cb.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, cb.sum13(new int[]{1, 1}));
        assertEquals(6, cb.sum13(new int[]{1, 2, 2, 1, 13}));
    }
    @org.junit.Test
    public void startWord() {
        CodingBat cb = new CodingBat();
        assertEquals("hi", cb.startWord("hippo", "hi"));
        assertEquals("hip", cb.startWord("hippo", "xip"));
        assertEquals("h", cb.startWord("hippo", "i"));
    }
    @org.junit.Test
    public void mapAB2() {
        CodingBat cb = new CodingBat();
        Map<String, String> wejscie1 = new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        Map<String, String> oczek1 = Map.of("c", "cake");

        Map<String, String> wejscie2 = new HashMap<>(Map.of("a", "aaa", "b", "bbb"));
        Map<String, String> oczek2 = Map.of("a", "aaa", "b", "bbb");

        Map<String, String> wejscie3 = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        Map<String, String> oczek3 = Map.of("a", "aaa", "b", "bbb", "c", "aaa");

        assertEquals(oczek1, cb.mapAB2(wejscie1));
        assertEquals(oczek2, cb.mapAB2(wejscie2));
        assertEquals(oczek3, cb.mapAB2(wejscie3));
    }

    @org.junit.Test
    public void wordLen() {
        CodingBat cb = new CodingBat();
        String[] wejscie1 = {"a", "bb", "a", "bb"};
        Map<String, Integer> oczek1 = Map.of("bb", 2, "a", 1);

        String[] wejscie2 = {"this", "and", "that", "and"};
        Map<String, Integer> oczek2 = Map.of("that", 4, "and", 3, "this", 4);

        String[] wejscie3 = {"code", "code", "code", "bug"};
        Map<String, Integer> oczek3 = Map.of("code", 4, "bug", 3);

        assertEquals(oczek1, cb.wordLen(wejscie1));
        assertEquals(oczek2, cb.wordLen(wejscie2));
        assertEquals(oczek3, cb.wordLen(wejscie3));
    }
}
