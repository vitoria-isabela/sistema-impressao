package main;

public class Pessoa {

    private String name;
    private char sexo;
    private String dataNascimento;

    public Pessoa(String name, char sexo, String dataNascimento) 
	{
        this.name = name;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa() 
	{}
    
    
    public String getName() 
	{
        return name;
    }

    public void setName(String name) 
	{
        this.name = name;
    }

    public char getSexo() 
	{
        return sexo;
    }

    public void setSexo(char sexo) 
	{
        this.sexo = sexo;
    }

    public String getDataNascimento() 
	{
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) 
	{
        this.dataNascimento = dataNascimento;
    }
}