/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.one;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Aspect
@Component("audAspect")
public class AudianceAspect {
    
    @Autowired
    @Qualifier("audiance")
    private AudianceBean audianceBean;
    
    @Around("@annotation(ManageIt)")
    public Object myAroundAdvice(ProceedingJoinPoint jp){
        Object returnValue = null;
        try{
            this.getAudianceBean().takeSeat();
            this.getAudianceBean().switchCell();
            returnValue = jp.proceed();
            this.getAudianceBean().appriciate();
        }catch(Throwable e){
            this.getAudianceBean().refund();
            e.printStackTrace();
        }
        return returnValue;
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
}
