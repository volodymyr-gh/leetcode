package implement_trie;

import java.util.HashMap;
import java.util.Map;

class Trie {
    private static class TrieNode {
        final Map<Character, TrieNode> children;
        boolean isEndOfWord;

        TrieNode() {
            this.children = new HashMap<>();
            this.isEndOfWord = false;
        }
    }

    private final TrieNode root;

    Trie() {
        this.root = new TrieNode();
    }

    void insert(String word) {
        TrieNode curr = root;
        for (Character ch : word.toCharArray()) {
            if (!curr.children.containsKey(ch)) {
                curr.children.put(ch, new TrieNode());
            }
            curr = curr.children.get(ch);
        }
        curr.isEndOfWord = true;
    }

    boolean search(String word) {
        TrieNode curr = root;
        for (Character ch : word.toCharArray()) {
            if (!curr.children.containsKey(ch)) {
                return false;
            }
            curr = curr.children.get(ch);
        }
        return curr.isEndOfWord;
    }

    boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (Character ch : prefix.toCharArray()) {
            if (!curr.children.containsKey(ch)) {
                return false;
            }
            curr = curr.children.get(ch);
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        assert trie.search("apple") == true;
        assert trie.search("app") == false;
        assert trie.startsWith("app") == true;
        trie.insert("app");
        assert trie.search("app") == true;
    }
}
