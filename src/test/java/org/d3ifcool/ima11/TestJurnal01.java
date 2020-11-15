package org.d3ifcool.ima11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestJurnal01 {
	
	private static final String INPUT = {
            "Dira\nRadi\nIdar\n-"
    };

    @Test
    public void testJurnal() {
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
