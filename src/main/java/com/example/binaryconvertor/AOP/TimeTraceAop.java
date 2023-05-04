package com.example.binaryconvertor.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {

//    @Pointcut("execution(* com.example.lalala.*.controller.*RestController.*(..))")
//    public void cut() {}
//
//    @Around("cut()") // 로직을 적는 부분 여기임
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
//        // parameter 뭘로 쓸거야?
//        // return 값은 어떤거 쓸거야?
//
//        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
//                .getRequest().getSession();
//
//        // 로그인을 안했을 경우 ;
//        if(session.getAttribute("id") == null) {
//            return null;
//        } // 로그인을 한 경우 ;
//        else {
//            return joinPoint.proceed();
//        }
//    }


}