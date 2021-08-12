package prova1;

public class multa extends sistema{
	String data;
	String placa;
	condutor condutor;
	public void multar(String d, String p, condutor condutor) {
		this.data=d;
		this.placa=p;
		this.condutor=condutor;
		
	}
	public void consultarinfra() {
		System.out.println("Infrações:\nData:"+data+"\nPlaca:"+placa+"\nCondutor:"+condutor);
		
	}
}
