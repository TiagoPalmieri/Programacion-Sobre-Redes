package introduccion;

import java.io.IOException;
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
			ps.println( palabra );
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		psErr.println("error");
		
		
	}
	
}

