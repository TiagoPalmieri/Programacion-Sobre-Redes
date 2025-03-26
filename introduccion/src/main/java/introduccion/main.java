package introduccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		/*
		System.out;
		System.err;
		*/
		
		PrintStream ps = new PrintStream(System.out);
		PrintStream psErr = new PrintStream(System.err);
		
		ps.println("Estamo");
		
		try {
			int linea;
			String palabra="";
			while( (linea = System.in.read())  !=  13  )
			{
				palabra = palabra + (char)linea; 
			}
			ps.printf( "La variable palabra:%s \n", palabra );
			
			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader br = new BufferedReader(isr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		psErr.println("error");
		
		
	}
	
}

