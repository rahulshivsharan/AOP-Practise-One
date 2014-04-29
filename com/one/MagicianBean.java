/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.one;

import org.springframework.stereotype.Component;



@Component("magic")
public class MagicianBean {
    
    @ManageIt
    public void perform(boolean flag) throws Exception{
        if(!flag){
            throw new Exception("I am Sick man !!!!");
        }else{
            for(int x=0; x < 20; x++){
                System.out.println("Performing .....");
                Thread.sleep(2000);
            }
        }
    }
}
