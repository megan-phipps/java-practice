package java_day_52;

public class Computer {
	private String model;
	private String color;
	
	public boolean equals(Object other) {
		Computer that = (Computer) other;
		if(this.model.equals(that.model) && color.equals(that.color)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	public Computer() {
		super();
	}
	
	public Computer(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}



	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
