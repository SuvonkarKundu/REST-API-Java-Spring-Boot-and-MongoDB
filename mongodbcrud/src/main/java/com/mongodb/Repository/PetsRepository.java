package com.mongodb.Repository;

/**
 * Created by Suvonkar Kundu on 3/23/2019.
 */

import com.mongodb.Model.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetsRepository extends MongoRepository<Pets, String> {
    Pets findBy_id(ObjectId _id);
}