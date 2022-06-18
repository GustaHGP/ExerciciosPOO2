package ExerciciosPOO;

import java.time.LocalDate;

public class Paciente {
private String nome;
private String cpf;
private String sobrenome;
private char sexo;
private LocalDate nascimento;
private byte idade;
private short altura;
private double peso;
private double imc;

public Paciente() {
	super();
}

public Paciente(String nome, String cpf, String sobrenome, char sexo, LocalDate nascimento, short altura, double peso) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.sobrenome = sobrenome;
	this.sexo = sexo;
	this.nascimento = nascimento;
	this.altura = altura;
	this.peso = peso;
}

public Paciente(String nome, String sobrenome, char sexo, LocalDate nascimento, short altura, double peso) {
	super();
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.sexo = sexo;
	this.nascimento = nascimento;
	this.altura = altura;
	this.peso = peso;
}

public Paciente(String nome, String cpf, String sobrenome) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.sobrenome = sobrenome;
}

public byte getIdade() {
	return idade;
}

public double getImc() {
	return imc;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public void setSexo(char sexo) {
	this.sexo = sexo;
}

public void setNascimento(LocalDate nascimento) {
	this.nascimento = nascimento;
}

public void setAltura(short altura) {
	this.altura = altura;
}

public void setPeso(double peso) {
	this.peso = peso;
}


public double obterPesoIdeal()
{
	double pideal=0.0;
	double h= (double) altura;
	if((sexo=='M')||(sexo=='m'))
	{
		pideal=(double) ((72.7 * h)-58.0);
	}
	else if((sexo=='F')||(sexo=='f'))
	{
		pideal=(double) ((62.1 * h)-44.7);
	}
	return pideal;
}

public byte calcularIdade()
{
	
	byte idade=0;
	int parametro;
	parametro=(int) nascimento.getYear()-LocalDate.now().getYear();
	idade=(byte) parametro;
	return idade;
}
public String obterSituacaoIMC()
{
String situacao=" ";
if(calcularIMC()<17.0)
{
	situacao= "A sua situacao eh:Muito abaixo do peso";
}
else if ((calcularIMC()>17.0)&&(calcularIMC()<18.49))
{
	situacao= "A sua situacao eh:Abaixo do peso";
}
else if ((calcularIMC()>18.50)&&(calcularIMC()<24.99))
{
	situacao= "A sua situacao eh:Peso ideal";
}
else if ((calcularIMC()>25.0)&&(calcularIMC()<29.99))
{
	situacao= "A sua situacao eh:Acima do peso";
}
else if ((calcularIMC()>30.0)&&(calcularIMC()<34.99))
{
	situacao= "A sua situacao eh:Obesidade I";
}
else if ((calcularIMC()>35.0)&&(calcularIMC()<39.99))
{
	situacao= "A sua situacao eh:Obesidade II(severa)";
}
else if (calcularIMC()>40.0)
{
	situacao= "A sua situacao eh:Obesidade III(morbida)";
}
return situacao;
}
public String ObterCPFOfuscado()
{
	String CPF; 
	cpf.replaceAll("--.","");
	cpf.replaceAll("\\.","");
	CPF=cpf;
	return CPF;
}
public boolean validarCPF()
{ 
	boolean val;
	if(cpf.length()==11)
	{
		val=true;
	}
	else
	{
		val=false;
	}
	return val;
}
public double calcularIMC()
{
	double imc;
	imc=(double)(peso/((altura*0.01)*(altura*0.01)));
	return imc;
}


}
