public class GoodBad{
    //public static String[][] rahu=new String[][]{{"OKAY","SOME BAD","OKAY","OKAY","SOME BAD","GOOD","OKAY","OKAY","VERY BAD","SOME GOOD","SOME GOOD","BAD"},{"BAD","GOOD"}};
    //public static String[][] mars=new String[][]{{"GOOD","BAD"},{"BAD","GOOD"}};
    //public static String[][] rahu=new String[][]{{"OKAY","SOME BAD","OKAY","OKAY","SOME BAD","GOOD","OKAY","OKAY","VERY BAD","SOME GOOD","SOME GOOD","BAD"},{"BAD","GOOD","SOME GOOD","GOOD","BAD","GOOD","GOOD","VERY BAD", "BAD", "SOME BAD", "SOME GOOD", "GOOD" },{"GOOD","SOME GOOD","SOME GOOD","OKAY","SOME BAD","GOOD","SOME GOOD","SOME BAD","SOME GOOD","BAD","SOME BAD","SOME BAD"},{"OKAY","VERY GOOD","SOME BAD","OKAY","BAD","VERY GOOD","SOME GOOD","VERY BAD","VERY GOOD","GOOD","BAD","VERY BAD"},{"VERY BAD","VERY GOOD","VERY GOOD","BAD","BAD","GOOD","VERY GOOD","BAD","OKAY","VERY GOOD","GOOD","BAD"},{"BAD","GOOD","GOOD","GOOD","VERY BAD","SOME GOOD","};
   // public static String[][] mars=new String[][]{{"GOOD","BAD"},{"BAD","GOOD"}};
//    public static int[][] rahu=new int[][]{{3,2,3,3,2,4,3,3,0,4,4,1},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,}};
    public static int[][] rahu=new int[][]{{-1,-1,3,1,-1,5,2,3,-3,2,4,-3},{-1,5,2,3,-2,3,4,-3,-3,-2,3,3},{2,1,2,1,1,2,1,2,1,-2,-1,1},{2,7,-1,1,-2,5,2,1,4,2,1,-4},{-4,6,4,-2,-3,3,4,-3,-2,4,3,-4},{-4,2,3,4,-5,2,2,-4,1,2,6,2},{1,1,-2,2,-1,-1,2,-4,4,2,2,3},{3,6,-3,-3,1,6,-2,-4,-1,5,3,2},{1,7,4,-4,-6,5,4,-5,2,3,4,2},{-2,5,3,3,-4,-1,2,-2,-2,2,3,2},{3,-3,1,4,2,2,-2,-2,3,-2,-1,2},{2,5,3,2,2,4,-2,-7,2,6,1,1}};
    public static int[][] ketu=new int[][]{{2,-5,3,3,4,3,2,1,1,1,-1,5},{1,-5,1,3,4,1,3,7,-3,-2,-3,5},{2,-5,1,2,5,2,2,5,4,-3,-6,5},{4,-5,-4,3,5,2,1,6,4,2,-3,4},{3,1,3,2,-2,-2,2,-5,-2,4,2,3},{-2,-6,1,5,4,1,1,6,3,2,3,5},{3,5,1,4,5,3,1,-4,3,2,2,6},{3,-4,-2,1,5,3,-1,6,3,3,-3,3},{3,3,3,-4,4,1,4,4,3,2,2,4},{2,-1,4,4,-2,-3,2,5,3,1,-2,2},{3,-5,2,3,4,-3,1,6,5,-2,-4,2},{2,-4,1,3,4,2,-3,5,4,3,-5,4}};
/*    public static int[][] sun=new int[][]{{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,}};
    public static int[][] moo=new int[][]{{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,}};
    public static int[][] mar=new int[][]{{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,}};
    public static int[][] mer=new int[][]{{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,}};
    public static int[][] ven=new int[][]{{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,}};
    public static int[][] jup=new int[][]{{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,}};
    public static int[][] sat=new int[][]{{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,},{,,,,,,,,,,,}};

*/
   static int keths[]=new int [] {0,0,0,0,0,0,0,0,0,0,0,1};
   static int[] venhs=new int [] {0,1,0,0,0,0,2,0,0,0,0,0};
   static int[] sunhs=new int [] {0,0,0,0,2,0,0,0,0,0,0,0};
   static int[] moohs=new int [] {0,0,0,2,0,0,0,0,0,0,0,0};
   static int[] marhs=new int [] {2,0,0,0,0,0,0,1,0,0,0,0};
   static int[] rahhs=new int [] {0,0,0,0,0,1,0,0,0,0,0,0};
   static int[] juphs=new int [] {0,0,0,0,0,0,0,0,2,0,0,1};
   static int[] saths=new int [] {0,0,0,0,0,0,0,0,0,1,2,0};
   static int[] merhs=new int [] {0,0,1,0,0,2,0,0,0,0,0,0};

   public static int global_rating=0;
   public static int global_count=0;
   public static int ratings(int plan1_house,int tplan_house, String plan1, String tplan){
//      System.out.println("\n::::::"+plan1_house+":"+tplan_house+":"+plan1+":"+tplan);
      int ret=3;
      if(tplan.equals("Asc"))return -100;
      boolean first=true;
      int h1=0,h2=0,h3;
      int[] arrs=new int[12];
      if(tplan.equals("Jup")) arrs=juphs;
      if(tplan.equals("Sat")) arrs=saths;
      if(tplan.equals("Mer")) arrs=merhs;
      if(tplan.equals("Ket")) arrs=keths;
      if(tplan.equals("Ven")) arrs=venhs;
      if(tplan.equals("Sun")) arrs=sunhs;
      if(tplan.equals("Moo")) arrs=moohs;
      if(tplan.equals("Mar")) arrs=marhs;
      if(tplan.equals("Rah")) arrs=rahhs;
      for(int i=0;i<12;i++){
         if(arrs[i]>0 && first) {h1=i-plan1_house+2; first=false;}
         if(arrs[i]>0 && !first) h2=i-plan1_house+2;
         if(h1<=0) h1+=12;
         if(h2<=0) h2+=12;
      } 
      int diff=tplan_house-plan1_house;
      if(diff<0)diff+=12;
      h3=diff+1;
 //     System.out.println(">>>>>>"+h1+":"+h2+":"+h3+":"+arrs[0]);
      int mal=0,ben=0;
      if(plan1.equals("Sat")||plan1.equals("Mar") || plan1.equals("Rah")|| plan1.equals("Ket"))
         mal=-1;
      else ben=1;
      if(h3==1 || h3==2 || h3==4 || h3 ==5 || h3==7 || h3==9 || h3==10 || h3==11 )
      {
           if(h1 ==6 || h1 ==8 )ret=ret+mal-1;
           else ret=ret+ben+1;
           if(h2 ==6 || h2 ==8 )ret=ret+mal-1;
           else ret=ret+ben+1;
      }
      else if( h3==6 || h3 ==12  )
      {
         if((h1 != 8)&& (h1 != 6) && (h1 !=12) && (h1 !=3))
           ret=ret-ben-1;
         else ret=ret-mal+1;
         
         if((h2 != 8)&& (h2 != 6) && (h2 !=12) && (h2 !=3))
           ret=ret-ben-1;
         else ret=ret-mal+1;
      }
      else if( h3==8   )
      {
         if((h1 != 8)&& (h1 != 6) && (h1 !=12) )
           ret=ret-ben-2;
         else ret=ret-ben-mal+1;
         if((h2 != 8)&& (h2 != 6) && (h2 !=12) )
           ret=ret-ben-2;
         else ret=ret-ben-mal+1;
         if((h1 == 3)|| (h2 == 3) )
           ret=ret-ben-1;
      }
    global_rating+=ret;
    global_count++;
    return ret;
  }
 
}     
/*      int mul9=1,mul8=1,mul=1;
      if(tplan.equals("Jup")){
          switch(diff){
             case 0: ret=4; break;
             case 1: ret=3; break;
             case 2: ret=2; break;
             case 3: ret=3; break;
             case 4: ret=4; break;
             case 5: ret=2; break;
             case 6: ret=3; break;
             case 7: ret=1;mul8=2; break;
             case 8: ret=3;mul9=2; break;
             case 9: ret=3; break;
             case 10: ret=4; break;
             case 11: ret=2; break;
          }
         if(tplan_house==4)ret=ret+mul;
         if(tplan_house==10)ret=ret-mul;
      }
   }
   public static int applyFilter(String plan, int diff, int exal){
     if(plan.equals("Jup")||plan.equals("Sun")){
        if(diff==7) return -1; 
     } 
   }
}
*/
