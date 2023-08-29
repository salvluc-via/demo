package via.java.demo;

public class DemoApplication extends Object{

	public static void main(String[] args) {

//		olaMundo();
//
//		variaveis();
//
//		// Sintaxe
//
//		ifElse();
//
//		operadoresAritmeticosEAtribuicao();
//
//		operadoresComparacacaoELogicos();

		loops();

	}

	private static void loops() {

		int i = 3;

		// Enquanto
		while( i < 3 ) {
			System.out.println("Executei while 1");
		}

		// Executado pelo menos uma vez
		do {
			String frase = "Essa variavel existe dentro da chave do DO~While";
			System.out.println(frase);
			System.out.println("Executado pelo menos 1 vez");
			i++;
		} while( i < 3 );


//		System.out.println(frase);

		// Para
		for(int aux = 0; aux < 5; aux++){
			System.out.println("Dentro do loop");
		}
	}

	private static void operadoresComparacacaoELogicos() {

		// Igual
		System.out.println(1 == 1);

		// Diferente
		System.out.println(1 != 0);

		// Maior
		System.out.println(2 > 1);

		// Maior ou igual
		System.out.println(2 >= 1);
		System.out.println(2 >= 2);

		// Menor
		System.out.println(1 < 2);

		// Menor ou igual
		System.out.println(1 <= 1);
		System.out.println(1 <= 0);

		if(1 == 1 && 1 == 1){
			System.out.println("Todas as condicionais precisam ser verdadeiras");
		}

		if(1 == 1 || 2 == 1){
			System.out.println("Apenas uma condicional precisa ser verdadeira");
		}

		if( !(1 == 1) ){
			System.out.println("Nega a condicional true e retorna false");
		}

		if( !(1 != 1) ){
			System.out.println("Nega a condicional false e retorna true");
		}

	}

	private static void operadoresAritmeticosEAtribuicao() {

		int numero = 1;

		// aritmeticos

		// Soma 1
		numero = numero + 1;
		numero += 1;

		// Subtrai 1
		numero = numero - 1;
		numero -= 1;

		// Multiplicação por 2
		numero *= 2;

		// Divisão

		numero /= 2;

		// Resto de divisão

		numero %= 3;

		// Incremental e decremental

		numero++;
		numero--;


	}

	private static void ifElse() {

		String nomeBase = "Gilson";
		
		if(true){
			System.out.println("Esse cara sempre passa");
		}
		if(false){
			System.out.println("Essa linha nunca será executada");
		}

		if(nomeBase.equals("Gilson")) {
			System.out.println("1 iF");
			
			if(nomeBase.length() == 6) {
				System.out.println("5 iF");
			}
			
		}
		else if(nomeBase.equals("Robson")) {
			System.out.println("2 IF");
		}
		else {
			System.out.println("3 IF");
		}

	}

	private static void variaveis() {
		// Variaveis

		// Numeros

		// MIN -2147483648
		int valorNumerico = 2147483647;

		// MIN -9,223,372,036,854,775,808
		long valorNumericoMaior = 9_223_372_036_854_775_807L;

		// MAX 3.4028235E38
		float valorNumericoComVirgula = 1.1F;

		// MAX 1.79769313486231570e+308d | MIN -2.2250738585072014E-308
		double valorNumericoComVirgulaMaior = 1.1;

		// Boolean

		boolean meuTrueOuFalse = true;

		// Caracteres

		char meuCaractereUnico = 'V';

		String minhaString = "Minha String precisa de aspas duplas";
	}

	private static void olaMundo() {
		System.out.println("Olá mundo");
	}

}