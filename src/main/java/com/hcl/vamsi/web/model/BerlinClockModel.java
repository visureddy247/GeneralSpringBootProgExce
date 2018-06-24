package com.hcl.vamsi.web.model;
/**
 * This is the model to set berlin clock parameters.
 * @author Vamsi.Kallam
 *
 */
public class BerlinClockModel {
	/**
	 * private Params for Berlinclock 
	 */
	private int fivehours;
	private int singlehours;
	private int fivemins;
	private int mins;
	private int secs;	

	public int getFivehours() {
		return fivehours;
	}
	public void setFivehours(int fivehours) {
		this.fivehours = fivehours;
	}
	/**
	 * @return the singlehours
	 */
	public int getSinglehours() {
		return singlehours;
	}
	/**
	 * @param singlehours the singlehours to set
	 */
	public void setSinglehours(int singlehours) {
		this.singlehours = singlehours;
	}
	/**
	 * @return the fivemins
	 */
	public int getFivemins() {
		return fivemins;
	}
	/**
	 * @param fivemins the fivemins to set
	 */
	public void setFivemins(int fivemins) {
		this.fivemins = fivemins;
	}
	/**
	 * @return the mins
	 */
	public int getMins() {
		return mins;
	}
	/**
	 * @param mins the mins to set
	 */
	public void setMins(int mins) {
		this.mins = mins;
	}
	/**
	 * @return the secs
	 */
	public int getSecs() {
		return secs;
	}
	/**
	 * @param secs the secs to set
	 */
	public void setSecs(int secs) {
		this.secs = secs;
	}	
	

}
