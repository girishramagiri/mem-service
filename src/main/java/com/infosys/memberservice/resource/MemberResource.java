/**
 * 
 */
package com.infosys.memberservice.resource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.memberservice.model.Member;

/**
 * @author Girish_Ramagiri
 *
 */
@RestController
@RequestMapping("/api")
public class MemberResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberResource.class);

	@GetMapping("/v1/{memberId}")
	public Member getMemberById(@PathVariable int memberId) {
		LOGGER.info("MemberResource::Request: {}", memberId);
		List<Member> members = getMembers();
		Member member = members.stream().filter(m -> m.getMemberId() == memberId).findAny().orElse(null);
		if (null != member) {
			LOGGER.info("MemberResource::member found: {}", memberId);
			return member;
		} else {
			LOGGER.error("Member not found for memberId: {}", memberId);
			throw new RuntimeException("Exception raised::Member not found....");
		}
	}

	private List<Member> getMembers() {
		return Stream
				.of(new Member(1, "Mackena", "Gold"), new Member(2, "John", "Smith"), new Member(3, "Steve", "McQueen"))
				.collect(Collectors.toList());
	}
}
