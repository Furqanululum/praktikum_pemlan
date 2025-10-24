import java.util.ArrayList;
import java.util.List;

/**
 * AplikasiPencatatUtang adalah kelas utama untuk mengelola
 * daftar utang piutang.
 */
public class AplikasiPencatatUtang {

    private List<Utang> daftarUtang;

    /**
     * Constructor untuk AplikasiPencatatUtang.
     * Menginisialisasi daftarUtang sebagai ArrayList baru.
     */
    public AplikasiPencatatUtang() {
        this.daftarUtang = new ArrayList<>();
    }

    /**
     * Method untuk menambahkan utang baru ke dalam daftar.
     *
     * @param pemberiUtang Nama orang yang memberi utang.
     * @param jumlah Nominal utang.
     * @param tanggalJatuhTempo Tanggal pengembalian.
     */
    public void tambahUtang(String pemberiUtang, double jumlah, String tanggalJatuhTempo) {
        Utang utangBaru = new Utang(pemberiUtang, jumlah, tanggalJatuhTempo);
        this.daftarUtang.add(utangBaru);
        System.out.println("Utang baru berhasil ditambahkan!");
    }

    /**
     * Method untuk menampilkan semua utang yang tercatat di konsol.
     * Jika tidak ada utang, akan menampilkan pesan "Tidak ada data utang."
     */
    public void tampilkanSemuaUtang() {
        // Gunakan Autocomplete Modul 3 (ifn)
        if (daftarUtang.isEmpty()) {
            System.out.println("Tidak ada data utang.");
            return;
        }

        System.out.println("--- Daftar Utang ---");
        // Gunakan Autocomplete Modul 3 (iter)
        for (Utang utang : daftarUtang) {
            utang.tampilkanDetailUtang();
            System.out.println("--------------------");
        }
    }

    /**
     * Method main untuk menjalankan simulasi aplikasi.
     *
     * @param args Argumen command-line (tidak digunakan).
     */
    // Gunakan Autocomplete Modul 3 (psvm)
    public static void main(String[] args) {
        AplikasiPencatatUtang app = new AplikasiPencatatUtang();

        // Menambahkan beberapa data utang
        app.tambahUtang("Budi", 50000, "25-10-2025");
        app.tambahUtang("Siti", 120000, "30-10-2025");

        // Menampilkan semua utang
        app.tampilkanSemuaUtang();
    }
}