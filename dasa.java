import java.io.*;
import java.util.*;
import java.text.*;
public class dasa{

  static String[] plans;
  static float[] pli;
  static float mul=1;
  static int trunc=100000;
  static int rowcnt=0;
  static PrintStream pw=System.out;

  public static void main(String args[]) throws Exception{
   rowcnt=0;
   plans=new String[]{"Ket","Ven","Sun","Moo","Mar","Rah","Jup","Sat","Mer","Ket","Ven","Sun","Moo","Mar","Rah","Jup","Sat","Mer"};
   //plans=new String[]{"Ketu","Venus","Sun","Moon","Mars","Rahu","Jupiter","Saturn","Mercury","Ketu","Venus","Sun","Moon","Mars","Rahu","Jupiter","Saturn","Mercury"};
   pli=new float[]{7,20,6,10,7,18,16,19,17,7,20,6,10,7,18,16,19,17};
   int deg=Integer.parseInt(args[0]);
    int min=Integer.parseInt(args[1]);
    int sec=Integer.parseInt(args[2]);
    int depth=3;
    String day=args[3];
    if(args.length>4)mul=Float.parseFloat(args[4]);
    if(args.length>5)depth=Integer.parseInt(args[5]);
    if(args.length>6)trunc=Integer.parseInt(args[6]);
    for(int i=0;i<pli.length;i++) pli[i]*=mul;
    int tot=deg*3600+min*60+sec;
    tot=tot%(120*3600);
    int start=0;
    if(tot>=(0*(13*3600+20*60)) && tot<(13*3600+20*60))
      start=0;
    else if(tot>=(1*(13*3600+20*60)) && tot<(2*(13*3600+20*60)))
      start=1;
    else if(tot>=(2*(13*3600+20*60)) && tot<(3*(13*3600+20*60)))
      start=2;
    else if(tot>=(3*(13*3600+20*60)) && tot<(4*(13*3600+20*60)))
      start=3;
    else if(tot>=(4*(13*3600+20*60)) && tot<(5*(13*3600+20*60)))
      start=4;
    else if(tot>=(5*(13*3600+20*60)) && tot<(6*(13*3600+20*60)))
      start=5;
    else if(tot>=(6*(13*3600+20*60)) && tot<(7*(13*3600+20*60)))
      start=6;
    else if(tot>=(7*(13*3600+20*60)) && tot<(8*(13*3600+20*60)))
      start=7;
    else if(tot>=(8*(13*3600+20*60)) && tot<(9*(13*3600+20*60)))
      start=8;

    int ndeg=tot %(13*3600+20*60);
//    int rem=(13*3600+20*60)-ndeg;
    float perc=(float)ndeg/(13*3600+20*60);
    float st=-1*perc*pli[start];
    pw.println("percentage="+perc);
   // Thread.sleep(3000);

   try{
    print(plans[start],depth,0,120*mul,st,day,"");
   }catch(Exception e){
   }
    //pw.close();

  }

  static void print(String pla, int level, int curlevel, float dur,float  st, String day, String app){
     if(rowcnt>trunc) throw new RuntimeException("a");
    float inc=0.0F;
    int beg=0;
    for(int i=0;i<9;i++)
      if(pla.equals(plans[i]))beg=i;
  
     for(int j=0;j<9;j++){ 
      inc=st+dur*pli[beg+j]/(120*mul);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	Calendar c = Calendar.getInstance();
	Calendar c2 = Calendar.getInstance();
	try{
	   c.setTime(sdf.parse(day));
	   c2.setTime(sdf.parse(day));
	}catch(Exception e){
		e.printStackTrace();
	 }
         long mil1=c.getTimeInMillis();
         long mil2=c2.getTimeInMillis();
         long ad=(long)(st*365.2425*24*3600*1000);	   
         long ad2=(long)(inc*365.2425*24*3600*1000);	   
	c.setTime(new Date(mil1+ad));    
	c2.setTime(new Date(mil2+ad2));    
	String newDate = sdf.format(c.getTime());    
	String newDate2 = sdf.format(c2.getTime());    
/*
         int ad=(int)(st*365.25);	   
         int ad2=(int)(inc*365.25);	   
	//c.add(Calendar.DAY_OF_MONTH, ad);  
	c.add(Calendar.SECOND, ad);  
	c2.add(Calendar.SECOND, ad2);  
	String newDate = sdf.format(c.getTime());    
	String newDate2 = sdf.format(c2.getTime());    
*/

      if(inc>0){
        for(int i=0;i<curlevel;i++) pw.print("    ");  
        //pw.println(plans[beg+j]+"  "+newDate+":"+newDate2+"  * ("+round(st,3)+"-"+round(inc,3) +") ");
        pw.println(plans[beg+j]+"  ("+round(st,3)+"-"+round(inc,3) +") * "+newDate+":"+newDate2+"  "+app);
        rowcnt++;
        
      }
      if(curlevel<level) print (plans[beg+j], level,curlevel+1,dur*pli[beg+j]/(120*mul), st,day, app+":"+plans[beg+j]);
      st=inc;
      //sday=newDate;
     }

    }
    
public static float round(float value, int places) {
    float scale = (float)Math.pow(10, places);
    return Math.round(value * scale) / scale;
}

}
   /*
 if(pla.equals("Ketu")){
       inc=st+dur*7/120;
    } else if (pla.equals("Venus")){
       inc=st+dur*20/120;
    } else if (pla.equals("Sun")){
       inc=st+dur*6/120;
    } else if (pla.equals("Moon")){
       inc=st+dur*10/120;
    } else if (pla.equals("Mars")){
       inc=st+dur*7/120;
    } else if (pla.equals("Rahu")){
       inc=st+dur*18/120;
    } else if (pla.equals("Jupiter")){
       inc=st+dur*16/120;
    } else if (pla.equals("Saturn")){
       inc=st+dur*19/120;
    } else if (pla.equals("Mercury")){
       inc=st+dur*17/120;
    }
*/
      /*inc=st+dur*pli[beg+1]/120;
      for(int i=0;i<curlevel;i++) pw.print("  ");  
      pw.println(plans[beg+1]+" "+st+"-"+inc);
      if(curlevel<level) print (plans[beg+1], level,curlevel+1,inc, st);
      st=inc;
      inc=st+dur*pli[beg+2]/120;
      for(int i=0;i<curlevel;i++) pw.print("  ");  
      pw.println(plans[beg+2]+" "+st+"-"+inc);
      if(curlevel<level) print (plans[beg+2], level,curlevel+1,inc, st);
      st=inc;
      inc=st+dur*pli[beg+3]/120;
      for(int i=0;i<curlevel;i++) pw.print("  ");  
      pw.println(plans[beg+3]+" "+st+"-"+inc);
      if(curlevel<level) print (plans[beg+3], level,curlevel+1,inc, st);
      st=inc;
      inc=st+dur*pli[beg+4]/120;
      for(int i=0;i<curlevel;i++) pw.print("  ");  
      pw.println(plans[beg+4]+" "+st+"-"+inc);
      if(curlevel<level) print (plans[beg+4], level,curlevel+1,inc, st);
      st=inc;
      inc=st+dur*pli[beg+5]/120;
      for(int i=0;i<curlevel;i++) pw.print("  ");  
      pw.println(plans[beg+5]+" "+st+"-"+inc);
      if(curlevel<level) print (plans[beg+5], level,curlevel+1,inc, st);
      st=inc;
      inc=st+dur*pli[beg+6]/120;
      for(int i=0;i<curlevel;i++) pw.print("  ");  
      pw.println(plans[beg+6]+" "+st+"-"+inc);
      if(curlevel<level) print (plans[beg+6], level,curlevel+1,inc, st);
      st=inc;
      inc=st+dur*pli[beg+7]/120;
      for(int i=0;i<curlevel;i++) pw.print("  ");  
      pw.println(plans[beg+7]+" "+st+"-"+inc);
      if(curlevel<level) print (plans[beg+7], level,curlevel+1,inc, st);
      st=inc;
      inc=st+dur*pli[beg+8]/120;
      for(int i=0;i<curlevel;i++) pw.print("  ");  
      pw.println(plans[beg+8]+" "+st+"-"+inc);
      if(curlevel<level) print (plans[beg+8], level,curlevel+1,inc, st);
     */
