package org.example;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class SaveData {
    static public void saveData(String msg,String user) throws Exception{
        String sql = "INSERT INTO allmessage(message, user_id) VALUES ('"+msg+"','"+user+"')";
        PreparedStatement preparedStatement = CreateConnection.connection.prepareStatement(sql);
        preparedStatement.executeUpdate();

    }
}
