/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahellocollection2;

import JavaMVCControllers.*;
/**
 *
 * @author railenei
 */
public class JavaHelloCollection2 {

    /*
    acest program este invatat din acest tutorial de pe codeproject
    https://www.codeproject.com/Articles/879896/Programming-in-Java-using-the-MVC-architecture
    
    
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloWorldController Cnt = new HelloWorldController();
        Cnt.startApplication();
    }
    
}
