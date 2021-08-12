package prova1;

public class veiculo extends sistema{
	String placa;
	String cor;
	int ano;
	boolean multa;
	
	public void setplaca(String p) {
		this.placa=p;
	}
	public void setcor(String c) {
		this.cor=c;
	}
	public void setano(int a) {
		this.ano=a;
	}
	public String getplaca() {
		return placa;
	}
	public String getcor() {
		return cor;
	}
	public int getano() {
		return ano;
	}
	public void multado(boolean m) {
		this.multa=m;
	}
	public boolean consultamulta() {
		return multa;
	}
}
