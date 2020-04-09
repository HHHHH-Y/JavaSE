public class TestDemo{
	public static void main1(String[] args) {
		System.out.println("\\\"hello\\\"");
		short a = 128;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(b);
		
		double x = 2.0;
		int y = 4;
		x /= ++y; // x = x / ++y
		System.out.println(x); 
		
		int a = 3;
		byte b = a;
		
		byte a = 130;
		float b = 3.5;
	}
	  /**
     * 长整型(Long) 占8个字节. 范围为 -2^63 ~ +2^63-1
     * long --> Long
     * @param args [description]
     */
    public static void main2(String[] args) {
		long a = 10L; // 长整型在定义的时候后面最好加上L
		System.out.println("a的值是" + a);
		System.out.println("最大值是:" + Long.MAX_VALUE);
		System.out.println("最小值是:" + Long.MIN_VALUE);
    }

	/**
	 * String args[] 的作用: 运行时命令行的参数
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
		System.out.println("cool");
	}

	/**
	 * 双精度浮点数(double) 8个字节
	 * double --> Double
	 * @param args [description]
	 */
	public static void main4(String[] args) {
		double d = 1.0;
		System.out.println(d); // 1.0
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

 		int a = 1;
 		int b = 2;
 		// a b 均为整型, 运算得到的结果也为整型
 		System.out.println(a / b); // 0
 		
 		double a = 1.0;
 		double b = 2.0;
 		System.out.println(a / b); // 0.5

 	    double num = 1.1;
 	    System.out.println(num * num); // 最佳
 	    System.out.printf("%lf", num * num); 
	}

	/**
	 * 单精度浮点型(float) 占4个字节
	 * float --> Float
	 * @param args [description]
	 */
	public static void main5(String[] args) {
		float a = 2.5;
		System.out.println(a); // 从double转到float会有损失
		float a = 2.5f;
		System.out.println(a); // 2.5
	}

	/**
	 * 字符类型变量(char) 占2个字节 范围为 0 ~ 65535
	 * char --> Character
	 * 在java中使用的是Unicode表, 这包含了ASCII表, 比ASCII表更大. 因此char占了2个字节
	 * @param args [description]
	 */
	public static void main6(String[] args) {
		char ch = 'a';
		System.out.println(ch); // a
		char ch1 = 97;
		System.out. println(ch1); // a
		char ch2 = '凡';
		System.out.println(ch2); // 凡
	}

	/**
	 * 字节类型变量(byte) 占一个字节 范围为 -128 ~ + 127
	 * byte --> Byte
	 * 每一种数据类型, 在给其赋值的时候, 一定不能超过他的范围
	 * @param args [description]
	 */
	public static void main7(String[] args) {
		byte b = 0;
		System.out.println(b);
		System.out.println(Byte.MAX_VALUE); // 127
		System.out.println(Byte.MIN_VALUE); // -128
		
		byte b = 130; 

	}

	/**
	 * 短整形(short) 占2个字节 范围是 -32768 ~ +32767
	 * short --> Short
	 * @param args [description]
	 */
	public static void main8(String[] args) {
		short s = 12;
		System.out.println(s); // 12
		System.out.println(Short.MAX_VALUE); // 32767
		System.out.println(Short.MIN_VALUE); // 32768
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
		boolean flg = false;
		System.out.println(flg);
		if(1){
			// 错误
			// boolean不能用0 或者 1 来代替
		}
	}

	/**
	 * 字符串数据类型(String)
	 * String是引用类型
	 * 在进行+运算的时候, 只要出现了字符串, +就起的是拼接作用, 得到的值也为字符串
	 * @param args [description]
	 */
	public static void main10(String[] args) {
		//String str = "hello";
		//System.out.println(str); // hello
		// 打印 "hello"
		String str = "\"hello\"";
		System.out.println(str); // "hello"
		// 转义字符
		// \n  换行符
		// \t  水平制表符
		// \'  单引号
		// \"  双引号
		// \\  反斜杠
		
		// 字符串中的+表示的是将两个字符串的内容进行拼接
		String str1 = "hello";
		String str2 = "world";
		System.out.println(str1 + str2); // helloworld

		int a = 10;
		int b = 20;
		System.out.println(a + b); // 30

		String str = "a = ";
		int c = 10;
		System.out.println(str + c); // a = 10
		
		int a = 10;
		int b = 20;
		System.out.println("a = " + a + ", b = " + b); // a = 10, b = 20
	}

	/**
	 * 常量
	 * 1. 字面值常量
	 * 2. final修饰的变量
	 * 常量只能被初始化一次, 并且使用的时候, 一定要记得初始化
	 * @param args [description]
	 */
	public static void main11(String[] args) {
		// 字面值常量
		// 10;
		// 1.0;
		// 'a';
		// "abc"
		// true;
		
		// final修饰的变量
		final int MAX = Integer.MAX_VALUE;
		MAX = 999; // 错误
		System.out.println(MAX); // 2147483647
		
		final int MAX; 
		MAX = 999;
		MAX = 1999; // 错误
		System.out.println(MAX); // 999
	}

	/**
	 * 类型转换
	 * 1. 隐式类型转换: 范围小的向范围大的转换
	 * 2. 显式类型转换: 范围大的向范围小的转化
	 * @param args [description]
	 */
	public static void main12(String[] args) {
		// 1. 隐式类型转换
		int a = 10;
		long b = 20L;
		//b = a;
		//System.out.println(b); // 10
		a = b; // 错误

		double a = 3.14;
		float b = 2.5F;
		// a = b;
		// System.out.println(a); // 2.5
		b = a; // 错误
		System.out.println(b);
		
		// 2. 显式类型转换
		int a = 10;
		long b = 20L;
		a = (int)b; // 强制类型转化
		System.out.println(a); // 20
		
		int 和 boolean 就不可以进行相互转化
		int a = 10;
		int flag = true;
		//a = flag;// 错误
		flag = a; // 错误 
	}

	/**
	 * 数值提升
	 * 两个不同类型混合运算的时候才会发生数值提升
	 * 相同类型的话就不会发生数值提升
	 * @param args [description]
	 */
	public static void main13(String[] args) {
		int a = 10;
		long b = 20L;
		//int c = a + b; // 错误
		long d = a + b; 
		System.out.println(d); // 30

		byte a = 10;
		byte b = 20;
		//byte c = a + b; // 错误
		byte c = (byte)(a + b); 
		System.out.println(c); // 30
		
		//byte 和 int 类型进行混合运算, 会发生数值提升
		byte b = Byte.MAX_VALUE + 1;
		byte d = 127 + 1;
		System.out.println(b); // 错误
		System.out.println(d); // 错误

		// 两边都是int, 所以不会发生数值提升
		int a = Integer.MAX_VALUE + 1;
		int b = 2147483647 + 1;
		System.out.println(a); // -2147483648
		System.out.println(b); // -2147483648
	}

	/**
	 * String 和 int 之间的转化
	 * @param args [description]
	 */
	public static void main(String[] args) {
		// int 转化为 String
		int a = 10;
		// 方法1:
		String str1 = a + "";
		// 方法2:
		String str2 = String.valueOf(a);

		// String 转化成 int
		String str = "100";
		int num = Integer.parseInt(str);
		// Integer.parseInt()是有条件的, 并不是所有的String类型的数都可以通过这种方式转化成int 
	}
}