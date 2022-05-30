package main;

class Disciplina 
{
    
    private String nome;

    public Disciplina(String nome) 
	{
        this.nome = nome;
    }

    public Disciplina() 
	{}
    

    public String getNome() 
	{
        return nome;
    }

    public void setNome(String nome) 
	{
        this.nome = nome;
    }
}