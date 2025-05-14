package com.mayvel.myScheduler;

import com.mayvel.myScheduler.utils.Logger;

import javax.baja.history.BIHistory;
import javax.baja.naming.BOrd;
import javax.baja.nre.annotations.*;
import javax.baja.schedule.*;
import javax.baja.status.BStatus;
import javax.baja.status.BStatusBoolean;
import javax.baja.status.BStatusValue;
import javax.baja.sys.*;
import javax.baja.util.BTimeRange;
import java.io.EOFException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@NiagaraType
@NiagaraProperty(
        name = "schedulePath",
        type = "String",
        defaultValue = ""
)
@NiagaraProperty(
        name = "startTime",
        type = "String",
        defaultValue = ""
)
@NiagaraProperty(
        name = "endTime",
        type = "String",
        defaultValue = ""
)
@NiagaraProperty(
        name = "valueToSet",
        type = "boolean",
        defaultValue = "true"
)
@NiagaraProperty(
        name = "out",
        type = "String",
        defaultValue = "",
        flags = Flags.READONLY
)
@NiagaraAction(
        name = "clearSchedule")
@NiagaraAction(name="createSchedule")
public class BSNGroup extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mayvel.myScheduler.BSNGroup(382897240)1.0$ @*/
/* Generated Wed May 14 17:58:15 IST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "schedulePath"

  /**
   * Slot for the {@code schedulePath} property.
   * @see #getSchedulePath
   * @see #setSchedulePath
   */
  public static final Property schedulePath = newProperty(0, "", null);

  /**
   * Get the {@code schedulePath} property.
   * @see #schedulePath
   */
  public String getSchedulePath() { return getString(schedulePath); }

  /**
   * Set the {@code schedulePath} property.
   * @see #schedulePath
   */
  public void setSchedulePath(String v) { setString(schedulePath, v, null); }

  //endregion Property "schedulePath"

  //region Property "startTime"

  /**
   * Slot for the {@code startTime} property.
   * @see #getStartTime
   * @see #setStartTime
   */
  public static final Property startTime = newProperty(0, "", null);

  /**
   * Get the {@code startTime} property.
   * @see #startTime
   */
  public String getStartTime() { return getString(startTime); }

  /**
   * Set the {@code startTime} property.
   * @see #startTime
   */
  public void setStartTime(String v) { setString(startTime, v, null); }

  //endregion Property "startTime"

  //region Property "endTime"

  /**
   * Slot for the {@code endTime} property.
   * @see #getEndTime
   * @see #setEndTime
   */
  public static final Property endTime = newProperty(0, "", null);

  /**
   * Get the {@code endTime} property.
   * @see #endTime
   */
  public String getEndTime() { return getString(endTime); }

  /**
   * Set the {@code endTime} property.
   * @see #endTime
   */
  public void setEndTime(String v) { setString(endTime, v, null); }

  //endregion Property "endTime"

  //region Property "valueToSet"

  /**
   * Slot for the {@code valueToSet} property.
   * @see #getValueToSet
   * @see #setValueToSet
   */
  public static final Property valueToSet = newProperty(0, true, null);

  /**
   * Get the {@code valueToSet} property.
   * @see #valueToSet
   */
  public boolean getValueToSet() { return getBoolean(valueToSet); }

  /**
   * Set the {@code valueToSet} property.
   * @see #valueToSet
   */
  public void setValueToSet(boolean v) { setBoolean(valueToSet, v, null); }

  //endregion Property "valueToSet"

  //region Property "out"

  /**
   * Slot for the {@code out} property.
   * @see #getOut
   * @see #setOut
   */
  public static final Property out = newProperty(Flags.READONLY, "", null);

  /**
   * Get the {@code out} property.
   * @see #out
   */
  public String getOut() { return getString(out); }

  /**
   * Set the {@code out} property.
   * @see #out
   */
  public void setOut(String v) { setString(out, v, null); }

  //endregion Property "out"

  //region Action "clearSchedule"

  /**
   * Slot for the {@code clearSchedule} action.
   * @see #clearSchedule()
   */
  public static final Action clearSchedule = newAction(0, null);

  /**
   * Invoke the {@code clearSchedule} action.
   * @see #clearSchedule
   */
  public void clearSchedule() { invoke(clearSchedule, null, null); }

  //endregion Action "clearSchedule"

  //region Action "createSchedule"

  /**
   * Slot for the {@code createSchedule} action.
   * @see #createSchedule()
   */
  public static final Action createSchedule = newAction(0, null);

  /**
   * Invoke the {@code createSchedule} action.
   * @see #createSchedule
   */
  public void createSchedule() { invoke(createSchedule, null, null); }

  //endregion Action "createSchedule"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BSNGroup.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  @Override
  public void started() throws Exception {
    super.started();
    Logger.Log("BSNGroup started");
    BBooleanSchedule bBooleanSchedule =new BBooleanSchedule();
  }

  @Override
  public void stopped() throws Exception {
    Logger.Log("BSNGroup stopped");
    super.stopped();
  }

  /**
   * Method triggered when the "schedule" action is invoked
   */

  public void doClearSchedule() {
    Logger.Log("BSNGroup schedule action triggered");

    try {
      // Use the full path to the schedule in the station
      String schedulePath = getSchedulePath();
      BOrd remoteOrd = BOrd.make(schedulePath);
      BObject obj = remoteOrd.resolve().get();
      if (obj instanceof BBooleanSchedule) {
        BBooleanSchedule schedule = (BBooleanSchedule) obj;
        // Clear the schedule
        schedule.clear();
        setOut("Successfully cleared schedule at path: " + schedulePath);
      } else {
        setOut("Component at path is not a BBooleanSchedule.");
      }
    } catch (Exception e) {
      setOut("Failed to clear schedule: " + e.getMessage());
      e.printStackTrace();
    }
  }

public void doCreateSchedule() {
  try {
    String path = getSchedulePath();
    BOrd ord = BOrd.make(path);
    BObject obj = ord.resolve().get();

    if (!(obj instanceof BBooleanSchedule)) {
      setOut("❌ Target is not a BBooleanSchedule: " + path);
      return;
    }

    BBooleanSchedule schedule = (BBooleanSchedule) obj;

    // Parse the input start and end times
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy hh:mm:ss a", Locale.ENGLISH);
    Date startDate = sdf.parse(getStartTime());
    Date endDate = sdf.parse(getEndTime());

    Calendar startCal = Calendar.getInstance();
    startCal.setTime(startDate);

    Calendar endCal = Calendar.getInstance();
    endCal.setTime(endDate);

    // Create BTime for start and end times
    BTime startTime = BTime.make(
            startCal.get(Calendar.HOUR_OF_DAY),
            startCal.get(Calendar.MINUTE),
            startCal.get(Calendar.SECOND)
    );

    BTime endTime = BTime.make(
            endCal.get(Calendar.HOUR_OF_DAY),
            endCal.get(Calendar.MINUTE),
            endCal.get(Calendar.SECOND)
    );

    // Get day of the week (1 = Sunday, 2 = Monday, ..., 7 = Saturday)
    int dayOfWeek = startCal.get(Calendar.DAY_OF_WEEK);
    BWeekday bWeekday = null;

    switch (dayOfWeek) {
      case Calendar.SUNDAY:    bWeekday = BWeekday.sunday; break;
      case Calendar.MONDAY:    bWeekday = BWeekday.monday; break;
      case Calendar.TUESDAY:   bWeekday = BWeekday.tuesday; break;
      case Calendar.WEDNESDAY: bWeekday = BWeekday.wednesday; break;
      case Calendar.THURSDAY:  bWeekday = BWeekday.thursday; break;
      case Calendar.FRIDAY:    bWeekday = BWeekday.friday; break;
      case Calendar.SATURDAY:  bWeekday = BWeekday.saturday; break;
    }

    if (bWeekday == null) {
      setOut("❌ Could not determine day of week.");
      return;
    }

    // Create status value
    BStatusBoolean statusValue = new BStatusBoolean(getValueToSet(), BStatus.ok);

    // Add time range to correct weekday
    BDaySchedule daySchedule = schedule.get(bWeekday);
    daySchedule.add(startTime, endTime, statusValue);

    setOut("✅ Schedule set on " + bWeekday + " from " + getStartTime() + " to " + getEndTime());
    Logger.Log("✅ Scheduled on " + bWeekday + " from " + startTime + " to " + endTime);

  } catch (ParseException pe) {
    setOut("❌ Invalid date format. Use format: dd-MMM-yy hh:mm:ss a");
    Logger.Log("❌ Date parse error: " + pe.getMessage());
    pe.printStackTrace();
  } catch (Exception e) {
    setOut("❌ Failed to create schedule: " + e.getMessage());
    Logger.Log("❌ Failed to create schedule: " + e.getMessage());
    e.printStackTrace();
  }
}

}
