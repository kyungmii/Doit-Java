package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList(); 
		
		Member memberLee = new Member(101,"이순신");
		Member memberKim = new Member(101,"김유신");
		Member memberShin = new Member(101,"신사임당");
		
		memberArrayList.addMember(memberShin);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);

		memberArrayList.showAll();
		
		System.out.println("-----------------------------------------");
		
		List<Member> list = new ArrayList<>();
		
		list.add(memberShin);
		list.add(memberLee);
		list.add(memberKim);
		
		for(Member mem : list) {
			System.out.println(mem);
		}
	}

}
