class SportSchoolModel implements Comparable<SportSchoolModel>{

    private String trainer;
    private String city;
    private int year;

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(SportSchoolModel o) {
        return trainer.compareTo(o.trainer);
    }
    @Override
    public String toString() {
        return "SportSchoolModel{" +
                "year='" + year + '\'' +
                ", city='" + city + '\'' +
                ", trainer=" + trainer +
                '}';
    }


}