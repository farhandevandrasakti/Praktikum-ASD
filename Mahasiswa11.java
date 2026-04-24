public class Mahasiswa11 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa11(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}