package ExerciciosPOO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ExerciciosPOO.EcommerceItemVenda;
import ExerciciosPOO.EcommerceProduto;
public class Ecommerce {
static Scanner input1=new Scanner(System.in);
static int i=0;
static ArrayList <EcommerceProduto> prod = new ArrayList <>();
	private static void Cadastrar()
	{
     String id_Produto;
	 String nome;
     String categoria;
	 String marca;
	 String modelo;
	 double altura;
	 double largura;
     double preco;
	 double peso;
	 double comprimento;
	 
	 System.out.println("Numero do id do produto:");
	 id_Produto= input1.next();
	 System.out.println("Nome do produto:");
	 nome=input1.next();
	 System.out.println("categoria do produto:");
	 categoria=input1.next();
	 System.out.println("Marca do produto:");
	 marca=input1.next();
	 System.out.println("Modelo do produto:");
	 modelo=input1.next();
	 System.out.println("Altura do produto:");
	 altura=input1.nextDouble();
	 System.out.println("Largura do produto:");
	 largura=input1.nextDouble();
	 System.out.println("Preco do produto:");
	 preco=input1.nextDouble();
	 System.out.println("Peso do produto:");
	 peso=input1.nextDouble();
	 System.out.println("Comprimento do produto:");
	 comprimento=input1.nextDouble();
	 EcommerceProduto produt = new EcommerceProduto(id_Produto,nome,categoria,altura,largura,preco,peso,comprimento);
     produt.setMarca(marca);
     produt.setModelo(modelo);
	 prod.add(i,produt);
	 i++;
	 menu();
	}
	
	private static void AtualizarProduto()
	{
	 String id_Produto;
	 String nome;
	 String categoria;
     String marca;
	 String modelo;
     double altura;
	 double largura;
	 double preco;
     double peso;
	 double comprimento;
	 String idbusca;
	 System.out.println("Digite o id do produto:");
	 idbusca=input1.next();
	 for(int d=0;d<prod.size();d++)
	 {
	 if(prod.get(d).getId_Produto().compareTo(idbusca)==0)
	 {
	 prod.remove(d);
     System.out.println("Se deseja manter o mesmo valor nos campos repita as informacoes passadas no cadastro");
	 
	 System.out.println("1-Digite o novo numero do id do produto:");
	 id_Produto= input1.next();
	 System.out.println("2-Digite o novo nome do produto:");
	 nome=input1.next();
	 System.out.println("3-Digite a nova categoria do produto:");
	 categoria=input1.next();
	 System.out.println("4-Digite a nova marca do produto:");
	 marca=input1.next();
	 System.out.println("5-Digite o novo modelo do produto:");
	 modelo=input1.next();
	 System.out.println("6-Digite a nova altura do produto:");
	 altura=input1.nextDouble();
	 System.out.println("7-Digite a nova largura do produto:");
	 largura=input1.nextDouble();
	 System.out.println("8-Digite o novo preco do produto:");
	 preco=input1.nextDouble();
	 System.out.println("9-Digite o novo peso do produto:");
	 peso=input1.nextDouble();
	 System.out.println("10-Digite o novo comprimento do produto:");
	 comprimento=input1.nextDouble();
	 EcommerceProduto produt = new EcommerceProduto(id_Produto,nome,categoria,altura,largura,preco,peso,comprimento);
  produt.setMarca(marca);
  produt.setModelo(modelo);
    prod.add(d,produt);
	 }
	 }
	 System.out.println("As informações foram atualizadas");
	 menu();
	}	
	
	private static void Vender()
	{   
		EcommerceItemVenda prodv = new EcommerceItemVenda();
		String idbusca;
		int qtd;
		System.out.println("Digite o id do produto a ser vendido:");
		idbusca=input1.next();
		for(int d=0;d<prod.size();d++)
		{
			if(prod.get(d).getId_Produto().compareTo(idbusca)==0)
			{
				System.out.println("Digite a quantidade do produto que será vendida:");
				qtd=input1.nextInt();
				prodv.setQuantidade(qtd);
				prodv.produto=prod.get(d);
				System.out.println("O valor a se pago eh:"+prodv.Calcularsubtotal()+"R$");
			}
			
		}
		menu();
	}
	
	
public static void menu()
{
	Scanner input1=new Scanner(System.in);
	
	System.out.println("Escolha uma das opcoes:\n1-Cadastrar produto \n2-Atualizar produto \n3-Vender produto \n4-Sair");
	byte escolha=input1.nextByte();
	switch(escolha)
	{
	case 1:
		Cadastrar();
		break;
		
	case 2:
		AtualizarProduto();
		break;
		
	case 3:
		Vender();
		break;
		
	case 4:
		System.exit(0);
	}
}
	public static void main(String[] args) {
		menu();

	}

}
