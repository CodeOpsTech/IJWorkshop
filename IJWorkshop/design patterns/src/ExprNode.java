abstract class ExprNode {
    abstract void genCode();
    ExprNode into(int val) {
        return new MultiplyOperator(this, new ConstantNode(val));
    }
    ExprNode plus(int val) {
        return new AddOperator(this, new ConstantNode(30));
    }
}
