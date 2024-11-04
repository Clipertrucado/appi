package edu.jsia.api.Repositorys;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsia.api.servicios.*;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Club findByMailClub(String mailClub);
}
