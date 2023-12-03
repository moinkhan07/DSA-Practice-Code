public class Add1UsingNotOperator {
    public static void main(String[] args) {
        int originalValue = 11;
        int result = -(~originalValue);

        System.out.println("Original value: " + originalValue);
        System.out.println("Result:) "+ result);
    }
}
