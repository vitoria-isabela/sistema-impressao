
package main;

public class DisciplinaSemestre 
{
    
    private int anoSemestre;
    private Disciplina disciplina;
    private Professor professor;

    public DisciplinaSemestre(int anoSemestre, Disciplina disciplina, Professor professor) 
	{
        this.anoSemestre = anoSemestre;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public DisciplinaSemestre() 
	{}
    
    

    public int getAnoSemestre() 
	{
        return anoSemestre;
    }

    public void setAnoSemestre(int anoSemestre) 
	{
        this.anoSemestre = anoSemestre;
    }

    public Disciplina getDisciplina() 
	{
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) 
	{
        this.disciplina = disciplina;
    }

    public Professor getProfessor() 
	{
        return professor;
    }

    public void setProfessor(Professor professor) 
	{
        this.professor = professor;
    }
}