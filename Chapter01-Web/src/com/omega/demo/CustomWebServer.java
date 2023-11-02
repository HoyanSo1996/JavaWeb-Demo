package com.omega.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * Class CustomWebServer
 *
 * @author KennySo
 * @date 2023/10/15
 */
public class CustomWebServer {

    private static boolean loop = true;

    public static void main(String[] args) throws IOException {
        // 1.在9999端口监听
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("===== web服务在9999端口监听 =====");

        while (loop) {
            // 2.等待浏览器/客户端连接
            Socket socket = serverSocket.accept();
            System.out.println("服务端socket = " + socket.getClass());

            // 3.通过socket获取输出流 (要用火狐浏览器测试)
            OutputStream os = socket.getOutputStream();
            os.write("hello, i'm web server.".getBytes(StandardCharsets.UTF_8));

            // 4.关闭资源
            os.close();
            socket.close();
        }

        serverSocket.close();
    }
}
