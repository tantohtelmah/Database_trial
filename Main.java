package connectivity;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception{

        Button button = new Button();
        TextField expressionField = new TextField();
        TextField expressionField1 = new TextField();
        TextField expressionField2 = new TextField();
        TextField expressionField3 = new TextField();
        button.setOnAction(actionEvent ->
        {
            Connection conn = null;
            try {
                conn = MySQLConnection.class.newInstance().getConnection();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            String name = expressionField.getText().replace("'", "''");
            int age = expressionField1.getPrefColumnCount();
            String address = expressionField2.getText().replace("'", "''");
            String surname = expressionField3.getText().replace("'", "''");
            System.out.println(name);
            String sql = "insert into trial1.user (user,age,address,surname) values('"+ name + "','"+ age + "','"+ address + "', '"+ surname + "')" ;
            System.out.println(sql);
            Statement statement = new Statement() {
                @Override
                public ResultSet executeQuery(String sql) throws SQLException {
                    return null;
                }

                @Override
                public int executeUpdate(String sql) throws SQLException {
                    return 0;
                }

                @Override
                public void close() throws SQLException {

                }

                @Override
                public int getMaxFieldSize() throws SQLException {
                    return 0;
                }

                @Override
                public void setMaxFieldSize(int max) throws SQLException {

                }

                @Override
                public int getMaxRows() throws SQLException {
                    return 0;
                }

                @Override
                public void setMaxRows(int max) throws SQLException {

                }

                @Override
                public void setEscapeProcessing(boolean enable) throws SQLException {

                }

                @Override
                public int getQueryTimeout() throws SQLException {
                    return 0;
                }

                @Override
                public void setQueryTimeout(int seconds) throws SQLException {

                }

                @Override
                public void cancel() throws SQLException {

                }

                @Override
                public SQLWarning getWarnings() throws SQLException {
                    return null;
                }

                @Override
                public void clearWarnings() throws SQLException {

                }

                @Override
                public void setCursorName(String name) throws SQLException {

                }

                @Override
                public boolean execute(String sql) throws SQLException {
                    return false;
                }

                @Override
                public ResultSet getResultSet() throws SQLException {
                    return null;
                }

                @Override
                public int getUpdateCount() throws SQLException {
                    return 0;
                }

                @Override
                public boolean getMoreResults() throws SQLException {
                    return false;
                }

                @Override
                public void setFetchDirection(int direction) throws SQLException {

                }

                @Override
                public int getFetchDirection() throws SQLException {
                    return 0;
                }

                @Override
                public void setFetchSize(int rows) throws SQLException {

                }

                @Override
                public int getFetchSize() throws SQLException {
                    return 0;
                }

                @Override
                public int getResultSetConcurrency() throws SQLException {
                    return 0;
                }

                @Override
                public int getResultSetType() throws SQLException {
                    return 0;
                }

                @Override
                public void addBatch(String sql) throws SQLException {

                }

                @Override
                public void clearBatch() throws SQLException {

                }

                @Override
                public int[] executeBatch() throws SQLException {
                    return new int[0];
                }

                @Override
                public Connection getConnection() throws SQLException {
                    return null;
                }

                @Override
                public boolean getMoreResults(int current) throws SQLException {
                    return false;
                }

                @Override
                public ResultSet getGeneratedKeys() throws SQLException {
                    return null;
                }

                @Override
                public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
                    return 0;
                }

                @Override
                public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
                    return 0;
                }

                @Override
                public int executeUpdate(String sql, String[] columnNames) throws SQLException {
                    return 0;
                }

                @Override
                public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
                    return false;
                }

                @Override
                public boolean execute(String sql, int[] columnIndexes) throws SQLException {
                    return false;
                }

                @Override
                public boolean execute(String sql, String[] columnNames) throws SQLException {
                    return false;
                }

                @Override
                public int getResultSetHoldability() throws SQLException {
                    return 0;
                }

                @Override
                public boolean isClosed() throws SQLException {
                    return false;
                }

                @Override
                public void setPoolable(boolean poolable) throws SQLException {

                }

                @Override
                public boolean isPoolable() throws SQLException {
                    return false;
                }

                @Override
                public void closeOnCompletion() throws SQLException {

                }

                @Override
                public boolean isCloseOnCompletion() throws SQLException {
                    return false;
                }

                @Override
                public <T> T unwrap(Class<T> iface) throws SQLException {
                    return null;
                }

                @Override
                public boolean isWrapperFor(Class<?> iface) throws SQLException {
                    return false;
                }
            };
            try {
                statement = conn.createStatement();
//                statement.executeUpdate(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            try {
                statement.executeUpdate(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        });

//        Connection conn = MySQLConnection.class.newInstance().getConnection();

//        TextField expressionField = new TextField();expressionField.getText();
//        TextField answerField = new TextField();

        VBox textFieldLine = new VBox();
        textFieldLine.getChildren().addAll(expressionField,expressionField1,expressionField2,expressionField3, button);

        Scene scene = new Scene(textFieldLine);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
