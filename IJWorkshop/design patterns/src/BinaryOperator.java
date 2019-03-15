public class BinaryOperator extends ExprNode {
    ExprNode left;
    ExprNode right;

    public BinaryOperator(ExprNode left, ExprNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    void genCode() {
        left.genCode();
        right.genCode();
    }
}


