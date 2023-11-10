/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Proyecto_IHC.Interfaces;

import com.example.Proyecto_IHC.Clases.Anuncios;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Rengifo
 */
public interface IAnunciosService {
    public List<Anuncios> Listar();
    public Optional<Anuncios> ConsultarId(int id);
    public void Guardar(Anuncios c);
    public void Eliminar(int id);
    public List<Anuncios> Buscar(String desc);
}
