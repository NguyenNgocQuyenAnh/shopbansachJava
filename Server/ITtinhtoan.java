
import java.rmi.Remote;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author Admin
 */
public interface ITtinhtoan extends Remote{
    public int cong(int a,int b) throws Exception;
    public int tru(int a,int b) throws Exception;
     public int nhan(int a,int b) throws Exception;

    /**
     *
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    public float chia(int a,int b) throws Exception;
}
