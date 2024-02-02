
package quiz;


public class Quiz {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Kendaraan kendaraan1 = new Mobil("Sedan", 2022);
        Kendaraan kendaraan2 = new Sepeda("BMX", 2020);
        
        System.out.println("Jenis Kendaraan 1: " + kendaraan1.getJenis()+ ", Tahun Produksi: "+kendaraan1.gettahunProduksi());
        kendaraan1.berjalan();
        
         System.out.println("Jenis Kendaraan 1: " + kendaraan2.getJenis()+ ", Tahun Produksi: "+kendaraan1.gettahunProduksi());
        kendaraan2.berjalan();
    }
    
}
