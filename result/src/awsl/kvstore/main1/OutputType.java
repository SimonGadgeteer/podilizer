package awsl.kvstore.main1;

import java.util.HashMap;

public class OutputType {

    public HashMap<String, String> keyvalues = new HashMap();

    public OutputType() {
    }

    public void setKeyvalues(HashMap<String, String> keyvalues) {
        this.keyvalues = keyvalues;
    }

    public HashMap<String, String> getKeyvalues() {
        return keyvalues;
    }

    public OutputType(HashMap<String, String> keyvalues) {
        this.keyvalues = keyvalues;
    }
}
