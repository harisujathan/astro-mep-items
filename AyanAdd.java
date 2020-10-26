import java.io.*;
import java.util.*;
public class AyanAdd{
   public static void main(String[] args) throws Exception{
      String st=args[0];
      boolean add=true;
      if(st.charAt(0)=='-') {add=false; st=st.substring(1);}
      StringTokenizer stk=new StringTokenizer(st,":");
      int i1=Integer.parseInt(stk.nextToken());
      int j1=Integer.parseInt(stk.nextToken());
      int k1=Integer.parseInt(stk.nextToken());
      float ayan=((float)(i1*3600+j1*60+k1))/3600;
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("b")));
      PrintWriter pw= new PrintWriter(new OutputStreamWriter(new FileOutputStream("bb")));
      String line="";
      while((line=br.readLine())!=null){
         StringTokenizer stk1= new StringTokenizer(line," \t");
         int i2=0,j2=0,k2=0,ho=0;
         String row="";
         if(stk1.hasMoreTokens())row+=stk1.nextToken()+" ";
         if(stk1.hasMoreTokens()) row+=stk1.nextToken()+" ";
         if(stk1.hasMoreTokens()) row+=stk1.nextToken()+" "; 
         if(stk1.hasMoreTokens()) i2=Integer.parseInt(stk1.nextToken()); else {pw.println(line); continue;}
         if(stk1.hasMoreTokens()) j2=Integer.parseInt(stk1.nextToken());
         if(stk1.hasMoreTokens()) k2=Integer.parseInt(stk1.nextToken());
         if(stk1.hasMoreTokens()) ho=Integer.parseInt(stk1.nextToken());
         float deg=(float)(i2*3600+j2*60+k2)/3600+(ho-1)*30;
         float fin=0;
         if(add) fin= deg+ayan; else fin=deg-ayan;
         if(fin<0)fin=360-fin;
         System.out.println(fin+"");
         int ho3=(((int)fin)/30)%12+1; 
         float nfin=fin*9%360;
         int nho3=(((int)nfin)/30)%12+1; 
         fin*=3600;
         int f2=((int)fin)%(30*3600);
         int ii3=f2/3600;
         int jj3=((f2-ii3*3600)/60);
         int kk3=(f2-ii3*3600-jj3*60);
         pw.println(row+" "+ii3+" "+jj3+" "+kk3+" "+ho3+" "+nho3);
      }
     pw.close();
     br.close();
   }
}

