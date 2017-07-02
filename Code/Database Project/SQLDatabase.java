/**
 * RUTGERS New Brunswick. School of Arts and Science.
 * Student: Danilo Navas.
 * Prof.: Andrew Tjang.
 * Assignment: Milestone 3 for Database Project.
 */
public class SQLDatabase {
    // start main
    public static void main(String[] args) {
        final String tableName = "animals";
        MyDB myDB = new MyDB();

        System.out.println("\n\t\t\t       danSQL NEW AND IMPROVED! ");
        System.out.println("\t\t\t     By Danilo Navas. Spring 2015");
        System.out.println("\t  This Database stores animal information. The table name is \"animals\"");
        System.out.println("\t  Columns: [date_in] [name] [species] [breed] [gender] [age] [status]");
        System.out.println("\t\tChanges: optimizations, UPDATE and DELETE commands added.");
        System.out.println("\t\t      Commands: SELECT, INSERT, UPDATE, DELETE.");
        System.out.println("\t\t\t    Enter \"bye\" + <enter> to exit");
        System.out.println("\t\t\t\t    Version: MS03\n");

        Query qu = Query.readQuery("bye", true);
        while (qu != null) {
            if (tableName.equals(qu.getRelationName())) {
                if (qu.isInsert())  insert(qu, myDB);
                else if (qu.isSelect())  select(qu, myDB);
                else if (qu.isDelete())  delete(qu, myDB);
                else if (qu.isUpdate())  update(qu, myDB);
            } else {
                System.out.println("Invalid table name.");
            }
            qu = Query.readQuery("bye", true);
        } // end while

    } // end main

    /**
     * Static boolean method. returns true if "select" command was successful,
     * returns false otherwise.
     */
    public static boolean select(Query selectQuery, MyDB myDB) {
        String[][] allRecords = myDB.getRecords();
        // if database only has one record(i.e: headerRow), return error message.
        if (allRecords.length == 1) {
            System.out.println("0 rows, table is empty.");
            return false;
        }
        String separationLine =
                "------------------------------------------------------------------------------";
        String[] queryFields = selectQuery.getSelectFields();
        int whereID = selectQuery.getWhereID();
        int foundID = findWhereID(whereID, allRecords);
        // if fields are more than 7 return false, since it exceeds the number of valid fields.
        if (queryFields.length > 7) {
            System.out.println("Field(s) exceed max fields in table.");
            return false;
        }
        /******** Find fields from queryFields in myDB ******/
        int[] foundFieldsIndex = findFieldsIndex(queryFields, myDB.getHeaderFields());
        if (foundFieldsIndex == null) return false;

        // No whereID present. i.e. whereID -1.
        if (whereID == -1) {
            // if fields is only 1 and its value is '*' and no whereID present, return all records from myDB.
            if (queryFields.length == 1 && queryFields[0].equals("*")) {
                System.out.println();
                System.out.println(separationLine);
                // print headerRow
                for (int i=0; i < allRecords[0].length; i++) {
                    System.out.print("|" + allRecords[0][i] + "|\t");
                }
                System.out.println();
                System.out.println(separationLine);
                // print records
                for (int i = 1; i < allRecords.length; i++) {
                    for (int j = 0; j < allRecords[0].length; j++) {
                        System.out.print("| " + allRecords[i][j] + " |  ");
                    }
                    System.out.println();
                }
                System.out.println(separationLine);
                System.out.println("\t" + (allRecords.length-1) + " row(s) in set\n");
            } else {
                // Print fields specified in query.
                System.out.println();
                System.out.println(separationLine);
                // Print headerRow.
                for (int i=0; i < foundFieldsIndex.length; i++) {
                    System.out.print("\t" + allRecords[0][foundFieldsIndex[i]]);
                }
                System.out.println();
                System.out.println(separationLine);
                // print records
                for (int i = 1; i < allRecords.length; i++) {
                    for (int j = 0; j < foundFieldsIndex.length; j++) {
                        if (allRecords[i][j] != null) {
                            System.out.print("\t" + allRecords[i][foundFieldsIndex[j]] + "  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println(separationLine);
                System.out.println("\t" + (allRecords.length-1) + " row(s) in set\n");
            }

        } else if (foundID > 0) {
            // if field is 1 and is '*', print all fields for foundID.
            if (queryFields.length == 1 && queryFields[0].equals("*")) {
                System.out.println();
                System.out.println(separationLine);
                // Print headerRow.
                for (int i=0; i < allRecords[0].length; i++) {
                    System.out.print("\t" + allRecords[0][i]);
                }
                System.out.println();
                System.out.println(separationLine);
                // Print record
                for (int i=0; i < allRecords[0].length; i++) {
                    System.out.print("\t" + allRecords[foundID][i]);
                }
                System.out.println();
                System.out.println(separationLine);
                System.out.println("\t1 row(s) found\n");
            } else {
                System.out.println();
                System.out.println(separationLine);
                // Print headerRow.
                for (int i=0; i < foundFieldsIndex.length; i++) {
                    System.out.print("\t" + allRecords[0][foundFieldsIndex[i]]);
                }
                System.out.println();
                System.out.println(separationLine);
                for (int i=0; i < foundFieldsIndex.length; i++) {
                    System.out.print("\t" + allRecords[foundID][foundFieldsIndex[i]] + "  ");
                }
                System.out.println();
                System.out.println(separationLine);
                System.out.println("\t1 row(s) found\n");
                System.out.println();
            }
        } else { // If whereID not found ,return with error message.
            System.out.println("id="+ whereID + " not found.");
            return false;
        }
        return true;
    } // end select()

    /**
     * Static boolean method. returns true if "insert" command was successful,
     * returns false otherwise.
     */
    public static boolean insert(Query insertQuery, MyDB myDB) {
        String[] vals = insertQuery.getInsertValues();
        if (vals.length != 7) {
            System.out.println("You must enter exactly 7 values.");
            return true;
        } else {
            boolean isDate = vals[0].matches("\\d{4}-\\d{2}-\\d{2}");
            if (!isDate) {
                System.out.println("date format must be yyyy-mm-dd");
                return true;
            }
            try {
                Integer.parseInt(vals[5]);
            } catch (NumberFormatException ex) {
                System.out.println("age must be an integer.");
                return true;
            }
            // Values are good, create new record. store record into myDB.
            if (!myDB.store(vals)) { // should NEVER happen!
                System.out.println("Unable to store record. Contact admin (danilo).");
                return false;
            } else {
                System.out.println("Query OK, 1 row(s) affected.");
            }
        }
        return true;
    } // end insert()

    /**
     * Static boolean method. returns true if "delete" command was successful,
     * returns false otherwise.
     */
    public static boolean delete(Query deleteQuery, MyDB myDB) {
        String[][] allRecords = myDB.getRecords();
        // if database only has one record(i.e: headerRow), return with error message.
        if (allRecords.length == 1) {
            System.out.println("0 rows, table is empty.");
            return false;
        }
        int whereID = deleteQuery.getWhereID();
        int foundID = findWhereID(whereID, allRecords);
        // foundID -1 means no where clause was not present; delete all records.
        if (whereID == -1) {
            for (int i=1; i < allRecords.length; i++) {
                for (int j=0; j < allRecords[0].length; j++) {
                    allRecords[i][j] = null;
                }
            }
            myDB.changeRowNumber(true); // Reset rowNumber in MyDB class to 1.
            System.out.println("Query OK, " + (allRecords.length-1) + " row(s) affected.");
        } else if (foundID > 0) {
            // Where clause is present, delete record specified by foundID.
            for (int i=0; i < allRecords[foundID].length; i++) {
                allRecords[foundID][i] = null;
            }
            myDB.changeRowNumber(false); // Decrease rowNumber by 1.
            System.out.println("Query OK, 1 row(s) affected.");
            return true;
        } else { // If foundID not found ,return with error message.
            System.out.println("id="+ whereID + " not found.");
        }
        return true;
    }

    /**
     * Static boolean method. returns true if "update" command was successful,
     * returns false otherwise.
     */
    public static boolean update(Query updateQuery, MyDB myDB) {
        String[][] allRecords = myDB.getRecords();
        // if database only has one record(i.e: headerRow), return with error message.
        if (allRecords.length == 1) {
            System.out.println("0 rows, table is empty.");
            return false;
        }
        // If update field is "id", return error message "id" is not accessible.
        if (updateQuery.getUpdateField().equalsIgnoreCase("id")) {
            System.out.println("id field NOT accessible for update!");
            return false;
        }
        int whereID = updateQuery.getWhereID();
        int foundID = findWhereID(whereID, allRecords);
        int updateColumnIndex = findUpdateColumnIndex(updateQuery.getUpdateField(), myDB.getHeaderFields());
        if (updateColumnIndex == -1) return false;
        String updateValue = updateQuery.getUpdateValue();
        if (!validateUpdateValue(updateValue, updateColumnIndex)) return false;
        // whereID -1 means no where clause was not present; update all records.
        if (whereID == -1) {
            for (int i=1; i < allRecords.length; i++) {
                allRecords[i][updateColumnIndex] = updateValue;
            }
            System.out.println("Query OK, " + (allRecords.length-1) + " row(s) affected.");
        } else if (foundID > 0) {
            // Where clause is present, update record specified by foundID.
            allRecords[foundID][updateColumnIndex] = updateValue;
            System.out.println("Query OK, 1 row(s) affected.");
        } else { // If foundID not found ,return with error message.
            System.out.println("id="+ whereID + " not found.");
            return false;
        }
        return true;
    }

    /*--------------------- MyDB class ------------------------*/
    private static class MyDB {
        // private variables
        private String[][] myDB;
        private int rowNumber;
        private int rowID;
        private final String[] headerRow =
                new String[]{"id", "date_in", "name", "species", "breed", "gender", "age", "status"};

        public MyDB() {
            this.rowNumber = 1;
            this.rowID = 1;
            this.myDB = new String[rowNumber][8];
            this.myDB[rowNumber-1] = this.headerRow;
        }

        public boolean store(String[] newRecord) {
            // if newRecord passed is null return false.
            if (newRecord == null) return false;
            // if myDB is full create new one with one more row.
            if (this.myDB[this.rowNumber-1] != null) {
                // prepare new record with 8 values;
                String[] record = new String[8];
                record[0] = "" + this.rowID;
                for (int i=1; i < record.length; i++) {
                    record[i] = newRecord[i-1];
                }
                // create new array.
                String[][] tempDB = new String[rowNumber+1][8];
                // copy myDB into tempDB
                for (int i=0; i < this.myDB.length; i++) {
                    tempDB[i] = this.myDB[i];
                }
                // store record into tempDB.
                tempDB[this.rowNumber] = record;
                // set myDB equal to tempDB and increase rowNumber
                this.myDB = tempDB;
                this.rowNumber++;
                this.rowID++;
            } else {
                return false;
            }
            return true;
        }
        // Return all valid (i.e. row not null) records in set.
        public String[][] getRecords() {
            if (this.myDB.length > 1) {
                int count = 1; // 1 means headerRow
                for (int i=1; i < this.myDB.length; i++) {
                    if (this.myDB[i][0] != null) count++;
                }
                String[][] temp = new String[count][8];
                // Copy valid records from myDB to temp.
                int tempIndex = 0;
                for (int i=0; i < this.myDB.length; i++) {
                    if (this.myDB[i][0] != null) {
                        System.arraycopy(myDB[i], 0, temp[tempIndex], 0, 8);
                        tempIndex++;
                    }
                }
                myDB = temp;
            }
            return myDB;
        }
        // Return headerRow fields
        public String[] getHeaderFields() {
            return headerRow;
        }
        // Change rowNumber when record(s) are deleted.
        public void changeRowNumber(boolean reset) {
            if (reset) this.rowNumber = 1; // newValue = 1 means all rows were deleted.
            else this.rowNumber--; // if newValue = 0 means only one row was deleted.
        }
    }
    /*--------------------- End MyDB class ---------------------*/

    /*##################### HELPER METHODS #####################*/
    // Find query fields in myDB fields.
    private static int[] findFieldsIndex(String[] queryFields, String[] myTableFields) {
        int[] fieldsColumnIndex = new int[queryFields.length];
        int count = 0;
        for (int i=0; i < queryFields.length; i++) {
            for (int j=0; j < myTableFields.length; j++) {
                if (queryFields[i].equals(myTableFields[j])) {
                    fieldsColumnIndex[i] = j;
                    count++;
                }
            }
        }
        // If not all fields were found in myTableFiels, return.
        if (count != queryFields.length && !queryFields[0].equals("*")) {
            System.out.println("1 or more fields were not found.");
            return null;
        }
        return fieldsColumnIndex;
    }
    // Find update field in myDB fields.
    private static int findUpdateColumnIndex(String updateField, String[] myTableFields) {
        for (int i=0; i < myTableFields.length; i++) {
            if (updateField.equals(myTableFields[i])) {
                return i;
            }
        }
        System.out.println("Update field not found.");
        return -1;
    }
    // Find whereID in myDB records and return it's index
    private static int findWhereID(int whereID, String[][] allRecords) {
        for (int i=1; i < allRecords.length; i++) {
            if (Integer.parseInt(allRecords[i][0]) == whereID) {
                return i;
            }
        }
        return -1;
    }
    // Validate update value when doing an UPDATE.
    public static boolean validateUpdateValue(String updateValue, int updateColumnIndex) {
        if (updateColumnIndex == 1 && !updateValue.matches("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("date format must be yyyy-mm-dd.");
            return false;
        }
        if (updateColumnIndex == 6) {
            try {
                Integer.parseInt(updateValue);
            } catch (NumberFormatException ex) {
                System.out.println("age must be an integer.");
                return false;
            }
        }
        return true;
    }
   /*##################### END HELPER METHODS ###################*/

} // end SQLDatabase class
