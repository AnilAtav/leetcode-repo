package test;

import main.MatrisTranspose;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MatrisTransposeTest {
    MatrisTranspose matristranspose;

    @Before
    public void setUp() {
        matristranspose = new MatrisTranspose();
    }

    @Test
    public void testMatrisTranspose() {

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("2\n1\n2\n3\n4\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        matristranspose.matrisTransposeFunc();

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "output:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();

//        Assert.assertEquals(output, "1234");

        System.out.println(output);
    }
}
