import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        StackTugasMahasiswa11 stack = new StackTugasMahasiswa11(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa11 mhsPop = stack.pop();
                    if (mhsPop != null) {
                        System.out.println("Tugas " + mhsPop.nama + " berhasil dinilai");
                    }
                    break;
                case 3:
                    Mahasiswa11 mhsPeek = stack.peek();
                    if (mhsPeek != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + mhsPeek.nama);
                    }
                    break;
                case 4:
                    stack.print();
                    break;
                case 5:
                    Mahasiswa11 mhsBawah = stack.lihatTerbawah();
                    if (mhsBawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + mhsBawah.nama);
                    }
                    break;
                case 6:
                    
                    int jumlah = stack.jumlahTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}