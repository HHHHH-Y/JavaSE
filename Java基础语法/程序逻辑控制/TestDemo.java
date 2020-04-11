import java.util.Scanner;
public class TestDemo {
	/**
	 * 顺序结构
	 * @param args [description]
	 */
	//public static void main1(String[] args) {
		/*System.out.println("aaa"); // aaa
		System.out.println("bbb"); // bbb
		System.out.println("ccc"); // ccc*/

		// 改变了顺序, 输出结果也会不同
		/*System.out.println("aaa"); // aaa
		System.out.println("ccc"); // ccc
		System.out.println("bbb"); // bbb*/
	//}

	/**
	 * 输入输出
	 * @param args [description]
	 */
	//public static void main2(String[] args) {
		// 从键盘输入一个数
		/*Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a); // 输入一个整型的数

		String str = scan.next();
		System.out.println(str);*/

		// next() 和 nextLine() 的区别是什么?
		// next() 遇见空格就会结束掉
		/*Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		String str = scan.next();
		System.out.println(str);*/
    //}


	/**
	 * 分支结构
	 * 1. if  else (条件语句的结果必须是布尔类型的)
	 * 2. switch
	 * @param args [description]
	 */
	//public static void main3(String[] args) {
		// 判定一个数字是奇数还是偶数
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num % 2 == 0){
			System.out.println("偶数");
		} else if(num % 2 != 0){
			System.out.println("奇数");
		} else {
			System.out.println("0");
		}*/
	//}
    //public static void main4(String[] args) {
    	// 判断一个数字是正数还是负数
    	/*Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	if(a > 0){
    		System.out.println("正数");
    	} else if(a < 0){
    		System.out.println("负数");
    	} else {
    		System.out.println("0");
    	}*/

    	// 判断某一年是否为闰年
    	/*Scanner scan = new Scanner(System.in);
    	// 退出循环:
    	// 1. Ctrl + C 直接中断循环
    	// 2. Ctrl + D 正常退出循环
    	while(scan.hasNextInt()) {
    		int year = scan.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
		    System.out.println("是闰年");
		} else {
		    System.out.println("不是闰年");
		   }
    	}
    	*/
    //}

    /**
     * 悬垂else问题
     * @param args [description]
     */
    //public static void main5(String[] args) {
    	// else只会和最近的if进行匹配
    	/*int x = 10; 
    	int y = 10; 
    	if (x == 10)     
    		if (y == 10)        
    			System.out.println("aaa"); 
    	else     
    		System.out.println("bbb");
*/
    //}

    /**
     * switch
     * 注意: 
     * 1. switch语句中, long , float, double, boolean类型不能作为switch的参数
     * 2. 在switch语句中, break尽量不要省略
     * 3. 枚举类型也可以作为switch的参数
     * @param args [description]
     */
    //public static void main6(String[] args) {
    	/*int a = 1;
    	switch(a) {
    		case 1:
    			System.out.println("1");
    			break;
    		case 2:
    			System.out.println("2");
    		    break;
    		default:
    			System.out.println("您的输入有误");
    			break;
    	}*/
    //}


    //public static void main7(String[] args) {
    	//求5的阶乘
    	//5! = 5 * 4 * 3 * 2 * 1;
    	/*int num = 5;
    	int i = 1;
    	int ret = 1;
    	while(i <= num) {
    		ret *= i;
    		i++;
    	}
    	System.out.println(ret);*/
    //}

    //public static void main8(String[] args) {
    	// 计算1! + 2! + 3! + 4! + 5!
    	/*int num = 5;
    	int i = 1;
    	int ret = 1;
    	int sum = 0;
    	while(i <= num) {
    		ret *= i;
    		sum += ret;
    		i++;
    	}*/

    /*	int num = 5;
    	int i = 1;
    	int ret = 1;
    	int j = 1;
    	int sum = 0;
    	while(j <= num){
    		while(i <= j) {
    		ret *= i;
    		i++;
    	 	}
    	 	sum += ret;
    	 	j++;
    	}
    	
    	System.out.println(sum);*/
    //}

    // break的用法
    // 找到1-100中第一个3的倍数
    /**
     * break的作用是终止循环(让循环结束)
     * @param args [description]
     */
  /*  public static void main(String[] args) {
        int i = 1;
        while(i <= 100) {
            if(i % 3 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }*/
    //}


   /* public static void main(String[] args) {
        // 在1 - 100中找出第一个既能被3整除,又能被5整除的数字
        int i = 1;
        while (i <= 100) {
            if(i % 15 == 0) {
                System.out.println(i); // 15
                break;
            }
            i++;
        }
    }*/

    /**
     * coutinue是跳过本次循环, 直接进入下一次循环
     * continue下面的语句都不会执行
     * @param args [description]
     */
   /* public static void main(String[] args) {
        //找到 100 - 200 中所有3的倍数
        int i = 100;
        int count = 0;
        while (i <= 200) {
            if(i % 3 != 0) {
                i++;
                continue;
            } 
            System.out.print(i + " ");
            i++;
        }
    }*/

    /**
     * for循环
     * for(表达式1; 表达式2; 表达式3){
     *     循环体;
     * }
     * 表达式1: 初始化条件
     * 表达式2: 判断条件
     * 表达式3: 步进条件
     * for循环执行的顺序是: 表达式1, 表达式2, 循环体, 表达式3, 表达式2, 循环体, 表达式3...
     * @param args [description]
     */
    //public static void main(String[] args) {
        // 打印1 -10 的数字
     /*   for(int i = 1; i <= 10; i++) {
            System.out.println(i);*/
        //}
        
        
        
            // 计算 1-100 的和
      /*  int i = 1;
        int sum = 0;
        for(i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        
    }*/

    /**
     * do while循环
     * do {
     *   循环体
     * } while(循环条件);
     * do ... while 循环至少执行一次 
     * @param args [description]
     */
 /*   public static void main(String[] args) {
        // 打印1 - 10
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i <= 10);
    }*/

    /**
     * 输入, 输出
     * @param args [description]
     */
  /*  public static void main(String[] args) {
        // 输入
        Scanner scan = new Scanner(System.in);
        // 使用Scanner读取字符串/整数/浮点数
        System.out.println("请输入你的姓名:");
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("请输入你的年龄:");
        int age = scan.nextInt();
        System.out.println(age);
        System.out.println("请输入你的工资:");
        double salary = scan.nextDouble();
        System.out.println(salary);
        scan.close(); // 关闭方法
    }*/

    /**
     * 循环输入
     * @param args [description]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* while(scan.hasNextInt()){
            int num = scan.nextInt();
            System.out.println(num);
        }*/
        while(scan.hasNextDouble()) {
            double num = scan.nextDouble();
            System.out.println(num);
        }
    }
}