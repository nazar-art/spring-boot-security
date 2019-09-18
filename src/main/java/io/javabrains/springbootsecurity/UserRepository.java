package io.javabrains.springbootsecurity;

import io.javabrains.springbootsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Nazar Lelyak.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByUserName(String userName);
}
