package org.example.model;
import org.drools.base.definitions.rule.impl.RuleImpl;
import org.kie.api.definition.rule.Rule;

public class RuleDefinition {
    public String packageName;
    public String ruleName;
    public String agendaGroup;

    public RuleDefinition() {
    }

    public RuleDefinition(Rule rule) {
        this.ruleName       = rule.getName();
        this.packageName    = rule.getPackageName();
        this.agendaGroup    = ((RuleImpl) rule).getAgendaGroup();
    }

    public RuleDefinition(String packageName, String ruleName, String agendaGroup) {
        this.packageName = packageName;
        this.ruleName = ruleName;
        this.agendaGroup = agendaGroup;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getAgendaGroup() {
        return agendaGroup;
    }

    public void setAgendaGroup(String agendaGroup) {
        this.agendaGroup = agendaGroup;
    }

}
