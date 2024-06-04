package com.tesji.api.apitrakstesji.service;

import com.tesji.api.apitrakstesji.model.DatosApiTraks;
import com.tesji.api.apitrakstesji.repository.CrudApiTracksRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class ApiTracksServiceImplement implements ApiTraksService {

    @Autowired
    CrudApiTracksRepository crudApiTraksRepository;

    @Override
    public ArrayList<DatosApiTraks> mostrarTracks() {
        return (ArrayList<DatosApiTraks>) crudApiTraksRepository.findAll();
    }

    @Override
    public Optional<DatosApiTraks> buscarTraksPorId(long id) {
        return crudApiTraksRepository.findById(id);
    }

    @Override
    public DatosApiTraks registrarTraks(DatosApiTraks cancion) {
        return crudApiTraksRepository.save(cancion);
    }

    @Override
    public boolean eliminarTrack(long id) {
        return false;
    }
}
// Inyectar un objeto de la clase crudApiTraksRepository para las operaciones CRUD
//objeto normal


