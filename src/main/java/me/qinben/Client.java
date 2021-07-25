package me.qinben;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Client {
    public static void main(String[] args) {
        try {
            MyInterface proxy = RPC.getProxy(MyInterface.class,
                    1L,
                    new InetSocketAddress("127.0.0.1", 12345),
                    new Configuration());
            String name = proxy.findName("G20210735010190");
            String name1 = proxy.findName("20210123456789");
            String name2 = proxy.findName("20210000000000");
            System.out.println(name);
            System.out.println(name1);
            System.out.println(name2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
