package br.edu.udc8_6;

import java.util.Scanner;

public class AplicacaoTeste {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			Pessoa A = new Pessoa();
			Aluno B = new Aluno();
			Funcionario C = new Funcionario();
			Servente D = new Servente();
			Professor E = new Professor();
			Diretor F = new Diretor();
			
			System.out.println("Entre com o nome");
			A.setNome(sc.next());
			System.out.println(A.toString());
			
			System.out.println("Entre com o nome: ");
			B.setNome(sc.next());
			System.out.println("Entre com o curso: ");
			B.setCurso(sc.next());
			System.out.println("Entre com a série: ");
			B.setSerie(sc.next());
			System.out.println(B.toString());
			
			System.out.println("Entre com o nome: ");
			C.setNome(sc.next());
			System.out.println("Entre com o número de registro: ");
			C.setNome(sc.next());
			System.out.println("Entre com o salário: ");
			C.setSalario(sc.nextFloat());
			System.out.println("Entre com a data de admissão:  ");
			C.setData_admissao(sc.next());
			System.out.println(C.toString());
			
			System.out.println("Entre com o nome: ");
			D.setNome(sc.next());
			System.out.println("Entre com o setor: ");
			D.setSetor(sc.next());
			System.out.println(D.toString());
			
			System.out.println("Entre com o nome: ");
			E.setNome(sc.next());
			System.out.println("Entre com a disciplina: ");
			E.setDisciplina(sc.next());
			System.out.println(E.toString());
			
			System.out.println("Entre com o nome: ");
			F.setNome(sc.next());
			System.out.println("Entre com o ano de mandato: ");
			F.setAno_mandato(sc.next());
			System.out.println(F.toString());
		}
}
