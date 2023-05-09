package DataStructuresAndAlgorithmsInJava;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> character;
    boolean endOfWord;

    public TrieNode() {
        character = new HashMap<>();
        endOfWord = false;
    }
}
