import java.sql.*;
public class pet_adoption {
    public static void addPet(String name, String species, int age, int shelterId) {
        try {
            Connection conn = Db.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO pet (name, species, age, shelter_id) VALUES (?, ?, ?, ?)"
            );
            ps.setString(1, name);
            ps.setString(2, species);
            ps.setInt(3, age);
            ps.setInt(4, shelterId);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getAllPets() {
        try {
            Connection conn = Db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pet");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("species") + " " +
                                rs.getInt("age") + " " +
                                rs.getInt("shelter_id")
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updatePetAge(int id, int newAge) {
        try {
            Connection conn = Db.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE pet SET age = ? WHERE id = ?"
            );
            ps.setInt(1, newAge);
            ps.setInt(2, id);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deletePet(int id) {
        try {
            Connection conn = Db.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM pet WHERE id = ?"
            );
            ps.setInt(1, id);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

