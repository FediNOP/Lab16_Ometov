

public class Complex {

	double x;
	double y;
	
	//Создаем комплексное чилсо 2 значениями
	public Complex(double x, double y){
		
		this.x = x;
		this.y = y;
		
	}
	// только х
	public Complex(double x){
		
		this.x = x;
		this.y = 0;
		
	}
	
	
	public Complex conj() { return new Complex(x, -y); }
	// плюс
	public Complex plus(Complex complex) { return new Complex(x + complex.x, y + complex.y); }
	// минус
	public Complex minus(Complex complex) { return new Complex(x - complex.x, y - complex.y); }
	// умножить
	public Complex multiply(Complex complex) { return new Complex(x - complex.x, y - complex.y); }
	// умножить на число
	public Complex multiply(double b) { return new Complex(x * b, y * b); }
	// разделить
	public Complex divide(Complex complex) { return this.multiply(complex.conj()).multiply(1 / complex.pow2()); }
	//возвести в степень 2
	public double pow2() { return x * x + y * y; }
	//переопределние метода toString для вывода числа
	@Override
    	public String toString() { return "Complex [x=" + x + ", y=" + y + "]"; }
	
	
	class Main {
	
		public static void main(String[] args){
		
			//комплексное число х=1 у=1
			Complex a = new Complex(1,1);
			//комплексное число х=2 у=2
			Complex b = new Complex(2,2);
			
			// сложение а + b
			a = a.plus(b);
			//итд
		}
	
	
	}
	

}

