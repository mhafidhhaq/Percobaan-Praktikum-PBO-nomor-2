package praktikum2;

public class Coba {
    public static void main(String args[]){
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.setNRP(7201);
        mhs.setNama("Budi Martati");
        
        System.out.println("Nama Mahasiswa " + mhs.getNama() + " NRP " + mhs.getNRP());
    }
}
