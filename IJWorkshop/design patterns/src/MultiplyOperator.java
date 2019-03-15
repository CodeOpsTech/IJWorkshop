public class MultiplyOperator extends BinaryOperator {
    public MultiplyOperator(ExprNode left, ExprNode right) {
        super(left, right);
    }

    @Override
    void genCode() {
        super.genCode();
        System.out.println("imul");
    }
}
