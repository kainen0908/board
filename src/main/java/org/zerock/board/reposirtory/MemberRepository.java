package org.zerock.board.reposirtory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.board.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
