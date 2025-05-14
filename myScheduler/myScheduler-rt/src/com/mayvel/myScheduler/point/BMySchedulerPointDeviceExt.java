/*
 * Copyright 2025 shloklabs. All Rights Reserved.
 */

package com.mayvel.myScheduler.point;

import com.mayvel.myScheduler.BMySchedulerDevice;
import com.mayvel.myScheduler.BMySchedulerNetwork;
import com.tridium.ndriver.discover.BINDiscoveryObject;
import com.tridium.ndriver.discover.BNDiscoveryPreferences;
import com.tridium.ndriver.point.BNPointDeviceExt;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BNetcoolPointDeviceExt is a container for netcool proxy points.
 *
 * @author shloklabs on 24 Mar 2025
 */
@NiagaraType
@NiagaraProperty(
  name = "discoveryPreferences",
  type = "BNetcoolPointDiscoveryPreferences",
  defaultValue = "new BNetcoolPointDiscoveryPreferences()",
  override = true
)
public class BMySchedulerPointDeviceExt
  extends BNPointDeviceExt
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mayvel.myScheduler.point.BMySchedulerPointDeviceExt(3301245673)1.0$ @*/
/* Generated Mon May 12 15:27:40 IST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "discoveryPreferences"

  /**
   * Slot for the {@code discoveryPreferences} property.
   * @see #getDiscoveryPreferences
   * @see #setDiscoveryPreferences
   */
  public static final Property discoveryPreferences = newProperty(0, new BMySchedulerPointDiscoveryPreferences(), null);

  //endregion Property "discoveryPreferences"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMySchedulerPointDeviceExt.class);

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

////////////////////////////////////////////////////////////////
// PointDeviceExt
////////////////////////////////////////////////////////////////

  /**
   * @return the Device type.
   */
  public Type getDeviceType()
  {
    return BMySchedulerDevice.TYPE;
  }

  /**
   * @return the PointFolder type.
   */
  public Type getPointFolderType()
  {
    return BMySchedulerPointFolder.TYPE;
  }

  /**
   * @return the ProxyExt type.
   */
  public Type getProxyExtType()
  {
    return BMySchedulerProxyExt.TYPE;
  }

////////////////////////////////////////////////////////////////
//BINDiscoveryHost
////////////////////////////////////////////////////////////////

  /**
   * Call back for discoveryJob to get an array of discovery objects.
   * Override point for driver specific discovery.
   */
  public BINDiscoveryObject[] getDiscoveryObjects(BNDiscoveryPreferences prefs)
    throws Exception
  {
    //
    // TODO  get array of discovery objects
    //
//    Array<??> a = new Array<>(??.class);
//    for(??)
//     a.add(new BNetcoolPointDiscoveryLeaf(??));
//    return a.trim();
    return null;
  }
}
