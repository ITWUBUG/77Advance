package com.itheima.day10;

import java.io.*;

public class CopyFileUtil {

    private CopyFileUtil() {
    }

    /**
     * 文件复制
     * @param srcPath 源路径
     * @param destPath 目标路径
     */
    public static void copyFile(String srcPath,String destPath){
        try (
                FileInputStream fi = new FileInputStream(srcPath);
                FileOutputStream fo = new FileOutputStream(destPath);) {
            byte[] bytes = new byte[1024];
            int read;
            while ((read = fi.read(bytes, 0, bytes.length)) != -1) {
                fo.write(bytes,0,read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 文件复制
     * @param srcPath 源路径
     * @param destPath 目标路径
     */
    public static void copyFileBuffer(String srcPath,String destPath){
        try (
                FileInputStream fi = new FileInputStream(srcPath);
                BufferedInputStream bi = new BufferedInputStream(fi);
                FileOutputStream fo = new FileOutputStream(destPath);
                BufferedOutputStream bo = new BufferedOutputStream(fo)) {
            byte[] bytes = new byte[1024];
            int read;
            while ((read = bi.read(bytes, 0, bytes.length)) != -1) {
                bo.write(bytes,0,read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
