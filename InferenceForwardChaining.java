package com.mycompany.mavenproject3;

public class InferenceForwardChaining {
    private final KnowledgeBase knowledgeBase;

    public InferenceForwardChaining(KnowledgeBase knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }

    public void infer(String key, String value, String confidence) {
        knowledgeBase.addFact(key, value, confidence);
    }

    public String getRiskAssessment() {
        return knowledgeBase.evaluateRisk();
    }

    public double getRiskPercentage() {
        Rule rule = new Rule(knowledgeBase);
        return rule.calculateRiskPercentage();
    }
}
