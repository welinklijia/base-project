package com.mybatis.study.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RuleFile {
    private BigDecimal serFileId;

    private String directorys;

    private String fileName;

    private String optPerson;

    private String newFile;

    private Date changeTime;

    private String inUse;

    private BigDecimal alarmIdNum;

    private String ruleName;

    private BigDecimal relationType;

    private BigDecimal professionalType;

    private BigDecimal vendorId;

    private String ruledesc;

    private BigDecimal userId;

    private String isLocalRule;

    private String relationCondition;

    private String relationPositionInfo;

    private String useResources;

    private String proResconfig;

    private String extResconfig;

    private String alarmContent;

    private String ruleDefUser;

    private String ruleDefPhone;

    private String eqpObjectClass;

    private String topicIdlist;

    private String filterId;

    private String phoneNum;

    private Short firePoint;

    private String activeTimeOut;

    private Short countType;

    private BigDecimal threshHold;

    private String threshHoldReferSql;

    private BigDecimal changeStatus;

    private Short projectSurpress;

    private Date createTime;

    private String dealedProcessAlias;

    private String relationName;

    private String whilelistProvince;

    private String blacklistProvince;

    private String whitelistProvince;

    private BigDecimal reasonType;

    private String ruleContent;

    public BigDecimal getSerFileId() {
        return serFileId;
    }

    public void setSerFileId(BigDecimal serFileId) {
        this.serFileId = serFileId;
    }

    public String getDirectorys() {
        return directorys;
    }

    public void setDirectorys(String directorys) {
        this.directorys = directorys == null ? null : directorys.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getOptPerson() {
        return optPerson;
    }

    public void setOptPerson(String optPerson) {
        this.optPerson = optPerson == null ? null : optPerson.trim();
    }

    public String getNewFile() {
        return newFile;
    }

    public void setNewFile(String newFile) {
        this.newFile = newFile == null ? null : newFile.trim();
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getInUse() {
        return inUse;
    }

    public void setInUse(String inUse) {
        this.inUse = inUse == null ? null : inUse.trim();
    }

    public BigDecimal getAlarmIdNum() {
        return alarmIdNum;
    }

    public void setAlarmIdNum(BigDecimal alarmIdNum) {
        this.alarmIdNum = alarmIdNum;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public BigDecimal getRelationType() {
        return relationType;
    }

    public void setRelationType(BigDecimal relationType) {
        this.relationType = relationType;
    }

    public BigDecimal getProfessionalType() {
        return professionalType;
    }

    public void setProfessionalType(BigDecimal professionalType) {
        this.professionalType = professionalType;
    }

    public BigDecimal getVendorId() {
        return vendorId;
    }

    public void setVendorId(BigDecimal vendorId) {
        this.vendorId = vendorId;
    }

    public String getRuledesc() {
        return ruledesc;
    }

    public void setRuledesc(String ruledesc) {
        this.ruledesc = ruledesc == null ? null : ruledesc.trim();
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getIsLocalRule() {
        return isLocalRule;
    }

    public void setIsLocalRule(String isLocalRule) {
        this.isLocalRule = isLocalRule == null ? null : isLocalRule.trim();
    }

    public String getRelationCondition() {
        return relationCondition;
    }

    public void setRelationCondition(String relationCondition) {
        this.relationCondition = relationCondition == null ? null : relationCondition.trim();
    }

    public String getRelationPositionInfo() {
        return relationPositionInfo;
    }

    public void setRelationPositionInfo(String relationPositionInfo) {
        this.relationPositionInfo = relationPositionInfo == null ? null : relationPositionInfo.trim();
    }

    public String getUseResources() {
        return useResources;
    }

    public void setUseResources(String useResources) {
        this.useResources = useResources == null ? null : useResources.trim();
    }

    public String getProResconfig() {
        return proResconfig;
    }

    public void setProResconfig(String proResconfig) {
        this.proResconfig = proResconfig == null ? null : proResconfig.trim();
    }

    public String getExtResconfig() {
        return extResconfig;
    }

    public void setExtResconfig(String extResconfig) {
        this.extResconfig = extResconfig == null ? null : extResconfig.trim();
    }

    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent == null ? null : alarmContent.trim();
    }

    public String getRuleDefUser() {
        return ruleDefUser;
    }

    public void setRuleDefUser(String ruleDefUser) {
        this.ruleDefUser = ruleDefUser == null ? null : ruleDefUser.trim();
    }

    public String getRuleDefPhone() {
        return ruleDefPhone;
    }

    public void setRuleDefPhone(String ruleDefPhone) {
        this.ruleDefPhone = ruleDefPhone == null ? null : ruleDefPhone.trim();
    }

    public String getEqpObjectClass() {
        return eqpObjectClass;
    }

    public void setEqpObjectClass(String eqpObjectClass) {
        this.eqpObjectClass = eqpObjectClass == null ? null : eqpObjectClass.trim();
    }

    public String getTopicIdlist() {
        return topicIdlist;
    }

    public void setTopicIdlist(String topicIdlist) {
        this.topicIdlist = topicIdlist == null ? null : topicIdlist.trim();
    }

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId == null ? null : filterId.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Short getFirePoint() {
        return firePoint;
    }

    public void setFirePoint(Short firePoint) {
        this.firePoint = firePoint;
    }

    public String getActiveTimeOut() {
        return activeTimeOut;
    }

    public void setActiveTimeOut(String activeTimeOut) {
        this.activeTimeOut = activeTimeOut == null ? null : activeTimeOut.trim();
    }

    public Short getCountType() {
        return countType;
    }

    public void setCountType(Short countType) {
        this.countType = countType;
    }

    public BigDecimal getThreshHold() {
        return threshHold;
    }

    public void setThreshHold(BigDecimal threshHold) {
        this.threshHold = threshHold;
    }

    public String getThreshHoldReferSql() {
        return threshHoldReferSql;
    }

    public void setThreshHoldReferSql(String threshHoldReferSql) {
        this.threshHoldReferSql = threshHoldReferSql == null ? null : threshHoldReferSql.trim();
    }

    public BigDecimal getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(BigDecimal changeStatus) {
        this.changeStatus = changeStatus;
    }

    public Short getProjectSurpress() {
        return projectSurpress;
    }

    public void setProjectSurpress(Short projectSurpress) {
        this.projectSurpress = projectSurpress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDealedProcessAlias() {
        return dealedProcessAlias;
    }

    public void setDealedProcessAlias(String dealedProcessAlias) {
        this.dealedProcessAlias = dealedProcessAlias == null ? null : dealedProcessAlias.trim();
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName == null ? null : relationName.trim();
    }

    public String getWhilelistProvince() {
        return whilelistProvince;
    }

    public void setWhilelistProvince(String whilelistProvince) {
        this.whilelistProvince = whilelistProvince == null ? null : whilelistProvince.trim();
    }

    public String getBlacklistProvince() {
        return blacklistProvince;
    }

    public void setBlacklistProvince(String blacklistProvince) {
        this.blacklistProvince = blacklistProvince == null ? null : blacklistProvince.trim();
    }

    public String getWhitelistProvince() {
        return whitelistProvince;
    }

    public void setWhitelistProvince(String whitelistProvince) {
        this.whitelistProvince = whitelistProvince == null ? null : whitelistProvince.trim();
    }

    public BigDecimal getReasonType() {
        return reasonType;
    }

    public void setReasonType(BigDecimal reasonType) {
        this.reasonType = reasonType;
    }

    public String getRuleContent() {
        return ruleContent;
    }

    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent == null ? null : ruleContent.trim();
    }
}