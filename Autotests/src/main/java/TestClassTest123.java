public class TestClassTest123 {
    public static String text() {
        String name = "Enter '#3540' in input below to delete goal";
        // String confirmText = driver.findElement(confirmTextArea).getText();//.substring(confirmText.indexOf("'"), confirmText.indexOf("'"));
        name.substring(name.indexOf(" '"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println(text());
        System.out.println();

    }

}
