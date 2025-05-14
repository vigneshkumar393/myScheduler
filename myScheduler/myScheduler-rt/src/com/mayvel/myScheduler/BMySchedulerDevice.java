/*
 * Copyright 2025 shloklabs. All Rights Reserved.
 */

package com.mayvel.myScheduler;

import com.mayvel.myScheduler.point.BMySchedulerPointDeviceExt;
import com.tridium.ndriver.BNDevice;
import com.tridium.ndriver.poll.BINPollable;
import com.tridium.ndriver.util.SfUtil;

import javax.baja.driver.util.BPollFrequency;
import javax.baja.nre.annotations.Facet;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatus;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BNetcoolDevice models a single device
 *
 * @author shloklabs on 24 Mar 2025
 */
@NiagaraType
@NiagaraProperty(
  name = "pollFrequency",
  type = "BPollFrequency",
  defaultValue = "BPollFrequency.normal"
)
// Add facet to include following in auto manager view
@NiagaraProperty(
  name = "status",
  type = "BStatus",
  defaultValue = "BStatus.ok",
  flags = Flags.TRANSIENT | Flags.READONLY | Flags.SUMMARY | Flags.DEFAULT_ON_CLONE,
  facets = @Facet("SfUtil.incl(SfUtil.MGR_EDIT_READONLY)"),
  override = true
)
@NiagaraProperty(
  name = "points",
  type = "BNetcoolPointDeviceExt",
  defaultValue = "new BNetcoolPointDeviceExt()"
)
public class BMySchedulerDevice
  extends BNDevice
  implements BINPollable
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mayvel.myScheduler.BMySchedulerDevice(3646141979)1.0$ @*/
/* Generated Mon May 12 15:27:40 IST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "pollFrequency"

  /**
   * Slot for the {@code pollFrequency} property.
   * @see #getPollFrequency
   * @see #setPollFrequency
   */
  public static final Property pollFrequency = newProperty(0, BPollFrequency.normal, null);

  /**
   * Get the {@code pollFrequency} property.
   * @see #pollFrequency
   */
  public BPollFrequency getPollFrequency() { return (BPollFrequency)get(pollFrequency); }

  /**
   * Set the {@code pollFrequency} property.
   * @see #pollFrequency
   */
  public void setPollFrequency(BPollFrequency v) { set(pollFrequency, v, null); }

  //endregion Property "pollFrequency"

  //region Property "status"

  /**
   * Slot for the {@code status} property.
   *  Add facet to include following in auto manager view
   * @see #getStatus
   * @see #setStatus
   */
  public static final Property status = newProperty(Flags.TRANSIENT | Flags.READONLY | Flags.SUMMARY | Flags.DEFAULT_ON_CLONE, BStatus.ok, SfUtil.incl(SfUtil.MGR_EDIT_READONLY));

  //endregion Property "status"

  //region Property "points"

  /**
   * Slot for the {@code points} property.
   * @see #getPoints
   * @see #setPoints
   */
  public static final Property points = newProperty(0, new BMySchedulerPointDeviceExt(), null);

  /**
   * Get the {@code points} property.
   * @see #points
   */
  public BMySchedulerPointDeviceExt getPoints() { return (BMySchedulerPointDeviceExt)get(points); }

  /**
   * Set the {@code points} property.
   * @see #points
   */
  public void setPoints(BMySchedulerPointDeviceExt v) { set(points, v, null); }

  //endregion Property "points"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMySchedulerDevice.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Overrides
////////////////////////////////////////////////////////////////

  /**
   * Returns the network type that the device runs on.
   *
   * @return Type object representing the network
   */
  @Override
  public Type getNetworkType()
  {
    return BMySchedulerNetwork.TYPE;
  }

  /**
   * Override started
   */
  @Override
  public void started()
    throws Exception
  {
    super.started();

    // register device with poll scheduler
  }

  /**
   * Override stopped
   */
  @Override
  public void stopped()
    throws Exception
  {
    // unregister device with poll scheduler
    super.stopped();
  }


////////////////////////////////////////////////////////////////
// Implementation
////////////////////////////////////////////////////////////////

  /**
   *
   */
  public void doPing()
  {
    // TODO - add ping implementation
    // if()
    pingOk();
    // else
    //  pingFail("not receiving response from device ");
  }


////////////////////////////////////////////////////////////////
// Polling support
////////////////////////////////////////////////////////////////

  /**
   * The poll() callback method called from BPollScheduler
   * when it is time to poll this object.
   */
  public void doPoll()
  {
    // TODO add poll support
  }

////////////////////////////////////////////////////////////////
// Utilities
////////////////////////////////////////////////////////////////

  /**
   * Get the network cast to a BNetcoolNetwork.
   *
   * @return network as a BNetcoolNetwork.
   */
  public final BMySchedulerNetwork getNetcoolNetwork()
  {
    return (BMySchedulerNetwork) getNetwork();
  }
}
