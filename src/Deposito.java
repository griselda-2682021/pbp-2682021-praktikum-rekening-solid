public class Deposito extends Rekening implements Berbunga {
    private double bungaPerBulan;

    public Deposito(int nomor, String pemilik, double saldo, double bungaPerBulan) {
        super(nomor, pemilik, saldo);
        this.bungaPerBulan = bungaPerBulan;
    }

    @Override
    public String keterangan() {
        return "Deposito, bunga " + bungaPerBulan + "% per bulan";
    }

    @Override
    public void potongBiayaAdmin(Rekening[] semua) {
        // Deposito tidak kena biaya admin
    }

    @Override
    public void tambahBunga(Berbunga[] berbunga) {
        for (Berbunga b : berbunga) {
            if (b instanceof Deposito) {
                Deposito d = (Deposito) b;
                d.setSaldo(d.getSaldo() + (d.getSaldo() * (d.bungaPerBulan / 100.0)));
            }
        }
    }
}