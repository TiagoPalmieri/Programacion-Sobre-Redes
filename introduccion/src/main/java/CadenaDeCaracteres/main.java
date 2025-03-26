package CadenaDeCaracteres;

public class main {

	public static void main(String[] args) {
		
		String palabra = "linKevin";
		
		palabra.charAt( 0 ); //agarra un caracter x
		palabra.compareTo("Kevin"); //false, compara texto completo
		palabra.compareToIgnoreCase("linkevin"); //true
		palabra.concat("/profile"); //agregue texto al FINAL
		palabra.contains(palabra); //devuelve si existe en el texto
		palabra.indexOf('\n'); //lo mismo que charAt pero busca un caracter
		palabra.indexOf("Ke"); //ubicacion de esa palabra devuelve 3
		palabra.length(); //largo total de la cadena
		palabra.lastIndexOf('i'); //Ultima aparicion del caracter o texto
		palabra.replace("Kevin", "Roman"); //
		palabra.replaceAll("i", "X"); //LXnKevin
		palabra.replaceAll("i", "x.X"); //Lx.XnKevx.Xn
		palabra.toString();
		palabra.valueOf(5); //transforma a texto
		palabra.trim(); //quita espacios en blanco adelante y al final
		palabra.toLowerCase();
		palabra.toUpperCase();
		
		palabra.toCharArray(); //convierte un string en un vector
		// ['l', 'i', 'n', 'K', 'e', 'v', 'i', 'n']
		palabra.split("K"); // vec[] => {"Lin", "evin"} Lin evin
		palabra.substring(2, 4); //LinKevin -> nKev
		
		//

	}

}
