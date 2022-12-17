package day29collections;

import java.util.LinkedList;

/*
Collection: birden fazla datanın depolanması.
Array ilkel bu yüzden collectionlara dahil değil.
List'ler collection'lara dahil.

Collection diyince bunlar aklınıza gelmeli:
1)List  i)ArrayList ii)LinkedList
2)Set
3)Queue

>List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
>>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
--Set ve List'i amacına göre kullanın.
>>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır, Ör: bankadaki günlük müşteriler.
 */
public class LinkList01 {
    //arraylist ler index kullanir. eleman ekleme ve silme islemlerinde zorluk yasariz cunku indeksleri kayar
/*
- Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
- Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
- LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
- Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
yerine "Node" kelimesini kullanmak yerinde olacaktir.
- Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
- Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.
LinkedList eleman ekleme ve eleman silmede cok basarilidir. Bu yuzden eleman ekleme
 ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.
 --Search(Eleman bulma) işlemlerinde çok başarılıdır,
        Ör:sözlük yapacaksak ArrayList kullanmalıyız
 >>Bu dezavantajları gidermek için Java LinkedList oluşturmuş.
   LinkedList eleman ekleme ve çıkarma işlemlerinde başarılı.
   linked listte her Nod iki bölümden oluşur:
      ilk bölüme data konulduğu için bunlara data bölümü derler.
      ikinci bölümler ise pointer bölümleri, tüm pointerler bir sonraki bölümü gösterir.
      vagon gibi bir yapı oluştu hepsi bir sonrakine(linked) bağlı.
      iki bölümden oluşan bu yapının ismi: Nod.
      bu yapının en son Nod'un pointer kısmı null gösterir.
      en son Nod'un özel ismi: Tail.
      ilk Nod'un ismi: Head, içinde sadece pointer kısmı var data kısmı yok.
      --Biz LinkedListte bir elemanı silince(elemanı silmek için elemanın sağ ve solundaki okları sileriz)
        Javanın çöp toplayıcısı garbage collector pointer ile işaret edilmeyen Nod'u imha eder.
        Sonra Java silinen Nod'un iki tarafını birbirine bağlamak için yeni bir pointer oluşturur.
      --Eleman ekleme: iki nod arasındaki pointer'ı silip, eklemek istediğimiz Null'u diğer iki
        Nod'a bağlayan iki yeni pointer oluştururuz.
      +Ne zaman çokça ekleme ve çıkarma yaparız Ör: müzeye giren çıkan insanlar.
      +Arraylist kullanınca çokça ekleme ve çıkarma yaptığımız zaman application donar bu yüzden az gelişmiş ülkelerin applicationları donar detayları düşünmeden application yazarlar.
    i) dezavantajı: ındex olmadığı için adres yok.Bir elemanı bulurken sırayla o elemana kadar olan tüm elemanlara
       senden sonrakı şu mu? diye sorar ve o elmanı bulana kadar eleman eleman ilerler.
       --Search(Eleman bulma) işlemlerinde başarısızdır.
       1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
 */
    public static void main(String[] args) {
        LinkedList<String> visitors=new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Brad");
        visitors.add("Pit");

        visitors.add(2,"Angelina");
        visitors.addFirst("Cuneyt");
        visitors.addLast("Ajda");
        visitors.add("Brad");
        visitors.add("Hanks");
        visitors.removeLast();
        visitors.removeFirst();
        visitors.removeFirstOccurrence("Tom");
        visitors.removeLastOccurrence("Brad");
        System.out.println(visitors);
        String firstEl=visitors.pop();//ilk elemani kes er istediginiz yere yapistirir.list bossa exception atar
        System.out.println(firstEl);
        System.out.println(visitors);

    }
}
