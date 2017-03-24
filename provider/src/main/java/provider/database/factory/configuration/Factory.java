package provider.database.factory.configuration;

import provider.database.DAO.configuration.OptionDAO;
import provider.database.DAOImpl.configuration.OptionDAOImpl;

public class Factory {

	private static Factory instance;
	private static OptionDAO optionDAO = null;
	
	public static synchronized Factory getInstance() {
		if(instance == null) {
			instance = new Factory();
		}
		return instance;
	}
	
	public OptionDAO getOptionDAO() {
		if(optionDAO == null) {
			optionDAO = new OptionDAOImpl();
		}
		return optionDAO;
	}
}
