import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        // s = "anagram", t = "nagaram" -> true
        // s = "rat", t = "car"         -> false
        // contains same letters + same letter frequency
        HashMap<Character, Integer> sCharFreq = new HashMap<>();
        HashMap<Character, Integer> tCharFreq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int kfreq = sCharFreq.getOrDefault(s.charAt(i), 0);
            sCharFreq.put(s.charAt(i), ++kfreq);
        }

        for (int i = 0; i < t.length(); i++) {
            int kfreq = tCharFreq.getOrDefault(t.charAt(i), 0);
            tCharFreq.put(t.charAt(i), ++kfreq);
        }
        return sCharFreq.equals(tCharFreq);
    }
}

// if the inputs were to contain unicode characters would
// make the keys in the hashmaps a datatype that uses more bits
