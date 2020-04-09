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
	 * 单精度浮点型(float) 占4个字节
	 * float --> Float
	 * @param args [description]
	 */
	public static void main5(String[] args) {
		// float a = 2.5;
		// System.out.println(a); // 从double转到float会有损失
		// float a = 2.5f;
		// System.out.println(a); // 2.5
	}

	/**
	 * 字符类型变量(char) 占2个字节 范围为 0 ~ 65535
	 * char --> Character
	 * 在java中使用的是Unicode表, 这包含了ASCII表, 比ASCII表更大. 因此char占了2个字节
	 * @param args [description]
	 */
	public static void main6(String[] args) {
		// char ch = 'a';
		// System.out.println(ch); // a
		// char ch1 = 97;
		// System.out. println(ch1); // a
		// char ch2 = '凡';
		// System.out.println(ch2); // 凡
	}

	/**
	 * 字节类型变量(byte) 占一个字节 范围为 -128 ~ + 127
	 * byte --> Byte
	 * 每一种数据类型, 在给其赋值的时候, 一定不能超过他的范围
	 * @param args [description]
	 */
	public static void main7(String[] args) {
		// byte b = 0;
		// System.out.println(b);
		// System.out.println(Byte.MAX_VALUE); // 127
		// System.out.println(Byte.MIN_VALUE); // -128
		
		//byte b = 130; 

	}

	/**
	 * 短整形(short) 占2个字节 范围是 -32768 ~ +32767
	 * short --> Short
	 * @param args [description]
	 */
	public static void main8(String[] args) {
		// short s = 12;
		// System.out.println(s); // 12
		// System.out.println(Short.MAX_VALUE); // 32767
		// System.out.println(Short.MIN_VALUE); // 32768
	}

	/**
	 * 布尔类型的变量(boolean) 
	 * 1. 在java中, 布尔类型没有明确规定占几个字节
	 * 2. 在java中, 布尔类型只有两种取值: true 和 false
	 * 3. 在java中, 没有所谓的 0为假, 非0为真
	 * boolean --> Boolean
	 * @param args [description]
	 */
	public static void main9(String[] args) {
		// boolean flg = false;
		// System.out.println(flg);
		// if(1){
		// 	// 错误
		// 	// boolean不能用0 或者 1 来代替
		// }
	}

	/**
	 * 字符串数据类型(String)
	 * @param args [description]
	 */
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str); // hello
		
	}
}