package 제네릭연습2;

public class GenericEx2 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter =new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder=powderPrinter.getMaterial();
        System.out.println(powder);
    }
}



