package com.nju.app.student.entities;

import java.util.Date;

public class StudentAppointment {

    private String aId;

    private String tName;
    private Date start;
    private Date end;

    //是否被预约
    private Integer isAppointed;

    public StudentAppointment() {
    }

    public StudentAppointment(String aId, String tName, Date start, Date end) {
        this.aId = aId;
        this.tName = tName;
        this.start = start;
        this.end = end;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getIsAppointed() {
        return isAppointed;
    }

    public void setIsAppointed(Integer isAppointed) {
        this.isAppointed = isAppointed;
    }

    @Override
    public String toString() {
        return "StudentAppointment{" +
                "aId='" + aId + '\'' +
                ", tName='" + tName + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", isAppointed=" + isAppointed +
                '}';
    }
}
