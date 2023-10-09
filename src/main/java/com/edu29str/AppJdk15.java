package com.edu29str;

public class AppJdk15 {
    public static void main(String[] args) {
        // before Java-15
        String text= "<Html>\n"
                + "         <body>\n"
                + "              <p>Hello, world</p>\n"
                + "         </body>\n"
                + "</Html>";
        // From JDK 15
        /*
        String text= """
       <Html>
                <body>
                     <p>Hello, world</p>
                </body>
       </Html>
       """;
        */
        System.out.println("text = \n" + text);
        //
    }
}
