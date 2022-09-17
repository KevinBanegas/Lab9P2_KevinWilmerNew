/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Query implements Serializable {

    private static long SerialNumberUID = 100L;
    private ArrayList<String> query = new ArrayList();

    public Query() {
    }

    public ArrayList<String> getQuery() {
        return query;
    }

    public void setQuery(ArrayList<String> query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return query.toString();

    }
}
