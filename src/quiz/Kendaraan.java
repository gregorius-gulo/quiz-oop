
package quiz;


public class Kendaraan {
    private String jenis;
    private int tahunProduksi;
    
    public Kendaraan(String jenis, int tahunProduksi){
        this.jenis = jenis;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void berjalan(){
        System.out.println("Kendaraan Sedang Berjalan");
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public int gettahunProduksi(){
        return tahunProduksi;
    }
}
