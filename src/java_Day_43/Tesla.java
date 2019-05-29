package java_Day_43;

public class Tesla {

	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;

	public void setModel(String model) {
		if (isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println("Invalid model - " + model);
			this.model = "unknown";
		}
	}

	public String getModel() {
		return model;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public boolean isSelfDriving() {
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

	public boolean isValidModel(String model) {
		if(model.equalsIgnoreCase("Model S") || model.equalsIgnoreCase("Model 3") ||
			model.equalsIgnoreCase("Model X") || model.equalsIgnoreCase("Model Y") ||
			model.equalsIgnoreCase("Roadster")) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

//	public boolean isValidModel(String model) {
//		model = model.toLowerCase();
//		switch (model) {
//		case "model S":
//		case "model 3":
//		case "model x":
//		case "model Y":
//		case "roadster":
//			return true;
//		default:
//			return false;
//		}
//	}

	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}

	// toString is a special method in java, all the objects have it
	// if you do not add toString method to your custom class, it will return
	// hashCode of the object.
	// Once you add toString method to custom class it will return value from the
	// method you wrote

	// toString method used to DESCRIBE the object with values in String format

	// When you print the object variable, it will always call toString method even
	// if you don't mention it
	
}
