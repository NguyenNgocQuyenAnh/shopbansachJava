
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyServer {
     public static void main(String[] args) {
    try{
     Tinhtoan tt= new Tinhtoan();
     //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
        UnicastRemoteObject.exportObject(tt);
     //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
        Naming.bind("rmi://172.16.0.173/TinhToan",tt);
     System.out.print("Da cho may khach goi den:");
    }catch(MalformedURLException | AlreadyBoundException | RemoteException tt)   {}
  }

}
