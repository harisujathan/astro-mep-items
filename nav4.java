import java.io.*;
import java.util.*;
import java.text.*;
class nav4{
  static   int cons=0;
  static   boolean FIRST=true;
  public static void main(String args[]) throws Exception{
  
   if(args.length>5 && args[5].equals("all")){ 
     System.out.println("=== 13 20  ====");
     args[1]="13";
     args[2]="20";
     mains(args);
     con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     FIRST=false;
     System.out.println("=== 18 0  ====");
     args[1]="18";
     args[2]="0";
     mains(args);
     con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     System.out.println("=== 24 0  ====");
     args[1]="24";
     args[2]="0";
     mains(args);
     con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     System.out.println("=== 36 0  ====");
     args[1]="36";
     args[2]="0";
     mains(args);
     con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     System.out.println("=== 45 0  ====");
     args[1]="45";
     args[2]="0";
     mains(args);
     con.md=new HashMap<String,Integer>();con.mn=new HashMap<String,Integer>();con.nd=new HashMap<String,Integer>();con.nn=new HashMap<String,Integer>();
     System.out.println("=== 72 0  ====");
     args[1]="72";
     args[2]="0";
     mains(args);
    }else mains(args);
  }
  public static void mains(String args[]) throws Exception{
   float diff=Float.parseFloat(args[0]);
   String nak1=args[1];
   String nak2=args[2];
   String pla=""; 
   if(args.length>3 && !args[3].equals("0")) pla=args[3];
   String skip="";
   if(args.length>4 && args[4].equals("t")) skip="true";
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
    if(args0.equals("ahu")) args0="ah";
    int naa=Integer.parseInt(nak1);
    if(naa==13) cons=9;
    if(naa==18) cons=4;
    if(naa==24) cons=9;
    if(naa==36) cons=2;
    if(naa==45) cons=4;
    if(naa==72) cons=7;
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
//    System.out.println("aaaaaaa"+args0.trim()+":"+(a*3600+b*60+c)+"::"+(i*3600+j*60+k));
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
    nav32.main(st);
    st[0]=""+i;
    st[1]=""+j;
    st[2]=""+k;
    st[3]=mm;
    st[4]=""+args0;
    st[5]=nak1;
    st[6]=nak2;
    nav22.main(st);
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
    System.out.println(br.readLine());
*/
    }
    /*System.out.println(con.md);
    System.out.println(con.mn);
    System.out.println(con.nd);
    System.out.println(con.nn);
*/
  if(!skip.equals("true")){
    System.out.print("D1 deg:");
    pr(con.md,pla);
    //System.out.print("D1 nak:");
    //pr(con.mn,pla);
    System.out.print("D9 deg:");
    pr(con.nd,pla);
    //System.out.print("D9 nak:");
    //pr(con.nn,pla);
    System.out.print("D99 deg:");
    pr(con.nnd,pla);
    System.out.print("D99 houses:");
    pr(con.nnh,pla);
  }
    br.close();
    ArrayList<String> cov=new ArrayList<String>(); 
if(FIRST){
    System.out.println("d1-d9 deg");
    Set<String> keys=con.md.keySet();
    for(String j:keys){
       float f1=(float)con.md.get(j)/3600;
       //System.out.println(j+":::"+(float)con.md.get(j)/3600);
        Set<String> keysn=con.nd.keySet();
      jjj: for(String jn:keysn){
          float f2=(float)con.nd.get(jn)/3600;
      //    System.out.println(jn+":"+(float)con.nd.get(jn)/3600);
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj; 
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);

  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.md.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nd.get(jn)/3600+": 0 "+ii+" "+jj+"  "+con.hs[con.mh.get(j)-1]+"-"+con.hs[con.nh.get(jn)-1]);
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.md.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nd.get(jn)/3600+": 0 "+ii+" "+jj);
      }
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

    System.out.println("d1-d99 deg");
    keys=con.md.keySet();
    for(String j:keys){
       float f1=(float)con.md.get(j)/3600;
       //System.out.println(j+":::"+(float)con.md.get(j)/3600);
        Set<String> keysn=con.nnd.keySet();
      jjj: for(String jn:keysn){
          float f2=(float)con.nnd.get(jn)/3600;
      //    System.out.println(jn+":"+(float)con.nd.get(jn)/3600);
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
          for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj; 
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);

  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.md.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nnd.get(jn)/3600+": 0 "+ii+" "+jj);
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.md.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nnd.get(jn)/3600+": 0 "+ii+" "+jj);
      }
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
//     System.out.println("MMMMMMDDDDD");
    System.out.println("d1-d1 deg");
cov=new ArrayList<String>();
   for(String j:keys){
       float f1=(float)con.md.get(j)/3600;
       //System.out.println(j+":::"+(float)con.md.get(j)/3600);
        Set<String> keysn=con.md.keySet();
       jjj: for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("ahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("ahu")) continue;
          float f2=(float)con.md.get(jn)/3600;
      //    System.out.println(jn+":"+(float)con.md.get(jn)/3600);
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);



  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.md.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.md.get(jn)/3600+": 0 "+ii+" "+jj);
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.md.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.md.get(jn)/3600+": 0 "+ii+" "+jj);
       }
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
    //System.out.println("NNNNNNDDDDD");
    System.out.println("d9-d9 deg");
cov=new ArrayList<String>();
    keys=con.nd.keySet();
   for(String j:keys){
       float f1=(float)con.nd.get(j)/3600;
       //System.out.println(j+":::"+(float)con.nd.get(j)/3600);
        Set<String> keysn=con.nd.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("ahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("ahu")) continue;

          float f2=(float)con.nd.get(jn)/3600;
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.nd.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nd.get(jn)/3600+": 0 "+ii+" "+jj);
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.nd.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nd.get(jn)/3600+": 0 "+ii+" "+jj);
       }
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

    System.out.println("d9-d99 deg");
cov=new ArrayList<String>();
    keys=con.nd.keySet();
   for(String j:keys){
       float f1=(float)con.nd.get(j)/3600;
       //System.out.println(j+":::"+(float)con.nd.get(j)/3600);
        Set<String> keysn=con.nnd.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("ahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("ahu")) continue;

          float f2=(float)con.nnd.get(jn)/3600;
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.nd.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nnd.get(jn)/3600+": 0 "+ii+" "+jj);
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.nd.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nnd.get(jn)/3600+": 0 "+ii+" "+jj);
       }
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
   }

    System.out.println("d99-d99 deg");
cov=new ArrayList<String>();
    keys=con.nnd.keySet();
   for(String j:keys){
       float f1=(float)con.nnd.get(j)/3600;
       //System.out.println(j+":::"+(float)con.nnd.get(j)/3600);
        Set<String> keysn=con.nnd.keySet();
    jjj:   for(String jn:keysn){
          if(jn.equals(j)) continue;
          if(jn.equals("ahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("ahu")) continue;

          float f2=(float)con.nnd.get(jn)/3600;
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.nnd.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nnd.get(jn)/3600+": 0 "+ii+" "+jj);
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.nnd.get(j)/3600+"---");
          System.out.println(jn+":"+(float)con.nnd.get(jn)/3600+": 0 "+ii+" "+jj);
       }
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
}

} //all
    
   System.out.println("NAKSHATRA MEP");
    System.out.println("d1-d9 nak");
cov=new ArrayList<String>();
   Set<String> keyz=con.mn.keySet();
    for(String j:keyz){
       if(j.equals("ahh") || j.length()>3) continue;
       float f1=(float)con.mn.get(j)/3600;
       String jh=j+"h";
//       System.out.println(j+con.mn.get("Juph")+":"+jh+":");
       int hf1=con.mn.get(jh);
        Set<String> keysn=con.nn.keySet();
jjj:       for(String jn:keysn){
       if(jn.equals("ahh") || jn.length()>3) continue;
          float f2=(float)con.nn.get(jn)/3600;
          int hf2=con.nn.get(jn+"h");
      //    System.out.println(jn+":"+(float)con.nn.get(jn)/3600);
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.mn.get(j)/3600+"---");
         if(hf2-hf1>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1)%12+1)+"#"+((hf1-hf2-cons+36)%12+1));
         else if(hf1-hf2>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf1-hf2)%12+1)+"#"+((hf2-hf1-cons+36)%12+1));
         else
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.mn.get(j)/3600+"---");
         if(hf2-hf1>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1)%12+1)+"#"+((hf1-hf2-cons+36)%12+1));
         else if(hf1-hf2>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf1-hf2)%12+1)+"#"+((hf2-hf1-cons+36)%12+1));
         else
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
       }

}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

    System.out.println("d1-d99 nak");
cov=new ArrayList<String>();
    keyz=con.mn.keySet();
    for(String j:keyz){
       if(j.equals("ahh") || j.length()>3) continue;
       float f1=(float)con.mn.get(j)/3600;
       String jh=j+"h";
//       System.out.println(j+con.mn.get("Juph")+":"+jh+":");
       int hf1=con.mn.get(jh);
        Set<String> keysn=con.nnn.keySet();
jjj:       for(String jn:keysn){
       if(jn.equals("ahh") || jn.length()>3) continue;
          float f2=(float)con.nnn.get(jn)/3600;
//          int hf2=con.nn.get(jn+"h");
      //    System.out.println(jn+":"+(float)con.nn.get(jn)/3600);
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.mn.get(j)/3600+"---");
            System.out.println(jn+":"+(float)con.nnn.get(jn)/3600+": 0 "+ii+" "+jj);
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.mn.get(j)/3600+"---");
            System.out.println(jn+":"+(float)con.nnn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
       }

}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }
//     System.out.println("MMMMMMNNNNNN");
    System.out.println("d1-d1 nak");
cov=new ArrayList<String>();

    for(String j:keyz){
       if(j.equals("ahh") || j.length()>3) continue;
       float f1=(float)con.mn.get(j)/3600;
       int hf1=con.mn.get(j+"h");
        Set<String> keysn=con.mn.keySet();
jjj:       for(String jn:keysn){
       if(jn.equals("ahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("ahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("ahu")) continue;

          float f2=(float)con.mn.get(jn)/3600;
          int hf2=con.nn.get(jn+"h");
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);


  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.mn.get(j)/3600+"---");
         if(hf2-hf1>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1)%12+1)+"#"+((hf1-hf2-cons+36)%12+1));
         else if(hf1-hf2>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf1-hf2)%12+1)+"#"+((hf2-hf1-cons+36)%12+1));
         else
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");

//          System.out.println(jn+":"+(float)con.mn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.mn.get(j)/3600+"---");
         if(hf2-hf1>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1)%12+1)+"#"+((hf1-hf2-cons+36)%12+1));
         else if(hf1-hf2>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf1-hf2)%12+1)+"#"+((hf2-hf1-cons+36)%12+1));
         else
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
       }
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

//    System.out.println("NNNNNNNN-NNNN");
    System.out.println("d9-d9 nak");
cov=new ArrayList<String>();
    keyz=con.nn.keySet();

    for(String j:keyz){
       if(j.equals("ahh") || j.length()>3) continue;
       float f1=(float)con.nn.get(j)/3600;
       int hf1=con.mn.get(j+"h");
        Set<String> keysn=con.nn.keySet();
jjj:       for(String jn:keysn){
       if(jn.equals("ahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("ahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("ahu")) continue;

          float f2=(float)con.nn.get(jn)/3600;
          int hf2=con.nn.get(jn+"h");
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);

  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.nn.get(j)/3600+"---");
         if(hf2-hf1>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1)%12+1)+"#"+((hf1-hf2-cons+36)%12+1));
         else if(hf1-hf2>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf1-hf2)%12+1)+"#"+((hf2-hf1-cons+36)%12+1));
         else
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.nn.get(j)/3600+"---");
         if(hf2-hf1>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1)%12+1)+"#"+((hf1-hf2-cons+36)%12+1));
         else if(hf1-hf2>0)
          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf1-hf2)%12+1)+"#"+((hf2-hf1-cons+36)%12+1));
         else
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
       }

//          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

    System.out.println("d9-d99 nak");
cov=new ArrayList<String>();
    keyz=con.nn.keySet();

    for(String j:keyz){
       if(j.equals("ahh") || j.length()>3) continue;
       float f1=(float)con.nn.get(j)/3600;
        Set<String> keysn=con.nnn.keySet();
jjj:       for(String jn:keysn){
       if(jn.equals("ahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("ahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("ahu")) continue;

          float f2=(float)con.nnn.get(jn)/3600;
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);

  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.nn.get(j)/3600+"---");
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.nn.get(j)/3600+"---");
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
       }

//          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

    System.out.println("d99-d99 nak");
cov=new ArrayList<String>();
    keyz=con.nnn.keySet();

    for(String j:keyz){
       if(j.equals("ahh") || j.length()>3) continue;
       float f1=(float)con.nnn.get(j)/3600;
        Set<String> keysn=con.nnn.keySet();
jjj:       for(String jn:keysn){
       if(jn.equals("ahh") || jn.length()>3) continue;
         if(jn.equals(j)) continue;
          if(jn.equals("ahu")&&j.equals("Ketu")) continue;
          if(jn.equals("Ketu")&&j.equals("ahu")) continue;

          float f2=(float)con.nnn.get(jn)/3600;
          if(Math.abs(f2-f1)<diff)
          {
          float f3=Math.abs(f2-f1);
          int ii=((int)(f3*3600))/60;
          int jj=((int)(f3*3600))-ii*60;
 for(String _co: cov){
           //if(_co.contains(j) && _co.contains(jn)) continue jjj;
           if(_co.contains(j) && _co.contains(jn) && (!j.equals(jn))) continue jjj;
          }
          cov.add(j+":"+jn);

  if(!j.contains("ah")|| !jn.contains("Ket")){
      if(pla.length()==0){
       System.out.print(j+":::"+(float)con.nn.get(j)/3600+"---");
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
      }else if(pla.equals(j)|| pla.equals(jn)){
       System.out.print(j+":::"+(float)con.nn.get(j)/3600+"---");
            System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##1#1");
       }

//          System.out.println(jn+":"+(float)con.nn.get(jn)/3600+": 0 "+ii+" "+jj+"##"+((hf2-hf1+36)%12+1));
}
          //System.out.println("DIFF:"+Math.abs(f2-f1));
          }
       }
    }

  }

  static void pr2(HashMap<String,Integer> a,String pla){
      Set<String> keys=a.keySet();
      System.out.print("{");
      for(String aa:keys){ if(aa.equals("ahh"))  System.out.print(" "+aa+":"+a.get(aa)+","); else if(aa.length()==3 || aa.equals("ah")) System.out.print(" "+aa+":"+((float)a.get(aa))+","); else  System.out.print(" "+aa+":"+a.get(aa)+",");}
      //for(String aa:keys){ if(aa.equals("ahh"))  System.out.print(" "+aa+":"+a.get(aa)+","); else if(aa.length()==3 || aa.equals("ah")) System.out.print(" "+aa+":"+((float)a.get(aa))+","); else  System.out.print(" "+aa+":"+((float)a.get(aa))+",");}
      System.out.println("}");
  }
 
  static void pr(HashMap<String,Integer> a,String pla){
      Set<String> keys=a.keySet();
      System.out.print("{");
      for(String aa:keys){ if(aa.equals("ahh"))  System.out.print(" "+aa+":"+a.get(aa)+","); else if(aa.length()==3 || aa.equals("ah")) System.out.print(" "+aa+":"+((float)a.get(aa))/3600+","); else  System.out.print(" "+aa+":"+a.get(aa)+",");}
      //for(String aa:keys){ if(aa.equals("ahh"))  System.out.print(" "+aa+":"+a.get(aa)+","); else if(aa.length()==3 || aa.equals("ah")) System.out.print(" "+aa+":"+((float)a.get(aa))/3600+","); else  System.out.print(" "+aa+":"+((float)a.get(aa))/3600+",");}
      System.out.println("}");
  }
}
