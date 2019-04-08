package src;

/**
 * Created by zamiur on 21-Mar-19.
 */
public class A {
    B b = new B();
    public void foo(){
        System.out.println("________________foo was called");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("_____________________Finalize method of A was called");
    }

}
