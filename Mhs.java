public class Mhs {

    private String NIM;
    private String Nama;
    private String Kelas;
    private String Alamat;

    public Mhs() {
        NIM = "";
        Nama = "";
        Kelas = "";
        Alamat = "";
    }

    public Mhs(String NIM, String Nama, String Kelas, String Alamat) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.Alamat = Alamat;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIM() { return NIM; }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() { return Nama; }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getKelas() { return Kelas; }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getAlamat() { return Alamat; }

}