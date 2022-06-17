package ExerciciosPOO;

public class EcommerceProduto {

private String id_Produto;
private String nome;
private String categoria;
private String marca;
private String modelo;
private double altura;
private double largura;
protected double preco;
private double peso;
private double comprimento;



public EcommerceProduto() {
	super();
}

public EcommerceProduto(String id_Produto, String nome, double altura, double largura, double preco, double peso,
		double comprimento) {
	super();
	this.id_Produto = id_Produto;
	this.nome = nome;
	this.altura = altura;
	this.largura = largura;
	this.setPreco(preco);
	this.peso = peso;
	this.comprimento = comprimento;
}

public EcommerceProduto(String id_Produto, String nome, String categoria, double altura, double largura,
		double preco, double peso, double comprimento) {
	super();
	this.id_Produto = id_Produto;
	this.nome = nome;
	this.categoria = categoria;
	this.altura = altura;
	this.largura = largura;
	this.setPreco(preco);
	this.peso = peso;
	this.comprimento = comprimento;
}

public String getId_Produto() {
	return id_Produto;
}

public String getNome() {
	return nome;
}

public String getCategoria() {
	return categoria;
}

public String getMarca() {
	return marca;
}

public String getModelo() {
	return modelo;
}

public double getAltura() {
	return altura;
}

public double getLargura() {
	return largura;
}

public double getPreco() {
	return preco;
}

public double getPeso() {
	return peso;
}

public double getComprimento() {
	return comprimento;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}


}
