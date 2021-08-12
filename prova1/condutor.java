package prova1;

public class condutor extends sistema{
	String nome;
	String tipohab;
	String datanasc;
	boolean multa;
	int pontuacao=0,taxa=0;
	public void cadcondutor(String n, String th, String dn) {
		this.nome=n;
		this.tipohab=th;
		this.datanasc=dn;
	}
	public String getnomecondut() {
		return nome;
	}
	public String gettipohab() {
		return tipohab;
	}
	public String getdatanasc() {
		return datanasc;
	}
	public void multado(boolean m,int p) {
		this.multa=m;
		this.pontuacao= pontuacao+p;
		if(p==1) {
			this.taxa=taxa+50;
		}
		if(p==2) {
			this.taxa=taxa+75;
		}
		if(p==3) {
			this.taxa=taxa+150;
		}
		if(p==5) {
			this.taxa=taxa+300;
		}
	}
	public int taxa() {
		return taxa;
	}
	public int consultapontuacao() {
		return pontuacao;
	}
}
