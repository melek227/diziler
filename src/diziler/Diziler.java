/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diziler;

/**
 *
 * @author melek
 */
public class Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
     

        /////////////////////////////////////////////////
        String[][]sehirler=new String[3][3];//İki boyutlu diziler üzerinde for döngüsüyle gezinmek
        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="canakkale";
        sehirler[1][0]="ankara";
        sehirler[1][1]="konya";
        sehirler[1][2]="niğde";
        sehirler[2][0]="gaziantep";
        sehirler[2][1]="diyarbakır";
        sehirler[2][2]="maraş";
        
        for(int i=0; i<=2; i++){
            System.out.println("-------------------");
            for(int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }


        String mesaj="   Bugün hava güneşli.   ";
       
        System.out.println("eleman sayısı:"+mesaj.length()); //String ifadenin boyutunu döndürür
        System.out.println("metnin 5.elemanı:"+mesaj.charAt(4)); //string ifadenin 5.karakterini bulmayı sağlar.metinde belli karakterdeki değeri yakalamamızı sağlar
        mesaj2=System.out.println(mesaj.concat("yasasın"));
        //iki metni birleştirmek için concat metodu kullanılır.mesaj metni ve parantez içindeki metni birleştirir
        //daha sonra birleştirilmiş metni kullanmak istersek birleştirdiğimiz kod betiğini bir değişkene atamalıyız
        System.out.println(mesaj.startsWith('B'));//parantez içinde belirtilen değerle başlıyorsa true değer döndürür
        System.out.println(mesaj.endswith('.'));//parantez içinde belirtilen değerle bitiyorsa true olacak
        char[] karakterler=new char[5];
        mesaj.getChars(srcBegin:0, srcEnd:4, karakterler, dstBegin:0);//sıfırdan dördüncü indise kadar olan elemanları karakterlere ata.karakterlerin sıfırıncı indexinden itibaren aktar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//belirttiğimiz karakterin mesajın içinde kaçıncı eleman olduğunu bulmayı sağlar.
        //ilk bulduğu 'a'da aramayı bitirir

        System.out.println(mesaj.lastIndexOf('e'));//aramaya en sağdan başlar.Baştan hangi indexte bulunuyorsa o index numarasını verir

        //ilgili metindeki değerleri değiştirmeyi sağlar
        String yeniMesaj=mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2));//metnin içerisinden parça almayı sağlar
        System.out.println(mesaj.substring(2,4));//istediğimiz indexe kadar kesmesi için
        for(String kelime:mesaj.split(' ')){
            System.out.println(kelime);
        }//belli bir karakter dizisini dikkate alarak parçalar.

        System.out.println(mesaj.toLowerCase());//mesajı küçük harfe çevirir.veritabanında arama yaparken kullanırız
        System.out.println(mesaj.toUpperCase());//mesajı büyük harfe çevirir.veritabanında arama yaparken kullanırız
        System.out.println(mesaj.trim()); //String ifadenin başında ve sonundaki boşlukları atmayı sağlar
   
        
        
        
        
    }
    
}
