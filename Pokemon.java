public class Pokemon extends battle
{

 int HP,Def,SpDef,Att,SpAtt,Spe;
 String name,type1,type2;
 String moves[][];
 Pokemon(int h,int a,int d,int sa,int sd, int s, String t1,
String t2)
 {
 moves=new String[4][6];
 HP=h;
 Def=d;
 SpDef=sd;
 Att=a;
 SpAtt=sa;
 Spe=s;
 type1=t1;
 type2=t2;
 }
 void printMoves()
 {
 for(int i=0;i<4;i++)
 System.out.println((i+1)+". "+moves[i][0]);
 }
 void calculateDamage(Pokemon P, int m)
 {
 System.out.println("\n\n");
 double damage=0.0;
 double r=Math.random()*100;
 if(r>Double.parseDouble(moves[m][2]))
 {
 System.out.println("Attack missed!");
 return;
 }
 if(moves[m][4].equals("special"))
 {
 damage=SpAtt*Double.parseDouble(moves[m][1])/P.SpDef;
 }
 else
 {

 damage=Att*Double.parseDouble(moves[m][1])/P.Def;
 }
 double rawDam=damage;
 String typem=moves[m][3];
 String typep1=P.type1;
 String typep2=P.type2;
 if(typep1.equals("fire"))
 {
 if(typem.equals("fire"))
 {
 damage/=2;

 }
 else if(typem.equals("water"))
 {
 damage*=2;

 }
 else if(typem.equals("grass"))
 {
 damage/=2;
 }
 else if(typem.equals("ground"))
 {
 damage*=2;
 }
 else if(typem.equals("rock"))
 {
 damage*=2;

 }
 else if(typem.equals("ice"))
 {
 damage/=2;

 }
 }
 else if(typep1.equals("water"))
 {
 if(typem.equals("fire"))
 {
 damage/=2;
 }
 else if(typem.equals("water"))
 {
 damage/=2;
 }
 else if(typem.equals("grass"))
 {
 damage*=2;

 }
 else if(typem.equals("electric"))
 {
 damage*=2;

 }
 else if(typem.equals("ice"))
 {
 damage/=2;

 }
 }
 else if(typep1.equals("grass"))
 {
 if(typem.equals("fire"))
 {
 damage*=2;

 }
 else if(typem.equals("water"))
 {
 damage/=2;

 }
 else if(typem.equals("grass"))
 {
 damage/=2;

 }
 else if(typem.equals("ground"))
 {
 damage/=2;

 }
 else if(typem.equals("rock"))
 {
 damage*=2;

 }
 else if(typem.equals("ice"))
 {
 damage*=2;

 }
 else if(typem.equals("flying"))
 {
 damage*=2;

 }
 else if(typem.equals("electric"))
 {
 damage/=2;

 }
 }
 else if(typep1.equals("psychic"))
 {
 if(typem.equals("psychic"))
 {
 damage/=2;

 }
 else if(typem.equals("dark"))
 {
 damage*=2;

 }
 else if(typem.equals("fighting"))
 {
 damage/=2;

 }
 }
 else if(typep1.equals("flying"))
 {
 if(typem.equals("ice"))
 {
 damage*=2;

 }
 else if(typem.equals("electric"))
 {
 damage*=2;

 }
 else if(typem.equals("fighting"))
 {
 damage/=2;

 }
 else if(typem.equals("rock"))
 {
 damage*=2;
 
 }
 else if(typem.equals("ground"))
 {
 damage=0;

 }
 else if(typem.equals("grass"))
 {
 damage/=2;

 }
 }
 else if(typep1.equals("ground"))
 {
 if(typem.equals("ice"))
 {
 damage*=2;

 }
 else if(typem.equals("electric"))
 {
 damage=0;

 }
 else if(typem.equals("water"))

 damage*=2;

 else if(typem.equals("grass"))
 {
 damage*=2;

 }
 }
 else if(typep1.equals("poison"))
 {
 if(typem.equals("ground"))
 {
 damage*=2;

 }
 else if(typem.equals("psychic"))
 {
 damage*=2;

 }
 else if(typem.equals("grass"))
 {
 damage/=2;

 }
 else if(typem.equals("poison"))
 {
 damage/=2;

 }
 else if(typem.equals("fighting"))
 {
 damage/=2;

 }
 }
 if(typep2.equals("null"))
 {
 P.HP-=(int)(damage);
 }
 else
 {
 if(typep2.equals("fire"))
 {
 if(typem.equals("fire"))
 {
 damage/=2;
 }
 else if(typem.equals("water"))
 {
 damage*=2;
 }
 else if(typem.equals("grass"))
 {
 damage/=2;

 }
 else if(typem.equals("ground"))
 {
 damage*=2;

 }
 else if(typem.equals("rock"))
 {
 damage*=2;

 }
 else if(typem.equals("ice"))
 {
 damage/=2;
 }
 }
 else if(typep2.equals("water"))
 {
 if(typem.equals("fire"))
 {
 damage/=2;
 }
 else if(typem.equals("water"))
 {
 damage/=2;
 }
 else if(typem.equals("grass"))
 {
 damage*=2;
 }
 else if(typem.equals("electric"))
 {
 damage*=2;
 }
 else if(typem.equals("ice"))
 {
 damage/=2;
 }
 }
 else if(typep2.equals("grass"))
 {
 if(typem.equals("fire"))
 {
 damage*=2;
 }
 else if(typem.equals("water"))
 {
 damage/=2;
 }
 else if(typem.equals("grass"))
 {
 damage/=2;
 }
 else if(typem.equals("ground"))
 {
 damage/=2;
 }
 else if(typem.equals("rock"))
 {
 damage*=2;

 }
 else if(typem.equals("ice"))
 {
 damage*=2;

 }
 else if(typem.equals("flying"))
 {
 damage*=2;

 }
 else if(typem.equals("electric"))
 {
 damage/=2;
 }
 }
 else if(typep2.equals("psychic"))
 {
 if(typem.equals("psychic"))
 {
 damage/=2;
 }
 else if(typem.equals("dark"))
 {
 damage*=2;
 }
 else if(typem.equals("fighting"))
 {
 damage/=2;
 }
 }
 else if(typep2.equals("flying"))
 {
 if(typem.equals("ice"))
 {
 damage*=2;
 }
 else if(typem.equals("electric"))
 {
 damage*=2;
 }
 else if(typem.equals("fighting"))
 {
 damage/=2;
 }
 else if(typem.equals("rock"))
 {
 damage*=2;
 }
 else if(typem.equals("ground"))
 {
 damage=0;
 }
 else if(typem.equals("grass"))
 {
 damage/=2;
 }
 }
 else if(typep2.equals("ground"))
 {
 if(typem.equals("ice"))
 {
 damage*=2;
 }
 else if(typem.equals("electric"))
 {
 damage=0;
 }
 else if(typem.equals("water"))
 {
 damage*=2;
 }
 else if(typem.equals("grass"))
 {
 damage*=2;
 }
 }
 else if(typep2.equals("poison"))
 {
 if(typem.equals("ground"))
 {
 damage*=2;
 }
 else if(typem.equals("psychic"))
 {
 damage*=2;
 }
 else if(typem.equals("grass"))
 {
 damage/=2;
 }
 else if(typem.equals("poison"))
 {
 damage/=2;
 }
 else if(typem.equals("fighting"))
 {
 damage/=2;
 }
 }
 P.HP-=(int)(damage);
 }

 if(damage==0)
 System.out.println(moves[m][0] +" has no effect on "+P.name);
 else if(damage>rawDam)
 {
 System.out.println(moves[m][0] +" is Super Effective on "+P.name);
 }
 else if(damage<rawDam)
 {
 System.out.println(moves[m][0] +" is Not Very Effective on "+P.name);
 }
 }
}