import java.util.Scanner;

public class desafio {

	public static void main(String args) {
		Scanner leitor = new Scanner (System.in); {
			int linha , coluna, linha2 , coluna2;
			
			System.out.println( " Digite a linha  da torre ");
			linha = leitor.nextInt();
			
			System.out.println( " Digite a coluna  da  torre ");
			coluna = leitor.nextInt();
			
			
			System.out.println(" 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8");
			System.out.println(" = = = = = = = = = = = = = = =");
			System.out.println(" 1 | - - - - - - - -");
			System.out.println(" 2 | - - - - - - - -");
			System.out.println(" 3 | - - - - - - - -");
			System.out.println(" 4 | - - - - - - - -");
			System.out.println(" 5 | - - - - - - - -");
			System.out.println(" 6 | - - - - - - - -");
			System.out.println(" 7 | - - - - - - - -");
			System.out.println(" 8 | - - - - - - - -");
			
			
			if( linha >=1 && coluna >=1 && linha <=8 && coluna <=8);
			
			{
				
			for( linha2 = 1; linha2 <=8 ; linha2++);
			 	System.out.print( linha2+ " | ");
			 	
			 	
			for( coluna2 = 1; coluna2 <=8 ; coluna2++); {
					
				
			if( linha == linha2 || coluna == coluna2);
				System.out.print( "x " );
				
				
			System.out.print( " - "); }
				
			System.out.println("");
			}
		    }
		
		
			}
		 		
		

	


	}


