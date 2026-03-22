package second_time.branch_103;
public class Main {
    public static void main(String[] args) {
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(5) + 1;
        switch (fortune) {
            case 1, 2 -> {
                System.out.println("いいね！");
            }
            case 3 -> {
                System.out.println("普通です");
            }
            case 4, 5 -> {
                System.out.println("うーん…");
            }
        }


        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    

         int isHungry = 1;
         String food = "potatoChips";
         System.out.println("こんにちは");
         if (isHungry == 0) {
             System.out.println("お腹がいっぱいです");
         } else {
             System.out.println("はらぺこです");
             System.out.println(food + "をいただきます");
         }
         System.out.println("ごちそうさまでした");


         System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更＞");
         int selected = new java.util.Scanner(System.in).nextInt();
         switch (selected) {
            case 1 -> {
                System.out.println("検索します");
            }
            case 2 -> {
                System.out.println("登録します");
            }
            case 3 -> {
                System.out.println("削除します");
            }
            case 4 -> {
                System.out.println("変更します");
            }
         }


         System.out.println("【数あてゲーム】");
         int ans = new java.util.Random().nextInt(10);
         for (int i = 0; i < 5; i++) {
            System.out.println("0～9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("アタリ！");
            } else {
                System.out.println("違います");
            }
         }
         System.out.println("ゲームを終了します");
    }
}
