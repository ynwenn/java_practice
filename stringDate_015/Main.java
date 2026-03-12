package stringDate_15;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        if (s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
        }
        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3はケースを区別しなければ等しい");
        }
        System.out.println("s1の長さは" + s1.length() + "です");
        if (s1.isEmpty()) {
            System.out.println("s1は空文字です");
        }

        String s4 = "Java and JavaScript";
        if (s4.contains("Java")) {
            System.out.println("文字列s4は、Javaを含んでいます");
        }
        if (s4.endsWith("Java")) {
            System.out.println("文字列s4は、Javaが末尾にあります");
        }
        System.out.println("文字列s4で最初にJavaが登場する位置は" + s4.indexOf("Java"));
        System.out.println("文字列s4で最後にJavaが登場する位置は" + s4.lastIndexOf("Java"));


        String s5 = "Java programming";
        System.out.println("文字列s5の4文字目以降は" + s5.substring(3));
        // ⇒ a programming
        System.out.println("文字列s5の4～8文字目は" + s5.substring(3,8));
        // ⇒ a pro


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("Java");
        }
        String s = sb.toString();
        System.out.println(s);


        long start = System.currentTimeMillis();
        //時間がかかる処理
        long end = System.currentTimeMillis();
        System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");


        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1694984000000L);
        System.out.println(past);

        Calendar c = Calendar.getInstance();
        c.set(2023,8,18,5,53,20);
        c.set(Calendar.MONTH,9);
        Date d = c.getTime();
        System.out.println(d);
        Date now1 = new Date();
        c.setTime(now1);
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は" + y + "年です");


        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d1 = f.parse("2023/09/18 05:53:20");
        System.out.println(d1);
        Date now2 = new Date();
        String s6 = f.format(now2);
        System.out.println("現在は" + s6 + "です");


        Instant i1 = Instant.now();
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        long l = i2.toEpochMilli();

        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.of(2023, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
        System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
        if (z2.isEqual(z3)) {
            System.out.println("これらは同じ瞬間を指しています");
        }


        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.of(2024, 1, 1, 9, 5, 0, 0);

        ZonedDateTime z4 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z4.toLocalDateTime();


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate = LocalDate.parse("2023/09/22", fmt);

        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println("1000日後は" + str);

        LocalDate now3 = LocalDate.now();
        if (now3.isAfter(ldatep)) {
            System.out.println("本日は、その日より未来です。");
        }


        LocalDate d2 = LocalDate.of(2023,1,1);
        LocalDate d3 = LocalDate.of(2023,1,4);

        Period p1 = Period.ofDays(3);
        Period p2 = Period.between(d2,d3);

        LocalDate d4 = d3.plus(p2);





        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb1.append(i+1).append(",");
        }
        String s11 = sb1.toString();
        String[] a = s11.split(",");


        public String concatPath(String folder, String file) {
            if (!folder.endsWith("\\")) {
                folder += "\\";
            }
            return folder + file;
        }


        s.matches(".*");
        s.matches("A\\d{1,2}");
        s.matches("U[A-Z]{3}");


        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        int day = c.get(Calendar.DAY_OF_MONTH);
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        Date future = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));


        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(100);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(future.format(fmt));
    }
}
