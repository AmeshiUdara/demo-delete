package com.ameshi.demo.entity;

import com.ameshi.demo.enums.EntryStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "um_user")
public class UserEntity {

    /** The property id is the generated id for all entity */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** The property username is the generated user name for user */
    @Column(name="username", unique=false, nullable=false, length=50)
    private String username;

    /** The property userId is the user id exposed to APIs */
    @Column(name="userId", unique=false, nullable=false, length=50)
    private String userId;

    /** The property password is the generated password for user */
    @Column(name="password", unique=false, nullable=false, length=72)
    private String password;

    /** The property deletedStatus is the generated deleted status for all entity */
    @Enumerated(EnumType.STRING)
    @Column(unique=false, nullable=true, length = 11)
    private EntryStatus deletedStatus = EntryStatus.NOT_DELETED;
}
