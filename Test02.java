package lesson16;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 分别使用迭代器、foreach和for循环方式遍历ArrayList
		ArrayList  col=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(true){
			System.out.println("请输入第"+i+"个字符串，-1停止输入");
			String str=sc.next();
			if(str.equals("-1")){
				//遍历
				/*for (Object object : col) {
					System.out.println(object);
				}*/
				//遍历2
				/*for (int j = 0; j < col.size(); j++) {
					System.out.println(col.get(j));
				}*/
				//遍历3
				ListIterator it=col.listIterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
				break;
			}else{
				col.add(str);
				i++;
			}
		}

	}

}
