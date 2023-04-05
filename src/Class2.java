public class Class2 extends Class1 {
    private EnumType enumType;

    public Class2(int number, ComplexType complexType, EnumType enumType) {
        super(number, complexType);
        this.enumType = enumType;
    }

    public EnumType getEnumType() {
        return enumType;
    }

    public void overloadedMethod() {
        System.out.println("This is an overloaded method with no parameters.");
    }

    public void overloadedMethod(int number) {
        System.out.println("This is an overloaded method with a parameter: " + number);
    }

    public final void nonOverridableMethod() {
        System.out.println("This is a non-overridable method.");
    }
}
