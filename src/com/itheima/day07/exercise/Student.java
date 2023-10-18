package com.itheima.day07.exercise;

import java.math.BigDecimal;

public class Student {
    private String name;
    private int age;
    private double algorithmicScores;
    private double dataStructureGrades;
    private double englishScores;

    public Student(String name, double algorithmicScores, double dataStructureGrades, double englishScores) {
        this.name = name;
        this.algorithmicScores = algorithmicScores;
        this.dataStructureGrades = dataStructureGrades;
        this.englishScores = englishScores;
    }
    public BigDecimal getTotal(){
        BigDecimal as = BigDecimal.valueOf(algorithmicScores);
        BigDecimal asg =BigDecimal.valueOf(dataStructureGrades);
        BigDecimal es = BigDecimal.valueOf(englishScores);

        return as.add(asg).add(es);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAlgorithmicScores() {
        return algorithmicScores;
    }

    public void setAlgorithmicScores(double algorithmicScores) {
        this.algorithmicScores = algorithmicScores;
    }

    public double getDataStructureGrades() {
        return dataStructureGrades;
    }

    public void setDataStructureGrades(double dataStructureGrades) {
        this.dataStructureGrades = dataStructureGrades;
    }

    public double getEnglishScores() {
        return englishScores;
    }

    public void setEnglishScores(double englishScores) {
        this.englishScores = englishScores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", algorithmicScores=" + algorithmicScores +
                ", dataStructureGrades=" + dataStructureGrades +
                ", englishScores=" + englishScores +
                '}'+"总分："+getTotal();
    }



}
