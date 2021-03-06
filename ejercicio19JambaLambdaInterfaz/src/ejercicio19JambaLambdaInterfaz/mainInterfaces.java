package ejercicio19JambaLambdaInterfaz;
/* Quiero que hag?is una interfaz que os permmita operar con 2 numeros y devuelva un valor.

A partir de esta interfaz, realizar las 4 operaciones basicas que podemos hacer con los numeros
(suma, resta, multiplicacion, division). Ademas realizar la potencia de ambos numeros.

Para todos los casos deberemos usar las funciones lambda.

Opcional: Parametrizar los tipos de numero en la interfaz (double, integer)*/
	



public class mainInterfaces {
	
	@FunctionalInterface
	interface Interfaz <T>{
		//Para una funcion lambda el nombre del metodo no importa mucho
		//pero si importa cuando queramos ejecutar la funcion lambda
		public T operacion(T a, T b);
	}
	
	public static void main(String[] args) {
		
		Interfaz<Integer> iGenericaInteger = ( n1, n2 ) -> { return n1 + n2; };
		System.out.println("Operacion (+) de integers " + iGenericaInteger.operacion(45, 30));
		Interfaz<Double> iGenericaDouble = ( n1, n2 ) -> { return n1 + n2; };
		System.out.println("Operacion (+) de doubles " + iGenericaDouble.operacion(45.0, 30.0));
		
		iGenericaInteger = ( n1, n2 ) -> { return n1 - n2; };
		System.out.println("Operacion (-) de integers " + iGenericaInteger.operacion(45, 30));
		iGenericaDouble = ( n1, n2 ) -> { return n1 - n2; };
		System.out.println("Operacion (-) de doubles " + iGenericaDouble.operacion(45.0, 30.0));
		
		iGenericaInteger = ( n1, n2 ) -> { return n1 * n2; };
		System.out.println("Operacion (*) de integers " + iGenericaInteger.operacion(45, 30));
		iGenericaDouble = ( n1, n2 ) -> { return n1 * n2; };
		System.out.println("Operacion (*) de doubles " + iGenericaDouble.operacion(45.0, 30.0));
		
		iGenericaInteger = ( n1, n2 ) -> { return n1 / n2; };
		System.out.println("Operacion (/) de integers " + iGenericaInteger.operacion(45, 30));
		iGenericaDouble = ( n1, n2 ) -> { return n1 / n2; };
		System.out.println("Operacion (/) de doubles " + iGenericaDouble.operacion(45.0, 30.0));


	}

}
