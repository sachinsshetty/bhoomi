package com.diet;

import java.io.File;
import java.util.Scanner;

public class MdtoCsv
{
    public static void main(String[] args) throws Exception
    {
        // pass the path to the file as a parameter
        File file = new File("E:\\Sahana\\github\\ammanaaduge.com\\_posts\\breakfast\\2021-10-30-mangalore-buns.md");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}


