package kr.co.bitcamp.polymorphism05;

public class CompactDisc extends Product{
    
    private String albumTitile;
    private String artist;
   
    
    public CompactDisc(int productID, String description, String maker, int price, String albumTitile, String artist) {
        super(productID, description, maker, price);
        this.albumTitile = albumTitile;
        this.artist = artist;
    }


    public String getAlbumTitile() {
        return albumTitile;
    }


    public String getArtist() {
        return artist;
    }
    
    @Override
    public void shouwInfo() {
        super.shouwInfo();
        System.out.println("앨범 타이틀 >>" + this.getAlbumTitile());
        System.out.println("아티스트 >> " + this.getArtist());
    }

}
