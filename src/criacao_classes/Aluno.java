package criacao_classes;

public class Aluno extends Pessoa {
	//Pessoa pessoa_aluno = new Pessoa();
	//----------declarando atributos(variaveis)----------------
	//atributo privado do RA:
	private long RA;
	//-------------------criando metodos----------------------------
	
	// criando o construtor para classe aluno e chamando o construtor da classe Pessoa 
	// pois aluno é uma pessoa e precisamos registrar o nomedo aluno
	// para chamar o construtor da classe herdada, usamos o "super()"
	public Aluno(String nome) {
		super(nome);
	}
	//metodo para atribuir RA
	public void AtribuirRA(long ra) {
		RA = ra;
	}
	
	//metodo para imprimir info do aluno:
    public void Imprimir(String prefixo) {
        System.out.printf("%s%s (RA %d)[%d]\n", prefixo, nome, RA, id);
    }
}


