package org.example.ui.questionnaires;

import org.apache.commons.lang3.RandomStringUtils;

public class QuestionnaireGenerator {
    public String QuestionnaireGenerator() {
        return new String(RandomStringUtils.random(2));
    }
}
