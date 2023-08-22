package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //課題1 String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
        //     Listに入れる内容は何でもOKだが、複数入れること。
        List<String> nameLists = new ArrayList<String>();
        //課題2 Listに入れる内容は何でもOKだが、複数入れること。
        nameLists.add("佐藤");
        nameLists.add("益田");
        nameLists.add("田中");
        nameLists.add("小川");
        nameLists.add("斉藤");
        for (int i = 0; i < nameLists.size(); i++) {
            System.out.print(nameLists.get(i) + "\n");
        }

        //課題2 任意のプログラムで例外を起こしてみる。
        try {
            System.out.print(nameLists.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.print("範囲外");
        }
    }
}