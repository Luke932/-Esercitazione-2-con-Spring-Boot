package luke932.player.controllers;

import luke932.player.entities.Player;
import luke932.player.services.PlayerServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayersController {

    @Autowired
    private PlayerServiceDB playerServiceDB;

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerServiceDB.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable Long id) {
        return playerServiceDB.getPlayer(id);
    }

    @PostMapping("/players")
    public void addPlayer(@RequestBody Player player) {
        playerServiceDB.addPlayer(player);
    }

    @PutMapping("/players/{id}")
    public void updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        playerServiceDB.updatePlayer(id, player);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerServiceDB.deletePlayer(id);
    }

}
