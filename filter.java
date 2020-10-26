import java.io.*;
import java.util.*;

public class filter {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("dasas.html")));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("dasasFilter.html")));
        String yr1 = args[0];
        String yr2 = args[1];
        int year1 = Integer.parseInt(yr1);
        int year2 = Integer.parseInt(yr2);
        String line = "";
        pw.println("<html><body>");
        String buff1 = "", buff2=""; 
        boolean once=false;
        
            int y1=0,y2=0;
        while ((line = br.readLine()) != null) {
            if(line.indexOf("*")>0){
                int k1=line.indexOf("*");
                int k2=line.indexOf("-",k1+1);
                int k3=line.indexOf(":",k2+1);
                int k4=line.indexOf("-",k3+1);
                y1=Integer.parseInt(line.substring(k1+1,k2).trim());
                y2=Integer.parseInt(line.substring(k3+1,k4).trim());
            }
            if(y1<year1 && y2<year1 && line.contains("*")) {buff2="";continue;}
            else if(y1>year2 && y2>year2 && line.contains("*")) {buff2="";continue;}
            if(line.indexOf("<i>")>=0 ){
                buff2+=line+"\n";
                continue;
            }
            else if(line.contains("*") ){
                pw.println(buff2);
                pw.println(line);
                buff2="";
                continue;
            }
            pw.println(line);
        }
        pw.println("</body></html>");
        br.close();
        pw.close();
    }
    
    
}


