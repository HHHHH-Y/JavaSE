public class TestDemo1{
	/**
	 * 基本的四则运算  +  -  *  /
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		// 除法(/)
		System.out.println(5 / 2); // 2
		System.out.println(5.0 / 2); // 2.5
		System.out.println((float)5 / 2); // 2.5
		System.out.println((float)(5 / 2)); // 2.0
		
		// 0不能作为除数
		int a = 10;
		int b = 0;
		System.out.println(a / b); // 错误

		// // 取模(%)
		System.out.println(10 % 3); // 1
		System.out.println(-10 % 3); // -1
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); // -1
	}


    /**
     * 自增, 自减运算
     * @param args [description]
     */
	public static void main2(String[] args) {
		int a = 10;
		int b = ++a; // b = 11 a = 11
		System.out.println(b); // 11
		int c = a++; // c = a(11), a = 12
		System.out.println(c); // 11

		// 自增运算的坑
		int i = 10;
		i = i++;
		System.out.println(i); // 10
	}

	/**
	 * 关系运算符 
	 * == != <= >= < >
	 * 关系运算符的表达式返回值都是boolean类型
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		int a = 10; 
		int b = 20; 
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println(a < b);  // true
		System.out.println(a > b);  // false
		System.out.println(a <= b); // true
		System.out.println(a >= b); // false
	}

	/**
	 * 逻辑运算符
	 * && || !
	 * 逻辑运算符操作数和返回的结果均为boolean类型
	 * @param args [description]
	 */
	public static void main4(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b && b < c); // true

		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b || b < c); // true

		int a = 10;
		int b = 20;
		System.out.println(!(a < b)); // false

		// 短路求值
		// &&: 只要有一个表达式为假, 后面的表达式就不用计算了, 整个表达式都为假
		// ||: 只要有一个表达式为真, 后面的表达式就不用计算了, 整个表达式都为真
		System.out.println(10 > 20 && 10 / 0 == 0); // false
		System.out.println(10 < 20 || 10 / 0 == 0); // true
    }


    /**
     * 位运算符 
     * &  |  ^  ~
     * @param args [description]
     */
    public static void main5(String[] args) {
    	int a = 13;
    	int b = 10;
    	System.out.println(a & b); // 8
    	// 13
    	// 00000000000000000000000000001101 --13
    	// 00000000000000000000000000001010 --10
    	// 00000000000000000000000000001000 --8
    	
    	int a = 13;
    	int b = 10;
    	System.out.println(a | b); // 15
    	// 00000000000000000000000000001101 --13
    	// 00000000000000000000000000001010 --10
    	// 00000000000000000000000000001111 --15
    	 
        // 异或 
    	int a = 13;
    	int b = 10;
    	System.out.println(a ^ b); // 7
    	// 00000000000000000000000000001101 --13
    	// 00000000000000000000000000001010 --10
    	// 00000000000000000000000000000111 --7
    	 
    	// 按位取反
    	int a = 13;
    	// 00000000000000000000000000001101 --13
    	// 11111111111111111111111111110010 --补码
    	// 11111111111111111111111111110001 --反码
    	// 10000000000000000000000000001110 -->-14
    	System.out.println(~a); // -14
    }


    /**
     * 移位运算
     * <<: 左移运算符(右边补0) 
     * >>: 右移运算符(左边补符号位) 
     * >>>(无符号右移操作符: 左边只补0)
     * @param args [description]
     */
    public static void main6(String[] args) {
    	int a = 13;
    	System.out.println(a >> 1); // 6
    	// 00000000000000000000000000001101 --13
    	// 00000000000000000000000000000110 --6
    	
    	int a = 13; 
    	System.out.println(a >> 2); // 3
    	// 00000000000000000000000000001101 --13
    	// 00000000000000000000000000000011 --3
    	
    	int a = 13; 
    	System.out.println(a >>> 1); // 6
    	// 00000000000000000000000000001101 --13
    	// 00000000000000000000000000000110 --6
    }


    /**
     * 条件运算符
     * 表达式1 ? 表达式2 : 表达式3
     * @param args [description]
     */
    public static void main(String[] args) {
    	int a = 10;
    	int b = 20;
    	System.out.println(a > b ? a : b); // 20
    }
}