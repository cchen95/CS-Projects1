
public class Pixel {

		private short red, green, blue;
		public Pixel(short red, short green, short blue){
			this.red = red;
			this.green = green;
			this.blue = blue;
		}
		public Pixel(short color){
			this.red = color;
			this.green = color;
			this.blue = color;
		}
		public Pixel(){
			this.red = 0;
			this.green = 0;
			this.blue = 0;
		}
		
		public short getRed(){
			return red;
		}
		
		public short getBlue(){
			return blue;
		}
		
		public short getGreen(){
			return green;
		}
		public String toString(){
			String info = "" + red;
			return info;
		}
}
