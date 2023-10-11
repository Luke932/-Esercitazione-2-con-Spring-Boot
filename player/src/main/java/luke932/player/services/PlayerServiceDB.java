package luke932.player.services;

import luke932.player.entities.Player;
import luke932.player.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceDB implements PlayerService{

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player getPlayer(Long id) {
        Optional<Player> player = this.playerRepository.findById(id);
        if (player.isPresent()) {
            return player.get();
        } else {
            return null;
        }
    }

    @Override
    public void addPlayer(Player player) {
        playerRepository.save(player);
    }

    @Override
    public void updatePlayer(Long id, Player player) {
        playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
