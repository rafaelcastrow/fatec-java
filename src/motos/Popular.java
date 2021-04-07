package motos;

import java.util.HashSet;
import java.util.Set;

public class Popular { 
	
	//Atributos
	
	private int preco;
	private int ano;
	private String marca;
	private int cilindradas;
	private double kmLitro;

	
	
	// Getters e Setters
		
	public int getPreco() {
		return preco;
	}

	

	public double getKmLitro() {
		return kmLitro;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public void setKmLitro(double kmLitro) {
		this.kmLitro = kmLitro;
	}

	
	//metodo construtor 
	
	public Popular(int ano, String marca, int cilindradas) {
		this.ano = ano;
		this.marca = marca;
		this.cilindradas = cilindradas;
	}
	
	
	public void acelerar () {
		System.out.println("Verificando moto.... \n" + "A moto selecionada foi: " + marca);
	}
	
	public int potencia (int cilindradas) {
		if (cilindradas < 900)
		{
			System.out.println("A moto possui menos que 900 cilindras \n ");
		} else {
			System.out.println("A moto possui mais que 900 cilindras \n");
		}
		
		return cilindradas;
	}
	
	public int ipva (int ano) {
		if (ano < 2000)
		{
			System.out.println("A moto " + marca + "do ano " + ano + " NAO PAGA IPVA");
		} else {
			System.out.println("A moto " + marca + "do ano " + ano + " PAGA IPVA ");
		}
		
		return ano;
	}
	
	
	//Metodos de Classes
	
	public static void main(String[] args) {
			
			Popular moto1 = new Popular (2007, "Yamaha R1 ", 1000);
			moto1.setPreco(26500);
			moto1.setKmLitro(7);
			moto1.acelerar();
			moto1.ipva(2007);
			moto1.potencia(1000);
			System.out.println("Informações extras: ");
			System.out.println("Preço da moto R$ " + moto1.getPreco() + " \nKm por litro: " + moto1.getKmLitro());
			System.out.println("===================================================");
			
			Popular moto2 = new Popular (2018, "BMW S1000RR ", 1000);
			moto2.setPreco(69999);
			moto2.setKmLitro(15);
			moto2.acelerar();
			moto2.ipva(2018);
			moto2.potencia(1000);
			System.out.println("Informações extras: ");
			System.out.println("Preço da moto R$ " + moto2.getPreco() + " \nKm por litro: " + moto2.getKmLitro());
			System.out.println("===================================================");
			
			Popular moto3 = new Popular (1995, "Ducati Monster ", 800);
			moto3.setPreco(30000);
			moto3.setKmLitro(18);
			moto3.acelerar();
			moto3.ipva(1995);
			moto3.potencia(800);
			System.out.println("Informações extras: ");
			System.out.println("Preço da moto R$ " + moto3.getPreco() + " \nKm por litro: " + moto3.getKmLitro());
			System.out.println("===================================================");
			
			Popular moto4 = new Popular (1999, "Aprillia RSV4 ", 500);
			moto4.setPreco(79900);
			moto4.setKmLitro(8);
			moto4.acelerar();
			moto4.ipva(1999);
			moto4.potencia(500);
			System.out.println("Informações extras: ");
			System.out.println("Preço da moto R$ " + moto4.getPreco() + " \nKm por litro: " + moto4.getKmLitro());
			
		// git add -A
			// git commit -m "MENSAGEM"
			// git push
	}
	
}
