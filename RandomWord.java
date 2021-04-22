import java.util.Scanner; 
import java.util.Random;

	  public class RandomWord{
      public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  //Fjalet random me te cilat do luajme 
	  String[] fjaletRandom = {"coding","fun","tiranait","java","program"};
	  char luajPerseri;
	  do{
		  
	      play(fjaletRandom);
	      System.out.println("A deshiron te hamendesosh nje fjale tjeter? Vendos  y:");

	  }while((luajPerseri=input.next().charAt(0))=='y');

    
	  }
	  //Ketu fillon loja
	  public static void play(String[] fjaletRandom){
	  Scanner input = new Scanner(System.in);
	  int humbje = 0; //Numeron se sa hereke humbur
	  char shkronjaVendosur; //Mban shkronjen e vendosur
	  Random random = new Random(); //perdorim objektin random i cili do zgjedhi ne menyre rastesore nje nga fjalet 
	  int i = random.nextInt(fjaletRandom.length);
	  
	  //Use a char array, the length is the length of the word, and all the values ​​inside are assigned to *
	  char[] ch = new char[fjaletRandom[i].length()];
	  for (int j = 0; j < fjaletRandom[i].length(); j++) {
	  ch[j]='*';
	  }
	 // System.out.println(fjaletRandom[i]);
	  do{
	  System.out.print("(Hamendeso) Vendos nje shkronje te hamendesuar: ");
	  System.out.println(ch);
	  
	  shkronjaVendosur = input.next().charAt(0);//vendos shkronjen
	  //Shohim nese shkronja ndodhet ne fjale ose shtojm me nje humbjet 
	  if(fjaletRandom[i].indexOf(shkronjaVendosur)==-1){
	  System.out.println(shkronjaVendosur+" nuk eshte ne fjale! ");
	  humbje++;
	  }
	  //Kontrollojme nese fjala eshte gjetur
	  for (int j = 0; j < ch.length; j++) {
	  if(ch[j]==shkronjaVendosur)System.out.println(shkronjaVendosur +" eshte ne fjale");;
	  break;
	  }


	  }while(guessWord(fjaletRandom[i],ch,shkronjaVendosur));

	  System.out.println("Fjala eshte"+ fjaletRandom[i]+" ti humbe "+ humbje +" here.");
      
	  }


	  public static boolean guessWord(String str,char[] ch,char c){

	  for (int i = 0; i <str.length(); i++) {//shfaq fjalen e sakt ne pozicioni  e duhur 
	  if(str.charAt(i)==c)ch[i]=c;
	  }
	  for (int i = 0; i < str.length(); i++) {
	  if(ch[i]=='*') return true;
	  }
	  return false;
	  }


	  }