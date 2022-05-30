package main;

public class Pagamento {
    
    private float valor;
    private String formaPgto;
    PedidoImpressao pedido;


    public Pagamento() 
	{}
    
    public float calculaValor(ItemImpressao itemImpressao)
	{
        Aluno aluno = pedido.getAluno();
    	Professor professor = pedido.getProfessor();
    
        
        String arquivo = itemImpressao.getArquivo();
        
        if(aluno != null)
		{
        	int numCopiasAluno = itemImpressao.getNumCopias();
        	float valor = 0;
        	
        	if(arquivo != null)
        	{
        		if(numCopiasAluno < aluno.getNumMaxCopias())
                    return valor;
        		
        		if(numCopiasAluno > aluno.getNumMaxCopias())
        		{
        			valor = (float) (numCopiasAluno*0.25);
        			return valor;
        		}
        	}
        }
        
        if(professor != null) 
        {
        	int numCopiasProf = itemImpressao.getNumCopias();
        	float valor = 0;
        	
        	if(arquivo != null)
        	{
        		if(numCopiasProf < professor.getNumMaxCopias())
                    return valor;
        		
        		if(numCopiasProf > professor.getNumMaxCopias())
        		{
        			valor = (float) (numCopiasProf*0.25);
        			return valor;
        		}	
        	}
        }
        return -1;
    }

    public float getValor() 
	{
        return valor;
    }

    public void setValor(float valor) 
	{
        this.valor = valor;
    }

    public String getFormaPgto() 
	{
        return formaPgto;
    }

    public void setFormaPgto(String formaPgto) 
	{
        this.formaPgto = formaPgto;
    }  
}
