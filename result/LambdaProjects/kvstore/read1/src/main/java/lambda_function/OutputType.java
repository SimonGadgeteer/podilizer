package lambda_function;

import java.util.HashMap;

public class OutputType {

    public HashMap<String, String> keyvalues = new HashMap();

    public String readResult;

    public OutputType() {
    }

    public void setKeyvalues(HashMap<String, String> keyvalues) {
        this.keyvalues = keyvalues;
    }

    public HashMap<String, String> getKeyvalues() {
        return keyvalues;
    }

    public void setReadResult(String readResult) {
        this.readResult = readResult;
    }

    public String getReadResult() {
        return readResult;
    }

    public OutputType(HashMap<String, String> keyvalues, String readResult) {
        this.keyvalues = keyvalues;
        this.readResult = readResult;
    }
}
