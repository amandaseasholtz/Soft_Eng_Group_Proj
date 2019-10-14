package com.team3.DOMSapi;
/**
 * Represents an appointment for a patient at a doctor's office.
 * A patient can have many appointments.
 */
public class Appointment {
	static int apptID;
	static String patientSSN;
	static String apptDate;
	static String apptTime;
	static String notes;
	static String statuses[] = {"Requested", "Approved", "Denied", "Edited", "Checked-in"};
	static String status;

	public Appointment(int ID, String pSSN, String date, String time, String note, String stat) {
		apptID = ID;
		patientSSN = pSSN;
		apptDate = date;
		apptTime = time;
		notes = note;
		status = stat;
	}
	/**
	   * Gets the appointment ID of this appointment.
	   * @return this appointment's ID.
	   */
	public int getApptID() {
		return apptID;
	}
	/**
	   * Changes the appointment ID of this appointment.
	   * @param id This appointment's new ID.  
	   */
	public static void setApptID(int id) {
		apptID = id;
	}
	/**
	   * Gets the patient's SSN of this appointment.
	   * @return this patient's SSN.
	   */
	public String getSSN() {
		return patientSSN;
	}
	/**
	   * Changes the patient's SSN of this appointment.
	   * @param social This appointment's new patient SSN.  
	   */
	public static void setSSN(String social) {
		patientSSN = social;
	}
	/**
	   * Gets the time of this appointment.
	   * @return this appointment's time.
	   */
	public String getTime() {
		return apptTime;
	}
	/**
	   * Changes the time of this appointment.
	   * @param time This appointment's new time.  
	   */
	public static void setTime(String time) {
		apptTime = time;
	}
	/**
	   * Gets the date of this appointment.
	   * @return this appointment's date.
	   */
	public String getDate() {
		return apptDate;
	}
	/**
	   * Changes the date of this appointment.
	   * @param date This appointment's new date.  
	   */
	public static void setDate(String date) {
		apptDate = date;
	}
	/**
	   * Gets the notes of this appointment.
	   * @return this appointment's notes.
	   */
	public String getNotes() {
		return notes;
	}
	/**
	   * Changes the notes of this appointment.
	   * @param note This appointment's notes.  
	   */
	public static void setNotes(String note) {
		notes = note;
	}
	/**
	   * Gets the status of this appointment.
	   * @return this appointment's status.
	   */
	public String getStatus() {
		return status;
	}
	/**
	   * Changes the status of this appointment.
	   * @param stat This appointment's status.  
	   */
	public static void setStatus(String stat) {
		for (int i = 0; i < statuses.length; i++) {
			if (stat.equals(statuses[i])) {
				status = statuses[i];
				break;
			}
		}
	}
}
