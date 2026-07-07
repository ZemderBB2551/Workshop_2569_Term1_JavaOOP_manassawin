package initlization_block;

import java.lang.reflect.Constructor;

class Test{
    int a;
    // initlization block
    {
        a = 5;
        System.out.print("Initlization Block");
    }

    Test(){
        System.out.print("Constructor");
    }
}

public class InitlizationBlock {
    public static void main(String[] args) {
        Test t = new Test();
    }
}
