package com.java21days;

public class Menu {
        String name = "น้ำเปล่า";
        int amount  = 1000;
        double weight = 10.40;
        void printMenu() {
                System.out.println("โปรดเลือกสินค้านที่ต้องการ");
                System.out.println("กด 1.ขายสินค้า :");
                System.out.println("กด 2.ซื้อสินค้า :");
                System.out.println("กด 3.พิมพ์ใบเสร็จรับเงิน :");
                System.out.println("กด 4.พิมพ์ใบสั่งซื้อ :");
                System.out.println("กด ออกจากโปรแกรม :");
        }
}