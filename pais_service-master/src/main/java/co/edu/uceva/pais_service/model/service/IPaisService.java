package co.edu.uceva.pais_service.model.service;

import co.edu.uceva.pais_service.model.entities.Pais;

import java.util.List;

public interface IPaisService {
    Pais save(Pais pais);
    void delete(Pais pais);
    Pais update(Pais pais);
    List<Pais> findAll();
    Pais findById(Long id);



}

