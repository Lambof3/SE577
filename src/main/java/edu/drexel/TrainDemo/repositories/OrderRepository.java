package edu.drexel.TrainDemo.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.drexel.TrainDemo.models.Route;

public interface OrderRepository extends CrudRepository<Route, Long> {

}
