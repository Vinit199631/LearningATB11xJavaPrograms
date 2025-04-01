package ex_16_OOPs;

import javax.xml.catalog.Catalog;

public class Lab166_Cats {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2 ;
        new cat();

        c1.running();

        new cat().running();
        System.out.println(new cat().name);
    }
}

class cat{
    String name ;
    void running(){

        System.out.println("Running");
    }

}
