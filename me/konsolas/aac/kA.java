package me.konsolas.aac;

import aacinternal.v;
import java.lang.invoke.MethodHandles;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class ka {
  private static final double a = 0.0D;
  
  private static final long b = nc.a(5845867375075752968L, -4943241519800930952L, MethodHandles.lookup().lookupClass()).a(50275080781716L);
  
  public static Vector a(long paramLong, short paramShort, Player paramPlayer) {
    // Byte code:
    //   0: lload_0
    //   1: bipush #16
    //   3: lshl
    //   4: iload_2
    //   5: i2l
    //   6: bipush #48
    //   8: lshl
    //   9: bipush #48
    //   11: lushr
    //   12: lor
    //   13: getstatic me/konsolas/aac/ka.b : J
    //   16: lxor
    //   17: lstore #4
    //   19: ldc2_w -6403259406724984041
    //   22: lload #4
    //   24: <illegal opcode> w : (JJ)I
    //   29: new org/bukkit/util/Vector
    //   32: dup
    //   33: iconst_0
    //   34: iconst_0
    //   35: iconst_0
    //   36: invokespecial <init> : (III)V
    //   39: astore #7
    //   41: istore #6
    //   43: aload_3
    //   44: dconst_1
    //   45: dconst_1
    //   46: dconst_1
    //   47: invokeinterface getNearbyEntities : (DDD)Ljava/util/List;
    //   52: invokeinterface iterator : ()Ljava/util/Iterator;
    //   57: astore #8
    //   59: aload #8
    //   61: invokeinterface hasNext : ()Z
    //   66: ifeq -> 324
    //   69: aload #8
    //   71: invokeinterface next : ()Ljava/lang/Object;
    //   76: checkcast org/bukkit/entity/Entity
    //   79: astore #9
    //   81: aload #9
    //   83: aload_3
    //   84: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   89: invokevirtual equals : (Ljava/lang/Object;)Z
    //   92: iload #6
    //   94: ifeq -> 119
    //   97: ifne -> 59
    //   100: goto -> 114
    //   103: ldc2_w -6412387835553242364
    //   106: lload #4
    //   108: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   113: athrow
    //   114: aload #9
    //   116: instanceof org/bukkit/entity/LivingEntity
    //   119: ifne -> 125
    //   122: goto -> 59
    //   125: aload_3
    //   126: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   131: invokevirtual getX : ()D
    //   134: aload #9
    //   136: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   141: invokevirtual getX : ()D
    //   144: dsub
    //   145: dstore #10
    //   147: aload_3
    //   148: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   153: invokevirtual getZ : ()D
    //   156: aload #9
    //   158: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   163: invokevirtual getZ : ()D
    //   166: dsub
    //   167: dstore #12
    //   169: dload #10
    //   171: invokestatic abs : (D)D
    //   174: dload #12
    //   176: invokestatic abs : (D)D
    //   179: invokestatic max : (DD)D
    //   182: dstore #14
    //   184: dload #14
    //   186: lload_0
    //   187: lconst_0
    //   188: lcmp
    //   189: iflt -> 251
    //   192: ldc2_w 0.009999999776482582
    //   195: iload #6
    //   197: ifeq -> 248
    //   200: dcmpl
    //   201: iload_2
    //   202: ifge -> 315
    //   205: ifle -> 313
    //   208: goto -> 222
    //   211: ldc2_w -6412387835553242364
    //   214: lload #4
    //   216: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   221: athrow
    //   222: dload #14
    //   224: invokestatic sqrt : (D)D
    //   227: dstore #14
    //   229: dload #10
    //   231: dload #14
    //   233: ddiv
    //   234: dstore #10
    //   236: dload #12
    //   238: dload #14
    //   240: ddiv
    //   241: dstore #12
    //   243: dconst_1
    //   244: dconst_1
    //   245: dload #14
    //   247: ddiv
    //   248: invokestatic min : (DD)D
    //   251: dstore #16
    //   253: dload #10
    //   255: dload #16
    //   257: dmul
    //   258: dstore #10
    //   260: dload #12
    //   262: dload #16
    //   264: dmul
    //   265: dstore #12
    //   267: dload #10
    //   269: ldc2_w 0.05
    //   272: dmul
    //   273: dstore #10
    //   275: dload #12
    //   277: ldc2_w 0.05
    //   280: dmul
    //   281: dstore #12
    //   283: dload #10
    //   285: dconst_1
    //   286: dmul
    //   287: dstore #10
    //   289: dload #12
    //   291: dconst_1
    //   292: dmul
    //   293: dstore #12
    //   295: aload #7
    //   297: new org/bukkit/util/Vector
    //   300: dup
    //   301: dload #10
    //   303: dconst_0
    //   304: dload #12
    //   306: invokespecial <init> : (DDD)V
    //   309: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   312: pop
    //   313: iload #6
    //   315: lload_0
    //   316: lconst_0
    //   317: lcmp
    //   318: ifle -> 66
    //   321: ifne -> 59
    //   324: aload #7
    //   326: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 29
    //   #18	-> 43
    //   #1	-> 81
    //   #4	-> 125
    //   #15	-> 147
    //   #5	-> 169
    //   #14	-> 184
    //   #6	-> 222
    //   #20	-> 229
    //   #3	-> 236
    //   #10	-> 243
    //   #11	-> 253
    //   #17	-> 260
    //   #16	-> 267
    //   #19	-> 275
    //   #2	-> 283
    //   #9	-> 289
    //   #7	-> 295
    //   #8	-> 313
    //   #13	-> 324
    // Exception table:
    //   from	to	target	type
    //   81	100	103	aacinternal/v
    //   184	208	211	aacinternal/v
  }
  
  private static v a(v paramv) {
    return paramv;
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */