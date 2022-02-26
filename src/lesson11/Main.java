package lesson11;

public class Main {
    public static void main(String[] args) {
//        Matrix matrix1 = new Matrix(3,4);
//        System.out.println(matrix1.getRows());
//        System.out.println(matrix1.getColumns());

        double[][] num2 = {{2,4,6},
                           {4,1,6},
                           {2,4,9},
                           {2,5,0}};
        Matrix matrix2 = new Matrix(num2);

        double[][] num1 = {{1,1,2},
                           {2,4,2},
                           {3,4,8},
                           {2,5,0}};
        Matrix matrix1 = new Matrix(num1);

        System.out.println(matrix2.isNullMatrix());

        IMatrix add = matrix2.add(matrix1);
        System.out.println(add);
        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns());

        double[][] num3 = {{2,4,5},
                           {1,0,4},
                           {3,4,8}};
        Matrix matrix3 = new Matrix(num3);

        IMatrix mul = matrix1.mul(matrix3);
        System.out.println(mul);

        IMatrix mulValue = matrix3.mul(3);
        System.out.println(mulValue);

        IMatrix transpose = matrix2.transpose();
        transpose.printToConsole();

        Matrix matrix4 = new Matrix(4,5);
        matrix4.fillMatrix(3);
        matrix4.printToConsole();

        double[][] num5 = {{1,0,0},
                {0,1,0},
                {0,0,1}};
        Matrix matrix5 = new Matrix(num5);
        System.out.println(matrix5.isIdentityMatrix());
        System.out.println(matrix3.isSquareMatrix());
        System.out.println(matrix3.determinant());


    }
}
