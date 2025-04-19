package ex_30_Generics;

public class Lab235_Generics_Class {
    public static void main(String[] args) {
        GenericsClass<Integer> intObjref = new GenericsClass<>(5);
        GenericsClass<Integer> intObjref2 = new GenericsClass("vinit");
    }

}

class GenericsClass<T>{
    private T data;

    public GenericsClass(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
}
