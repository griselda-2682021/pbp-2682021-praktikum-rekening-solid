public abstract class Rekening {
    protected int nomor;
    protected String pemilik;
    protected double saldo;

    public Rekening(int nomor, String pemilik, double saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public int getNomor() { return nomor; }
    public String getPemilik() { return pemilik; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public abstract String keterangan();

    public boolean tarik(double jumlah) {
        return false;
    }
}