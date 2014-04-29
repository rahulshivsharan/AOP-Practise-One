/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.two;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Aspect
@Component("audAspect")
public class AudianceAspect {

    @Autowired
    @Qualifier("audiance")
    private AudianceBean audianceBean;

    @Before("magic()")
    public void takeSeat() {
        this.getAudianceBean().takeSeat();
    }

    @Before("magic()")
    public void cellPhone() {
        this.getAudianceBean().switchCell();
    }
    
    @AfterReturning("magic()")
    public void enjoyedMagic(){
        this.getAudianceBean().appriciate();
    }
    
    @AfterThrowing("magic()")
    public void notLikedMagic(){
        this.getAudianceBean().refund();
    }

    /**
     * @return the audianceBean
     */
    public AudianceBean getAudianceBean() {
        return audianceBean;
    }

    /**
     * @param audianceBean the audianceBean to set
     */
    public void setAudianceBean(AudianceBean audianceBean) {
        this.audianceBean = audianceBean;
    }

    @Pointcut("execution(* com.two.MagicianBean.perform(..))")
    public void magic() {
    }
}
