package aacinternal;

import java.lang.invoke.MethodHandles;
import me.konsolas.aac.nc;

public interface s {
  public static final long l = nc.a(1178354071386607914L, 8444523482836474356L, MethodHandles.lookup().lookupClass()).a(83135696813038L);
  
  void a(long paramLong, Object paramObject) throws g;
  
  default void a(Object[] paramArrayOfObject, long paramLong) {
    // Byte code:
    //   0: getstatic aacinternal/s.l : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 45857217935682
    //   11: lxor
    //   12: lstore #4
    //   14: dup2
    //   15: ldc2_w 873489289695
    //   18: lxor
    //   19: lstore #6
    //   21: pop2
    //   22: ldc2_w -2152379896141536615
    //   25: lload_2
    //   26: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
    //   31: lload #4
    //   33: aload_1
    //   34: invokestatic a : (JLjava/lang/Object;)V
    //   37: astore #8
    //   39: aload_1
    //   40: astore #9
    //   42: aload #9
    //   44: arraylength
    //   45: istore #10
    //   47: iconst_0
    //   48: istore #11
    //   50: iload #11
    //   52: iload #10
    //   54: if_icmpge -> 82
    //   57: aload #9
    //   59: iload #11
    //   61: aaload
    //   62: astore #12
    //   64: aload_0
    //   65: lload #6
    //   67: aload #12
    //   69: invokeinterface a : (JLjava/lang/Object;)V
    //   74: iinc #11, 1
    //   77: aload #8
    //   79: ifnonnull -> 50
    //   82: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 31
    //   #8	-> 39
    //   #6	-> 64
    //   #2	-> 74
    //   #4	-> 82
  }
  
  default void a(long paramLong, Iterable paramIterable) {
    // Byte code:
    //   0: getstatic aacinternal/s.l : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 54830873115611
    //   11: lxor
    //   12: lstore #4
    //   14: dup2
    //   15: ldc2_w 27083419767622
    //   18: lxor
    //   19: lstore #6
    //   21: pop2
    //   22: ldc2_w 6969370493502824448
    //   25: lload_1
    //   26: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
    //   31: lload #4
    //   33: aload_3
    //   34: invokestatic a : (JLjava/lang/Object;)V
    //   37: astore #8
    //   39: aload_3
    //   40: invokeinterface iterator : ()Ljava/util/Iterator;
    //   45: astore #9
    //   47: aload #9
    //   49: invokeinterface hasNext : ()Z
    //   54: ifeq -> 81
    //   57: aload #9
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: astore #10
    //   66: aload_0
    //   67: lload #6
    //   69: aload #10
    //   71: invokeinterface a : (JLjava/lang/Object;)V
    //   76: aload #8
    //   78: ifnonnull -> 47
    //   81: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #3	-> 31
    //   #7	-> 39
    //   #5	-> 66
    //   #9	-> 76
    //   #10	-> 81
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */