package com.theokanning.openai.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.theokanning.openai.messages.content.ImageFile;
import com.theokanning.openai.messages.content.Text;
import lombok.Data;


/**
 * Represents the content of a message
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/object
 */
@Data
public class MessageContent {

    /**
     * image_file/text
     */
    String type;

    /**
     * The text content that is part of a message.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Text text;

    /**
     * References an image File in the content of a message.
     */
    @JsonProperty("image_file")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    ImageFile imageFile;

}
