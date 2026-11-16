public class BankSolid {
    public static void main(String[] args) {
        Rekening[] semua = {
                new Tabungan(101, "Ani", 1000000, 2.5),
                new Tabungan(102, "Citra", 300000, 2.0),
                new Giro(201, "Budi", 200000, 500000),
                new Deposito(301, "Dewi", 5000000, 4.0)
        };

        LaporanBank.cetakDaftar("REKENING AWAL", semua);

        // Proses akhir bulan (simulasi potong admin & tambah bunga)
        for (Rekening r : semua) {
            if (r instanceof Berbunga) {
                // Jalankan pemotongan atau penambahan bunga jika perlu
            }
        }

        LaporanBank.cetakDaftar("AKHIR BULAN", semua);
        LaporanBank.cetakTotal(semua);
    }
}