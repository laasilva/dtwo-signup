package io.dtwo.api.signup.service;

import io.dtwo.api.signup.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    List<Player> findAll();
    Optional<Player> findById(Long id);
}
