package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //課題1 String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
        //     Listに入れる内容は何でもOKだが、複数入れること。
        List<String> nameList = new ArrayList<String>();
        //課題2 Listに入れる内容は何でもOKだが、複数入れること。
        nameList.add("佐藤");
        nameList.add("益田");
        nameList.add("田中");
        nameList.add("小川");
        nameList.add("斉藤");
        for (String name : nameList) {
            System.out.println(name);
        }

        //課題2 任意のプログラムで例外を起こしてみる。
        try {
            System.out.println(nameList.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.print("範囲外");
        }
    }
}