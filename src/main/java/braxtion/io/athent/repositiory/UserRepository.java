package braxtion.io.athent.repositiory;

import braxtion.io.athent.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
