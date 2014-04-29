/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String [] args){
        ApplicationContext ctx = null;
        MagicianBean magic = null;
        try{
            ctx = new ClassPathXmlApplicationContext("resource/aop-config-2.xml");
            magic = (MagicianBean) ctx.getBean("magic");
            magic.perform(false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
