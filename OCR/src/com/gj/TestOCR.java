package com.gj;
import java.io.File;

import com.asprise.ocr.Ocr;
public class TestOCR {

	public static void main(String[] args) throws Exception{
		
		Ocr.setUp(); // one time setup
		Ocr ocr = new Ocr(); // create a new OCR engine
		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
		String s = ocr.recognize(new File[] {new File("c:\\temp\\h2.png")}, Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println("Result: " + s);
		
		ocr.stopEngine();
	}

}





