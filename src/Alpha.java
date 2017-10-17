import java.util.Arrays;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // System.err.println("Hello word");
		String A = "Bonjour";
		String B = " à tous";
		String tab1[] = {A, B};
		//String tab2[];
		System.out.println(A + B);
		
		System.out.print(tab1[0]);
		System.out.println(tab1[1]);
		
		String[] tab2 = {"Bonjour ","à tous"};
		System.out.println(tab2[0]+tab2[1]);
		
		
		
		System.out.println(Arrays.toString(tab2));
		
		
		
		String X =(Arrays.toString(tab2));
		System.out.println(X);
		
			
		
		
		for(int i = 0; i < tab1.length; i++) 
			
		{
			System.out.println(i);
			System.out.println(tab1[i]);
		}
		
		
	
		for (String variable : tab1) 
		{
			System.out.print(variable);
		}
		
			
	}

	
		
	}


