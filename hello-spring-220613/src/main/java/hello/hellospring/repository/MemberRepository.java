package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    //Optional은 null을 감싸서 반환하는 방법
    Optional<Member> findById(Long id); //id로 회원을 찾는 것을 만든다.
    Optional<Member> findByName(String name);
    List<Member> findAll(); //저장된 모든 회원 리스스트를 반환.

    void clearStore();
}
