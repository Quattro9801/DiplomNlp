package com.example.demo.logic;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.*;

public class ProcessingText {
    public static List<String> getTriples(String text) {
        Properties props = new Properties();
        // set the list of annotators to run
        props.setProperty("annotators", "tokenize,ssplit,pos,lemma");
        // build pipeline
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        // create a document object
        CoreDocument document = pipeline.processToCoreDocument(text);
        List<String> world = new ArrayList<>();
        // display token
        for (CoreLabel tok : document.tokens()) {
            if (tok.tag().contains("NN") || tok.tag().contains("VBG") || tok.tag().contains("VBZ") || tok.tag().contains("POS") ||
                    tok.tag().contains("VB") ||  tok.tag().contains("VBD") ||  tok.tag().contains("VBZ") || tok.tag().contains("VBG") ||
            tok.tag().contains("VBN") || tok.tag().contains("VBP") || tok.tag().contains("NNS") || tok.tag().contains("NNP") ||
            tok.tag().contains("NNPS") || tok.tag().contains("JJ") || tok.tag().contains("JJS") || tok.tag().contains("JJR")) {

                     world.add(tok.lemma() + " ");
            }
        }
            return world;
        }
    }

