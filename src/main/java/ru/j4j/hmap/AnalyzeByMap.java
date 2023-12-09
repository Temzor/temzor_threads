package ru.j4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double score = 0.0;
        int totalPoints = 0;
        for (Pupil pupil : pupils) {
            for (Subject sub : pupil.subjects()) {
                totalPoints += sub.score();
                score++;
            }
        }
        return totalPoints / score;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> score = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int scoreSum = 0;
            for (Subject sub : pupil.subjects()) {
                scoreSum += sub.score();
            }
            score.add(new Label(pupil.name(), (double) scoreSum / pupils.size()));
        }
        return score;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        HashMap<String, Integer> score = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score.put(subject.name(), score.getOrDefault(subject.name(), 0)
                        + subject.score());
            }
        }
        List<Label> label = new ArrayList<>();
        for (String key : score.keySet()) {
            label.add(new Label(key, (double) score.get(key) / pupils.size()));
        }
        return label;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> score = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int scoreSum = 0;
            for (Subject sub : pupil.subjects()) {
                scoreSum += sub.score();
            }
            score.add(new Label(pupil.name(), scoreSum));
        }
        score.sort(Comparator.naturalOrder());
        return score.get(score.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> score = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score.put(subject.name(), score.getOrDefault(subject.name(), 0)
                        + subject.score());
            }
        }
        List<Label> label = new ArrayList<>();
        for (String key : score.keySet()) {
            label.add(new Label(key, (double) score.get(key)));
        }
        label.sort(Comparator.naturalOrder());
        return label.get(score.size() - 1);
    }
}
