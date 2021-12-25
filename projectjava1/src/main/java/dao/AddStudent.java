package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent {
    private static PreparedStatement state;
    private static Scanner input = new Scanner(System.in);

    public static void add() throws SQLException {
        System.out.print("user name : ");
        String email=input.next();
        System.out.print("password : ");
        String password=input.next();

        String quert="insert into login (userName,passwword) values(?,?)";
        state= DbConnect.connect().prepareStatement(quert);

        state.setString(1, email);
        state.setString(2, password);

        state.execute();


    }
}
