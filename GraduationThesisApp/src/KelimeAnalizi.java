import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class KelimeAnalizi {

	public static void main(String[] args) throws IOException {
		//Ýlgili Siteler
		sitedenOku("http://www.cu.edu.tr/tr/detay.aspx?pageId=800", "C:\\Users\\User\\Desktop\\liste.txt");//Okunacak site,yazýlacak dosya.
		dosyadanOku("C:\\Users\\User\\Desktop\\liste.txt", "C:\\Users\\User\\Desktop\\analiz1.txt");//Okunacak dosya,analiz yazýlacak dosya
		sitedenOku("http://www.itu.edu.tr/itu-hakkinda/genel/genel-bilgiler", "C:\\Users\\User\\Desktop\\liste2.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste2.txt", "C:\\Users\\User\\Desktop\\analiz2.txt");
		sitedenOku("http://www.ktu.edu.tr/ktu-tarihce", "C:\\Users\\User\\Desktop\\liste3.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste3.txt", "C:\\Users\\User\\Desktop\\analiz3.txt");
		sitedenOku("http://www.boun.edu.tr/tr-TR/Content/Genel/Tarihce", "C:\\Users\\User\\Desktop\\liste4.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste4.txt", "C:\\Users\\User\\Desktop\\analiz4.txt");
		sitedenOku("http://www.metu.edu.tr/tr/tarihce", "C:\\Users\\User\\Desktop\\liste5.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste5.txt", "C:\\Users\\User\\Desktop\\analiz5.txt");
		sitedenOku("http://www.hacettepe.edu.tr/hakkinda/tarihce", "C:\\Users\\User\\Desktop\\liste6.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste6.txt", "C:\\Users\\User\\Desktop\\analiz6.txt");
		sitedenOku("https://www.ankara.edu.tr/kurumsal/tanitim/tarihce/", "C:\\Users\\User\\Desktop\\liste7.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste7.txt", "C:\\Users\\User\\Desktop\\analiz7.txt");
		sitedenOku("http://w3.bilkent.edu.tr/www/tarihce/", "C:\\Users\\User\\Desktop\\liste8.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste8.txt", "C:\\Users\\User\\Desktop\\analiz8.txt");
		sitedenOku("https://www.ogu.edu.tr/Icerik/Index/10/universitemizin-tarihcesi", "C:\\Users\\User\\Desktop\\liste9.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste9.txt", "C:\\Users\\User\\Desktop\\analiz9.txt");
		sitedenOku("https://www.anadolu.edu.tr/universitemiz/kurumsal/hakkinda", "C:\\Users\\User\\Desktop\\liste10.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste10.txt", "C:\\Users\\User\\Desktop\\analiz10.txt");
		//Ýlgisiz Siteler
		sitedenOku("http://www.alltheways.com.tr/", "C:\\Users\\User\\Desktop\\liste11.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste11.txt", "C:\\Users\\User\\Desktop\\analiz11.txt");
		sitedenOku("https://www.aorhan.com/hakkinda", "C:\\Users\\User\\Desktop\\liste12.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste12.txt", "C:\\Users\\User\\Desktop\\analiz12.txt");
		sitedenOku("https://www.benlacivert.com/hakkimda/", "C:\\Users\\User\\Desktop\\liste13.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste13.txt", "C:\\Users\\User\\Desktop\\analiz13.txt");
		sitedenOku("https://www.blogacmak.com/", "C:\\Users\\User\\Desktop\\liste14.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste14.txt", "C:\\Users\\User\\Desktop\\analiz14.txt");
		sitedenOku("https://www.egonomik.com/hakkinda/", "C:\\Users\\User\\Desktop\\liste15.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste15.txt", "C:\\Users\\User\\Desktop\\analiz15.txt");
		sitedenOku("https://fozdemir.com/fatih-ozdemir", "C:\\Users\\User\\Desktop\\liste16.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste16.txt", "C:\\Users\\User\\Desktop\\analiz16.txt");	
		sitedenOku("https://www.hizliadam.com/hakkimda", "C:\\Users\\User\\Desktop\\liste17.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste17.txt", "C:\\Users\\User\\Desktop\\analiz17.txt");	
		sitedenOku("https://kelimelerbenim.com/ben-neymisim", "C:\\Users\\User\\Desktop\\liste18.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste18.txt", "C:\\Users\\User\\Desktop\\analiz18.txt");	
		sitedenOku("http://www.mehmetcabar.com/hakkimda/", "C:\\Users\\User\\Desktop\\liste19.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste19.txt", "C:\\Users\\User\\Desktop\\analiz19.txt");	
		sitedenOku("http://mehmetergenoglu.com/hakkimda/", "C:\\Users\\User\\Desktop\\liste20.txt");
		dosyadanOku("C:\\Users\\User\\Desktop\\liste20.txt", "C:\\Users\\User\\Desktop\\analiz20.txt");		
		
		//Kelime Analizi ve Arff dosyasý oluþturma
		kelimelerDigerDosyalardaVarmi("C:\\Users\\User\\Desktop\\analiz1.txt", "C:\\Users\\User\\Desktop\\analiz2.txt", "C:\\Users\\User\\Desktop\\analiz3.txt", "C:\\Users\\User\\Desktop\\analiz4.txt", "C:\\Users\\User\\Desktop\\analiz5.txt",
				"C:\\Users\\User\\Desktop\\analiz6.txt","C:\\Users\\User\\Desktop\\analiz7.txt","C:\\Users\\User\\Desktop\\analiz8.txt","C:\\Users\\User\\Desktop\\analiz9.txt","C:\\Users\\User\\Desktop\\analiz10.txt",
				"C:\\Users\\User\\Desktop\\analiz11.txt","C:\\Users\\User\\Desktop\\analiz12.txt","C:\\Users\\User\\Desktop\\analiz13.txt","C:\\Users\\User\\Desktop\\analiz14.txt","C:\\Users\\User\\Desktop\\analiz15.txt",
				"C:\\Users\\User\\Desktop\\analiz16.txt","C:\\Users\\User\\Desktop\\analiz17.txt","C:\\Users\\User\\Desktop\\analiz18.txt","C:\\Users\\User\\Desktop\\analiz19.txt","C:\\Users\\User\\Desktop\\analiz20.txt");
	}

	//Jsoup kütüphanesini kullanarak ismi yazýlan siteden p taglarýný okur.
	private static void sitedenOku(String site, String dosya) {
		try {
			Document doc = Jsoup.connect(site).get();
			Elements paragraf = doc.select("p");

			for (Element e : paragraf) {
				dosyayaYaz(dosya, e.text());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Txt dosyasýna veri yazmak için kullanýlýr.
	private static void dosyayaYaz(String dosya, String data) throws IOException {
		File file = new File(dosya);
		FileWriter fr = new FileWriter(file.getAbsoluteFile(), true);

		BufferedWriter writer = new BufferedWriter(fr);

		writer.write(data);
		writer.newLine();
		writer.close();
	}

	// Dosyadan Okuyup Kelimeleri Tek Tek Analiz Dosyasýna yazdýrýr.
	private static void dosyadanOku(String okunacakDosya, String yazilacakDosya)
			throws FileNotFoundException, IOException {
		File file = new File(okunacakDosya);
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		String satir = reader.readLine();

		
		while (satir != null) {
			StringTokenizer st = new StringTokenizer(satir);

			while (st.hasMoreTokens()) {
				analizYaz(st.nextToken(), yazilacakDosya);
			}
			satir = reader.readLine();
		}
		reader.close();
	}

	// Kelimeleri tek tek analiz dosyasýna yazdýrmak için kullanýlýr.
	private static void analizYaz(String data, String dosya) throws IOException {
		// File file=new File("C:\\Users\\User\\Desktop\\veriAnalizi.txt");
		File file = new File(dosya);
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter writer = new BufferedWriter(fr);
		writer.write(data);
		writer.newLine();
		writer.close();

	}

	//Herbir dosyayý tek tek okur,listelere ekler,arff için fonksiyonlara gönderir.Ayrýca okuduðu dosyalardan attribute listesi de çýkarýr.
	private static void kelimelerDigerDosyalardaVarmi(String dosya1, String dosya2, String dosya3, String dosya4,String dosya5,String dosya6,String dosya7
			,String dosya8,String dosya9,String dosya10,String dosya11,String dosya12,String dosya13,String dosya14,String dosya15,String dosya16,
			String dosya17,String dosya18,String dosya19,String dosya20) throws FileNotFoundException, IOException {

		//Her bir dosya için bir liste oluþturuyoruz.
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<String>();
		ArrayList<String> list6 = new ArrayList<String>();
		ArrayList<String> list7 = new ArrayList<String>();
		ArrayList<String> list8 = new ArrayList<String>();
		ArrayList<String> list9 = new ArrayList<String>();
		ArrayList<String> list10 = new ArrayList<String>();
		ArrayList<String> list11 = new ArrayList<String>();
		ArrayList<String> list12 = new ArrayList<String>();
		ArrayList<String> list13 = new ArrayList<String>();
		ArrayList<String> list14 = new ArrayList<String>();
		ArrayList<String> list15 = new ArrayList<String>();
		ArrayList<String> list16 = new ArrayList<String>();
		ArrayList<String> list17 = new ArrayList<String>();
		ArrayList<String> list18 = new ArrayList<String>();
		ArrayList<String> list19 = new ArrayList<String>();
		ArrayList<String> list20 = new ArrayList<String>();

		//Her bir dosyayý okumak ve listelere atmak için okuma iþlemlerini yapýyoruz.
		File file1 = new File(dosya1);
		BufferedReader reader1 = null;
		reader1 = new BufferedReader(new FileReader(file1));
		String satir1 = reader1.readLine();

		File file2 = new File(dosya2);
		BufferedReader reader2 = null;
		reader2 = new BufferedReader(new FileReader(file2));
		String satir2 = reader2.readLine();

		File file3 = new File(dosya3);
		BufferedReader reader3 = null;
		reader3 = new BufferedReader(new FileReader(file3));
		String satir3 = reader3.readLine();

		File file4 = new File(dosya4);
		BufferedReader reader4 = null;
		reader4 = new BufferedReader(new FileReader(file4));
		String satir4 = reader4.readLine();

		File file5 = new File(dosya5);
		BufferedReader reader5 = null;
		reader5 = new BufferedReader(new FileReader(file5));
		String satir5 = reader5.readLine();
		
		File file6 = new File(dosya6);
		BufferedReader reader6 = null;
		reader6 = new BufferedReader(new FileReader(file6));
		String satir6 = reader6.readLine();

		File file7 = new File(dosya7);
		BufferedReader reader7 = null;
		reader7 = new BufferedReader(new FileReader(file7));
		String satir7 = reader7.readLine();

		File file8 = new File(dosya8);
		BufferedReader reader8 = null;
		reader8 = new BufferedReader(new FileReader(file8));
		String satir8 = reader8.readLine();

		File file9 = new File(dosya9);
		BufferedReader reader9 = null;
		reader9 = new BufferedReader(new FileReader(file9));
		String satir9 = reader9.readLine();

		File file10 = new File(dosya10);
		BufferedReader reader10 = null;
		reader10 = new BufferedReader(new FileReader(file10));
		String satir10 = reader10.readLine();
		
		File file11 = new File(dosya11);
		BufferedReader reader11 = null;
		reader11 = new BufferedReader(new FileReader(file11));
		String satir11 = reader11.readLine();
		
		File file12 = new File(dosya12);
		BufferedReader reader12 = null;
		reader12 = new BufferedReader(new FileReader(file12));
		String satir12 = reader12.readLine();
		
		File file13 = new File(dosya13);
		BufferedReader reader13 = null;
		reader13 = new BufferedReader(new FileReader(file13));
		String satir13 = reader13.readLine();
		
		File file14 = new File(dosya14);
		BufferedReader reader14 = null;
		reader14 = new BufferedReader(new FileReader(file14));
		String satir14 = reader14.readLine();
		
		File file15 = new File(dosya15);
		BufferedReader reader15 = null;
		reader15 = new BufferedReader(new FileReader(file15));
		String satir15 = reader15.readLine();
		
		File file16 = new File(dosya16);
		BufferedReader reader16 = null;
		reader16 = new BufferedReader(new FileReader(file16));
		String satir16 = reader16.readLine();
		
		File file17 = new File(dosya17);
		BufferedReader reader17 = null;
		reader17 = new BufferedReader(new FileReader(file17));
		String satir17 = reader17.readLine();
		
		File file18 = new File(dosya18);
		BufferedReader reader18 = null;
		reader18 = new BufferedReader(new FileReader(file18));
		String satir18 = reader18.readLine();
		
		File file19 = new File(dosya19);
		BufferedReader reader19 = null;
		reader19 = new BufferedReader(new FileReader(file19));
		String satir19 = reader19.readLine();
		
		File file20 = new File(dosya20);
		BufferedReader reader20 = null;
		reader20 = new BufferedReader(new FileReader(file20));
		String satir20 = reader20.readLine();

		// While döngüsü 5 dosyayý da okuyup ayrý ayrý listelere yazmayý saðlar.
		while (satir1 != null) {
			StringTokenizer st = new StringTokenizer(satir1);

			while (st.hasMoreTokens()) {
				list1.add(st.nextToken());
			}

			satir1 = reader1.readLine();
		}
		reader1.close();

		while (satir2 != null) {
			StringTokenizer st = new StringTokenizer(satir2);

			while (st.hasMoreTokens()) {
				list2.add(st.nextToken());
			}
			satir2 = reader2.readLine();
		}
		reader2.close();
		while (satir3 != null) {
			StringTokenizer st = new StringTokenizer(satir3);

			while (st.hasMoreTokens()) {
				list3.add(st.nextToken());
			}
			satir3 = reader3.readLine();
		}
		reader3.close();
		while (satir4 != null) {
			StringTokenizer st = new StringTokenizer(satir4);

			while (st.hasMoreTokens()) {
				list4.add(st.nextToken());
			}
			satir4 = reader4.readLine();
		}
		reader4.close();
		while (satir5 != null) {
			StringTokenizer st = new StringTokenizer(satir5);

			while (st.hasMoreTokens()) {
				list5.add(st.nextToken());
			}
			satir5 = reader5.readLine();
		}
		reader5.close();
		
		while (satir6 != null) {
			StringTokenizer st = new StringTokenizer(satir6);

			while (st.hasMoreTokens()) {
				list6.add(st.nextToken());
			}
			satir6 = reader6.readLine();
		}
		reader6.close();
		
		while (satir7 != null) {
			StringTokenizer st = new StringTokenizer(satir7);

			while (st.hasMoreTokens()) {
				list7.add(st.nextToken());
			}
			satir7 = reader7.readLine();
		}
		reader7.close();
		
		while (satir8 != null) {
			StringTokenizer st = new StringTokenizer(satir8);

			while (st.hasMoreTokens()) {
				list8.add(st.nextToken());
			}
			satir8 = reader8.readLine();
		}
		reader8.close();
		
		while (satir9 != null) {
			StringTokenizer st = new StringTokenizer(satir9);

			while (st.hasMoreTokens()) {
				list9.add(st.nextToken());
			}
			satir9 = reader9.readLine();
		}
		reader9.close();
		
		while (satir10 != null) {
			StringTokenizer st = new StringTokenizer(satir10);

			while (st.hasMoreTokens()) {
				list10.add(st.nextToken());
			}
			satir10 = reader10.readLine();
		}
		reader10.close();
		
		while (satir11 != null) {
			StringTokenizer st = new StringTokenizer(satir11);

			while (st.hasMoreTokens()) {
				list11.add(st.nextToken());
			}
			satir11 = reader11.readLine();
		}
		reader11.close();
		
		while (satir12 != null) {
			StringTokenizer st = new StringTokenizer(satir12);

			while (st.hasMoreTokens()) {
				list12.add(st.nextToken());
			}
			satir12 = reader12.readLine();
		}
		reader12.close();
		
		while (satir13 != null) {
			StringTokenizer st = new StringTokenizer(satir13);

			while (st.hasMoreTokens()) {
				list13.add(st.nextToken());
			}
			satir13 = reader13.readLine();
		}
		reader13.close();
		
		while (satir14 != null) {
			StringTokenizer st = new StringTokenizer(satir14);

			while (st.hasMoreTokens()) {
				list14.add(st.nextToken());
			}
			satir14 = reader14.readLine();
		}
		reader14.close();
		
		while (satir15 != null) {
			StringTokenizer st = new StringTokenizer(satir15);

			while (st.hasMoreTokens()) {
				list15.add(st.nextToken());
			}
			satir15 = reader15.readLine();
		}
		reader15.close();
		
		while (satir16 != null) {
			StringTokenizer st = new StringTokenizer(satir16);

			while (st.hasMoreTokens()) {
				list16.add(st.nextToken());
			}
			satir16 = reader16.readLine();
		}
		reader16.close();
		
		while (satir17 != null) {
			StringTokenizer st = new StringTokenizer(satir17);

			while (st.hasMoreTokens()) {
				list17.add(st.nextToken());
			}
			satir17 = reader17.readLine();
		}
		reader17.close();
		
		while (satir18 != null) {
			StringTokenizer st = new StringTokenizer(satir18);

			while (st.hasMoreTokens()) {
				list18.add(st.nextToken());
			}
			satir18 = reader18.readLine();
		}
		reader18.close();
		
		while (satir19 != null) {
			StringTokenizer st = new StringTokenizer(satir19);

			while (st.hasMoreTokens()) {
				list19.add(st.nextToken());
			}
			satir19 = reader19.readLine();
		}
		reader19.close();
		
		while (satir20 != null) {
			StringTokenizer st = new StringTokenizer(satir20);

			while (st.hasMoreTokens()) {
				list20.add(st.nextToken());
			}
			satir20 = reader20.readLine();
		}
		reader20.close(); //20 dosyayý da okuyup ayrý ayrý listelere atadýk.

		HashSet<String> attributeList=new HashSet<>(); //Attribute olan kelimeleri almak için kullanýlýr.Tekrarlý veri barýndýrmasýn diye hashset kullandýk.
		//En az 2 dosyada kullanýlan kelimeleri attribute listesine atar.
		//Sadece ilgili olan ilk 10 dosyadaki kelimeleri baz alýr.
		for(int i=0; i<list1.size(); i++) {
			if(list2.contains(list1.get(i)) || list3.contains(list1.get(i)) || list4.contains(list1.get(i)) || list5.contains(list1.get(i))) {
				attributeList.add(list1.get(i));
			}
		}
		for(int i=0; i<list2.size(); i++) {
			if(list1.contains(list2.get(i)) || list3.contains(list2.get(i)) || list4.contains(list2.get(i)) || list5.contains(list2.get(i))) {
				attributeList.add(list2.get(i));
			}
		}
		for(int i=0; i<list3.size(); i++) {
			if(list1.contains(list3.get(i)) || list2.contains(list3.get(i)) || list4.contains(list3.get(i)) || list5.contains(list3.get(i))) {
				attributeList.add(list3.get(i));
			}
		}
		
		for(int i=0; i<list4.size(); i++) {
			if(list1.contains(list4.get(i)) || list2.contains(list4.get(i)) || list3.contains(list4.get(i)) || list5.contains(list4.get(i))) {
				attributeList.add(list4.get(i));
			}
		}
		
		for(int i=0; i<list5.size(); i++) {
			if(list1.contains(list5.get(i)) || list2.contains(list5.get(i)) || list3.contains(list5.get(i)) || list4.contains(list5.get(i))) {
				attributeList.add(list5.get(i));
			}
		}
		
		for(int i=0; i<list6.size(); i++) {
			if(list7.contains(list6.get(i)) || list8.contains(list6.get(i)) || list9.contains(list6.get(i)) || list10.contains(list6.get(i))) {
				attributeList.add(list6.get(i));
			}
		}
		for(int i=0; i<list7.size(); i++) {
			if(list6.contains(list7.get(i)) || list8.contains(list7.get(i)) || list9.contains(list7.get(i)) || list10.contains(list7.get(i))) {
				attributeList.add(list7.get(i));
			}
		}
		for(int i=0; i<list8.size(); i++) {
			if(list6.contains(list8.get(i)) || list7.contains(list8.get(i)) || list9.contains(list8.get(i)) || list10.contains(list8.get(i))) {
				attributeList.add(list8.get(i));
			}
		}
		
		for(int i=0; i<list9.size(); i++) {
			if(list6.contains(list9.get(i)) || list7.contains(list9.get(i)) || list8.contains(list9.get(i)) || list10.contains(list9.get(i))) {
				attributeList.add(list9.get(i));
			}
		}
		
		for(int i=0; i<list10.size(); i++) {
			if(list6.contains(list10.get(i)) || list7.contains(list10.get(i)) || list8.contains(list10.get(i)) || list9.contains(list10.get(i))) {
				attributeList.add(list10.get(i));
			}
		}
		
		ArrayList<String> yeniAttributeList=new ArrayList<>();//Hashsetteki verileri normal String listesine atar.
		yeniAttributeList.addAll(attributeList);
		
		arffOlustur(yeniAttributeList, list1, list2, list3, list4, list5,list6,list7,list8,list9,list10);//ilgili olan dosyalarýn analizini arffye gönderir.
		ilgisizleriArffyeEkle(yeniAttributeList, list11, list12, list13, list14, list15,list16,list17,list18,list19,list20);//ilgisiz dosyalarý arffye gönderir.
		
	}

	//Ýlgili dosyalarý arff dosyasýna ekleyip, attribute'larýn her bir dosyada kaçar defa geçtiðini ve yanýna R (Related) ekleyip yazar.
	private static void arffOlustur(List<String> attributeList,List<String>  liste1,List<String>  liste2,List<String>  liste3,List<String>  liste4,List<String>  liste5,List<String> 
	liste6,List<String> liste7,List<String> liste8,List<String> liste9,List<String> liste10)
			throws IOException {
		File file;
		file = new File("C:\\Users\\User\\Desktop\\arff.txt");// Yeni yazacaðýmýz dosya ismi.(arff formatý için.)
		FileWriter fr = new FileWriter(file.getAbsoluteFile(), true);
		BufferedWriter writer = new BufferedWriter(fr);

		writer.newLine();
		writer.write("@RELATION VeriAnalizi ");
		writer.newLine();
		writer.newLine();
		for(int i=0;i<attributeList.size(); i++) {
			writer.write("@ATTRIBUTE "+attributeList.get(i)+" REAL" );
			writer.newLine();
		}
		writer.write("@ATTRIBUTE class " + "{R,N}");
		writer.newLine();
		writer.newLine();
		writer.write("@DATA");
		writer.newLine();
		writer.newLine();

		int s=0;
		HashMap<String, Integer> kacKereKullanildi=new HashMap<>();//Her bir attribute kelimesinin her bir dosyada kaçar kez kullanýldýðýný hesaplar.
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste1.size(); j++) {
				if(attributeList.get(i).equals(liste1.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s); //Eðer attribute olan kelime o dosyada hiç kullanýlmadýysa 0 yazar.
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );//Attribute kelimenin o dosyada kaç kez kullanýldýðýný arff dosyasýna yazar.
		}
		writer.write("R");//Ýlk 10 dosya ilgili dosya olduðu için yanýna R yazar.
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste2.size(); j++) {
				if(attributeList.get(i).equals(liste2.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("R");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste3.size(); j++) {
				if(attributeList.get(i).equals(liste3.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+",");
		}
		writer.write("R");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste4.size(); j++) {
				if(attributeList.get(i).equals(liste4.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+",");
			
		}
		writer.write("R");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste5.size(); j++) {
				if(attributeList.get(i).equals(liste5.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+",");
		}
		writer.write("R");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste6.size(); j++) {
				if(attributeList.get(i).equals(liste6.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+",");
		}
		writer.write("R");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste7.size(); j++) {
				if(attributeList.get(i).equals(liste7.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+",");
		}
		writer.write("R");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste8.size(); j++) {
				if(attributeList.get(i).equals(liste8.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+",");
		}
		writer.write("R");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste9.size(); j++) {
				if(attributeList.get(i).equals(liste9.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+",");
		}
		writer.write("R");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<liste10.size(); j++) {
				if(attributeList.get(i).equals(liste10.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+",");
		}
		writer.write("R");
		
		
		
		System.out.println(attributeList.size());
		System.out.println(attributeList);
		System.out.println(kacKereKullanildi);
		writer.close();
	}
	
	//Ýlgisiz olan dosyalarý arff dosyasýna ekleyip,attribute kelimelerin bu dosyalarda kaç defa kullanýldýðýný bulup,yanlarýna N (Nonrelated) yazar.
	private static void ilgisizleriArffyeEkle(List<String> attributeList,List<String> list1,List<String> list2,List<String> list3,List<String> list4,List<String> list5,
			List<String> list6,List<String> list7,List<String> list8,List<String> list9,List<String> list10) throws IOException {
		File file;
		file = new File("C:\\Users\\User\\Desktop\\arff.txt");
		FileWriter fr = new FileWriter(file.getAbsoluteFile(), true);
		BufferedWriter writer = new BufferedWriter(fr);
		
		writer.newLine();
		int s=0;
		HashMap<String, Integer> kacKereKullanildi=new HashMap<>(); //Attribute kelimelerin bu dosyalarda kaçar kez kullanýldýðýný yazar.
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list1.size(); j++) {
				if(attributeList.get(i).equals(list1.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);//Eðer hiç kullanýlmamýþsa 0 yazar.
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );//Attribute'in o dosyada kaç kez kullanýldýðýný yazar.
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list2.size(); j++) {
				if(attributeList.get(i).equals(list2.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list3.size(); j++) {
				if(attributeList.get(i).equals(list3.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list4.size(); j++) {
				if(attributeList.get(i).equals(list4.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list5.size(); j++) {
				if(attributeList.get(i).equals(list5.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list6.size(); j++) {
				if(attributeList.get(i).equals(list6.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list7.size(); j++) {
				if(attributeList.get(i).equals(list7.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list8.size(); j++) {
				if(attributeList.get(i).equals(list8.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list9.size(); j++) {
				if(attributeList.get(i).equals(list9.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.newLine();
		kacKereKullanildi.clear();
		for(int i=0; i<attributeList.size();i++) {
			for(int j=0; j<list10.size(); j++) {
				if(attributeList.get(i).equals(list10.get(j))) {
					s++;
					kacKereKullanildi.put((String) attributeList.get(i), s);
				}
				else {
					kacKereKullanildi.put((String) attributeList.get(i),s);
				}
			}
			s=0;
			writer.write(kacKereKullanildi.get(attributeList.get(i))+"," );
		}
		writer.write("N");
		writer.close();
		
	}

}
