package com.itheima.day04.API;

public class SystemDemo {
    public static void main(String[] args) {
//        当前操作系统的毫秒值(时间戳)
//        以整数表示的时间叫时间戳
//        计算原点：1970.1.1的0点(第一款操作系统unix发明时间)
//        native：没有方法体，具体实现由c/c++实现
        long l = System.currentTimeMillis();
        System.out.println(l);

//        数组拷贝
        int[] src = {1, 2, 3, 4};
        int[] dest = new int[src.length];
        System.arraycopy(src, 0, dest, 0, src.length);
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + "\t");
        }
//       传0退出虚拟机的退出
        System.exit(0);
//       gc:garbage collection
//        垃圾回收
//        System.gc();
    }
}
