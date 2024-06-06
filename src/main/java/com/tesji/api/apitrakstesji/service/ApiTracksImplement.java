package com.tesji.api.apitrakstesji.service;

import com.tesji.api.apitrakstesji.model.DatosApiTraks;
import com.tesji.api.apitrakstesji.repository.CrudApiTracksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ApiTracksImplement implements ApiTraksService {

    @Autowired
    CrudApiTracksRepository crudApiTracksRepository;

    @Override
    public ArrayList<DatosApiTraks> mostrarTracks() {
        return (ArrayList<DatosApiTraks>) crudApiTracksRepository.findAll();
    }

    @Override
    public Optional<DatosApiTraks> buscarTraksPorId(long id) {
        return crudApiTracksRepository.findById(id);
    }

    @Override
    public DatosApiTraks registrarTraks(DatosApiTraks cancion) {
        return crudApiTracksRepository.save(cancion);
    }

    @Override
    public boolean eliminartrack(long id) {
        return false;
    }
}
// Inyectar un objeto de la clase crudApiTracksRepository para las operaciones CRUD
//objeto normal


