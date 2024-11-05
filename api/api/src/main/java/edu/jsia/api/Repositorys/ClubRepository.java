package edu.jsia.api.Repositorys;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsia.api.dtos.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Club findByMailClub(String mailClub);
    
    Optional<Club> findByMailClubAndContrasenyaClub(String mailClub, String contrasenyaClub);
}
