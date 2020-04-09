public class TestDemo{
	public static void main1(String[] args) {
		// System.out.println("\\\"hello\\\"");
		// short a = 128;
		// byte b = (byte)a;
		// System.out.println(a);
		// System.out.println(b);
		
		// double x = 2.0;
		// int y = 4;
		// x /= ++y; // x = x / ++y
		// System.out.println(x); 
		
		// int a = 3;
		// byte b = a;
		
		// byte a = 130;
		// float b = 3.5;
	}
	  /**
     * 长整型(Long) 占8个字节. 范围为 -2^63 ~ +2^63-1
     * long --> Long
     * @param args [description]
     */
    public static void main2(String[] args) {
		// long a = 10L; // 长整型在定义的时候后面最好加上L
		// System.out.println("a的值是" + a);
		// System.out.println("最大值是:" + Long.MAX_VALUE);
		// System.out.println("最小值是:" + Long.MIN_VALUE);
    }

	/**
	 * String args[] 的作用: 运行时命令行的参数
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		// for(int i = 0; i < args.length; i++){
		// 	System.out.println(args[i]);
		// }
		// System.out.println("cool");
	}

	/**
	 * 双精度浮点数(double) 8个字节
	 * double --> Double
	 * @param args [description]
	 */
	public static void main4(String[] args) {
		// double d = 1.0;
		// System.out.println(d); // 1.0
		// System.out.println(Double.MAX_VALUE);
		// System.out.println(Double.MIN_VALUE);

 		// int a = 1;
 		// int b = 2;
 		// // a b 均为整型, 运算得到的结果也为整型
 		// System.out.println(a / b); // 0
 		
 		// double a = 1.0;
 		// double b = 2.0;
 		// System.out.println(a / b); // 0.5

 	 //    double num = 1.1;
 	 //    System.out.println(num * num); // 最佳
 	    //System.out.printf("%lf", num * num); 
	}

	/**
	 * 单精度浮点型
	 * @param args [description]
	 */
	public static void main(String[] args) {
		
	}
}