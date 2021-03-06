package edu.drexel.TrainDemo.repositories;

import edu.drexel.TrainDemo.models.Stop;
import edu.drexel.TrainDemo.models.StopTime;
import edu.drexel.TrainDemo.models.Trip;

import org.springframework.data.repository.CrudRepository;

import java.sql.Time;
import java.util.List;

public interface StopTimeRepository extends CrudRepository<StopTime, String> {
    List<StopTime> findByStop(Stop stop);
    List<StopTime> findByTrip(Trip trip);
    List<StopTime> findByStopId(String stopId);
    List<StopTime> findByTripId(long tripId);
    List<StopTime> findByStopSequence(int stopSequence);
    List<StopTime> findByArrivalTime(Time arrivalTime);
    List<StopTime> findByDepartureTime(Time departureTime);
    List<StopTime> findByPickupType(int pickupType);
    List<StopTime> findByDropoffType(int dropoffType);
    List<StopTime> findByTripIdAndStopId(long tripId, String stopId);
}