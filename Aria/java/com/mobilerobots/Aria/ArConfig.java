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

public class ArConfig {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArConfig obj) {
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
        AriaJavaJNI.delete_ArConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void setCATEGORY_ROBOT_INTERFACE(String value) {
    AriaJavaJNI.ArConfig_CATEGORY_ROBOT_INTERFACE_set(value);
  }

  public static String getCATEGORY_ROBOT_INTERFACE() {
    return AriaJavaJNI.ArConfig_CATEGORY_ROBOT_INTERFACE_get();
  }

  public static void setCATEGORY_ROBOT_OPERATION(String value) {
    AriaJavaJNI.ArConfig_CATEGORY_ROBOT_OPERATION_set(value);
  }

  public static String getCATEGORY_ROBOT_OPERATION() {
    return AriaJavaJNI.ArConfig_CATEGORY_ROBOT_OPERATION_get();
  }

  public static void setCATEGORY_ROBOT_PHYSICAL(String value) {
    AriaJavaJNI.ArConfig_CATEGORY_ROBOT_PHYSICAL_set(value);
  }

  public static String getCATEGORY_ROBOT_PHYSICAL() {
    return AriaJavaJNI.ArConfig_CATEGORY_ROBOT_PHYSICAL_get();
  }

  public static void setCATEGORY_FLEET(String value) {
    AriaJavaJNI.ArConfig_CATEGORY_FLEET_set(value);
  }

  public static String getCATEGORY_FLEET() {
    return AriaJavaJNI.ArConfig_CATEGORY_FLEET_get();
  }

  public static void setCATEGORY_SECURITY(String value) {
    AriaJavaJNI.ArConfig_CATEGORY_SECURITY_set(value);
  }

  public static String getCATEGORY_SECURITY() {
    return AriaJavaJNI.ArConfig_CATEGORY_SECURITY_get();
  }

  public static void setCATEGORY_DEBUG(String value) {
    AriaJavaJNI.ArConfig_CATEGORY_DEBUG_set(value);
  }

  public static String getCATEGORY_DEBUG() {
    return AriaJavaJNI.ArConfig_CATEGORY_DEBUG_get();
  }

  public static String toCategoryName(String categoryName) {
    return AriaJavaJNI.ArConfig_toCategoryName(categoryName);
  }

  public ArConfig(String baseDirectory, boolean noBlanksBetweenParams, boolean ignoreBounds, boolean failOnBadSection, boolean saveUnknown) {
    this(AriaJavaJNI.new_ArConfig__SWIG_0(baseDirectory, noBlanksBetweenParams, ignoreBounds, failOnBadSection, saveUnknown), true);
  }

  public ArConfig(String baseDirectory, boolean noBlanksBetweenParams, boolean ignoreBounds, boolean failOnBadSection) {
    this(AriaJavaJNI.new_ArConfig__SWIG_1(baseDirectory, noBlanksBetweenParams, ignoreBounds, failOnBadSection), true);
  }

  public ArConfig(String baseDirectory, boolean noBlanksBetweenParams, boolean ignoreBounds) {
    this(AriaJavaJNI.new_ArConfig__SWIG_2(baseDirectory, noBlanksBetweenParams, ignoreBounds), true);
  }

  public ArConfig(String baseDirectory, boolean noBlanksBetweenParams) {
    this(AriaJavaJNI.new_ArConfig__SWIG_3(baseDirectory, noBlanksBetweenParams), true);
  }

  public ArConfig(String baseDirectory) {
    this(AriaJavaJNI.new_ArConfig__SWIG_4(baseDirectory), true);
  }

  public ArConfig() {
    this(AriaJavaJNI.new_ArConfig__SWIG_5(), true);
  }

  public ArConfig(ArConfig config) {
    this(AriaJavaJNI.new_ArConfig__SWIG_6(ArConfig.getCPtr(config), config), true);
  }

  public void copyAndDetach(ArConfig config) {
    AriaJavaJNI.ArConfig_copyAndDetach(swigCPtr, this, ArConfig.getCPtr(config), config);
  }

  public void setConfigName(String configName, String robotName) {
    AriaJavaJNI.ArConfig_setConfigName__SWIG_0(swigCPtr, this, configName, robotName);
  }

  public void setConfigName(String configName) {
    AriaJavaJNI.ArConfig_setConfigName__SWIG_1(swigCPtr, this, configName);
  }

  public void setQuiet(boolean isQuiet) {
    AriaJavaJNI.ArConfig_setQuiet(swigCPtr, this, isQuiet);
  }

  public void setTranslator(ArConfig xlatorConfig) {
    AriaJavaJNI.ArConfig_setTranslator(swigCPtr, this, ArConfig.getCPtr(xlatorConfig), xlatorConfig);
  }

  public ArConfig getTranslator() {
    long cPtr = AriaJavaJNI.ArConfig_getTranslator(swigCPtr, this);
    return (cPtr == 0) ? null : new ArConfig(cPtr, false);
  }

  public boolean parseFile(String fileName, boolean continueOnError, boolean noFileNotFoundMessage, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse, ArPriority.Priority highestPriority, ArPriority.Priority lowestPriority, SWIGTYPE_p_ArConfigArg__RestartLevel restartLevelNeeded) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_0(swigCPtr, this, fileName, continueOnError, noFileNotFoundMessage, errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse), highestPriority.swigValue(), lowestPriority.swigValue(), SWIGTYPE_p_ArConfigArg__RestartLevel.getCPtr(restartLevelNeeded));
  }

  public boolean parseFile(String fileName, boolean continueOnError, boolean noFileNotFoundMessage, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse, ArPriority.Priority highestPriority, ArPriority.Priority lowestPriority) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_1(swigCPtr, this, fileName, continueOnError, noFileNotFoundMessage, errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse), highestPriority.swigValue(), lowestPriority.swigValue());
  }

  public boolean parseFile(String fileName, boolean continueOnError, boolean noFileNotFoundMessage, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse, ArPriority.Priority highestPriority) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_2(swigCPtr, this, fileName, continueOnError, noFileNotFoundMessage, errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse), highestPriority.swigValue());
  }

  public boolean parseFile(String fileName, boolean continueOnError, boolean noFileNotFoundMessage, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_3(swigCPtr, this, fileName, continueOnError, noFileNotFoundMessage, errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse));
  }

  public boolean parseFile(String fileName, boolean continueOnError, boolean noFileNotFoundMessage, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_4(swigCPtr, this, fileName, continueOnError, noFileNotFoundMessage, errorBuffer, errorBufferLen);
  }

  public boolean parseFile(String fileName, boolean continueOnError, boolean noFileNotFoundMessage, String errorBuffer) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_5(swigCPtr, this, fileName, continueOnError, noFileNotFoundMessage, errorBuffer);
  }

  public boolean parseFile(String fileName, boolean continueOnError, boolean noFileNotFoundMessage) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_6(swigCPtr, this, fileName, continueOnError, noFileNotFoundMessage);
  }

  public boolean parseFile(String fileName, boolean continueOnError) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_7(swigCPtr, this, fileName, continueOnError);
  }

  public boolean parseFile(String fileName) {
    return AriaJavaJNI.ArConfig_parseFile__SWIG_8(swigCPtr, this, fileName);
  }

  public boolean writeFile(String fileName, boolean append, SWIGTYPE_p_std__setT_std__string_t alreadyWritten, boolean writeExtras, SWIGTYPE_p_std__listT_std__string_t sectionsToWrite, ArPriority.Priority highestPriority, ArPriority.Priority lowestPriority) {
    return AriaJavaJNI.ArConfig_writeFile__SWIG_0(swigCPtr, this, fileName, append, SWIGTYPE_p_std__setT_std__string_t.getCPtr(alreadyWritten), writeExtras, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToWrite), highestPriority.swigValue(), lowestPriority.swigValue());
  }

  public boolean writeFile(String fileName, boolean append, SWIGTYPE_p_std__setT_std__string_t alreadyWritten, boolean writeExtras, SWIGTYPE_p_std__listT_std__string_t sectionsToWrite, ArPriority.Priority highestPriority) {
    return AriaJavaJNI.ArConfig_writeFile__SWIG_1(swigCPtr, this, fileName, append, SWIGTYPE_p_std__setT_std__string_t.getCPtr(alreadyWritten), writeExtras, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToWrite), highestPriority.swigValue());
  }

  public boolean writeFile(String fileName, boolean append, SWIGTYPE_p_std__setT_std__string_t alreadyWritten, boolean writeExtras, SWIGTYPE_p_std__listT_std__string_t sectionsToWrite) {
    return AriaJavaJNI.ArConfig_writeFile__SWIG_2(swigCPtr, this, fileName, append, SWIGTYPE_p_std__setT_std__string_t.getCPtr(alreadyWritten), writeExtras, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToWrite));
  }

  public boolean writeFile(String fileName, boolean append, SWIGTYPE_p_std__setT_std__string_t alreadyWritten, boolean writeExtras) {
    return AriaJavaJNI.ArConfig_writeFile__SWIG_3(swigCPtr, this, fileName, append, SWIGTYPE_p_std__setT_std__string_t.getCPtr(alreadyWritten), writeExtras);
  }

  public boolean writeFile(String fileName, boolean append, SWIGTYPE_p_std__setT_std__string_t alreadyWritten) {
    return AriaJavaJNI.ArConfig_writeFile__SWIG_4(swigCPtr, this, fileName, append, SWIGTYPE_p_std__setT_std__string_t.getCPtr(alreadyWritten));
  }

  public boolean writeFile(String fileName, boolean append) {
    return AriaJavaJNI.ArConfig_writeFile__SWIG_5(swigCPtr, this, fileName, append);
  }

  public boolean writeFile(String fileName) {
    return AriaJavaJNI.ArConfig_writeFile__SWIG_6(swigCPtr, this, fileName);
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors, SWIGTYPE_p_bool parseOk, SWIGTYPE_p_bool processOk, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse, ArPriority.Priority highestPriority, ArPriority.Priority lowestPriority, SWIGTYPE_p_ArConfigArg__RestartLevel restartLevelNeeded) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors, SWIGTYPE_p_bool.getCPtr(parseOk), SWIGTYPE_p_bool.getCPtr(processOk), errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse), highestPriority.swigValue(), lowestPriority.swigValue(), SWIGTYPE_p_ArConfigArg__RestartLevel.getCPtr(restartLevelNeeded));
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors, SWIGTYPE_p_bool parseOk, SWIGTYPE_p_bool processOk, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse, ArPriority.Priority highestPriority, ArPriority.Priority lowestPriority) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors, SWIGTYPE_p_bool.getCPtr(parseOk), SWIGTYPE_p_bool.getCPtr(processOk), errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse), highestPriority.swigValue(), lowestPriority.swigValue());
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors, SWIGTYPE_p_bool parseOk, SWIGTYPE_p_bool processOk, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse, ArPriority.Priority highestPriority) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors, SWIGTYPE_p_bool.getCPtr(parseOk), SWIGTYPE_p_bool.getCPtr(processOk), errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse), highestPriority.swigValue());
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors, SWIGTYPE_p_bool parseOk, SWIGTYPE_p_bool processOk, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors, SWIGTYPE_p_bool.getCPtr(parseOk), SWIGTYPE_p_bool.getCPtr(processOk), errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse));
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors, SWIGTYPE_p_bool parseOk, SWIGTYPE_p_bool processOk, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_4(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors, SWIGTYPE_p_bool.getCPtr(parseOk), SWIGTYPE_p_bool.getCPtr(processOk), errorBuffer, errorBufferLen);
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors, SWIGTYPE_p_bool parseOk, SWIGTYPE_p_bool processOk, String errorBuffer) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_5(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors, SWIGTYPE_p_bool.getCPtr(parseOk), SWIGTYPE_p_bool.getCPtr(processOk), errorBuffer);
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors, SWIGTYPE_p_bool parseOk, SWIGTYPE_p_bool processOk) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_6(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors, SWIGTYPE_p_bool.getCPtr(parseOk), SWIGTYPE_p_bool.getCPtr(processOk));
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors, SWIGTYPE_p_bool parseOk) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_7(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors, SWIGTYPE_p_bool.getCPtr(parseOk));
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines, boolean continueOnErrors) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_8(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines), continueOnErrors);
  }

  public boolean parseText(SWIGTYPE_p_std__listT_std__string_t configLines) {
    return AriaJavaJNI.ArConfig_parseText__SWIG_9(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(configLines));
  }

  public boolean parseResourceFile(String fileName, boolean continueOnError, String errorBuffer, long errorBufferLen, SWIGTYPE_p_std__listT_std__string_t sectionsToParse) {
    return AriaJavaJNI.ArConfig_parseResourceFile__SWIG_0(swigCPtr, this, fileName, continueOnError, errorBuffer, errorBufferLen, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToParse));
  }

  public boolean parseResourceFile(String fileName, boolean continueOnError, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseResourceFile__SWIG_1(swigCPtr, this, fileName, continueOnError, errorBuffer, errorBufferLen);
  }

  public boolean parseResourceFile(String fileName, boolean continueOnError, String errorBuffer) {
    return AriaJavaJNI.ArConfig_parseResourceFile__SWIG_2(swigCPtr, this, fileName, continueOnError, errorBuffer);
  }

  public boolean parseResourceFile(String fileName, boolean continueOnError) {
    return AriaJavaJNI.ArConfig_parseResourceFile__SWIG_3(swigCPtr, this, fileName, continueOnError);
  }

  public boolean parseResourceFile(String fileName) {
    return AriaJavaJNI.ArConfig_parseResourceFile__SWIG_4(swigCPtr, this, fileName);
  }

  public void parseResourceFile(ArArgumentBuilder builder) {
    AriaJavaJNI.ArConfig_parseResourceFile__SWIG_5(swigCPtr, this, ArArgumentBuilder.getCPtr(builder), builder);
  }

  public boolean writeResourceFile(String fileName, boolean append, SWIGTYPE_p_std__setT_std__string_t alreadyWritten, SWIGTYPE_p_std__listT_std__string_t sectionsToWrite) {
    return AriaJavaJNI.ArConfig_writeResourceFile__SWIG_0(swigCPtr, this, fileName, append, SWIGTYPE_p_std__setT_std__string_t.getCPtr(alreadyWritten), SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionsToWrite));
  }

  public boolean writeResourceFile(String fileName, boolean append, SWIGTYPE_p_std__setT_std__string_t alreadyWritten) {
    return AriaJavaJNI.ArConfig_writeResourceFile__SWIG_1(swigCPtr, this, fileName, append, SWIGTYPE_p_std__setT_std__string_t.getCPtr(alreadyWritten));
  }

  public boolean writeResourceFile(String fileName, boolean append) {
    return AriaJavaJNI.ArConfig_writeResourceFile__SWIG_2(swigCPtr, this, fileName, append);
  }

  public boolean writeResourceFile(String fileName) {
    return AriaJavaJNI.ArConfig_writeResourceFile__SWIG_3(swigCPtr, this, fileName);
  }

  public void writeResourceFile(ArArgumentBuilder builder) {
    AriaJavaJNI.ArConfig_writeResourceFile__SWIG_4(swigCPtr, this, ArArgumentBuilder.getCPtr(builder), builder);
  }

  public boolean addSection(String categoryName, String sectionName, String sectionDescription) {
    return AriaJavaJNI.ArConfig_addSection(swigCPtr, this, categoryName, sectionName, sectionDescription);
  }

  public boolean addParam(ArConfigArg arg, String sectionName, ArPriority.Priority priority, String displayHint, ArConfigArg.RestartLevel restart) {
    return AriaJavaJNI.ArConfig_addParam__SWIG_0(swigCPtr, this, ArConfigArg.getCPtr(arg), arg, sectionName, priority.swigValue(), displayHint, restart.swigValue());
  }

  public boolean addParam(ArConfigArg arg, String sectionName, ArPriority.Priority priority, String displayHint) {
    return AriaJavaJNI.ArConfig_addParam__SWIG_1(swigCPtr, this, ArConfigArg.getCPtr(arg), arg, sectionName, priority.swigValue(), displayHint);
  }

  public boolean addParam(ArConfigArg arg, String sectionName, ArPriority.Priority priority) {
    return AriaJavaJNI.ArConfig_addParam__SWIG_2(swigCPtr, this, ArConfigArg.getCPtr(arg), arg, sectionName, priority.swigValue());
  }

  public boolean addParam(ArConfigArg arg, String sectionName) {
    return AriaJavaJNI.ArConfig_addParam__SWIG_3(swigCPtr, this, ArConfigArg.getCPtr(arg), arg, sectionName);
  }

  public boolean addParam(ArConfigArg arg) {
    return AriaJavaJNI.ArConfig_addParam__SWIG_4(swigCPtr, this, ArConfigArg.getCPtr(arg), arg);
  }

  public boolean addComment(String comment, String sectionName, ArPriority.Priority priority) {
    return AriaJavaJNI.ArConfig_addComment__SWIG_0(swigCPtr, this, comment, sectionName, priority.swigValue());
  }

  public boolean addComment(String comment, String sectionName) {
    return AriaJavaJNI.ArConfig_addComment__SWIG_1(swigCPtr, this, comment, sectionName);
  }

  public boolean addComment(String comment) {
    return AriaJavaJNI.ArConfig_addComment__SWIG_2(swigCPtr, this, comment);
  }

  public boolean addParamAsIs(ArConfigArg arg, String sectionName) {
    return AriaJavaJNI.ArConfig_addParamAsIs__SWIG_0(swigCPtr, this, ArConfigArg.getCPtr(arg), arg, sectionName);
  }

  public boolean addParamAsIs(ArConfigArg arg) {
    return AriaJavaJNI.ArConfig_addParamAsIs__SWIG_1(swigCPtr, this, ArConfigArg.getCPtr(arg), arg);
  }

  public void setSectionComment(String sectionName, String comment) {
    AriaJavaJNI.ArConfig_setSectionComment(swigCPtr, this, sectionName, comment);
  }

  public void useArgumentParser(ArArgumentParser parser) {
    AriaJavaJNI.ArConfig_useArgumentParser(swigCPtr, this, ArArgumentParser.getCPtr(parser), parser);
  }

  public boolean processFile() {
    return AriaJavaJNI.ArConfig_processFile(swigCPtr, this);
  }

  public void addProcessFileCB(ArRetFunctor_Bool functor, int priority) {
    AriaJavaJNI.ArConfig_addProcessFileCB__SWIG_0(swigCPtr, this, ArRetFunctor_Bool.getCPtr(functor), functor, priority);
  }

  public void addProcessFileCB(ArRetFunctor_Bool functor) {
    AriaJavaJNI.ArConfig_addProcessFileCB__SWIG_1(swigCPtr, this, ArRetFunctor_Bool.getCPtr(functor), functor);
  }

  public void addProcessFileCB(SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t functor, int priority) {
    AriaJavaJNI.ArConfig_addProcessFileCB__SWIG_2(swigCPtr, this, SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t.getCPtr(functor), priority);
  }

  public void addProcessFileCB(SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t functor) {
    AriaJavaJNI.ArConfig_addProcessFileCB__SWIG_3(swigCPtr, this, SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t.getCPtr(functor));
  }

  public void addProcessFileWithErrorCB(SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t functor, int priority) {
    AriaJavaJNI.ArConfig_addProcessFileWithErrorCB__SWIG_0(swigCPtr, this, SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t.getCPtr(functor), priority);
  }

  public void addProcessFileWithErrorCB(SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t functor) {
    AriaJavaJNI.ArConfig_addProcessFileWithErrorCB__SWIG_1(swigCPtr, this, SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t.getCPtr(functor));
  }

  public void remProcessFileCB(ArRetFunctor_Bool functor) {
    AriaJavaJNI.ArConfig_remProcessFileCB__SWIG_0(swigCPtr, this, ArRetFunctor_Bool.getCPtr(functor), functor);
  }

  public void remProcessFileCB(SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t functor) {
    AriaJavaJNI.ArConfig_remProcessFileCB__SWIG_1(swigCPtr, this, SWIGTYPE_p_ArRetFunctor2T_bool_char_p_size_t_t.getCPtr(functor));
  }

  public boolean callProcessFileCallBacks(boolean continueOnError, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_callProcessFileCallBacks__SWIG_0(swigCPtr, this, continueOnError, errorBuffer, errorBufferLen);
  }

  public boolean callProcessFileCallBacks(boolean continueOnError, String errorBuffer) {
    return AriaJavaJNI.ArConfig_callProcessFileCallBacks__SWIG_1(swigCPtr, this, continueOnError, errorBuffer);
  }

  public boolean callProcessFileCallBacks(boolean continueOnError) {
    return AriaJavaJNI.ArConfig_callProcessFileCallBacks__SWIG_2(swigCPtr, this, continueOnError);
  }

  public boolean parseArgument(ArArgumentBuilder arg, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseArgument__SWIG_0(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer, errorBufferLen);
  }

  public boolean parseArgument(ArArgumentBuilder arg, String errorBuffer) {
    return AriaJavaJNI.ArConfig_parseArgument__SWIG_1(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer);
  }

  public boolean parseArgument(ArArgumentBuilder arg) {
    return AriaJavaJNI.ArConfig_parseArgument__SWIG_2(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg);
  }

  public boolean parseVersion(ArArgumentBuilder arg, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseVersion__SWIG_0(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer, errorBufferLen);
  }

  public boolean parseVersion(ArArgumentBuilder arg, String errorBuffer) {
    return AriaJavaJNI.ArConfig_parseVersion__SWIG_1(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer);
  }

  public boolean parseVersion(ArArgumentBuilder arg) {
    return AriaJavaJNI.ArConfig_parseVersion__SWIG_2(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg);
  }

  public boolean parseSection(ArArgumentBuilder arg, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseSection__SWIG_0(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer, errorBufferLen);
  }

  public boolean parseSection(ArArgumentBuilder arg, String errorBuffer) {
    return AriaJavaJNI.ArConfig_parseSection__SWIG_1(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer);
  }

  public boolean parseSection(ArArgumentBuilder arg) {
    return AriaJavaJNI.ArConfig_parseSection__SWIG_2(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg);
  }

  public boolean parseListBegin(ArArgumentBuilder arg, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseListBegin(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer, errorBufferLen);
  }

  public boolean parseListEnd(ArArgumentBuilder arg, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseListEnd(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer, errorBufferLen);
  }

  public boolean parseUnknown(ArArgumentBuilder arg, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseUnknown__SWIG_0(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer, errorBufferLen);
  }

  public boolean parseUnknown(ArArgumentBuilder arg, String errorBuffer) {
    return AriaJavaJNI.ArConfig_parseUnknown__SWIG_1(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg, errorBuffer);
  }

  public boolean parseUnknown(ArArgumentBuilder arg) {
    return AriaJavaJNI.ArConfig_parseUnknown__SWIG_2(swigCPtr, this, ArArgumentBuilder.getCPtr(arg), arg);
  }

  public ArConfigArg.RestartLevel getRestartLevelNeeded() {
    return ArConfigArg.RestartLevel.swigToEnum(AriaJavaJNI.ArConfig_getRestartLevelNeeded(swigCPtr, this));
  }

  public void resetRestartLevelNeeded() {
    AriaJavaJNI.ArConfig_resetRestartLevelNeeded(swigCPtr, this);
  }

  public String getBaseDirectory() {
    return AriaJavaJNI.ArConfig_getBaseDirectory(swigCPtr, this);
  }

  public void setBaseDirectory(String baseDirectory) {
    AriaJavaJNI.ArConfig_setBaseDirectory(swigCPtr, this, baseDirectory);
  }

  public String getFileName() {
    return AriaJavaJNI.ArConfig_getFileName(swigCPtr, this);
  }

  public void setNoBlanksBetweenParams(boolean noBlanksBetweenParams) {
    AriaJavaJNI.ArConfig_setNoBlanksBetweenParams(swigCPtr, this, noBlanksBetweenParams);
  }

  public boolean getNoBlanksBetweenParams() {
    return AriaJavaJNI.ArConfig_getNoBlanksBetweenParams(swigCPtr, this);
  }

  public boolean parseArgumentParser(ArArgumentParser parser, boolean continueOnError, String errorBuffer, long errorBufferLen) {
    return AriaJavaJNI.ArConfig_parseArgumentParser__SWIG_0(swigCPtr, this, ArArgumentParser.getCPtr(parser), parser, continueOnError, errorBuffer, errorBufferLen);
  }

  public boolean parseArgumentParser(ArArgumentParser parser, boolean continueOnError, String errorBuffer) {
    return AriaJavaJNI.ArConfig_parseArgumentParser__SWIG_1(swigCPtr, this, ArArgumentParser.getCPtr(parser), parser, continueOnError, errorBuffer);
  }

  public boolean parseArgumentParser(ArArgumentParser parser, boolean continueOnError) {
    return AriaJavaJNI.ArConfig_parseArgumentParser__SWIG_2(swigCPtr, this, ArArgumentParser.getCPtr(parser), parser, continueOnError);
  }

  public boolean parseArgumentParser(ArArgumentParser parser) {
    return AriaJavaJNI.ArConfig_parseArgumentParser__SWIG_3(swigCPtr, this, ArArgumentParser.getCPtr(parser), parser);
  }

  public SWIGTYPE_p_std__listT_std__string_t getCategoryNames() {
    return new SWIGTYPE_p_std__listT_std__string_t(AriaJavaJNI.ArConfig_getCategoryNames(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__listT_std__string_t getSectionNamesInCategory(String categoryName) {
    return new SWIGTYPE_p_std__listT_std__string_t(AriaJavaJNI.ArConfig_getSectionNamesInCategory(swigCPtr, this, categoryName), true);
  }

  public SWIGTYPE_p_std__listT_std__string_t getSectionNames() {
    return new SWIGTYPE_p_std__listT_std__string_t(AriaJavaJNI.ArConfig_getSectionNames(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__listT_ArConfigSection_p_t getSections() {
    long cPtr = AriaJavaJNI.ArConfig_getSections(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_ArConfigSection_p_t(cPtr, false);
  }

  public ArConfigSection findSection(String sectionName) {
    long cPtr = AriaJavaJNI.ArConfig_findSection(swigCPtr, this, sectionName);
    return (cPtr == 0) ? null : new ArConfigSection(cPtr, false);
  }

  public void setProcessFileCallbacksLogLevel(ArLog.LogLevel level) {
    AriaJavaJNI.ArConfig_setProcessFileCallbacksLogLevel(swigCPtr, this, level.swigValue());
  }

  public ArLog.LogLevel getProcessFileCallbacksLogLevel() {
    return ArLog.LogLevel.swigToEnum(AriaJavaJNI.ArConfig_getProcessFileCallbacksLogLevel(swigCPtr, this));
  }

  public void setSaveUnknown(boolean saveUnknown) {
    AriaJavaJNI.ArConfig_setSaveUnknown(swigCPtr, this, saveUnknown);
  }

  public boolean getSaveUnknown() {
    return AriaJavaJNI.ArConfig_getSaveUnknown(swigCPtr, this);
  }

  public void clearSections() {
    AriaJavaJNI.ArConfig_clearSections(swigCPtr, this);
  }

  public void clearAll() {
    AriaJavaJNI.ArConfig_clearAll(swigCPtr, this);
  }

  public boolean addSectionFlags(String sectionName, String flags) {
    return AriaJavaJNI.ArConfig_addSectionFlags(swigCPtr, this, sectionName, flags);
  }

  public boolean remSectionFlag(String sectionName, String flag) {
    return AriaJavaJNI.ArConfig_remSectionFlag(swigCPtr, this, sectionName, flag);
  }

  public void clearAllValueSet() {
    AriaJavaJNI.ArConfig_clearAllValueSet(swigCPtr, this);
  }

  public void removeAllUnsetValues() {
    AriaJavaJNI.ArConfig_removeAllUnsetValues(swigCPtr, this);
  }

  public void removeAllUnsetSections() {
    AriaJavaJNI.ArConfig_removeAllUnsetSections(swigCPtr, this);
  }

  public void log(boolean isSummary, SWIGTYPE_p_std__listT_std__string_t sectionNameList, String logPrefix) {
    AriaJavaJNI.ArConfig_log__SWIG_0(swigCPtr, this, isSummary, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionNameList), logPrefix);
  }

  public void log(boolean isSummary, SWIGTYPE_p_std__listT_std__string_t sectionNameList) {
    AriaJavaJNI.ArConfig_log__SWIG_1(swigCPtr, this, isSummary, SWIGTYPE_p_std__listT_std__string_t.getCPtr(sectionNameList));
  }

  public void log(boolean isSummary) {
    AriaJavaJNI.ArConfig_log__SWIG_2(swigCPtr, this, isSummary);
  }

  public void log() {
    AriaJavaJNI.ArConfig_log__SWIG_3(swigCPtr, this);
  }

  public void setPermissions(boolean allowFactory, boolean rememberUnknowns) {
    AriaJavaJNI.ArConfig_setPermissions__SWIG_0(swigCPtr, this, allowFactory, rememberUnknowns);
  }

  public void setPermissions(boolean allowFactory) {
    AriaJavaJNI.ArConfig_setPermissions__SWIG_1(swigCPtr, this, allowFactory);
  }

  public void setPermissions() {
    AriaJavaJNI.ArConfig_setPermissions__SWIG_2(swigCPtr, this);
  }

  public void addSectionNotToParse(String section) {
    AriaJavaJNI.ArConfig_addSectionNotToParse(swigCPtr, this, section);
  }

  public void remSectionNotToParse(String section) {
    AriaJavaJNI.ArConfig_remSectionNotToParse(swigCPtr, this, section);
  }

  public void addListNamesToParser(ArConfigArg parent) {
    AriaJavaJNI.ArConfig_addListNamesToParser(swigCPtr, this, ArConfigArg.getCPtr(parent), parent);
  }

}
