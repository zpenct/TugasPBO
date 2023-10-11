public class Mahasiswa {
    public String name;
    public int age = 10;

    public Mahasiswa(String name_){
        this.name = name_;
    }

    //Overloading constructor
    public Mahasiswa(){
        this.name = "Hamba Allah";
    }
    public void modifikasi(){
        System.out.println(this.name + " lagi memodifikasi");
    }
    public void membaca(){
        System.out.println(this.name + " lagi memembaca");
    }
    public void menyontek(){
        System.out.println(this.name + " lagi menyontek");
    }

}

