# Java 123

>* AA.java
```
package aaa;

public class AA {
		
	public void aA() {
		System.out.println("A");
	}
	public void aAA() {
		System.out.println("AA");
	}
	public void aAAA() {
		System.out.println("AAA");
	}
}
```

>* BB.java
```
package bbb;

public class BB {
	
	public void bB() {
		System.out.println("B");
	}
	public void bBB() {
		System.out.println("BB");
	}
	public void bBBB() {
		System.out.println("BBB");
	}
}
```

>* CC.java
```
package ccc;

import aaa.AA;
import bbb.BB;

public class CC {

	public static void main(String[] args) {
		AA a1 = new AA();
		a1.aA();
		a1.aAA();
		a1.aAAA();
		
		BB b1 = new BB();
		b1.bB();
		b1.bBB();
		b1.bBBB();
	}

}
```
```
A
AA
AAA
B
BB
BBB
```
