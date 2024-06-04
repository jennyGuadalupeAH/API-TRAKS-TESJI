package com.tesji.api.apitrakstesji.service;

import com.tesji.api.apitrakstesji.model.DatosApiTraks;

import java.util.ArrayList;
import java.util.Optional;

public class ApiTracksServiceImplement implements ApiTraksService {
    @Override
    public ArrayList<DatosApiTraks> mostrarTracks() {
        return null;
    }

    @Override
    public Optional<DatosApiTraks> buscarTraksPorId(long id) {
        return Optional.empty();
    }

    @Override
    public DatosApiTraks registrarTraks(DatosApiTraks cancion) {
        return null;
    }

    @Override
    public boolean eliminarTrack(long id) {
        return false;
    }
}
