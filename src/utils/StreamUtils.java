package utils;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ye on 11/18/16.
 */
public class StreamUtils {

    /**
     *  将inputstream转化为string
     * @param inputStream 输入流
     * @return 字符串
     * @throws IOException
     */
    public static String stream2String(InputStream inputStream) throws IOException {
        String res = "";
        int len;
        byte[] buffer = new byte[1024 * 500];
        while ((len = inputStream.read(buffer)) != -1) {
            res += new String(buffer, 0, len);
        }
        inputStream.close();
        return res;
    }
}
