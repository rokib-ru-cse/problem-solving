package Trie;

public class Trie {

    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public static void main(String[] args) {
        Trie tree = new Trie();
        tree.insert("abc");
    }

    private void insert(String word) {
        TrieNode current = root;
        for (Character c : word.toCharArray()) {
            TrieNode node = current.character.get(c);
            if (node == null) {
                node = new TrieNode();
                current.character.put(c, node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public void insertRecursive(String word) {
        insertRecursive(root, word, 0);
    }

    private void insertRecursive(TrieNode current, String word, int index) {
        if (index == word.length()) {
            current.endOfWord = true;
            return;
        }
        char ch = word.charAt(index);
        TrieNode node = current.character.get(ch);
        if (node == null) {
            node = new TrieNode();
            current.character.put(ch, node);
        }
        insertRecursive(node, word, index + 1);
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (Character c : word.toCharArray()) {
            TrieNode node = current.character.get(c);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }


}
