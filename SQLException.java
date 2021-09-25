public void testExecuteUpdateNoAutoGenColumnName() throws SQLException {

    Statement stmt = createStatement();

    String[] columnNames = new String[2];
    columnNames[0] = "I";
    columnNames[1] = "S";
    try {
        stmt.executeUpdate("insert into tab1 values(2, 3, 4.1)",
                columnNames);
        fail("FAIL -- executeUpdate should have failed...");
    } catch (SQLException ex) {
        assertFailedExecuteUpdateForColumnName(ex);
    }
}