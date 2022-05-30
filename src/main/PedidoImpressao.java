package main;

public class PedidoImpressao 
{
    private int numeroPedido;
    private String dataPedido;
    private String corImpressao;
    private String impressora;
    private String status;
    private String dataEntrega;
    
    private Aluno aluno;
    private Secretario secretario;
    private Professor professor;
    private ItemImpressao itemImpressao; 
    Pagamento pagamento;
 
    public PedidoImpressao(ItemImpressao itemImpressao, int numeroPedido, String dataPedido, String corImpressao, String impressora, 
    		String status, String dataEntrega, Aluno aluno, Secretario secretario, Professor professor) 
    {
        this.itemImpressao = itemImpressao;
        this.numeroPedido = numeroPedido;
        this.dataPedido = dataPedido;
        this.corImpressao = corImpressao;
        this.impressora = impressora;
        this.status = status;
        this.dataEntrega = dataEntrega;
        this.aluno = aluno;
        this.secretario = secretario;
        this.professor = professor;
    }
    
    public void adicionarItem(int numeroPedido)
	{
		while(numeroPedido != 0)
		{
			itemImpressao.getArquivo();
			itemImpressao.getNumCopias();
		}
	}
   
    public void imprimePedido(Aluno aluno)
    {
    	
        System.out.println("Numero do Pedido: " + numeroPedido + 
                "\nData do Pedido:  " + dataPedido + 
                "\nCor da Impressao: "+ corImpressao +
                "\n Impressora: " + impressora +
                "\n Status: " + status +
                "\ndataEntrega: " + dataEntrega //+
                /*"\n Valor Cobrado: " + pagamento.calculaValor(itemImpressao)*/
                );
    }
    
    public void imprimePedido(Professor professor)
    {
        System.out.println("\nNumero do Pedido: " + numeroPedido + 
                "\nData do Pedido:  " + dataPedido + 
                "\nCor da Impressao: "+ corImpressao +
                "\n Impressora: " + impressora +
                "\n Status: " + status +
                "\nData da Entrega: " + dataEntrega //+
                //"\n Valor Cobrado: " + pagamento.calculaValor(itemImpressao)
                );
    }

    public Aluno getAluno() 
	{
        return aluno;
    }

    public void setAluno(Aluno aluno) 
	{
        this.aluno = aluno;
    }

    public Secretario getSecretario() 
	{
        return secretario;
    }

    public void setSecretario(Secretario secretario) 
	{
        this.secretario = secretario;
    }

    public Professor getProfessor() 
	{
        return professor;
    }

    public void setProfessor(Professor professor) 
	{
        this.professor = professor;
    }
   
    public String getDataEntrega() 
	{
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) 
	{
        this.dataEntrega = dataEntrega;
    }

    public int getNumeroPedido() 
	{
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) 
	{
        this.numeroPedido = numeroPedido;
    }

    public String getDataPedido() 
	{
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) 
	{
        this.dataPedido = dataPedido;
    }

    public String getCorImpressao() 
	{
        return corImpressao;
    }

    public void setCorImpressao(String corImpressao) 
	{
        this.corImpressao = corImpressao;
    }

    public String getImpressora() 
	{
        return impressora;
    }

    public void setImpressora(String impressora) 
	{
        this.impressora = impressora;
    }

    public String getStatus() 
	{
        return status;
    }

    public void setStatus(String status) 
	{
        this.status = status;
    }

    public ItemImpressao getItemImpressao() 
	{
        return itemImpressao;
    }

    public void setItemImpressao(ItemImpressao itemImpressao) 
	{
        this.itemImpressao = itemImpressao;
    }
}