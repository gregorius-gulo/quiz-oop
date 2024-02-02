
package quiz;


public class Mobil extends Kendaraan {
    
    public Mobil(String jenis, int tahunProduksi) {
        super(jenis, tahunProduksi);
    }
    
    public void berjalan(){
        System.out.println("Mobil Melaju di Jalan Raya");  
    }
    
}
