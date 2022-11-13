package prova2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Declarando uma variável para armazenar a operação desejada pelo usuário
		int operacao = 0;
		Scanner sc = new Scanner(System.in);
		//Declarando e inicializando uma instância da classe FuncoesMain
		FuncoesMain imprimir = new FuncoesMain();
		//Coleções que armazenam os participantes
		HashSet<Participante> validos = new HashSet<Participante>();
		HashSet<Participante> pendentes = new HashSet<Participante>();
		HashSet<Participante> invalidos = new HashSet<Participante>();
		//Coleções que armazenam os artigos
		HashSet<Artigo> artigosValidos = new HashSet<Artigo>();
		HashSet<Artigo> artigosPendentes = new HashSet<Artigo>();
		HashSet<Artigo> artigosInvalidos = new HashSet<Artigo>();
		imprimir.bemVindo();
		
		do {
			try {
				//Imprimindo o menu de operações iniciais e recebendo a operação desejada pelo usuário
				imprimir.menuInicial();
				operacao = sc.nextInt();
				System.out.println();
			}catch(InputMismatchException e) {
				imprimir.erroDigitado();
				sc = new Scanner(System.in);
				operacao = 0;
			}
			if(operacao == 1) {
				//Código para a operação de login de usuário
				String tempCpf;
				String tempSenha;
				Participante u = new Participante();
				imprimir.pedidoCpf();
				sc = new Scanner(System.in);
				tempCpf = sc.nextLine();
				u.setCpf(tempCpf);
				
				if(validos.contains(u)) {
					imprimir.pedidoSenha();
					tempSenha = sc.nextLine();
					
					for(Participante i : validos) {
						if(i.equals(u)) {
							if(tempSenha.equals(i.getSenha())) {
								imprimir.loginValido();
								
								do {
									try {
										//Imprimindo o menu de todas as operações e recebendo a operação desejada pelo usuário
										imprimir.menuFinal();
										operacao = sc.nextInt();
										System.out.println();
									} catch (InputMismatchException e) {
										imprimir.erroDigitado();
										sc = new Scanner(System.in);
										operacao = 0;
									}
									//Switch para a lista de operações implementadas pelo progrma
									switch(operacao) {
									case 1:
										//Código para a operação de inscrição de um participante
										Participante p = imprimir.inscricao();
										
										if(validos.contains(p) || pendentes.contains(p) || invalidos.contains(p)) {
											imprimir.inscricaoInvalida();
										}else {
											imprimir.inscricaoValida();
											CargoParticipanteEnum cg = p.getCargo();
											
											switch(cg) {
											case PARTICIPANTE:
												break;
											case PROGRAM_CHAIR:
												p = new ProgramChair(p.getCpf(), p.getNome(), p.getTitulacao(), p.getInstituicao(), p.getSenha(), p.getNascimento().get(Calendar.DAY_OF_MONTH), p.getNascimento().get(Calendar.MONTH), p.getNascimento().get(Calendar.YEAR), p.getCargo());
												break;
											case GENERAL_CHAIR:
												p = new GeneralChair(p.getCpf(), p.getNome(), p.getTitulacao(), p.getInstituicao(), p.getSenha(), p.getNascimento().get(Calendar.DAY_OF_MONTH), p.getNascimento().get(Calendar.MONTH), p.getNascimento().get(Calendar.YEAR), p.getCargo());
												break;
											case AUTOR:
												p = new AutorArtigo(p.getCpf(), p.getNome(), p.getTitulacao(), p.getInstituicao(), p.getSenha(), p.getNascimento().get(Calendar.DAY_OF_MONTH), p.getNascimento().get(Calendar.MONTH), p.getNascimento().get(Calendar.YEAR), p.getCargo());
												break;
											case REVISOR:
												p = new RevisorArtigo(p.getCpf(), p.getNome(), p.getTitulacao(), p.getInstituicao(), p.getSenha(), p.getNascimento().get(Calendar.DAY_OF_MONTH), p.getNascimento().get(Calendar.MONTH), p.getNascimento().get(Calendar.YEAR), p.getCargo());
												break;
											}
											pendentes.add(p);
										}
										break;
									case 2:
										//Código para a operação de validar a inscrição de um participante
										if(i instanceof GeneralChair) {
											if(pendentes.isEmpty() == false) {
												GeneralChair gechair = new GeneralChair();
												ArrayList<Participante> remocaoPendentes = new ArrayList<Participante>();
												
												while(operacao != 3) {
													for(Participante j : pendentes) {
														operacao = 0;
														
														while(operacao == 0) {
															try {
																imprimir.listarInfoBasica(j);
																imprimir.menuValidacao();
																operacao = sc.nextInt();
																System.out.println();
															}catch(InputMismatchException e) {
																imprimir.erroDigitado();
																sc = new Scanner(System.in);
																operacao = 0;
															}
															switch(operacao) {
															case 1:
																gechair.validar(j);
																remocaoPendentes.add(j);
																validos.add(j);
																imprimir.validacao();
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
												if(remocaoPendentes.isEmpty() == false) {
													for(Participante j : remocaoPendentes) {
														pendentes.remove(j);
													}
												}
											}else {
												imprimir.pendenteVazio();
											}
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									case 3:
										//Código para a operação de invalidar a inscrição de um participante
										if(i instanceof GeneralChair) {
											if(pendentes.isEmpty() == false) {
												GeneralChair gechair = new GeneralChair();
												ArrayList<Participante> remocaoPendentes = new ArrayList<Participante>();
												
												while(operacao != 4) {
													for(Participante j : pendentes) {
														operacao = 0;
														
														while(operacao == 0) {
															try {
																imprimir.listarInfoBasica(j);
																imprimir.menuInvalidacao();
																operacao = sc.nextInt();
																System.out.println();
															}catch(InputMismatchException e) {
																imprimir.erroDigitado();
																sc = new Scanner(System.in);
																operacao = 0;
															}
															switch(operacao) {
															case 1:
																gechair.invalidar(j);
																remocaoPendentes.add(j);
																invalidos.add(j);
																imprimir.invalidacao();
																break;
															case 2:
																break;
															case 3:
																operacao = 4;
																break;
															default:
																operacao = 0;
																imprimir.operacaoInvalida();
																break;
															}
														}
														if(operacao == 4) {
															break;
														}
													}
													operacao = 4;
												}
												if(remocaoPendentes.isEmpty() == false) {
													for(Participante j : remocaoPendentes) {
														pendentes.remove(j);
													}
												}
											}else {
												imprimir.pendenteVazio();
											}
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									case 4:
										//Código para a operação de emitir certificado de um participante
										if(i instanceof GeneralChair) {
											if(validos.isEmpty() == false) {
												GeneralChair gechair = new GeneralChair();
												
												while(operacao != 3) {
													for(Participante j : validos) {
														operacao = 0;
														
														while(operacao == 0) {
															try {
																imprimir.listarInfoBasica(j);
																imprimir.menuCertificar();
																operacao = sc.nextInt();
																System.out.println();
															}catch(InputMismatchException e) {
																imprimir.erroDigitado();
																sc = new Scanner(System.in);
																operacao = 0;
															}
															switch(operacao) {
															case 1:
																gechair.emitirCertificao(j);
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
												imprimir.validosVazio();
											}
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									case 5:
										//Código para a operação de submeter um artigo
										if(i instanceof AutorArtigo) {
											Artigo artigo = imprimir.submeterArtigo();
											artigo = imprimir.pedirAutores(artigo, validos, pendentes, invalidos, i);
											artigosPendentes.add(artigo);
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									case 6:
										//Código para a operação de submeter uma avaliação de um artigo
										if(i instanceof RevisorArtigo) {
											if(artigosPendentes.isEmpty() == false) {
												while(operacao != 3) {
													for(Artigo j : artigosPendentes) {
														operacao = 0;
															
														while(operacao == 0) {
															try {
																imprimir.listarInfoBasicaArtigo(j);
																imprimir.menuAvaliar();
																operacao = sc.nextInt();
																System.out.println();
															}catch(InputMismatchException e) {
																imprimir.erroDigitado();
																sc = new Scanner(System.in);
																operacao = 0;
															}	
															switch(operacao) {
															case 1:
																if(j.getRevisores().size() < 5) {
																	if(j.getRevisores().contains(i) == false) {
																		String avaliacao = imprimir.pedidoAvaliacao();
																		System.out.println();
																		RevisorArtigo revisor = new RevisorArtigo(i.getCpf(), i.getNome(), i.getTitulacao(), i.getInstituicao(), i.getSenha(), i.getNascimento().get(Calendar.DAY_OF_MONTH), i.getNascimento().get(Calendar.MONTH), i.getNascimento().get(Calendar.YEAR), i.getCargo());
																		revisor.setAvaliacao(avaliacao);
																		j.setRevisores(revisor);
																		imprimir.avaliacaoConcluida();
																	}else {
																		operacao = 0;
																		imprimir.artigoJaAvaliado();
																	}
																}else {
																	operacao = 0;
																	imprimir.artigoCheio();
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
												imprimir.artigosPendentesVazio();
											}
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									case 7:
										//Código para a operação de visualização das avaliações dos artigos
										if(i instanceof ProgramChair || i instanceof AutorArtigo || i instanceof RevisorArtigo) {
											imprimir.listarAvaliacoes(i, imprimir, artigosValidos, artigosPendentes, artigosInvalidos);
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									case 8:
										//Código para a operação de aceitar um artigo
										if(i instanceof ProgramChair) {
											if(artigosPendentes.isEmpty() == false) {
												ProgramChair pro = new ProgramChair();
												ArrayList<Artigo> remocaoArtigo = new ArrayList<Artigo>();
												
												while(operacao != 3) {
													int existe = 0;
													for(Artigo j : artigosPendentes) {
														operacao = 0;
														
														if(j.getRevisores().size() >= 2) {
															existe = 1;
															while(operacao == 0) {
																try {
																	imprimir.listarInfoBasicaArtigo(j);
																	imprimir.menuAceitar();
																	operacao = sc.nextInt();
																	System.out.println();
																}catch(InputMismatchException e) {
																	imprimir.erroDigitado();
																	sc = new Scanner(System.in);
																	operacao = 0;
																}
																switch(operacao) {
																case 1:
																	pro.validar(j);
																	artigosValidos.add(j);
																	remocaoArtigo.add(j);
																	imprimir.validacaoArtigo();
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
														imprimir.artigosRevisorInsu();
													}
													operacao = 3;
												}
												if(remocaoArtigo.isEmpty() == false) {
													for(Artigo ag : remocaoArtigo) {
														artigosPendentes.remove(ag);
													}
												}
											}else {
												imprimir.artigosPendentesVazio2();
											}
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									case 9:
										//Código para a operação de rejeitar um artigo
										if(i instanceof ProgramChair) {
											if(artigosPendentes.isEmpty() == false) {
												ProgramChair pro = new ProgramChair();
												ArrayList<Artigo> remocaoArtigo = new ArrayList<Artigo>();
												
												while(operacao != 3) {
													int existe = 0;
													for(Artigo j : artigosPendentes) {
														operacao = 0;
														
														if(j.getRevisores().size() >= 2) {
															existe = 1;
															while(operacao == 0) {
																try {
																	imprimir.listarInfoBasicaArtigo(j);
																	imprimir.menuRejeitar();
																	operacao = sc.nextInt();
																	System.out.println();
																}catch(InputMismatchException e) {
																	imprimir.erroDigitado();
																	sc = new Scanner(System.in);
																	operacao = 0;
																}
																switch(operacao) {
																case 1:
																	pro.invalidar(j);
																	artigosInvalidos.add(j);
																	remocaoArtigo.add(j);
																	imprimir.invalidacaoArtigo();
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
														imprimir.artigosRevisorInsu();
													}
													operacao = 3;
												}
												if(remocaoArtigo.isEmpty() == false) {
													for(Artigo ag : remocaoArtigo) {
														artigosPendentes.remove(ag);
													}
												}
											}else {
												imprimir.artigosPendentesVazio3();
											}
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									case 10:
										//Código para a operação de listar artigos aceitos
										imprimir.listarArtigoAceito(imprimir, artigosValidos);
										break;
									case 11:
										//Código para a operação de listar artigos rejeitados
										imprimir.listarArtigoRejeitado(imprimir, artigosInvalidos);
										break;
									case 12:
										//Código para a operação de visualização de dados de um artigo
										imprimir.listarDetalhesArtigos(imprimir, artigosValidos, artigosPendentes, artigosInvalidos);
										break;
									case 13:
										//Código para a operação de listar os participantes
										if(i instanceof ProgramChair) {
											imprimir.listarParticipantes1(imprimir, validos);
										}else if(i instanceof GeneralChair) {
											imprimir.listarParticipantes2(imprimir, validos);
										}else {
											imprimir.permissaoInvalida();
										}
										break;
									default:
										//Caso a operação informada for inválida
										if(operacao != 14) {
											imprimir.operacaoInvalida();
										}
										break;
									}
								}while(operacao != 14);
							}else {
								imprimir.loginInvalido();
							}
						}
						if(operacao == 14) {
							break;
						}
					}
				}else if (pendentes.contains(u)) {
					//Caso o cpf informado já esteja cadastrado nos participantes pendentes
					imprimir.cadastroInvalido1();
				}else if (invalidos.contains(u)) {
					//Caso o cpf informado já esteja cadastrado nos participantes inválidos
					imprimir.cadastroInvalido2();
				}else {
					//Caso o cpf informado não esteja cadastrado
					imprimir.cadastroInvalido3();
				}
				operacao = 1;
			}else if(operacao == 2) {
				//Código para a operação de cadastro de usuário
				sc = new Scanner(System.in);
				String tempCpf;
				Participante u = new Participante();
				imprimir.pedidoCpf();
				tempCpf = sc.nextLine();
				u.setCpf(tempCpf);
				
				if(validos.contains(u)) {
					//Caso o cpf informado já esteja cadastrado nos participantes válidos
					imprimir.cadastroInvalido();
				}else if(pendentes.contains(u)) {
					//Caso o cpf informado já esteja cadastrado nos participantes pendentes
					imprimir.cadastroInvalido1();
				}else if(invalidos.contains(u)) {
					//Caso o cpf informado já esteja cadastrado nos participantes inválidos
					imprimir.cadastroInvalido2();
				}else {
					u = imprimir.cadastrarUsuario(imprimir, u);
					
					switch(u.getCargo()) {
					case PARTICIPANTE:
						validos.add(u);
						break;
					case PROGRAM_CHAIR:
						u = new ProgramChair(u.getCpf(), u.getNome(), u.getTitulacao(), u.getInstituicao(), u.getSenha(), u.getNascimento().get(Calendar.DAY_OF_MONTH), u.getNascimento().get(Calendar.MONTH), u.getNascimento().get(Calendar.YEAR), u.getCargo());
						validos.add(u);
						break;
					case GENERAL_CHAIR:
						u = new GeneralChair(u.getCpf(), u.getNome(), u.getTitulacao(), u.getInstituicao(), u.getSenha(), u.getNascimento().get(Calendar.DAY_OF_MONTH), u.getNascimento().get(Calendar.MONTH), u.getNascimento().get(Calendar.YEAR), u.getCargo());
						validos.add(u);
						break;
					case AUTOR:
						u = new AutorArtigo(u.getCpf(), u.getNome(), u.getTitulacao(), u.getInstituicao(), u.getSenha(), u.getNascimento().get(Calendar.DAY_OF_MONTH), u.getNascimento().get(Calendar.MONTH), u.getNascimento().get(Calendar.YEAR), u.getCargo());
						validos.add(u);
						break;
					case REVISOR:
						u = new RevisorArtigo(u.getCpf(), u.getNome(), u.getTitulacao(), u.getInstituicao(), u.getSenha(), u.getNascimento().get(Calendar.DAY_OF_MONTH), u.getNascimento().get(Calendar.MONTH), u.getNascimento().get(Calendar.YEAR), u.getCargo());
						validos.add(u);
						break;	
					}
				}
				operacao = 1;
			}
			if(operacao < 1 || operacao > 3) {
				imprimir.operacaoInvalida();
			}	
		}while(operacao != 3);
		sc.close();
	} 
}
