package depot;

import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class Islemler {
    static Scanner input=new Scanner(System.in);
   static HashMap<Integer, Urunler> urunler=new HashMap<>();
   static  int urunId=1000;

        public static void islemSecimi(){
            Scanner input=new Scanner(System.in);

            int giris=0;
            System.out.println("Lütfen yapmak istediğiniz islemi seciniz:\n ");
            while(giris!=6) {

                System.out.println("Urun Tanımlama icin '1' \n Urunleri Listelemek icin '2' \n Urun miktarı girmek icin '3'" +
                        "\n Urunu istenilen rafa koymak icin '4'\n Urun cikisi icin '5' \n Cikis icin '6'ya basiniz");
                giris =input.nextInt();
                switch (giris) {
                    case 1:
                        urunTanimlama();

                        break;
                    case 2:
                        urunListele();

                        break;
                    case 3:
                        urunGirisi();

                        break;
                    case 4:
                        urunuRafaKoy();
                        break;
                    case 5:
                        urunCikisi();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Lütfen Gecerli bir sayi giriniz...");

                }
            }
        }
        public static void urunTanimlama(){


            System.out.println("Urun ismini giriniz: ");

            String urunIsmi=input.nextLine();
            System.out.println("Uretici adini giriniz: ");
            String uretici= input.nextLine();
            System.out.println("Urunun birimini giriniz: ");
            String urunBirimi=input.nextLine();
            System.out.println("Urunun miktarini giriniz: ");
            int urunMiktari=input.nextInt();
            System.out.println("Urun raf numarasını giriniz: ");
            String rafNo=input.nextLine();
            Urunler urunler1 = new Urunler(urunIsmi, uretici, urunBirimi, urunMiktari, rafNo);

            urunler.put(urunId,urunler1);
            urunId++;

        }

        public static void urunListele(){

            System.out.println("******************************URUNLER****************************");
            System.out.println(urunler);



        }
        public static void urunGirisi(){
            System.out.println("alinan urunun id numarasini giriniz");
            int idNo= input.nextInt();
            if (urunler.containsKey(idNo)){
                System.out.println("alinan urun miktarini giriniz");
                int alinanUrun= input.nextInt();
                urunler.get(idNo).setUrunMiktari(urunler.get(idNo).getUrunMiktari()+alinanUrun);
                System.out.println("Urun miktari degismistir Urun Miktari: " +urunler.get(idNo).getUrunMiktari());
            }else System.out.println("Urun envanterde yoktur");


        }
        public static void urunuRafaKoy(){


        }
        public static void urunCikisi(){

            System.out.println("satilan urunun id numarasini giriniz");
            int idNo= input.nextInt();
            if (urunler.containsKey(idNo)){
                System.out.println("satilan urun miktarini giriniz");
                int satilanUrun= input.nextInt();
                urunler.get(idNo).setUrunMiktari(urunler.get(idNo).getUrunMiktari()-satilanUrun);
                System.out.println("Urun miktari degismistir Urun Miktari: " +urunler.get(idNo).getUrunMiktari());
            }else System.out.println("Urun envanterde yoktur");


        }

    }
