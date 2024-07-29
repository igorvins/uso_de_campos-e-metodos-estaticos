package criacao_classes;

public class Professor extends Pessoa {
	//-------------instanciando atributos--------------------
	private long siape;
	//------------criando metodos---------------------------
	//metodo construtor:
	public Professor(String nome) {
		super(nome);
	}
	//metodo para receber siape:
	public void AtribuirSIAPE(long num) {
		this.siape = num;
	}
	//metodo imprimir info professor:
    public void Imprimir(String prefixo) {
        System.out.printf("%s%s (SIAPE %d)[%d]\n", prefixo, nome, siape, id);
    }
}
