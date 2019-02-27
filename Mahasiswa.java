package praktikum2;

public class Mahasiswa {
    int nip;
    String nama;
    
    public void setNRP(int nip){
        this.nip = nip;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getNRP(){
        return nip;
    }
    
    public String getNama(){
        return nama; 
    }

}
