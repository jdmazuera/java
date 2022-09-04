package util;
import java.util.Scanner;

public class Printer {
	public Printer(){
    
    };

    public String userInput(){
        Scanner scanner_obj = new Scanner(System.in);
        String name = scanner_obj.next();
        return(name);
    }
    
    public void run_app(){
        String name = this.userInput();
    	System.out.println("Hello World! " + name);
    }
}