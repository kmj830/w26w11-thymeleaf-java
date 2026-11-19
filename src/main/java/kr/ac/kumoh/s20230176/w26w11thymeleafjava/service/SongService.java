package kr.ac.kumoh.s20230176.w26w11thymeleafjava.service;

import kr.ac.kumoh.s20230176.w26w11thymeleafjava.model.Song;
import kr.ac.kumoh.s20230176.w26w11thymeleafjava.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class SongService {
    private final SongRepository repository;

    public List<Song> findAllSongs() {
        return repository.findAll();
    }

    public Optional<Song> findSongById(int id) {
        return repository.findById(id);
    }

    public Optional<Song> getRandomSong() {
        List<Song> songs = repository.findAll();
        if (songs.isEmpty()) {
            return Optional.empty();
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(songs.size());
        return Optional.of(songs.get(randomIndex));
    }
}
