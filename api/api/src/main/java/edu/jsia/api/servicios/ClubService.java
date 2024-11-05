package edu.jsia.api.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsia.api.Repositorys.*;
import edu.jsia.api.dtos.Club;

import java.util.List;
import java.util.Optional;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    public Club login(String mail, String contrasenya) {
        Optional<Club> club = clubRepository.findByMailClubAndContrasenyaClub(mail, contrasenya);
        return club.orElse(null);  // Retorna el club si existe, si no, retorna null
    }
    
    

    public Club createClub(Club club) {
        return clubRepository.save(club);
    }

    public Club updateClub(Long id, Club clubDetails) {
        Club club = clubRepository.findById(id).orElseThrow(() -> new RuntimeException("Club no encontrado"));
        club.setNombreClub(clubDetails.getNombreClub());
        club.setMailClub(clubDetails.getMailClub());
        club.setContrasenyaClub(clubDetails.getContrasenyaClub());
        club.setColoresClub(clubDetails.getColoresClub());
        club.setDescripcionClub(clubDetails.getDescripcionClub());
        club.setLocalizadorClub(clubDetails.getLocalizadorClub());
        club.setFechaAltaClub(clubDetails.getFechaAltaClub());
        return clubRepository.save(club);
    }

    public void deleteClub(Long id) {
        clubRepository.deleteById(id);
    }
}

