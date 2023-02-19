package net.mrrnyash.springbootcrud.repository;

import net.mrrnyash.springbootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
