package test;

import main.DirectionsReduction;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class DirectionsReductionTest {

    DirectionsReduction directionsReduction;

    @Before
    public void setUp(){
        directionsReduction = new DirectionsReduction();
    }

    @Test
    public void testDirectionsReduction(){
        //eslesen string pairlerini siler => "NORTH"-"SOUTH" silinir
        System.out.println(Arrays.toString(directionsReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST", "NORTH"})));

    }
}
