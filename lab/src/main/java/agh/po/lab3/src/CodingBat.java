package agh.po.lab3.src;
import java.util.HashMap;
import java.util.Map;
public class CodingBat {

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.close10(2, 3));
    }

    public int close10(int a, int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        }
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        } else {
            return 0;
        }
    }

    public int intMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
    public int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Dodajemy do sumy tylko jeśli obecna liczba to nie 13
            // oraz (jeśli to nie jest pierwszy element) poprzednia liczba też nie była 13.
            if (nums[i] != 13 && (i == 0 || nums[i - 1] != 13)) {
                sum += nums[i];
            }
        }

        return sum;
    }
    public String startWord(String str, String word) {
        if (str.length() >= word.length()) {
            String strEnd = str.substring(1, word.length());
            String wordEnd = word.substring(1);

            if (strEnd.equals(wordEnd)) {
                return str.substring(0, word.length());
            }
        }

        return "";
    }
    public Map<String, String> mapAB2(Map<String, String> map) {
        Map<String, String> wynik = new HashMap<>(map);

        if (wynik.containsKey("a") && wynik.containsKey("b")) {
            if (wynik.get("a").equals(wynik.get("b"))) {
                wynik.remove("a");
                wynik.remove("b");
            }
        }

        return wynik;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, s.length());
        }

        return map;
    }
}