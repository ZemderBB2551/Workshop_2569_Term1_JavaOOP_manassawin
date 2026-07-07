package initlization_block;

import java.lang.reflect.Constructor;

class Test{
    static int a;
    // initlization block
    static
    {
        a = 5;
        System.out.println("Initlization Block");
    }

    Test(){
        System.out.println("Constructor");
    }
}

public class InitlizationBlock {
    public static void main(String[] args) {
        Test t = new Test();
    }
}
