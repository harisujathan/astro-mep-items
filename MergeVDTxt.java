
import java.io.*;
import java.util.*;

public class MergeVDTxt {

    static ArrayList<String> allMepItems;
    static int truncate = 300, lcnt = 0;
    static String rahItem = "rah", ketItem = "ket";

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Meps")));
        String line = "";
        allMepItems = new ArrayList<String>();

        while ((line = br.readLine()) != null) {
            if ((line.indexOf(",") > 0) || (line.indexOf("Nmoo") > 0) || (line.indexOf("Nmer") > 0) || (line.indexOf("Nmar") > 0) || (line.indexOf("Nven") > 0) || (line.indexOf("Njup") > 0) || (line.indexOf("Nrah") > 0) || (line.indexOf("Nsat") > 0)) {
                allMepItems.add(f(line));
            }
        }
        br.close();

        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("DasasR")));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("DasasM")));
        PrintWriter pw1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream("dasas.txt")));
        String fl = "sun";
        String FL2 = "";
        String FL3 = "";
        String buff = "";
        while ((line = br1.readLine()) != null) {
            if (line.startsWith("sun-")) {
                buff = "\n\n" + line;
                buff += "\n" + br1.readLine() + "\n\n";
                pw1.println(buff);
                continue;
            }
            lcnt++;
            if (line.contains("SUN VD")) {
                fl = "sun";
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (line.contains("MOO VD")) {
                fl = "moo";
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (line.contains("MAR VD")) {
                fl = "mar";
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (line.contains("MER VD")) {
                fl = "mer";
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (line.contains("VEN VD")) {
                fl = "ven";
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (line.contains("JUP VD")) {
                fl = "jup";
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (line.contains("SAT VD")) {
                fl = "sat";
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (line.contains("RAH VD")) {
                fl = rahItem;
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (line.contains("KET VD")) {
                fl = ketItem;
                lcnt = 0;
                pw1.println("\n\n");
            }
            if (lcnt > truncate) {
                continue;
            }
            if (line.startsWith("Sun")) {
                FL2 = "Sun";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("Moo")) {

                FL2 = "Moo";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("Mar")) {

                FL2 = "Mar";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("Mer")) {
                FL2 = "Mer";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("Ven")) {
                FL2 = "Ven";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("Jup")) {
                FL2 = "Jup";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("Sat")) {
                FL2 = "Sat";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("Rah")) {
                FL2 = "Rah";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("Ket")) {
                FL2 = "Ket";
                pr(fl, FL2, "0000", pw1, "","1111");
            }
            if (line.startsWith("    Sun")) {
                FL3 = "Sun";
                pr(fl, FL2, "Sun", pw1, "    ","1111");
            } else if (line.startsWith("    Moo")) {
                FL3 = "Moo";
                pr(fl, FL2, "Moo", pw1, "    ","1111");
            } else if (line.startsWith("    Mar")) {
                FL3 = "Mar";
                pr(fl, FL2, "Mar", pw1, "    ","1111");
            } else if (line.startsWith("    Mer")) {
                FL3 = "Mer";
                pr(fl, FL2, "Mer", pw1, "    ","1111");
            } else if (line.startsWith("    Ven")) {
                FL3 = "Ven";
                pr(fl, FL2, "Ven", pw1, "    ","1111");
            } else if (line.startsWith("    Jup")) {
                FL3 = "Jup";
                pr(fl, FL2, "Jup", pw1, "    ","1111");
            } else if (line.startsWith("    Sat")) {
                FL3 = "Sat";
                pr(fl, FL2, "Sat", pw1, "    ","1111");
            } else if (line.startsWith("    Rah")) {
                FL3 = "Rah";
                pr(fl, FL2, "Rah", pw1, "    ","1111");
            } else if (line.startsWith("    Ket")) {
                FL3 = "Ket";
                pr(fl, FL2, "Ket", pw1, "    ","1111");
            }

            if (line.startsWith("        Sun")) {
                pr(fl, FL3, "Sun", pw1, "        ","1111");
            } else if (line.startsWith("        Moo")) {
                pr(fl, FL3, "Moo", pw1, "        ","1111");
            } else if (line.startsWith("        Mar")) {
                pr(fl, FL3, "Mar", pw1, "        ","1111");
            } else if (line.startsWith("        Mer")) {
                pr(fl, FL3, "Mer", pw1, "        ","1111");
            } else if (line.startsWith("        Ven")) {
                pr(fl, FL3, "Ven", pw1, "        ","1111");
            } else if (line.startsWith("        Jup")) {
                pr(fl, FL3, "Jup", pw1, "        ","1111");
            } else if (line.startsWith("        Sat")) {
                pr(fl, FL3, "Sat", pw1, "        ","1111");
            } else if (line.startsWith("        Rah")) {
                pr(fl, FL3, "Rah", pw1, "        ","1111");
            } else if (line.startsWith("        Ket")) {
                pr(fl, FL3, "Ket", pw1, "        ","1111");
            }
            int i = 0;
            String pre = "";
            for (; i < 20; i++) {
                if (line.length() > 0 && line.charAt(i) == ' ') {
                    pre += "";
                } else {
                    break;
                }
            }
            pw1.println("" + pre + line + "");
        }

        lcnt = 0;
        /*while ((line = br2.readLine()) != null) {
            lcnt++;
            if (line.contains("SUN VD")) {
                fl = "sun";
                lcnt = 0;
            }
            if (line.contains("MOO VD")) {
                fl = "moo";
                lcnt = 0;
            }
            if (line.contains("MAR VD")) {
                fl = "mar";
                lcnt = 0;
            }
            if (line.contains("MER VD")) {
                fl = "mer";
                lcnt = 0;
            }
            if (line.contains("VEN VD")) {
                fl = "ven";
                lcnt = 0;
            }
            if (line.contains("JUP VD")) {
                fl = "jup";
                lcnt = 0;
            }
            if (line.contains("SAT VD")) {
                fl = "sat";
                lcnt = 0;
            }
            if (line.contains("RAH VD")) {
                fl = rahItem;
                lcnt = 0;
            }
            if (line.contains("KET VD")) {
                fl = ketItem;
                lcnt = 0;
            }
            if (lcnt > truncate) {
                continue;
            }
            if (line.startsWith("Sun")) {
                FL2 = "Sun";
                pr(fl, FL2, "0000", pw1, "");
            }
            if (line.startsWith("Moo")) {
                FL2 = "Moo";
                pr(fl, FL2, "0000", pw1, "");
            }
            if (line.startsWith("Mar")) {
                FL2 = "Mar";
                pr(fl, FL2, "0000", pw1, "");
            }
            if (line.startsWith("Mer")) {
                FL2 = "Mer";
                pr(fl, FL2, "0000", pw1, "");
            }
            if (line.startsWith("Ven")) {
                FL2 = "Ven";
                pr(fl, FL2, "0000", pw1, "");
            }
            if (line.startsWith("Jup")) {
                FL2 = "Jup";
                pr(fl, FL2, "0000", pw1, "");
            }
            if (line.startsWith("Sat")) {
                FL2 = "Sat";
                pr(fl, FL2, "0000", pw1, "");
            }
            if (line.startsWith("Rah")) {
                FL2 = "Rah";
                pr(fl, FL2, "0000", pw1, "");
            }
            if (line.startsWith("Ket")) {
                FL2 = "Ket";
                pr(fl, FL2, "0000", pw1, "");
            }

            if (line.startsWith("    Sun")) {
                FL3 = "Sun";
                pr(fl, FL2, "Sun", pw1, "    ");
            } else if (line.startsWith("    Moo")) {
                FL3 = "Moo";
                pr(fl, FL2, "Moo", pw1, "    ");
            } else if (line.startsWith("    Mar")) {
                FL3 = "Mar";
                pr(fl, FL2, "Mar", pw1, "    ");
            } else if (line.startsWith("    Mer")) {
                FL3 = "Mer";
                pr(fl, FL2, "Mer", pw1, "    ");
            } else if (line.startsWith("    Ven")) {
                FL3 = "Ven";
                pr(fl, FL2, "Ven", pw1, "    ");
            } else if (line.startsWith("    Jup")) {
                FL3 = "Jup";
                pr(fl, FL2, "Jup", pw1, "    ");
            } else if (line.startsWith("    Sat")) {
                FL3 = "Sat";
                pr(fl, FL2, "Sat", pw1, "    ");
            } else if (line.startsWith("    Rah")) {
                FL3 = "Rah";
                pr(fl, FL2, "Rah", pw1, "    ");
            } else if (line.startsWith("    Ket")) {
                FL3 = "Ket";
                pr(fl, FL2, "Ket", pw1, "    ");
            }

            if (line.startsWith("        Sun")) {
                FL3 = "Sun";
                pr(fl, FL3, "Sun", pw1, "        ");
            } else if (line.startsWith("        Moo")) {
                FL3 = "Moo";
                pr(fl, FL3, "Moo", pw1, "        ");
            } else if (line.startsWith("        Mar")) {
                FL3 = "Mar";
                pr(fl, FL3, "Mar", pw1, "        ");
            } else if (line.startsWith("        Mer")) {
                FL3 = "Mer";
                pr(fl, FL3, "Mer", pw1, "        ");
            } else if (line.startsWith("        Ven")) {
                FL3 = "Ven";
                pr(fl, FL3, "Ven", pw1, "        ");
            } else if (line.startsWith("        Jup")) {
                FL3 = "Jup";
                pr(fl, FL3, "Jup", pw1, "        ");
            } else if (line.startsWith("        Sat")) {
                FL3 = "Sat";
                pr(fl, FL3, "Sat", pw1, "        ");
            } else if (line.startsWith("        Rah")) {
                FL3 = "Rah";
                pr(fl, FL3, "Rah", pw1, "        ");
            } else if (line.startsWith("        Ket")) {
                FL3 = "Ket";
                pr(fl, FL3, "Ket", pw1, "        ");
            }

            int i = 0;
            String pre = "";
            for (; i < 20; i++) {
                if (line.length() > 0 && line.charAt(i) == ' ') {
                    pre += "";
                } else {
                    break;
                }
            }
            pw1.println("" + pre + line + "");
            //pw1.println(""+pre+line);
        }
       */

        pw1.close();
        br1.close();
        br2.close();

    }

    public static String f(String line) {
        String ret = "";
        int i = line.indexOf(",");
        if (i < 0) {
            i = line.indexOf("N");
        }
        if (i < 0) {
            i = line.length();
        }
        ret = " " + line.substring(0, line.indexOf(" ", i + 1));
        ret = ret.replace(":::", ":");
        return ret;
    }

    public static void pr(String fl, String pl1, String pl2, PrintWriter pw, String pref,String pl3) {
        ArrayList<String> dao = new ArrayList<String>();
        ArrayList<String> as = (ArrayList<String>) allMepItems;
        for (String s1 : as) {
                if (!dao.contains(s1.substring(0, 20))) {
                    String a1 = s1.substring(0, 10);
                    String a2 = s1.substring(10);
if ((((a1.contains(pl1) || a1.contains("Asc"))||a1.contains(pl2)) && (a2.contains(pl2) || a2.contains("Asc")|| a2.contains(pl1)))||((a1.contains(pl1) || a1.contains("Asc"))||a1.contains(pl3)) && (a2.contains(pl3) || a2.contains("Asc")|| a2.contains(pl1))) {
                        if ((fl.equals("sun") && s1.contains(",")) || (fl.equals("moo") && s1.contains("Nmoo")) || (fl.equals("mer") && s1.contains("Nmer")) || (fl.equals("mer") && s1.contains("Nmer")) || (fl.equals("mar") && s1.contains("Nmar")) || (fl.equals("ven") && s1.contains("Nven")) || (fl.equals("jup") && s1.contains("Njup")) || (fl.equals("sat") && s1.contains("Nsat"))|| (fl.equals("rah") && s1.contains("Nrah"))|| (fl.equals("ket") && s1.contains("Nket"))) {
                            pw.println("" + pref + "(" + s1.substring(2) + ")");
                            dao.add(s1.substring(0, 20));
                        }
                    }
                }
        }
    }
}
