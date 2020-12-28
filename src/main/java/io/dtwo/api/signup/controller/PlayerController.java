package io.dtwo.api.signup.controller;

import io.dtwo.api.signup.model.Player;
import io.dtwo.api.signup.service.PlayerService;
import io.dtwo.api.signup.service.implementation.PlayerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {
    public static final Logger log = LoggerFactory.getLogger(PlayerServiceImpl.class);

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = {"/all"}, method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public List<Player> findAll() {
        try {
            return playerService.findAll();
        } catch(Exception ex) {
            log.warn("ex=", ex);
            throw ex;
        }
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public Optional<Player> findById(@PathVariable("id") Long id) {
        try {
            return playerService.findById(id);
        } catch(Exception ex) {
            log.warn("ex=", ex);
            throw ex;
        }
    }
}
