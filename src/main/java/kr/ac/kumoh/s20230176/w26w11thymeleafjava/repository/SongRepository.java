package kr.ac.kumoh.s20230176.w26w11thymeleafjava.repository;

import kr.ac.kumoh.s20230176.w26w11thymeleafjava.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongRepository {
    List<Song> findAll();
    Optional<Song> findById(int id);
}
