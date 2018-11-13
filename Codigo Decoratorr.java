public interface Vendible {
	public String getDescripcion();
	public int getPrecio();
}

public abstract class Auto implements Vendible{
	//atributos de un carro
}

public class FiatUno extends Auto{
	public String getDescripcion(){
		return "Fiat Uno modelo 2006";
	}
	
	public int getPrecio(){
		return 15000;
	}
	
}

public class FordFiesta extends Auto{
	public String getDescripcion(){
		return "Ford Fiesta modelo 2008";
	}
	public int getPrecio(){
		return 25000;
	}
	
}

public abstract class AutoDecorator implements Vendible{
	private Vendible vendible;
	
	public AutoDecorator(Vendible vendible){
			setVendible(vendible);
		}
		public Vendible getVendible(){
			return vendible;
		}
		public void setVendible(Vendible vendible){
			this.vendible = vendible;
		}
		
}

public class AireAcondicionado extends AutoDecorator{
			public AireAcondicionado(Vendible vendible){
				super(vendible);
			}
			public String getDescripcion(){
				return getVendible().getDescripcion() + "+ Aire Acondicionado";
			}
			public int getPrecio(){
				return getVendible().getPrecio() + 1500;
			}
}

public class CDPlayer extends AutoDecorator{
	public CDPlayer (Vendible vendible){
		super(vendible);
	}
	public String getDescripcion(){
		return getVendible().getDescripcion() + "+ CD Player";
	}
	public int getPrecio(){
		return getVendible().getPrecio() + 100;
	}
}

public class Gasoil extends AutoDecorator{
	public Gasoil (Vendible vendible){
		super(vendible);
	}
	public String getDescripcion(){
		return getVendible().getDescripcion() + "+ Gasoil";
	}
	public int getPrecio(){
		return getVendible().getPrecio() + 1200;
	}
}

public class Mp3Player extends AutoDecorator{
	public Mp3Player(Vendible vendible){
		super(vendible);
	}
	public String getDescripcion(){
		return getVendible().getDescripcion() + "+ MP3 Player ";
	}
	public int getPrecio(){
		return getVendible().getPrecio() + 250;
	}
}

public static void main(String[] args){
	Vendible auto = new FiatUno();
	auto = new CDPlayer(auto);
	auto = new Gasoil(auto);
	
	System.out.println(auto.getDescripcion());
	System.out.println("Su precio es: " + auto.getPrecio());
	
	Vendible auto2 = new FordFiesta();
	auto2 = new Mp3Player(auto2);
	auto2 = new Gasoil(auto2);
	auto2 = new AireAcondicionado(auto2);
	
	System.out.println(auto2.getDescripcion());
	System.out.println("Su precio es: " + auto2.getPrecio());
}
