package com.diet;

import java.io.File;
import java.util.Scanner;

public class MdtoCsv
{
    public static void main(String[] args) throws Exception
    {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\Sachin\\Desktop\\2021-06-18-muskmelon-and-banana-smoothie.md");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}


