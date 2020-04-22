import java.util.*;

public class Proses {

    private static List<Mhs> DaftarMhs = new LinkedList<Mhs>();

    public static void addMhs(Mhs mhs) {
        DaftarMhs.add(mhs);
    }

    public static void editMhs(Mhs mhs, int id) {
        DaftarMhs.set(id, mhs);
    }

    public static void deleteMhs(int id) {
        DaftarMhs.remove(id);
    }

    public static List<Mhs> getListMhs() {
        return DaftarMhs;
    }

}