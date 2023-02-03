package myapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TextProcesser {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get(args[0]);
        File f = p.toFile();

        Map<String, Integer> wordFreq = new HashMap<>();

        InputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        int numWords = 0;
        while ((line = br.readLine()) != null) {
            System.out.printf("> %s\n", line.toUpperCase());
            String[] words = line.split(" ");
            numWords += words.length;
            // Iterate all the words in the line
            for (String w: words) {
                String t = w.toLowerCase();
                if (!wordFreq.containsKey(t)) {
                    // If word is not in map, initialize the word with freq 1
                    wordFreq.put(t, 1);
                } else {
                    // If word is in map, it increment the count
                    int c = wordFreq.get(t);
                    wordFreq.put(t, c + 1);
                }
            }
        }

        // Get a list of all the words
        Set<String> words = wordFreq.keySet();
        for (String w: words) {
            int count = wordFreq.get(w);
            System.out.printf(": %s = %d\n", w, count);
        }

        System.out.printf("Number of words: %d\n", numWords);
        System.out.printf("Number of unique words: %d\n", words.size());

        br.close();
        isr.close();
        is.close();
        }
        

    }
    
