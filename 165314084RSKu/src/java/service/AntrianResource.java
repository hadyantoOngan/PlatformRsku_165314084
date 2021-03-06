/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.AntrianHelper;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Antrian;
import pojos.Pasien;

/**
 * REST Web Service
 *
 * @author Hp
 */
@Path("Antrian")
public class AntrianResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AntrianResource
     */
    public AntrianResource() {
    }

    /**
     * Retrieves representation of an instance of service.AntrianResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
        AntrianHelper d = new AntrianHelper();
        Gson gson = new Gson();
        return Response.status(Response.Status.OK)
                .entity(gson.toJson(d.bacaSemuaLokasi()))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "20")
                .header("Access-Preflight-Maxage", "20")
                .build();
    }

    /**
     * PUT method for updating or creating an instance of lokasiResource
     *
     * @param content representation for the resource
     */

    @POST
    @Path("addAntrian")
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public Response AddNewAntrian(String data) {
        Gson gson = new Gson();
        Antrian antrian = gson.fromJson(data, Antrian.class);
        AntrianHelper helper = new AntrianHelper();
        helper.addNewAntrian(
                antrian.getTanggal(),
                antrian.getNoRm(),
                antrian.getNama(),
                antrian.getAlamat(),
                antrian.getNamaKlinik()
        );
        return Response.status(200).entity(antrian).build();
    }
}
