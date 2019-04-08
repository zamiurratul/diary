package src;

/**
 * Created by zamiur on 21-Mar-19.
 */
public class B {

    A a = new A();

    String name = "jhakanaka";

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("_____________________Finalize method of B was called");
    }
}
