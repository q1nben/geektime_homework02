package me.qinben;

import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

public class MyInterfaceImpl implements MyInterface {
    public String findName(String studentId) {
        switch (studentId) {
            case "20210123456789": return "心心";
            case "G20210735010190": return "覃奔";
            default: return null;
        }
    }

    public long getProtocolVersion(String s, long l) throws IOException {
        return MyInterface.versionID;
    }

    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return null;
    }
}
