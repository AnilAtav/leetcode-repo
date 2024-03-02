package main.neetCodeIO;

class TrieNode {
    boolean isEndOfWord;
    TrieNode[] children;

    public TrieNode() {
        isEndOfWord = false;
        children = new TrieNode[26]; // Assuming only lowercase English letters
    }
}

public class TrieImplementation {

    private TrieNode root;

    public TrieImplementation() {

        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (char x : word.toCharArray()) {
            if (cur.children[x - 'a'] == null)
                cur.children[x - 'a'] = new TrieNode();
            cur = cur.children[x - 'a'];
        }
        cur.isEndOfWord = true;
    }

    //iterative depth first search
    public boolean searchDepth(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (ch == '.') {
                TrieNode[] nextNodes = node.children;
                node = null;

                for (TrieNode nextNode : nextNodes) {
                    if (nextNode != null) {
                        node = nextNode;
                        break;
                    }
                }

                if (node == null) {
                    return false; // No more matches
                }
            } else {
                int index = ch - 'a';
                if (node.children[index] == null) {
                    return false; // No match for the character
                }
                node = node.children[index];
            }
        }
        return node.isEndOfWord;
    }

    //regular a-z search no special chars
    public boolean search(String word) {
        TrieNode cur = root;
        for (char x : word.toCharArray()) {
            if (cur.children[x - 'a'] == null)
                return false;
            cur = cur.children[x - 'a'];
        }
        return cur.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char x : prefix.toCharArray()) {
            if (cur.children[x - 'a'] == null)
                return false;
            cur = cur.children[x - 'a'];
        }
        return true;
    }

    //recursive search with special char '.'
    public boolean searchHelper(String word) {
        return searchRecursive(word, root);
    }
    private boolean searchRecursive(String word, TrieNode node) {
        if (word.isEmpty()) {
            return node.isEndOfWord;
        }

        char ch = word.charAt(0);
        String nextWord = word.substring(1);

        if (ch == '.') {
            for (TrieNode child : node.children) {
                if (child != null && searchRecursive(nextWord, child)) {
                    return true;
                }
            }
            return false;
        } else {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            return searchRecursive(nextWord, node.children[index]);
        }
    }

    //same recursive search with special char '.' | leet code version
    public boolean searchRT(char[] chars, int start, TrieNode root) {
        TrieNode current = root;

        for (int i = start; i < chars.length; i++) {
            char ch = chars[i];

            if (ch == '.') {
                for (TrieNode trie : current.children) {
                    // Recursive call
                    // If any of the Search calls return true, then we return true and stop
                    if (trie != null && searchRT(chars, i + 1, trie)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (current.children[ch - 'a'] == null) {
                    return false;
                }

                current = current.children[ch - 'a'];
            }
        }

        return current != null && current.isEndOfWord;
    }
    public boolean searchH(String word) {
        return searchRT(word.toCharArray(), 0, root);
    }

}
