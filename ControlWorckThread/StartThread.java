package ControlWorckThread;

import org.json.simple.JSONObject;

/**
 * Created by pavel on 26/09/2017.
 */
public class StartThread {

    public int[][] startThread(int[][] matrix1, int[][] matrix2) {
        {
            JSONClient client = new JSONClient();
            JSONObject jsonO = new JSONObject();
            int m = matrix1.length;
            int n = matrix2[0].length;
            int o = matrix2.length;
            int[][] rezult = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < o; k++) {
                       // MenyThread menu = new MenyThread(matrix1[i][k] , matrix2[k][j]);
                        try {
                            jsonO.put(matrix1[i][k], matrix2[k][j]);
                            client.sendJSON(jsonO);
                            client.start();
                            rezult[i][j] += Integer.parseInt(client.receiveJSON().toJSONString());
                           // rezult[i][j] += menu.call();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            return rezult;

        }
    }
}
