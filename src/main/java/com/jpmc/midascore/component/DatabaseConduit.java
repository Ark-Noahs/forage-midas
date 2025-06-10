package com.jpmc.midascore.component; //this file is part of the component folder in for this project 

import com.jpmc.midascore.entity.UserRecord;//imports "UserRecord" class from entity
import com.jpmc.midascore.repository.UserRepository;//imports repository "UserRepository" interface for the database operations
import org.springframework.stereotype.Component;//imports the spring annatation for declaring a component


@Component//labels this class as a spring component so spring knows to manage it 
public class DatabaseConduit {
    private final UserRepository userRepository;//save and get user info from database 

    //when a new DatabaseConduit is created, Spring will give a UserRepository to use 
    public DatabaseConduit(UserRepository userRepository) {
        this.userRepository = userRepository;//saves the repository to be used for later 
    }

    //method for saveing a user to the database 
    public void save(UserRecord userRecord) {
        userRepository.save(userRecord);//this line saves the users info in DB
    }

}
