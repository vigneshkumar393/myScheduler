/*
 * Copyright 2025 shloklabs. All Rights Reserved.
 */

package com.mayvel.myScheduler.point;

import com.tridium.ndriver.discover.BNDiscoveryPreferences;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BNetcoolPointDiscoveryPreferences controls the type of discovery leafs using during
 * point discovery for netcool
 *
 * @author shloklabs on 24 Mar 2025
 */
@NiagaraType
public class BMySchedulerPointDiscoveryPreferences
  extends BNDiscoveryPreferences
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mayvel.myScheduler.point.BMySchedulerPointDiscoveryPreferences(2979906276)1.0$ @*/
/* Generated Mon May 12 15:27:40 IST 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMySchedulerPointDiscoveryPreferences.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public BMySchedulerPointDiscoveryPreferences()
  {
  }

  public Type getDiscoveryLeafType()
  {
    return BMySchedulerPointDiscoveryLeaf.TYPE;
  }
}
