import java.util.Scanner;

public class Stream {

//лаб 5
	
	public static void main(String[] arg) {
		
		
		Scanner sc = new Scanner(System.in);
		//регулярка для праверки гласного
		System.out.println(sc.next().matches("^(?ui:[аеёиоуыэюя]).*"));
		
		
		
	}
	
	
	
}
