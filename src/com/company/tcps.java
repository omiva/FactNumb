package com.company;
import java.io.*;
import java.net.*;
import java.util.*;
public class tcps {
    public static void main(String[] args) throws Exception{
        ServerSocket sersock = new ServerSocket(4000);
        System.out.println("Server ready for connection");

        Socket sock = sersock.accept();
        System.out.println("Connection is successful");
        InputStream istream = sock.getInputStream();
        BufferedReader buff = new BufferedReader(new InputStreamReader(istream));
        String fname = buff.readLine();
        BufferedReader contRead = new BufferedReader(new FileReader(fname));
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);
        String str;
        while ((str = contRead.readLine()) != null) {
            pwrite.println(str);
        }
        buff.close();
        sock.close();
        sersock.close();
        contRead.close();
    }
}
