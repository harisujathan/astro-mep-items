public class Area{
   public static void main(String args[]) throws Exception{
       double arg=Double.parseDouble(args[0]);
       double ht=Math.sqrt(1-arg*arg);
       double deg=Math.acos(arg)/3.141592653589*180;
       double a1=3.141592653589*deg/180;
       double a2=arg*ht;
       double a3=(a1-a2)*2;
       System.out.println("deg="+deg);
       System.out.println("sec="+a1);
       System.out.println("tr="+a2);
       System.out.println("percent="+a3/3.141592653589+"");
   }
}
