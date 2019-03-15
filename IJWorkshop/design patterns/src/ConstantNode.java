public class ConstantNode extends ExprNode {
    private int val;
    public ConstantNode(int value) {
        val = value;
    }

    @Override
    public void genCode() {
        System.out.println("iload " + val);
    }
}
