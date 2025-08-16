public class Expression implements ArithmeticExpression{

    ArithmeticExpression left;
    ArithmeticExpression right;
    Operations operation;
    Expression(ArithmeticExpression left, ArithmeticExpression right, Operations operation){
        this.left = left;
        this.right = right;
        this.operation = operation;
    }
    @Override
    public int evaluate() {
        int result = 0;

        switch (operation){
            case ADD:
                result = left.evaluate() + right.evaluate();
                break;
            case SUBTRACT:
                result = left.evaluate() - right.evaluate();
                break;
            case MULTIPLY:
                result = left.evaluate() * right.evaluate();
                break;
            case DIVIDE:
                result = left.evaluate() /right.evaluate();
                break;
        }
        return result;
    }
}
