package org.d3ifcool.ima11;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTP01 {

    private static final String[] INPUT = {
            "3\nDira\nRadi\nIdar"
    };
    

    @Test
    public void testTP() {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        System.setIn(new ByteArrayInputStream(INPUT.getBytes()));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        Jurnal02.main(null);

        assertEquals("Dira" + "\n", bos.toString())
		|| assertEquals("Radi" + "\n", bos.toString())
		|| assertEquals("Idar" + "\n", bos.toString());
        

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
