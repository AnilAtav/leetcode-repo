package test.neet;
import main.neetCodeIO.TrieImplementation;
import org.junit.Before;
import org.junit.Test;

public class TrieWordDictionaryTest {

    TrieImplementation wordDictionary;

    @Before
    public void setUp() {
        wordDictionary = new TrieImplementation();
    }

    @Test
    public void testCpyLList() {

        wordDictionary.insert("bad");
        wordDictionary.insert("dad");
        wordDictionary.insert("mad");
        System.out.println(wordDictionary.searchDepth("pad")); // false
        System.out.println(wordDictionary.searchDepth("bad")); // true
        System.out.println(wordDictionary.searchDepth(".ad")); // true
        System.out.println(wordDictionary.searchHelper(".ad")); // true
        System.out.println(wordDictionary.searchDepth("b..")); // true

    }
}
