package com.angi.jvm.chapter3;

/**
 * VM Args:-XX:PrintGCDetails
 * 
 * objA和 objB会不会被GC呢？
 * 
 * @author Angi
 * 
 */
public class ReferenceCountingGC {

	public Object instance = null;

	private static final int _1MB = 1024 * 1024;

	/**
	 * 这个成员属性的唯一意义就是占点内存，以便能在GC日志中看清楚是否被回收过
	 */
	@SuppressWarnings("unused")
	private byte[] bigSize = new byte[2 * _1MB];

	public static void main(String[] args) {
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		objA.instance = objB;
		objB.instance = objA;
		objA = null;
		objB = null;
		System.gc();
	}
	
	/*[GC [DefNew: 2417K->150K(4928K), 0.0039409 secs] 2417K->2198K(15872K), 0.0040016 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
			[Full GC (System) [Tenured: 2048K->150K(10944K), 0.0061001 secs] 4335K->150K(15872K), [Perm : 2153K->2153K(12288K)], 0.0062120 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
			Heap
			 def new generation   total 4992K, used 89K [0x03a70000, 0x03fd0000, 0x08fc0000)
			  eden space 4480K,   2% used [0x03a70000, 0x03a866d8, 0x03ed0000)
			  from space 512K,   0% used [0x03ed0000, 0x03ed0000, 0x03f50000)
			  to   space 512K,   0% used [0x03f50000, 0x03f50000, 0x03fd0000)
			 tenured generation   total 10944K, used 150K [0x08fc0000, 0x09a70000, 0x13a70000)
			   the space 10944K,   1% used [0x08fc0000, 0x08fe5a40, 0x08fe5c00, 0x09a70000)
			 compacting perm gen  total 12288K, used 2158K [0x13a70000, 0x14670000, 0x17a70000)
			   the space 12288K,  17% used [0x13a70000, 0x13c8ba98, 0x13c8bc00, 0x14670000)
			No shared spaces configured.*/

}
