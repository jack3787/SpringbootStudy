package hello.hellospring.domain;

public class Member {

    private Long id; //id 식별자 == 시스템이 저장하는 id
    private String name; //name 이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
