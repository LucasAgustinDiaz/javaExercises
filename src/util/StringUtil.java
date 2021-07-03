package util;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	public static String replicate(char c,int n)
	{
		//Implementación
		return null;
	}
	
	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	public static String lpad(String s,int n,char c)
	{
		//Implementación
		return s;
	}
	
	// Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] new_arr = new String[arr.length];
		for (int i = 0; i < arr.length; i++)
			new_arr[i] = String.valueOf(arr[i]);

		return new_arr;
	}
	
	// Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] new_arr = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			new_arr[i] = Integer.valueOf(arr[i]);

		return new_arr;
	}
	
	
	// Retorna la longitud del elemento con mayor cantidad 
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int max = -1;
		for (String s : arr)
			if (max < s.length()) max = s.length();

		return max;
	}
	
	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[],char c)
	{
		int MAX_LENGTH = maxLength(arr);
		String str;
		int iterate;
		for (int i = 0; i < arr.length; i++) {
			str = arr[i];
			iterate = MAX_LENGTH - str.length();
			while (--iterate >= 0) str = c + str;
			arr[i] = str;
		}
	}

	// Completa los elemento del arr agregando caracteres c
	// a la derecha, dejando a todos con la longitud del mayor
	public static void rNormalize(String arr[],char c)
	{
		int MAX_LENGTH;
		MAX_LENGTH = maxLength(arr);
		StringBuilder str;
		int iterate;
		for (int i = 0; i < arr.length; i++) {
			str = new StringBuilder(arr[i]);
			iterate = MAX_LENGTH - str.length();
			while (--iterate >= 0) str.append(c);
			arr[i] = str.toString();
		}
	}

	public static String lTrim(String s) {

		while (s.length() > 0 && s.charAt(0) == ' ')
			s = s.substring(1);

		return s;
	}

	public static String rTrim(String s) {
		while (s.length() > 0 && s.charAt(s.length()-1) == ' ')
			s = s.substring(0,s.length()-1);

		return s;
	}

	public static String trim(String s) {
		return s.trim();
	}

	// Retorna la posición de la n-ésima
	// ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2,
	// la función debe retornar la posicióon de la segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.
	public static int indexOfN(String s,char c,int n) {
		System.out.println(c);
		int index = 0;
		int count = 0;
		while (index != -1 && count < n) {
			index = s.indexOf(c, index) + 1;
			count++;
		}

		return index - 1;
	}
}















