package Core.Constructor;

public class Cars {

	public String brand;
	public String model;
	public String color;
	
	public Cars(String brand, String model, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	/*
	 * Once you have created the parameterised Constructor You can not use the
	 * default constructor anymore
	 */
		
	public void ApplyBrake(){
		System.out.println("Applybrake inside Parent");
	}
	
	

	public void SpeedUp(){
		System.out.println("SpeedUp inside Parent");
	}

	@Override
	public String toString() {
		return "Cars [brand=" + brand + ", model=" + model + ", color=" + color + "]";
	}
	
	
	
}
