package edu.gzu.lms.util;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

public class RequestUtil {

    public static String getRequestBody(HttpServletRequest request) throws IOException {

        // 读取请求内容
        BufferedReader br = request.getReader();
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        //将json字符串转换为json对象
        return sb.toString();
    }
}
