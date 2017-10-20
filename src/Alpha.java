import java.util.Arrays;

public class Alpha {

	public static void main(String[] args) {
		
		String tab[] = {"Tu as ", " ans"};
		int age = 15;
		
		
		//System.out.println(tab[0] + age + tab[1]);  // affichage 
		
		for (int i = 0; i < tab.length; i++) {
			
			if(i == 0)
			{
				System.out.print(tab[i] + age);
			}
			else
			{
				System.out.print(tab[i]);
			}
			
		}
		
		//Operation ternaire
		
		/*if (age < 18) {
			System.out.println("je suis un enfant");	
		
		} else
		{
			System.out.println("Je suis un adulte");
		}
		*/
				
		System.out.println((age < 18 ? (age < 13 ? "\n Je suis un enfant" :"\r\n Je suis un adolescent") : "\r\n Je suis un adulte"));
	}
		
}

		
		
		
		
		
		