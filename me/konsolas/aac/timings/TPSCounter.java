package me.konsolas.aac.timings;

import aacinternal.v;
import java.lang.invoke.MethodHandles;
import me.konsolas.aac.AAC;
import me.konsolas.aac.nc;

public class TPSCounter implements Runnable {
  private final long a = 1000000000L;
  
  private final int d = 50;
  
  private long c;
  
  private final long[] e;
  
  private int b;
  
  private static final long f = nc.a(-8456121722646281638L, 6521167915283933696L, MethodHandles.lookup().lookupClass()).a(121519682556013L);
  
  private static v a(v paramv) {
    return paramv;
  }
  
  public void run() {
    // Byte code:
    //   0: getstatic me/konsolas/aac/timings/TPSCounter.f : J
    //   3: ldc2_w 70361744788023
    //   6: lxor
    //   7: lstore_1
    //   8: ldc2_w 2781066373401528129
    //   11: lload_1
    //   12: <illegal opcode> w : (JJ)[Ljava/lang/String;
    //   17: invokestatic nanoTime : ()J
    //   20: lstore #4
    //   22: lload #4
    //   24: aload_0
    //   25: getfield c : J
    //   28: lsub
    //   29: lstore #6
    //   31: aload_0
    //   32: lload #4
    //   34: putfield c : J
    //   37: aload_0
    //   38: getfield e : [J
    //   41: aload_0
    //   42: dup
    //   43: getfield b : I
    //   46: dup_x1
    //   47: iconst_1
    //   48: iadd
    //   49: putfield b : I
    //   52: lload #6
    //   54: lastore
    //   55: astore_3
    //   56: aload_0
    //   57: aload_3
    //   58: ifnonnull -> 96
    //   61: getfield b : I
    //   64: bipush #50
    //   66: if_icmplt -> 100
    //   69: goto -> 82
    //   72: ldc2_w 2844062394450135282
    //   75: lload_1
    //   76: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   81: athrow
    //   82: aload_0
    //   83: goto -> 96
    //   86: ldc2_w 2844062394450135282
    //   89: lload_1
    //   90: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   95: athrow
    //   96: iconst_0
    //   97: putfield b : I
    //   100: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #3	-> 17
    //   #16	-> 22
    //   #10	-> 31
    //   #19	-> 37
    //   #11	-> 56
    //   #15	-> 100
    // Exception table:
    //   from	to	target	type
    //   56	69	72	aacinternal/v
    //   61	83	86	aacinternal/v
  }
  
  public double a(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/timings/TPSCounter.f : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lconst_0
    //   7: lstore #4
    //   9: aload_0
    //   10: getfield e : [J
    //   13: astore #6
    //   15: ldc2_w 1841768113934760022
    //   18: lload_1
    //   19: <illegal opcode> w : (JJ)[Ljava/lang/String;
    //   24: aload #6
    //   26: arraylength
    //   27: istore #7
    //   29: astore_3
    //   30: iconst_0
    //   31: istore #8
    //   33: iload #8
    //   35: iload #7
    //   37: if_icmpge -> 71
    //   40: aload #6
    //   42: iload #8
    //   44: laload
    //   45: lstore #9
    //   47: lload_1
    //   48: lconst_0
    //   49: lcmp
    //   50: ifle -> 67
    //   53: lload #4
    //   55: lload #9
    //   57: ladd
    //   58: aload_3
    //   59: ifnonnull -> 73
    //   62: lstore #4
    //   64: iinc #8, 1
    //   67: aload_3
    //   68: ifnull -> 33
    //   71: lload #4
    //   73: l2d
    //   74: ldc2_w 50.0
    //   77: ddiv
    //   78: dstore #6
    //   80: ldc2_w 1.0E9
    //   83: dload #6
    //   85: ddiv
    //   86: dreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #5	-> 6
    //   #1	-> 9
    //   #9	-> 71
    //   #14	-> 80
  }
  
  public TPSCounter(AAC paramAAC, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/timings/TPSCounter.f : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: ldc2_w -3464349944182788555
    //   9: lload_2
    //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
    //   15: aload_0
    //   16: invokespecial <init> : ()V
    //   19: aload_0
    //   20: ldc2_w 1000000000
    //   23: putfield a : J
    //   26: astore #4
    //   28: aload_0
    //   29: bipush #50
    //   31: putfield d : I
    //   34: aload_0
    //   35: bipush #50
    //   37: newarray long
    //   39: putfield e : [J
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield b : I
    //   47: aload_0
    //   48: invokestatic nanoTime : ()J
    //   51: putfield c : J
    //   54: aload_0
    //   55: getfield e : [J
    //   58: ldc2_w 50000000
    //   61: invokestatic fill : ([JJ)V
    //   64: aload_1
    //   65: invokevirtual getServer : ()Lorg/bukkit/Server;
    //   68: invokeinterface getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   73: aload_1
    //   74: aload_0
    //   75: lconst_1
    //   76: lconst_1
    //   77: invokeinterface scheduleSyncRepeatingTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;JJ)I
    //   82: pop
    //   83: ldc2_w -3578092396652557573
    //   86: lload_2
    //   87: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
    //   92: ifnull -> 121
    //   95: iconst_2
    //   96: anewarray java/lang/String
    //   99: ldc2_w -3595940140776508396
    //   102: lload_2
    //   103: <illegal opcode> w : ([Ljava/lang/String;JJ)V
    //   108: goto -> 121
    //   111: ldc2_w -3599397993099714170
    //   114: lload_2
    //   115: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   120: athrow
    //   121: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #18	-> 15
    //   #8	-> 19
    //   #7	-> 28
    //   #17	-> 34
    //   #6	-> 42
    //   #2	-> 47
    //   #12	-> 54
    //   #4	-> 64
    //   #13	-> 83
    // Exception table:
    //   from	to	target	type
    //   28	108	111	aacinternal/v
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\timings\TPSCounter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */