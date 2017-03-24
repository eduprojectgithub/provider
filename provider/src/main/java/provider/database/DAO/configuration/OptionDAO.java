package provider.database.DAO.configuration;

import java.sql.SQLException;
import java.util.List;

import provider.database.entities.configuration.Option;

public interface OptionDAO {
	public Option getOptionById() throws SQLException;
	public List<Option> getAllOptions() throws SQLException; 
	public void createOption(Option option) throws SQLException;
	public void updateOption(Option option) throws SQLException;
}
