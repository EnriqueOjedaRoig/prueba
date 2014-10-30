public class Unidades{
	private double numero;
	
	public Unidades(double n){
		this.numero=n;
}
		
	public double libras(){
		return this.numero*0.45359;
	}		
	public double pies(){
		return this.numero*0.3048;
	}	
	public double yardas(){
		return this.numero*0.9144;
	}		
	public double millas(){
		return this.numero*1609.344;
	}	
	public double acres(){
		return this.numero*2.47105381613712;
	}		
	public double onzas(){
		return this.numero*33.8148;
	}	
	public double galeones(){
		return this.numero*3.7854;
	}
	
}

	class CambioUnidades {
	
		public static void main (String args[]) {
		Unidades n1=new Unidades(3);
		System.out.println("EL cambio de libras a kildfgsogramos es: "+n1.libras());
		System.out.println("EL cambio de pies a metros es: "+n1.pies());
		System.out.println("EL cambio de yardas a metros es: "+n1.yardas());
		System.out.println("EL cambio de millas a metros es: "+n1.millas());
		System.out.println("EL cambio de acres a hectareas es: "+n1.acres());
		System.out.println("EL cambio de onzas a mililitros es: "+n1.onzas());
		System.out.println("EL cambio de galeones a litros es: "+n1.galeones());
		}
}

