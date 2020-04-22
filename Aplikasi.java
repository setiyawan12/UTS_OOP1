import java.util.*;

public class Aplikasi {

    public static void main(final String args[]) {
        final Aplikasi app = new Aplikasi();
        final Scanner scan = new Scanner(System.in);
        while(true) {
            app.printMenu();
            final int Pilihan = scan.nextInt();
            switch(Pilihan) {
                case 1:
                    System.out.println("Tambah Data Baru");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Ubah Data");
                    app.editData();
                    break;
                case 3:
                    System.out.println("Hapus Data");
                    app.deleteData();
                    break;
                case 4:
                    System.out.println("Menampilkan Data");
                    app.listData();
                    break;
                    case 5:
                    return;
                }
            }
        }
        
    public void addData() {
        final Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("==================================");
        System.out.print("NIM: "); final String NIM = scan.nextLine();
        System.out.print("Nama: "); final String Nama = scan.nextLine();
        System.out.print("Kelas: "); final String Kelas = scan.nextLine();
        System.out.print("Alamat: "); final String Alamat = scan.nextLine();
        Proses.addMhs(new Mhs(NIM, Nama, Kelas, Alamat));
    }
        
    public void listData() {
        final List<Mhs> Tampilan = Proses.getListMhs();
        for(int i=0; i<Tampilan.size(); i++) {
            System.out.println();
            System.out.println("ID - " + (i+1));
            System.out.println("==================================");
            System.out.println("  NIM : " + Tampilan.get(i).getNIM());
            System.out.println("  Nama : " + Tampilan.get(i).getNama());
            System.out.println("  Kelas : " + Tampilan.get(i).getKelas());
            System.out.println("  Alamat : " + Tampilan.get(i).getAlamat()); 
        }
    }

    public void editData() {
        final Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("==================================");
        System.out.print("Ubah Data Dengan ID : "); final int id = Integer.parseInt(scan.nextLine());
        System.out.println("==================================");
        System.out.print("NIM : "); final String NIM = scan.nextLine();
        System.out.print("Nama : "); final String Nama = scan.nextLine();
        System.out.print("Kelas : "); final String Kelas = scan.nextLine();
        System.out.print("Alamat : "); final String Alamat = scan.nextLine();
        Proses.editMhs(new Mhs(NIM, Nama, Kelas, Alamat), id-1);
    }

    public void deleteData() {
        final Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("==================================");
        System.out.print("Hapus Data Dengan ID: "); final int id = Integer.parseInt(scan.nextLine());
        Proses.deleteMhs(id-1);
    }

    public void printMenu() {
        System.out.println();
        System.out.println("==================================");
        System.out.println("APLIKASI DATA MAHASISWA");
        System.out.println("==================================");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}