
public class Product {

	int barcode;
	private String name, color, desc;

	public Product() {
		super();
	}

	public Product(int barcode, String name, String color, String desc) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.color = color;
		this.desc = desc;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
