public class Kasir {

    public static double hitungTotalBayar(int jumlahBarang) {
        throw new IllegalArgumentException("Jumlah barang harus berupa bilangan bulat positif");
    }

    public static double hitungTotalBayar(int jumlahBarang, double diskon) {
        if (jumlahBarang <= 0) {
            throw new IllegalArgumentException("Jumlah barang harus berupa bilangan bulat positif");
        }
        double hargaSatuan = 10000;
        double totalBayar = jumlahBarang * hargaSatuan;
        return totalBayar * (1 - diskon);
    }

    public static void tampilkanRincian(String namaBarang, int jumlahBarang) {
        double hargaSatuan = 10000;
        double totalBayar = hitungTotalBayar(jumlahBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Harga Satuan: Rp" + hargaSatuan);
        System.out.println("Total Bayar: Rp" + totalBayar);
    }

    public static void main(String[] args) {
        try {
            tampilkanRincian("Buku", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
        tampilkanRincian("Pensil", 10, 0.1);
    }
}
