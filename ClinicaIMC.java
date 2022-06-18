package ExerciciosPOO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import ExerciciosPOO.Paciente;
public class ClinicaIMC {
	public static Scanner input= new Scanner(System.in);
	static ArrayList <Paciente> pacientes= new ArrayList();
	public static void Cadastrarficha()
{
  String nome;
  String cpf;
  String sobrenome;
  char sexo;
  LocalDate nascimento = null;
  char[] data;
  byte idade;
  short altura;
  double peso;
  System.out.println("Digite o nome do paciente:");
  nome=input.next();
  System.out.println("Digite o cpf do paciente:");
  cpf=input.next();
  System.out.println("Digite o sobrenome do paciente:");
  sobrenome=input.next();
  System.out.println("Digite o sexo do paciente(M/m para masculino ou F/f para feminino):");
  sexo=input.next().charAt(0);
  System.out.println("Digite a data de nascimento do paciente:");
  nascimento=LocalDate.parse(input.next());
  System.out.println("Digite o peso do paciente:");
  peso = input.nextDouble();
  System.out.println("Digite a altura do paciente:");
  altura = input.nextShort();
  Paciente atendimento= new Paciente(nome,cpf,sobrenome,sexo,nascimento,altura,peso);
  atendimento.calcularIdade();
  atendimento.validarCPF();
 atendimento.ObterCPFOfuscado();
  pacientes.add(atendimento);
  Menu();
}
public static void CalcularIMC()
	{   
		String cpf;
		System.out.println("Digite o cpf do paciente para calcular o IMC:");
		cpf=input.next();
		cpf.replaceAll("//.", "");
		cpf.replaceAll("--.", "");
		for(int i=0;i<pacientes.size();i++)
		{
			if(pacientes.get(i).ObterCPFOfuscado().compareTo(cpf)==0)
			{
				pacientes.get(i).obterPesoIdeal();
				System.out.println("IMC calculado com sucesso");
			}
		}
		Menu();
	}
	
public static void Informarsituacao()
 {

	String cpf;
	System.out.println("Digite o cpf do paciente para calcular o IMC:");
	cpf=input.next();
	cpf.replaceAll("//.", "");
	cpf.replaceAll("--.", "");
	for(int i=0;i<pacientes.size();i++)
	{
		if(pacientes.get(i).ObterCPFOfuscado().compareTo(cpf)==0)
		{
			System.out.println(pacientes.get(i).obterSituacaoIMC());
			System.out.printf("O IMC atual do paciente eh:%.2f",pacientes.get(i).calcularIMC());
		}
	}
	Menu();
  }
public static void Menu()
{
	Scanner input1=new Scanner(System.in);
	
	System.out.println("Escolha uma das opcoes:\n1-Cadastrar ficha \n2-Calcular IMC \n3-Situacao do paciente \n4-Sair");
	byte escolha=input1.nextByte();
	switch(escolha)
	{
	case 1:
		Cadastrarficha();
		break;
		
	case 2:
		CalcularIMC();
		break;
		
	case 3:
		Informarsituacao();
		break;
		
	case 4:
		System.exit(0);
	}
}
	public static void main(String[] args) {
		Menu();

	}

}
