package com.example.candidate;

import org.springframework.stereotype.Service;

@Service
public class CandidatServices {
    private CandidatRepository candidatRepository;


    public Candidat addCandidat(Candidat candidat){
        return candidatRepository.save(candidat);
    }
    public Candidat updateCandidat(Candidat newCandidat,int id)
    {
        if (candidatRepository.findById(id).isPresent())
        {
            Candidat existingCandidat = candidatRepository.findById(id).get();
            existingCandidat.setNom(newCandidat.getNom());
            existingCandidat.setPrenom(newCandidat.getPrenom());
            existingCandidat.setEmail(newCandidat.getEmail());
            return candidatRepository.save(existingCandidat);
        }
        else
            return null;
    }
    public String deleteCandidat(int id) {
        if (candidatRepository.findById(id).isPresent()) {
            candidatRepository.deleteById(id);
            return "candidat supprimé";
        } else {
            return "candidat non supprimé";
        }
    }
    public Candidat getCandidat(int id){
        return candidatRepository.findById(id).get();
    }

}
