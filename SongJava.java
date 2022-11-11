public class SongJava {
    String title;
    String artist;
    int year;
    String country;

    public SongJava(){
        title="미정";
        artist="미정";
        year = 0;
        country = "미정";
    }
    public SongJava(String title,String artist,int year,String country){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    public void show(){
        System.out.println(this.title);
        System.out.println(this.artist);
        System.out.println(this.year);
        System.out.println(this.country);



    }
}
