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

import com.mobilerobots.Aria.*;
import com.mobilerobots.ArNetworking.*;


class MapUpdatedHandler  extends ArFunctor_NetPacket
{
  public void invoke(ArNetPacket p)
  {
    System.out.println("Map was changed on server!");
  }
}

public class clientExample {

  /* This loads all the ArNetworking classes (they will be in the global
   * namespace) when this class is loaded: */
  static {
    try {
        System.loadLibrary("AriaJava");
        System.loadLibrary("ArNetworkingJava");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code libraries (AriaJava and ArNetworkingJava .so or .DLL) failed to load. See the chapter on Dynamic Linking Problems in the SWIG Java documentation for help.\n" + e);
      System.exit(1);
    }
  }

  /* Main program: */
  public static void main(String argv[]) {
    System.out.println("Starting Java ArNetworking Test");

    /* Global Aria class inititalizaton */
    Aria.init(Aria.SigHandleMethod.SIGHANDLE_THREAD, true);


    ArClientBase client = new ArClientBase();

    if (!client.blockingConnect("localhost", 7272)) // change hostname or ip address here to connect to a remote host
    {
      System.err.println("Error: Could not connect to server on localhost, exiting.");
      System.exit(1);
    }    

    
    client.runAsync();
    System.out.println("Running...");
    
    // Example server request:
    System.out.println("Requesting wander...");
    client.requestOnce("wander");

    // How to create a packet handler to receive a notification if the map is
    // updated:
    client.addHandler("mapUpdated", new MapUpdatedHandler());
    client.requestOnce("checkMap");

    while(client.isConnected())
    {
      ArUtil.sleep(2000);
    }

    Aria.shutdown();
  }
}

