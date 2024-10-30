package com.mycompany.mavenproject3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Map<String, String> userInput = ui.getUserInput();

        KnowledgeBase knowledgeBase = new KnowledgeBase();
        InferenceForwardChaining inference = new InferenceForwardChaining(knowledgeBase);

        // Memasukkan data pengguna ke dalam sistem
        for (Map.Entry<String, String> entry : userInput.entrySet()) {
            if (!entry.getKey().startsWith("Kepercayaan")) {
                String key = entry.getKey();
                String confidenceKey = "Kepercayaan " + key;
                inference.infer(key, entry.getValue(), userInput.get(confidenceKey));
            }
        }

        // Menampilkan hasil penilaian risiko
        String riskAssessment = inference.getRiskAssessment();
        double riskPercentage = inference.getRiskPercentage();

        System.out.println("Hasil penilaian risiko: " + riskAssessment);
        System.out.println("Persentase risiko longsor: " + String.format("%.2f", riskPercentage) + "%");
    }
}
