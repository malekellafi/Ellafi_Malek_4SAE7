package org.example.ellafi_malek84sae7.services.interfaces;
import org.example.ellafi_malek84sae7.entities.Reservation;
import java.util.List;
public interface IReservationService {
    List<Reservation> getAllReservations();
    Reservation getReservationById(long id);
    void addReservation(Reservation reservation);
    void updateReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
}
