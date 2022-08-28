package org.pop.Ent;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void takeSeats() {
        System.out.println("The Audience`s taking seat.");
    }

    public void offCellPhones() {
        System.out.println("The Audience is turning off cell phone");
    }

    public void applaud() {
        System.out.println("The Audiene is applauding: CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("RASCALS! We want our money back!");
    }

    public void watchPerform(ProceedingJoinPoint joinPoint) {

        try {
            takeSeats();
            offCellPhones();
            long start = System.currentTimeMillis();
            joinPoint.proceed();
            applaud();
            applaud();
            joinPoint.proceed();

            long stop = System.currentTimeMillis();
            System.out.println("The performance took: " + (stop - start) + " miliseconds.");
            applaud();
        } catch (Throwable t) {
            demandRefund();
        }
    }
}
