package br.com.alura.command.impl;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.command.Command;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetCommand implements Command {
    @Override
    public void execute() {
        ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
        PetService petService = new PetService(clientHttpConfiguration);

        try {
            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
