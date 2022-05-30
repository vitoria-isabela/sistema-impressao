package main;

import java.util.List;

public class Professor extends Funcionario 
{
    
    private List <Disciplina> disciplinas;
    private String horarioAtendimento;
    private int numMaxCopias;
    
    public void adicionaDisciplinas(Disciplina disciplina)
	{
        disciplinas.add(disciplina);
    }

    public Professor() 
	{}

    public Professor(int matricula, String unidade, String depto, String name, char sexo, String dataNascimento, List<Disciplina> disciplinas, String horarioAtendimento, int numMaxCopias, ItemImpressao itemImpressao) 
	{
        super(matricula, unidade, depto, name, sexo, dataNascimento);
        this.disciplinas = disciplinas;
        this.horarioAtendimento = horarioAtendimento;
        this.numMaxCopias = numMaxCopias;
        itemImpressao.getArquivo();
        itemImpressao.getNumCopias();
    }

    public List <Disciplina> getDisciplinas() 
	{
        return disciplinas;
    }

    public void setDisciplinas(List <Disciplina> disciplinas) 
	{
        this.disciplinas = disciplinas;
    }

    public String getHorarioAtendimento() 
	{
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) 
	{
        this.horarioAtendimento = horarioAtendimento;
    }

    public int getNumMaxCopias() 
	{
        return numMaxCopias;
    }

    public void setNumMaxCopias(int numMaxCopias) 
	{
        this.numMaxCopias = numMaxCopias;
    }
    
}