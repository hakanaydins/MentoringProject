public class sena {
    public static void main(String[] args) {
        System.out.println("merhaba sena");
        //task2->
         /*
         metin=”Python öğrenilmesi kolay bir programlama dilidir.”
 Yukarıdaki metni harf harf alt alta yazdırınız
 Yukarıdaki metinde yer alan sesli harflerin sayısını bulunuz.
 Yukarıdaki metni for döngüsü ile tersine çeviriniz
         */


        System.out.println("Python öğrenilmesi kolay bir programlama dilidir. ");

        String metin = "Python öğrenilmesi kolay bir programlama dilidir. ";

        String tersstr = "";

        int metinuzunluk = metin.length() - 1;
        for (int i = metinuzunluk; i >= 0; i--) {
            tersstr += metin.charAt(i);
        }
        System.out.println("girilen ifadenin tersi : " + tersstr);
        for (int i = 0; i <= metinuzunluk; i++) {
            System.out.println((metin.charAt(i)));

        }
        String harf = "aeıioöuü";
        int sayac = 0;
        String sesli = String.valueOf('a');
        for (int i = 0; i <= metinuzunluk; i++) {
            for (int j = 0; j <= sesli.length(); j++) {


                if (metin.charAt(i) == harf.charAt(j)) {
                    sayac++;
                }
            }




        }

        System.out.print(sayac);


    }
}
