import java.util.*;
import java.io.*;
public class battle
{
 public static void main(String args[])throws IOException
 {
 Scanner sc=new Scanner(System.in);
 BufferedReader br=new BufferedReader(new
 InputStreamReader(System.in));
 System.out.println("Welcome to Poke Battle zone\nGet ready to battle");
 System.out.println("1. Venasaur\n2. Charizard\n3. Blastoise\n4. Feraligatr\n5. Typhlosion\n6. Mewtwo\n7. Swampert\n8. Blaziken\n9. Sceptile");
 System.out.println("\n\nPlayer 1 choose your Pokemon(number)");
 int p1=sc.nextInt();
 Pokemon P1=null;

 switch(p1)
 {
 case 1: P1=new Venasaur();break;
 case 2: P1=new Charizad();break;
 case 3: P1=new Blastoise();break;
 case 4: P1=new Feraligatr();break;
 case 5: P1=new Typhlosion();break;
 case 6: P1=new Mewtwo();break;
 case 7: P1=new Swampert();break;
 case 8: P1=new Blaziken();break;
 case 9: P1=new Sceptile();break;

 default:System.out.println("Wrong input!");
 System.exit(0);
 break;
 }
 System.out.println("What would you like to name your Pokemon?");
 P1.name=br.readLine();
 System.out.println("\n\nPlayer 2 choose your Pokemon(number)");
 int p2=sc.nextInt();
 Pokemon P2=null;

 switch(p2)
 {
 case 1: P2=new Venasaur();break;
 case 2: P2=new Charizad();break;
 case 3: P2=new Blastoise();break;
 case 4: P2=new Feraligatr();break;
 case 5: P2=new Typhlosion();break;
 case 6: P2=new Mewtwo();break;
 case 7: P2=new Swampert();break;
 case 8: P2=new Blaziken();break;
 case 9: P2=new Sceptile();break;

 default:System.out.println("Wrong input!");System.exit(0);break;
 }
 System.out.println("What would you like to name your Pokemon?");
 P2.name=br.readLine();
 System.out.println("\fLet the Battle begin");
 Pokemon Poke1,Poke2;
 if(P1.Spe>P2.Spe)
 {
 Poke1=P1;
 Poke2=P2;
 }
 else
 {
 Poke1=P2;
 Poke2=P1;
 }
 System.out.println(Poke1.name+ " starts ");
 while(true)
 {
 System.out.println("\n\n"+Poke1.name+"\nHP:"+Poke1.HP+"\n");
 System.out.println("Moves:");
 Poke1.printMoves();
 System.out.println("\n\n"+Poke2.name+"\nHP:"+Poke2.HP +"\n");
 System.out.println("Moves:");
 Poke2.printMoves();
 System.out.println("\n\n"+Poke1.name+", choose a move(number)");
 int m1=sc.nextInt();
 m1--;
 System.out.println("\n\n"+Poke2.name+", choose a move(number)");
 int m2=sc.nextInt();
 m2--;

 Poke1.calculateDamage(Poke2,m1);
 if(Poke2.HP<=0)
 {
 System.out.println(Poke2.name+" is defeated!\n"+Poke1.name +" wins!");
 System.out.println("Thanks for playing");
 System.exit(0);
 }
 
 Poke2.calculateDamage(Poke1,m2);
 if(Poke1.HP<=0)
 {
 System.out.println(Poke1.name+" is defeated!\n"+Poke2.name +" wins!");
 System.out.println("Thanks for playing");
 System.exit(0);
 }
 
 System.out.println("Enter any button to continue");
 String f=sc.next();
 System.out.print("\f");
 }
 }
}
