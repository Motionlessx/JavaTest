import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Zxcqwe {
    public static void main(String[] args) {

        String str = "5 PLUS 5";
        String[] words = str.split(" ");
        for (String word : words) {
            list.add(word);
        }
        System.out.println(prepareResult(list, calculate(list)));





    }
    enum Operations {
        PLUS{
            public float action(List<String> inputData){
                return Float.valueOf(inputData.get(0)) + Float.valueOf(inputData.get(2));
            }
        },
        MINUS{
            public float action(List<String> inputData){
                return Float.valueOf(inputData.get(0)) - Float.valueOf(inputData.get(2));
            }
        },
        DIVIDE{
            public float action(List<String> inputData){
                return Float.valueOf(inputData.get(0)) / Float.valueOf(inputData.get(2));
            }
        },
        MULTI{
            public float action(List<String> inputData){
                return Float.valueOf(inputData.get(0)) * Float.valueOf(inputData.get(2));
            }
        },
        MOD{
            public float action(List<String> inputData){
                return Float.valueOf(inputData.get(0)) % Float.valueOf(inputData.get(2));
            }
        };


public abstract float action(List<String> inputData);

        }




    public static String calculate(List<String> list) {
        String result = "";
        switch (list.get(1).toUpperCase()) {
            case "PLUS":
                result = String.valueOf(Operations.PLUS.action(list));
                break;

            default:
                result = null;
                break;

        }
        return result;
    }
    public static String prepareResult(List<String> list, String result) {
        return list.get(0) + " " + list.get(1).toUpperCase() + " " + list.get(2) + " = " + result;
    }

    static List<String> list = new ArrayList<>();





}
