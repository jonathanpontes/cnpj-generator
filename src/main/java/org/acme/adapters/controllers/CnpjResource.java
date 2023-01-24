package org.acme.adapters.controllers;

import org.acme.application.ports.CnpjGenerator;
import org.acme.application.ports.CnpjValidator;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CnpjResource {

    @Inject
    CnpjGenerator cnpjGenerator;
    @Inject
    CnpjValidator cnpjValidator;

    /* GeraCpfCnpj gerador = new GeraCpfCnpj();
        String cpf = gerador.cpf(true);
        System.out.printf("CPF: %s, Valido: %s\n", cpf, gerador.isCPF(cpf));

        String cnpj = gerador.cnpj(false);
        System.out.printf("CNPJ: %s, Valido: %s\n", cnpj, gerador.isCNPJ(cnpj));

        String rg = gerador.rg(true);
        System.out.printf("RG: %s", rg);*/

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        String cnpj = cnpjGenerator.cnpj(false);
        System.out.printf("CNPJ: %s, Valido: %s\n", cnpj, cnpjValidator.isCNPJ(cnpj));

        return cnpj;
    }
}
