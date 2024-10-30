package com.mycompany.mavenproject3;

public class Rule {
    private KnowledgeBase knowledgeBase;

    public Rule(KnowledgeBase knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }

    public double calculateRiskPercentage() {
        double totalCF = knowledgeBase.getTotalCF();
        double maxCF = 1.0;
        return Math.min((totalCF / maxCF) * 100, 100);
    }
}
