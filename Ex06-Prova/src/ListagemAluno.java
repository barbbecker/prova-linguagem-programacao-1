import java.util.List;

public interface ListagemAluno {

	public void adiciona(Aluno aluno);

	public void remove(Aluno aluno);

	public List<Aluno> listaAlunos();
}
