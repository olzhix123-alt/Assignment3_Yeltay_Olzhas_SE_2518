package repository;

import model.*;
import utils.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    public void create(MenuItem item) throws SQLException {
        String sql = "INSERT INTO menu_items (name, price, type) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, item.getName());
            pstmt.setDouble(2, item.getPrice());
            pstmt.setString(3, item.getType());
            pstmt.executeUpdate();
        }
    }

    public List<MenuItem> getAll() throws SQLException {
        List<MenuItem> items = new ArrayList<>();
        String sql = "SELECT * FROM menu_items";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String type = rs.getString("type");
                if ("Food".equals(type)) {
                    items.add(new FoodItem(rs.getInt("id"), rs.getString("name"), rs.getDouble("price")));
                } else {
                    items.add(new DrinkItem(rs.getInt("id"), rs.getString("name"), rs.getDouble("price")));
                }
            }
        }
        return items;
    }
}