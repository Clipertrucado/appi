package edu.jsia.api.servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.jsia.api.dtos.Club;
import edu.jsia.api.dtos.LoginRequest;

import java.util.List;

@RestController
@RequestMapping("/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping
    public List<Club> getAllClubs() {
        return clubService.getAllClubs();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Club club = clubService.login(loginRequest.getMail(), loginRequest.getContrasenya());
        if (club != null) {
            return ResponseEntity.ok(club);  // Retornar el club o un token de autenticación
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Correo o contraseña incorrectos");
        }
    }

    @PostMapping
    public ResponseEntity<Club> createClub(@RequestBody Club club) {
        Club nuevoClub = clubService.createClub(club);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoClub);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Club> updateClub(@PathVariable Long id, @RequestBody Club clubDetails) {
        try {
            return ResponseEntity.ok(clubService.updateClub(id, clubDetails));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClub(@PathVariable Long id) {
        clubService.deleteClub(id);
        return ResponseEntity.noContent().build();
    }
}
