public class ImageInfo {
    private String name;
    private String imagePath;

    public ImageInfo(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
    }

    // Các phương thức getter và setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}