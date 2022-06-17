package ExerciciosPOO;
public class EcommerceItemVenda extends EcommerceProduto{
    EcommerceProduto  produto = new EcommerceProduto();
	private int quantidade;
	public static double subtotal;
	
	
	public EcommerceItemVenda() {
		super();
	}
	
	public EcommerceItemVenda(EcommerceProduto produto,double preco)
	{
    produto.setPreco(this.preco);
	   this.produto=produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public EcommerceProduto getProduto() {
		return produto;
	}
	public double getSubtotal() {
		return subtotal;
	}
    public void atualizarProduto(EcommerceProduto produto,int quantidade) {
    	this.produto=produto;
    	this.quantidade=quantidade;
    }
    public double Calcularsubtotal() {
    
 double precop=produto.getPreco();
 int qtd= getQuantidade(); 
    	subtotal=(double)(precop*qtd);
    	return subtotal;
    }

}
