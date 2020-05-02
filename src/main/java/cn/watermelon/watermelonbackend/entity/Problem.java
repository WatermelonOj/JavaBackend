package cn.watermelon.watermelonbackend.entity;

<<<<<<< HEAD
import org.w3c.dom.Text;

import java.io.Serializable;

public class Problem implements Serializable {
    private int id;
    private String title;
    private String description;
    private String input;
    private String output;
    private String hint;
    private boolean isSpj;
    private int contestId;
    private boolean visible;
    private String tmLimit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
=======
import java.io.Serializable;

public class Problem implements Serializable {

    private int problemId;

    private String title;

    private String description;

    private String input;

    private String output;

    private String hint;

    private boolean isSpj;

    private int contestId;

    private boolean visible;

    private String tmLimit;

    private String sampleInput;

    private String sampleOutput;

    private String memLimit;

    public String getMemLimit() {
        return memLimit;
    }

    public void setMemLimit(String memLimit) {
        this.memLimit = memLimit;
    }

    public String getSampleInput() {
        return sampleInput;
    }

    public void setSampleInput(String sampleInput) {
        this.sampleInput = sampleInput;
    }

    public String getSampleOutput() {
        return sampleOutput;
    }

    public void setSampleOutput(String sampleOutput) {
        this.sampleOutput = sampleOutput;
    }

    public int getProblemId() {
        return problemId;
    }

    public void setProblemId(int problemId) {
        this.problemId = problemId;
>>>>>>> dbeed8fb9adc7adadc42aef706c68dffd03163d5
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public boolean isSpj() {
        return isSpj;
    }

    public void setSpj(boolean spj) {
        isSpj = spj;
    }

    public int getContestId() {
        return contestId;
    }

    public void setContestId(int contestId) {
        this.contestId = contestId;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getTmLimit() {
        return tmLimit;
    }

    public void setTmLimit(String tmLimit) {
        this.tmLimit = tmLimit;
    }
}
