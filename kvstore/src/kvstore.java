import java.util.HashMap;

public class kvstore {
    public HashMap<String, String> keyvalues = new HashMap();

    public static void main(String[] args) {
        kvstore store = new kvstore();

        if(args.length == 1) {
            System.out.println(store.read(args[0]));
        } else if(args.length == 2) {
            store.write(args[0], args[1]);
        } else {
            System.out.println("Invalid arguments provided");
        }
    }

    private String read(String key) {
        return keyvalues.get(key);
    }

    private void write(String key, String value) {
        keyvalues.put(key, value);
    }
}
