package com.example.demo.logic;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.*;

public class Nlp {
    public static List<String> getTriples() {
        String text = "Screen working in TV. Phone show 5 hours. He loves hamburgers. Monitor doesn't working.";
        Properties props = new Properties();
        // set the list of annotators to run
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma");
        // build pipeline
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        // create a document object
        CoreDocument document = pipeline.processToCoreDocument(text);
        List<String> world = new ArrayList<>();
        List<String> triple = new ArrayList<>();
        HashMap<Integer, List<String>> map = new HashMap<>();
        // display tokens
        Integer i = 0;
        int k = 8;
        for (CoreLabel tok : document.tokens()) {
            world.add(tok.word() + " " + tok.tag());
         
            }


            return world;
        }
    }

