package main;

public class Funcionario extends Pessoa
{

    private int matricula;
    private String unidade;
    private String depto;

    public Funcionario() 
	{}

    public Funcionario(int matricula, String unidade, String depto, String name, char sexo, String dataNascimento) 
	{
    	super(name, sexo, dataNascimento);
        this.matricula = matricula;
        this.unidade = unidade;
        this.depto = depto;
    }
    
    
    public int getMatricula() 
	{
        return matricula;
    }
	
    public void setMatricula(int matricula) 
	{
        this.matricula = matricula;
    }

    public String getUnidade() 
	{
        return unidade;
    }

    public void setUnidade(String unidade) 
	{
        this.unidade = unidade;
    }

    public String getDepto() 
	{
        return depto;
    }

    public void setDepto(String depto) 
	{
        this.depto = depto;
    }
}