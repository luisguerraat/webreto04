package com.desaextremo.retocuatro.repository;

import com.desaextremo.retocuatro.entity.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GadgetRepository extends MongoRepository<Gadget,Integer> {
}
