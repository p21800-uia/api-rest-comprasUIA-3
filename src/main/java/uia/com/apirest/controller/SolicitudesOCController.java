package uia.com.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uia.com.apirest.modelo.ItemSolicitudOCModelo;
import uia.com.apirest.modelo.SolicitudOCModelo;
import uia.com.apirest.modelo.ItemComprasUIAModelo;
import uia.com.apirest.servicio.SolicitudOCServicio;

import java.io.IOException;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SolicitudesOCController
{
    private SolicitudOCServicio servicioSolicitudesOC;
    //ArrayList<SolicitudOCModelo> solicitudesOC = new ArrayList<SolicitudOCModelo>();

    @Autowired
    public SolicitudesOCController(SolicitudOCServicio servicio) throws IOException {
        this.servicioSolicitudesOC = servicio;
    }



    @GetMapping("/solicitudesOC")
    public ArrayList<ItemSolicitudOCModelo> viewSolicitudesOC(ModelMap model)
    {
        return servicioSolicitudesOC.getSolicitudesOC();
    }


}
