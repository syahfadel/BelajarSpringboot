package com.domain.belajarspringdasar;

public class Database {
    // single adalah design pattern untuk membuat objek, sebuah objek hanya dibuat
    // sekali saja

    // singleton sederhana
    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    private Database() {

    }
}
