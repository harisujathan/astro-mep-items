class navd9d99{
       public static int c=0;
    public static void main(String args[]){
//System.out.println("nav32"+args[0]+":"+args[1]+":"+args[2]+":"+args[3]+":"+args[4]);

       int i=Integer.parseInt(args[0]);
       int j=Integer.parseInt(args[1]);
       int k=Integer.parseInt(args[2]);
       int n=Integer.parseInt(args[3]);
       int n1=Integer.parseInt(args[5]);
       int n2=Integer.parseInt(args[6]);
       c=n1*3600+n2*60;
       int cc=(i*3600+j*60+k)+(n-1)*30*3600;
       int ccc=(cc*9)%(360*3600);
       int ccd=(cc*9)%(30*3600);
       int ccn=(int)(ccc/(30*3600))+1;
       int bal=cc%c;
       int balnn=ccc%c;
       int h2=(int)cc/c;
       int k1=bal%60;
       int k2=(bal-k1)%3600/60;
       int k3=(bal-k2*60-k1)/3600;
       //System.out.println("::"+bal+"\t"+(k3*3600+k2*60+k1));
       //con.nd.put(args[4],(k3*3600+k2*60+k1));
       con.nd.put(args[4],(i*3600+j*60+k));
       con.nnn.put(args[4],balnn);
       con.nnh.put(args[4],ccn); 
       con.nnd.put(args[4],ccd);
//       con.nn.put(new String(args[4]+"h"),h2);
       con.nn.put(new String(args[4]),bal);
       con.nh.put(new String(args[4]),n);
       //System.out.println("\t"+k3+" "+k2+" "+k1);
       //System.out.println("\t"+k3+" "+k2+" "+k1);
    }
}
