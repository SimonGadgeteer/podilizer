package awsl.kvstore.write2;

import java.util.HashMap;

public class InputType {

    public HashMap<String, String> keyvalues = new HashMap();

    public String key;

    public String value;

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

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public InputType(HashMap<String, String> keyvalues, String key, String value) {
        this.keyvalues = keyvalues;
        this.key = key;
        this.value = value;
    }
}
