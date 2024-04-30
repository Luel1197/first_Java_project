import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private int num1 ;
    private int num2 ;
    private char op;
    private int result;
    private Queue<Integer> qresult;

    private final double pi = 3.14159;
    private double radius;
    private double Ar;
    private Queue<Double> Arr;

    public void Area() {
            Ar = pi * radius * radius;

            Arr.add(Ar);
    }

    public void allArr() {
        for (double two : Arr) {
            System.out.println(two);
        }
    }

    public double getAr() {
        return Ar;
    }

    public void setRadius(double radius) {
       this.radius = radius;
    }

    public  Calculator() {
        num1 = 0;
        num2 =0;
        op = '+';
        result = 0;
        qresult = new LinkedList<Integer>();

        double radius = 0;
        double Ar = 0;
        Arr = new LinkedList<Double>();
    }



    public void calculate() {

        try {
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("오류발생.");
            }
        } catch (Exception e) {
            System.out.println("오류발생 했습니다"+ e.getMessage());
        }

        //저장
        qresult.add(result);


    }



    public int getResult() {
        return result;
    }

    public void setVal(int num1, int num2, char op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public void removeResult() {
       qresult.poll();
    }

    public void all() {
        for (int one : qresult) {
            System.out.println(one);
        }
    }
}
