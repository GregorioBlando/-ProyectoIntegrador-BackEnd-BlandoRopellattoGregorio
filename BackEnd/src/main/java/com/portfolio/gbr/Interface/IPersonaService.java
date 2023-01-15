/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gbr.Interface;

import com.portfolio.gbr.Entidad.Persona;
import java.util.List;


public interface IPersonaService {
    /* Traer una lista de personas */
    public List<Persona> getPersona();
    
    /* Guardar un objeto de tipo persona */
    public void savePersona(Persona persona);
    
    /* Eliminar un objeto por Id*/
    public void deletePersona(Long id);
    
    /* Buscar una persona por Id */
    public Persona findPersona(Long id);
}
