package com.tesji.api.apitrakstesji.repository;

import com.tesji.api.apitrakstesji.model.DatosApiTraks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//para poder manipular las operaciones Crud
@Repository
public interface CrudApiTracksRepository extends CrudRepository<DatosApiTraks,Long> {

}
