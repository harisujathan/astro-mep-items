import java.io.*;
import java.util.*;
import java.text.*;
class nav4{
  static   int cons=0;
  static   boolean FIRST=true;
   static boolean grep=false;
   static boolean d10=false;
   static boolean d99=false;
   static boolean d4=false;
   static boolean strict=true; 
   static String skip=""; 
   static boolean all=false; 
   static PrintStream pwr=System.out;
  public static void main(String args[]) throws Exception{
  /* if(args.length>7 && args[7].equals("grep"))
       grep=true;  
   if(args.length>8 && args[8].equals("d10"))
       d10=true;
   if(args.length>9 && args[9].equals("d99"))
       d99=true;
*/
   pre(args);
 
   //if(args.length>5 && (args[5].equals("all"))){ 
   if(all){ 
     pwr.println("=== 13 20  ====");
     args[1]="13";
     args[2]="20";
     mains(args);
     clearMaps();//con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     FIRST=false;
     pwr.println("=== 18 0  ====");
     args[1]=""+con.Nmer;
     args[2]="0";
     mains(args);
     clearMaps();//con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     pwr.println("=== 24 0  ====");
     args[1]=""+con.Nven;
     args[2]="0";
     mains(args);
     con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     pwr.println("=== 36 0  ====");
     args[1]=""+con.Nmar;
     args[2]="0";
     mains(args);
     clearMaps();//con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     pwr.println("=== 60 0  ====");
     args[1]=""+con.Njup;
     args[2]="0";
     mains(args);
     clearMaps();//con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     pwr.println("=== 45 0  ====");
     args[1]=""+con.Nrah;
     args[2]="0";
     mains(args);
     clearMaps();//con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     pwr.println("=== 72 0  ====");
     args[1]=""+con.Nsat;
     args[2]="0";
     mains(args);
    }else mains(args);

   pwr.println(((float)GoodBad.global_rating/GoodBad.global_count)+".");
  }
   static String nakdesc="N";
  public static void mains(String args[]) throws Exception{
   float diff=Float.parseFloat(args[0]);
   String nak1=args[1];
   String nak2=args[2];
   nakdesc="N"+args[1]+"."+args[2];
    switch(Integer.parseInt(nak1)){ case 13: nakdesc="Nmoo";break; case con.Nmer: nakdesc="Nmer";break; case con.Nven: nakdesc="Nven";break; case con.Nmar:  nakdesc="Nmar";break; case con.Njup:  nakdesc="Njup";break; case con.Nrah:  nakdesc="Nrah"; break; case con.Nsat:  nakdesc="Nsat";};
   String pla=""; 
   //if(args.length>3 && !args[3].equals("0") )if( args[3].length() >2) pla=args[3]; else strict=true;
   if(args.length>3 && !args[3].equals("0") ) pla=args[3];
    BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream("b")));
    String line="";
    while((line=br.readLine())!= null){
    if(!line.startsWith("java") || line.length() <20)
       continue;
    StringTokenizer stk=new StringTokenizer(line," ");
    stk.nextToken();
    stk.nextToken();
    String args0=stk.nextToken();
    if(args0.length()>3) args0=args0.substring(0,3);
    if(args0.equals("Rahu")) args0="Rah";
    int naa=Integer.parseInt(nak1);
    if(naa==13) cons=9;
    if(naa==con.Nmer) cons=4;
    if(naa==con.Nven) cons=9;
    if(naa==con.Nmar) cons=2;
    if(naa==con.Njup) cons=4;
    if(naa==con.Nrah) cons=4;
    if(naa==con.Nsat) cons=7;
    String args1=stk.nextToken();
    String args2=stk.nextToken();
    String args3=stk.nextToken();
    int i=Integer.parseInt(args1);
    int j=Integer.parseInt(args2);
    int k=Integer.parseInt(args3);
    con.md.put(args0.trim(), (i*3600+j*60+k));
    int l=((i*3600+j*60+k)%(3*3600+20*60))*9;
    int a=l/3600;
    int b=(l-a*3600)/60;
    int c=(l-a*3600-b*60);
    con.nd.put(args0.trim(),(a*3600+b*60+c));
//    pwr.println("aaaaaaa"+args0.trim()+":"+(a*3600+b*60+c)+"::"+(i*3600+j*60+k));
    String st[] = new String[7];
/*    st[0]="java";
    st[1]="nav3";
 */   st[0]=""+a;
    st[1]=""+b;
    st[2]=""+c;
    String mm=stk.nextToken();
    st[3]=""+stk.nextToken();
    st[4]=""+args0;
    st[5]=nak1;
    st[6]=nak2;
    navd9d99.main(st);
    st[0]=""+i;
    st[1]=""+j;
    st[2]=""+k;
    st[3]=mm;
    st[4]=""+args0;
    st[5]=nak1;
    st[6]=nak2;
    navd1d4.main(st);
    ///st[6]=args[4];
    /*String st[] = new String[5];
    //st[0]="nav3";
    st[0]=""+a;
    st[1]=""+b;
    st[2]=""+c;
    st[3]="";
    st[4]=args[4];*/
 /*
    Runtime rt=Runtime.getRuntime();
    Process p=rt.exec(st);
    p.waitFor();
    InputStream is=p.getInputStream();
    BufferedReader br= new BufferedReader(new InputStreamReader(is));
    pwr.println(br.readLine());
*/
    }
    /*pwr.println(con.md);
    pwr.println(con.mn);
    pwr.println(con.nd);
    pwr.println(con.nn);
*/
  if(!skip.equals("true")){
    pwr.print("D1 houses:");
    prh(con.mh,pla);
    pwr.print("D1 deg:");
    pr(con.md,pla);
    //pwr.print("D1 nak:");
    //pr(con.mn,pla);
    pwr.print("D9 houses:");
    prh(con.nh,pla);
    pwr.print("D9 deg:");
    pr(con.nd,pla);
    //pwr.print("D9 nak:");
    //pr(con.nn,pla);
    pwr.print("D99 houses:");
    prh(con.nnh,pla);
    pwr.print("D99 deg:");
    pr(con.nnd,pla);
    pwr.print("D4 houses:");
    prh(con.n4h,pla);
    pwr.print("D4 deg:");
    pr(con.n4d,pla);
    pwr.print("D10 houses:");
    prh(con.n10h,pla);
    pwr.print("D10 deg:");
    pr(con.n10d,pla);
  }
    br.close();
   String tnd=nakdesc;
   nakdesc=",";
    ArrayList<String> cov=new ArrayList<String>(); 
if(FIRST){
    Set<String> keys=con.md.keySet();
   if(!strict){
    pwr.println("d1-d9 deg");
    for(String j:keys){
       float f1=(float)con.md.get(j)/3600;
       //pwr.println(j+":::"+(float)con.md.get(j)/3600);
        Set<String> keysn=con.nd.keySet();
      jjj: for(String jn:keysn){
          float f2=(float)con.nd.get(jn)/3600;
      //    pwr.println(jn+":"+(float)con.nd.get(jn)/3600);
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj; 
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+""+nak(",",(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nd.get(jn)/3600,con.nh.get(jn))+":"+round((float)con.nd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1] +(grep ? "\t d1-d9,"+h("m n",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nd.get(jn)/3600,con.nh.get(jn))+":"+round((float)con.nd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1]+(grep ? "\t d1-d9,"+h("m n",j,jn):""));
      }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

    if(d10){
    keys=con.md.keySet();
    pwr.println("d1-d10 deg");
    for(String j:keys){
       float f1=(float)con.md.get(j)/3600;
        Set<String> keysn=con.n10d.keySet();
      jjj: for(String jn:keysn){
          float f2=(float)con.n10d.get(jn)/3600;
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj; 
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1] +(grep ? "\t d1-d10,"+h("m n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? "\t d1-d10,"+h("m n10",j,jn):""));
      }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

   if(d10){
    keys=con.nd.keySet();
    pwr.println("d9-d10 deg");
    for(String j:keys){
       float f1=(float)con.nd.get(j)/3600;
        Set<String> keysn=con.n10d.keySet();
      jjj: for(String jn:keysn){
          float f2=(float)con.n10d.get(jn)/3600;
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj; 
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.nd.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1] +(grep ? "\t d9-d10,"+h("n n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.nd.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? "\t d9-d10,"+h("n n10",j,jn):""));
      }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

   if(d99){
    pwr.println("d1-d99 deg");
    keys=con.md.keySet();
    for(String j:keys){
       float f1=(float)con.md.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.md.get(j)/3600);
        Set<String> keysn=con.nnd.keySet();
      jjj: for(String jn:keysn){
          float f2=(float)con.nnd.get(jn)/3600;
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj; 
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? "\t d1-d99,"+h("m nn",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
       //pwr.print(":::"+round(con.nnh.get(jn))+"---");
          pwr.println(jn+nak(",",(float)con.nnd.get(j)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? "\t d1-d99,"+h("m nn",j,jn):""));
      }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

    if(d10 && d99){
    keys=con.nnd.keySet();
    pwr.println("d99-d10 deg");
    for(String j:keys){
       float f1=(float)con.nnd.get(j)/3600;
        Set<String> keysn=con.n10d.keySet();
      jjj: for(String jn:keysn){
          float f2=(float)con.n10d.get(jn)/3600;
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj; 
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1] +(grep ? "\t d99-d10,"+h("nn n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? "\t d99-d10,"+h("nn n10",j,jn):""));
      }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

    }//strict
//     pwr.println("MMMMMMDDDDD");
    pwr.println("d1-d1 deg");
    keys=con.md.keySet();
cov=new ArrayList<String>();
   for(String j:keys){
       float f1=(float)con.md.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.md.get(j)/3600);
        Set<String> keysn=con.md.keySet();
       jjj: for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;
          float f2=(float)con.md.get(jn)/3600;
      //    pwr.println(jn+":"+round((float)con.md.get(jn)/3600);
         // if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);



  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.md.get(j)/3600,con.mh.get(jn))+":"+round((float)con.md.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.mh.get(jn)-1]+(grep ? "\t d1-d1,"+h("m m",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.md.get(j)/3600,con.mh.get(jn))+":"+round((float)con.md.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.mh.get(jn)-1]+(grep ? "\t d1-d1,"+h("m m",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
    //pwr.println("NNNNNNDDDDD");
    pwr.println("d9-d9 deg");
cov=new ArrayList<String>();
    keys=con.nd.keySet();
   for(String j:keys){
       float f1=(float)con.nd.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.nd.get(j)/3600);
        Set<String> keysn=con.nd.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.nd.get(jn)/3600;
         // if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nd.get(jn)/3600,con.nh.get(jn))+":"+round((float)con.nd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1]+(grep ? "\t d9-d9,"+h("n n",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nd.get(jn)/3600,con.nh.get(jn))+":"+round((float)con.nd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1]+(grep ? "\t d9-d9,"+h("n n",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

  if(d99){
  if(!strict){
    pwr.println("d9-d99 deg");
cov=new ArrayList<String>();
    keys=con.nd.keySet();
   for(String j:keys){
       float f1=(float)con.nd.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.nd.get(j)/3600);
        Set<String> keysn=con.nnd.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          //if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          //if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.nnd.get(jn)/3600;
         // if(Math.abs(f2-f1)<diff)
         if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /* for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? "\t d9-d99,"+h("n nn",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? "\t d9-d99,"+h("n nn",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
   }
 }
 }
  if(d99){
    pwr.println("d99-d99 deg");
cov=new ArrayList<String>();
    keys=con.nnd.keySet();
   for(String j:keys){
       float f1=(float)con.nnd.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.nnd.get(j)/3600);
        Set<String> keysn=con.nnd.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.nnd.get(jn)/3600;
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.nnd.get(j)/3600,con.nnh.get(j))+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? "\t d99-d99,"+h("nn nn",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.nnd.get(j)/3600,con.nnh.get(j))+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? "\t d99-d99,"+h("nn nn",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
}
 }

   if(d4){
    pwr.println("d4-d4 deg");
cov=new ArrayList<String>();
    keys=con.n4d.keySet();
   for(String j:keys){
       float f1=(float)con.n4d.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.n4d.get(j)/3600);
        Set<String> keysn=con.n4d.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n4d.get(jn)/3600;
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.n4d.get(j)/3600,con.n4h.get(j))+":::"+round((float)con.n4d.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n4h.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? "\t d4-d4,"+h("n4 n4",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.n4d.get(j)/3600,con.n4h.get(j))+":::"+round((float)con.n4d.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n4h.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? "\t d4-d4,"+h("n4 n4",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
}
 }

  if(!strict && d4){
    pwr.println("d1-d4 deg");
cov=new ArrayList<String>();
    keys=con.md.keySet();
   for(String j:keys){
       float f1=(float)con.md.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.md.get(j)/3600);
        Set<String> keysn=con.n4d.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          //if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          //if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n4d.get(jn)/3600;
         // if(Math.abs(f2-f1)<diff)
         if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /* for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? "\t d1-d4,"+h("m n4",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? "\t d1-d4,"+h("m n4",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
   }
 }



  if(!strict && d4){
    pwr.println("d9-d4 deg");
cov=new ArrayList<String>();
    keys=con.nd.keySet();
   for(String j:keys){
       float f1=(float)con.nd.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.nd.get(j)/3600);
        Set<String> keysn=con.n4d.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          //if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          //if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n4d.get(jn)/3600;
         // if(Math.abs(f2-f1)<diff)
         if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /* for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? "\t d9-d4,"+h("n n4",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? "\t d9-d4,"+h("n n4",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
   }
 }


  if(!strict && d4){
  if(d99){
    pwr.println("d99-d4 deg");
cov=new ArrayList<String>();
    keys=con.nnd.keySet();
   for(String j:keys){
       float f1=(float)con.nnd.get(j)/3600;
       //pwr.println(j+":::"+round((float)con.nnd.get(j)/3600);
        Set<String> keysn=con.n4d.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          //if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          //if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n4d.get(jn)/3600;
         // if(Math.abs(f2-f1)<diff)
         if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /* for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(",",(float)con.nnd.get(j)/3600,con.nnh.get(j))+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? "\t d99-d4,"+h("nn n4",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(",",(float)con.nnd.get(j)/3600,con.nnh.get(j))+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
          pwr.println(jn+nak(",",(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? "\t d99-d4,"+h("nn n4",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
   }
 }

    if(d10 && d4){
    pwr.println("d4-d10 deg");
    keys=con.n4d.keySet();
cov=new ArrayList<String>();
   for(String j:keys){
       float f1=(float)con.n4d.get(j)/3600;
        Set<String> keysn=con.n10d.keySet();
       jjj: for(String jn:keysn){
          if(jn.equals(j)) continue;
          //if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          //if(jn.equals("Ketu")&&j.equals("Rahu")) continue;
          float f2=(float)con.n10d.get(jn)/3600;
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);



  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.n4d.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n4h.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? "\t d4-d10,"+h("n4 n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.n4d.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n4h.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? "\t d4-d10,"+h("n4 n10",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
  }
 }

   if(d10){
    pwr.println("d10-d10 deg");
    keys=con.n10d.keySet();
cov=new ArrayList<String>();
   for(String j:keys){
       float f1=(float)con.n10d.get(j)/3600;
        Set<String> keysn=con.n10d.keySet();
       jjj: for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;
          float f2=(float)con.n10d.get(jn)/3600;
          if((Math.abs(f2-f1)<diff)||(30-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(30-Math.abs(f2-f1)<diff) f3=30-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);



  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.n10d.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n10h.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? "\t d10-d10,"+h("n10 n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.n10d.get(j)/3600,2)+"---");
          pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n10h.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? "\t d10-d10,"+h("n10 n10",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }



} //all
    
   nakdesc=tnd;
   pwr.println("NAKSHATRA MEP");
   Set<String> keyz=con.mn.keySet();
if(!strict){
    pwr.println("d1-d9 nak");
cov=new ArrayList<String>();
    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.mn.get(j)/3600;
       //String jh=j+"h";
//       pwr.println(j+con.mn.get("Juph")+":"+round(jh+":");
      // int hf1=con.mn.get(jh);
        Set<String> keysn=con.nn.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
          float f2=(float)con.nn.get(jn)/3600;
          //int hf2=con.nn.get(jn+"h");
      //    pwr.println(jn+":"+round((float)con.nn.get(jn)/3600);
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nd.get(jn)/3600,con.nh.get(jn))+":"+round((float)con.nd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1]+(grep ? ("\t d1-d9"+nakdesc)+h("m n",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nd.get(jn)/3600,con.nh.get(jn))+":"+round((float)con.nd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1]+(grep ? ("\t d1-d9"+nakdesc)+h("m n",j,jn):""));
       }

}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

    if(d10){
    pwr.println("d1-d10 nak");
   keyz=con.mn.keySet();
cov=new ArrayList<String>();
    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.mn.get(j)/3600;
       //String jh=j+"h";
//       pwr.println(j+con.mn.get("Juph")+":"+round(jh+":");
      // int hf1=con.mn.get(jh);
        Set<String> keysn=con.n10n.keySet();
jjj:       for(String jn:keysn){
      /// if(jn.equals("Rahh") || jn.length()>3) continue;
          float f2=(float)con.n10n.get(jn)/3600;
          //int hf2=con.nn.get(jn+"h");
      //    pwr.println(jn+":"+round((float)con.nn.get(jn)/3600);
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d1-d10"+nakdesc)+h("m n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d1-d10"+nakdesc)+h("m n10",j,jn):""));
       }

}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

  if(d99){
    pwr.println("d1-d99 nak");
cov=new ArrayList<String>();
    keyz=con.mn.keySet();
    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.mn.get(j)/3600;
       //String jh=j+"h";
//       pwr.println(j+con.mn.get("Juph")+":"+round(jh+":");
       //int hf1=con.mn.get(jh);
        Set<String> keysn=con.nnn.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
          float f2=(float)con.nnn.get(jn)/3600;
//          int hf2=con.nn.get(jn+"h");
      //    pwr.println(jn+":"+round((float)con.nn.get(jn)/3600);
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? ("\t d1-d99"+nakdesc)+h("m nn",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? ("\t d1-d99"+nakdesc)+h("m nn",j,jn):""));
       }

}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
  }

   if(d10){
    pwr.println("d9-d10 nak");
   keyz=con.nn.keySet();
cov=new ArrayList<String>();
    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.nn.get(j)/3600;
       //String jh=j+"h";
        Set<String> keysn=con.n10n.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
          float f2=(float)con.n10n.get(jn)/3600;
          //int hf2=con.nn.get(jn+"h");
      //    pwr.println(jn+":"+round((float)con.nn.get(jn)/3600);
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.nd.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d9-d10"+nakdesc)+h("n n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.nd.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d9-d10"+nakdesc)+h("n n10",j,jn):""));
       }

}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

   if(d10 && d4){
    pwr.println("d4-d10 nak");
   keyz=con.n4n.keySet();
cov=new ArrayList<String>();
    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.n4n.get(j)/3600;
       //String jh=j+"h";
        Set<String> keysn=con.n10n.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
          float f2=(float)con.n10n.get(jn)/3600;
          //int hf2=con.nn.get(jn+"h");
      //    pwr.println(jn+":"+round((float)con.nn.get(jn)/3600);
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.n4d.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n4h.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d4-d10"+nakdesc)+h("n4 n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.n4d.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n4h.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d4-d10"+nakdesc)+h("n4 n10",j,jn):""));
       }

}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

    if(d10 && d99){
    pwr.println("d99-d10 nak");
   keyz=con.nnn.keySet();
cov=new ArrayList<String>();
    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.nnn.get(j)/3600;
       //String jh=j+"h";
        Set<String> keysn=con.n10n.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
          float f2=(float)con.n10n.get(jn)/3600;
          //int hf2=con.nn.get(jn+"h");
      //    pwr.println(jn+":"+round((float)con.nn.get(jn)/3600);
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d99-d10"+nakdesc)+h("nn n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d99-d10"+nakdesc)+h("nn n10",j,jn):""));
       }

}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

   }
//     pwr.println("MMMMMMNNNNNN");
    pwr.println("d1-d1 nak");
cov=new ArrayList<String>();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.mn.get(j)/3600;
       //int hf1=con.mn.get(j+"h");
        Set<String> keysn=con.mn.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.mn.get(jn)/3600;
         // int hf2=con.nn.get(jn+"h");
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.md.get(jn)/3600,con.mh.get(jn))+":"+round((float)con.md.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.mh.get(jn)-1]+(grep ? ("\t d1-d1"+nakdesc)+h("m m",j,jn):""));

//          pwr.println(jn+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":"+round((float)con.mn.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.md.get(jn)/3600,con.mh.get(jn))+":"+round((float)con.md.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.mh.get(jn)-1]+(grep ? ("\t d1-d1"+nakdesc)+h("m m",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

//    pwr.println("NNNNNNNN-NNNN");
    pwr.println("d9-d9 nak");
cov=new ArrayList<String>();
    keyz=con.nn.keySet();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.nn.get(j)/3600;
       //int hf1=con.mn.get(j+"h");
        Set<String> keysn=con.nn.keySet();
jjj:       for(String jn:keysn){
      /// if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.nn.get(jn)/3600;
          //int hf2=con.nn.get(jn+"h");
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nd.get(jn)/3600,con.nh.get(jn))+":"+round((float)con.nd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1]+(grep ? ("\t d9-d9"+nakdesc)+h("n n",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nd.get(jn)/3600,con.nh.get(jn))+":"+round((float)con.nd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1]+(grep ? ("\t d9-d9"+nakdesc)+h("n n",j,jn):""));
       }

//          pwr.println(jn+":"+round((float)con.nn.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }


 if(d10){
    pwr.println("d10-d10 nak");
cov=new ArrayList<String>();
    keyz=con.n10n.keySet();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.n10n.get(j)/3600;
       //int hf1=con.mn.get(j+"h");
        Set<String> keysn=con.n10n.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n10n.get(jn)/3600;
          //int hf2=con.nn.get(jn+"h");
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+":::"+round((float)con.n10d.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n10h.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d10-d10"+nakdesc)+h("n10 n10",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+":::"+round((float)con.n10d.get(j)/3600,2)+"---");
            pwr.println(jn+":"+round((float)con.n10d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n10h.get(j)-1]+"-"+con.hs[con.n10h.get(jn)-1]+(grep ? ("\t d10-d10"+nakdesc)+h("n10 n10",j,jn):""));
       }

//          pwr.println(jn+":"+round((float)con.nn.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
 }

  if(d99){
  if(!strict){
    pwr.println("d9-d99 nak");
cov=new ArrayList<String>();
    keyz=con.nn.keySet();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.nn.get(j)/3600;
        Set<String> keysn=con.nnn.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.nnn.get(jn)/3600;
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? ("\t d9-d99"+nakdesc)+h("n nn",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? ("\t d9-d99"+nakdesc)+h("n nn",j,jn):""));
       }

//          pwr.println(jn+":"+round((float)con.nn.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
 }
 }
  
  if(d99){
    pwr.println("d99-d99 nak");
cov=new ArrayList<String>();
    keyz=con.nnn.keySet();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.nnn.get(j)/3600;
        Set<String> keysn=con.nnn.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.nnn.get(jn)/3600;
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.nnd.get(j)/3600,con.nnh.get(j))+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? ("\t d99-d99"+nakdesc)+h("nn nn",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.nnd.get(j)/3600,con.nnh.get(j))+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.nnd.get(jn)/3600,con.nnh.get(jn))+":"+round((float)con.nnd.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.nnh.get(jn)-1]+(grep ? ("\t d99-d99"+nakdesc)+h("nn nn",j,jn):""));
       }

//          pwr.println(jn+":"+round((float)con.nnn.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
  }
  
  if(d4){
    pwr.println("d4-d4 nak");
cov=new ArrayList<String>();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.n4n.get(j)/3600;
        Set<String> keysn=con.n4n.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n4n.get(jn)/3600;
          //int hf2=con.nn.get(jn+"h");
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.n4d.get(j)/3600,con.n4h.get(j))+":::"+round((float)con.n4d.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n4h.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? ("\t d4-d4"+nakdesc)+h("n4 n4",j,jn):""));

//          pwr.println(jn+":"+round((float)con.n4n.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.n4d.get(j)/3600,con.n4h.get(j))+":::"+round((float)con.n4d.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.n4h.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? ("\t d4-d4"+nakdesc)+h("n4 n4",j,jn):""));
       }
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
   }

  if(!strict && d4){
    pwr.println("d1-d4 nak");
cov=new ArrayList<String>();
    keyz=con.mn.keySet();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.mn.get(j)/3600;
        Set<String> keysn=con.n4n.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          //if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          //if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n4n.get(jn)/3600;
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? ("\t d1-d4"+nakdesc)+h("m n4",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.md.get(j)/3600,con.mh.get(j))+":::"+round((float)con.md.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? ("\t d1-d4"+nakdesc)+h("m n4",j,jn):""));
       }

//          pwr.println(jn+":"+round((float)con.nn.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
 }


  if(!strict && d4){
    pwr.println("d9-d4 nak");
cov=new ArrayList<String>();
    keyz=con.nn.keySet();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.nn.get(j)/3600;
        Set<String> keysn=con.n4n.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          ///if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          ///if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n4n.get(jn)/3600;
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? ("\t d9-d4"+nakdesc)+h("n n4",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.nd.get(j)/3600,con.nh.get(j))+":::"+round((float)con.nd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? ("\t d9-d4"+nakdesc)+h("n n4",j,jn):""));
       }

//          pwr.println(jn+":"+round((float)con.nn.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
 }


 if(d99 && d4){
  if(!strict){
    pwr.println("d99-d4 nak");
cov=new ArrayList<String>();
    keyz=con.nnn.keySet();

    for(String j:keyz){
       ///if(j.equals("Rahh") || j.length()>3) continue;
       float f1=(float)con.nnn.get(j)/3600;
        Set<String> keysn=con.n4n.keySet();
jjj:       for(String jn:keysn){
       ///if(jn.equals("Rahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          //if(jn.equals("Rahu")&&j.equals("Ketu")) continue;
          //if(jn.equals("Ketu")&&j.equals("Rahu")) continue;

          float f2=(float)con.n4n.get(jn)/3600;
          //if(Math.abs(f2-f1)<diff)
          if((Math.abs(f2-f1)<diff)||(navd9d99.c-Math.abs(f2-f1))<diff)
          {
          float f3=Math.abs(f2-f1);
          if(navd9d99.c-Math.abs(f2-f1)<diff) f3=navd9d99.c-Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          /*for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }*/
          cov.add(j+":"+jn);

  if(!j.contains("Rah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       pwr.print(" "+j+nak(nakdesc,(float)con.nnd.get(j)/3600,con.nnh.get(j))+":::"+(float)con.nnd.get(j)/3600+"---");
            pwr.println(jn+nak(nakdesc,(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? ("\t d99-d4"+nakdesc)+h("nn n4",j,jn):""));
      }else if(pla.equals(j)|| pla.equals(jn)){
       pwr.print(" "+j+nak(nakdesc,(float)con.nnd.get(j)/3600,con.nnh.get(j))+":::"+round((float)con.nnd.get(j)/3600,2)+"---");
            pwr.println(jn+nak(nakdesc,(float)con.n4d.get(jn)/3600,con.n4h.get(jn))+":"+round((float)con.n4d.get(jn)/3600,2)+": 0 "+ii+" "+jj+"  "+con.hs[con.nnh.get(j)-1]+"-"+con.hs[con.n4h.get(jn)-1]+(grep ? ("\t d99-d4"+nakdesc)+h("nn n4",j,jn):""));
       }

//          pwr.println(jn+":"+round((float)con.nn.get(jn)/3600,2)+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //pwr.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
 }
 }



  }

  static void pr2(HashMap<String,Integer> a,String pla){
      Set<String> keys=a.keySet();
      pwr.print("{");
      for(String aa:keys){ if(aa.equals("Rahh"))  pwr.print(" "+aa+":"+a.get(aa)+","); else if(aa.length()==3 || aa.equals("Rah")) pwr.print(" "+aa+":"+((float)a.get(aa))+","); else  pwr.print(" "+aa+":"+a.get(aa)+",");}
      //for(String aa:keys){ if(aa.equals("Rahh"))  pwr.print(" "+aa+":"+a.get(aa)+","); else if(aa.length()==3 || aa.equals("Rah")) pwr.print(" "+aa+":"+((float)a.get(aa))+","); else  pwr.print(" "+aa+":"+((float)a.get(aa))+",");}
      pwr.println("}");
  }
 
  static void prh(HashMap<String,Integer> a,String pla){
      Set<String> keys=a.keySet();
      pwr.print("{");
      for(String aa:keys){  pwr.print(" "+aa+":"+a.get(aa)+","); }
      pwr.println("}");
  }

  static void pr(HashMap<String,Integer> a,String pla){
      Set<String> keys=a.keySet();
      pwr.print("{");
      for(String aa:keys){ pwr.print(" "+aa+":"+((float)a.get(aa))/3600+","); }
      pwr.println("}");
  }

  public static void clearMaps(){
    con.md=new HashMap<String,Integer>();
    con.mn=new HashMap<String,Integer>();
    con.mh=new HashMap<String,Integer>();
    con.nd=new HashMap<String,Integer>();
    con.nh=new HashMap<String,Integer>();
    con.nn=new HashMap<String,Integer>();
    con.nnd=new HashMap<String,Integer>();
    con.nnh=new HashMap<String,Integer>();
    con.nnn=new HashMap<String,Integer>();
    con.n4d=new HashMap<String,Integer>();
    con.n4n=new HashMap<String,Integer>();
    con.n4h=new HashMap<String,Integer>();
    con.n10d=new HashMap<String,Integer>();
    con.n10n=new HashMap<String,Integer>();
    con.n10h=new HashMap<String,Integer>();
  }

  public static String h(String a, String j, String jn){
    String ret=" ";
     String s1=a.substring(0,a.indexOf(" "));
     String s2=a.substring(a.indexOf(" ")+1);
     int h1=0; float deg=0.0F;
     int h2=0; float deg2=0.0F;
     if(s1.equals("m")){ ret+=con.mh.get(j); deg=con.md.get(j);}
     if(s1.equals("n")) {ret+=con.nh.get(j); deg=con.nd.get(j);}
     if(s1.equals("nn")){ ret+=con.nnh.get(j); deg=con.nnd.get(j);}
     if(s1.equals("n4")){ ret+=con.n4h.get(j);  deg=con.n4d.get(j);}
     if(s1.equals("n10")) {ret+=con.n10h.get(j);  deg=con.n4d.get(j);}
     int i=Integer.parseInt(ret.trim()); h1=i;

     if(s2.equals("m")) {h2=con.mh.get(jn); deg2=con.md.get(jn); ret+="-"+h2;}
     if(s2.equals("n")) {h2=con.nh.get(jn); deg2=con.nd.get(jn); ret+="-"+h2;}
     if(s2.equals("nn")){h2=con.nnh.get(jn); deg2=con.nnd.get(jn); ret+="-"+h2;}
     if(s2.equals("n4")) {h2=con.n4h.get(jn); deg2=con.n4d.get(jn);ret+="-"+h2;}
     if(s2.equals("n10")){h2=con.n10h.get(jn); deg2=con.n10d.get(jn); ret+="-"+h2;}
     //int ii=Integer.parseInt(ret.substring(ret.indexOf("-")+1).trim());
     int iii=(((h2-i+12)%12)+1);
     int iii2=(((i-h2+12)%12)+1);
     float fac=30; 
     if(nakdesc.equals("Nmoo"))  fac=13.333333333F;
     if(nakdesc.equals(","))  fac=30;
     if(nakdesc.equals("Nmer"))  fac=con.Nmer;
     if(nakdesc.equals("Nmar"))  fac=con.Nmar;
     if(nakdesc.equals("Nven"))  fac=con.Nven;
     if(nakdesc.equals("Njup"))  fac=con.Njup;
     if(nakdesc.equals("Nrah"))  fac=65.45454545F;
     //if(nakdesc.equals("Nrah"))  fac=con.Nrah;
     if(nakdesc.equals("Nsat"))  fac=con.Nsat;
     float fdeg=0,fdeg2=0;
     float fdeg3=0,fdeg4=0;
     deg/=3600;deg2/=3600;
     fdeg=(iii-1)*30-deg2+deg;
     fdeg3=(iii-1)*30-deg+deg2;
     fdeg2=(iii2-1)*30-deg+deg2;
     fdeg4=(iii2-1)*30-deg2+deg;
      int m1=(int)(round(fdeg3/fac,2)+0.2);
      int m2=(int)(round(fdeg4/fac,2)+0.2);

 //return ret+" >"+iii + "  !"+(!j.equals("Asc") ?GoodBad.ratings(h2,i,jn,j):"")+" !"+(!jn.equals("Asc") ?GoodBad.ratings(i,h2,j,jn):"");
 return ret+" >"+iii +":"+iii2+ "  !"+round(fdeg3/fac,2)+":"+round(fdeg4/fac,2)+"  :>"+(m2+1)%12+":>"+(m1+1)%12;
 //return ret+" >"+iii +":"+iii2+ "  !"+round(fdeg/fac,2)+":"+round(fdeg2/fac,2)+":"+round(fdeg3/fac,2)+":"+round(fdeg4/fac,2);



  }

public static float round(float value, int places) {
    float scale = (float)Math.pow(10, places);
    return Math.round(value * scale) / scale;
}

 static void pre(String[] args){
    if(args.length>4 ) 
         if(args[4].equals("t")) skip="true";
         else if(args[4].equals("m")) strict=false;
         else if(args[4].equals("d99")) d99=true;
         else if(args[4].equals("d10")) d10=true;
         else if(args[4].equals("d4")) d4=true;
         else if(args[4].equals("all")) all=true;
    if(args.length>5 ) 
         if(args[5].equals("t")) skip="true";
         else if(args[5].equals("m")) strict=false;
         else if(args[5].equals("d99")) d99=true;
         else if(args[5].equals("d10")) d10=true;
         else if(args[5].equals("d4")) d4=true;
         else if(args[5].equals("grep")) grep=true;
         else if(args[5].equals("all")) all=true;
    if(args.length>6 ) 
         if(args[6].equals("t")) skip="true";
         else if(args[6].equals("m")) strict=false;
         else if(args[6].equals("d99")) d99=true;
         else if(args[6].equals("d10")) d10=true;
         else if(args[6].equals("d4")) d4=true;
         else if(args[6].equals("grep")) grep=true;
         else if(args[6].equals("all")) all=true;
    if(args.length>7 ) 
         if(args[7].equals("t")) skip="true";
         else if(args[7].equals("m")) strict=false;
         else if(args[7].equals("d99")) d99=true;
         else if(args[7].equals("d10")) d10=true;
         else if(args[7].equals("d4")) d4=true;
         else if(args[7].equals("grep")) grep=true;
         else if(args[7].equals("all")) all=true;
    if(args.length>8 ) 
         if(args[8].equals("t")) skip="true";
         else if(args[8].equals("m")) strict=false;
         else if(args[8].equals("d99")) d99=true;
         else if(args[8].equals("d10")) d10=true;
         else if(args[8].equals("d4")) d4=true;
         else if(args[8].equals("grep")) grep=true;
         else if(args[8].equals("all")) all=true;
    if(args.length>9 ) 
         if(args[9].equals("t")) skip="true";
         else if(args[9].equals("m")) strict=false;
         else if(args[9].equals("d99")) d99=true;
         else if(args[9].equals("d10")) d10=true;
         else if(args[9].equals("d4")) d4=true;
         else if(args[9].equals("grep")) grep=true;
         else if(args[9].equals("all")) all=true;
    if(args.length>10 ) 
         if(args[10].equals("t")) skip="true";
         else if(args[10].equals("m")) strict=false;
         else if(args[10].equals("d99")) d99=true;
         else if(args[10].equals("d10")) d10=true;
         else if(args[10].equals("d4")) d4=true;
         else if(args[10].equals("grep")) grep=true;
         else if(args[10].equals("all")) all=true;
 }
 
 public static String nak(String nak, float deg, int house){
   float d1=13.33333333F;
   float fd=(house-1)*30+deg;
   String ret="";
//   System.out.println("\n"+nak);
   if(nak.equals(",")) {
     d1=30;
   } else if(nak.equals("Nmer")){
     d1=con.Nmer;  
   } else if(nak.equals("Nmoo")){
     d1=13.333333333F;  
   } else if(nak.equals("Nmar")){
     d1=con.Nmar;  
   } else if(nak.equals("Nven")){
     d1=con.Nven;  
   } else if(nak.equals("Nrah")){
     d1=65.45454545F;  
     //d1=con.Nrah;  
   } else if(nak.equals("Njup")){
     d1=con.Njup;  
   } else if(nak.equals("Nsat")){
     d1=con.Nsat;  
   }
   ret=vd.plans[(int)(fd/d1)];
   return "("+ret+")";
   
 }

}
