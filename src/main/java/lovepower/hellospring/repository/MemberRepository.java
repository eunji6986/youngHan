package lovepower.hellospring.repository;


import lovepower.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);
    List<Member> findAll(); //저장된 모든 회원 리스트를 반환

}
