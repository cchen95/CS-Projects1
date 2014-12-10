
public class Run {

	public int red, green, blue;
	public int length;
	public Run prev, next;
	
	public Run(){
		this.red = 0;
		this.green = 0;
		this.blue = 0;
		this.length = 0;
		prev = null;
		next = null;
	}
	
	public Run(int color, int length){
		this.red = color;
		this.green = color;
		this.blue = color;
		this.length = length;
		prev = null;
		next = null;
	}
	
	public Run(int red, int green, int blue, int length){
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.length = length;
		prev = null;
		next = null;
	}
	
	public String toString(){
		return "Red:" + red + " Green:" + green + " Blue:" + blue + "Length:" + length;
	}
}
