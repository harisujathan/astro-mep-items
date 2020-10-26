class navd1d4{
       public static int c=0;
    public static void main(String args[]){
       if(args.length<5){
           System.out.println("\n------start D9 navamsa degree and navamsa nakshatra MEP------");
           System.exit(0);
       }
       if(args[0].equals("Sun")) System.out.println("-------D1 nakshatra MEP-----");
//       System.out.println("nav22"+args[0]+":"+args[1]+":"+args[2]+":"+args[3]+":"+args[4]);
       int i=Integer.parseInt(args[0]);
       int j=Integer.parseInt(args[1]);
       int k=Integer.parseInt(args[2]);
       int n=Integer.parseInt(args[3]);
       int n1=Integer.parseInt(args[5]);
       int n2=Integer.parseInt(args[6]);
       c=n1*3600+n2*60;
       int cc=(i*3600+j*60+k)+(n-1)*30*3600;
       int c4d=(cc)%(30*3600);
       int c4n=n;
       if(c4d<((int)(7.5*3600)));
       else if(c4d<15*3600) c4n=(n+3)%12;
       else if(c4d<((int)(22.5*3600))) c4n=(n+6)%12;
       else  c4n=(n+9)%12;
       if(c4n==0)c4n=12;
       c4d=(c4d%((int)(7.5*3600)))*4;
       int c4=c4d+(c4n-1)*30*3600;
       //c4d=(cc*4)%(30*3600);

       int c10d=(cc)%(30*3600);
       int c10n=n;
       if(c10n%2==0)c10n+=8;
       c10n+=c10d/(3*3600);
       c10n%=12;
       if(c10n==0)c10n=12;
       c10d=(c10d%(3*3600))*10; 
       int c10=c10d+(c10n-1)*30*3600;
/*       int ccc=(cc*9)%(360*3600);
       int ccn=(int)(ccc/(30*3600))+1;
*/
       int bal=cc%c;
       int bal4=c4%c;
       int bal10=c10%c;
//       int balnn=ccc%c;
       int h2=(int)cc/c;
       int k1=bal%60;
       int k2=(bal-k1)%3600/60;
       int k3=(bal-k2*60-k1)/3600;
       //System.out.println(args[0]+" "+k3+" "+k2+" "+k1);
       con.mn.put(args[4],bal);
       //con.mn.put(args[4],(k3*3600+k2*60+k1));
 //      con.mnn.put(args[4],(k3*3600+k2*60+k1));
//       con.mn.put(new String(args[4]+"h"),h2);
       con.mh.put(new String(args[4]),n);
       con.n4n.put(new String(args[4]),bal4);
       con.n4h.put(new String(args[4]),c4n);
       con.n4d.put(new String(args[4]),c4d);
       con.n10n.put(new String(args[4]),bal10);
       con.n10h.put(new String(args[4]),c10n);
       con.n10d.put(new String(args[4]),c10d);
    }
}
