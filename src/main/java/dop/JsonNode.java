package dop;

import java.util.Map;

public sealed interface JsonNode {
    record NullNode() implements JsonNode{};
    record ObjectNode(Map<String, JsonNode> jsonNode) implements JsonNode{};
    record ArrayNode(ObjectNode[] value) implements JsonNode{};
    record StringNode(String value) implements JsonNode{};
}


