/**
 * 
 */
package com.infosys.memberservice.model;

/**
 * @author Girish_Ramagiri
 *
 */
public class Member {

	public Member() {

	}

	private int memberId;
	private String memberFirstName;
	private String memberLastName;

	public Member(int memberId, String memberFirstName, String memberLastName) {
		this.memberId = memberId;
		this.memberFirstName = memberFirstName;
		this.memberLastName = memberLastName;
	}

	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberFirstName
	 */
	public String getMemberFirstName() {
		return memberFirstName;
	}

	/**
	 * @param memberFirstName the memberFirstName to set
	 */
	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}

	/**
	 * @return the memberLastName
	 */
	public String getMemberLastName() {
		return memberLastName;
	}

	/**
	 * @param memberLastName the memberLastName to set
	 */
	public void setMemberLastName(String memberLastName) {
		this.memberLastName = memberLastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberFirstName=" + memberFirstName + ", memberLastName="
				+ memberLastName + "]";
	}

}
