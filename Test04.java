package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test04 {

	public static void main(String[] args) {
		// ��һ���б��д洢����Ԫ�أ�apple,grape,banana,pear
		//3.1 ���ؼ����е����ĺ���С��Ԫ��
		//3.2 �����Ͻ������򣬲��������Ľ����ӡ�ڿ���̨�� [������]
      
		List list=new ArrayList();
		list.add("apple");
		list.add("applea");
		list.add("appleb");
		list.add("grape");
		list.add("banana");
		list.add("pear");
		
		Object obj=Collections.max(list);
		Object obj2=Collections.min(list);
		System.out.println("���Ԫ����"+obj);
		System.out.println("��СԪ��"+obj2);
		
		Collections.sort(list);
		for (Object object : list) {
			System.out.println(object);
		}
		
      //����̨����ѧ�����������䣬�ɼ�����ѧ������ڼ�����
		//1.�������� ��ʾѧ������������ɼ�����Ϣ
		//2.���ճɼ����򣬴�ӡ��ѧ�������ͳɼ�������
		//3.����༶ƽ���֣���߷֣���ͷ�
	}

}
