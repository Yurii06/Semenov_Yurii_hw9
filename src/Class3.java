public final class Class3 extends Class2 {
    private String text;

    public Class3(int number, ComplexType complexType, EnumType enumType, String text) {
        super(number, complexType, enumType);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void overloadedMethod(int number) {
        System.out.println("This is an overloaded method with a parameter: " + number + " in Class3.");
    }
}
