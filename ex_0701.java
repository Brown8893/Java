* ex_0701

```
/**
 * @(#)Main.java
 *
 * Main application
 *
 * @author 
 * @version 1.00 2019/5/7
 */
package myJava.ch07;
import java.lang.*;

public class Main         //主類別
{
    public static void main(String args[])
    {
        CCar bus = new CCar();    //建構值(是動作,建在記憶裡面,無回傳值)
        CCar truck = new CCar();  //建構值只要寫一類別,即有預設
        CCar taxi = new CCar();
 
        bus.name = "公車";         //公開
        bus.wheel = 6;
        bus.person = 40;
 
        truck.name = "卡車";
        truck.wheel = 8;
        truck.person = 3;
  
        taxi.name = "計程車";
        taxi.wheel = 4;
        taxi.person = 5;
        //taxi.engine = "V16";  //不可存取私用等級的變數(找不到或無法載入主要類別 myJava.ch07.Main)
  
        System.out.print(bus.name + "有" + bus.wheel + "個輪子");
        System.out.println(", 可載" + bus.person + "人");
        System.out.print(truck.name + "有" + truck.wheel + "個輪子");
        System.out.println(", 可載" + truck.person + "人");
        System.out.print(taxi.name + "有" + taxi.wheel + "個輪子");
        System.out.println(", 可載" + taxi.person + "人");
    } 
}    

class CCar
{
    public int wheel;
    public int person;
    public String name;
    private String engine;
}
```

```
公車有6個輪子, 可載40人
卡車有8個輪子, 可載3人
計程車有4個輪子, 可載5人

Process completed.
```
