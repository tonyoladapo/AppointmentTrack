package com.oladapo.appointmenttrack.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "appointments_table")
public class Appointments {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String clientName;
    private String clientPhone;
    private String clientEmail;
    private String description;
    private String date;
    private String time;
    private String reminderDate;
    private String reminderTime;
    private int reminderState;
    private int clientReminderState;
    private int clientReminderTime;
    private String clientReminderMessage;
    private String dateAdded;

    public Appointments(String clientName, String clientPhone, String clientEmail, String description, String date, String time, String reminderDate, String reminderTime, int reminderState, int clientReminderState, int clientReminderTime, String clientReminderMessage, String dateAdded) {
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.description = description;
        this.date = date;
        this.time = time;
        this.reminderDate = reminderDate;
        this.reminderTime = reminderTime;
        this.reminderState = reminderState;
        this.clientReminderState = clientReminderState;
        this.clientReminderTime = clientReminderTime;
        this.clientReminderMessage = clientReminderMessage;
        this.dateAdded = dateAdded;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReminderDate() {
        return reminderDate;
    }

    public String getReminderTime() {
        return reminderTime;
    }

    public int getReminderState() {
        return reminderState;
    }

    public int getClientReminderState() {
        return clientReminderState;
    }

    public int getClientReminderTime() {
        return clientReminderTime;
    }

    public String getClientReminderMessage() {
        return clientReminderMessage;
    }

    public String getDateAdded() {
        return dateAdded;
    }
}