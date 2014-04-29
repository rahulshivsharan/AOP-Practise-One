/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.two;

import org.springframework.stereotype.Component;



@Component("magic")
public class MagicianBean {
    
    
    public void perform(boolean flag) throws Exception{
        if(!flag){
            throw new Exception("I sucked !!!!");
        }else{
            for(int x=0; x < 20; x++){
                System.out.println("Performing MAGIC .....");
                Thread.sleep(250);
            }
        }
    }
}
