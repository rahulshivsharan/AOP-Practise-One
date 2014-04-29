/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.two;


import org.springframework.stereotype.Component;


@Component("audiance")
public class AudianceBean {
    
    public void takeSeat(){
        System.out.println("Audiance, please take a seat");
    }
    
    public void switchCell(){
        System.out.println("Audiance, please switch-off your cell phones");
    }
    
    public void appriciate(){
        System.out.println("Audiance, take a bow !!!!!");
    }
    
    public void refund(){
            System.out.println("Audiance, ask for refund");
    }
}
