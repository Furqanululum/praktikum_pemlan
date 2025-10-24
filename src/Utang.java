/**
 * Merepresentasikan satu entitas utang.
 * Menyimpan informasi pemberi utang, jumlah, jatuh tempo, dan status lunas.
 */
public class Utang {

    private String pemberiUtang;
    private double jumlah;
    private String tanggalJatuhTempo;
    private boolean lunas;

    /**
     * Constructor untuk membuat objek Utang baru.
     * Status utang otomatis diatur ke "belum lunas".
     *
     * @param pemberiUtang Nama orang yang memberi utang.
     * @param jumlah Nominal utang.
     * @param tanggalJatuhTempo Tanggal pengembalian.
     */
    public Utang(String pemberiUtang, double jumlah, String tanggalJatuhTempo) {
        this.pemberiUtang = pemberiUtang;
        this.jumlah = jumlah;
        this.tanggalJatuhTempo = tanggalJatuhTempo;
        this.lunas = false; // Default utang baru belum lunas
    }

    // --- Getter Methods ---

    /**
     * Mengambil nama pemberi utang.
     * @return String nama pemberi utang.
     */
    public String getPemberiUtang() {
        return pemberiUtang;
    }

    /**
     * Mengambil jumlah nominal utang.
     * @return double jumlah utang.
     */
    public double getJumlah() {
        return jumlah;
    }

    /**
     * Mengambil tanggal jatuh tempo pembayaran.
     * @return String tanggal jatuh tempo.
     */
    public String getTanggalJatuhTempo() {
        return tanggalJatuhTempo;
    }

    /**
     * Memeriksa status lunas utang.
     * @return true jika sudah lunas, false jika belum.
     */
    public boolean isLunas() {
        return lunas;
    }

    // --- Setter Method (Akan digunakan di TUGAS 3) ---

    /**
     * Method untuk mengubah status utang.
     * @param lunas Status lunas baru (true/false).
     */
    public void setLunas(boolean lunas) {
        this.lunas = lunas;
    }

    /**
     * Method untuk menampilkan detail utang ke konsol.
     */
    public void tampilkanDetailUtang() {
        // Gunakan Autocomplete Modul 3 (sout)
        System.out.println("Pemberi Utang: " + pemberiUtang);
        System.out.println("Jumlah: Rp" + jumlah);
        System.out.println("Jatuh Tempo: " + tanggalJatuhTempo);
        System.out.println("Status: " + (lunas ? "Lunas" : "Belum Lunas"));
    }
}