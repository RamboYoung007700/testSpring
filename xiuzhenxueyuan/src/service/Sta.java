package service;

import org.aspectj.lang.ProceedingJoinPoint;

public class Sta {

	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		long start=System.currentTimeMillis();
		Object object = joinPoint.proceed();
		long end=System.currentTimeMillis();
		long cost=end-start;
		System.out.println(joinPoint.getSignature().getName()+"方法耗时为："+cost+"毫秒.");
		return object;
		}
	
}
