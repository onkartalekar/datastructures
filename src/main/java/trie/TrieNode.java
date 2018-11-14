package trie;

/**
 * Created by taleko01 on 11/13/2018
 */

public class TrieNode {
    private static final int MAX_CHARS = 26;

    private TrieNode[] trieNodes = new TrieNode[MAX_CHARS];
    private boolean isEndOfWord;

    public TrieNode(boolean isEndOfWord) {
        this.isEndOfWord = isEndOfWord;
    }

    public TrieNode add(Character data, boolean isEndOfWord) {
        TrieNode trieNode = new TrieNode(isEndOfWord);
        trieNodes[data - 'a'] = trieNode;
        return trieNode;
    }

    public TrieNode find(Character data) {
        return trieNodes[data - 'a'];
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }
}
