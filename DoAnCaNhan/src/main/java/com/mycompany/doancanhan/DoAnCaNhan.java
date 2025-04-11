/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doancanhan;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DoAnCaNhan {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so thu nhat: ");
            double a = scanner.nextDouble();
            
            System.out.print("Nhap so thu hai: ");
            double b = scanner.nextDouble();
            
            double tong = a + b;
            
            System.out.println("Tong so thu nhat va thu hai la: " + tong);
        }
    }
}
