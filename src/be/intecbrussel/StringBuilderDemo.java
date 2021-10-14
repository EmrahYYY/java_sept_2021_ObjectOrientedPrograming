package be.intecbrussel;

public class StringBuilderDemo {
    public static void main(String[] args) throws InterruptedException {
        String line1 = "Dit is lijn 1";
        String line2 = "Dit is lijn 1";

        System.out.println(line1);
        System.out.println(line2);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Dit is lijn 1");
        stringBuilder.append('\n');
        stringBuilder.append("Dit is lijn 2");

//        for (int i = 0; i < stringBuilder.length(); i++){
//            if (stringBuilder.charAt(i) == ' ') {
//                stringBuilder.deleteCharAt(i);
//            }
//        }

        while (stringBuilder.indexOf(" ") >= 0) {
            int indexOfSpace = stringBuilder.indexOf(" ");
            stringBuilder.deleteCharAt(indexOfSpace);
        }

        System.out.println(stringBuilder.toString());

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Marry had a little lamb.");
        stringBuilder2.reverse();

        System.out.println(stringBuilder2.toString().replace("t", "tt"));
//        int startingPoint = 0;
//        while (stringBuilder2.indexOf("t", startingPoint) >= 0) {
//            int indexOfT = stringBuilder2.indexOf("t", startingPoint);
//            stringBuilder2.insert(indexOfT ,"t");
//            startingPoint = indexOfT + 2;
//
//            System.out.println(stringBuilder2);
//            Thread.sleep(1000);
//        }

        System.out.println(stringBuilder2);





        StringBuilder sb = new StringBuilder("Potato");

        sb.reverse();
        String text = sb.toString();

//        System.out.println(text);
    }
}
