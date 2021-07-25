package me.qinben;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class Server {
    public static void main(String[] args) {
        RPC.Builder builder = new RPC.Builder(new Configuration());
        // 服务器IP地址
        builder.setBindAddress("127.0.0.1");
        // 服务器端口号
        builder.setPort(12345);

        builder.setProtocol(MyInterface.class);
        builder.setInstance(new MyInterfaceImpl());

        try {
            RPC.Server server = builder.build();
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
