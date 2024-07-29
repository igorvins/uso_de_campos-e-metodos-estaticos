package criacao_classes;

import java.util.ArrayList;

public class Disciplina {
	//---------instanciando propriedades------------------
	private String nome;
	private Pessoa professor;
	private ArrayList<Pessoa> alunos = new ArrayList<Pessoa>();
	//----------criando metodos para classe----------------
	//metodo construtor:
	public Disciplina(String nome_disciplina) {
		this.nome = nome_disciplina;
	}
	//metodo para incluir um professor:
	public void IncluirProfessor(Pessoa prof) {
		professor = prof;
	}
	//metodo para incluir um aluno:
	public void IncluirAluno(Pessoa aluno) {
		alunos.add(aluno);
	}
	//metodo para imprimir e verificações:
    public void Imprimir(String prefixo) {
        System.out.printf("%s%s [%s]\n", prefixo, nome, Curso.gerarCodigoDisciplina(nome));
        System.out.printf("%s\tProfessor:\n", prefixo);
        if (professor == null)
            System.out.printf("%s\t\t-vazio-\n", prefixo);
        else
            professor.Imprimir(prefixo + "\t\t");
        System.out.printf("%s\tAlunos:\n", prefixo);
        if (alunos.size() > 0) {
            for (Pessoa a: alunos) {
                a.Imprimir(prefixo + "\t\t");
            }
        } else {
            System.out.printf("%s\t\t-vazio-\n", prefixo);
        }
    }
}
