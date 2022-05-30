package main;

import java.util.ArrayList;
import java.util.List;

public class ClassePrincipal 
{
	public static void main(String[] args)
	{ 
		Professor prof = new Professor();
		Aluno aluno = new Aluno();
		Secretario secretario = new Secretario();
		
		Disciplina disciplinaUm = new Disciplina ("DCC013");
		Disciplina disciplinaDois = new Disciplina ("DCC012");
		Disciplina disciplinaTres = new Disciplina ("DCC177");
		
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		disciplinas.add(disciplinaUm);
		disciplinas.add(disciplinaDois);
		disciplinas.add(disciplinaTres);
		
		secretario.setDataNascimento("28/09/1981");
		secretario.setDepto("UFJF");
		secretario.setHorarioTrabalho("Seg-Sex | 8-18h");
		secretario.setMatricula(201705487);
		secretario.setName("Alina Cardoso da Silva");
		secretario.setSexo('F');
		secretario.setUnidade("UFJF - Campus JF");
		
		prof.setDataNascimento("08/08/1978");
		prof.setDepto("DCC");
		prof.setDisciplinas(disciplinas);
		prof.setHorarioAtendimento("Segunda -> 14-16h");
		prof.setMatricula(201065086);
		prof.setName("Roberto Alves da Cunha");
		prof.setNumMaxCopias(200);
		prof.setSexo('M');
		prof.setUnidade("UFJF - Campus JF");
		
		aluno.setCurso("Ciencia da Computacao");
		aluno.setDataNascimento("23/07/2001");
		aluno.setMatricula(202065097);
		aluno.setName("Vitoria Isabela de Oliveira");
		aluno.setNumMaxCopias(50);
		aluno.setSexo('F');

		String arqAluno = "Livro-Modelagem-Sistemas";
		String arqProf = "Livro-Estrutura-de-Dados";
		
		ItemImpressao itemImpressaoAluno = new ItemImpressao(arqAluno, 2);
		ItemImpressao itemImpressaoProf = new ItemImpressao(arqProf, 50);
		
		PedidoImpressao pedidoAluno = new PedidoImpressao(itemImpressaoAluno, 123, "29/05/2022", "P/B", "HP DeskJet Ink Advantage 2676",
				"na fila", "31/05/2022", aluno, secretario, prof);
		PedidoImpressao pedidoProfessor = new PedidoImpressao(itemImpressaoProf, 456, "30/05/2022", "Colorido", "HP LaserJet Pro M180NW", 
				"na fila", "03/06/2022", aluno, secretario, prof);
	
		
		pedidoAluno.imprimePedido(aluno);
		pedidoProfessor.imprimePedido(prof); 
	}
}
