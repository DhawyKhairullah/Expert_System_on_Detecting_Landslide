package com.mycompany.mavenproject3;

import java.util.HashMap;
import java.util.Map;

public class KnowledgeBase {
    private final Map<String, Double> facts;
    private final Map<String, Double> confidenceFactors;
    private final Map<String, Double> weights; // Menambahkan bobot faktor risiko

    public KnowledgeBase() {
        facts = new HashMap<>();
        confidenceFactors = new HashMap<>();
        weights = new HashMap<>(); // Inisialisasi map bobot
        initializeWeights(); // Memanggil metode untuk mengisi bobot
    }

    private void initializeWeights() {
        // Mengatur bobot untuk setiap faktor berdasarkan dampaknya
        weights.put("Kemiringan Lereng", 0.25);
        weights.put("Curah Hujan", 0.3);
        weights.put("Jenis Batuan", 0.2);
        weights.put("Penggunaan Lahan", 0.15);
        weights.put("Kedekatan dengan Jalan", 0.05);
        weights.put("Kedalaman Tanah", 0.05);
    }

    public void addFact(String key, String value, String confidence) {
        facts.put(key, getValue(value));
        confidenceFactors.put(key, getConfidenceFactor(confidence));
    }

    public double getTotalCF() {
        double totalWeightedCF = 0.0;
        double totalWeight = 0.0;

        for (String key : confidenceFactors.keySet()) {
            double weight = weights.getOrDefault(key, 1.0); // Dapatkan bobot dari map
            double factor = confidenceFactors.get(key) * facts.get(key) * weight;
            totalWeightedCF += factor;
            totalWeight += weight;
        }

        // Normalisasi
        if (totalWeight > 0) {
            totalWeightedCF = totalWeightedCF / totalWeight;
        }

        return Math.min(totalWeightedCF, 1.0); // Batas maksimum tetap 1.0
    }

    private double getValue(String value) {
        switch (value) {
            case "1": return 0.2; // Sangat Rendah
            case "2": return 0.4; // Rendah
            case "3": return 0.6; // Sedang
            case "4": return 0.8; // Tinggi
            case "5": return 1.0; // Sangat Tinggi
            case "11": return 0.3; // Curah Hujan Rendah
            case "12": return 0.6; // Curah Hujan Sedang
            case "13": return 0.8; // Curah Hujan Tinggi
            case "14": return 1.0; // Curah Hujan Ekstrem
            case "21": return 0.2; // Jenis Batuan Stabil
            case "22": return 0.7; // Jenis Batuan Kurang Stabil
            case "23": return 1.0; // Jenis Batuan Rentan Longsor
            case "31": return 0.2; // Vegetasi Tinggi
            case "32": return 0.5; // Vegetasi Sedang
            case "33": return 1.0; // Lahan Terbuka
            case "41": return 1.0; // Dekat dengan Jalan
            case "42": return 0.3; // Jauh dari Jalan
            case "51": return 1.0; // Kedalaman Tanah Dangkal
            case "52": return 0.5; // Kedalaman Tanah Sedang
            case "53": return 0.2; // Kedalaman Tanah Dalam
            default: return 0.0;
        }
    }

    private double getConfidenceFactor(String confidence) {
        switch (confidence) {
            case "1": return 0.9; // Sangat Yakin
            case "2": return 0.6; // Ragu-ragu
            case "3": return 0.3; // Tidak Yakin
            default: return 0.0;
        }
    }

    public String evaluateRisk() {
        double totalCF = getTotalCF();
        if (totalCF > 0.6) {
            return "Sangat rentan longsor.";
        } else if (totalCF > 0.4) {
            return "Ada risiko longsor.";
        } else {
            return "Kecil untuk terjadi longsor.";
        }
    }
}
