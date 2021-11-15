package pl.infoshare;

public enum Category {
    MUSICANDHITS("Muzyka i Hity"),
    ENTERTAINMENT("Rozrywka"),
    WILDiNSTINCT("Dziki instynkt"),
    ONBIGSCREEN("Na duzym ekranie"),
    HISTORY("Historia"),
    BOOKANDWORDS("Ksiązki i słowa"),
    SPORT("Sport"),
    GEOGRAPHY("Geografia"),
    BIOLOGY("Biologia"),
    POLISHFILM("Film polski"),
    LEAGUEOFLEGENDS("League of Legends"),
    LIVERPOOLFC("Liverpool F.C"),
    FOOTBALL("Piłka nożna");

    private final String category;

    Category(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return category;
    }
}
