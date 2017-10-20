import java.util.Arrays;
import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		
		String tab[] = {"Tu as ", " ans"};
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrée le nombre de jours : ");

		String tabMois[] = {"Janvier", "Février", "Mars", "Avril", "Mai","Juin","Juillet", "Août","Septembre","Octobre","Novembre","Décembre"};
		String tabJour[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi","Samedi","Dimanche"};
		String tabMoisJour[][] = {tabMois,tabJour};
		int nbDjours= sc.nextInt();
		
		if (nbDjours <= 31 )
	    {
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][0]);
	    }
		else if (nbDjours <= 59 )
	   	{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][1]);
	   	}
		else if (nbDjours <= 90 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][2]);
		}
		else if (nbDjours <= 120 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][3]);
		}
		else if (nbDjours <= 151 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][4]);
		}
		else if (nbDjours <= 181 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][5]);
		}
		else if (nbDjours <= 212 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][6]);
		}
		else if (nbDjours <= 243 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][7]);
		}
		else if (nbDjours <= 273 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][8]);
		}
		else if (nbDjours <= 304 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][9]);
		}
		else if (nbDjours <= 334 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][10]);
		}
		else if (nbDjours <= 365 )
		{
		System.out.println("Ce nombre de jours correspond au mois de : " + tabMoisJour[0][11]);
		}
					
		
		}
			
		}
		
	