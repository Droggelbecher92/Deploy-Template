package de.neuefische.backend.service;

import de.neuefische.backend.model.Something;
import de.neuefische.backend.repo.SomethingRepo;
import org.springframework.stereotype.Service;

@Service
public class SomethingService {

    private final SomethingRepo somethingRepo;


    public SomethingService(SomethingRepo somethingRepo) {
        this.somethingRepo = somethingRepo;
    }

    public void addNewSomething(Something build) {
        somethingRepo.save(build);
    }
}
