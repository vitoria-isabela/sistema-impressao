package main;

public class Aluno extends Pessoa
{
    private int matricula;
    private String curso;
    private int numMaxCopias;
    
    
    public Aluno ()
    {}

    public Aluno(String name, char sexo, String dataNascimento, int matricula, String curso, int numMaxCopias, ItemImpressao itemImpressao) 
	{
    	super(name, sexo, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
        this.numMaxCopias = numMaxCopias;
        itemImpressao.getArquivo();
        itemImpressao.getNumCopias();
    }
    
    
    public int getMatricula() 
	{
        return matricula;
    }

    public void setMatricula(int matricula) 
	{
        this.matricula = matricula;
    }

    public String getCurso() 
	{
        return curso;
    }

    public void setCurso(String curso) 
	{
        this.curso = curso;
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
