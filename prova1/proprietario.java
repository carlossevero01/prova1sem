package prova1;

import java.util.ArrayList;

public class proprietario extends sistema
{
	String tipo;
	String nome;
	int identificador;
	ArrayList<veiculo> listav = new ArrayList<veiculo>();
	
	public void settipo(String t) {		this.tipo=t;	}
	public void setnome(String n) {		this.nome=n;	}
	public void setidentificador(int i) {	this.identificador=i;	}
	public String gettipo() {		return tipo;		}
	public String getnome() {		return nome;  		}
	public int getidentificador() {	return identificador;	}
	
	public void comprarveiculo(veiculo v) {		listav.add(v);	}
	
	public void venderveiculo(veiculo v) 
	{
				listav.remove(v);			
		
	}
	public void mostrarlista() {
		for(int i=0; i<listav.size();i++) {
			System.out.println("Veiculo["+i+"]"+"Placa:"+listav.get(i).getplaca()+"Cor:"+listav.get(i).getcor()+
					"Ano:"+listav.get(i).getano());
		}
	}
	public veiculo veiculodalista(int i) {
		return listav.get(i);
	}
	
}
