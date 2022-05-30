package main;

public class ItemImpressao 
{

    private String arquivo;
    private int numCopias;
    
    public ItemImpressao(String arquivo, int numCopias) 
	{
        this.arquivo = arquivo;
        this.numCopias = numCopias;
    }
    public ItemImpressao() 
	{}

    public String getArquivo() 
	{
        return arquivo;
    }

    public void setArquivo(String arquivo) 
	{
        this.arquivo = arquivo;
    }

    public int getNumCopias() 
	{
        return numCopias;
    }

    public void setNumCopias(int numCopias) 
	{
        this.numCopias = numCopias;
    }
}