package motos;

public class Popular { 
	private int preco;
	private int ano;
	private String marca;
	private int cilindradas;
	private double kmLitro;

	
		
	public int getPreco() {
		return preco;
	}



	public void setPreco(int preco) {
		this.preco = preco;
	}



	public double getKmLitro() {
		return kmLitro;
	}



	public void setKmLitro(double kmLitro) {
		this.kmLitro = kmLitro;
	}

	public Popular(int ano, String marca, int cilindradas) {
		this.ano = ano;
		this.marca = marca;
		this.cilindradas = cilindradas;
	}
	
	public void acelerar () {
		System.out.println("Acelerando....");
	}
	
	public int ipva (int ano) {
		if (ano < 2000)
		{
			System.out.println("Nao paga IPVA");
		} else {
			System.out.println("Paga IPVA");
		}
		
		return ano;
	}
	
	public static void main(String[] args) {
			//System.out.println("teste");
			
			Popular moto1 = new Popular (2005, "Yamaha", 1000);
			moto1.setPreco(8000);
			moto1.setKmLitro(7);
			moto1.acelerar();
			moto1.ipva(2005);
			
			
			Popular moto2 = new Popular (1995, "Ducati", 500);
			moto2.setPreco(5000);
			moto2.setKmLitro(15);
			moto2.acelerar();
			moto2.ipva(1995);
	}
	
}
