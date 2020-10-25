package Lesson6.Prak1;

public class Operation extends Thread{
    private String operationName;
    private int operationTime;

    public Operation() {

    }

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < this.operationTime; i++) {
                System.out.println("Operation " + operationName + ":" + i);
                Thread.sleep(300);
            }
            System.out.println("Operation " + operationName + ": finished");
        }catch (Exception e){

        }
    }
}
