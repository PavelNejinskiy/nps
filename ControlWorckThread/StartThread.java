package ControlWorckThread;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by pavel on 26/09/2017.
 */
public class StartThread {

    public int[][] startThread(int[][] matrix1, int[][] matrix2) throws Exception {
        {
            JSONClient client = new JSONClient();
            JSONObject jsonO = new JSONObject();

            int[] lineMatrix1 = new int[matrix1[0].length];
            int[] columMatrix2 = new int[matrix1[1].length];

            int m = matrix1.length;
            int n = matrix2[0].length;
            int o = matrix2.length;
            int[][] rezult = new int[m][n];


            ExecutorService service = Executors.newFixedThreadPool(10);
            List<Future> list = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < o; k++) {

                        lineMatrix1[k] = matrix1[i][k];
                        columMatrix2[k] = matrix2[k][j];

                       // MenyThread menu = new MenyThread(matrix1[i][k] , matrix2[k][j]);  // One thread for one multiplay
//                        try {   // use client-server thru socket's
//                            jsonO.put(matrix1[i][k], matrix2[k][j]);   // USE client-server through socket's
//                            client.sendJSON(jsonO); // use client-server thru socket's
//                            client.start(); // use client-server thru socket's
//                            rezult[i][j] += Integer.parseInt(client.receiveJSON().toJSONString()); // use client-server thru socket's
                           // rezult[i][j] += menu.call();  // One thread for one multiplay
//                        } catch (Exception e) {  // use client-server thru socket's
//                            e.printStackTrace();  // use client-server thru socket's
                        }

                    MyCallable elemMatrix = new MyCallable(lineMatrix1, columMatrix2); // line * colum
                    Future rezultFuture = service.submit(elemMatrix);
                    list.add(rezultFuture);
                    rezult[i][j] = (int) rezultFuture.get();

                    }
                }


            return rezult;

        }
    }
}
