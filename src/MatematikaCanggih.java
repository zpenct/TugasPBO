public class MatematikaCanggih extends Matematika{
    public void modulus(int a,int b){
        System.out.println(a % b);
    }

    @Override
    public void pertambahan(int a, int b) {
        System.out.println("Ini overriding "+ (a + b));
    }
    @Override
    public void perkalian(int a, int b){
        System.out.println("Ini overriding "+ a*b);
    }
}
