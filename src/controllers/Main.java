package controllers;

import java.util.ArrayList;
import java.util.List;
import utils.FileLogger;

import models.User;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
	
	public static void main(String[] args)
	{
	  FileLogger logger = FileLogger.getLogger();
	  logger.log("Creating user list");

	  List<User> users = new ArrayList<User>();
	  users.add(new User("Bart", "Simpson", "bart@simpson.com", "secret"));
	  users.add(new User("Homer", "Simpson", "bart@simpson.com", "secret"));
	  users.add(new User("Lisa", "Simpson", "bart@simpson.com", "secret"));
	  System.out.println(users);

	  logger.log("Finished - shutting down");
	}

}