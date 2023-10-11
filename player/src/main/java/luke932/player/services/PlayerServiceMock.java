package luke932.player.services;

import luke932.player.entities.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerServiceMock implements PlayerService{

    private List<Player> players = new ArrayList<>(Arrays.asList(new Player(Long.valueOf(1), "Francesco", "Totti", "Roma", "midfielder"),
            new Player(Long.valueOf(2), "Gonzalo", "Higuain", "Juventus", "forward"), new Player(Long.valueOf(3), "Mauro", "Icardi", "Inter", "forward")));

    @Override
    public List<Player> getAllPlayers() {
        return players;
    }

    @Override
    public Player getPlayer(Long id) {
        return players.stream()
                .filter(player -> player.getId() == id)
                .findFirst()
                .get();
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void updatePlayer(Long id, Player player) {
        for (int i = 0; i < players.size(); i++){
            Player p = players.get(i);
            if(p.getId() == id) {
                players.set(i, player);
            }
        }
    }

    @Override
    public void deletePlayer(Long id) {
        players.removeIf(player -> player.getId() == id);
    }
}
