* ex_0506

```
問題描述 ：
請寫出一個統計英文字母出現次數的程式 ( 不分大小寫 ) ，讓使用者輸入一連串 n 個英文字母 ( 無空白 ) 後，告訴使用者每個字母所出現的次數，次數為 0 者不輸出。

輸入說明 ：
輸入 n 個英文字母 (n < 100) 。

輸出說明 ：
輸出 m 列資料 (1 ≦ m ≦ 26) ，每列資料輸出字母及其所出現的次數，次數為 0 的則不顯示。
```

```
/**
 * @(#)Main.java
 *
 * Main application
 *
 * @author 
 * @version 1.00 2019/6/4
 */
import java.util.*;

public class Main
{
	public static void main(String[] args)
{
	int []num=new int[26];
	char b;
	String str;
	Scanner scn=new Scanner(System.in);
	
	str=scn.nextLine();
	str=str.toLowerCase();
	char a[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
	{
		if((a[i]-97<26)&&(a[i]-97>=0))
			{
		num[a[i]-97]++;
			}
	}

	for(int j=0;j<num.length;j++){
	if(num[j]!=0){
	b=(char)(j+97);
	System.out.printf("%c %d\n",b,num[j]);
	}
	}
	}
}
```
