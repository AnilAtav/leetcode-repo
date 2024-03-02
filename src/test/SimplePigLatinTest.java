package test;

import main.SimplePigLatin;
import org.junit.Before;
import org.junit.Test;

public class SimplePigLatinTest {

    SimplePigLatin simplePigLatin;

    @Before
    public void setUp(){
        simplePigLatin = new SimplePigLatin();
    }

    @Test
    public void testSimplePigLatin(){

        //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
        simplePigLatin.PigLatin("Pig latin is cool !");
    }
}
