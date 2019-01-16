package com.zbest.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by zhangbin on 2019/1/16.
 */
public class DataUtils {


    public static String getData(String fileName) throws IOException {

        InputStream data = DataUtils.class.getResourceAsStream("data");
        File srcFile = new File("data");

        String content = FileUtils.readFileToString(srcFile);
        List<String> contents = FileUtils.readLines(srcFile);
        System.out.println(content);

        StringBuilder sb = new StringBuilder();
        System.out.println("******************");
        for (String string : contents) {
            sb.append(string);
            System.out.println(string);
        }

        return sb.toString();

    }

    public static void main(String[] args) throws IOException {
        String data = getData("data");

        System.out.println(data);
    }



}
