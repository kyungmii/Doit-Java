package pj;

import java.util.ArrayList;
import pj.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int MemberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int sameId = member.getMemberId();
			if (sameId == MemberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(MemberId + "없음");
		return false;

	}

	public void showAllMember() {
		for (Member member : arrayList) { // 확장
			System.out.println(member);
		}
		System.out.println();
	}

}