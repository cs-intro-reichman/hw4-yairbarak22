public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String lowersentence = lowerCase(sentences[i]);
            for (int m=0; m < keywords.length; m++) {
                String lowerkeywords = lowerCase(keywords[m]);
                if (contains(lowersentence, lowerkeywords)) {
                    System.out.println(sentences[i]);
                }
            }
         }
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) < 97) {
                newstr += (char) (str.charAt(i) + 32);
            }
            else {
                newstr += str.charAt(i);
            }
        }
        return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        for (int m = 0; m <= str1.length() - str2.length(); m++) {
            int n = m;
            boolean match = true;
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(n) != str2.charAt(i)) {
                    match = false;
                    break;
                }
                n++;
            }
            if (match) return true;
        }
        return false;
    }
}
