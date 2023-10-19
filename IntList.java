
import java.io.*;

/** for Class Design - convert to IntList  */

public class IntList {


    private int numElements = 0;
    private int[] data = new int[100]; // caps at 100 elements with no bullet-proofing or bounds checks, etc.

    // add int parameter to data[] at index == numElements then increment numElements by 1
    public void add(int number) {
        data[numElements++] = number;
    }

    public String toString() {
        String retVal = "";
        // loop only up to the index counter set by numElements
        for(int i = 0; i < numElements; i++) {
            // add current entry to retVal
            retVal += data[i];
        }
        return retVal;
    }

    public int sum() {
        int retVal = 0;
        // loop only up to the index counter set by numElements
        for(int i = 0; i < numElements; i++) {
            // add current entry to retVal
            retVal += data[i];
        }
        return retVal;
    }

    public int indexOf(int searchVal) {

        for (int x = 0; x < numElements; x++) {
            if (data[x] == searchVal) {
                return x;
            }
        }
        return -1;
    }

    public String save() {
        // make return String that will specify if file output print succeeded or failed
        String successOrFail = "";
        String fileName = "output.txt";
        // set printwriter object to null for finally close condition expression
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter(fileName));
            // use a loop to print using out
            for (int x = 0; x < numElements; x++) {
                out.println("data[" + x + "] == " + data[x]);
                System.out.println("data[" + x + "] == " + data[x]);
            }
            successOrFail = "success";
        } catch (IOException e) {
            System.out.println(e.getMessage());
            successOrFail = "fail";
        } finally {
            if (out != null) {
                out.close();
            }
        }
        return successOrFail;
    }

    public static void main(String[] args) {
        IntList a = new IntList();
        a.add(95);
        a.add(100);
        a.add(58);
        System.out.println(a.toString() );
        System.out.println(a.sum() );
        System.out.println(a.indexOf(100));
        System.out.println(a.indexOf(20));
        System.out.println(a.save());
    }
}
