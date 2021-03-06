/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerSimpleComMovementLogging {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerSimpleComMovementLogging(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerSimpleComMovementLogging obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArServerSimpleComMovementLogging(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArServerSimpleComMovementLogging(ArServerHandlerCommands handlerCommands, ArRobot robot, SWIGTYPE_p_ArServerHandlerPopup popupHandler) {
    this(ArNetworkingJavaJNI.new_ArServerSimpleComMovementLogging__SWIG_0(ArServerHandlerCommands.getCPtr(handlerCommands), handlerCommands, ArRobot.getCPtr(robot), robot, SWIGTYPE_p_ArServerHandlerPopup.getCPtr(popupHandler)), true);
  }

  public ArServerSimpleComMovementLogging(ArServerHandlerCommands handlerCommands, ArRobot robot) {
    this(ArNetworkingJavaJNI.new_ArServerSimpleComMovementLogging__SWIG_1(ArServerHandlerCommands.getCPtr(handlerCommands), handlerCommands, ArRobot.getCPtr(robot), robot), true);
  }

  public void logMovementSentEnable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logMovementSentEnable(swigCPtr, this);
  }

  public void logMovementSentDisable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logMovementSentDisable(swigCPtr, this);
  }

  public void logMovementReceivedEnable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logMovementReceivedEnable(swigCPtr, this);
  }

  public void logMovementReceivedDisable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logMovementReceivedDisable(swigCPtr, this);
  }

  public void logVelocitiesReceivedEnable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logVelocitiesReceivedEnable(swigCPtr, this);
  }

  public void logVelocitiesReceivedDisable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logVelocitiesReceivedDisable(swigCPtr, this);
  }

  public void packetsReceivedTrackingEnable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_packetsReceivedTrackingEnable(swigCPtr, this);
  }

  public void packetsReceivedTrackingDisable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_packetsReceivedTrackingDisable(swigCPtr, this);
  }

  public void packetsSentTrackingEnable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_packetsSentTrackingEnable(swigCPtr, this);
  }

  public void packetsSentTrackingDisable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_packetsSentTrackingDisable(swigCPtr, this);
  }

  public void logActionsEnable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logActionsEnable(swigCPtr, this);
  }

  public void logActionsDisable() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logActionsDisable(swigCPtr, this);
  }

  public void logActions() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_logActions(swigCPtr, this);
  }

  public void popupMovementParams() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_popupMovementParams(swigCPtr, this);
  }

  public void resetOdometer() {
    ArNetworkingJavaJNI.ArServerSimpleComMovementLogging_resetOdometer(swigCPtr, this);
  }

}
