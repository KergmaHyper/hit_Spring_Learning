package org.pop.Ent;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TigerReplacer implements MethodReplacer {

    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        return "An angry tiger";
    }

}
