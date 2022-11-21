package depot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {


        static List<String> urunIsmi= new ArrayList<>();
        static List<String>  uretici= new ArrayList<>();
        static List<String>  birim= new ArrayList<>();
        static List<Integer> urunId=new ArrayList<>();
        static  List<Integer> urunMiktari=new ArrayList<>();
        static List<Integer> rafNo=new ArrayList<>();


        public static void main(String[] args) {


            islemSecimi();
            //  urunTanimlama();
            // urunListele();
            //  urunCikisi();
            // urunuRafaKoy();
            //  urunGirisi();


        }

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



            Scanner input =new Scanner(System.in);

            System.out.println("Urun ismini giriniz: ");
            urunIsmi.add(input.next());
            System.out.println("Uretici adini giriniz: ");
            uretici.add(input.next());
            System.out.println("Urunun birimini giriniz: ");
            birim.add(input.next());
            System.out.println("Urun Id'sini giriniz: ");
            urunId.add(input.nextInt());

        }

        public static void urunListele(){

            for (int i=0;i<urunId.size();i++){

                System.out.println("Urun ID: "+urunId.get(i)+"\nUrun adi: "+urunIsmi.get(i)+"\nUretici adi: "+uretici.get(i)+"\nUrun Miktari: "+urunMiktari.get(i)+"\nUrunun birimi: "+birim.get(i)+"Urun rafı: "+rafNo.get(i));
            }


        }
        public static void urunGirisi(){


        }
        public static void urunuRafaKoy(){


        }
        public static void urunCikisi(){


        }

    }
