### Finding it in the JDK
#### 
The best example of using a singleton is a running Java application, or more precisely, the runtime. It
is found in the Runtime class and its method, getRuntime, resides in the java.lang package of
the java.base module. The method returns an object associated with the current Java application.
The runtime instance allows the client to add, for example, shutdown hooks to the running application