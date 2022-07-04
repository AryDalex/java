package src;

import src.utils.PadoMath;

public class HelloWord{

	public static void main(String[] args){

		// PadoMath pado = new PadoMath(3);

		for(int i = 0; i < args.length; i++){ /* args.legth -> memoria do vetor */

			System.out.println(args[i]);
		}

		System.out.println("Hello Padolabs!: " + PadoMath.myFirstFunction(3));

		System.out.println("Resultado: " + PadoMath.somatoria(10)); // somatoria

		System.out.println("Resultado: " + PadoMath.produtoria(20));
	}
}
