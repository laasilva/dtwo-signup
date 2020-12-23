package io.dtwo.api.signup.repository;

import io.dtwo.api.signup.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, Long> {
}
