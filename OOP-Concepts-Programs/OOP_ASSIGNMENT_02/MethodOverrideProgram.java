class BaseClass {
    void firstMethod() {
        System.out.println("First method in BaseClass is calling secondMethod");
        secondMethod();
    }

    void secondMethod() {
        System.out.println("Second method in BaseClass");
    }
}

class SubClass extends BaseClass {
    @Override
    void secondMethod() {
        System.out.println("Second method in SubClass");
    }
}

public class MethodOverrideProgram {
    public static void main(String[] args) {
        SubClass subClassObject = new SubClass();
        subClassObject.firstMethod();


			//the firstMethod() is executed from the BaseClass 
			//but the overridden secondMethod() from the SubClass is executed because 
			//Java uses dynamic polymorphism to determine which version of the method 
			//to call at runtime...........

    }
}
