package awsl.kvstore.read1;

import java.util.HashMap;

public class InputType {

    public HashMap<String, String> keyvalues = new HashMap();

    public String key;

    public InputType() {
    }

    public void setKeyvalues(HashMap<String, String> keyvalues) {
        this.keyvalues = keyvalues;
    }

    public HashMap<String, String> getKeyvalues() {
        return keyvalues;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public InputType(HashMap<String, String> keyvalues, String key) {
        this.keyvalues = keyvalues;
        this.key = key;
    }
}
