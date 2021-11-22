package com.company;

public class getMenu {
    private String title;
    private int seasons;
    private int totalEpisodes;
    private String sinopse;
    private String watchList;
    private int totalSeries;

    public getMenu(String title, String sinopse, String watchList, int seasons, int totalEpisodes) {}

    public getMenu(String title, int seasons, int totalEpisodes, String sinopse, String watchList, int totalSeries) {
        this.title = title;
        this.seasons = seasons;
        this.totalEpisodes = totalEpisodes;
        this.sinopse = sinopse;
        this.watchList = watchList;
        this.totalSeries = totalSeries;
    }

    public getMenu(String title, String sinopse, String watchList, int seasons, int totalEpisodes, int totalSeries) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getWatchList() {
        return watchList;
    }

    public void setWatchList(String watchList) {
        this.watchList = watchList;
    }

    public int getTotalSeries() {
        return totalSeries;
    }

    public void setTotalSeries(int totalSeries) {
        this.totalSeries = totalSeries;
    }

    public String print(){
        return "Título:"+ title + "\n Temporadas:"+ seasons + "\nEpisódios totais:" + totalEpisodes + "\nSinopse:"
                + sinopse + "\nEstá série foi assistida?" + watchList;
    }
}
