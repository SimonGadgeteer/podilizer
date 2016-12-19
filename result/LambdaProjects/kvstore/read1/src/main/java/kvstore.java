import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambdaClient;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;

public class kvstore {

    public HashMap<String, String> keyvalues = new HashMap();

    public static void main(String[] args) {
        kvstore store = new kvstore();
        if (args.length == 1) {
            System.out.println(store.read(args[0]));
        } else if (args.length == 2) {
            store.write(args[0], args[1]);
        } else {
            System.out.println("Invalid arguments provided");
        }
    }

    public String read(String key) {
        return keyvalues.get(key);
    }

    public void write(String key, String value) {
        keyvalues.put(key, value);
    }

    public static String byteBufferToString(ByteBuffer buffer, Charset charset) {
        byte[] bytes;
        if (buffer.hasArray()) {
            bytes = buffer.array();
        } else {
            bytes = new byte[buffer.remaining()];
            buffer.get(bytes);
        }
        return new String(bytes, charset);
    }
}
