package service;

import org.aspectj.lang.ProceedingJoinPoint;

public class Sta {

	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		long start=System.currentTimeMillis();
		Object object = joinPoint.proceed();
		long end=System.currentTimeMillis();
		long cost=end-start;
		System.out.println(joinPoint.getSignature().getName()+"������ʱΪ��"+cost+"����.");
		return object;
		}
	
}
