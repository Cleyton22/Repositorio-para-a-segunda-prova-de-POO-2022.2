package prova2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//Classe para armazenar declarações e implementações de funções para manter a classe Main mais curta e limpa
public class FuncoesMain {
	Scanner sc = new Scanner(System.in);
	
	public void bemVindo() {
		System.out.println("Bem vindo ao sistema de gerênciamento das atividades do CBPOO\n");
	}
	
	public void erroDigitado() {
		System.out.println("\nErro: você deveria digitar um número!\n");
	}
	
	public void pedidoCpf() {
		System.out.print("Digite o seu CPF: ");
	}
	
	public void pedidoSenha() {
		System.out.print("Digite a sua senha: ");
	}
	
	public void pedidoNome() {
		System.out.print("Digite o seu nome: ");
	}
	
	public void loginValido() {
		System.out.println("\nLogin efetuado com sucesso!\n");
	}
	
	public void loginCadastrado() {
		System.out.println("\nLogin cadastrado com sucesso!\n");
	}
	
	public void loginInvalido() {
		System.out.println("\nSenha incorreta!\n");
	}
	
	public void operacaoInvalida() {
		System.out.println("Operação inválida!\n");
	}
	
	public void cargoInvalido() {
		System.out.println("Cargo inválido!\n");
	}
	
	public void listarParticipantes() {
		System.out.println("Lista de participantes:\n");
	}
	
	public void inscricaoValida() {
		System.out.println("\nInscrição efetuada com sucesso!\n");
	}
	
	public void inscricaoInvalida() {
		System.out.println("\nO CPF do participante já foi registrado!\n");
	}
	
	public void cadastroInvalido() {
		System.out.println("\nEste CPF já foi cadastrado!\n");
	}
	
	public void cadastroInvalido1() {
		System.out.println("\nEste CPF já foi cadastrado e está pendente!\n");
	}
	
	public void cadastroInvalido2() {
		System.out.println("\nEste CPF já foi cadastrado e a inscrição foi invalidada!\n");
	}
	
	public void cadastroInvalido3() {
		System.out.println("\nEste CPF não está cadastrado no sistema!\n");
	}
	
	public void listaVazia() {
		System.out.println("Não há participantes inscritos!\n");
	}
	
	public void pendenteVazio() {
		System.out.println("Não há inscrições pendentes!\n");
	}
	
	public void validosVazio() {
		System.out.println("Não há inscritos válidos!\n");
	}
	
	public void permissaoInvalida() {
		System.out.println("Você não tem permissão para realizar essa operação!\n");
	}
	
	public void validacao() {
		System.out.println("A inscrição do participante foi validada com sucesso!\n");
	}
	
	public void invalidacao() {
		System.out.println("A inscrição do participante foi invalidada com sucesso!\n");
	}
	
	public void validacaoArtigo() {
		System.out.println("O artigo foi aceito com sucesso!\n");
	}
	
	public void invalidacaoArtigo() {
		System.out.println("O artigo foi rejeitado com sucesso!\n");
	}
	
	public void autorInvalido() {
		System.out.println("\nO CPF informado já está registrado e não pertence a um autor!\n");
	}
	
	public void autorRepetido() {
		System.out.println("\nO CPF informado já está registrado como um dos autores!\n");
	}
	
	public void artigosPendentesVazio() {
		System.out.println("Não há artigos para avaliar!\n");
	}
	
	public void artigosPendentesVazio2() {
		System.out.println("Não há artigos para aceitar!\n");
	}
	
	public void artigosPendentesVazio3() {
		System.out.println("Não há artigos para rejeitar!\n");
	}
	
	public void artigoCheio() {
		System.out.println("O artigo já possui 5 revisores!\n");
	}
	
	public void artigoJaAvaliado() {
		System.out.println("Você já avaliou esse artigo!\n");
	}
	
	public void avaliacaoConcluida() {
		System.out.println("A sua avaliação foi submetida com sucesso!\n");
	}
	
	public void artigosValidosVazio() {
		System.out.println("Não há artigos aceitos!\n");
	}
	
	public void artigosInvalidosVazio() {
		System.out.println("Não há artigos rejeitados!\n");
	}
	
	public void artigosInexistentes1() {
		System.out.println("A - Não há artigos aceitos!\n");
	}
	
	public void artigosInexistentes2() {
		System.out.println("B - Não há artigos pendentes!\n");
	}
	
	public void artigosInexistentes3() {
		System.out.println("C - Não há artigos rejeitados!\n");
	}
	
	public void artigosIneAutor1() {
		System.out.println("A - Não há artigos aceitos com você como um dos autores!\n");
	}
	
	public void artigosIneAutor2() {
		System.out.println("B - Não há artigos pendentes com você como um dos autores!\n");
	}
	
	public void artigosIneAutor3() {
		System.out.println("C - Não há artigos rejeitados com você como um dos autores!\n");
	}
	
	public void artigosIneRevisor1() {
		System.out.println("A - Não há artigos aceitos com você como um dos revisores!\n");
	}
	
	public void artigosIneRevisor2() {
		System.out.println("B - Não há artigos pendentes com você como um dos revisores!\n");
	}
	
	public void artigosIneRevisor3() {
		System.out.println("C - Não há artigos rejeitados com você como um dos revisores!\n");
	}
	
	public void artigosRevisorInsu() {
		System.out.println("Não há artigos pendentes com 2 ou mais revisores!\n");
	}
	
	public void revisorInexistente() {
		System.out.println("Não há avaliações para esse artigo!\n");
	}
	
	//Função que recebe como parâmetro um participante e lista suas informações básicas com o seu cargo
	public void listarInfoBasica(Participante j) {
		switch(j.getCargo()) {
		case PARTICIPANTE:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\nCargo: participante\n");
			break;
		case PROGRAM_CHAIR:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\nCargo: program chair\n");
			break;
		case GENERAL_CHAIR:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\nCargo: general chair\n");
			break;
		case AUTOR:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\nCargo: autor de artigo\n");
			break;
		case REVISOR:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\nCargo: revisor de artigo\n");
			break;
		}
	}
	
	//Função que recebe como parâmetro um participante e lista suas informações básicas
	public void listarInfoBasica2(Participante j) {
		System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\n");
	}
	
	//Função que recebe como parâmetro um participante e lista suas informações básicas e caso ele for um especialista o seu cargo é impresso
	public void listarInfoBasica3(Participante j) {
		switch(j.getCargo()) {
		case PARTICIPANTE:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\n");
			break;
		case PROGRAM_CHAIR:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\n");
			break;
		case GENERAL_CHAIR:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\n");
			break;
		case AUTOR:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\nCargo: especialista\n");
			break;
		case REVISOR:
			System.out.println("Nome: " + j.getNome() + "\nCPF: " + j.getCpf() + "\nCargo: especialista\n");
			break;
		}
	}
	
	//Função que recebe como parâmetro um artigo e lista suas informações básicas
	public void listarInfoBasicaArtigo(Artigo j) {
		System.out.println("Título do artigo: " + j.getTitulo() + "\nIdentificador: " + j.getIdentificador() + "\nAbstract: " + j.getAbstrato() + "\n");
	}
	
	//Função que recebe como parâmetro um artigo aceito e lista suas informações básicas
	public void listarInfoBasicaArtigo1(Artigo j) {
		System.out.println("A - Artigo aceito:\nTítulo: " + j.getTitulo() + "\nIdentificador: " + j.getIdentificador() + "\nAbstract: " + j.getAbstrato() + "\n");
	}
	
	//Função que recebe como parâmetro um artigo pendente e lista suas informações básicas
	public void listarInfoBasicaArtigo2(Artigo j) {
		System.out.println("B - Artigo pendente:\nTítulo: " + j.getTitulo() + "\nIdentificador: " + j.getIdentificador() + "\nAbstract: " + j.getAbstrato() + "\n");
	}
	
	//Função que recebe como parâmetro um artigo rejeitado e lista suas informações básicas
	public void listarInfoBasicaArtigo3(Artigo j) {
		System.out.println("C - Artigo rejeitado:\nTítulo: " + j.getTitulo() + "\nIdentificador: " + j.getIdentificador() + "\nAbstract: " + j.getAbstrato() + "\n");
	}
	
	//Função que recebe como parâmetro um revisor e imprimi seu nome e sua avaliação para um certo artigo
	public void listarInfoBasicaRevisor(RevisorArtigo j) {
		System.out.println("Nome do revisor: " + j.getNome() + "\nAvaliação: " + j.getAvaliacao() + "\n");
	}
	
	//Função que recebe como parâmetro um artigo e imprimi os seus dados
	public void listarInfoDetalhadaArtigo(Artigo j) {
		System.out.print("Palavras-chaves: " + j.getPalaChaves() + "\nQuantidade de páginas: " + j.getPaginas() + "\nData de submissão: " + j.getSubmissao().get(Calendar.DAY_OF_MONTH) + "/" + j.getSubmissao().get(Calendar.MONTH) + "/" + j.getSubmissao().get(Calendar.YEAR) + "\nNome dos autores: ");
		
		for(Participante a : j.getAutores()) {
			System.out.print("[" + a.getNome() + "] ");
		}
		System.out.println();
		System.out.print("Revisores: ");
		
		for(RevisorArtigo a : j.getRevisores()) {
			System.out.print("[" + a.getNome() + "] ");
		}
		System.out.println("\n");
	}
	
	public void menuInicial() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Efetuar login");
		System.out.println("2 - Cadastrar login");
		System.out.println("3 - Encerrar programa");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuValidacao() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Validar participante");
		System.out.println("2 - Pular participante");
		System.out.println("3 - Encerrar processo de validação");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuInvalidacao() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Invalidar participante");
		System.out.println("2 - Pular participante");
		System.out.println("3 - Encerrar processo de invalidação");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuCertificar() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Emitir certificado para o participante");
		System.out.println("2 - Pular participante");
		System.out.println("3 - Encerrar processo de emitir certificados");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuAvaliar() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Avaliar artigo");
		System.out.println("2 - Pular artigo");
		System.out.println("3 - Encerrar processo de avaliação de artigos");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuDeAvaliacoes() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Visualizar avaliaçôes do artigo");
		System.out.println("2 - Pular artigo");
		System.out.println("3 - Encerrar processo de visualização de avaliações dos artigos");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuDeDetalhesArtigos() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Visualizar todos os dados do artigo");
		System.out.println("2 - Pular artigo");
		System.out.println("3 - Encerrar processo de visualização de dados dos artigos");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuAceitar() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Aceitar artigo");
		System.out.println("2 - Pular artigo");
		System.out.println("3 - Encerrar processo de aceitação de artigos");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuRejeitar() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Rejeitar artigo");
		System.out.println("2 - Pular artigo");
		System.out.println("3 - Encerrar processo de rejeitação de artigos");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	public void menuFinal() {
		System.out.println("Opções de operações:\n");
		System.out.println("1 - Inscrever participante");
		System.out.println("2 - Validar inscrição");
		System.out.println("3 - Invalidar inscrição");
		System.out.println("4 - Emitir certificado");
		System.out.println("5 - Submeter artigo");
		System.out.println("6 - Enviar avaliação de um Artigo");
		System.out.println("7 - Visualizar avaliações de um artigo");
		System.out.println("8 - Aceitar artigo");
		System.out.println("9 - Rejeitar artigo");
		System.out.println("10 - Listar artigos aceitos");
		System.out.println("11 - Listar artigos rejeitados");
		System.out.println("12 - Visualizar dados de um artigo");
		System.out.println("13 - Listar participantes");
		System.out.println("14 - Deslogar");
		System.out.print("\nDigite o número da operação desejada: ");
	}
	
	//Função que retorna uma string contendo a avaliação de um revisor de um determinado artigo
	public String pedidoAvaliacao() {
		sc = new Scanner(System.in);
		System.out.print("Digite a sua avaliação: ");
		String avaliacao = sc.nextLine();
		return avaliacao;
	}
	
	//Função que retorna um participante contendo os dados passados pelo usuário
	public Participante inscricao() {
		sc = new Scanner(System.in);
		System.out.print("Digite o CPF do participante: ");
		String tempcpf = sc.nextLine();
		
		System.out.print("Digite o nome do participante: ");
		String tempnome = sc.nextLine();
		
		TitulacaoAcademicaEnum titu = null;
		int temptitu = 0;
		while(temptitu == 0) {
			try {
				System.out.println("\nTitulações acadêmicas:\n\n1 - Ensino fundamental\n2 - Ensino médio\n3 - Tecnólogo\n4 - Ensino superior incompleto\n5 - Ensino superior completo: licenciatura\n6 - Ensino superior completo: bacharelado\n7 - Especialização\n8 - Mestrado\n9 - Doutorado\n10 - Pós doutorado");
				System.out.print("\nDigite o número da titulação do participante: ");
				temptitu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				temptitu = 0;
			}
			switch(temptitu) {
			case 1:
				titu = TitulacaoAcademicaEnum.ENSINO_FUNDAMENTAL;
				break;
			case 2:
				titu = TitulacaoAcademicaEnum.ENSINO_MEDIO;
				break;
			case 3:
				titu = TitulacaoAcademicaEnum.TECNOLOGO;
				break;
			case 4:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_INCOMPLETO;
				break;
			case 5:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_COMPLETO_LICENCIATURA;
				break;
			case 6:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_COMPLETO_BACHARELADO;
				break;
			case 7:
				titu = TitulacaoAcademicaEnum.ESPECIALIZACAO;
				break;
			case 8:
				titu = TitulacaoAcademicaEnum.MESTRADO;
				break;
			case 9:
				titu = TitulacaoAcademicaEnum.DOUTORADO;
				break;
			case 10:
				titu = TitulacaoAcademicaEnum.POS_DOUTORADO;
				break;
			default:
				temptitu = 0;
				System.out.println("\nTitulação inválida!");
			}
		}
		
		sc = new Scanner(System.in);
		System.out.print("Digite a instituição de vínculo do participante: ");
		String tempins = sc.nextLine();
		
		System.out.print("Digite a senha para login do participante: ");
		String tempsen = sc.nextLine();
		
		int tempdia = 0;
		while(tempdia <= 0) {
			try {
				System.out.print("Digite o dia do nascimento do participante: ");
				tempdia = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempdia = 0;
			}
			if(tempdia <= 0) {
				System.out.println("\nDia inválido!\n");
			}
		}
		
		int tempmes = 0;
		while(tempmes <= 0) {
			try {
				System.out.print("Digite o mês do nascimento do participante: ");
				tempmes = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempmes = 0;
			}
			if(tempmes <= 0) {
				System.out.println("\nMês inválido!\n");
			}
		}
		
		int tempano = 0;
		while(tempano <= 0) {
			try {
				System.out.print("Digite o ano do nascimento do participante: ");
				tempano = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempano = 0;
			}
			if(tempano <= 0) {
				System.out.println("\nAno inválido!\n");
			}
		}
		
		CargoParticipanteEnum cargo = null;
		int tempcargo = 0;
		while(tempcargo == 0) {
			try {
				System.out.println("\nCargos:\n\n1 - Participante padrão\n2 - Program chair\n3 - General chair\n4 - Autor de artigo\n5 - Revisor de artigo");
				System.out.print("\nDigite o número do cargo do participante: ");
				tempcargo = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempcargo = 0;
			}
			switch(tempcargo) {
			case 1:
				cargo = CargoParticipanteEnum.PARTICIPANTE;
				break;
			case 2:
				cargo = CargoParticipanteEnum.PROGRAM_CHAIR;
				break;
			case 3:
				cargo = CargoParticipanteEnum.GENERAL_CHAIR;
				break;
			case 4:
				cargo = CargoParticipanteEnum.AUTOR;
				break;
			case 5:
				cargo = CargoParticipanteEnum.REVISOR;
				break;
			default:
				tempcargo = 0;
				System.out.println("\nCargo inválido!");
			}
		}	
		Participante p = new Participante(tempcpf, tempnome, titu, tempins, tempsen, tempdia, tempmes, tempano, cargo);
		return p;
	}
	
	//Função que chama a função inscreverUsuario e retorna um participante contendo os dados de cadastro do usuário
	public Participante cadastrarUsuario(FuncoesMain imprimir, Participante u) {
		sc = new Scanner(System.in);
		String tempSenha;
		imprimir.pedidoSenha();
		tempSenha = sc.nextLine();
		u.setSenha(tempSenha);
		u = imprimir.inscreverUsuario(u);
		imprimir.loginCadastrado();
		return u;
	}
	
	//Função que retorna um participante contendo os dados de cadastro do usuário
	public Participante inscreverUsuario(Participante p) {
		sc = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String tempnome = sc.nextLine();
		
		TitulacaoAcademicaEnum titu = null;
		int temptitu = 0;
		while(temptitu == 0) {
			try {
				System.out.println("\nTitulações acadêmicas:\n\n1 - Ensino fundamental\n2 - Ensino médio\n3 - Tecnólogo\n4 - Ensino superior incompleto\n5 - Ensino superior completo: licenciatura\n6 - Ensino superior completo: bacharelado\n7 - Especialização\n8 - Mestrado\n9 - Doutorado\n10 - Pós doutorado");
				System.out.print("\nDigite o número da sua titulação: ");
				temptitu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				temptitu = 0;
			}
			switch(temptitu) {
			case 1:
				titu = TitulacaoAcademicaEnum.ENSINO_FUNDAMENTAL;
				break;
			case 2:
				titu = TitulacaoAcademicaEnum.ENSINO_MEDIO;
				break;
			case 3:
				titu = TitulacaoAcademicaEnum.TECNOLOGO;
				break;
			case 4:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_INCOMPLETO;
				break;
			case 5:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_COMPLETO_LICENCIATURA;
				break;
			case 6:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_COMPLETO_BACHARELADO;
				break;
			case 7:
				titu = TitulacaoAcademicaEnum.ESPECIALIZACAO;
				break;
			case 8:
				titu = TitulacaoAcademicaEnum.MESTRADO;
				break;
			case 9:
				titu = TitulacaoAcademicaEnum.DOUTORADO;
				break;
			case 10:
				titu = TitulacaoAcademicaEnum.POS_DOUTORADO;
				break;
			default:
				temptitu = 0;
				System.out.println("\nTitulação inválida!");
			}
		}
		
		sc = new Scanner(System.in);
		System.out.print("Digite a sua instituição de vínculo: ");
		String tempins = sc.nextLine();
		
		int tempdia = 0;
		while(tempdia <= 0) {
			try {
				System.out.print("Digite o dia do seu nascimento: ");
				tempdia = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempdia = 0;
			}
			if(tempdia <= 0) {
				System.out.println("\nDia inválido!\n");
			}
		}
		
		int tempmes = 0;
		while(tempmes <= 0) {
			try {
				System.out.print("Digite o mês do seu nascimento: ");
				tempmes = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempmes = 0;
			}
			if(tempmes <= 0) {
				System.out.println("\nMês inválido!\n");
			}
		}
		
		int tempano = 0;
		while(tempano <= 0) {
			try {
				System.out.print("Digite o ano do seu nascimento: ");
				tempano = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempano = 0;
			}
			if(tempano <= 0) {
				System.out.println("\nAno inválido!\n");
			}
		}
		
		CargoParticipanteEnum cargo = null;
		int tempcargo = 0;
		while(tempcargo == 0) {
			try {
				System.out.println("\nCargos:\n\n1 - Participante padrão\n2 - Program chair\n3 - General chair\n4 - Autor de artigo\n5 - Revisor de artigo");
				System.out.print("\nDigite o número do seu cargo: ");
				tempcargo = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempcargo = 0;
			}
			switch(tempcargo) {
			case 1:
				cargo = CargoParticipanteEnum.PARTICIPANTE;
				break;
			case 2:
				cargo = CargoParticipanteEnum.PROGRAM_CHAIR;
				break;
			case 3:
				cargo = CargoParticipanteEnum.GENERAL_CHAIR;
				break;
			case 4:
				cargo = CargoParticipanteEnum.AUTOR;
				break;
			case 5:
				cargo = CargoParticipanteEnum.REVISOR;
				break;
			default:
				tempcargo = 0;
				System.out.println("\nCargo inválido!");
			}
		}
		p.setNome(tempnome);
		p.setTitulacao(titu);
		p.setInstituicao(tempins);
		p.setNascimento(tempdia, tempmes, tempano);
		p.setCargo(cargo);
		return p;
	}
	
	//Função que retorna um artigo contendo os dados passados pelo do usuário
	public Artigo submeterArtigo() {
		sc = new Scanner(System.in);
		Random rand = new Random();
		Calendar date = Calendar.getInstance();
		int dia = date.get(Calendar.DAY_OF_MONTH);
		int mes = date.get(Calendar.MONTH) + 1;
		int ano = date.get(Calendar.YEAR);
		int tempidentificador = rand.nextInt(100000);
		
		System.out.print("Digite o título do artigo: ");
		String temptitulo = sc.nextLine();
		
		System.out.print("Digite o abstract do artigo: ");
		String tempabstract = sc.nextLine();
		
		int temppalavras = 0;
		while(temppalavras < 1 || temppalavras > 10) {
			try {
				System.out.print("Digite a quantidade de palavras-chaves: ");
				temppalavras = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				temppalavras = 0;
			}
			if(temppalavras < 1 || temppalavras > 10) {
				System.out.println("\nQuantidade de palavras inválido!\n");
			}
		}
		
		sc = new Scanner(System.in);
		HashSet<String> palavrasChaves = new HashSet<String>();
		for(int i = 0; i<temppalavras; i++) {
			System.out.print("Digite uma palavra chave: ");
			String temp = sc.nextLine();
			palavrasChaves.add(temp);
		}
		
		int temppaginas = 0;
		while(temppaginas <= 0) {
			try {
				System.out.print("Digite a quantidade de páginas: ");
				temppaginas = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				temppaginas = 0;
			}
			if(temppaginas <= 0) {
				System.out.println("\nQuantidade de páginas inválido!\n");
			}
		}
		
		Artigo a = new Artigo(tempidentificador, temptitulo, tempabstract, palavrasChaves, temppaginas, dia, mes, ano);
		return a;
	}
	
	//Função que pede os autores de um artigo e retorna um artigo contendo esses autores
	public Artigo pedirAutores(Artigo a, HashSet<Participante> validos, HashSet<Participante> pendentes, HashSet<Participante> invalidos, Participante p) {
		sc = new Scanner(System.in);
		HashSet<Participante> autores = new HashSet<Participante>();
		autores.add(p);
		boolean loop = true;
		
		while(loop) {
			int tempquantidade = 0;
			try {
				System.out.print("Digite a quantidade total de autores: ");
				tempquantidade = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempquantidade = 0;
			}
			if(tempquantidade > 0 && tempquantidade < 6) {
				loop = false;
				
				for(int i = 1; i<tempquantidade; i++) {
					boolean loop2 = true;
					while(loop2) {
						sc = new Scanner(System.in);
						AutorArtigo autor = new AutorArtigo();
						System.out.print("\nDigite o CPF do " + (i+1) + "º autor: ");
						String cpf = sc.nextLine();
						autor.setCpf(cpf);
						
						if(pendentes.contains(autor)) {
							for(Participante u : pendentes) {
								if(u.equals(autor)) {
									if(u instanceof AutorArtigo) {
										if(autores.contains(u)) {
											autorRepetido();
										}else {
											loop2 = false;
											autores.add(u);
										}
									}else {
										autorInvalido();
									}
									break;
								}
							}
						}else if (validos.contains(autor)) {
							for(Participante u : validos) {
								if(u.equals(autor)) {
									if(u instanceof AutorArtigo) {
										if(autores.contains(u)) {
											autorRepetido();
										}else {
											loop2 = false;
											autores.add(u);
										}
									}else {
										autorInvalido();
									}
									break;
								}
							}
						}else if (invalidos.contains(autor)) {
							for(Participante u : invalidos) {
								if(u.equals(autor)) {
									if(u instanceof AutorArtigo) {
										if(autores.contains(u)) {
											autorRepetido();
										}else {
											loop2 = false;
											autores.add(u);
										}
									}else {
										autorInvalido();
									}
									break;
								}
							}
						}else {
							loop2 = false;
							autor = inscricaoAutor(autor, i);
							autores.add(autor);
							pendentes.add(autor);
						}
					}
				}
				a.setAutores(autores);
				System.out.println("\nO seu artigo foi submetido com sucesso!");
			}else {
				System.out.println("\nQuantidade não permitida!\n");
			}
		}
		System.out.println();
		return a;
	}
	
	//Função que pede os dados de um autor não registrado no sistema e retorna um autor
	public AutorArtigo inscricaoAutor(AutorArtigo autor, int i) {
		sc = new Scanner(System.in);
		System.out.print("Digite o nome do " + (i+1) + "º autor: ");
		String tempnome = sc.nextLine();
		
		TitulacaoAcademicaEnum titu = null;
		int temptitu = 0;
		while(temptitu == 0) {
			try {
				System.out.println("\nTitulações acadêmicas:\n\n1 - Ensino fundamental\n2 - Ensino médio\n3 - Tecnólogo\n4 - Ensino superior incompleto\n5 - Ensino superior completo: licenciatura\n6 - Ensino superior completo: bacharelado\n7 - Especialização\n8 - Mestrado\n9 - Doutorado\n10 - Pós doutorado");
				System.out.print("\nDigite o número da titulação do " + (i+1) + "º autor: ");
				temptitu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				temptitu = 0;
			}
			switch(temptitu) {
			case 1:
				titu = TitulacaoAcademicaEnum.ENSINO_FUNDAMENTAL;
				break;
			case 2:
				titu = TitulacaoAcademicaEnum.ENSINO_MEDIO;
				break;
			case 3:
				titu = TitulacaoAcademicaEnum.TECNOLOGO;
				break;
			case 4:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_INCOMPLETO;
				break;
			case 5:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_COMPLETO_LICENCIATURA;
				break;
			case 6:
				titu = TitulacaoAcademicaEnum.ENSINO_SUPERIOR_COMPLETO_BACHARELADO;
				break;
			case 7:
				titu = TitulacaoAcademicaEnum.ESPECIALIZACAO;
				break;
			case 8:
				titu = TitulacaoAcademicaEnum.MESTRADO;
				break;
			case 9:
				titu = TitulacaoAcademicaEnum.DOUTORADO;
				break;
			case 10:
				titu = TitulacaoAcademicaEnum.POS_DOUTORADO;
				break;
			default:
				temptitu = 0;
				System.out.println("\nTitulação inválida!");
			}
		}
		
		sc = new Scanner(System.in);
		System.out.print("Digite a instituição de vínculo do " + (i+1) + "º autor: ");
		String tempins = sc.nextLine();
		
		System.out.print("Digite a senha para login do " + (i+1) + "º autor: ");
		String tempsen = sc.nextLine();
		
		
		int tempdia = 0;
		while(tempdia <= 0) {
			try {
				System.out.print("Digite o dia do nascimento do " + (i+1) + "º autor: ");
				tempdia = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempdia = 0;
			}
			if(tempdia <= 0) {
				System.out.println("\nDia inválido!\n");
			}
		}
		
		int tempmes = 0;
		while(tempmes <= 0) {
			try {
				System.out.print("Digite o mes do nascimento do " + (i+1) + "º autor: ");
				tempmes = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempmes = 0;
			}
			if(tempmes <= 0) {
				System.out.println("\nMês inválido!\n");
			}
		}
		
		int tempano = 0;
		while(tempano <= 0) {
			try {
				System.out.print("Digite o ano do nascimento do " + (i+1) + "º autor: ");
				tempano = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nErro: você deveria digitar um número!");
				sc = new Scanner(System.in);
				tempano = 0;
			}
			if(tempano <= 0) {
				System.out.println("\nAno inválido!\n");
			}
		}
		autor.setNome(tempnome);
		autor.setTitulacao(titu);
		autor.setInstituicao(tempins);
		autor.setSenha(tempsen);
		autor.setNascimento(tempdia, tempmes, tempano);
		autor.setCargo(CargoParticipanteEnum.AUTOR);
		return autor;
	}
	
	//Função que recebe a lista de artigos aceitos, pendentes e rejeitados, e permite o usuário visualizar as avaliações de um artigo, e a depender do cargo do usuário ele terá algumas limitações de visualização
	public void listarAvaliacoes(Participante i, FuncoesMain imprimir, HashSet<Artigo> artigosValidos, HashSet<Artigo> artigosPendentes, HashSet<Artigo> artigosInvalidos) {
		sc = new Scanner(System.in);
		int operacao = 7;
		
		if(i instanceof ProgramChair) {
			if(artigosValidos.isEmpty() == false) {
				while(operacao != 3) {
					for(Artigo j : artigosValidos) {
						operacao = 0;
						
						while(operacao == 0) {
							try {
								imprimir.listarInfoBasicaArtigo1(j);
								imprimir.menuDeAvaliacoes();
								operacao = sc.nextInt();
								System.out.println();
							}catch(InputMismatchException e) {
								imprimir.erroDigitado();
								sc = new Scanner(System.in);
								operacao = 0;
							}
							switch(operacao) {
							case 1:
								if (j.getRevisores().isEmpty() == false) {
									for(RevisorArtigo revi : j.getRevisores()) {
										imprimir.listarInfoBasicaRevisor(revi);
									}
								}else {
									imprimir.revisorInexistente();
								}
								break;
							case 2:
								break;
							case 3:
								break;
							default:
								operacao = 0;
								imprimir.operacaoInvalida();
								break;
							}
						}
						if(operacao == 3) {
							break;
						}
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes1();
			}
			operacao = 0;
			if(artigosPendentes.isEmpty() == false) {
				while(operacao != 3) {
					for(Artigo j : artigosPendentes) {
						operacao = 0;
						
						while(operacao == 0) {
							try {
								imprimir.listarInfoBasicaArtigo2(j);
								imprimir.menuDeAvaliacoes();
								operacao = sc.nextInt();
								System.out.println();
							}catch(InputMismatchException e) {
								imprimir.erroDigitado();
								sc = new Scanner(System.in);
								operacao = 0;
							}
							switch(operacao) {
							case 1:
								if (j.getRevisores().isEmpty() == false) {
									for(RevisorArtigo revi : j.getRevisores()) {
										imprimir.listarInfoBasicaRevisor(revi);
									}
								}else {
									imprimir.revisorInexistente();
								}
								break;
							case 2:
								break;
							case 3:
								break;
							default:
								operacao = 0;
								imprimir.operacaoInvalida();
								break;
							}
						}
						if(operacao == 3) {
							break;
						}
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes2();
			}
			operacao = 0;
			if(artigosInvalidos.isEmpty() == false) {
				while(operacao != 3) {
					for(Artigo j : artigosInvalidos) {
						operacao = 0;
						
						while(operacao == 0) {
							try {
								imprimir.listarInfoBasicaArtigo3(j);
								imprimir.menuDeAvaliacoes();
								operacao = sc.nextInt();
								System.out.println();
							}catch(InputMismatchException e) {
								imprimir.erroDigitado();
								sc = new Scanner(System.in);
								operacao = 0;
							}
							switch(operacao) {
							case 1:
								if (j.getRevisores().isEmpty() == false) {
									for(RevisorArtigo revi : j.getRevisores()) {
										imprimir.listarInfoBasicaRevisor(revi);
									}
								}else {
									imprimir.revisorInexistente();
								}
								break;
							case 2:
								break;
							case 3:
								break;
							default:
								operacao = 0;
								imprimir.operacaoInvalida();
								break;
							}
						}
						if(operacao == 3) {
							break;
						}
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes3();
			}
		}else if(i instanceof AutorArtigo) {
			if(artigosValidos.isEmpty() == false) {
				while(operacao != 3) {
					int existe = 0;
					for(Artigo j : artigosValidos) {
						operacao = 0;
						
						if(j.getAutores().contains(i)) {
							existe = 1;
							while(operacao == 0) {
								try {
									imprimir.listarInfoBasicaArtigo1(j);
									imprimir.menuDeAvaliacoes();
									operacao = sc.nextInt();
									System.out.println();
								}catch(InputMismatchException e) {
									imprimir.erroDigitado();
									sc = new Scanner(System.in);
									operacao = 0;
								}
								switch(operacao) {
								case 1:
									if (j.getRevisores().isEmpty() == false) {
										for(RevisorArtigo revi : j.getRevisores()) {
											imprimir.listarInfoBasicaRevisor(revi);
										}
									}else {
										imprimir.revisorInexistente();
									}
									break;
								case 2:
									break;
								case 3:
									break;
								default:
									operacao = 0;
									imprimir.operacaoInvalida();
									break;
								}
							}
							if(operacao == 3) {
								break;
							}
						}
					}
					if(existe == 0) {
						imprimir.artigosIneAutor1();
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes1();
			}
			operacao = 0;
			if(artigosPendentes.isEmpty() == false) {
				while(operacao != 3) {
					int existe = 0;
					for(Artigo j : artigosPendentes) {
						operacao = 0;
						
						if(j.getAutores().contains(i)) {
							existe = 1;
							while(operacao == 0) {
								try {
									imprimir.listarInfoBasicaArtigo2(j);
									imprimir.menuDeAvaliacoes();
									operacao = sc.nextInt();
									System.out.println();
								}catch(InputMismatchException e) {
									imprimir.erroDigitado();
									sc = new Scanner(System.in);
									operacao = 0;
								}
								switch(operacao) {
								case 1:
									if (j.getRevisores().isEmpty() == false) {
										for(RevisorArtigo revi : j.getRevisores()) {
											imprimir.listarInfoBasicaRevisor(revi);
										}
									}else {
										imprimir.revisorInexistente();
									}
									break;
								case 2:
									break;
								case 3:
									break;
								default:
									operacao = 0;
									imprimir.operacaoInvalida();
									break;
								}
							}
							if(operacao == 3) {
								break;
							}
						}
					}
					if(existe == 0) {
						imprimir.artigosIneAutor2();
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes2();
			}
			operacao = 0;
			if(artigosInvalidos.isEmpty() == false) {
				while(operacao != 3) {
					int existe = 0;
					for(Artigo j : artigosInvalidos) {
						operacao = 0;
						
						if(j.getAutores().contains(i)) {
							existe = 1;
							while(operacao == 0) {
								try {
									imprimir.listarInfoBasicaArtigo3(j);
									imprimir.menuDeAvaliacoes();
									operacao = sc.nextInt();
									System.out.println();
								}catch(InputMismatchException e) {
									imprimir.erroDigitado();
									sc = new Scanner(System.in);
									operacao = 0;
								}
								switch(operacao) {
								case 1:
									if (j.getRevisores().isEmpty() == false) {
										for(RevisorArtigo revi : j.getRevisores()) {
											imprimir.listarInfoBasicaRevisor(revi);
										}
									}else {
										imprimir.revisorInexistente();
									}
									break;
								case 2:
									break;
								case 3:
									break;
								default:
									operacao = 0;
									imprimir.operacaoInvalida();
									break;
								}
							}
							if(operacao == 3) {
								break;
							}
						}
					}
					if(existe == 0) {
						imprimir.artigosIneAutor3();
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes3();
			}
		}else {
			if(artigosValidos.isEmpty() == false) {
				while(operacao != 3) {
					int existe = 0;
					for(Artigo j : artigosValidos) {
						operacao = 0;
						
						if(j.getRevisores().contains(i)) {
							existe = 1;
							while(operacao == 0) {
								try {
									imprimir.listarInfoBasicaArtigo1(j);
									imprimir.menuDeAvaliacoes();
									operacao = sc.nextInt();
									System.out.println();
								}catch(InputMismatchException e) {
									imprimir.erroDigitado();
									sc = new Scanner(System.in);
									operacao = 0;
								}
								switch(operacao) {
								case 1:
									if (j.getRevisores().isEmpty() == false) {
										for(RevisorArtigo revi : j.getRevisores()) {
											imprimir.listarInfoBasicaRevisor(revi);
										}
									}else {
										imprimir.revisorInexistente();
									}
									break;
								case 2:
									break;
								case 3:
									break;
								default:
									operacao = 0;
									imprimir.operacaoInvalida();
									break;
								}
							}
							if(operacao == 3) {
								break;
							}
						}
					}
					if(existe == 0) {
						imprimir.artigosIneRevisor1();
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes1();
			}
			operacao = 0;
			if(artigosPendentes.isEmpty() == false) {
				while(operacao != 3) {
					int existe = 0;
					for(Artigo j : artigosPendentes) {
						operacao = 0;
						
						if(j.getRevisores().contains(i)) {
							existe = 1;
							while(operacao == 0) {
								try {
									imprimir.listarInfoBasicaArtigo2(j);
									imprimir.menuDeAvaliacoes();
									operacao = sc.nextInt();
									System.out.println();
								}catch(InputMismatchException e) {
									imprimir.erroDigitado();
									sc = new Scanner(System.in);
									operacao = 0;
								}
								switch(operacao) {
								case 1:
									if (j.getRevisores().isEmpty() == false) {
										for(RevisorArtigo revi : j.getRevisores()) {
											imprimir.listarInfoBasicaRevisor(revi);
										}
									}else {
										imprimir.revisorInexistente();
									}
									break;
								case 2:
									break;
								case 3:
									break;
								default:
									operacao = 0;
									imprimir.operacaoInvalida();
									break;
								}
							}
							if(operacao == 3) {
								break;
							}
						}
					}
					if(existe == 0) {
						imprimir.artigosIneRevisor2();
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes2();
			}
			operacao = 0;
			if(artigosInvalidos.isEmpty() == false) {
				while(operacao != 3) {
					int existe = 0;
					for(Artigo j : artigosInvalidos) {
						operacao = 0;
						
						if(j.getRevisores().contains(i)) {
							existe = 1;
							while(operacao == 0) {
								try {
									imprimir.listarInfoBasicaArtigo3(j);
									imprimir.menuDeAvaliacoes();
									operacao = sc.nextInt();
									System.out.println();
								}catch(InputMismatchException e) {
									imprimir.erroDigitado();
									sc = new Scanner(System.in);
									operacao = 0;
								}
								switch(operacao) {
								case 1:
									if (j.getRevisores().isEmpty() == false) {
										for(RevisorArtigo revi : j.getRevisores()) {
											imprimir.listarInfoBasicaRevisor(revi);
										}
									}else {
										imprimir.revisorInexistente();
									}
									break;
								case 2:
									break;
								case 3:
									break;
								default:
									operacao = 0;
									imprimir.operacaoInvalida();
									break;
								}
							}
							if(operacao == 3) {
								break;
							}
						}
					}
					if(existe == 0) {
						imprimir.artigosIneRevisor3();
					}
					operacao = 3;
				}
			}else {
				imprimir.artigosInexistentes3();
			}
		}
	}
	
	//Função recebe uma lista de artigos e retorna uma lista de artigos organizados em ordem alfabética
	public ArrayList<Artigo> organizarArtigo(HashSet<Artigo> artigos){
		ArrayList<Artigo> a = new ArrayList<Artigo>();
		
		for(Artigo i : artigos) {
			a.add(i);
		}
		Collections.sort(a, new Comparator<Artigo>() {
		      @Override
		      public int compare(final Artigo object1, final Artigo object2) {
		          return object1.getTitulo().compareTo(object2.getTitulo());
		      }
		  });
		return a;
	}
	
	//Função que recebe a lista de artigos aceitos, pendentes e rejeitados, e imprimi todos os dados de um determinado artigo
	public void listarDetalhesArtigos(FuncoesMain imprimir, HashSet<Artigo> artigosValidos, HashSet<Artigo> artigosPendentes, HashSet<Artigo> artigosInvalidos) {
		sc = new Scanner(System.in);
		int operacao = 12;
		
		if(artigosValidos.isEmpty() == false) {
			while(operacao != 3) {
				for(Artigo j : artigosValidos) {
					operacao = 0;
					
					while(operacao == 0) {
						try {
							imprimir.listarInfoBasicaArtigo1(j);
							imprimir.menuDeDetalhesArtigos();
							operacao = sc.nextInt();
							System.out.println();
						}catch(InputMismatchException e) {
							imprimir.erroDigitado();
							sc = new Scanner(System.in);
							operacao = 0;
						}
						switch(operacao) {
						case 1:
							imprimir.listarInfoDetalhadaArtigo(j);
							break;
						case 2:
							break;
						case 3:
							break;
						default:
							operacao = 0;
							imprimir.operacaoInvalida();
							break;
						}
					}
					if(operacao == 3) {
						break;
					}
				}
				operacao = 3;
			}
		}else {
			imprimir.artigosInexistentes1();
		}
		operacao = 0;
		if(artigosPendentes.isEmpty() == false) {
			while(operacao != 3) {
				for(Artigo j : artigosPendentes) {
					operacao = 0;
					
					while(operacao == 0) {
						try {
							imprimir.listarInfoBasicaArtigo2(j);
							imprimir.menuDeDetalhesArtigos();
							operacao = sc.nextInt();
							System.out.println();
						}catch(InputMismatchException e) {
							imprimir.erroDigitado();
							sc = new Scanner(System.in);
							operacao = 0;
						}
						switch(operacao) {
						case 1:
							imprimir.listarInfoDetalhadaArtigo(j);
							break;
						case 2:
							break;
						case 3:
							break;
						default:
							operacao = 0;
							imprimir.operacaoInvalida();
							break;
						}
					}
					if(operacao == 3) {
						break;
					}
				}
				operacao = 3;
			}
		}else {
			imprimir.artigosInexistentes2();
		}
		operacao = 0;
		if(artigosInvalidos.isEmpty() == false) {
			while(operacao != 3) {
				for(Artigo j : artigosInvalidos) {
					operacao = 0;
					
					while(operacao == 0) {
						try {
							imprimir.listarInfoBasicaArtigo3(j);
							imprimir.menuDeDetalhesArtigos();
							operacao = sc.nextInt();
							System.out.println();
						}catch(InputMismatchException e) {
							imprimir.erroDigitado();
							sc = new Scanner(System.in);
							operacao = 0;
						}
						switch(operacao) {
						case 1:
							imprimir.listarInfoDetalhadaArtigo(j);
							break;
						case 2:
							break;
						case 3:
							break;
						default:
							operacao = 0;
							imprimir.operacaoInvalida();
							break;
						}
					}
					if(operacao == 3) {
						break;
					}
				}
				operacao = 3;
			}
		}else {
			imprimir.artigosInexistentes3();
		}
	}
	
	//Função que recebe uma lista de participantes e retorna uma lista de participantes organizados em ordem alfabética
	public ArrayList<Participante> organizarParticipantes(HashSet<Participante> validos){
		ArrayList<Participante> p = new ArrayList<Participante>();
		
		for(Participante i : validos) {
			p.add(i);
		}
		Collections.sort(p, new Comparator<Participante>() {
		      @Override
		      public int compare(final Participante object1, final Participante object2) {
		          return object1.getNome().compareTo(object2.getNome());
		      }
		  });
		return p;
	}
	
	//Função que recebe uma lista de participantes e imprimi os seu dados utilizando a função listarInfoBasica2
	public void listarParticipantes1(FuncoesMain imprimir, HashSet<Participante> validos) {
		if(validos.isEmpty() == false) {
			ArrayList<Participante> organizado = new ArrayList<Participante>();
			organizado = imprimir.organizarParticipantes(validos);
			
			for(Participante j : organizado) {
				imprimir.listarInfoBasica2(j);
			}
		}else {
			imprimir.validosVazio();
		}
	}
	
	//Função que recebe uma lista de participantes e imprimi os seu dados utilizando a função listarInfoBasica3
	public void listarParticipantes2(FuncoesMain imprimir, HashSet<Participante> validos) {
		if(validos.isEmpty() == false) {
			ArrayList<Participante> organizado = new ArrayList<Participante>();
			organizado = imprimir.organizarParticipantes(validos);
			
			for(Participante j : organizado) {
				imprimir.listarInfoBasica3(j);
			}
		}else {
			imprimir.validosVazio();
		}
	}
	
	//Função que recebe a lista de artigos rejeitados e imprimi os seu dados básicos
	public void listarArtigoRejeitado(FuncoesMain imprimir, HashSet<Artigo> artigosInvalidos) {
		if(artigosInvalidos.isEmpty() == false) {
			ArrayList<Artigo> organizado = new ArrayList<Artigo>();
			organizado = imprimir.organizarArtigo(artigosInvalidos);
			
			for(Artigo j : organizado) {
				imprimir.listarInfoBasicaArtigo(j);
			}
		}else {
			imprimir.artigosInvalidosVazio();
		}
	}
	
	//Função que recebe a lista de artigos aceitos e imprimi os seu dados básicos
	public void listarArtigoAceito(FuncoesMain imprimir, HashSet<Artigo> artigosValidos) {
		if(artigosValidos.isEmpty() == false) {
			ArrayList<Artigo> organizado = new ArrayList<Artigo>();
			organizado = imprimir.organizarArtigo(artigosValidos);
			
			for(Artigo j : organizado) {
				imprimir.listarInfoBasicaArtigo(j);
			}
		}else {
			imprimir.artigosValidosVazio();
		}
	}
}
