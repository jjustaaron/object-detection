import java.io.Serializable;

public class Item implements Serializable {
    private String label;
    private double confidence;
    private double xMin;
    private double yMin;
    private double xMax;
    private double yMax;

    public Item(String label, double confidence, double xMin, double xMax, double yMin, double yMax) {
        this.label = label;
        this.confidence = confidence;
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
    }

    public String getLabel() {
        return label;
    }

    public double getConfidence() {
        return confidence;
    }

    public double getXMin() {
        return xMin;
    }

    public double getXMax() {
        return xMax;

    }

    public double getYMin() {
        return yMin;
    }

    public double getYMax() {
        return yMax;
    }
}
