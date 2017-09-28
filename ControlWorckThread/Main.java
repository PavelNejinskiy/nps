package ControlWorckThread;


/**
 * Created by java3 on 25.09.17.
 */
public class Main {

    public static void main(String[] args) throws Exception {


        JSONServer server = new JSONServer();
        server.serverStart();

        Thread.sleep(1000);


        long time1 = System.currentTimeMillis();
        Bank bank = new Bank();
        bank.startCreat();

        StartThread start = new StartThread();

        bank.setRezult(start.startThread(bank.getMatrix1(), bank.getMatrix2()));

        int x = start.startThread(bank.getMatrix1(), bank.getMatrix2())[0].length;
        int y = start.startThread(bank.getMatrix1(), bank.getMatrix2())[1].length;
//
//
//        long time1 = System.currentTimeMillis();
//        InOneThread one = new InOneThread();
//
//        int x = one.rezult(bank.getMatrix1(), bank.getMatrix2())[0].length;
//        int y = one.rezult(bank.getMatrix1(), bank.getMatrix2())[1].length;

//        bank.setRezult(one.rezult(bank.getMatrix1(), bank.getMatrix2()));

        long time2 = System.currentTimeMillis();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(bank.rezult[i][j] + " ");
            }
            System.out.println("");

        }

        System.out.println("");
        System.out.println("");
        System.out.println(time2 - time1);



    }





}
