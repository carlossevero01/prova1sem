package prova1;

import java.util.ArrayList;
import java.util.Scanner;



public class sistema 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x=1;
		ArrayList<condutor> listacondutores = new ArrayList<condutor>();
		ArrayList<veiculo> listaveiculos = new ArrayList<veiculo>();
		ArrayList<proprietario> listaproprietario= new ArrayList<proprietario>();
		while(x!=0)
		{	
			
			System.out.println("Selecione uma opera��o:"+
		    "\n[1]-Cadastro de condutor"+"\n[2]-Cadastro de veiculo"+
			"\n[3]Cadastro de propriet�rio ou opera��es de propriet�rio"+"\n[4]Cadastro de multas"+"\n[5]Consulta de multas "+
		    "\n[0]Encerrar Programa");
			System.out.println("R:");
			x=sc.nextInt();
			
			switch(x) {
			
				case 1:
					System.out.println("Cadastro de condutor");
					condutor condutor = new condutor();
					System.out.println("R(Nome),(Tipo de Habilita��o),(Data de Nascimento):");   
					condutor.cadcondutor(sc.next(), sc.next(), sc.next());
					listacondutores.add(condutor);
					break;
				case 2:
					System.out.println("Cadastro de veiculo");
					veiculo veiculo = new veiculo();
					System.out.println("Ano:");veiculo.setano(sc.nextInt());
					System.out.println("Cor:"); veiculo.setcor(sc.next());
					System.out.println("Placa:");veiculo.setplaca(sc.next());
					listaveiculos.add(veiculo);
					break;
				case 3:
					
					System.out.println("[1]-Cadastro de propriet�rio ou [2]-Opera��es para P.Fisica ou P.Juridica?");
					
					x=sc.nextInt();
					if(x==1) 
					{
					proprietario proprietario = new proprietario();
					System.out.println("Identificador(ID):");proprietario.setidentificador(sc.nextInt());
					System.out.println("Nome/Raz�oSocial:");proprietario.setnome(sc.next());
					System.out.println("P.Fisica ou P.Juridica?");
					proprietario.settipo(sc.next());
					listaproprietario.add(proprietario);
					}
					if(x==2) 
					{
						System.out.println("O propriet�rio tem um veiculo? [1]Sim [2]Quer comprar [3]N�o  ");
						x=sc.nextInt();
						int iv,id;
						if(x==1) 
						{	
							System.out.println("Identifica��o do proprietario:");
							System.out.println("R:");	id=sc.nextInt();
						System.out.println("[3]comprar veiculo [4]vender veiculo [5] lista de veiculos desse propriet�rio");
						x=sc.nextInt();
						
						
						switch(x) 
						{
							case 3:
								System.out.println("Qual veiculo comprar(escolha pelo indice)? ");
								System.out.println("Lista de veiculos disponiveis com seus indices:");
								for(int i=0;i<listaveiculos.size();i++) {
									
									System.out.println("Veiculo["+i+"]"+"Placa:"+listaveiculos.get(i).getplaca());
								}
								System.out.println("R:");	iv=sc.nextInt();
								for(int i=0;i<listaproprietario.size();i++) {
									if(listaproprietario.get(i).getidentificador()==id) {
										veiculo v = (veiculo) listaveiculos.get(iv);
										proprietario pro = (proprietario) listaproprietario.get(id);
										pro.comprarveiculo(v);	////Parte que n�o funciona
									}
									else {
										System.err.println("N�o h� propriet�rio com a identifica��o insira, tente novamente!");
									}
								}
								
								break;
							case 4: 
								System.out.println("Qual veiculo vender?(escolha pelo indice)");
								for(int i=0;i<listaproprietario.size();i++) 
								{
									if(listaproprietario.get(i).getidentificador()==id) 
									{
										listaproprietario.get(i).mostrarlista();
										System.out.println("R:");	iv=sc.nextInt();
										listaproprietario.get(id).venderveiculo(listaproprietario.get(id).veiculodalista(iv));	// Parte que n�o funciona
									}
									else 
									{
										System.err.println("N�o h� propriet�rio com a identifica��o insira, tente novamente!");
									}
								}
								break;		
							}
						}
						if(x==2) 
						{	
						System.out.println("Identifica��o do proprietario:");
						System.out.println("R:");	id=sc.nextInt();
						System.out.println("Qual veiculo comprar(escolha pelo indice)? ");
						System.out.println("Lista de veiculos disponiveis com seus indices:");
							for(int i=0;i<listaveiculos.size();i++) 
							{
								System.out.println("Veiculo["+i+"]"+"Placa:"+listaveiculos.get(i).getplaca());
							}
						System.out.println("R:");	iv=sc.nextInt();
							for(int i=0;i<listaproprietario.size();i++) 
							{
								if(listaproprietario.get(i).getidentificador()==id) 
								{
								veiculo v = (veiculo) listaveiculos.get(iv);
								listaproprietario.get(id).comprarveiculo(v);	////Parte que n�o funciona
								}
								else 
								{
								System.err.println("N�o h� propriet�rio com a identifica��o insira, tente novamente!");
								}
							}
						}
						else {
							
						}
					}
					
					
					break;
				case 4:
					System.out.println("Cadastro de Multas");
					multa multa = new multa();
					int ic,iv,pont;
					String d;
						if(listacondutores.size()>=1) {
					System.out.println("Insira na sequencia Data , o index do veiculo , index do condutor:\nVeiculos:");
					for(int i=0;i<listaveiculos.size();i++) {
						System.out.println("Veiculo["+i+"]"+"Placa:"+listaveiculos.get(i).getplaca());
					}
					System.out.println("Condutores:");
					for(int i=0;i<listacondutores.size();i++) {
						System.out.println("Condutor["+i+"]"+"Nome:"+listacondutores.get(i).getnomecondut());
					}
					System.out.println("R:	Data:"); d=sc.next();
					System.out.println("R:	Indice do veiculo:"); iv=sc.nextInt();
					System.out.println("R:	Indice do condutor:"); ic=sc.nextInt();
					System.out.println("Pontua��o a ser aplicada:");	pont=sc.nextInt();
					multa.multar(d, listaveiculos.get(iv).getplaca(), listacondutores.get(ic));
					listacondutores.get(ic).multado(true, pont);
					listaveiculos.get(iv).multado(true);
						}
						else {System.out.println("N�o h� condutores para o cadastro de multas, tente novamente");}
					break;
				case 5:
					System.out.println("Consulta de multa: [1] consulta de multa por placa \t [2] Consulta de pontua��o por condutor:");
					x=sc.nextInt();
					if(x==1) 
					{
					System.out.println("Consulta de multa por placa:");
					System.out.println("Insira uma placa para a consulta:");
					String p=sc.next();
					
						for(int i=0;i<listaveiculos.size();i++) 
						{
						
							if(listaveiculos.get(i).getplaca().equalsIgnoreCase(p)) 
							{
								if(listaveiculos.get(i).consultamulta()==true) {System.out.println("Veiculo multado");}
								else {	System.out.println("Veiculo n�o foi multado");}
							}
							else 
							{
							System.out.println("Placa n�o encontrada");
							}
						}
					}
					if(x==2) 
					{
						if(listacondutores.size()>=1) 
						{
						System.out.println("Consulta pontua��o por condutor\nInsira o numero do condutor da lista :");
						for(int i=0;i<listacondutores.size();i++) 
						{
							System.out.println("Condutor["+i+"]"+"\nNome:"+listacondutores.get(i).getnomecondut());
						}
						System.out.println("R:");int h=sc.nextInt();
						System.out.println("Pontua��o:"+listacondutores.get(h).consultapontuacao());
						System.out.println("Taxa de multa � pagar:R$"+listacondutores.get(h).taxa()+",00");
						}
						else {
							System.out.println("N�o � nenhum condutor na lista");
						}
					}
					else 
					{
					
					}
					break;
				case 0:
					System.out.println("Programa Encerrado");
					break;
			}
		}
		sc.close();
	}
}