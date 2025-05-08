package structural.composite.code.cart;

import structural.composite.code.cart.products.Note;
import structural.composite.code.cart.products.Pencil;
import structural.composite.code.cart.products.WritingImplementPackage;

public class Main {

    public static void main(String[] args) {
        var writingInstrumentPackage = new WritingImplementPackage();
        writingInstrumentPackage.addProduct(new Note());
        writingInstrumentPackage.addProduct(new Pencil());
        System.out.println(writingInstrumentPackage.getPrice());
    }

}
