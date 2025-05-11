package com.being.beingRv.Model;


import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type;
    @Column
    private String name;
    @Column
    private Long mobileNumber;

    @Column
    private Long balance=0L;

    @Column
    private String address;

}
