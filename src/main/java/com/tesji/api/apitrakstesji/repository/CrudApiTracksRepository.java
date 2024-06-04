package com.tesji.api.apitrakstesji.repository;

import com.tesji.api.apitrakstesji.model.DatosApiTraks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.security.PublicKey;
import java.util.Optional;

//para poder manipular las operaciones Crud
@Repository
public interface CrudApiTraksRepository extends CrudRepository<DatosApiTraks,Long> {

}
