package org.ashah.sbdatajpah2;


import org.ashah.sbdatajpah2.entities.User;
import org.ashah.sbdatajpah2.repository.UserRepository;
import org.ashah.sbdatajpah2.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserEntityManagerCommandLineRunner implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(UserEntityManagerCommandLineRunner.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		runWithJpaRepository();

	}
	
	private void runWithoutJpaRepository() {
		log.info("-------------------------------");
		log.info("Adding Tom as Admin");
		log.info("-------------------------------");
		User tom = new User("Tom", "Admin");
		userService.insert(tom);
		log.info("Inserted Tom" + tom);

		log.info("-------------------------------");
		log.info("Finding user with id 1");
		log.info("-------------------------------");
		User user = userService.find(1L);
		log.info(user.toString());

		log.info("-------------------------------");
		log.info("Finding all users");
		log.info("-------------------------------");
		log.info(userService.findAll().toString());
	}
	
	public void runWithJpaRepository() {
		User harry = new User("Harry", "Admin");
		userRepository.save(harry);
		log.info("-------------------------------");
		log.info("Finding all users");
		log.info("-------------------------------");
		for (User user : userRepository.findAll()) {
			log.info(user.toString());
		}
	}

}
