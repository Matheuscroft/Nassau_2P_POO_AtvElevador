
public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int quantPessoas;
	
	public Elevador(int capacidade, int totalAndares)
	{
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.quantPessoas = 0;
	}
	
	public void Entrar()
	{
		if(quantPessoas < capacidade)
		{
			quantPessoas++;
			System.out.println("Entrou mais uma pessoa. Quantidade de pessoas: " + quantPessoas + ". Capacidade do elevador: " + capacidade);
		}
		else {
			System.out.println("Não pode entrar mais ninguém nesse elevador. Atingiu a capacidade máxima\n");
		}
		
	}
	
	public void Sair()
	{
		if(quantPessoas == 0)
		{
			System.out.println("O elevador já está vazio. Todos já saíram.\n");
		}
		else {
			quantPessoas--;
			System.out.println("Saiu mais uma pessoa. Quantidade de pessoas: " + quantPessoas);
		}
	}
	
	public void Subir()
	{
		if(andarAtual < totalAndares)
		{
			andarAtual++;
			System.out.println("Subiu mais um andar. Andar atual: " + andarAtual + ". Total de andares: " + totalAndares);
		}
		else
		{
			System.out.println("O elevador já se encontra no último andar.\n");
		}
	}
	
	public void Descer()
	{
		if(andarAtual == 0)
		{
			System.out.println("O elevador já se encontra no térreo.\n");
		}
		else
		{
			andarAtual--;
			System.out.println("Desceu mais um andar. Andar atual: " + andarAtual);
		}
	}
	
	public int getAndarAtual()
	{
		return this.andarAtual;
	}
	
	public void setAndarAtual(int andarAtual)
	{
		if(andarAtual <= totalAndares && andarAtual >= 0)
		{
			this.andarAtual = andarAtual;
			System.out.println("Você definiu o andar atual para " + andarAtual);
		}
		else
		{
			System.out.println("Este elevador vai do térreo até o andar " + totalAndares + ". O valor deve estar nessa faixa.");
		}
		
	}
	
	public int getTotalAndares()
	{
		return this.totalAndares;
	}
	
	public void setTotalAndares(int totalAndares)
	{
		this.totalAndares = totalAndares;
		System.out.println("Você definiu o total de andares para " + totalAndares);
	}
	
	public int getCapacidade()
	{
		return this.capacidade;
	}
	
	public void setCapacidade(int capacidade)
	{
		this.capacidade = capacidade;
		System.out.println("Você definiu a capacidade para " + capacidade + " pessoas.");
	}
	
	public int getQuantPessoas()
	{
		return this.quantPessoas;
	}
	
	public void setQuantPessoas(int quantPessoas)
	{
		if(quantPessoas <= capacidade)
		{
			this.quantPessoas = quantPessoas;
			System.out.println("Você definiu a quantidade de pessoas para " + quantPessoas);
		}
		else
		{
			System.out.println("Não é possível adicionar " + quantPessoas + " pessoas num elevador de capacidade máxima de " + capacidade + " pessoas.");
		}
		
	}
	
	
}
