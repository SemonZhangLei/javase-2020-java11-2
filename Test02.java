package lesson16;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// �ֱ�ʹ�õ�������foreach��forѭ����ʽ����ArrayList
		ArrayList  col=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(true){
			System.out.println("�������"+i+"���ַ�����-1ֹͣ����");
			String str=sc.next();
			if(str.equals("-1")){
				//����
				/*for (Object object : col) {
					System.out.println(object);
				}*/
				//����2
				/*for (int j = 0; j < col.size(); j++) {
					System.out.println(col.get(j));
				}*/
				//����3
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
