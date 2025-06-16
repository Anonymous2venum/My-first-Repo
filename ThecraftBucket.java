// Base class
class Material {
    String baseMaterial;

    public void setMaterial(String material) {
        baseMaterial = material;
    }

    public void showMaterial() {
        System.out.println("Base Material: " + baseMaterial);
    }
}

// Intermediate class
class CraftItem extends Material {
    String itemType;

    public void setItemType(String type) {
        itemType = type;
    }

    public void showItemType() {
        System.out.println("Craft Item Type: " + itemType);
    }
}

// Derived class
class painting  extends CraftItem {
    String design;
    String colorPalette;

    public void setDesignDetails(String design, String colors) {
        this.design = design;
        this.colorPalette = colors;
    }

    public void showpaintingdetail() {
        System.out.println("Tray Design: " + design);
        System.out.println("Color Palette: " + colorPalette);
    }
}

// Main class renamed to match your brand
public class ThecraftBucket {
    public static void main(String[] args) {
       painting p=new painting();
         p.setItemType("Painting ");
        p.setMaterial("Canvas");
        p.setDesignDetails("FloralMandala Pattern", "Brown, Gold, White");

         p.showItemType();
        p.showMaterial();
        p.showpaintingdetail();
    }
}
