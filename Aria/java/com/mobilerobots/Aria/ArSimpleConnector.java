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

package com.mobilerobots.Aria;

public class ArSimpleConnector {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArSimpleConnector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArSimpleConnector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArSimpleConnector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArSimpleConnector(java.lang.String[] argc) {
    this(AriaJavaJNI.new_ArSimpleConnector__SWIG_0(argc), true);
  }

  public ArSimpleConnector(ArArgumentBuilder arguments) {
    this(AriaJavaJNI.new_ArSimpleConnector__SWIG_1(ArArgumentBuilder.getCPtr(arguments), arguments), true);
  }

  public ArSimpleConnector(ArArgumentParser parser) {
    this(AriaJavaJNI.new_ArSimpleConnector__SWIG_2(ArArgumentParser.getCPtr(parser), parser), true);
  }

  public boolean setupRobot(ArRobot robot) {
    return AriaJavaJNI.ArSimpleConnector_setupRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public boolean connectRobot(ArRobot robot) {
    return AriaJavaJNI.ArSimpleConnector_connectRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public boolean setupLaser(SWIGTYPE_p_ArSick laser) {
    return AriaJavaJNI.ArSimpleConnector_setupLaser(swigCPtr, this, SWIGTYPE_p_ArSick.getCPtr(laser));
  }

  public boolean setupSecondLaser(SWIGTYPE_p_ArSick laser) {
    return AriaJavaJNI.ArSimpleConnector_setupSecondLaser(swigCPtr, this, SWIGTYPE_p_ArSick.getCPtr(laser));
  }

  public boolean setupLaserArbitrary(SWIGTYPE_p_ArSick laser, int laserNumber) {
    return AriaJavaJNI.ArSimpleConnector_setupLaserArbitrary(swigCPtr, this, SWIGTYPE_p_ArSick.getCPtr(laser), laserNumber);
  }

  public boolean connectLaser(SWIGTYPE_p_ArSick laser) {
    return AriaJavaJNI.ArSimpleConnector_connectLaser(swigCPtr, this, SWIGTYPE_p_ArSick.getCPtr(laser));
  }

  public boolean connectSecondLaser(SWIGTYPE_p_ArSick laser) {
    return AriaJavaJNI.ArSimpleConnector_connectSecondLaser(swigCPtr, this, SWIGTYPE_p_ArSick.getCPtr(laser));
  }

  public boolean connectLaserArbitrary(SWIGTYPE_p_ArSick laser, int laserNumber) {
    return AriaJavaJNI.ArSimpleConnector_connectLaserArbitrary(swigCPtr, this, SWIGTYPE_p_ArSick.getCPtr(laser), laserNumber);
  }

  public boolean parseArgs() {
    return AriaJavaJNI.ArSimpleConnector_parseArgs__SWIG_0(swigCPtr, this);
  }

  public boolean parseArgs(ArArgumentParser parser) {
    return AriaJavaJNI.ArSimpleConnector_parseArgs__SWIG_1(swigCPtr, this, ArArgumentParser.getCPtr(parser), parser);
  }

  public void logOptions() {
    AriaJavaJNI.ArSimpleConnector_logOptions(swigCPtr, this);
  }

  public void setMaxNumLasers(int maxNumLasers) {
    AriaJavaJNI.ArSimpleConnector_setMaxNumLasers__SWIG_0(swigCPtr, this, maxNumLasers);
  }

  public void setMaxNumLasers() {
    AriaJavaJNI.ArSimpleConnector_setMaxNumLasers__SWIG_1(swigCPtr, this);
  }

}
