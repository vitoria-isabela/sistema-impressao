package main;

public class Secretario extends Funcionario
{
    private String horarioTrabalho;

    public Secretario(String horarioTrabalho) 
	{
        this.horarioTrabalho = horarioTrabalho;
    }

    public Secretario(int matricula, String unidade, String depto, String name, char sexo, String dataNascimento, String horarioTrabalho) 
	{
        super(matricula, unidade, depto, name, sexo, dataNascimento);
        
        this.horarioTrabalho = horarioTrabalho;
    }
    

    public Secretario() 
	{}

    public String getHorarioTrabalho() 
	{
        return horarioTrabalho;
    }
	
    public void setHorarioTrabalho(String horarioTrabalho) 
	{
        this.horarioTrabalho = horarioTrabalho;
    }
}