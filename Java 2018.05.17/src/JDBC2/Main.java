package JDBC2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.���� 2.��ȸ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.print("�̸�");
			String name = sc.next();
			System.out.print("����");
			int age = sc.nextInt();
			System.out.print("��ȭ��ȣ");
			String tel = sc.next();
			System.out.print("����ȣ");
			String memNum = sc.next();
			Member mem = new Member(name, age, tel, memNum);
			MemberDAO dao = new MemberDAO();
			dao.insert(mem);

		} else if (choice == 2) {
			System.out.print("����ȣ");
			String memNum = sc.next();
			MemberDAO dao = new MemberDAO();
			Member m = dao.selectOne(memNum);
			System.out.println("�̸�/����/��ȭ��ȣ/����ȣ");
			System.out.println(m.getName()+ "/" + m.getAge() + 
					"/" + m.getTel() + "/" + m.getMemNum());
		}
	}

}
