

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        listParse(inputData, value);
        System.out.println(prepareResult(inputData, calculate(inputData)));
    }

    enum Operations{
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
        MULTIPLY{
            public float action(List<String> inputData){
                return Float.valueOf(inputData.get(0)) * Float.valueOf(inputData.get(2));
            }
        },
        DIVIDE{
            public float action(List<String> inputData) {
                if (Float.valueOf(inputData.get(2)) == 0) {
                    return 0;
                }
                return Float.valueOf(inputData.get(0)) / Float.valueOf(inputData.get(2));
            }
        };
        public abstract float action(List<String> inputData);
    }

    // парсим нашу стрингу в лист
    public static void listParse(List<String> inputData, String value){
        String[] words = value.split(" ");
        for(String word : words){
            inputData.add(word);
        }
    }

    public static String calculate(List<String> inputData){
        String result = "";

        switch (inputData.get(1).toUpperCase()){
            case "PLUS":
                result = String.valueOf(Operations.PLUS.action(inputData));
                break;
            case "MINUS":
                result = String.valueOf(Operations.MINUS.action(inputData));
                break;
            case "MULTIPLY":
                result = String.valueOf(Operations.MULTIPLY.action(inputData));
                break;
            case "DIVIDE":
                if (Float.valueOf(inputData.get(2)) != 0)
                    result = String.valueOf(Operations.DIVIDE.action(inputData));
                else
                    result = null;
                break;
            default:
                result = null;
                break;
        }

        return result;
    }

    public static String prepareResult(List<String> inputData, String result){
        return inputData.get(0) + " " + inputData.get(1).toUpperCase() + " " + inputData.get(2) + " = " + result;
    }
}