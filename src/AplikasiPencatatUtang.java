import java.util.ArrayList;
import java.util.Scanner; 

/**
 * AplikasiPencatatUtang adalah kelas utama untuk mengelola
 * daftar utang piutang.
 * @version 1.0
 */
public class AplikasiPencatatUtang {

    private ArrayList<Utang> daftarUtang;
    private Scanner scanner; 

    /**
     * Constructor untuk AplikasiPencatatUtang.
     * Menginisialisasi daftarUtang sebagai ArrayList baru dan objek Scanner.
     */
    public AplikasiPencatatUtang() {
        this.daftarUtang = new ArrayList<>();
        this.scanner = new Scanner(System.in); 
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
        System.out.println("\n[Sistem] Utang dari " + pemberiUtang + " berhasil ditambahkan!");
    }

    /**
     * Method untuk menampilkan semua utang yang tercatat di konsol.
     * Jika tidak ada utang, akan menampilkan pesan "Tidak ada data utang."
     */
    public void tampilkanSemuaUtang() {
        if (daftarUtang.isEmpty()) {
            System.out.println("--- Daftar Utang ---");
            System.out.println("Tidak ada data utang.");
            return;
        }

        System.out.println("\n--- DAFTAR UTANG TERCATAT ---");
        for (Utang utang : daftarUtang) { 
            utang.tampilkanDetailUtang();
            System.out.println("----------------------------");
        }
    }

    /**
     * Method untuk menerima input dari pengguna.
     */
    private void inputUtang() {
        System.out.println("\n--- Input Utang Baru ---");
        
        System.out.print("Masukkan nama Pemberi Utang: ");
        String nama = scanner.nextLine(); 
        
        System.out.print("Masukkan Jumlah Utang (cth: 50000): Rp");
        double jumlah = 0;
        if (scanner.hasNextDouble()) {
            jumlah = scanner.nextDouble();
        } else {
            System.out.println("[ERROR] Jumlah harus berupa angka. Pencatatan dibatalkan.");
            scanner.nextLine(); 
            return;
        }
        
        scanner.nextLine(); 
        
        System.out.print("Masukkan Tanggal Jatuh Tempo (DD-MM-YYYY): ");
        String tanggal = scanner.nextLine(); 
        
        this.tambahUtang(nama, jumlah, tanggal);
    }
    
    /**
     * Method main untuk menjalankan aplikasi.
     *
     * @param args Argumen command-line (tidak digunakan).
     */
    public static void main(String[] args) {
        AplikasiPencatatUtang app = new AplikasiPencatatUtang();
        int pilihan = 0;

        System.out.println("=====================================");
        System.out.println("  APLIKASI PENCATAT UTANG SEDERHANA  ");
        System.out.println("=====================================");
        
        do {
            System.out.println("\n----------------------------");
            app.inputUtang(); 
            
            app.tampilkanSemuaUtang();
            
            System.out.println("\nTekan 99 untuk KELUAR, atau tekan angka lain untuk MENAMBAH LAGI.");
            System.out.print("Pilihan: ");
            
            if (app.scanner.hasNextInt()) {
                pilihan = app.scanner.nextInt();
            } else {
                pilihan = -1; 
            }
            app.scanner.nextLine(); 

        } while (pilihan != 99); 

        System.out.println("\n[Sistem] Terima kasih! Program berhenti.");
        app.scanner.close(); 
    }
}
