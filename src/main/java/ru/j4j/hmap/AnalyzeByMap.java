package ru.j4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int number = 0;
        double mark = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                mark += subject.score();
                number++;
            }
        }
        return number > 0 ? mark / number : 0;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        return scoreByPupil(pupils, true);
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();
        Map<String, Integer> stringIntegerMap = scoreBySubject(pupils);
        for (String subject : stringIntegerMap.keySet()) {
            labelList.add(new Label(subject, (double) stringIntegerMap.get(subject) / pupils.size()));
        }
        return labelList;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = scoreByPupil(pupils, false);
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();
        Map<String, Integer> temp = scoreBySubject(pupils);
        for (String subject : temp.keySet()) {
            labelList.add(new Label(subject, temp.get(subject)));
        }
        labelList.sort(Comparator.naturalOrder());
        return labelList.get(labelList.size() - 1);
    }

    private static List<Label> scoreByPupil(List<Pupil> pupils, boolean averageScore) {
        List<Label> labels = new ArrayList<>();
        int number = 0;
        double mark = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                mark += subject.score();
                number++;
            }
            number = averageScore ? number : 1;
            labels.add(new Label(pupil.name(), number > 0 ? mark / number : 0));
            number = 0;
            mark = 0;
        }
        return labels;
    }

    private static Map<String, Integer> scoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
               subjectMap.merge(
                       subject.name(),
                       subject.score(),
                       (oldScore, newScore) -> oldScore + subject.score()
               );
            }
        }
        return subjectMap;
    }
}