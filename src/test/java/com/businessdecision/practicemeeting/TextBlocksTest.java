package com.businessdecision.practicemeeting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextBlocksTest {

    private static final String expected = "<html>\n    <body>\n        <h1>Java 17</h1>\n    </body>\n</html>\n";

    @Test
    void givenMultilineText_whenGeneratingHtml_thenIndentationIsPreserved() {
        String actual = TextBlocks.getHtmlOldSchool("Java 17");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void givenTextBlock_whenGeneratingHtml_thenIndentationIsPreserved() {
        String actual = TextBlocks.getHtmlUsingTextBlocks("Java 17");
        assertThat(actual).isEqualTo(expected);
    }

}
