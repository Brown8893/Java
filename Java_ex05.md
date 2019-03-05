* Java_ex05
```
import java.lang.*;
import java.util.Scanner;
 
public class Java_ex04 {
    
    public static void main(String[] args[]) 
    {
    	Scanner keyboardInput = new Scanner(System.ln);
    	String str1;
    	double x;
    	
    	System.out.print("欲求x的三次方,請輸入x:");
    	str1 = keyboardInput.nextLine();
    	x=Double.parseDouble(str1);
    	System.out.println("x的三次方為:" + (x*x*x));    	
    }
}
```
