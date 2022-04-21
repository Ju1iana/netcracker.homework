package u.pankratova.ch3;

public class Sheet {

    private String name;
    private int width;
    private int height;
    private int count = 0;

    public Sheet() {
        this.width = 841;
        this.height = 1189;
        this.name = "A0";
    }

    public Sheet(int w, int h){
    }

    public Sheet cutInHalf(){
        count++;

        if (width > height){
            width /= 2;
        } else {
            height /= 2;
        }
        name = "A" + count;
        return (new Sheet(this.width, this.height));
    }


    @Override
    public String toString() {
        return "Sheet {" +
                "name ='" + name + '\'' +
                ", width = " + width + " millimeters" +
                ", height = " + height + " millimeters" +
                '}';
    }
}

/* test
 *
 * Sheet {name ='A0', width = 841 millimeters, height = 1189 millimeters}
 * Sheet {name ='A1', width = 841 millimeters, height = 594 millimeters}
 * Sheet {name ='A2', width = 420 millimeters, height = 594 millimeters}
 * Sheet {name ='A3', width = 420 millimeters, height = 297 millimeters}
 * Sheet {name ='A4', width = 210 millimeters, height = 297 millimeters}
 *
 * */