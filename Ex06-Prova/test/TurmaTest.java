import org.junit.Test;

public class TurmaTest {

	@Test
	public void testarMetodos() {
		Aluno barbara = new Aluno("Bárbara", 2016);
		Aluno adrian = new Aluno("Adrian", 2014);
		Aluno daniel = new Aluno("Daniel", 2000);
		Aluno anderson = new Aluno("Anderson", 2000);
		
		Turma turma = new Turma("Nova");
		turma.adiciona(barbara);
		turma.adiciona(adrian);
		turma.adiciona(daniel);
		turma.adiciona(anderson);
		
		turma.remove(barbara);
		turma.listaDosAlunosQueSobraram();
	}
}
