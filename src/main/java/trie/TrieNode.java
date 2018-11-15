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

    public TrieNode findNodeForData(Character data) {
        return trieNodes[data - 'a'];
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public boolean findWord(String word) {
        char[] chars = word.toCharArray();
        return findWordWithIndex(this, chars, 0);
    }

    private boolean findWordWithIndex(TrieNode currentNode, char[] chars, int index) {
        if (chars.length == index) {
            return currentNode.isEndOfWord();
        }

        TrieNode node = currentNode.findNodeForData(chars[index]);
        if (node != null) {
            return findWordWithIndex(node, chars, ++index);
        }
        return false;
    }
}
