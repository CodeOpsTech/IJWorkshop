public class AddOperator extends BinaryOperator {
    public AddOperator(ExprNode left, ExprNode right) {
        super(left, right);
    }

    @Override
    void genCode() {
        super.genCode();
        System.out.println("iadd");
    }
}
