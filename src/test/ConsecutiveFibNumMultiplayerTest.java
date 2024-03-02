package test;

import main.ConsecutiveFibNumMultiplayer;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ConsecutiveFibNumMultiplayerTest {

    ConsecutiveFibNumMultiplayer productFib;

    @Before
    public void setUp(){
        productFib = new ConsecutiveFibNumMultiplayer();
    }

    @Test
    public void testProductFib(){

        System.out.println(Arrays.toString(productFib.productFib(5895)));
        System.out.println(Arrays.toString(productFib.productFib(714)));
    }
}
