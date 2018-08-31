package com.example.asus.gezelimgorelim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView listView;

    private  String[] adana01 ={"Aladağ Küp Şelaleleri","Anavarza Ören Yeri","Feke Kalesi","Gülek Boğazı","Kapıkaya Kanyonu","Kozan Göller Yaylası","Taşköprü","Varda Köprüsü","Yılan Kalesi","Kapuzbaşı şelalesi"};

    private String[] adiyaman02={"Arsemia Ören","Cendere Köprüsü","Gerger Fırat Nehri","Karakuş Tümülüsü","Nemrut Dağı",};

    private String[] afyonkarahisar03 ={"Avdalas Kalesi","İscehisar Peri Bacaları","Afyonkarahisar kalesi",};

    private String[] agri04={"Ağrı Dağı","Doğubeyazıt Urartu Kalesi","İshak Paşa Sarayı","Tendürek dağı",};

    private String[] amasya05={"Arkeoloji ve Mumya Müzesi","Burmalı Minare Cami","Harşena Dağı ve Pontus Kral Kaya Mezarları","Kral Kaya Mezarları",
            "Taşova Borabay Krater gölü","Yalıboyu","Osmanlı evleri"};
    private String[] ankara06 ={"Anadolu Medeniyetleri Müzesi","Anıtkabir","Atatürk Orman Çiftliği"," Augustus Tapınağı","Eymir Gölü","Gordion Kral Midas tümülüsü",
            " Güvem Köyü Işıkdağ","Ankara Kalesi","Karagöl Beypazarı","Kıbrıs Köyü Kanyonu","Kızılcaören Kızılcahamam","Kuğulu Park", "Nallıhan Kıztepe erozyon bölgesi",
            "Roma Hamamı","Sorgun yaylası","Tuz Gölü"};
    private String[] antalya07={"Adrasan Korsan Koyu","Adrasan Musa Dağı","Adrasan sulu ada","Akseki Gidengelmez Dağları","Alakır Vadisi","Alanya Dim çayı ve mağarası",
            "Alanya Fosforlu mağara","Alanya İçtepe antik kenti","Alanya kalesi ve kızılkule","Alanya Sapadere kanyonu","Alara şelalesi","Altın Beşik Mağarası",
            "Ambar Katran 2331 yaşındaki sedir ağacı","Andriake Antik kenti","Aperlae antik kenti","Arkeoloji Müzesi","Aspendos Tiyatrosu",
            "Beydağları","Çıralı Maden Koyu","Çıralı'da 3 bin yıldır yanan ateş","Damlataş Mağarası","Demre Aperlai Antik Kenti","Demre Noel baba",
            "Düden şelalesi","Erymna Antik kenti","Finike Arykanda antik kenti"," Finike Gagai antik kenti","Finike Sulu in mağarası","Gazipaşa Güney köyü delik deniz kral koyu",
            "Gazipaşa Yalan dünya mağarası","Gelidonya Feneri","Göynük Kanyonu","Göynük yaylası","Göynük'te Zafer Kulesi"," Güver Kanyonu",
            "Hadrian kapısı","Hidayetin Koyu","Antalya Kaleiçi"," Kaputaj Plajı","Karain mağarası","Karçukuru Yaylası","Kaş Antiphellos Antik Kenti"," Kaş Aslanlı Lahit (kral mezarı)",
            "Kaş Demre Myra Örenyeri","Kaş Limanağız","Kayıp Şehir Kekova Dolichiste","Kekova","Kemer ıdyros antik kenti","Kemer Kanyonu",
            "Koru Plajı Doğal Havuzu","Kumluca Korsan koyu","Kumluca Rhodiapolis Antik Kenti","Kurşunlu Şelalesi","Likya Yolu","Manavgat Şelalesi",
            "Olympos Antik Kenti","Oyuncak Müzesi","Papaz kayası mağarası","Patara Kumsalı","Perge antik Kenti","Phalesis antik kenti","Sapadere Kanyonu","Selge antik kenti", "Serik Zeytintaşı mağarası" ,"Side Antik kenti","Side Apollo tapınağı","Side Köprülü kanyon","Side Tike tapınağı","Simena antik kenti","Tahtalı dağı", "Tazı Kanyonu","Termessos antik kenti","Uçansu şelalesi"," Zeytintaşı mağarası"};

    private String[] artvin08={"Karagöl","Büyük Deniz Gölü","Ardanuç Cehennem Deresi Kanyonu","Ardanuç Lengethev-Bulanık Kalesi","Arsiyan Yaylası","Barhal Manastırı","Borçka Maçahel yaylası","Cehennem Deresi",
            "Ciro Şelalesi","Dikyamaç Muzesi","Hatila Vadisi Millî Parkı"," Kaçkarlar","Karagöl acella yaylaları","Kazım Koyuncu Anıt Mezarı","Maral Şelalesi","Mençuna Şelalesi","Otkhta Dört kilise"};

    private String[] aydin09={ "Alinda Antik Kenti","Afrodisias Antik Kenti","Alabanda Antik Kenti"," Alinda Antik Kenti","Arapapıştı Kanyonu",
            "Beşparmak Dağları","Didim Akbük Cennet koyu"," Didim Tavşan Burnu","Doğanbey Köyü","Dydima Antik kenti","Kuşadası Zeus mağarası","Latmos (Beşparmak) Dağı"," Magnesia Antik Kenti","Menderes dalyanları",
            "Milet Antik kenti","Nazilli Arpaz köyü","Nysa Antik Kenti","Söke Doğanbey Köyü"," Söke Priene Antik Kenti","Tralleis Antik Kenti","Umurlu Kuyucular Yörük Köyü"};

    private String[] balikesir10={"Ayvalık Badavut Plajı","Altınoluk Şahinderesi Kanyonu","Ayvalık Doğa Festivali","Ayvalık Kozak Yaylası",
            "Ayvalık Zeytin Hasadı","Ayvalık'da İlk boğaz köprüsü","Cunda Sokakları"," Delicenur Mağarası ","Edremit Antandros Antik Kenti",
            "Edremit Güney şelalesi","Edremit Hasanboğuldu şelalesi"," Kazdağları Akaleos","Küçükköy","Kyzikos Antik kenti",    "Mercan Cenneti Ayvalık",
            "Şahinderesi Kanyonu","Şeytan Sofrası","Zeytinli Rock Festivali"};

    private String[] bilecik11 ={"Bozcaarmut Göleti","Ertuğrul Gazi Türbesi","Harmankaya kanyonu","Osmaneli Aya Yorgi Kilisesi","Şeyh Edebali Türbesi","Yenipazar Suuçtu Şelalesi","Zincirli Kaya",};

    private String[] bingol12 ={"Yüzen Ada"," Çir Şelalesi","Pargasur şelalesi"};

    private  String[] bitlis13 ={"Adilcevaz Çakıl Adası Plajı","Ahlat Selçuklu Mezarlığı","Güroymak Budaklı köyü kaplıcası","İncekaya Kalderası","Bitlis Kalesi","Nemrut Krater Gölü","Süphan dağı"};

    private String[] bolu14 ={"Abant gölü"," Akkaya Travertenleri","Çubuk Gölü","Gölcük Tabiat Parkı","Kapankaya seyir terası","Mengen Aşçılık Festivali","Pürenli Yaylası",
            "Seben Gölü ve yaylası","Sinekli Yaylası","Sülüklü Göl","Yedigöller"};

    private String[] burdur15 ={"İnsuyu Mağarası","Kargı Köyü Sığla Ormanı","Kibyra Antik Kenti","Milyos (Milias)","Sagalassos çesmesi","Salda Gölü"};

    private  String[] bursa16 ={"Aktopraklık Höyüğü","Cumalıkızık Ahududu Festivali","Evliya çelebi yolu","Gedelek Turşu Festivali","İznik Arkeoloji Müzesi"," İznik Ayasofya kilisesi"," İznik Dikilitaş"," İznik Keramet Kaplıcası","İznik Müşküle Nazım Hikmet Çınarı","İznik Sansarak kanyonu"," İznik tarihi eserleri","İztuzu",
            "Misi Köyü","Mudanya Trilye","Oylat Şelalesi ve Mağarası","Suuçtu Şelalesi"," Uludağ buzul gölleri","Uludağ","Zeki Müren Mezarı"};

    private String[] canakkale17 ={"Adatepe Zeus Altarı","Alexandria Troas Antik Kenti","Assos antik kenti","Assos Kadırga koyu","Aynalı çarşı","Ayvacık Sokakağzı köyü","Babakale","Bozcaada Akvaryum koyu","Bozcaada Bağbozumu Festivali","Büyükhusun dolmenleri",
            "Gelibolu Kabatepe Orman Kampı","Gelibolu yarımadası","Geyikli","Geyikli"," Kaz dağları","Kaz dağları","Kestanbol kaplıcaları","Peynir Festivali","Troya Antik Kenti"};

    private String[] cankiri18 ={"Ilgaz Dağları","Kurşunlu Devrez Vadisi","Sakaeli Kaya Mezarları","Tuz Mağarası"};

    private String[] corum19 = {"Akpınar Köyü","Alacahöyük Müzesi","Boğazkale Müzesi","Gökçedoğan Kargı","Gölünyazı Milli Parkı","Hitit Başkenti "," İncesu Kanyonu","İskilip Kalesi","Laçin kapılıkaya anıtsal kaya mezarı","Susuz Şelale"};

    private String[] denizli20  ={"Başkarcı İsrafil Deresi","Laodikeia Antik Kenti","Ağlayan kaya şelalesi","Altındere Vadisi","Bekilli Şarap ve Üzüm Festivali","Buldan Tripolis Antik Kenti   Güney Şelalesi","Heriapolis antik kenti","Işıklı Göl","İnceğiz Kanyonu","i Kaklık Mağarası"," Pamukkale Travertenleri","Süngülü Köyü ve Şelalesi","Teleferik ve Bağbaşı Yaylası"};

    private String[] diyarbakir21 = {"Cermik Şeyhandede Şelalesi","Artuklu Sarayı","Bismil Hakemi Use","Dicle Nehri","Eğil barajı","Güneş Mabedi","Diyarbakır Kalesi","Diyarbakır Karpuz Festivali","Diyarbakır Müzesi","On Gözlü Köprü","Diyarbakır Sur","Zerzevan Kalesi"};

    private String[] edirne22 ={"Arkeoloji Ve Etnografya Müzesi"," Büyük Sinago","Erikli İbrice Limanı","Erikli Saros Körfezi"," Kakava (Hıdırellez) Şenlikleri"," Lalapaşa domelleri","Selimiye Cami","Tunca’nın Yasak Vadileri","Uzunköprü"};

    private String[] elazig23 ={"Buzluk Mağarası","Harput Kalesi","Meryem Ana Kilisesi","Murat suyu","palu kalesi"};

    private  String[] erzincan24 = {"Çağlayan Şelalesi","Girlevik Şelalesi","Kemaliye Karanlık Kanyonu","Kemaliye Lökhane","Kemaliye Taş Yolu","Munzur Vadisi Millî Parkı","Tercan Abrank Aziz David Manastırı"};

    private String[] erzurum25={" İspir Kalesi","İspir Yedi Gölleri","Narman peribacaları","Ovit dağı","Tortum Şelalesi","Tortum Şelalesi"};

    private String[] eskisehir26 ={"Avlakkaya Kanyonu (Mihalgazi)","Bahşeyiş Anıtı","Beylikova gölü","Devrim Arabası","Dream of Color Festivali","Frig vadisi","Gürlerik Şelalesi","Odunpazarı","Pişmiş Kale","Porsuk Çayı",};

    private String[] gaziantep27 = {"Bakırcılar çarşısı","Karkamış antik kenti","Kasteller ve Livaslar","Köklüce Kanyonu","Rumkale","Yesemek Antik kenti","Zeugma Mozaik Müzesi","Zincirli Bedesten"};

    private  String[] giresun28 = {"Bektas yaylası","Espiye Uluburun Plajı","Kök Evi","Kümbet yaylası","Mavi Göl ve Kuzalan Şelalesi", "Meryem Ana Kaya Tapınağı",  "Giresun Müzesi","Giresun'un gelin kayası"};

    private String[] gumushane29 = {"Artabel gölleri","Karaca Mağarası","Kelkit Salyazı","Santa Vadisi","Torul Soğuksu Yaylası","Zigana geçidi","Esenyurt Kov Kalesi"};

    private String[] hakkari30 = {"Berçelan Yaylası","Cennet- Cehennem Vadisi","Cilo Buzulları","Konur Kanyonu","Seyithan Gölü","Şemdinli mor dağları"};

    private String[] hatay31 = {" Arkeoloji Müzesi","Arsuz Delisu Şelalesi","Beşikli Kaya Mezarlıkları","Dörtyol Amanos Dağları","Dörtyol Kuzuculu Deliçay","Erzin Kaplıcaları","Habib-i Neccar Camii","Harbiye şelaleleri","Hassa Karapınar Türkmen Mezarlığı","Saint Pierre Kilisesi","Titus Tüneli","Türkiye'nin En Uzun Sahili Çevlik","Vakıflı köy","Yayladağ Denizgören köyü","Yayladağ Kara mağarası"};

    private String[] isparta32 = {"Aziz Paul yolu","Eğridir gölü"," Davraz Dağı","Dedegöl dağı Melikler Yaylası"," Güneykent","Keçiborlu Lavanta Tarlaları","Kovada Gölü Millî Parkı","Köprülü Kanyon","Pisidia Antik Kenti","Sütçüler Yazılı Kanyonu","Yenişarbademli deresi","Zından Mağarası"};

    private String[] mersin33 ={"Çağlayan Vadisi","Anamur Anemurion Antik Kenti","Anamur Dragon çayı","Göksü Kanyonu"," Kanlıdivane Ören","Korykos Antik Kenti","lamos kanyonu","Anamur Mamure Kalesi"," Mut Alahan Manastırı","Mut Yerköprü Şelalesi","Saklıcennet","Silifke Cambazlı Kilisesi","Silifke Kilikia Aphrodisiası","v","Silifle Gilinidire mağarası","Soli - Pompeipolis Antik Kenti","St. Paul Kilisesi","Taşucu Eğribük koyu","Tisan Adası","Yanışlı Mağarası","Yedi Uyurlar mağarası","Yumuktepe Höyüğü","Kız Kalesi","Silifke Mezgit Kalesi","Tarsus Roma Yolu"};

    private  String[] istanbul34 = {"Ağva Kilimli Plajı","Anadolu Feneri","Arkeolojisi Müzesi","Atatürk Arboretumu","Ayasofya","Beylerbeyi sarayı","Beyoğlu St. Antuan Kilisesi","Büyük Ada Sokak Lezzetleri Festivali","Çatalca Anastasias surları","Çatalca İnceğiz mağarası","Çiğ Köfte Festivali",
    "Galata Köprüsü","Galata kulesi","Galata Neve Şalom Sinegogu","GurmeFest İstanbul","Heybeli Ada","Pierre Loti Tepesi","Poyrazköy Yoros Kalesi","Rahmi koç müzesi","Riva Kalesi","Rumeli Feneri","Ceneviz Kalesi","Topkapı sarayı","Yerebatan Sarnıcı"};

    private String[] izmir35= {"Dikili Bademli köyü","Dikili Pisa koyu","Erythrai Antik Kenti","Karaburun Mordagan Koyları","Ödemiş Bozdağ Kamp Alanı", "Bergama Asklepion Ören Yeri","Agora çarşısı","Alaçatı Değirmenleri","Alaçatı Deliklikoy","Alaçatı Ot Festivali","Alaçatı zeytinyağı müzesi",
    "Allianoi Antik Kenti","Ayasuluk Kalesi","Bergama Serapeion Tapınağı","Buca Uyku Festivali","Çeşme Altınkum ve Pırlanta plajı","Efes Antik Kenti","Ege Üniversitesi Botanik Bahçesi","Foça Phokaia Antik Şehri","Germiyan köyü",
    "Göksu Nehri Bademli köyü","Homeros vadisi","Karabağlar Kavacık Köyü","Karaburun Sarpıncık Deniz Feneri","Karaburun yarım adası",
    "Karagöl Kamp alanı","İzmir Kordonu","Nepiler Köyü Aşıklar Şelalesi","Nesin Matematik Köyü","Pergamon Antik kenti","Selçuk Müzesi","St. Polycarp Kilisesi",};

    private String[] kars36 ={"Ani Harabeleri","Kars Kalesi","On Iki Havariler Kilisesi","Sarıkamış Allahuekber dağları","Susuz Şelalesi"};

    private  String[] kastamonu37 = {"CideKytoros (Gideros) Antik Kenti","Cide Gideros Koyu"," Çatak Kanyonu Seyir Terası","Çatalzeytin","Ev kaya mezarları","Gastronomi yolu","Horma kanyonu","Ilgarini mağarası", "Ilıca Şelalesi","İksir Doğa ve Mantar Şenliği","Karacehennem Boğazı Ersizlerdere Kanyonu","Küre Dağları","Pınarbaşı Azdavay Yaylası",
    "Suğla Yaylası","Şehriban Kanyonu","Valla Kanyonu"};

    private  String[] kayseri38 = {"Agios Prokopios Kilisesi","Ağırnas Yeraltı Şehri","Ali Dağı Sarnıçlı Yeraltı Şehri","Develi Sultan Sazlığında Kuşları","Erciyes Kayak merkezi","Gesi Bağları","Karpuzbaşı şelalaleri","Kültepe arkeolojik alanı","Yahyalı Hacer Ormanı","Yahyalı Yeşil Köy","Yeşilhisar Soğanlı Köyü","Yeşilhisar Taş evleri"};

    private String[] kirklareli39 ={"Büklükale Ören Yeri","Çeşnigir Caddesi","Kızılırmak Havzası","Sulu Mağara Watery Cave","Aya Nikola Manastırı","Cehennem Şelaleleri","Dupnisa Mağarası","Istranca (Yıldız) Longozları"," İğneada Longoz Ormanları","İğneada","Kanlıgeçit Höyüğü","Karapınar Şelalesi","Kıyıköy deniz feneri","Küçük Ayasofya Kilisesi","Monopetra Kayalıkları"," Pınarhisar ve Vize Kaleleri","Vize Küçük Ayasofya Kilisesi"};

    private  String[] kirsehir40 = {"Cacabey Medresesi","Kalehöyük Arkeoloji Müzesi","Kaman hirfanli barajı","Neşet Ertaşın mezarı","Tarihi Üçayak Kilisesi"};

    private  String[] kocaeli41= {"Ballıkayalar Kanyonu","Beş Kayalar Tabiat parkı","Gölcük Eriklitepe","Hanibal Anıtı","İnönü Yaylası","Kartepe","Kefken Pembe Kayalıkları","Kerpe Ceneviz Kalesi","Kurtuluş Savaşı Siperleri","Nicomedia Su Kemerleri","Sardala Koyu","Yağcılar Köyü","Yuvacık Barajı",};

    private String[] konya42={"Akören Yeraltı Şehri","Çatalhöyük","Çıralı Obruk Gölü","Kayapınar Çölü","Kızören obruğu","Meke Krater Dağı","Meke Krater gölü","Şems-i Tebrizi camii"};

    private  String[] kutahya43 = {"Aizonai Antik Kenti","Çini Müzesi","Kütahya Kalesi","Simav Peri Bacaları","Topukyaylası","Türkmen Dağı"};

    private  String[] malatya44 = {"Arapgir Çay","Aslantepe Ören Yeri","Darende Zengibar Kalesi","Günpınar şelalesi","Levent vadisi","Zengibar Kalesi","Darende Aslantaşlar"};

    private  String[] manisa45={"Aigai antik kenti"," Demirci Gelinuçtu tepesi","Kula Peri Bacaları","Mesir Macunu Festivali","Sardes Antik Kenti","Soma Barajı"," Spil Dağı Sülüklü Göl",
    "Türkmen Köyü ve Şelalesi","Türkmenköy Şelalesi"};

    private  String[] kmaras46 = {"Ağıllı Milli Parkı","Başkonuş Yaylası","Galgamaç Şelalesi","Germanicia Antik Kenti","Toprakhisar Kanyonu","Yavşan Yaylası"};

    private  String[] mardin47 = {"Bab-ı Sor Çeşmesi","Dara Antik Kenti","Deyrulzafaran Manastırı","Kasım Padişah Medresi","Midyat Gülgöze","Midyat Mor Gabriel Manastı",};

    private  String[] mugla48 = {"Gökova Mazıköy","Akyaka Boncuk koyu","Akyaka Orman Kampı","Akyaka'da Azmak Nehri","Bafa gölü ve Yedi Uyurlar Manastırı",  "Bargilya Antik Kenti","Bodrum Akvaryum Koyu","Bodrum Apostol kilisesi","Bodrum Boğaziçi köyü","Bodrum Halikarnas Mozolesi","Bodrum Karakaya Köyü","Bodrum Sualtı Arkeoloji Müzesi","Bodrum Yel değirmeni","Dalyan Kaunos Kral Mezarlığı","Datça Aktur Kamp Alanı","Fethiye Afkule Manastırı","Fethiye Gemile Adası","Fethiye Hayalet Şehir Kayaköy",
    "Fethiye Kelebekler Vadisi","Fethiye Müzik Köyü","Fethiye Ölüdeniz","Fethiye Pınara Antik Kenti","Fethiye Saklıkent Kanyonu","Fethiye Sidyma Antik Kenti","Fethiye Soğuk Su Mağarası",
    "Fethiye Telmessos Antik Kenti","Fethiye Tlos antik kenti","Fethiye Yaka köyü","Fethi Kabak Koyu","Gökova Yedi Adaları","Gümüşlükte Tavşan adası","Hekatomnos Anıt Mezarı","İassos Antik Kenti","İnbükü Tabiat parkı","İyilik Kayalığı Antik Kenti","Ula Kapuz Kanyonu","Karia Yolu","Kedrai Antik Kenti","Kız Kumu Plajı","Datça Knidos","Letoon Antik kenti","Marmaris Diagoras Aristomakha Mezarı","Marmaris Fosforlu Mağarası","Marmaris Marina","Marmaris Sedir Adası","Marmaris Turunç Koyu","Marmaris Okaliptus","Milas Gökçeler Kanyonu","Milas Haydar koyu","Milas İncirlin Mağarası","Milas Uyku vadisi","Palamutbükü","Seydikemer Alexander Cave Girmeler Mağarası","Stratonikeia Antik Kenti","Xanthos Antik kenti","Yatağan Lagina Hekate kutsal alanı","Yeşil Vadi"};

    private  String[] mus49 = {"Arak Manastırı","Kayalıdere Antik Kenti","Kutsal Havariler Manastırı","Varto Hamurpet gölü"};

    private  String[] nevsehir50 = {"Avanos","Derinkuyu Yeraltı şehri","Hacı Bektaş Veli","Kapadokya","Kaymaklı Yeraltı şehri","Uçhisar kalesi","Zelve açık hava müzesi","Ortahisar Kalesi"};

    private String[] nigde51 = {"Ulukışla Çinili göl","Bolkar dağları","Çamardı Emli Vadisi","Eski Gümüş Manastırı","Göllü Krater Gölü","Gümüşler Manastırı","Konaklı Misli Kilisesi","Tyana Ören","Ulukışla Karagölü",};

    private String[] ordu52 = {"Turnasuyu Vadisi","Boztepe","Çambaşı Yaylası","Gerce şelalesi","Hoynat Adası","Kaleboynu yaylası","Karaoluk Çiseli Şelalesi","Keyfalan Yaylası","Kurul Kayalıkları","Ohtamış Şelalesi","Perşembe Çaka Plajı","Perşembe Yaylası","Sülü Burnu","Taşbaşı Kilisesi","Uzundere Şelalesi","Ünye Kadılar Yokuşu","Ünye Kalesi","Yason Burnunu ve Kilisesi","Yoroz Kent Ormanı"};

    private String[] rize53 = {"Ağaran Şelalesi","Anzer Yaylası","Ayder Şelalesi","Çağırankaya Yaylası","Çayeli Ağaran Şelalesi","Fırtına Deresi","Garzavan Yaylası",
    "Gelin Tülü Şelalesi","Gito Yaylası'","Hazindak Yaylası","Hüser Yaylası","İkizdere Çağrankaya Yaylaları","İsimsiz Göl","Karmik Vadisi","Kavrun yaylası","Mezovit buzulları"," Palovit yaylası ve şelalesi","Pileki Mağarası",
    "Pokut Yaylası","Soğanlı Gölü","Şenyuva Köprüsü","Tunca Vadisi Tabiat Parkı","Zil kalesi"};

    private  String[] sakarya54 = {"Acarlar Longoz Ormanları","Davlumbaz Yaylası","Doğançay Şelalesi","Hendek Keremali Dağı","Justinianus Köprüsü","Karagöl Yaylası","Maden Deresi","Poyrazlar Gölü","Sapanca gölü","Soğucak Yaylası","Soğuksu koyu","Taraklı evleri"};

    private  String[] samsun55  = {"Amazon Kadınları Heykeli","Amisos Tepesi","Arkeoloji Ve Etnografya Müzesi","Bandırma Vapuru","Kabaceviz şelaleleri","Kızılırmak Deltası","Kunduz Yaylası","Tekke köy mağaraları","Uzunkız yaylası","Vezirköprü Şahinkaya Kanyonu"};

    private  String[] siirt56 = {"Avamasiro kanyonu","Botan Çayı Gusir Höyüğü","Botan Çayı","Çattepe Dicle","Palamutlu Köyü Kanyonu Pervari","Rasıl Hacar Kanyonu","Sağlarca Kaplıcası","Tillo Kalesi",};

    private  String[] sinop57 = {"Babaçay Kanyonu","Balatlar Kilisesi","Boyabat Kaya Mezarları","Diyojen Heykeli","Erfelek şelalesi","Hamsilos Koyu","İnatlı mağarası","Tatlıca Şelalesi"};

    private  String[] sivas58 = {"Çaltı Çayı Kalyonu","Çifte Minareli Medrese","Divriği Ulu Cami","Gökpınar Gölü","Güzelyurt Köyü","Koyulhisar Eğriçimen Yaylası","Tödürge Gölü"};

    private  String[] tekirdag59 = {"Çorlu Kalesi","Eriklice Köyü","Hora Feneri","Kastro gölü","Kiraz Festivali"};

    private  String[] tokat60 = {"Almus Baraj Gölü","Ballıca mağarası","Kaz Gölü","Mahperi Hatun Kervansarayı","Niksar Çamiçi Yaylası"," Niksar Kalesi","Reşadiye Gündoğdu şelalesi","Sebastopolis Antik Kenti","Selemen Yaylası","Sık Dişini Helası","Zinav Gölü Tabiat Parkı"};

    private  String[] trabzon61 = {"Anabasis Yolu","Aygır Gölü","Beşikdüzü sisdağı yaylası","Çaykara Karester yaylası","Garester Yaylası","Haçka Obası Yaylası","Kangel yaylası","Kızlar Manastırı","Kuştul Peristera Manastırı","Lapazan Yaylası","St. Eugenius Kilisesi","Sümela Manastırı","Şolma Yaylası","Vazelon Manastırı"};

    private  String[] tunceli62 = {"Munzur Gözeleri","Baba Gölü","Bağın Kalesi","Çemişgezek Kalesi","Düzgün Baba","Göktepe Höyüğü","Kutu deresi","Mazgirt Kalesi","Mazgirt Til Höyüğü","Munzur Dağları Şahintaşı Buzulu","Munzur Vadisi Milli Parkı"};

    private  String[] sanliurfa63 = {"Arkeoloji ve Mozaik Müzesi","Harran","Birecik Batık Minareli Savaşan Köyü","Fırfırlı Camii","Göbeklitepe","Halfeti","Harran Bazda Mağaraları","Harran Han El Barur Kervansarayı","Harran Soğmatar Antik Kenti","Harran Şuayb Şehri","Nevali Çori antik kenti","Tektek Dağları Milli Parkı","Siverek Takaron Vadisi"};

    private  String[] usak64 = {"Aksaz Kaplıcası","Blaundus Antik Kenti","Clandras Köprüsü","Mesotimolos antik kenti","Taşyaran Vadisi","Ulubey Kanyonu"};

    private  String[] van65 = {"Adır Kilisesi","Akdamar Adası","Ayanis Kalesi","Başkalede Peri Bacaları","Cilo Dağı","Erciş Dikilitaş Kümbeti","Erçek Gölü Flamingo Festivali","Gevaş İnköy ve Ağun Köyü","Van Gölü","Güzelsu Yedi Salkım köyü","Hoşap Kalesi","Van İskelesi","Muradiye Şelalesi","St. Bartholomeus Kilisesi","Şeytan Köprüsü","Zernek Kalesi"};

    private  String[] yozgat66 = {"Aydıncık Kazankaya Kanyonu","Çeşka Kalesi","erkenes Harabeleri","Muşalikalesi Köyü","Sarıkaya Roma Hamamı","Sorgun Şahmuratlı Köyü","Topaç köyü Tırazın Kayalıkları"};

    private  String[] zonguldak67 = {"Cehennemağzı Mağaraları","Cumayanı Mağarası","Çayır Köyü Su Mağarası","Filyos Antik Kenti","Gökgöl Mağarası","Gümeli 4114 yaşındaki porsuk ağacı","Kızılcapınar Baraj Gölü","Kozlu Değirmenağzı şelaleleri","Ölüce Deniz Feneri","Sofular Mağarası"};

    private  String[] aksaray68 ={"Ağaçaltı Kilisesi","Belisırma köyü","Eğri Minare","Hasan dağı","Ihlara Vadisi","Kızıl Kilise","Nora Antik Kenti","Pürenli Kilisesi","Saratlı Kırkgöz Yeraltı Şehri","Yılanlı Kilise"};

    private String[] bayburt69 = {"Of Yolu","D915 yolu","Çımağıl Mağarası", "Çoruh Nehri","Demirözü","Soğanlı geçidi"};

    private  String[] karaman70 = { "Ermenek yaylası","Karadağ Başdağ Kalesi"," Maden şehri Ören","Sarıkeçeli yörükleri","Tavşanlı Taş Kale"};

    private  String[] kirikkale71 = {"Büklükale Ören Yeri","Çeşnigir Caddesi","Kızılırmak Havzası","Sulu Mağara Watery Cave"};

    private  String[] batman72 =    {"Artuklu Hamamı","Hasankeyf Kalesi","Kasır Rabi","Malabadi Köprüsü"};

    private String [] sirnak73 = {"Mor Gabriel Manastırı","Saat Kulesi","Savaşçı Figürü Rölyefi","Cizre Lunaparkı"};

    private String[] bartın74 = {"Amasra Amastris Antik Kenti","Amasra Kalesi","Amasra Kuş Kayası Yol Anıtı","Amasra","Çilek Festivali","Gölderesi Şelalesi"};

    private  String[] ardahan75 = {"Akçakale Ada Şehri Kalıntıları","Arsiyan Yaylası","Buz Tutmuş Çıldır Gölü","Harosman Mağaraları","Kinzi Kalesi","Şeytan Kalesi"};

    private String[] igdir76 = {"Ahura Harabeleri","Karakale Harabesi","Meteor (Göktaşı) Çukuru","Tuzluca Tuz Mağaraları"};

    private  String[] yalova77 = {"Armutlu","Delmece Yaylası","Dipsiz gölü","Erikli ve ikiz Şelaleleri","Karaca Arboretumunu","Sudüşen Şelalesi","Yürüyen Köşk"};

    private String[] karabuk78 = {"Cihad Dağı","Hadrianapolis Antik Kenti","İncekaya Kanyonu","Konarı Köyü ve Sırçalı Kanyonu","Safranbolu Evleri","Safranbolu Kristal Teras","Safranbolu Yörük köyü","Tokatlı Kanyonu","Yenice Ormanları"};

    private String[] kilis79 = {"Oylum Höyüğü","Ravanda Kalesi","Salih Efendi Sokağı"};

    private  String[] osmaniye80 = {"Arslanbey köyü ve müzesi","Düziçi Karasu Şelalesi","Maksutoğlu Yaylası","Tatarlı köyü","Toprakkale"};

    private String[] duzce81 = {"Efteni Gölü","Fakıllı mağarası","Güzeldere şelalesi","Harmankaya Şelalesi","Kardüz Yaylası","Kirpe Kanyonu","Konuralp Müzesi","Mamatlar Yaylası 1000 yaşındaki meşe ağacı","Melen çayı","Pürenli Yaylası","Saklıkent Şelalesi","Torkul Gölü ve yaylası","Yılançatı Tabiat Parkı"};








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        listView = (ListView) findViewById(R.id.listView);

        Intent intent = getIntent();

        String alinanVeri = intent.getStringExtra("il").toString();

        // SEÇİLEN İL'E GÖRE LİSTVİEW'DE GÖSTERİLECEK DİZİYİ BELİRLEMEK.
        if (alinanVeri.equals("01 Adana")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, adana01);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",adana01[position]);
                    startActivity(intent);

                }
            });

        } else if (alinanVeri.equals("02 Adıyaman")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, adiyaman02);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",adiyaman02[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("03 Afyon")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, afyonkarahisar03);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",afyonkarahisar03[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("04 Ağrı")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, agri04);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",agri04[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("05 Amasya")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, amasya05);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",amasya05[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("06 Ankara")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, ankara06);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",ankara06[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("07 Antalya")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, antalya07);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",antalya07[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("08 Artvin")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, artvin08);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",artvin08[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("09 Aydın")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, aydin09);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",aydin09[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("10 Balıkesir")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, balikesir10);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",balikesir10[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("11 Bilecik")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, bilecik11);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",bilecik11[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("12 Bingöl")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, bingol12);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",bingol12[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("13 Bitlis")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, bitlis13);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",bitlis13[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("14 Bolu")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, bolu14);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",bolu14[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("15 Burdur")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, burdur15);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",burdur15[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("16 Bursa")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, bursa16);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",bursa16[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("17 Çanakkale")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, canakkale17);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",canakkale17[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("18 Çankırı")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, cankiri18);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",cankiri18[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("19 Çorum")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, corum19);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",corum19[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("20 Denizli")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, denizli20);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",denizli20[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("21 Diyarbakır")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, diyarbakir21);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",diyarbakir21[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("22 Edirne")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, edirne22);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",edirne22[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("23 Elazığ")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, elazig23);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",elazig23[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("24 Erzincan")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, erzincan24);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",erzincan24[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("25 Erzurum")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, erzurum25);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",erzurum25[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("26 Eskişehir")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, eskisehir26);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",eskisehir26[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("27 Gaziantep")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, gaziantep27);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",gaziantep27[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("28 Giresun")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, giresun28);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",giresun28[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("29 Gümüşhane")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, gumushane29);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",gumushane29[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("30 Hakkari")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, hakkari30);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",hakkari30[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("31 Hatay")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, hatay31);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",hatay31[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("32 Isparta")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, isparta32);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",isparta32[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("33 İçel")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, mersin33);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",mersin33[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("34 İstanbul")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, istanbul34);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",istanbul34[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("35 İzmir")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, izmir35);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",izmir35[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("36 Kars")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kars36);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kars36[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("37 Kastamonu")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kastamonu37);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kastamonu37[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("38 Kayseri")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kayseri38);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kayseri38[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("39 Kırklareli")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kirklareli39);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kirklareli39[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("40 Kırşehir")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kirsehir40);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kirsehir40[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("41 Kocaeli")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kocaeli41);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kocaeli41[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("42 Konya")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, konya42);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",konya42[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("43 Kutahya")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kutahya43);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kutahya43[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("45 Manisa")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, manisa45);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",manisa45[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("46 K.maraş")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kmaras46);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kmaras46[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("47 Mardin")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, mardin47);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",mardin47[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("48 Muğla")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, mugla48);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",mugla48[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("49 Muş")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, mus49);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",mus49[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("50 Nevşehir")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, nevsehir50);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",nevsehir50[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("51 Niğde")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, nigde51);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",nigde51[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("52 Ordu")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, ordu52);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",ordu52[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("53 Rize")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, rize53);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",rize53[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("54 Sakarya")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, sakarya54);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",sakarya54[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("55 Samsun")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, samsun55);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",samsun55[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("56 Siirt")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, siirt56);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",siirt56[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("57 Sinop")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, sinop57);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",sinop57[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("58 Sivas")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, sivas58);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",sivas58[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("59 Tekirdağ")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, tekirdag59);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",tekirdag59[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("60 Tokat")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, tokat60);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",tokat60[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("61 Trabzon")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, trabzon61);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",trabzon61[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("62 Tunceli")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, tunceli62);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",tunceli62[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("63 Şanlıurfa")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, sanliurfa63);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",sanliurfa63[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("64 Uşak")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, usak64);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",usak64[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("65 Van")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, van65);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",van65[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("66 Yozgat")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, yozgat66);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",yozgat66[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("67 Zonguldak")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, zonguldak67);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",zonguldak67[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("68 Aksaray")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, aksaray68);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",aksaray68[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("69 Bayburt")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, bayburt69);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",bayburt69[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("70 Karaman")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, karaman70);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",karaman70[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("71 Kırıkkale")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kirikkale71);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kirikkale71[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("72 Batman")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, batman72);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",batman72[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("73 Şırnak")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, sirnak73);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",sirnak73[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("74 Bartın")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, bartın74);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",bartın74[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("75 Ardahan")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, ardahan75);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",ardahan75[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("76 Iğdır")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, igdir76);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",igdir76[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("77 Yalova")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, yalova77);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",yalova77[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("78 Karabük")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, karabuk78);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",karabuk78[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("79 Kilis")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, kilis79);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",kilis79[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("80 Osmaniye")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, osmaniye80);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",osmaniye80[position]);
                    startActivity(intent);

                }
            });
        } else if (alinanVeri.equals("81 Düzce")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, duzce81);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                    intent.putExtra("il",duzce81[position]);
                    startActivity(intent);

                }
            });
        }











    }
}
