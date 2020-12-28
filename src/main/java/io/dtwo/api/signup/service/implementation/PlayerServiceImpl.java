package io.dtwo.api.signup.service.implementation;

import io.dtwo.api.signup.model.Player;
import io.dtwo.api.signup.repository.PlayerRepository;
import io.dtwo.api.signup.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {
    public static final Logger log = LoggerFactory.getLogger(PlayerServiceImpl.class);

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> findAll() {
        try {
            return playerRepository.findAll(Sort.by("name"));
        } catch(Exception ex) {
            log.error("ex=", ex);
            throw ex;
        }
    }

    @Override
    public Optional<Player> findById(Long id) {
        return playerRepository.findById(id);
    }
}
