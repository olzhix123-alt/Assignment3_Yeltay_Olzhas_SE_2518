package service;

import repository.MenuRepository;
import model.MenuItem;
import exception.InvalidInputException;
import java.sql.SQLException;
import java.util.List;

public class MenuService {
    private MenuRepository repo = new MenuRepository();

    public void addMenuItem(MenuItem item) throws InvalidInputException, SQLException {
        item.validate();
        repo.create(item);
    }

    public List<MenuItem> getAllItems() throws SQLException {
        return repo.getAll();
    }
}