package my_mentoring;

public class Precedence_Rules_Practice {

	public static void main(String[] args) {

	
	
	int x = 1, y = 2;
	
	System.out.println(x++ + y);
	 				//1  + 2 = 3
	System.out.println(x);
	
	int a = 1; //        a = 2
	System.out.println(a++ + a--);
	//                 1  +   2 = 3;
	System.out.println(a); //1
	
	x = 8;
	System.out.println(++x * 3 + " " + x);
//						9  * 3 + " " + 9
//						 27 + " " + 9
	
	int i = 10 + (+11 ) - (-12);
	System.out.println(i);
			    // 21 + 12 = 33
	
	
	a = 12 + 21 * 3 - 9 / 2;
	System.out.println(a); //a = 71

	int b = 14 - 32 * 4 + 175 / 8 - 3;
	System.out.println(b); //a = -96
	
	if(++a > 71 && --b < 20)
//		72 > 71 && -97 < 20;
//		true    &&  true
		System.out.println("a= " + a + " b = " + b );
	
	if (b-- == -97 || a-- < 100)
//		-96 == -97 || 71 < 100
//		false     || true
//		
		System.out.println("a= " + a + " b = " + b );
	
	boolean q, r, s;
	q = r = s = true;
//	if (!q || (b && c));
//	false ||  true
	System.out.println("yay!");
	
	x = 20;
    y = 25;
    
    if(++x < (y = y -= 4) || (x = x +=4) > y);
//       25  <   21    ||     24  > 21
//    	false        ||     true		  
    
    System.out.println("true");
	
	
	}
}
