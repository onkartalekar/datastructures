package trie;

/**
 * Created by taleko01 on 11/13/2018
 */

public class TrieTest {

    public static void main(String... args) {
        String[] dictionary = {"onkar", "compass", "charlotte", "charlottesville", "oscar"};
        TrieNode root = new TrieNode(false);

        for (String word : dictionary) {
            int index = 0;
            TrieNode trieNode = root;
            char[] chars = word.toCharArray();
            for (char c : chars) {
                TrieNode node = trieNode.find(c);
                if (node != null) {
                    trieNode = node;
                    index++;
                } else {
                    trieNode = trieNode.add(c, chars.length == ++index);
                }
            }
        }
        System.out.println(root);
    }
}
