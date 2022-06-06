import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class TagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String line = in.nextLine();

            String[] test = line.split("</(\\w+\\s?)+>");

            Arrays.stream(test).forEach(System.out::println);

            testCases--;
        }
    }

    private static String extractTagContent(String line) {
        final List<String> openingTags = extractOpeningTags(line);
        final List<String> closingTags = extractClosingTagsFromOpeningTags(openingTags);
        String result = line;
        for(String tag : openingTags) {
            result = result.replace(tag, "");
        }
        for(String tag : closingTags) {
            result = result.replace(tag, "\n");
        }
        result = result.replace("\n\n", "\n");
        if (!result.contains("\n")) {
            result+="\n";
        } if (result.contains("<")) {
            return "None\n";
        }
        return result;
    }

    private static List<String> extractClosingTagsFromOpeningTags(List<String> openingTags) {
        List<String> closingTags = new ArrayList<>();
        for (String tag : openingTags) {
            String replace = tag.replace("<", "</");
            closingTags.add(replace);
        }
        return closingTags;
    }

    private static List<String> extractOpeningTags(String line) {
        final String openingTagRegex = "<(\\w+\\s?)+>";
        Pattern pattern = Pattern.compile(openingTagRegex);
        Matcher matcher = pattern.matcher(line);
        List<String> tags = new ArrayList<>();
        int i = 0;
        while (matcher.find()) {
            tags.add(matcher.group(0));
        }
        return tags;
    }
}
