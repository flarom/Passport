package br.com.flarom.passport.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {

    private int id_user;
    private String username;
    private String nickname;
    private String email;
    private String password;

    public User() {

    }

    public User(int id_user, String username, String nickname, String email, String password) {
        this.id_user = id_user;
        this.username = username;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and setters">
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // </editor-fold>

    public void create() throws Exception {
        String sql = "INSERT INTO users (username, nickname, email, password) VALUES (?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, username);
            stmt.setString(2, nickname);
            stmt.setString(3, email);
            stmt.setString(4, MiscTools.encryptPassword(password, MiscTools.generateKey()));
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                this.id_user = rs.getInt(1);
                
                createDefaultCategory();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // automaticaly creates a "Uncategorized" category for this user,
    // so the user can save passwords with this category
    private void createDefaultCategory() {
        String sql = "INSERT INTO categories (id_user, name, color) VALUES (?, 'Uncategorized', '#2285E1')";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, this.id_user);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update() throws Exception {
        String sql = "UPDATE users SET username = ?, nickname = ?, email = ?, password = ? WHERE id_user = ?";
        try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, nickname);
            stmt.setString(3, email);
            stmt.setString(4, MiscTools.encryptPassword(password, MiscTools.generateKey()));
            stmt.setInt(5, id_user);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        String sql = "DELETE FROM users WHERE id_user = ?";
        try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_user);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static User findById(int id_user) {
        String sql = "SELECT * FROM users WHERE id_user = ?";
        try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_user);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getInt("id_user"),
                        rs.getString("username"),
                        rs.getString("nickname"),
                        rs.getString("email"),
                        rs.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
