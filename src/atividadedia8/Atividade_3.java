
package atividadedia8;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double salariobruto, adicionalnoturno, horasextras, descontos, salario;
		
		System.out.println("Digite o Salário bruto: ");
		salariobruto = leia.nextDouble();
		System.out.println("Digite adicional noturno: ");
		adicionalnoturno = leia.nextDouble();
		System.out.println("Digite horas extras");
		horasextras = leia.nextDouble();
		System.out.println("Digite descontos");
		descontos = leia.nextDouble();
		
		salario = (salariobruto+adicionalnoturno+horasextras+descontos);
		System.out.println("O salario final é: "+ salario);
		
		
		

	}

}
