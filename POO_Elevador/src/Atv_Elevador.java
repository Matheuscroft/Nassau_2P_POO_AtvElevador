import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv_Elevador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int totalAndares = 0;
		int capacidade = 0;
		
		System.out.println("Boas vindas a Elevadorlândia!");
		System.out.println("Vamos criar um novo elevador.");
		System.out.println("O elevador será instalado em um prédio de quantos andares?");
		totalAndares = scanner.nextInt();
		System.out.println("Qual será a capacidade máxima em número de pessoas?");
		capacidade = scanner.nextInt();

		Elevador elevador = new Elevador(capacidade, totalAndares);
		
		System.out.println("Agora vamos entrar no mundo do simulador!");
		
		MenuPrincipal(scanner, elevador);
		
		scanner.close();

	}
	
	public static void MenuPrincipal(Scanner scanner, Elevador elevador) {

		System.out.println(
				"\nO que deseja fazer?\n1 - Entrar\n2 - Sair\n3 - Subir\n4 - Descer\n5 - getAndarAtual\n6 - setAndarAtual\n7 - getTotalAndares\n8 - setTotalAndares\n9 - getCapacidade\n10 - setCapacidade\n11 - getQuantPessoas\n12 - setQuantPessoas");
		int opcaoMenu = tentarLerInt(scanner);

		switch (opcaoMenu) {
		case 1:
			elevador.Entrar();
			MenuPrincipal(scanner, elevador);
			break;
		case 2:
			elevador.Sair();
			MenuPrincipal(scanner, elevador);
			break;
		case 3:
			elevador.Subir();
			MenuPrincipal(scanner, elevador);
			break;
		case 4:
			elevador.Descer();
			MenuPrincipal(scanner, elevador);
			break;
		case 5:
			System.out.println("Andar atual: " + elevador.getAndarAtual());
			MenuPrincipal(scanner, elevador);
			break;
		case 6:
			elevador.setAndarAtual(setarValor(scanner));
			MenuPrincipal(scanner, elevador);
			break;
		case 7:
			System.out.println("\nTotal de andares: " + elevador.getTotalAndares());
			MenuPrincipal(scanner, elevador);
			break;
		case 8:
			elevador.setTotalAndares(setarValor(scanner));
			MenuPrincipal(scanner, elevador);
			break;
		case 9:
			System.out.println("\nCapacidade máxima: " + elevador.getCapacidade());
			MenuPrincipal(scanner, elevador);
			break;
		case 10:
			elevador.setCapacidade(setarValor(scanner));
			MenuPrincipal(scanner, elevador);
			break;
		case 11:
			System.out.println("\nQuantidade de pessoas no elevador: " + elevador.getQuantPessoas());
			MenuPrincipal(scanner, elevador);
			break;
		case 12:
			elevador.setQuantPessoas(setarValor(scanner));
			MenuPrincipal(scanner, elevador);
			break;
		default:
			System.out.println("Escolheu incorretamente.");
			MenuPrincipal(scanner, elevador);
			break;
		}

	}
	
	public static int setarValor(Scanner scanner)
	{
		int valor;
		
		System.out.println("Desejar setar qual valor?");
		valor = scanner.nextInt();
		
		return valor;
	}
	
	public static int tentarLerInt(Scanner scanner)
	{
		int opcao = 0;
		
		try {
            opcao = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Digite um número!");
            scanner.next();
            opcao = tentarLerInt(scanner);
            return opcao;
        }
		
		return opcao;
	}

}
