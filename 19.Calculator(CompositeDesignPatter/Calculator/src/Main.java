public class Main {
    public static void main(String[] args) {
//                                        2*(1+7)
//                                          / \
//                                         /   \
//                                        /     \
//                                       /       \
//                                      2         (1+7)
//                                                  |
//                                                   +
//                                                   /\
//                                                  /  \
//                                                 1    7

        Number n1 = new Number(2);
        Number n2 = new Number(1);
        Number n3 = new Number(7);

        Expression e1 = new Expression(n2,n3,Operations.ADD);
        Expression e2 = new Expression(n1,e1,Operations.MULTIPLY);

        int ans = e2.evaluate();
        System.out.println("The result of hte above exp is : "+ans);
    }
}