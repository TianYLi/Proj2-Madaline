/**
 * Created by Jack Li on 10/16/2015.
 */
public class InputData {
    private int[][] arrX;
    private int[][] arrT;
    private int inputDim;
    private int outputDim;
    private int numPairs;
    public InputData (int[][] x, int[][] t, int i, int o, int p) {
        arrX = x;
        arrT = t;
        inputDim = i;
        outputDim = o;
        numPairs = p;
    }
    public int[][] getArrX() {
        return arrX;
    }
    public int[][] getArrT() {
        return arrT;
    }
    public int getInputDim() {
        return inputDim;
    }
    public int getOutputDim() {
        return outputDim;
    }
    public int getNumPairs() {
        return numPairs;
    }
}
