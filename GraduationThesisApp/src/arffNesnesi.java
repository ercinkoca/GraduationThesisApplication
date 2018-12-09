
public class arffNesnesi {

	private String sayi;
    private String kelime;
    private String dosya;
    private String claslar;

  

    public arffNesnesi(String sayi, String kelime, String dosya) {
        this.sayi = sayi;
        this.kelime = kelime;
        this.dosya = dosya;
    }

    arffNesnesi() {
        sayi="";
        kelime="";
        dosya="";
        claslar=null;
    }
    
    public String getSayi() {
        return sayi;
    }

    public void setSayi(String sayi) {
        this.sayi = sayi;
    }

    public String getKelime() {
        return kelime;
    }

    public void setKelime(String kelime) {
        this.kelime = kelime;
    }

    public String getDosya() {
        return dosya;
    }

    public void setDosya(String dosya) {
        this.dosya = dosya;
    }
    
      public String getClaslar() {
        return claslar;
    }

    public void setClaslar(String claslar) {
        this.claslar = claslar;
    }
}
