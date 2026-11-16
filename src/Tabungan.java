public class Tabungan extends Rekening implements Berbunga {
    private double bungaPerBulan;

    public Tabungan(int nomor, String pemilik, double saldo, double bungaPerBulan) {
        super(nomor, pemilik, saldo);
        this.bungaPerBulan = bungaPerBulan;
    }

    @Override
    public String keterangan() {
        return "Tabungan, bunga " + bungaPerBulan + "% per bulan";
    }

    @Override
    public void potongBiayaAdmin(Rekening[] semua) {
        for (Rekening r : semua) {
            if (r instanceof Tabungan) {
                r.setSaldo(r.getSaldo() - 15000);
            }
        }
    }

    @Override
    public void tambahBunga(Berbunga[] berbunga) {
        for (Berbunga b : berbunga) {
            if (b instanceof Tabungan) {
                Tabungan t = (Tabungan) b;
                t.setSaldo(t.getSaldo() + (t.getSaldo() * (t.bungaPerBulan / 100.0)));
            }
        }
    }
}