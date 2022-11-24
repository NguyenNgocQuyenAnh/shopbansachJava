/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Tinhtoan implements ITtinhtoan{

    @Override
    public int cong(int a, int b) throws Exception {
        System.out.println("Tong: "+(a+b)+": "+java.time.LocalTime.now());
        return a+b;
    }

    @Override
    public int tru(int a, int b) throws Exception {
        System.out.println("Hieu: "+(a-b)+": "+java.time.LocalTime.now());
       return a-b; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int nhan(int a, int b) throws Exception {
       return a*b; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float chia(int a, int b) throws Exception {
        return (float)a/b;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
