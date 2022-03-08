package com.devinhouse.devagro.services;

import com.devinhouse.devagro.models.Empresa;
import com.devinhouse.devagro.repositories.EmpresaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmpresaService {

    private EmpresaRepository empresaRepository;

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public Empresa findById(Long id){
        return empresaRepository.findById(id).get();
    }

    public Empresa add(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa update(Empresa empresa){

        return empresaRepository.save(empresa);
    }

    public void delete(Long id){
        empresaRepository.deleteById(id);
    }
}
