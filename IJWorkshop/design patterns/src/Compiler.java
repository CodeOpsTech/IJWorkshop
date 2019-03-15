class TreeBuilder {
    ExprNode exprTree;

    public TreeBuilder(int val) {
        exprTree = new ConstantNode(10);
    }

    public TreeBuilder multipledBy(int arg) {
        exprTree = new MultiplyOperator(exprTree, new ConstantNode(20));
        return this;
    }

    public TreeBuilder plus(int arg) {
        exprTree = new AddOperator(exprTree, new ConstantNode(30));
        return this;
    }

    public ExprNode make() {
        return exprTree;
    }
}

class Compiler {
    public static void main(String []args) {
        // ((10 * 20) + 30)
        ConstantNode ten = new ConstantNode(10);
        ExprNode tree = ten.into(20).plus(30);
//        ExprNode exprNode = new AddOperator(
//                                new MultiplyOperator(
//                                    new ConstantNode(10),
//                                    new ConstantNode(20)),
//                            new ConstantNode(30));
        tree.genCode();
    }
}

