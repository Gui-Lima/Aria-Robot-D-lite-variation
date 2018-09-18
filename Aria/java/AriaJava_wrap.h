/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 * 
 * This file is not intended to be easily readable and contains a number of 
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG 
 * interface file instead. 
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_AriaJava_WRAP_H_
#define SWIG_AriaJava_WRAP_H_

class SwigDirector_ArFunctor : public ArFunctor, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArFunctor(JNIEnv *jenv);
    virtual ~SwigDirector_ArFunctor();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
public:
    bool swig_overrides(int n) {
      return (n < 3 ? swig_override[n] : false);
    }
protected:
    bool swig_override[3];
};

class SwigDirector_ArRetFunctor_VoidP : public ArRetFunctor< void * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor_VoidP(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor_VoidP();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual void * invokeR();
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    bool swig_override[4];
};

class SwigDirector_ArRetFunctor_Bool : public ArRetFunctor< bool >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor_Bool(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor_Bool();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual bool invokeR();
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    bool swig_override[4];
};

class SwigDirector_ArFunctor1_CString : public ArFunctor1< char const * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArFunctor1_CString(JNIEnv *jenv);
    virtual ~SwigDirector_ArFunctor1_CString();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual void invoke(char const *p1);
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    bool swig_override[4];
};

class SwigDirector_ArFunctor1_Int : public ArFunctor1< int >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArFunctor1_Int(JNIEnv *jenv);
    virtual ~SwigDirector_ArFunctor1_Int();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual void invoke(int p1);
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    bool swig_override[4];
};

class SwigDirector_ArFunctor1_ArRobotPacketP : public ArFunctor1< ArRobotPacket * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArFunctor1_ArRobotPacketP(JNIEnv *jenv);
    virtual ~SwigDirector_ArFunctor1_ArRobotPacketP();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual void invoke(ArRobotPacket *p1);
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    bool swig_override[4];
};

class SwigDirector_ArRetFunctor_Int : public ArRetFunctor< int >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor_Int(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor_Int();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual int invokeR();
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    bool swig_override[4];
};

class SwigDirector_ArRetFunctor_Double : public ArRetFunctor< double >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor_Double(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor_Double();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual double invokeR();
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    bool swig_override[4];
};

class SwigDirector_ArRetFunctor_UnsignedInt : public ArRetFunctor< unsigned int >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor_UnsignedInt(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor_UnsignedInt();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual unsigned int invokeR();
public:
    bool swig_overrides(int n) {
      return (n < 4 ? swig_override[n] : false);
    }
protected:
    bool swig_override[4];
};

class SwigDirector_ArRetFunctor1_Double_ArPoseWithTime : public ArRetFunctor1< double,ArPoseWithTime >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor1_Double_ArPoseWithTime(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor1_Double_ArPoseWithTime();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual double invokeR();
    virtual double invokeR(ArPoseWithTime p1);
public:
    bool swig_overrides(int n) {
      return (n < 5 ? swig_override[n] : false);
    }
protected:
    bool swig_override[5];
};

class SwigDirector_ArRetFunctor1_Bool_ArRobotPacketP : public ArRetFunctor1< bool,ArRobotPacket * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor1_Bool_ArRobotPacketP(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor1_Bool_ArRobotPacketP();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual bool invokeR();
    virtual bool invokeR(ArRobotPacket *p1);
public:
    bool swig_overrides(int n) {
      return (n < 5 ? swig_override[n] : false);
    }
protected:
    bool swig_override[5];
};

class SwigDirector_ArRetFunctor1_Bool_ArgumentBuilder : public ArRetFunctor1< bool,ArArgumentBuilder >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor1_Bool_ArgumentBuilder(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor1_Bool_ArgumentBuilder();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual bool invokeR();
    virtual bool invokeR(ArArgumentBuilder p1);
public:
    bool swig_overrides(int n) {
      return (n < 5 ? swig_override[n] : false);
    }
protected:
    bool swig_override[5];
};

class SwigDirector_ArRetFunctor1_Bool_ArgumentBuilderP : public ArRetFunctor1< bool,ArArgumentBuilder * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor1_Bool_ArgumentBuilderP(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor1_Bool_ArgumentBuilderP();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual bool invokeR();
    virtual bool invokeR(ArArgumentBuilder *p1);
public:
    bool swig_overrides(int n) {
      return (n < 5 ? swig_override[n] : false);
    }
protected:
    bool swig_override[5];
};

class SwigDirector_ArRetFunctor1_VoidP_VoidP : public ArRetFunctor1< void *,void * >, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArRetFunctor1_VoidP_VoidP(JNIEnv *jenv);
    virtual ~SwigDirector_ArRetFunctor1_VoidP_VoidP();
    virtual void invoke();
    virtual char const *getName();
    virtual void setName(char const *name);
    virtual void * invokeR();
    virtual void * invokeR(void *p1);
public:
    bool swig_overrides(int n) {
      return (n < 5 ? swig_override[n] : false);
    }
protected:
    bool swig_override[5];
};

class SwigDirector_ArAction : public ArAction, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArAction(JNIEnv *jenv, char const *name, char const *description = "");
    virtual ~SwigDirector_ArAction();
    virtual bool isActive() const;
    virtual void activate();
    virtual void deactivate();
    virtual ArActionDesired *fire(ArActionDesired currentDesired);
    virtual void setRobot(ArRobot *robot);
    virtual int getNumArgs() const;
    virtual ArArg *getArg(int number);
    virtual char const *getName() const;
    virtual char const *getDescription() const;
    virtual ArActionDesired *getDesired();
    virtual ArActionDesired const *getDesired() const;
    virtual void log(bool verbose = true) const;
public:
    bool swig_overrides(int n) {
      return (n < 13 ? swig_override[n] : false);
    }
protected:
    bool swig_override[13];
};

class SwigDirector_ArMap : public ArMap, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ArMap(JNIEnv *jenv, char const *baseDirectory = "./", bool addToGlobalConfig = true, char const *configSection = "Files", char const *configParam = "Map", char const *configDesc = "Map of the environment that the robot uses for navigation", bool ignoreEmptyFileName = true, ArPriority::Priority priority = ArPriority::IMPORTANT, char const *tempDirectory = NULL, int configProcessFilePriority = 100);
    SwigDirector_ArMap(JNIEnv *jenv, ArMap const &other);
    virtual ~SwigDirector_ArMap();
    virtual int getInfoCount() const;
    virtual std::list< std::string > getInfoNames() const;
    virtual std::list< ArArgumentBuilder * > *getInfo(char const *infoName);
    virtual std::list< ArArgumentBuilder * > *getInfo(int infoType);
    virtual std::list< ArArgumentBuilder * > *getMapInfo();
    virtual bool setInfo(char const *infoName, std::list< ArArgumentBuilder * > const *infoList, ArMapChangeDetails *changeDetails = NULL);
    virtual bool setInfo(int infoType, std::list< ArArgumentBuilder * > const *infoList, ArMapChangeDetails *changeDetails = NULL);
    virtual bool setMapInfo(std::list< ArArgumentBuilder * > const *mapInfo, ArMapChangeDetails *changeDetails = NULL);
    virtual void writeInfoToFunctor(ArFunctor1< char const * > *functor, char const *endOfLineChars);
    virtual char const *getInfoName(int infoType);
    virtual void clear();
    virtual bool set(ArMapInterface *other);
    virtual ArMapInterface *clone();
    virtual std::list< std::string > getScanTypes() const;
    virtual bool setScanTypes(std::list< std::string > const &scanTypeList);
    virtual int lock();
    virtual int tryLock();
    virtual int unlock();
    virtual void mapChanged();
    virtual void addMapChangedCB(ArFunctor *functor, ArListPos::Pos position);
    virtual void addMapChangedCB(ArFunctor *functor, int position = 50);
    virtual void remMapChangedCB(ArFunctor *functor);
    virtual void addPreMapChangedCB(ArFunctor *functor, ArListPos::Pos position);
    virtual void addPreMapChangedCB(ArFunctor *functor, int position = 50);
    virtual void remPreMapChangedCB(ArFunctor *functor);
    virtual void setMapChangedLogLevel(ArLog::LogLevel level);
    virtual ArLog::LogLevel getMapChangedLogLevel();
    virtual void writeToFunctor(ArFunctor1< char const * > *functor, char const *endOfLineChars);
    virtual void writeObjectsToFunctor(ArFunctor1< char const * > *functor, char const *endOfLineChars, bool isOverrideAsSingleScan = false, char const *maxCategory = NULL);
    virtual void addPreWriteFileCB(ArFunctor *functor, ArListPos::Pos position = ArListPos::LAST);
    virtual void remPreWriteFileCB(ArFunctor *functor);
    virtual void addPostWriteFileCB(ArFunctor *functor, ArListPos::Pos position = ArListPos::LAST);
    virtual void remPostWriteFileCB(ArFunctor *functor);
    virtual bool getMapId(ArMapId *mapIdOut, bool isInternalCall = false);
    virtual bool calculateChecksum(unsigned char *md5DigestBuffer, size_t md5DigestBufferLen);
    virtual char const *getBaseDirectory() const;
    virtual void setBaseDirectory(char const *baseDirectory);
    virtual char const *getTempDirectory() const;
    virtual void setTempDirectory(char const *tempDirectory);
    virtual std::string createRealFileName(char const *fileName);
    virtual char const *getFileName() const;
    virtual void setSourceFileName(char const *sourceName, char const *fileName, bool isInternalCall = false);
    virtual bool refresh();
    virtual void setIgnoreEmptyFileName(bool ignore);
    virtual bool getIgnoreEmptyFileName();
    virtual void setIgnoreCase(bool ignoreCase = false);
    virtual bool getIgnoreCase();
    virtual ArMapInfoInterface *getInactiveInfo();
    virtual ArMapObjectsInterface *getInactiveObjects();
    virtual ArMapObjectsInterface *getChildObjects();
    virtual ArArgumentBuilder *findMapObjectParams(char const *mapObjectName);
    virtual bool setMapObjectParams(char const *mapObjectName, ArArgumentBuilder *params, ArMapChangeDetails *changeDetails = NULL);
    virtual std::list< ArArgumentBuilder * > *getRemainder();
    virtual void setQuiet(bool isQuiet);
    virtual bool parseLine(char *line);
    virtual void parsingComplete();
    virtual bool isLoadingDataStarted();
    virtual bool isLoadingLinesAndDataStarted();
    virtual char const *getDisplayString(char const *scanType = "");
    virtual std::vector< ArPose > *getPoints(char const *scanType = "");
    virtual ArPose getMinPose(char const *scanType = "");
    virtual ArPose getMaxPose(char const *scanType = "");
    virtual int getNumPoints(char const *scanType = "");
    virtual bool isSortedPoints(char const *scanType = "") const;
    virtual void setPoints(std::vector< ArPose > const *points, char const *scanType = "", bool isSortedPoints = false, ArMapChangeDetails *changeDetails = NULL);
    virtual std::vector< ArLineSegment > *getLines(char const *scanType = "");
    virtual ArPose getLineMinPose(char const *scanType = "");
    virtual ArPose getLineMaxPose(char const *scanType = "");
    virtual int getNumLines(char const *scanType = "");
    virtual bool isSortedLines(char const *scanType = "") const;
    virtual void setLines(std::vector< ArLineSegment > const *lines, char const *scanType = "", bool isSortedLines = false, ArMapChangeDetails *changeDetails = NULL);
    virtual int getResolution(char const *scanType = "");
    virtual void setResolution(int resolution, char const *scanType = "", ArMapChangeDetails *changeDetails = NULL);
    virtual void writeScanToFunctor(ArFunctor1< char const * > *functor, char const *endOfLineChars, char const *scanType = "");
    virtual void writePointsToFunctor(ArFunctor2< int,std::vector< ArPose > * > *functor, char const *scanType = "", ArFunctor1< char const * > *keywordFunctor = NULL);
    virtual void writeLinesToFunctor(ArFunctor2< int,std::vector< ArLineSegment > * > *functor, char const *scanType = "", ArFunctor1< char const * > *keywordFunctor = NULL);
    virtual bool addToFileParser(ArFileParser *fileParser);
    virtual bool remFromFileParser(ArFileParser *fileParser);
    virtual bool readDataPoint(char *line);
    virtual bool readLineSegment(char *line);
    virtual void loadDataPoint(double x, double y);
    virtual void loadLineSegment(double x1, double y1, double x2, double y2);
    virtual ArMapObject *findFirstMapObject(char const *name, char const *type, bool isIncludeWithHeading = false);
    virtual ArMapObject *findMapObject(char const *name, char const *type = NULL, bool isIncludeWithHeading = false);
    virtual std::list< ArMapObject * > findMapObjectsOfType(char const *type, bool isIncludeWithHeading = false);
    virtual std::list< ArMapObject * > *getMapObjects();
    virtual void setMapObjects(std::list< ArMapObject * > const *mapObjects, bool isSortedObjects = false, ArMapChangeDetails *changeDetails = NULL);
    virtual void writeObjectListToFunctor(ArFunctor1< char const * > *functor, char const *endOfLineChars);
    virtual bool hasOriginLatLongAlt();
    virtual ArPose getOriginLatLong();
    virtual double getOriginAltitude();
    virtual void setOriginLatLongAlt(bool hasOriginLatLong, ArPose const &originLatLong, double altitude, ArMapChangeDetails *changeDetails = NULL);
    virtual void writeSupplementToFunctor(ArFunctor1< char const * > *functor, char const *endOfLineChars);
    virtual bool writeFile(char const *fileName);
public:
    bool swig_overrides(int n) {
      return (n < 139 ? swig_override[n] : false);
    }
protected:
    bool swig_override[139];
};


#endif
