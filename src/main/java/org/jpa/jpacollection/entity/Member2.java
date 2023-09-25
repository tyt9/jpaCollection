package org.jpa.jpacollection.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@ToString
public class Member2 { // < 1인 쪽은 entity만 일단 만들기

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    private Long phone;
    private String password;
    private String name;
    private String address;

    @OneToMany(mappedBy = "member2")
    private List<CartProduct> cartList = new ArrayList<>();
}
