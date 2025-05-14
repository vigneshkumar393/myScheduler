/*
 * Copyright 2025 shloklabs. All Rights Reserved.
 */

package com.mayvel.myScheduler.point;

import com.mayvel.myScheduler.BMySchedulerDevice;
import com.mayvel.myScheduler.BMySchedulerNetwork;
import com.tridium.ndriver.point.BNPointFolder;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BNetcoolPointFolder
 *
 * @author   shloklabs on 24 Mar 2025
 */
@NiagaraType
public class BMySchedulerPointFolder
  extends BNPointFolder
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mayvel.myScheduler.point.BMySchedulerPointFolder(2979906276)1.0$ @*/
/* Generated Mon May 12 15:27:40 IST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMySchedulerPointFolder.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Access
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

  /**
   * Get the device cast to a BNetcoolDevice.
   *
   * @return device as a BNetcoolDevice.
   */
  public final BMySchedulerDevice getNetcoolDevice()
  {
    return (BMySchedulerDevice) getDevice();
  }
}
