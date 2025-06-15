package hello;

public class stringMethods {
    public static void main(String[] args){
        String name = "Madhav Raghu";

        int length = name.length(); // 12
        // char at = name.charAt(7); // 'R'
        int index = name.indexOf('v'); // 5
        int last = name.lastIndexOf('a'); // 8
        String upper = name.toUpperCase(); // "MADHAV RAGHU"
        String lower = name.toLowerCase(); // "madhav raghu"
        // name = name.replace('a', 'o'); // "Modhov Roghu"

        String test = "    Hello    ";
        test = test.trim(); // "Hello"

        String substring1 = name.substring(0,6);

        /*
        if(name.isEmpty()){
            System.out.println("Name is empty");
        }
        else{
            System.out.println("Hi " + name);
        }
        */

        System.out.println(substring1);
    }
}
