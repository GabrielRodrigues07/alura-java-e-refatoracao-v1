package br.com.alura.command.impl;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.command.Command;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetCommand implements Command {
    @Override
    public void execute() {
        ClientHttpConfiguration clientHttpConfiguration = new ClientHttpConfiguration();
        PetService petService = new PetService(clientHttpConfiguration);

        try {
            petService.importarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
