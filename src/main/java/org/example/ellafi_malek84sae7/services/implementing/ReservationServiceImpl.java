package org.example.ellafi_malek84sae7.services.implementing;
import lombok.AllArgsConstructor;
import org.example.ellafi_malek84sae7.services.interfaces.IReservationService;
import org.example.ellafi_malek84sae7.entities.Reservation;
import org.example.ellafi_malek84sae7.repositories.ReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    private ReservationRepository reservationRepository;
    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
    @Override
    public Reservation getReservationById(long id) {
        return reservationRepository.findById(id).orElse(null);
    }
    @Override
    public void addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }
    @Override
    public void updateReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }
    @Override
    public void deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

}