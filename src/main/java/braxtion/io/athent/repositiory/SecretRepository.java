package braxtion.io.athent.repositiory;

import braxtion.io.athent.models.Secret;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretRepository extends CrudRepository<Secret, Long> {
}
