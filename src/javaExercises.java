
public class javaExercises {

    public static void main(String[] args) {
		/*double number = 12.5; //THE MOST
		// char character = "A"; // Why it gives an error ?
		boolean existance = true;
		int sayi = 12; //THE MOST
		String city = "Ankara";*/

        int sayi1 = 33;
        int sayi2 = 25;
        int sayi3 = 28;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2 ) {enBuyuk = sayi2;}
        if (enBuyuk < sayi3 ) {enBuyuk = sayi3;}

        System.out.println("En büyük sayı: "+ enBuyuk);
        // SWITCH BLOCK

        String grade = "C";

        switch (grade) {
            case "A" :
                System.out.println( "Perfect, You pass");
                break;
            case "B" :
                System.out.println( "Good, You pass");
                break;
            default : System.out.println("what the fuck? ");
                // FOR
                for(int i=0;i<10;i+=2) {
                    System.out.println(i);
                }
                System.out.println("For Loop ended");
                // WhILE
                int i = 1;
                while(i<10) {
                    System.out.println(i);
                    i+=2;
                }
                System.out.println("While Loop ended");

                // ARRAYS DIZILER
                double[] Mylist = {1.2, 1.5, 4.3, 5.6, 7.0};
                double total = 0;
                double max = Mylist[0];
                for (double number: Mylist) {
                    if (max < number) {
                        max=number;

                    }
                    total = total + number;
                    System.out.println(number);
                }
                System.out.println("Toplam = "+ total);
                System.out.println("En büyük = " + max);
                // 2D ARRAYS
                String[][] Plates = new String[2][2];

                Plates[0][0] = "İstanbul";
                Plates[0][1] = "Bursa";
                Plates[1][0] = "Adana";
                Plates[1][1] = "Gaziantep";

                for(int u = 0; u <= 1 ; u++) {
                    System.out.println("-------------");
                    for(int m = 0; m<=1 ; m++){
                        System.out.println(Plates[u][m]);
                        // STRING KNOWLEDGE
                    }
                }
















        }
    }}
