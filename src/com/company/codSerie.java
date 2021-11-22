package com.company;

import java.util.ArrayList;

public class codSerie {

    private static ArrayList<getMenu> arraySeries = new ArrayList<>();

    public static ArrayList<getMenu> getArraySeries() {
        return arraySeries;
    }

    static public void addSerie(getMenu y){
        arraySeries.add(y);
    }

    static public String list(){
        String exit = "";
        int x = 1;
        for (getMenu y : arraySeries){
            exit += "\n----- Série:"+ (x++) + "-----\n";
            exit += y.print();
        }
        return exit;
    }

    static public int searchSerie(int search){
        int qnt = 0;
        for (getMenu y : arraySeries){
            if (y.getTitle().equalsIgnoreCase(String.valueOf(search))){
                qnt++;
            }
        }
        return qnt;
    }

    static public boolean remove(String title){
        for (getMenu y : arraySeries){
            if (y.getTitle().equalsIgnoreCase(title)){
                arraySeries.remove(y);
                return true;
            }
        }
        return false;
    }

    static int allSeries(){
        int total = 0;
        for (getMenu y : arraySeries){
            total += y.getTotalSeries();
        }
        return total;
    }

    static public boolean assistido(String watchList){
        for (getMenu y : arraySeries){
            if (y.getWatchList().equalsIgnoreCase(watchList)){
                System.out.println("Série assistida.");
                return true;
            }
        }
        return false;
    }

}
