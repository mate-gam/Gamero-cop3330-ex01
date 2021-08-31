/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mateo Gamero
 */
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ex01
{
    @Test
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.print(", nice to meet you!");
    }
}
