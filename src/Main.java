public class Main {
    public static void main(String[] args) {
        ComplexType complexType = new ComplexType(42);

        Class2 objectA = new Class2(1, complexType, EnumType.VALUE1);
        Class3 objectB = new Class3(2, complexType, EnumType.VALUE2, "Hello");
        Class3 objectC = new Class3(3, complexType, EnumType.VALUE3, "World");


        System.out.println("Object A:");
        System.out.println("Number: " + objectA.getNumber());
        System.out.println("Complex type value: " + objectA.getComplexType().getValue());
        System.out.println("Enum type value: " + objectA.getEnumType());


        objectA.overloadedMethod();
        objectA.overloadedMethod(123);


        System.out.println("\nObject B:");
        System.out.println("Number: " + objectB.getNumber());
        System.out.println("Complex type value: " + objectB.getComplexType().getValue());
        System.out.println("Enum type value: " + objectB.getEnumType());
        System.out.println("Text: " + objectB.getText());


        objectB.overloadedMethod();
        objectB.overloadedMethod(456);


        System.out.println("\nObject C:");
        System.out.println("Number: " + objectC.getNumber());
        System.out.println("Complex type value: " + objectC.getComplexType().getValue());
        System.out.println("Enum type value: " + objectC.getEnumType());
        System.out.println("Text: " + objectC.getText());


        objectC.overloadedMethod();
        objectC.overloadedMethod(789);

        objectA.nonOverridableMethod();
    }
}