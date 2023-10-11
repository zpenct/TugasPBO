public class Master extends Mahasiswa {
    public String jurusan;
    public int age;

    public Master(String name_, String jurusan_, int age_) {
        super(name_);
        this.age = age_;
        this.jurusan = jurusan_;
    }

    public void greeting() {
        System.out.println("Nama saya " + this.name);
        System.out.println("Umur saya " + this.age);
        System.out.println("saya adalah master");
    }

}
