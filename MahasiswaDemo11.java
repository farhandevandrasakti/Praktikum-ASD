import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa11 stack = new StackTugasMahasiswa11(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
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
                    stack.push(new Mahasiswa11(nim, nama, kelas));
                    break;

                case 2:
                    Mahasiswa11 mhsPop = stack.pop();
                    if (mhsPop != null) {
                        System.out.println("Menilai tugas dari " + mhsPop.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Tugas " + mhsPop.nama + " adalah " + nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Tugas teratas: " + stack.stack[stack.top].nama);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;

                case 4:
                    stack.print();
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}