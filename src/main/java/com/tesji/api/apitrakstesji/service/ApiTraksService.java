package com.tesji.api.apitrakstesji.service;

import com.tesji.api.apitrakstesji.model.DatosApiTraks;

import java.util.ArrayList;
import java.util.Optional;

//Definir  metodos abstractos para implementar en los end-points"
public interface ApiTraksService {
    ArrayList<DatosApiTraks> mostrarTracks(); //metodos para mostrar los tracks
    Optional<DatosApiTraks> buscarTraksPorId(long id);
    DatosApiTraks registrarTraks(DatosApiTraks cancion); //Registrar y actualizar
    boolean eliminarTrack(long id);
}
