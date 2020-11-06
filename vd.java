import java.io.*;
import java.util.*;
public class vd{
     static float sun,moo,mar,mer,ven,jup,sat,rah,ket,asc;
      static String plans[]= new String[]{"Ket","Ven","Sun","Moo","Mar","Rah","Jup","Sat","Mer","Ket","Ven","Sun","Moo","Mar","Rah","Jup","Sat","Mer","Ket","Ven","Sun","Moo","Mar","Rah","Jup","Sat","Mer","Ket","Ven","Sun","Moo","Mar","Rah","Jup","Sat","Mer"};

   public static void main(String args[]) throws Exception{
      String born=args[0];
      String mul=args[1];
      String lev=args[2];
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("b")));
     String line="";
     while((line=br.readLine())!= null){
        StringTokenizer stk= new StringTokenizer(line," \t");
        stk.nextToken();
        stk.nextToken();
        String pla=stk.nextToken();
        int i=Integer.parseInt(stk.nextToken());
        int j=Integer.parseInt(stk.nextToken());
        int k=Integer.parseInt(stk.nextToken());
        int h=Integer.parseInt(stk.nextToken());
        i+=((h-1)*30);
        if(pla.startsWith("Sun"))
          sun=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Moo"))
          moo=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Mar"))
          mar=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Mer"))
          mer=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Ven"))
          ven=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Jup"))
          jup=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Sat"))
          sat=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Rah"))
          rah=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Ket"))
          ket=((float)(i*3600+j*60+k))/3600;
        if(pla.startsWith("Asc")){
          asc=((float)(i*3600+j*60+k))/3600; break;}
     }
     br.close();
      PrintStream pw1= new PrintStream(new FileOutputStream("DasasR"));
      PrintStream pw2= new PrintStream(new FileOutputStream("DasasM"));
      PrintStream pw3= new PrintStream(new FileOutputStream("Meps"));
      nav4.pwr=pw3;
      String ran="0.5"; if(args.length>3) ran=args[3];
      if(args.length>4) MergeVD.truncate=Integer.parseInt(args[4]);
      ///if(args.length>4) MergeVDTxt.truncate=Integer.parseInt(args[4]);
//      nav4.main(new String[]{ran,"13","20","0","t","m","all","d99","d4","grep"});
      nav4.main(new String[]{ran,"13","20","0","t","m","all","d99","grep"});
      pw3.close();


     br = new BufferedReader(new InputStreamReader(new FileInputStream("b")));
     while((line=br.readLine())!= null){
        StringTokenizer stk= new StringTokenizer(line," \t");
        stk.nextToken();
        stk.nextToken();
        String pla=stk.nextToken();
        int i=Integer.parseInt(stk.nextToken());
        int j=Integer.parseInt(stk.nextToken());
        int k=Integer.parseInt(stk.nextToken());
        int h=Integer.parseInt(stk.nextToken());
        i+=((h-1)*30);
        String s1="";
        String s2="";
        dasa2.pw=pw1;
        dasa.pw=pw2;
        String arg[];
        if(pla.startsWith("Sun")){ 
           pr(pw1,30.0);
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" 30 0 "+MergeVD.truncate);
           pw1.println("\n\n  SUN VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,"30","0",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  SUN VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Moo")){ 
           pr(pw1,13.3333333);
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" 13 20 "+MergeVD.truncate);
           pw1.println("\n\n  MOO VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,"13","20",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  MOO VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Mar")){
           pr(pw1,con.Nmar);
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+con.Nmar+" 0 "+MergeVD.truncate);
           pw1.println("\n\n  MAR VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+con.Nmar,"0",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  MAR VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Mer")){ 
           pr(pw1,con.Nmer);
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+con.Nmer+" 0 "+MergeVD.truncate);
           pw1.println("\n\n  MER VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+con.Nmer,"0",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  MER VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Ven")){ 
           pr(pw1,con.Nven);
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+con.Nven+" 0 "+MergeVD.truncate);
           pw1.println("\n\n  VEN VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+con.Nven,"0",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  VEN VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Jup")){ 
           pr(pw1,con.Njup);
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+con.Njup+" 0 "+MergeVD.truncate);
           pw1.println("\n\n  JUP VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+con.Njup,"0",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  JUP VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Sat")){ 
           pr(pw1,con.Nsat);
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+con.Nsat+" 0 "+MergeVD.truncate);
           pw1.println("\n\n  SAT VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+con.Nsat,"0",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  SAT VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Rah")){ 
//           pr(pw1,65.45454545);
           pr(pw1,con.Nrah);
           MergeVD.rahItem="rah";
           ///MergeVDTxt.rahItem="rah";
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+con.Nrah+" 0 "+MergeVD.truncate);
           pw1.println("\n\n  RAH VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+con.Nrah,"0",""+MergeVD.truncate});
           pr(pw2,13.333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  RAH VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev});
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Ket")){ 
           pr(pw1,con.Nket);
           //pr(pw1,65.45454545);
           MergeVD.ketItem="ket";
           ///MergeVDTxt.ketItem="rah";
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+con.Nket+" 0 "+MergeVD.truncate);
           pw1.println("\n\n  KET VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+con.Nket,"0",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  KET VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
        }
        if(pla.startsWith("Asc")){ 
           pr(pw1,13.3333333333);
           pw1.println("\njava dasa2 "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" 13 20 "+MergeVD.truncate);
           pw1.println("\n\n  ASC VD (RATIO)\n--------------"); 
           dasa2.main(new String[]{i+"",j+"",k+"",born,mul,lev,"13","20",""+MergeVD.truncate});
           pr(pw2,13.3333333);
           pw2.println("\njava dasa "+i+" "+j+" "+k+" "+born+" "+mul+" "+lev+" "+MergeVD.truncate);
           pw2.println("\n\n  ASC VD (MOON)\n--------------"); 
           dasa.main(new String[]{i+"",j+"",k+"",born,mul,lev,""+MergeVD.truncate});
           break;
        }
     }
     pw1.close();
     pw2.close();
     br.close();
     MergeVD.main(new String[]{});
     ///MergeVDTxt.main(new String[]{});
   }

public static void pr(PrintStream pw, double f){
   pw.print("\n\nsun-"+plans[(int)(sun/f)]);
   if(((int)(sun/f))!=((int)((sun-0.01)/f)))
      pw.print(", sun also-"+plans[(int)(sun-0.01/f)]);
   pw.print(", moo-"+plans[(int)(moo/f)]);
   if(((int)(moo/f))!=((int)((moo-0.01)/f)))
      pw.print(", moo also-"+plans[(int)(moo-0.01/f)]);
   pw.print(", mar-"+plans[(int)(mar/f)]);
   if(((int)(mar/f))!=((int)((mar-0.01)/f)))
      pw.print(", mar also-"+plans[(int)(mar-0.01/f)]);
   pw.print(", mer-"+plans[(int)(mer/f)]);
   if(((int)(mer/f))!=((int)((mer-0.01)/f)))
      pw.print(", mer also-"+plans[(int)(mer-0.01/f)]);
   pw.print(", ven-"+plans[(int)(ven/f)]);
   if(((int)(ven/f))!=((int)((ven-0.01)/f)))
      pw.print(", ven also-"+plans[(int)(ven-0.01/f)]);
   pw.print(", jup-"+plans[(int)(jup/f)]);
   if(((int)(jup/f))!=((int)((jup-0.01)/f)))
      pw.print(", jup also-"+plans[(int)(jup-0.01/f)]);
   pw.print(", sat-"+plans[(int)(sat/f)]);
   if(((int)(sat/f))!=((int)((sat-0.01)/f)))
      pw.print(", sat also-"+plans[(int)(sat-0.01/f)]);
   pw.print(", rah-"+plans[(int)(rah/f)]);
   if(((int)(rah/f))!=((int)((rah-0.01)/f)))
      pw.print(", rah also-"+plans[(int)(rah-0.01/f)]);
   pw.print(", ket-"+plans[(int)(ket/f)]);
   if(((int)(ket/f))!=((int)((ket-0.01)/f)))
      pw.print(", ket also-"+plans[(int)(ket-0.01/f)]);
   pw.print(", asc-"+plans[(int)(asc/f)]);
   if(((int)(asc/f))!=((int)((asc-0.01)/f)))
      pw.print(", asc also-"+plans[(int)(asc-0.01/f)]);
}

public static float round(float value, int places) {
    float scale = (float)Math.pow(10, places);
    return Math.round(value * scale) / scale;
}

}
