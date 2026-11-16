public class Giro extends Rekening {
    private double batasOverdraft;

    public Giro(int nomor, String pemilik, double saldo, double batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public String keterangan() {
        return "Giro, batas overdraft Rp" + String.format("%,.0f", batasOverdraft).replace(',', '.');
    }
}