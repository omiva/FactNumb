package com.company;
//import java.util.*;
//public class crc
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        //input data
//
//        System.out.print("Enter the message bits: ");
//        String message = sc.nextLine();
//        System.out.print("Enter the generator code: ");
//        String generator = sc.nextLine();
//
//        int[] data = new int[message.length()+generator.length()-1];
//        int[] divisor = new int[generator.length()];
//
//        for(int i=0; i<message.length();i++)
//        {
//            data[i] = Integer.parseInt(message.charAt(i)+"");
//        }
//        for(int i = 0; i<generator.length(); i++)
//        {
//            divisor[i] = Integer.parseInt(generator.charAt(i)+"");
//        }
//
//        //calculation of crc
//
//        for(int i=0; i<message.length();i++)
//        {
//            if(data[i]==1)
//            {
//                for(int j=0; j<divisor.length; j++)
//                {
//                    data[i+j] ^= divisor[j];        //XOR operation
//                }
//            }
//        }
//
//        //display CRC
//        System.out.print("The checksum code is: ");
//        for (int i=0; i<message.length(); i++)
//        {
//            data[i] = Integer.parseInt(message.charAt(i)+"");
//        }
//        for (int i=0;i<data.length;i++)
//        {
//            System.out.print(data[i]);
//        }
//        System.out.println();
//
//        //check for input CRC
//
//        System.out.print("Enter the checksum code: ");
//        message = sc.nextLine();
//        System.out.print("Enter the generator code: ");
//        generator = sc.nextLine();
//
//        data = new int[message.length()+generator.length()-1];
//        divisor = new int[generator.length()];
//
//        for(int i=0; i<message.length();i++)
//        {
//            data[i] = Integer.parseInt(message.charAt(i)+"");
//        }
//        for(int i = 0; i<generator.length(); i++)
//        {
//            divisor[i] = Integer.parseInt(generator.charAt(i)+"");
//        }
//
//        //calculation of reminder
//
//        for(int i=0; i<message.length();i++)
//        {
//            if(data[i]==1)
//            {
//                for(int j=0; j<divisor.length; j++)
//                {
//                    data[i+j] ^= divisor[j];
//                }
//            }
//        }
//
//
//        //display validity of data
//        boolean val = true;
//        for(int i = 0; i<data.length;i++)
//        {
////            System.out.println(data[i]);
//            if(data[i]==1)
//            {
//                val = false;
//                break;
//            }
//        }
//        if(val == true)
//        {
//            System.out.println("data is valid");
//        }
//        else
//            System.out.println("ERROR");
//    }
//}

//class ford
//{
//    int sn,dn;
//    private int[] D;
//    private int num_ver;
//    public static final int MAX_VALUE = 999;
//
//    public ford(int num_ver)
//    {
//        this.num_ver = num_ver;
//        D = new int[num_ver+1];
//    }
//    public void bellmanFordEval(int source, int[][] a)
//    {
//        for(int node = 0; node<num_ver; node++)
//        {
//            D[node] = MAX_VALUE;
//        }
//        D[source] = 0;
//        for(int node=1; node<= num_ver-1; node++)
//        {
//            for(sn=1;sn<num_ver;sn++)
//            {
//                for(dn = 1; dn<num_ver;dn++)
//                {
//                    if(a[sn][dn] != MAX_VALUE)
//                    {
//                        if (D[dn]>D[sn]+a[sn][dn])
//                        {
//                            D[dn] = D[sn]+a[sn][dn];
//                        }
//                    }
//                }
//            }
//        }
//        for(sn=1;sn<num_ver;sn++) {
//            for (dn = 1; dn < num_ver; dn++) {
//                if (a[sn][dn] != MAX_VALUE) {
//                    if (D[dn] > D[sn] + a[sn][dn]) {
//                        System.out.println("Graph contains negative edges");
//                    }
//                }
//            }
//        }
//        for(int vert = 1; vert<num_ver; vert++)
//        {
//            System.out.println("Distance of source "+source+" to destination "+vert+" is "+ D[vert]);
//        }
//
//    }
//
//    public static void main(String[] args)
//    {
//        int num_ver = 0, source, sn, dn;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num of vertices: ");
//        num_ver = sc.nextInt();
//
//        int[][] a = new int [num_ver+1][num_ver+1];
//        System.out.println("Enter the adjacency matrix: ");
//
//        for(sn=1;sn<=num_ver;sn++)
//        {
//            for(dn=1;dn<=num_ver;dn++)
//            {
//                a[sn][dn] = sc.nextInt();
//                if(sn==dn)
//                {
//                    a[sn][dn] = 0;
//                    continue;
//                }
//                if(a[sn][dn]==0)
//                {
//                    a[sn][dn] = MAX_VALUE;
//                }
//            }
//        }
//        System.out.println("Enter the source vertex: ");
//        source = sc.nextInt();
//        ford b = new ford(num_ver);
//        b.bellmanFordEval(source ,a);
//
//    }
//}
//import java.net.*;
//import java.io.*;
//public class tcp {
//    public static void main(String[] args) throws Exception {
//        Socket sock = new Socket("localhost",4000);
//        System.out.println("enter the file name: ");
//        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//        String fname = buff.readLine();
//        OutputStream ostream = sock.getOutputStream();
//        PrintWriter pwrite = new PrintWriter(ostream, true);
//        pwrite.println(fname);
//
//        InputStream istream = sock.getInputStream();
//        BufferedReader sockread = new BufferedReader(new InputStreamReader(istream));
//        String str;
//        while((str= sockread.readLine()) != null) {
//            System.out.println(str);
//        }
//        pwrite.close();
//        sockread.close();
//        buff.close();
//    }
//}
