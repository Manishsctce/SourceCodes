package threadDemo;

class Threading extends Thread{
	public void run(String s){
		this.getPriority();
		
	}
	void init(){
		
	}
}

public class ThreadExplore {
	public static void main(String[] args) {

	}

}
/*
//  (version 1.7 : 51.0, super bit)
public class java.lang.Thread implements java.lang.Runnable {
  private char[] name;
  private int priority;
  private java.lang.Thread threadQ;
  private long eetop;
  private boolean single_step;
  private boolean daemon;
  private boolean stillborn;
  private java.lang.Runnable target;
  private java.lang.ThreadGroup group;
  private java.lang.ClassLoader contextClassLoader;
  private java.security.AccessControlContext inheritedAccessControlContext;
  private static int threadInitNumber;
  java.lang.ThreadLocal$ThreadLocalMap threadLocals;
  
  // Field descriptor #269 Ljava/lang/ThreadLocal$ThreadLocalMap;
  java.lang.ThreadLocal$ThreadLocalMap inheritableThreadLocals;
  
  // Field descriptor #42 J
  private long stackSize;
  
  // Field descriptor #42 J
  private long nativeParkEventPointer;
  
  // Field descriptor #42 J
  private long tid;
  
  // Field descriptor #42 J
  private static long threadSeqNumber;
  private volatile int threadStatus;
  volatile java.lang.Object parkBlocker;
  private volatile sun.nio.ch.Interruptible blocker;
  private final java.lang.Object blockerLock;
  public static final int MIN_PRIORITY = 1;
  public static final int NORM_PRIORITY = 5;
  public static final int MAX_PRIORITY = 10;
  
  // Field descriptor #59 [Ljava/lang/StackTraceElement;
  private static final java.lang.StackTraceElement[] EMPTY_STACK_TRACE;
  
  // Field descriptor #265 Ljava/lang/RuntimePermission;
  private static final java.lang.RuntimePermission SUBCLASS_IMPLEMENTATION_PERMISSION;
  
  // Field descriptor #267 Ljava/lang/Thread$UncaughtExceptionHandler;
  private volatile java.lang.Thread$UncaughtExceptionHandler uncaughtExceptionHandler;
  
  // Field descriptor #267 Ljava/lang/Thread$UncaughtExceptionHandler;
  private static volatile java.lang.Thread$UncaughtExceptionHandler defaultUncaughtExceptionHandler;
  private static native void registerNatives();
  private static synchronized int nextThreadNum();
  private static synchronized long nextThreadID();
  void blockedOn(sun.nio.ch.Interruptible arg0);
  public static native java.lang.Thread currentThread();
  public static native void yield();
  public static native void sleep(long arg0) throws java.lang.InterruptedException;
  public static void sleep(long arg0, int arg1) throws java.lang.InterruptedException;
 private void init(java.lang.ThreadGroup arg0, java.lang.Runnable arg1, java.lang.String arg2, long arg3);
  private void init(java.lang.ThreadGroup arg0, java.lang.Runnable arg1, java.lang.String arg2, long arg3, java.security.AccessControlContext arg4);
      0  aload_3 [arg2]
      1  ifnonnull 14
      4  new java.lang.NullPointerException [231]
      7  dup
      8  ldc <String "name cannot be null"> [10]
     10  invokespecial java.lang.NullPointerException(java.lang.String) [457]
     13  athrow
     14  aload_0 [this]
     15  aload_3 [arg2]
     16  invokevirtual java.lang.String.toCharArray() : char[] [465]
     19  putfield java.lang.Thread.name : char[] [426]
     22  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [495]
     25  astore 7
     27  invokestatic java.lang.System.getSecurityManager() : java.lang.SecurityManager [472]
     30  astore 8
     32  aload_1 [arg0]
     33  ifnonnull 57
     36  aload 8
     38  ifnull 47
     41  aload 8
     43  invokevirtual java.lang.SecurityManager.getThreadGroup() : java.lang.ThreadGroup [463]
     46  astore_1 [arg0]
     47  aload_1 [arg0]
     48  ifnonnull 57
     51  aload 7
     53  invokevirtual java.lang.Thread.getThreadGroup() : java.lang.ThreadGroup [498]
     56  astore_1 [arg0]
     57  aload_1 [arg0]
     58  invokevirtual java.lang.ThreadGroup.checkAccess() : void [510]
     61  aload 8
     63  ifnull 84
     66  aload_0 [this]
     67  invokevirtual java.lang.Object.getClass() : java.lang.Class [460]
     70  invokestatic java.lang.Thread.isCCLOverridden(java.lang.Class) : boolean [491]
     73  ifeq 84
     76  aload 8
     78  getstatic java.lang.Thread.SUBCLASS_IMPLEMENTATION_PERMISSION : java.lang.RuntimePermission [430]
     81  invokevirtual java.lang.SecurityManager.checkPermission(java.security.Permission) : void [464]
     84  aload_1 [arg0]
     85  invokevirtual java.lang.ThreadGroup.addUnstarted() : void [509]
     88  aload_0 [this]
     89  aload_1 [arg0]
     90  putfield java.lang.Thread.group : java.lang.ThreadGroup [434]
     93  aload_0 [this]
     94  aload 7
     96  invokevirtual java.lang.Thread.isDaemon() : boolean [484]
     99  putfield java.lang.Thread.daemon : boolean [424]
    102  aload_0 [this]
    103  aload 7
    105  invokevirtual java.lang.Thread.getPriority() : int [473]
    108  putfield java.lang.Thread.priority : int [418]
    111  aload 8
    113  ifnull 127
    116  aload 7
    118  invokevirtual java.lang.Object.getClass() : java.lang.Class [460]
    121  invokestatic java.lang.Thread.isCCLOverridden(java.lang.Class) : boolean [491]
    124  ifeq 139
    127  aload_0 [this]
    128  aload 7
    130  invokevirtual java.lang.Thread.getContextClassLoader() : java.lang.ClassLoader [492]
    133  putfield java.lang.Thread.contextClassLoader : java.lang.ClassLoader [427]
    136  goto 148
    139  aload_0 [this]
    140  aload 7
    142  getfield java.lang.Thread.contextClassLoader : java.lang.ClassLoader [427]
    145  putfield java.lang.Thread.contextClassLoader : java.lang.ClassLoader [427]
    148  aload_0 [this]
    149  aload 6 [arg4]
    151  ifnull 159
    154  aload 6 [arg4]
    156  goto 162
    159  invokestatic java.security.AccessController.getContext() : java.security.AccessControlContext [518]
    162  putfield java.lang.Thread.inheritedAccessControlContext : java.security.AccessControlContext [437]
    165  aload_0 [this]
    166  aload_2 [arg1]
    167  putfield java.lang.Thread.target : java.lang.Runnable [429]
    170  aload_0 [this]
    171  aload_0 [this]
    172  getfield java.lang.Thread.priority : int [418]
    175  invokevirtual java.lang.Thread.setPriority(int) : void [485]
    178  aload 7
    180  getfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    183  ifnull 198
    186  aload_0 [this]
    187  aload 7
    189  getfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    192  invokestatic java.lang.ThreadLocal.createInheritedMap(java.lang.ThreadLocal$ThreadLocalMap) : java.lang.ThreadLocal$ThreadLocalMap [516]
    195  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    198  aload_0 [this]
    199  lload 4 [arg3]
    201  putfield java.lang.Thread.stackSize : long [421]
    204  aload_0 [this]
    205  invokestatic java.lang.Thread.nextThreadID() : long [475]
    208  putfield java.lang.Thread.tid : long [423]
    211  return
    Stack map table: number of frames 10
        [pc: 14, same]
        [pc: 47, append: {java.lang.Thread, java.lang.SecurityManager}]
        [pc: 57, same]
        [pc: 84, same]
        [pc: 127, same]
        [pc: 139, same]
        [pc: 148, same]
        [pc: 159, same_locals_1_stack_item, stack: {java.lang.Thread}]
        [pc: 162, full, stack: {java.lang.Thread, java.security.AccessControlContext}, locals: {java.lang.Thread, java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long, java.security.AccessControlContext, java.lang.Thread, java.lang.SecurityManager}]
        [pc: 198, same]
  
  // Method descriptor #281 ()Ljava/lang/Object;
  // Stack: 2, Locals: 1
  protected java.lang.Object clone() throws java.lang.CloneNotSupportedException;
    0  new java.lang.CloneNotSupportedException [225]
    3  dup
    4  invokespecial java.lang.CloneNotSupportedException() [447]
    7  athrow

  
  // Method descriptor #19 ()V
  // Stack: 6, Locals: 1
  public Thread();
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aconst_null
    42  aconst_null
    43  new java.lang.StringBuilder [238]
    46  dup
    47  invokespecial java.lang.StringBuilder() [467]
    50  ldc <String "Thread-"> [6]
    52  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
    55  invokestatic java.lang.Thread.nextThreadNum() : int [474]
    58  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [469]
    61  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [468]
    64  lconst_0
    65  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long) : void [502]
    68  return

  
  // Method descriptor #283 (Ljava/lang/Runnable;)V
  // Stack: 6, Locals: 2
  public Thread(java.lang.Runnable arg0);
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aconst_null
    42  aload_1 [arg0]
    43  new java.lang.StringBuilder [238]
    46  dup
    47  invokespecial java.lang.StringBuilder() [467]
    50  ldc <String "Thread-"> [6]
    52  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
    55  invokestatic java.lang.Thread.nextThreadNum() : int [474]
    58  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [469]
    61  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [468]
    64  lconst_0
    65  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long) : void [502]
    68  return

  
  // Method descriptor #312 (Ljava/lang/Runnable;Ljava/security/AccessControlContext;)V
  // Stack: 7, Locals: 3
  Thread(java.lang.Runnable arg0, java.security.AccessControlContext arg1);
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aconst_null
    42  aload_1 [arg0]
    43  new java.lang.StringBuilder [238]
    46  dup
    47  invokespecial java.lang.StringBuilder() [467]
    50  ldc <String "Thread-"> [6]
    52  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
    55  invokestatic java.lang.Thread.nextThreadNum() : int [474]
    58  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [469]
    61  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [468]
    64  lconst_0
    65  aload_2 [arg1]
    66  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long, java.security.AccessControlContext) : void [503]
    69  return

  
  // Method descriptor #304 (Ljava/lang/ThreadGroup;Ljava/lang/Runnable;)V
  // Stack: 6, Locals: 3
  public Thread(java.lang.ThreadGroup arg0, java.lang.Runnable arg1);
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aload_1 [arg0]
    42  aload_2 [arg1]
    43  new java.lang.StringBuilder [238]
    46  dup
    47  invokespecial java.lang.StringBuilder() [467]
    50  ldc <String "Thread-"> [6]
    52  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
    55  invokestatic java.lang.Thread.nextThreadNum() : int [474]
    58  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [469]
    61  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [468]
    64  lconst_0
    65  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long) : void [502]
    68  return

  
  // Method descriptor #27 (Ljava/lang/String;)V
  // Stack: 6, Locals: 2
  public Thread(java.lang.String arg0);
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aconst_null
    42  aconst_null
    43  aload_1 [arg0]
    44  lconst_0
    45  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long) : void [502]
    48  return

  
  // Method descriptor #307 (Ljava/lang/ThreadGroup;Ljava/lang/String;)V
  // Stack: 6, Locals: 3
  public Thread(java.lang.ThreadGroup arg0, java.lang.String arg1);
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aload_1 [arg0]
    42  aconst_null
    43  aload_2 [arg1]
    44  lconst_0
    45  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long) : void [502]
    48  return

  
  // Method descriptor #306 (Ljava/lang/Runnable;Ljava/lang/String;)V
  // Stack: 6, Locals: 3
  public Thread(java.lang.Runnable arg0, java.lang.String arg1);
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aconst_null
    42  aload_1 [arg0]
    43  aload_2 [arg1]
    44  lconst_0
    45  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long) : void [502]
    48  return

  
  // Method descriptor #316 (Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;)V
  // Stack: 6, Locals: 4
  public Thread(java.lang.ThreadGroup arg0, java.lang.Runnable arg1, java.lang.String arg2);
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aload_1 [arg0]
    42  aload_2 [arg1]
    43  aload_3 [arg2]
    44  lconst_0
    45  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long) : void [502]
    48  return

  
  // Method descriptor #317 (Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;J)V
  // Stack: 6, Locals: 6
  public Thread(java.lang.ThreadGroup arg0, java.lang.Runnable arg1, java.lang.String arg2, long arg3);
     0  aload_0 [this]
     1  invokespecial java.lang.Object() [458]
     4  aload_0 [this]
     5  iconst_0
     6  putfield java.lang.Thread.daemon : boolean [424]
     9  aload_0 [this]
    10  iconst_0
    11  putfield java.lang.Thread.stillborn : boolean [425]
    14  aload_0 [this]
    15  aconst_null
    16  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    19  aload_0 [this]
    20  aconst_null
    21  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    24  aload_0 [this]
    25  iconst_0
    26  putfield java.lang.Thread.threadStatus : int [420]
    29  aload_0 [this]
    30  new java.lang.Object [232]
    33  dup
    34  invokespecial java.lang.Object() [458]
    37  putfield java.lang.Thread.blockerLock : java.lang.Object [428]
    40  aload_0 [this]
    41  aload_1 [arg0]
    42  aload_2 [arg1]
    43  aload_3 [arg2]
    44  lload 4 [arg3]
    46  invokespecial java.lang.Thread.init(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long) : void [502]
    49  return

  
  // Method descriptor #19 ()V
  // Stack: 2, Locals: 5
  public synchronized void start();
  private native void start0();
  
  // Method descriptor #19 ()V
  // Stack: 1, Locals: 1
  public void run();
     0  aload_0 [this]
     1  getfield java.lang.Thread.target : java.lang.Runnable [429]
     4  ifnull 16
     7  aload_0 [this]
     8  getfield java.lang.Thread.target : java.lang.Runnable [429]
    11  invokeinterface java.lang.Runnable.run() : void [523] [nargs: 1]
    16  return
    Stack map table: number of frames 1
        [pc: 16, same]
  
  // Method descriptor #19 ()V
  // Stack: 2, Locals: 1
  private void exit();
     0  aload_0 [this]
     1  getfield java.lang.Thread.group : java.lang.ThreadGroup [434]
     4  ifnull 20
     7  aload_0 [this]
     8  getfield java.lang.Thread.group : java.lang.ThreadGroup [434]
    11  aload_0 [this]
    12  invokevirtual java.lang.ThreadGroup.threadTerminated(java.lang.Thread) : void [514]
    15  aload_0 [this]
    16  aconst_null
    17  putfield java.lang.Thread.group : java.lang.ThreadGroup [434]
    20  aload_0 [this]
    21  aconst_null
    22  putfield java.lang.Thread.target : java.lang.Runnable [429]
    25  aload_0 [this]
    26  aconst_null
    27  putfield java.lang.Thread.threadLocals : java.lang.ThreadLocal.ThreadLocalMap [436]
    30  aload_0 [this]
    31  aconst_null
    32  putfield java.lang.Thread.inheritableThreadLocals : java.lang.ThreadLocal.ThreadLocalMap [435]
    35  aload_0 [this]
    36  aconst_null
    37  putfield java.lang.Thread.inheritedAccessControlContext : java.security.AccessControlContext [437]
    40  aload_0 [this]
    41  aconst_null
    42  putfield java.lang.Thread.blocker : sun.nio.ch.Interruptible [438]
    45  aload_0 [this]
    46  aconst_null
    47  putfield java.lang.Thread.uncaughtExceptionHandler : java.lang.Thread.UncaughtExceptionHandler [433]
    50  return
    Stack map table: number of frames 1
        [pc: 20, same]
  
  // Method descriptor #19 ()V (deprecated)
  // Stack: 3, Locals: 1
  @java.lang.Deprecated
  public final void stop();
     0  aload_0 [this]
     1  new java.lang.ThreadDeath [246]
     4  dup
     5  invokespecial java.lang.ThreadDeath() [506]
     8  invokevirtual java.lang.Thread.stop(java.lang.Throwable) : void [499]
    11  return

  
  // Method descriptor #28 (Ljava/lang/Throwable;)V (deprecated)
  // Stack: 2, Locals: 3
  @java.lang.Deprecated
  public final synchronized void stop(java.lang.Throwable arg0);
 
  // Method descriptor #19 ()V
  // Stack: 2, Locals: 4
  public void interrupt();
   
  // Method descriptor #20 ()Z
  // Stack: 2, Locals: 0
  public static boolean interrupted();
  public boolean isInterrupted();
  private native boolean isInterrupted(boolean arg0);
  public void destroy();
  public final native boolean isAlive();
  public final void suspend();
  public final void resume();
    0  aload_0 [this]
    1  invokevirtual java.lang.Thread.checkAccess() : void [476]
    4  aload_0 [this]
    5  invokespecial java.lang.Thread.resume0() : void [480]
    8  return

  
  // Method descriptor #22 (I)V
  // Stack: 4, Locals: 3
  public final void setPriority(int arg0);
     0  aload_0 [this]
     1  invokevirtual java.lang.Thread.checkAccess() : void [476]
     4  iload_1 [arg0]
     5  bipush 10
     7  if_icmpgt 15
    10  iload_1 [arg0]
    11  iconst_1
    12  if_icmpge 23
    15  new java.lang.IllegalArgumentException [227]
    18  dup
    19  invokespecial java.lang.IllegalArgumentException() [452]
    22  athrow
    23  aload_0 [this]
    24  invokevirtual java.lang.Thread.getThreadGroup() : java.lang.ThreadGroup [498]
    27  dup
    28  astore_2
    29  ifnull 55
    32  iload_1 [arg0]
    33  aload_2
    34  invokevirtual java.lang.ThreadGroup.getMaxPriority() : int [508]
    37  if_icmple 45
    40  aload_2
    41  invokevirtual java.lang.ThreadGroup.getMaxPriority() : int [508]
    44  istore_1 [arg0]
    45  aload_0 [this]
    46  aload_0 [this]
    47  iload_1 [arg0]
    48  dup_x1
    49  putfield java.lang.Thread.priority : int [418]
    52  invokespecial java.lang.Thread.setPriority0(int) : void [486]
    55  return
    Stack map table: number of frames 4
        [pc: 15, same]
        [pc: 23, same]
        [pc: 45, append: {java.lang.ThreadGroup}]
        [pc: 55, same]
  
  // Method descriptor #16 ()I
  // Stack: 1, Locals: 1
  public final int getPriority();
    0  aload_0 [this]
    1  getfield java.lang.Thread.priority : int [418]
    4  ireturn

  
  // Method descriptor #27 (Ljava/lang/String;)V
  // Stack: 2, Locals: 2
  public final void setName(java.lang.String arg0);
     0  aload_0 [this]
     1  invokevirtual java.lang.Thread.checkAccess() : void [476]
     4  aload_0 [this]
     5  aload_1 [arg0]
     6  invokevirtual java.lang.String.toCharArray() : char[] [465]
     9  putfield java.lang.Thread.name : char[] [426]
    12  return

  
  // Method descriptor #18 ()Ljava/lang/String;
  // Stack: 1, Locals: 1
  public final java.lang.String getName();
    0  aload_0 [this]
    1  getfield java.lang.Thread.name : char[] [426]
    4  invokestatic java.lang.String.valueOf(char[]) : java.lang.String [466]
    7  areturn

  
  // Method descriptor #296 ()Ljava/lang/ThreadGroup;
  // Stack: 1, Locals: 1
  public final java.lang.ThreadGroup getThreadGroup();
    0  aload_0 [this]
    1  getfield java.lang.Thread.group : java.lang.ThreadGroup [434]
    4  areturn

  
  // Method descriptor #16 ()I
  // Stack: 1, Locals: 0
  public static int activeCount();
     0  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [495]
     3  invokevirtual java.lang.Thread.getThreadGroup() : java.lang.ThreadGroup [498]
     6  invokevirtual java.lang.ThreadGroup.activeCount() : int [507]
     9  ireturn

  
  // Method descriptor #291 ([Ljava/lang/Thread;)I
  // Stack: 2, Locals: 1
  public static int enumerate(java.lang.Thread[] arg0);
     0  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [495]
     3  invokevirtual java.lang.Thread.getThreadGroup() : java.lang.ThreadGroup [498]
     6  aload_0 [arg0]
     7  invokevirtual java.lang.ThreadGroup.enumerate(java.lang.Thread[]) : int [515]
    10  ireturn

  
  // Method descriptor #16 ()I (deprecated)
  @java.lang.Deprecated
  public native int countStackFrames();
  
  // Method descriptor #23 (J)V
  // Stack: 4, Locals: 9
  public final synchronized void join(long arg0) throws java.lang.InterruptedException;
     0  invokestatic java.lang.System.currentTimeMillis() : long [471]
     3  lstore_3
     4  lconst_0
     5  lstore 5
     7  lload_1 [arg0]
     8  lconst_0
     9  lcmp
    10  ifge 23
    13  new java.lang.IllegalArgumentException [227]
    16  dup
    17  ldc <String "timeout value is negative"> [14]
    19  invokespecial java.lang.IllegalArgumentException(java.lang.String) [453]
    22  athrow
    23  lload_1 [arg0]
    24  lconst_0
    25  lcmp
    26  ifne 44
    29  aload_0 [this]
    30  invokevirtual java.lang.Thread.isAlive() : boolean [483]
    33  ifeq 83
    36  aload_0 [this]
    37  lconst_0
    38  invokevirtual java.lang.Object.wait(long) : void [459]
    41  goto 29
    44  aload_0 [this]
    45  invokevirtual java.lang.Thread.isAlive() : boolean [483]
    48  ifeq 83
    51  lload_1 [arg0]
    52  lload 5
    54  lsub
    55  lstore 7
    57  lload 7
    59  lconst_0
    60  lcmp
    61  ifgt 67
    64  goto 83
    67  aload_0 [this]
    68  lload 7
    70  invokevirtual java.lang.Object.wait(long) : void [459]
    73  invokestatic java.lang.System.currentTimeMillis() : long [471]
    76  lload_3
    77  lsub
    78  lstore 5
    80  goto 44
    83  return
    Stack map table: number of frames 5
        [pc: 23, append: {long, long}]
        [pc: 29, same]
        [pc: 44, same]
        [pc: 67, append: {long}]
        [pc: 83, chop 1 local(s)]
  
  // Method descriptor #24 (JI)V
  // Stack: 4, Locals: 4
  public final synchronized void join(long arg0, int arg1) throws java.lang.InterruptedException;
     0  lload_1 [arg0]
     1  lconst_0
     2  lcmp
     3  ifge 16
     6  new java.lang.IllegalArgumentException [227]
     9  dup
    10  ldc <String "timeout value is negative"> [14]
    12  invokespecial java.lang.IllegalArgumentException(java.lang.String) [453]
    15  athrow
    16  iload_3 [arg1]
    17  iflt 26
    20  iload_3 [arg1]
    21  ldc <Integer 999999> [2]
    23  if_icmple 36
    26  new java.lang.IllegalArgumentException [227]
    29  dup
    30  ldc <String "nanosecond timeout value out of range"> [11]
    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [453]
    35  athrow
    36  iload_3 [arg1]
    37  ldc <Integer 500000> [1]
    39  if_icmpge 52
    42  iload_3 [arg1]
    43  ifeq 56
    46  lload_1 [arg0]
    47  lconst_0
    48  lcmp
    49  ifne 56
    52  lload_1 [arg0]
    53  lconst_1
    54  ladd
    55  lstore_1 [arg0]
    56  aload_0 [this]
    57  lload_1 [arg0]
    58  invokevirtual java.lang.Thread.join(long) : void [487]
    61  return
    Stack map table: number of frames 5
        [pc: 16, same]
        [pc: 26, same]
        [pc: 36, same]
        [pc: 52, same]
        [pc: 56, same]
  
  // Method descriptor #19 ()V
  // Stack: 3, Locals: 1
  public final void join() throws java.lang.InterruptedException;
    0  aload_0 [this]
    1  lconst_0
    2  invokevirtual java.lang.Thread.join(long) : void [487]
    5  return

  
  // Method descriptor #19 ()V
  // Stack: 3, Locals: 0
  public static void dumpStack();
     0  new java.lang.Exception [226]
     3  dup
     4  ldc <String "Stack trace"> [5]
     6  invokespecial java.lang.Exception(java.lang.String) [451]
     9  invokevirtual java.lang.Exception.printStackTrace() : void [449]
    12  return

  
  // Method descriptor #29 (Z)V
  // Stack: 2, Locals: 2
  public final void setDaemon(boolean arg0);
     0  aload_0 [this]
     1  invokevirtual java.lang.Thread.checkAccess() : void [476]
     4  aload_0 [this]
     5  invokevirtual java.lang.Thread.isAlive() : boolean [483]
     8  ifeq 19
    11  new java.lang.IllegalThreadStateException [228]
    14  dup
    15  invokespecial java.lang.IllegalThreadStateException() [454]
    18  athrow
    19  aload_0 [this]
    20  iload_1 [arg0]
    21  putfield java.lang.Thread.daemon : boolean [424]
    24  return
    Stack map table: number of frames 1
        [pc: 19, same]
  
  // Method descriptor #20 ()Z
  // Stack: 1, Locals: 1
  public final boolean isDaemon();
    0  aload_0 [this]
    1  getfield java.lang.Thread.daemon : boolean [424]
    4  ireturn

  
  // Method descriptor #19 ()V
  // Stack: 2, Locals: 2
  public final void checkAccess();
     0  invokestatic java.lang.System.getSecurityManager() : java.lang.SecurityManager [472]
     3  astore_1
     4  aload_1
     5  ifnull 13
     8  aload_1
     9  aload_0 [this]
    10  invokevirtual java.lang.SecurityManager.checkAccess(java.lang.Thread) : void [462]
    13  return
    Stack map table: number of frames 1
        [pc: 13, append: {java.lang.SecurityManager}]
  
  // Method descriptor #18 ()Ljava/lang/String;
  // Stack: 2, Locals: 2
  public java.lang.String toString();
      0  aload_0 [this]
      1  invokevirtual java.lang.Thread.getThreadGroup() : java.lang.ThreadGroup [498]
      4  astore_1
      5  aload_1
      6  ifnull 61
      9  new java.lang.StringBuilder [238]
     12  dup
     13  invokespecial java.lang.StringBuilder() [467]
     16  ldc <String "Thread["> [7]
     18  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     21  aload_0 [this]
     22  invokevirtual java.lang.Thread.getName() : java.lang.String [494]
     25  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     28  ldc <String ","> [4]
     30  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     33  aload_0 [this]
     34  invokevirtual java.lang.Thread.getPriority() : int [473]
     37  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [469]
     40  ldc <String ","> [4]
     42  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     45  aload_1
     46  invokevirtual java.lang.ThreadGroup.getName() : java.lang.String [511]
     49  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     52  ldc <String "]"> [8]
     54  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     57  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [468]
     60  areturn
     61  new java.lang.StringBuilder [238]
     64  dup
     65  invokespecial java.lang.StringBuilder() [467]
     68  ldc <String "Thread["> [7]
     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     73  aload_0 [this]
     74  invokevirtual java.lang.Thread.getName() : java.lang.String [494]
     77  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     80  ldc <String ","> [4]
     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     85  aload_0 [this]
     86  invokevirtual java.lang.Thread.getPriority() : int [473]
     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [469]
     92  ldc <String ","> [4]
     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
     97  ldc <String ""> [3]
     99  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
    102  ldc <String "]"> [8]
    104  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [470]
    107  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [468]
    110  areturn
    Stack map table: number of frames 1
        [pc: 61, append: {java.lang.ThreadGroup}]
  
  // Method descriptor #279 ()Ljava/lang/ClassLoader;
  // Stack: 2, Locals: 2
  @sun.reflect.CallerSensitive
  public java.lang.ClassLoader getContextClassLoader();
     0  aload_0 [this]
     1  getfield java.lang.Thread.contextClassLoader : java.lang.ClassLoader [427]
     4  ifnonnull 9
     7  aconst_null
     8  areturn
     9  invokestatic java.lang.System.getSecurityManager() : java.lang.SecurityManager [472]
    12  astore_1
    13  aload_1
    14  ifnull 27
    17  aload_0 [this]
    18  getfield java.lang.Thread.contextClassLoader : java.lang.ClassLoader [427]
    21  invokestatic sun.reflect.Reflection.getCallerClass() : java.lang.Class [522]
    24  invokestatic java.lang.ClassLoader.checkClassLoaderPermission(java.lang.ClassLoader, java.lang.Class) : void [446]
    27  aload_0 [this]
    28  getfield java.lang.Thread.contextClassLoader : java.lang.ClassLoader [427]
    31  areturn
    Stack map table: number of frames 2
        [pc: 9, same]
        [pc: 27, append: {java.lang.SecurityManager}]
  
  // Method descriptor #280 (Ljava/lang/ClassLoader;)V
  // Stack: 4, Locals: 3
  public void setContextClassLoader(java.lang.ClassLoader arg0);
     0  invokestatic java.lang.System.getSecurityManager() : java.lang.SecurityManager [472]
     3  astore_2
     4  aload_2
     5  ifnull 21
     8  aload_2
     9  new java.lang.RuntimePermission [234]
    12  dup
    13  ldc <String "setContextClassLoader"> [12]
    15  invokespecial java.lang.RuntimePermission(java.lang.String) [461]
    18  invokevirtual java.lang.SecurityManager.checkPermission(java.security.Permission) : void [464]
    21  aload_0 [this]
    22  aload_1 [arg0]
    23  putfield java.lang.Thread.contextClassLoader : java.lang.ClassLoader [427]
    26  return
    Stack map table: number of frames 1
        [pc: 21, append: {java.lang.SecurityManager}]
  
  // Method descriptor #26 (Ljava/lang/Object;)Z
  public static native boolean holdsLock(java.lang.Object arg0);
  
  // Method descriptor #285 ()[Ljava/lang/StackTraceElement;
  // Stack: 4, Locals: 4
  public java.lang.StackTraceElement[] getStackTrace();
     0  aload_0 [this]
     1  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [495]
     4  if_acmpeq 59
     7  invokestatic java.lang.System.getSecurityManager() : java.lang.SecurityManager [472]
    10  astore_1
    11  aload_1
    12  ifnull 22
    15  aload_1
    16  getstatic sun.security.util.SecurityConstants.GET_STACK_TRACE_PERMISSION : java.lang.RuntimePermission [441]
    19  invokevirtual java.lang.SecurityManager.checkPermission(java.security.Permission) : void [464]
    22  aload_0 [this]
    23  invokevirtual java.lang.Thread.isAlive() : boolean [483]
    26  ifne 33
    29  getstatic java.lang.Thread.EMPTY_STACK_TRACE : java.lang.StackTraceElement[] [431]
    32  areturn
    33  iconst_1
    34  anewarray java.lang.Thread [240]
    37  dup
    38  iconst_0
    39  aload_0 [this]
    40  aastore
    41  invokestatic java.lang.Thread.dumpThreads(java.lang.Thread[]) : java.lang.StackTraceElement[][] [500]
    44  astore_2
    45  aload_2
    46  iconst_0
    47  aaload
    48  astore_3
    49  aload_3
    50  ifnonnull 57
    53  getstatic java.lang.Thread.EMPTY_STACK_TRACE : java.lang.StackTraceElement[] [431]
    56  astore_3
    57  aload_3
    58  areturn
    59  new java.lang.Exception [226]
    62  dup
    63  invokespecial java.lang.Exception() [448]
    66  invokevirtual java.lang.Exception.getStackTrace() : java.lang.StackTraceElement[] [450]
    69  areturn
    Stack map table: number of frames 4
        [pc: 22, append: {java.lang.SecurityManager}]
        [pc: 33, same]
        [pc: 57, append: {java.lang.StackTraceElement[][], java.lang.StackTraceElement[]}]
        [pc: 59, chop 3 local(s)]
  
  // Method descriptor #300 ()Ljava/util/Map;
  // Signature: ()Ljava/util/Map<Ljava/lang/Thread;[Ljava/lang/StackTraceElement;>;
  // Stack: 3, Locals: 6
  public static java.util.Map getAllStackTraces();
     0  invokestatic java.lang.System.getSecurityManager() : java.lang.SecurityManager [472]
     3  astore_0
     4  aload_0
     5  ifnull 22
     8  aload_0
     9  getstatic sun.security.util.SecurityConstants.GET_STACK_TRACE_PERMISSION : java.lang.RuntimePermission [441]
    12  invokevirtual java.lang.SecurityManager.checkPermission(java.security.Permission) : void [464]
    15  aload_0
    16  getstatic sun.security.util.SecurityConstants.MODIFY_THREADGROUP_PERMISSION : java.lang.RuntimePermission [442]
    19  invokevirtual java.lang.SecurityManager.checkPermission(java.security.Permission) : void [464]
    22  invokestatic java.lang.Thread.getThreads() : java.lang.Thread[] [496]
    25  astore_1
    26  aload_1
    27  invokestatic java.lang.Thread.dumpThreads(java.lang.Thread[]) : java.lang.StackTraceElement[][] [500]
    30  astore_2
    31  new java.util.HashMap [255]
    34  dup
    35  aload_1
    36  arraylength
    37  invokespecial java.util.HashMap(int) [520]
    40  astore_3
    41  iconst_0
    42  istore 4
    44  iload 4
    46  aload_1
    47  arraylength
    48  if_icmpge 81
    51  aload_2
    52  iload 4
    54  aaload
    55  astore 5
    57  aload 5
    59  ifnull 75
    62  aload_3
    63  aload_1
    64  iload 4
    66  aaload
    67  aload 5
    69  invokeinterface java.util.Map.put(java.lang.Object, java.lang.Object) : java.lang.Object [525] [nargs: 3]
    74  pop
    75  iinc 4 1
    78  goto 44
    81  aload_3
    82  areturn
    Stack map table: number of frames 4
        [pc: 22, append: {java.lang.SecurityManager}]
        [pc: 44, full, stack: {}, locals: {java.lang.SecurityManager, java.lang.Thread[], java.lang.StackTraceElement[][], java.util.Map, int}]
        [pc: 75, same]
        [pc: 81, chop 1 local(s)]
  
  // Method descriptor #278 (Ljava/lang/Class;)Z
  // Stack: 4, Locals: 3
  private static boolean isCCLOverridden(java.lang.Class arg0);
     0  aload_0 [arg0]
     1  ldc_w <Class java.lang.Thread> [240]
     4  if_acmpne 9
     7  iconst_0
     8  ireturn
     9  getstatic java.lang.Thread$Caches.subclassAuditsQueue : java.lang.ref.ReferenceQueue [439]
    12  getstatic java.lang.Thread$Caches.subclassAudits : java.util.concurrent.ConcurrentMap [440]
    15  invokestatic java.lang.Thread.processQueue(java.lang.ref.ReferenceQueue, java.util.concurrent.ConcurrentMap) : void [501]
    18  new java.lang.Thread$WeakClassKey [245]
    21  dup
    22  aload_0 [arg0]
    23  getstatic java.lang.Thread$Caches.subclassAuditsQueue : java.lang.ref.ReferenceQueue [439]
    26  invokespecial java.lang.Thread$WeakClassKey(java.lang.Class, java.lang.ref.ReferenceQueue) [505]
    29  astore_1
    30  getstatic java.lang.Thread$Caches.subclassAudits : java.util.concurrent.ConcurrentMap [440]
    33  aload_1
    34  invokeinterface java.util.concurrent.ConcurrentMap.get(java.lang.Object) : java.lang.Object [526] [nargs: 2]
    39  checkcast java.lang.Boolean [223]
    42  astore_2
    43  aload_2
    44  ifnonnull 66
    47  aload_0 [arg0]
    48  invokestatic java.lang.Thread.auditSubclass(java.lang.Class) : boolean [490]
    51  invokestatic java.lang.Boolean.valueOf(boolean) : java.lang.Boolean [445]
    54  astore_2
    55  getstatic java.lang.Thread$Caches.subclassAudits : java.util.concurrent.ConcurrentMap [440]
    58  aload_1
    59  aload_2
    60  invokeinterface java.util.concurrent.ConcurrentMap.putIfAbsent(java.lang.Object, java.lang.Object) : java.lang.Object [528] [nargs: 3]
    65  pop
    66  aload_2
    67  invokevirtual java.lang.Boolean.booleanValue() : boolean [444]
    70  ireturn
    Stack map table: number of frames 2
        [pc: 9, same]
        [pc: 66, append: {java.lang.Thread$WeakClassKey, java.lang.Boolean}]
  
  // Method descriptor #278 (Ljava/lang/Class;)Z
  // Stack: 3, Locals: 2
  private static boolean auditSubclass(java.lang.Class arg0);
     0  new java.lang.Thread$1 [241]
     3  dup
     4  aload_0 [arg0]
     5  invokespecial java.lang.Thread$1(java.lang.Class) [504]
     8  invokestatic java.security.AccessController.doPrivileged(java.security.PrivilegedAction) : java.lang.Object [519]
    11  checkcast java.lang.Boolean [223]
    14  astore_1
    15  aload_1
    16  invokevirtual java.lang.Boolean.booleanValue() : boolean [444]
    19  ireturn

  
  // Method descriptor #305 ([Ljava/lang/Thread;)[[Ljava/lang/StackTraceElement;
  private static native java.lang.StackTraceElement[][] dumpThreads(java.lang.Thread[] arg0);
  
  // Method descriptor #289 ()[Ljava/lang/Thread;
  private static native java.lang.Thread[] getThreads();
  
  // Method descriptor #17 ()J
  // Stack: 2, Locals: 1
  public long getId();
    0  aload_0 [this]
    1  getfield java.lang.Thread.tid : long [423]
    4  lreturn

  
  // Method descriptor #292 ()Ljava/lang/Thread$State;
  // Stack: 1, Locals: 1
  public java.lang.Thread.State getState();
    0  aload_0 [this]
    1  getfield java.lang.Thread.threadStatus : int [420]
    4  invokestatic sun.misc.VM.toThreadState(int) : java.lang.Thread$State [521]
    7  areturn

  
  // Method descriptor #295 (Ljava/lang/Thread$UncaughtExceptionHandler;)V
  // Stack: 4, Locals: 2
  public static void setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler arg0);
     0  invokestatic java.lang.System.getSecurityManager() : java.lang.SecurityManager [472]
     3  astore_1
     4  aload_1
     5  ifnull 21
     8  aload_1
     9  new java.lang.RuntimePermission [234]
    12  dup
    13  ldc <String "setDefaultUncaughtExceptionHandler"> [13]
    15  invokespecial java.lang.RuntimePermission(java.lang.String) [461]
    18  invokevirtual java.lang.SecurityManager.checkPermission(java.security.Permission) : void [464]
    21  aload_0 [arg0]
    22  putstatic java.lang.Thread.defaultUncaughtExceptionHandler : java.lang.Thread.UncaughtExceptionHandler [432]
    25  return
    Stack map table: number of frames 1
        [pc: 21, append: {java.lang.SecurityManager}]
  
  // Method descriptor #294 ()Ljava/lang/Thread$UncaughtExceptionHandler;
  // Stack: 1, Locals: 0
  public static java.lang.Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler();
    0  getstatic java.lang.Thread.defaultUncaughtExceptionHandler : java.lang.Thread.UncaughtExceptionHandler [432]
    3  areturn

  
  // Method descriptor #294 ()Ljava/lang/Thread$UncaughtExceptionHandler;
  // Stack: 1, Locals: 1
  public java.lang.Thread.UncaughtExceptionHandler getUncaughtExceptionHandler();
     0  aload_0 [this]
     1  getfield java.lang.Thread.uncaughtExceptionHandler : java.lang.Thread.UncaughtExceptionHandler [433]
     4  ifnull 14
     7  aload_0 [this]
     8  getfield java.lang.Thread.uncaughtExceptionHandler : java.lang.Thread.UncaughtExceptionHandler [433]
    11  goto 18
    14  aload_0 [this]
    15  getfield java.lang.Thread.group : java.lang.ThreadGroup [434]
    18  areturn
    Stack map table: number of frames 2
        [pc: 14, same]
        [pc: 18, same_locals_1_stack_item, stack: {java.lang.Thread$UncaughtExceptionHandler}]
  
  // Method descriptor #295 (Ljava/lang/Thread$UncaughtExceptionHandler;)V
  // Stack: 2, Locals: 2
  public void setUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler arg0);
     0  aload_0 [this]
     1  invokevirtual java.lang.Thread.checkAccess() : void [476]
     4  aload_0 [this]
     5  aload_1 [arg0]
     6  putfield java.lang.Thread.uncaughtExceptionHandler : java.lang.Thread.UncaughtExceptionHandler [433]
     9  return

  
  // Method descriptor #28 (Ljava/lang/Throwable;)V
  // Stack: 3, Locals: 2
  private void dispatchUncaughtException(java.lang.Throwable arg0);
     0  aload_0 [this]
     1  invokevirtual java.lang.Thread.getUncaughtExceptionHandler() : java.lang.Thread$UncaughtExceptionHandler [497]
     4  aload_0 [this]
     5  aload_1 [arg0]
     6  invokeinterface java.lang.Thread$UncaughtExceptionHandler.uncaughtException(java.lang.Thread, java.lang.Throwable) : void [524] [nargs: 3]
    11  return

  
  // Method descriptor #313 (Ljava/lang/ref/ReferenceQueue;Ljava/util/concurrent/ConcurrentMap;)V
  // Signature: (Ljava/lang/ref/ReferenceQueue<Ljava/lang/Class<*>;>;Ljava/util/concurrent/ConcurrentMap<+Ljava/lang/ref/WeakReference<Ljava/lang/Class<*>;>;*>;)V
  // Stack: 2, Locals: 3
  static void processQueue(java.lang.ref.ReferenceQueue arg0, java.util.concurrent.ConcurrentMap arg1);
     0  aload_0 [arg0]
     1  invokevirtual java.lang.ref.ReferenceQueue.poll() : java.lang.ref.Reference [517]
     4  dup
     5  astore_2
     6  ifnull 20
     9  aload_1 [arg1]
    10  aload_2
    11  invokeinterface java.util.concurrent.ConcurrentMap.remove(java.lang.Object) : java.lang.Object [527] [nargs: 2]
    16  pop
    17  goto 0
    20  return
    Stack map table: number of frames 2
        [pc: 0, same]
        [pc: 20, append: {java.lang.ref.Reference}]
  
  // Method descriptor #22 (I)V
  private native void setPriority0(int arg0);
  
  // Method descriptor #282 (Ljava/lang/Object;)V
  private native void stop0(java.lang.Object arg0);
  
  // Method descriptor #19 ()V
  private native void suspend0();
  
  // Method descriptor #19 ()V
  private native void resume0();
  
  // Method descriptor #19 ()V
  private native void interrupt0();
  
  // Method descriptor #27 (Ljava/lang/String;)V
  private native void setNativeName(java.lang.String arg0);
  
  // Method descriptor #19 ()V
  // Stack: 3, Locals: 0
  static {};
     0  invokestatic java.lang.Thread.registerNatives() : void [478]
     3  iconst_0
     4  anewarray java.lang.StackTraceElement [236]
     7  putstatic java.lang.Thread.EMPTY_STACK_TRACE : java.lang.StackTraceElement[] [431]
    10  new java.lang.RuntimePermission [234]
    13  dup
    14  ldc <String "enableContextClassLoaderOverride"> [9]
    16  invokespecial java.lang.RuntimePermission(java.lang.String) [461]
    19  putstatic java.lang.Thread.SUBCLASS_IMPLEMENTATION_PERMISSION : java.lang.RuntimePermission [430]
    22  return

  Inner classes:
    [inner class info: #241 java/lang/Thread$1, outer class info: #0
     inner name: #0, accessflags: 8 static],
    [inner class info: #242 java/lang/Thread$Caches, outer class info: #240 java/lang/Thread
     inner name: #530 Caches, accessflags: 10 private static],
    [inner class info: #243 java/lang/Thread$State, outer class info: #240 java/lang/Thread
     inner name: #54 State, accessflags: 16409 public static final],
    [inner class info: #244 java/lang/Thread$UncaughtExceptionHandler, outer class info: #240 java/lang/Thread
     inner name: #532 UncaughtExceptionHandler, accessflags: 1545 public abstract static],
    [inner class info: #245 java/lang/Thread$WeakClassKey, outer class info: #240 java/lang/Thread
     inner name: #533 WeakClassKey, accessflags: 8 static],
    [inner class info: #249 java/lang/ThreadLocal$ThreadLocalMap, outer class info: #248 java/lang/ThreadLocal
     inner name: #531 ThreadLocalMap, accessflags: 8 static]
} 
  */
