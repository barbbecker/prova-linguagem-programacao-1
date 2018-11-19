import java.util.ArrayList;
import java.util.List;

public class Turma implements ListagemAluno {

	private String nome;
	private List<Aluno> listaAlunos;

	public Turma(String nome) {
		this.nome = nome;
		this.listaAlunos = new ArrayList<Aluno>();
	}

	public String getNome() {
		return nome;
	}
	
	public void listaDosAlunosQueSobraram() {
		System.out.println("[Listagem dos Alunos que sobraram]");
		for (Aluno aluno : listaAlunos) {
			System.out.println(aluno.getNome() + " ");
		}
	}

	@Override
	public List<Aluno> listaAlunos() {
		return listaAlunos;
	}

	
	public void adiciona(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	public void remove(Aluno alunoARemover) {
		for(Aluno aluno : listaAlunos) {
			if (aluno.getNome() == alunoARemover.getNome()) {
				listaAlunos.remove(alunoARemover);
				break;
			}
		}
	}
}
