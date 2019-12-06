package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        Prototype p1 = context.getBean(Prototype.class);
        Prototype p2 = context.getBean(Prototype.class);

        System.out.println("s1与s2是否相等"+s1.equals(s2));
        System.out.println("p1与p2是否相等"+p1.equals(p2));

        context.close();
    }

}
