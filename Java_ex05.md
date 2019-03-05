* Java_ex05
```
import java.util.Scanner; 
public class asd 
{
    
    public static void main(String args[]) 
    {
    	Scanner k = new Scanner(System.in);
    	String str1;
    	double x;
    	
    	System.out.print("欲求x的三次方,請輸入x:");
    	str1 = k.nextLine();
    	x=Double.parseDouble(str1);
    	System.out.println("x的三次方為:" + (x*x*x));    	
    }
}
```
