/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;

import static java.sql.DriverManager.println;

/**
 *
 * @author Hieu-PC
 */
public class thanh {

    public static String main(String[] args) {
        int a = 0;
        String tmp = "";

        while (a != 0) {
            tmp = a % 2;
            a = a / 2;
        }
        return tmp;
    }
}
