import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i+1).append(",");
        }
        String s = sb.toString();
        String[] a = s.split(",");
        for (String n : a) {
            System.out.print(n);
        }
    

        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        int day = c.get(Calendar.DAY_OF_MONTH);
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        Date d = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(d));


        LocalDate now1 = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        LocalDate day1 = now1.plusDays(100);
        String str = day1.format(fmt);
        System.out.println(str);

    }


    public String concatPath(String folder, String file) {
            if (!folder.endsWith("¥¥")) {
                folder += "¥¥";
            }
            return folder + file;
        }
}
