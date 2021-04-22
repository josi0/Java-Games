import java.util.*;
public class TicTacToe{
	    static String[] tabela; 
	    static String rradha; 
	    
	    
	    // Metoda kontrolloFituesin do vendosi kombinimin e tre kutive  
	    
	    static String kontrolloFituesin() 
	    { 
	        for (int a = 0; a < 8; a++) { 
	            String rresht = null; 
	  
	            switch (a) { 
	            case 0: 
	                rresht =tabela[0] + tabela[1] + tabela[2]; 
	                break; 
	            case 1: 
	                rresht = tabela[3] + tabela[4] + tabela[5]; 
	                break; 
	            case 2: 
	                rresht = tabela[6] + tabela[7] + tabela[8]; 
	                break; 
	            case 3: 
	                rresht = tabela[0] + tabela[3] + tabela[6]; 
	                break; 
	            case 4: 
	                rresht= tabela[1] + tabela[4] + tabela[7]; 
	                break; 
	            case 5: 
	                rresht = tabela[2] + tabela[5] + tabela[8]; 
	                break; 
	            case 6: 
	                rresht = tabela[0] + tabela[4] + tabela[8]; 
	                break; 
	            case 7: 
	                rresht = tabela[2] + tabela[4] + tabela[6]; 
	                break; 
	            } 
	            //Nese fituesi eshte X
	            if (rresht.equals("XXX")) { 
	                return "X"; 
	            } 
	              
	            //Nese fituesi eshte O
	            else if (rresht.equals("OOO")) { 
	                return "O"; 
	            } 
	        } 
	          
	        for (int a = 0; a < 9; a++) { 
	            if (Arrays.asList(tabela).contains( 
	                    String.valueOf(a + 1))) { 
	                break; 
	            } 
	            else if (a == 8) { 
	                return "Barazim"; 
	            } 
	        } 
	  
	       // Vendos e X dhe O ne tabele 
	        System.out.println( "Eshte rradha e " +
	            rradha + "; Vendos  "
	            + rradha + " ne kutizen me numer:"); 
	        return null; 
	    } 
	      
	    // Printimi i tabeles ne fillim
	    /* |---|---|---| 
	       | 1 | 2 | 3 | 
	       |-----------| 
	       | 4 | 5 | 6 | 
	       |-----------| 
	       | 7 | 8 | 9 | 
	       |---|---|---|*/
	    
	    static void printimiTabeles() 
	    { 
	        System.out.println("|---|---|---|"); 
	        System.out.println("| " + tabela[0] + " | "
	                           + tabela[1] + " | " + tabela[2] 
	                           + " |"); 
	        System.out.println("|-----------|"); 
	        System.out.println("| " + tabela[3] + " | "
	                           + tabela[4] + " | " + tabela[5] 
	                           + " |"); 
	        System.out.println("|-----------|"); 
	        System.out.println("| " + tabela[6] + " | "
	                           + tabela[7] + " | " + tabela[8] 
	                           + " |"); 
	        System.out.println("|---|---|---|"); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        Scanner input = new Scanner(System.in); 
	        tabela = new String[9]; 
	        rradha = "X"; 
	        String fituesi = null; 
	  
	        for (int a = 0; a < 9; a++) { 
	        	tabela[a] = String.valueOf(a + 1); 
	        } 
	  
	        System.out.println("Loja Tic Tac Toe."); 
	        printimiTabeles(); 
	  
	        System.out.println( 
	            "X do luaje i pari.Vendos numrin e kutizes ku do te vendoset X:"); 
	  
	        while (fituesi == null) { 
	            int numVendosur; 
	            
	           // Ne rastin e vendosjes se numrit te gabuar
	           // numVendosur merr input  nga 1 te 9. 
	           // nese nuk eshte midis 1 dhe 9. 
	           // e me pas do nxjerre errorin "Input igabuar." 
	           
	                numVendosur = input.nextInt(); 
	                if (!(numVendosur > 0 && numVendosur <= 9)) { 
	                    System.out.println( 
	                        "Input i gabuar; Rivendos nje numer tjeter:"); 
	                    continue; 
	                } 
	           
	              
	            // Logjika e rradhes 
	            if (tabela[numVendosur - 1].equals( 
	                    String.valueOf(numVendosur))) { 
	            	tabela[numVendosur - 1] = rradha; 
	  
	                if (rradha.equals("X")) { 
	                    rradha = "O"; 
	                } 
	                else { 
	                    rradha = "X"; 
	                } 
	  
	                printimiTabeles(); 
	                fituesi = kontrolloFituesin(); 
	            } 
	            else { 
	                System.out.println( 
	                    "Upss! Vendi i zene! Rivendos nje numer:"); 
	            } 
	        } 
	        
	        // Nese asnjeri nuk fiton ose humb kemi barazim
	        if (fituesi.equalsIgnoreCase("Barazim")) { 
	            System.out.println( 
	                "Barazim!"); 
	        } 
	        
	        //Ne te kundert kemi fitues
	        else { 
	            System.out.println( 
	                "Urime! " + fituesi 
	                + "ka fituar!"); 
	        } 
	    } 
}