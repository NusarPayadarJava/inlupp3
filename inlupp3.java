import java.util.Scanner;

  public class inlupp3 {
	  static int antalforsok=10;
	  static Boolean gameon=true;
	  
	 static int index = ((int) (Math.random() * 25));
	  
	private static class wordClass {
		 private	String ordbank[] = {
				 	"bil", "java", "tåg", "tomat", "ana",
				 	"bok","data","student","radio","tv",
				 	"brandbil","lastbil", "flicka","pojka","man",
				 	"mat","stol","bord","text","lexikon",
				 	"fågel","regn","träd","polis","taxi",
					};
		
		
		 private String ord = ordbank[index]; 
				
	 }//-------------------------------
	 
	
	      
	//**********************************************************************
    public static void main(String[] args) {
    	while (gameon) 
		{
			if (antalforsok == 0 )	
			{
			 System.out.println("-*-*-*-* \n"
			 		          + "Game over\n"
			 		          + " -*-*-*-*"); 
			 gameon=false;
			 break;
			}	
		 		
    	
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Välje meny: "
    				+ "\n 1-Game status:"
    				+ "\n 2-Guess char:"
    				+ "\n 3-Guess word: "); 
    		int menyval = sc.nextInt();
    		
    		if (menyval==1){ System.out.println("--Game status--"); menyStatus();}
    		if (menyval==2){ System.out.println("--Guess char--"); bokstavSok ();}
    		if (menyval==3){ System.out.println("--Guess word--"); ordSok();}
    			 			 			
		}    	
	}//*********************************************************************

	
		//meny1 metod info
		public static void menyStatus () {
			
			int gissningkvar = 10-antalforsok;
		    System.out.println("antal gissning("+gissningkvar+")\n"
			+ "försök kvar("+antalforsok+ ")" );      
			
		}//------------------------------
		
		//meny2 metod bokstav sök 
		public static void bokstavSok () {
			
			wordClass co2= new wordClass();
			String str2 = co2.ord;
			
		   	Scanner sc2 = new Scanner(System.in);
			System.out.println("Gissa 1 bokstav:--: "); 
			antalforsok--; 
			
			char bokstav = sc2.next().charAt(0);
//test System.out.println("du skrivar "+bokstav+"=="+co2.ord+str2.length()); 
					
			
		 for (int i=0; i < str2.length() ; i++) 
		   {
			 
			 if (bokstav != str2.charAt(i) )  
			 {
		     System.out.println("bokstav nr ["+ i+"] Fel "); 
		     		 
		     }
		     else  
		     {
		    
		 	 System.out.println("*bokstav nr ["+ i+"] rätt *"); 
		 	 
		     }
			 
			   
	     }
		 rita(antalforsok);	
		}//----------------------------------------	
		
		
		   // meny3 ordsök metod --------------
			public static void ordSok() {
				
				wordClass co3= new wordClass();
				String str3 = co3.ord;
	//test System.out.println("Ordet "+co3.ord); 
				
				 Scanner sc3 = new Scanner(System.in);
				 System.out.println("Gissa ord: ");
				 antalforsok--; 
				 
				 String inputord = sc3.nextLine();
	//test System.out.println("du skrev "+inputord);
				 
				 		if (inputord.equals( co3.ord) )
				 		{
				 		System.out.println("***** rätt ****");
				 		
				 		}
				        else 
				        {
					      System.out.println("fel ");
					    }
				 		
				 		rita(antalforsok);
				 		
			 				
			}//--------------------------
		     //  metod rita      
					public static void rita (int info4) {
					
						if ( info4 < 11){System.out.println("    |");}
						if ( info4 < 10){System.out.println("    |");}
						if ( info4 < 9 ){System.out.println("    |");}
						if ( info4 < 8 ){System.out.println("    |");}
						if ( info4 < 7 ){System.out.println("    |");}
						if ( info4 < 6 ){System.out.println("    O");}
						if ( info4 < 5 ){System.out.println("    | ");}
						if ( info4 < 4 ){System.out.println("   /|\\");}
						if ( info4 < 3 ){System.out.println("    |");}
						if ( info4 < 2 ){System.out.println("    |");}
					
			}//--------------------------
	
		
	
}
