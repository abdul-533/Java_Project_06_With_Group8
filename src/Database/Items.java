package Database;

public class Items {


public static double ItemName(String itemName){
    switch (itemName){
        case "Rose teddy bear": return 30;
        case  "Iphone max": return 850.23;
        case "laptop mouse":return 23.50;
        case "Monitor": return 90.23;
        case "charger":return  43.20;
        case "hdmi cable": return 5.90;
        case "mug": return 30;
        default:return 0;


    }

}


    public static double  colorPrice(String color){
        switch (color){
            case  "Red": return 10;
            case  "Blue": return 6;
            case  "Black": return 4;
            case  "White": return 2;
            default:return 0;


        }
    }



    public static double  customText(String text){
        if (text.length()>10)
            return 5;
        else return 3;

        }
    }





