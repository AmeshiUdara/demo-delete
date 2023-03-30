package com.ameshi.demo.repository;

import com.ameshi.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{

    /** The method will update user password */
    @Modifying
    @Transactional
    @Query("update UserEntity u set u.deletedStatus = 'DELETED' where u.userId = :userId")
    void deleteUser( @Param("userId") String userId);

    Boolean existsByUserId(String userId);
}
