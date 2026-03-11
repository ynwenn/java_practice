package exception_17;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("hello!");
        } catch (IOException e){
            System.out.println("何らかの例外が発生しました");
        } finally {
            if (fw != null) {
             try {
                fw.close();
             } catch (IOException e) {
                ;
             }
            }
        }
        

        try (FileWriter fw1 = new FileWriter("data.txt");) {
            fw1.write("hello!");
        } catch (Exception ex) {
            System.out.println("何らかの例外が発生しました");
        }




        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException例外をcatchしました");
            System.out.println("ーースタックトレース（ここから）ーー");
            npe.printStackTrace();
            System.out.println("ーースタックトレース（ここまで）ーー");
        }


        try {
            int i = Integer.parseInt("三");
            } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException例外をcatchしました");
        }


        public static void main(String[] args) throws IOException {
            System.out.println("プログラムが起動しました");
            throw new IOException();
        }
    }
}
