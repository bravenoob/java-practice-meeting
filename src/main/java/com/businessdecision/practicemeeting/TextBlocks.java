package com.businessdecision.practicemeeting;

public class TextBlocks {

    public static String getHtmlOldSchool(String title) {
        return "<html>\n" +
                "    <body>\n" +
                "        <h1>" + title + "</h1>\n" +
                "    </body>\n" +
                "</html>\n";
    }

    public static String getHtmlUsingTextBlocks(String title) {
        return """
            <html>
                <body>
                    <h1>%s</h1>
                </body>
            </html>
            """.formatted(title);
    }

}
