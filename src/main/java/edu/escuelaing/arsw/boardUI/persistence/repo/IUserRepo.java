package edu.escuelaing.arsw.boardUI.persistence.repo;

import edu.escuelaing.arsw.boardUI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository <User, Integer>{
    
}
