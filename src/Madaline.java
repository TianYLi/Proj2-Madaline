import java.io.*;

/**
 * Created by Jack Li on 10/16/2015.
 */
public class Madaline {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        System.out.println("Welcome to my madaline neural network!\n");
        System.out.println("Enter the data input file name: ");
        input = br.readLine();
        input = input.concat(".txt");
        InputData fData = FileRead(input);
        while(true) {

        }
    }
    public static InputData FileRead(String input) throws IOException {
        //reading files
        FileInputStream fstream = new FileInputStream(input);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int inputDim, outputDim, numPairs;
        inputDim =  Integer.parseInt(br.readLine());
        outputDim = Integer.parseInt(br.readLine());
        numPairs = Integer.parseInt(br.readLine());

        System.out.println(inputDim+ " "+outputDim+" "+numPairs+"\n");

        int[][] arrX = new int[numPairs][inputDim];
        int[][] arrT = new int[numPairs][outputDim];

        String line;
        for(int i = 0; i < numPairs; i++) {
            br.readLine();
            line = br.readLine();
            System.out.println(line);
            String[] temp = line.split(" ");
            for(int j = 0; j < inputDim; j++) {
                arrX[i][j] = Integer.parseInt(temp[j]);
            }
            line = br.readLine();
            System.out.println(line+"\n");
            temp = line.split(" ");
            for(int j = 0; j < outputDim; j++) {
                arrT[i][j] = Integer.parseInt(temp[j]);
            }
        }
        InputData obj = new InputData(arrX, arrT, inputDim, outputDim, numPairs);
        return obj;
    }
}
