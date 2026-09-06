package src.main.java.session5.practice_problem_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Candidate implements Comparable<Candidate> {
    private String name;
    private double cgpa;
    private int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getCodingScore() {
        return codingScore;
    }

    // Composite score calculated as (cgpa * 10) + (codingScore * 0.5)
    public double getCompositeScore() {
        return (cgpa * 10.0) + (codingScore * 0.5);
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }
}

public class PlacementDriveShortlisting {
    // Direct qualification based on CGPA
    public static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    // Borderline qualification based on CGPA and coding score
    public static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    public static String shortlistAndRank(Candidate[] candidates) {
        List<Candidate> shortlisted = new ArrayList<>();

        for (Candidate c : candidates) {
            if (isEligible(c.getCgpa()) || isEligible(c.getCgpa(), c.getCodingScore())) {
                shortlisted.add(c);
            }
        }

        Candidate[] ranked = shortlisted.toArray(new Candidate[0]);
        Arrays.sort(ranked);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ranked.length; i++) {
            sb.append(i + 1)
              .append(". ")
              .append(ranked[i].getName())
              .append(" (")
              .append(ranked[i].getCompositeScore())
              .append(")");
            if (i < ranked.length - 1) {
                sb.append(" | ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Candidate[] batch = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(batch));
    }
}