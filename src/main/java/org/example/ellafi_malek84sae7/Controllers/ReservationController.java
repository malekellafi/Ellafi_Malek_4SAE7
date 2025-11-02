package org.example.ellafi_malek84sae7.Controllers;

import org.example.ellafi_malek84sae7.entities.Reservation;
import org.example.ellafi_malek84sae7.services.interfaces.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;



@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    private final IReservationService reservationService;

    public ReservationController(IReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/add")
    public String addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @DeleteMapping("/delete")
    public void deleteReservation(@RequestBody Reservation reservation) {
        reservationService.deleteReservation(reservation);
    }



    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable long id) {
        return reservationService.getReservationById(id);
    }

    @PutMapping("/update")
    public void updateReservation(@RequestBody Reservation reservation) {
        reservationService.updateReservation(reservation);
    }
}