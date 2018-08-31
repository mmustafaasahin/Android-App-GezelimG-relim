package com.example.asus.gezelimgorelim;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    Button git;
    ImageView imageView;
    ScrollView scrollView;
    TextView bilgiText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        git    = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
        bilgiText = (TextView) findViewById(R.id.bilgiText);
        Intent intent = getIntent();
        String alinanVeri = intent.getStringExtra("il").toString();

        if(alinanVeri.equals("Aladağ Küp Şelaleleri")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz=Uri.parse("https://www.google.com.tr/maps/dir/''/alada%C4%9F+k%C3%BCp+%C5%9Felalesi/@37.6901887,35.4336098,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x15296b3e265ea30f:0x5b491568861dbcf5!2m2!1d35.5036498!2d37.6902094");
                    Intent intentimiz =new Intent(Intent.ACTION_VIEW,linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.adanakupselalesi);
            bilgiText.setText("Cennet ilçelerimizden olan Aladağ ilçemiz sınırlarında bulunan ve suların çekilmesi sonucu ortaya çıkan Aladağ Küp köyündeki Küp şelalesi ve Aladağ Saklı Kanyon’u ilk defa Everest dağcılık kulübü ile sizler keşfedeceksiniz.Aladağ saklı kanyondaki büyüleyici görselliği uzun süre hafızalarınızdan silemeyeceksiniz.");
        }

        else if(alinanVeri.equals("Anavarza Ören Yeri")) {
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com/maps/dir/36.0586306,32.8494146/Dilekkaya+Mahallesi,+Anavarza+%C3%96ren+Yeri,+01500+Kozan%2FAdana/@36.6560865,33.2448445,8z/data=!3m1!4b1!4m16!1m6!3m5!1s0x15292abc266386dd:0x2c5aea963f38c37d!2sAnavarza+%C3%96ren+Yeri!8m2!3d37.2509701!4d35.8973809!4m8!1m1!4e1!1m5!1m1!1s0x15292abc266386dd:0x2c5aea963f38c37d!2m2!1d35.8973809!2d37.2509701?hl=tr");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.anavarzaorenyeri);
            bilgiText.setText("Anavarza, Kadirli, Ceyhan ve Kozan ilçe sınırlarının kesiştiği yerde, Kozan sınırlan içerisinde, Kilikya bölgesinde bulunan antik kenttir. Kilikya ovasının önemli merkezlerinden olan Anavarza’nın antik kaynaklarda adı Anazarbos, Anazarba, Aynızarba veya Anazarbus olarak geçer. Adana’nın yaklaşık 70 km kuzeydoğusunda, Dilekkaya köyü sınırları içerisindedir.\n" +
                          "\n" +
                             "Kentin Roma İmparatorluk Devri öncesi tarihi hakkında hemen hemen hiçbir bilgi yoktur. MÖ 19 yılında İmparator Augustus tarafından ziyaret edilen kent \"Anazarbus Caesarea\" diye anılmaya başlamıştır. Bugünkü kalıntılar Roma ve Bizans Dönemine işaret etmekle birlikte Adana Müzesi Başkanlığında kazı çalışmaları devam etmektedir.");
            }

            else if(alinanVeri.equals("Feke Kalesi")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/''/S%C3%BClemi%C5%9Fli+Mahallesi,+Feke+Kalesi,+Feke%2FAdana/@37.8602688,35.8816696,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x152c00e4c6b8bff5:0x347344631bebe1bf!2m2!1d35.9517104!2d37.8602895");
                            Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.fekekalesi);
            bilgiText.setText("Feke ilk çağlardan günümüze kadar birçok kavim ve Devletlere yerleşim alanı olmuştur. Feke'nin MÖ 16. yüzyılda Hititlerin hakim olduğu bir federasyon bölgesinde kurulduğu rivayet edilmektedir. Son yıllarda Kayseri Kültepe ve Osmaniye Karatepe tablet ve yazıtlarından anlaşıldığına göre yönetim yeri Mezopotamya daki Asur kenti olan , Asur Devleti vatandaşlarından oluşan tüccarlar MÖ 19. ve 18. yüzyılda Kültepe ve çevresi ile Anadolu'nun değişik yerlerinde ticaret kolonileri kurarak iyi örgütlenmiş bir pazar ağı geliştirmişlerdir. ");
        }

        else if(alinanVeri.equals("Gülek Kalesi")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/''/G%C3%BClek+Bo%C4%9Faz%C4%B1,+Ak%C3%A7atekir+Mahallesi,+Pozant%C4%B1%2FAdana/@37.3277574,34.7244032,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x15283e15c72ab6d9:0xfdb861ddb7422a7f!2m2!1d34.794444!2d37.327778");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.gulekkalesi);
            bilgiText.setText("Bin 650 rakımında olan bir kale. Yüksekliğiyle her yere hakim konumda. Son günlerde buranın fotoğrafları sosyal medyada paylaşıldı ve insanlar buraya yoğunlukla gelip gitmeye başladı. Bir cazibe merkezi oldu Gülek Kalesi. Manzarası mükemmel");
        }

        else if(alinanVeri.equals("Kapıkaya Kanyonu")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/''/Kap%C4%B1kaya,+Kap%C4%B1kaya+Mahallesi,+01770+Karaisal%C4%B1%2FAdana/@37.2300397,35.016181,15z/data=!4m8!4m7!1m0!1m5!1m1!1s0x1528683b2083c1a5:0x88701387dd9f544c!2m2!1d35.022438!2d37.234006");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.kapikayakanyonu);
            bilgiText.setText("20 kilometre uzunluktaki Kanyon’un,  7 kilometresi yürüyüşe açık hale getirilmiş. Kanyonun etrafı zakkum, çınar  ve çam ağaçları ile çevrili.\n" +
                    "Suyun yardığını tahmin ettiğimiz dağ da başka muhteşem bir görüntü oluşturuyor.\n" +
                    "Karaisalı Belediyesi, Kapıkaya Kanyonu yürüyüş parkurunu 16 metrelik köprü ile bağladı. Suya batmadan, atlamadan, zıplamadan Yerköprü piknik alanından yürüyüşe başlayanlar, muhteşem bir manzara eşliğinde Kapıkaya Kanyonu’na ulaşabilecek. Kapıkaya Kanyonu’nda doğaseverler için bir dinlenme alanı oluşturulmuş. Kanyonun ortasında şelaleyi karşıdan gören bir ahşap bina yapıldı. \n" +
                    "Bina misafirlerin ihtiyaçları düşünülerek hazırlanmış. Kanyonun içine doğaseverlerin yürüyüş sırasında uçuruma düşmemeleri için dört yüz metre boyunca güvenlik amaçlı olarak korkuluk yapıldı. Kanyonda bazı kesimlerde daralan yol, doğal yapıya zarar verilmeden genişletildi. Üç dört metrelik köprülerle yürüyüş daha güvenli ve kolay kılındı.");
        }

        else if(alinanVeri.equals("Kozan Göller Yaylası")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0585986,32.8493919/G%C3%B6ller+Yaylas%C4%B1,+G%C3%B6ller+Yaylas%C4%B1,,+Kozan%2FAdana/@36.8712553,33.3486588,8z/data=!3m1!4b1!4m16!1m6!3m5!1s0x152ea61198d0ac5d:0xd91a09d1a8a058b2!2zR8O2bGxlciBZYXlsYXPEsQ!8m2!3d37.6952257!4d36.1052196!4m8!1m1!4e1!1m5!1m1!1s0x152ea61198d0ac5d:0xd91a09d1a8a058b2!2m2!1d36.1052196!2d37.6952257");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.kocangolleryaylasi);
            bilgiText.setText("Ulaşım için Kozan ilçesine 40 kilometre mesafede olan stabilize yol kullanılmaktadır. Yaz aylarında Kozan a gitmek için minibüs bulabilirsiniz. Yaylanın çevresi kır çiçekleri ve ormanlarla çevrili bulunan yaylada, elektrik, su ve telefon bulunmaktadır. Konaklamamak, alışveriş ve yemek yemek için yaylada bakkal, lokanta ve kahveler bulunmaktadır. Anlayacağınız bir yayladan bekleyeceğiniz her türlü rahatlık ve şehirdeki gibi elektrik su telefon ve ulaşım ihtiyaçlarınızı karşılayabileceğiniz kapasitede bir yer burası.");
        }
        else if(alinanVeri.equals("Taşköprü")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/''/ta%C5%9Fk%C3%B6pr%C3%BC+adana/@36.9862624,35.2650051,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x15288f65281823f5:0xe3cad1eb8db85102!2m2!1d35.3350451!2d36.986283");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.taskopru);
            bilgiText.setText("Bazı arkeologlara göre, Hitit Kralı I. Arnuwanda, M.Ö. 1550’ye tarihlenen bir kitabede Adania ile savaşını anlatırken Taşköprü’den böyle bahsetmiş. Hititlere dayanan bir başka rivayete göre ise Kral Hattusili Suriye’ye giderken Adana’dan geçmiş ve Seyhan Nehri üzerine bu köprüyü yaptırmış.");
        }
        else if(alinanVeri.equals("Varda Köprüsü")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0585986,32.8493919/K%C4%B1ralan+Mahallesi,+Varda+K%C3%B6pr%C3%BCs%C3%BC,+Karaisal%C4%B1%2FAdana/@36.6490346,33.3502063,9z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x152869dcc77d3743:0xb8cb27a4ee4dac8a!2m2!1d34.9767958!2d37.242926");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.vardakoprusu);
            bilgiText.setText("Varda Köprüsü (Alman Köprüsü) veya Viyadüğü, Adana Karaisalı ilçesi Hacıkırı köyünde yer alıyor. Mühendislik harikası olarak nitelendirilen köprü 1900’lü yılların başında Almanlar tarafından inşa edilmiş, bu yüzden Alman Köprüsü diye de adlandırılıyor.\n" +
                    "\n" +
                    "Hacıkırı Demiryolu köprüsü olarak yapılan köprü heybetli oluşu nedeniyle yöre halkı tarafından Koca Köprü diye biliniyor. 200 metre uzunluğunda ve 99 metre yüksekliğinde olan köprü 1912 yılında hizmete açılıyor. Çelik kafes taş örme tekniği ile yapılan köprü tarihi ipek yolunun yerini alan Berlin-Bağdat-Hicaz demiryolu hattının bir parçası.");
        }
        else if(alinanVeri.equals("Yılan Kalesi")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0585986,32.8493919/K%C3%BC%C3%A7%C3%BCkburhaniye+Mahallesi,+Y%C4%B1lankale,+Adana+Ceyhan+E-5+Karayolu,+Ceyhan%2FAdana/@36.5435873,33.1699752,8z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x1528c873d98766ed:0xe9c440965423df9!2m2!1d35.7478612!2d37.0146363");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.yilankale);
            bilgiText.setText("Toros Dağları’nı aşarak Antakya’ya giden, Antik dönemde olduğu kadar Osmanlı döneminde de önemli olan tarihi yolun üzerinde, Orta çağda 11. yy.’da yapılmış Haçlı kalelerindendir. Ovadaki diğer kaleleri de görüş alanının içine alan kalenin 8 yuvarlak burcu vardır. Güney’de Nizamiye Kapısı vardır. Girişten itibaren taş basamaklı merdivenlerle teraslara çıkılmaktadır. Kilise ve sarnıcı bulunan kalenin, garnizonu en üst bölümde yer almıştır. Eski adı Govara olan kaleyi, 1671 yılında buradan geçen Evliya Çelebi fiahmeran Kalesi olarak tanıtmıştır. Ensesi tüylü ve boynuzlu yılanların yaşadığını alaycı bir dille ifade etmiştir. Ünlü fiahmeran hikayesinin kaynağı da işte bu kaledir. Yılan Kale, 40 civarında kaleye sahip Çukurova’nın, Adana’ya 30 km. mesafedeki önemli bir kalesidir");
        }
        else if(alinanVeri.equals("Kapuzbaşı şelalesi")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0585986,32.8493919/Kapuzba%C5%9F%C4%B1+Mahallesi,+Kapuzba%C5%9F%C4%B1+%C5%9Eelalesi,+Yahyal%C4%B1%2FKayseri/@37.1547355,33.0691147,8z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x15296df777ed5589:0x11f386f35ad88c1!2m2!1d35.3933375!2d37.7742702");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.kapuzbasiselalesi);
            bilgiText.setText("Dünyanın en yüksek ikinci şelalesi, yani Niagra ile karşılaştırılacak güzellikte olan Kapuzbaşı Şelalesi… Hemen yakınındaki Aladağlar’ın görkemiyle yarışan bu şelale, muhteşem bir manzara koyuyor ortaya");
        }

        else if(alinanVeri.equals("Arsemia Ören")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/''/Arsemia+%C3%96ren/@37.8025002,38.5072869,11.33z/data=!4m8!4m7!1m0!1m5!1m1!1s0x15335f2ca21435a3:0xe9b62f384643b8ec!2m2!1d38.616164!2d37.787685");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.arsemiaoren);
            bilgiText.setText("Kommagane krallığının yazlık başkenti olan Arsemia, yıkık olmasına rağmen hala var olan iki tünel ve heykellerle çok güzel bir tarihi yer konumundadır. Eski Kahta kalesi (yeni kale)nin hemen karşısında olup, aralarında Kahta çayının bir kolu geçmektedir.");
        }


        else if(alinanVeri.equals("Cendere Köprüsü")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/''/Cendere+K%C3%B6pr%C3%BCs%C3%BC/data=!4m5!4m4!1m0!1m2!1m1!1s0x15335686cb161a4f:0x2224afbf47f2e8ff?sa=X&ved=2ahUKEwj6ooeWi8ncAhXMbZoKHQO0D90Q9RcwGHoECAoQHA");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.cenderekoprusu);
            bilgiText.setText("Roma köprüsü veya Septimus Severus köprüsü olarak da bilinir. Antik cabinas ( cendere ) çayı üzerinde yer almaktadır. Köprü muhteşem bir kanyondan akan çayın iki tarafını birleştirdiği için bu isim verilmiştir. Kahta ilçesinden Nemrut Dağına doğru giderken Karakuş Tümülüsünü geçtikten yaklaşık 10 Km sonra Sincik- Kocahisar yol ayrımında bulunmaktadır. Köprü Roma imparatoru Septimus Severus’un ( M.S. 193-211 ) emriyle o tarihte Samsat’ta ( Somasata ) karargah kuran XVI. Lejyon tarafından yaptırılmıştır. ");
        }
        else if(alinanVeri.equals("Gerger Fırat Nehri")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/Gerger,+02700+Gerger%2FAd%C4%B1yaman/@37.0273993,33.8272628,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x4075ef0d350aee05:0x4f822ad8ff8af422!2m2!1d39.0322699!2d38.028856");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.gergernehri);
            bilgiText.setText("Bazı kaynaklara göre M.Ö.VI.Yüzyılın ilk yarısında yaşayan Selevkos Kralı Arsemes, Fırat üzerinde aşağı ARSEMİA adlı bir kent kurmuştur. Bu kent Gerger Kalesi olarak halen bulunmaktadır. Aşağı ARSEMİA KOMMAGENE krallı, zamanında kışlık kent olarak kullanılırdı.\n");
        }

        else if(alinanVeri.equals("Karakuş Tümülüsü")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/''/Karaku%C5%9F+T%C3%BCm%C3%BCl%C3%BCs%C3%BC/@37.8682283,38.517176,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x153359e1d5ae42cb:0x7fe3f53da14c69c6!2m2!1d38.587216!2d37.868249");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.karakus);
            bilgiText.setText("Nemrut Dağı tur güzergahında bulunan Nemrut Dağı Milli Park giriş noktasında yer alan Kommagene’lilerin kraliçelerine ait Anıt Mezar yöre halkı tarafından sütün üzerinde bulunan kartal heykelinden dolayı Karakuş olarak adlandırılmaktadır. Karakuş Anıt Mezarı aynı zamanda Kommagene’liler için önemli bir TEMENOS ‘tur. ");
        }
        else if(alinanVeri.equals("Nemrut Dağı")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/Mount+Nemrut,+Kayadibi+K%C3%B6y%C3%BC%2FKahta%2FAd%C4%B1yaman/@37.1244422,33.8271475,7z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x4075ff1780b7aec9:0x31abab7733e1fa45!2m2!1d38.7407995!2d37.9807788!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.nemrutdagi);
            bilgiText.setText("Nemrut Dağı, Adıyaman ilindeki Kahta ilçesi yakınlarında Ankar dağları civarında 2.150 metre yüksekliğinde bir dağdır. Toros dağ silsilesinde bulunur. Güney Doğu Anadolu Bölgesi’nde, Adıyaman ili sınırları içindedir. 1988 yılında ilan edilmiştir");
        }
        else if(alinanVeri.equals("Avdalas Kalesi")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/Afyon+Karahisar+Kalesi,+Kale+Mah.,+03100+Merkez%2FAfyonkarahisar+Merkez%2FAfyonkarahisar/@37.3926419,29.5728498,7z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x14cf17d440abb5c1:0xb664156c81ce0d60!2m2!1d30.5316566!2d38.756976!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.avdalaskalesi);
            bilgiText.setText("Afyonkarahisar’daki Gazlıgöl Kaplıcası’na 10 kilometre uzaklıkta olan Ayazini Köyü sınırları içerisinde olup kolay bir ulaşıma sahiptir. Avdalas Kalesi Bizans döneminde yerleşim yeri olarak kullanılan alan çok katlı ve çok odalı sarnıçlı bir yapıya sahiptir. Özellikle sağlık turizmi açısından önemli bir yere sahip olan Afyon, her köşesinde sunduğu tarihiyle ve doğal güzelliğiyle turistlerin yoğun bir ilgi gösterdiği bir şehirdir.");
        }
        else if(alinanVeri.equals("İscehisar Peri Bacaları")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/%C4%B0scehisar,+Afyonkarahisar/@37.523344,29.5728589,7z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x14cf028ced9eb635:0xa358d0d62ee8f98!2m2!1d30.749196!2d38.861286!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.iscehisar);
            bilgiText.setText("Volkanik arazilerde görülen peri bacaları, sellenme sularının neden olduğu, farklı aşınma sürecinde oluşan sütun, pramidal sütun görünüşlü yer şekilleridir. Afyonkarahisar ilinin jeolojik yapısı gereği, volkanik arazi üzerinde bulunan İhsaniye, İscehisar, Bayat ve Bolvadin ilçelerinde değişik biçimlerde, şapkalı veya şapkasız çok sayıda peri bacaları bulunmaktadır. Bunlardan Bolvadin İlçesine bağlı Özburun Kasabası’nın Minareli Deresi’nde yer alan peri bacaları, diğer yörelerdeki peri bacalarından farklı oluşumlarıyla dikkat çekmektedir. Ayrıca Bayat İlçesi’nin İnpazarcık Mevki’i ile Mekân Yaylası’nın karşısında bulunan Eyerli Dağı’nın yamaçlarında peri bacalarına rastlanılmaktadır.");
        }
        else if(alinanVeri.equals("Afyonkarahisar kalesi")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/Kale+Mah.,+Afyon+Karahisar+Kalesi,+Merkez%2FAfyonkarahisar+Merkez%2FAfyonkarahisar/@37.523344,29.5728589,7z/data=!4m10!4m9!1m1!4e1!1m5!1m1!1s0x14cf17d440abb5c1:0xb664156c81ce0d60!2m2!1d30.5316566!2d38.756976!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.afyonkalesi);
            bilgiText.setText("Volkanik bir kaya kütlesi olan ve 226 m yükseklikteki kale, M.Ö.1350 yıllarında Hitit İmparatoru II.Murşil zamanında, Arzava seferinde müstahkem mevkii olarak kullanılmış ve Hapanuva adını almıştır. Daha sonra Bizans ve Selçuklular zamanında da önemli çarpışmalara sahne olmuştur. Kale zirvesinde M.Ö.1200-700 tarihleri arasında Anadolu’da yaşamış olan Frigler dönemine ait kültür izlerine rastlanmakta olup, Ana Tanrıça Kybele’ye adanmış birçok tapınma yerleri ile 4 adet büyük sarnıç (su çukurları) bulunmaktadır. Surları Seçuklu Sultanı Alâaddin Keykubat zamanında kale dizdarı olan mimar Bedrettin Gevhertaş tarafından 1235 yılında onarılmış, ayrıca kaleye küçük bir mescit ile yanına saray yaptırılmıştır. ");
        }else if(alinanVeri.equals("Ağrı Dağı")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/A%C4%9Fr%C4%B1+Da%C4%9F%C4%B1/@40.0475797,38.5138771,7z/data=!4m10!4m9!1m1!4e1!1m5!1m1!1s0x4014d232638342ad:0xaaa6fa54b6b1247c!2m2!1d44.2990761!2d39.7024393!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.agridagi);
            bilgiText.setText("Türkiye'nin en büyük dağı olan Ağrı Dağı jeolojik konumu ve Büyük Tufandan sonra Nuh'un gemisine ev sahipliği yapması dolayısıyla efsanevi özelliği olan bir dağdır. Kutsal kitaplarda da adı geçen Ağrı Dağının farklı dillerde bir çok ismi vardır. Başlıcaları, Ararat, Kuh - i Nuh, Cebel ül Haristir.");
        }else if(alinanVeri.equals("Doğubeyazıt Urartu Kalesi")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/Do%C4%9Fubayaz%C4%B1t,+A%C4%9Fr%C4%B1/@37.9629209,33.9580224,6z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x4014b73d69e6a97b:0xe421c20ded4c1655!2m2!1d44.068778!2d39.547074!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.urartukalesi);
            bilgiText.setText("Doğubeyazıt’ın 5 km. doğusunda, Eski Beyazıt’ın kuzeydoğusundaki Belleburç denilen yerde bulunmaktadır. Kayalıklar üzerindeki bu kalenin yapım tarihi bilinmemektedir. Büyük olasılıkla kale Urartular döneminden kalmıştır. Günümüze oldukça harap bir durumda gelen kalenin içerisinde Urartu mezarları ile Antik Çağlardan kalma mimari kalıntılar bulunmaktadır. Üç bölümden meydana gelen kalenin orta bölümünde mağaralar ve bir mabet kalıntısı bulunmaktadır. Kalenin çevresini kuşatan surlar yıkılmıştır. ");
        }

        else if(alinanVeri.equals("İshak Paşa Sarayı")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/%C4%B0shak+Pa%C5%9Fa+Saray%C4%B1,+04400+Yukar%C4%B1tavla+K%C3%B6y%C3%BC%2FDo%C4%9Fubayaz%C4%B1t%2FA%C4%9Fr%C4%B1/@37.9716218,33.9889561,6z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x4014b9932507216b:0xd78121b3411ceaa1!2m2!1d44.1292018!2d39.5203516!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.ishakpasa);
            bilgiText.setText("İshak Paşa Sarayı, saraydan öte bir külliyedir. İstanbul Topkapı Sarayı'ndan sonra son devirde yapılmış sarayların en ünlüsüdür.Doğubeyazıt İlçesi'nin 5 km doğusunda, bir dağın yamacındaki tepe üzerine kurulan saray, Osmanlı İmparatorluğu'nun Lale Devri’ndeki son büyük anıt yapısıdır. 18. yy. Osmanlı mimarisinin en belirgin ve seçkin örneklerinden olduğu kadar, sanat tarihi yönünden de değeri büyüktür.");
        }

        else if(alinanVeri.equals("Tendürek dağı")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/Tend%C3%BCrek+Da%C4%9F%C4%B1,+04400+Binkaya+K%C3%B6y%C3%BC%2FDo%C4%9Fubayaz%C4%B1t%2FA%C4%9Fr%C4%B1/@37.9716218,33.9889561,6z/data=!4m10!4m9!1m1!4e1!1m5!1m1!1s0x401358a6d54dc04f:0xa9db5349334bf4b5!2m2!1d43.8686111!2d39.3552778!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.tendurek);
            bilgiText.setText("Tendürek dağı, ülkemizdeki aktif olan tek volkanik dağdır. Ağrı dağının güneyinde bulunur. Yüksekliği 3584 metredir. Dağın tepesindeki ortalama 500 metre genişlikteki kraterden sıcak su buharıyla, çeşitli gazlar çıkar. Volkandan çıkan tüfler ve lavların çevrede bulunan Neojen yaşlı göl çökellerine gelmesi, Tendürek dağının Neojen sonlarında kuvarterner başlarında oluştuğunu gösterir.");
        }
        else if(alinanVeri.equals("Arkeoloji ve Mumya Müzesi")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/dir/36.0594949,32.848817/Amasya+Arkeoloji+M%C3%BCzesi,+%C3%9C%C3%A7ler+Mahallesi,+Mustafa+Kemal+Pa%C5%9Fa+Cd.+D:No.91,+05100+Amasya+Merkez%2FAmasya/@38.5827635,32.0804352,7z/data=!4m10!4m9!1m1!4e1!1m5!1m1!1s0x40876e523ba178ab:0x104d317738ce7265!2m2!1d35.8247239!2d40.64946!3e0");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.amasyamuze);
            bilgiText.setText("Amasya Arkeoloji Müzesi 1925 yılında kurulduğunda çok fazla arkeolojik esere sahip değilmiş. Ancak sergilenecek eser sayısı artınca bina yeterli olmamış ve 1977 yılında bugünkü bina yapılmış ve 1980 yılında Amasya Arkeoloji Müzesi hizmete açılmış.\n" +
                    "Amasya Osmanlı döneminde bir şehzadeler şehriymiş. İkinci Murad, Çelebi Mehmet ve Yıldırım Bayezid burada şehzade olarak bulunmuşlar.");
        }
        else if(alinanVeri.equals("Burmalı Minare Cami")){
            git.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri linkimiz = Uri.parse("https://www.google.com.tr/maps/place/Burmal%C4%B1+Minare+Cami/@40.650254,35.8302493,17z/data=!3m1!4b1!4m5!3m4!1s0x40876e4d331fb927:0x6fd621170210b4b9!8m2!3d40.65025!4d35.832438");
                    Intent intentimiz = new Intent(Intent.ACTION_VIEW, linkimiz);
                    startActivity(intentimiz);
                }
            });
            imageView.setImageResource(R.drawable.burmali);
            bilgiText.setText("Caminin kapısı üzerinde bulunan, kemer kavisi şeklindeki kitabeden caminin iki kardeş tarafından yaptırıldığı anlaşılır. Bu kardeşlerden Said Ferruh’un Selçuklu Sultanı II. Gıyaseddin Keyhüsrev’in vezirlerinden Necmeddin Ferruh Bey olduğu kabul edilmektedir. Kardeşi de Haznedar Yusuf’tur. Yapım tarihi, kitabeye göre 1242 yılıdır. ");
        }

        }



}
