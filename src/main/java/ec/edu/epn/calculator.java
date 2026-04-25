package ec.edu.epn;

public class calculator {
    private int answer;

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b){
        return a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    @SuppressWarnings("IntegerDivisionInFLoatingPointContext")
    public double division(int a, int b) {
        return a / b;
    }

    public void timaout(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}