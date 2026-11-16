public class LaporanBank {
    public static void cetakDaftar(String judul, Rekening[] semua) {
        System.out.println("========== " + judul + " ==========");
        for (Rekening r : semua) {
            System.out.println(r.getNomor() + " | " + r.getPemilik() + " | Rp" + String.format("%,.0f", r.getSaldo()).replace(',', '.'));
            System.out.println(r.keterangan());
        }
        System.out.println();
    }

    public static void cetakTotal(Rekening[] semua) {
        double total = 0;
        for (Rekening r : semua) {
            total += r.getSaldo();
        }
        System.out.println("----------------------------------------");
        System.out.println("Total dana bank : Rp" + String.format("%,.0f", total).replace(',', '.'));
    }
}