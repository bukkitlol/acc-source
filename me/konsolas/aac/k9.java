package me.konsolas.aac;

import aacinternal.v;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.bukkit.entity.Entity;

public class k9 {
  private static final long a = nc.a(-8559627472036582670L, -1641027610388810876L, MethodHandles.lookup().lookupClass()).a(80284565510585L);
  
  public static List a(long paramLong, Entity paramEntity, lq paramlq, kP paramkP) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/k9.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 54391460003311
    //   11: lxor
    //   12: lstore #5
    //   14: dup2
    //   15: ldc2_w 84139134858415
    //   18: lxor
    //   19: lstore #7
    //   21: dup2
    //   22: ldc2_w 324281980
    //   25: lxor
    //   26: dup2
    //   27: bipush #48
    //   29: lushr
    //   30: l2i
    //   31: istore #9
    //   33: dup2
    //   34: bipush #16
    //   36: lshl
    //   37: bipush #48
    //   39: lushr
    //   40: l2i
    //   41: istore #10
    //   43: dup2
    //   44: bipush #32
    //   46: lshl
    //   47: bipush #32
    //   49: lushr
    //   50: l2i
    //   51: istore #11
    //   53: pop2
    //   54: dup2
    //   55: ldc2_w 79202684459171
    //   58: lxor
    //   59: dup2
    //   60: bipush #8
    //   62: lushr
    //   63: lstore #12
    //   65: dup2
    //   66: bipush #56
    //   68: lshl
    //   69: bipush #56
    //   71: lushr
    //   72: l2i
    //   73: istore #14
    //   75: pop2
    //   76: pop2
    //   77: ldc2_w 8900835629479735334
    //   80: lload_0
    //   81: <illegal opcode> w : (JJ)[I
    //   86: new java/util/ArrayList
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #16
    //   95: aload_3
    //   96: invokevirtual c : ()D
    //   99: invokestatic floor : (D)I
    //   102: istore #17
    //   104: aload_3
    //   105: invokevirtual e : ()D
    //   108: dconst_1
    //   109: dsub
    //   110: invokestatic floor : (D)I
    //   113: istore #18
    //   115: astore #15
    //   117: aload_3
    //   118: invokevirtual d : ()D
    //   121: invokestatic floor : (D)I
    //   124: istore #19
    //   126: aload_3
    //   127: invokevirtual b : ()D
    //   130: invokestatic ceil : (D)I
    //   133: istore #20
    //   135: aload_3
    //   136: invokevirtual a : ()D
    //   139: invokestatic ceil : (D)I
    //   142: istore #21
    //   144: aload_3
    //   145: invokevirtual f : ()D
    //   148: invokestatic ceil : (D)I
    //   151: istore #22
    //   153: iload #17
    //   155: istore #23
    //   157: iload #23
    //   159: iload #20
    //   161: if_icmpge -> 449
    //   164: iload #18
    //   166: istore #24
    //   168: iload #24
    //   170: iload #21
    //   172: if_icmpge -> 435
    //   175: iload #19
    //   177: aload #15
    //   179: ifnull -> 159
    //   182: istore #25
    //   184: iload #25
    //   186: iload #22
    //   188: if_icmpge -> 421
    //   191: aload_2
    //   192: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   197: iload #23
    //   199: iload #24
    //   201: iload #25
    //   203: invokeinterface getBlockAt : (III)Lorg/bukkit/block/Block;
    //   208: astore #26
    //   210: aload #26
    //   212: invokeinterface getType : ()Lorg/bukkit/Material;
    //   217: astore #27
    //   219: invokestatic a : ()Lme/konsolas/aac/kP;
    //   222: lload #5
    //   224: getstatic me/konsolas/aac/kP.V1_14 : Lme/konsolas/aac/kP;
    //   227: invokevirtual a : (JLme/konsolas/aac/kP;)Z
    //   230: aload #15
    //   232: ifnull -> 170
    //   235: lload_0
    //   236: lconst_0
    //   237: lcmp
    //   238: ifle -> 177
    //   241: ifeq -> 278
    //   244: aload #27
    //   246: getstatic org/bukkit/Material.SCAFFOLDING : Lorg/bukkit/Material;
    //   249: if_acmpne -> 278
    //   252: goto -> 265
    //   255: ldc2_w 8814883651401319853
    //   258: lload_0
    //   259: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   264: athrow
    //   265: goto -> 407
    //   268: ldc2_w 8814883651401319853
    //   271: lload_0
    //   272: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   277: athrow
    //   278: aload_2
    //   279: aload #26
    //   281: aload #27
    //   283: aload #4
    //   285: lload #7
    //   287: invokestatic a : (Lorg/bukkit/entity/Entity;Lorg/bukkit/block/Block;Lorg/bukkit/Material;Lme/konsolas/aac/kP;J)Lme/konsolas/aac/hO;
    //   290: iload #23
    //   292: iload #9
    //   294: i2c
    //   295: iload #24
    //   297: iload #25
    //   299: iload #10
    //   301: i2s
    //   302: iload #11
    //   304: invokevirtual a : (ICIISI)Ljava/util/Collection;
    //   307: invokeinterface iterator : ()Ljava/util/Iterator;
    //   312: astore #28
    //   314: aload #28
    //   316: invokeinterface hasNext : ()Z
    //   321: ifeq -> 407
    //   324: aload #28
    //   326: invokeinterface next : ()Ljava/lang/Object;
    //   331: checkcast me/konsolas/aac/lq
    //   334: astore #29
    //   336: aload #29
    //   338: lload #12
    //   340: iload #14
    //   342: i2b
    //   343: aload_3
    //   344: invokevirtual b : (JBLme/konsolas/aac/lq;)Z
    //   347: aload #15
    //   349: ifnull -> 186
    //   352: aload #15
    //   354: lload_0
    //   355: lconst_0
    //   356: lcmp
    //   357: iflt -> 232
    //   360: ifnull -> 401
    //   363: ifeq -> 402
    //   366: goto -> 379
    //   369: ldc2_w 8814883651401319853
    //   372: lload_0
    //   373: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   378: athrow
    //   379: aload #16
    //   381: aload #29
    //   383: invokeinterface add : (Ljava/lang/Object;)Z
    //   388: goto -> 401
    //   391: ldc2_w 8814883651401319853
    //   394: lload_0
    //   395: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   400: athrow
    //   401: pop
    //   402: aload #15
    //   404: ifnonnull -> 314
    //   407: iinc #25, 1
    //   410: aload #15
    //   412: lload_0
    //   413: lconst_0
    //   414: lcmp
    //   415: iflt -> 432
    //   418: ifnonnull -> 184
    //   421: iinc #24, 1
    //   424: aload #15
    //   426: lload_0
    //   427: lconst_0
    //   428: lcmp
    //   429: ifle -> 446
    //   432: ifnonnull -> 168
    //   435: iinc #23, 1
    //   438: lload_0
    //   439: lconst_0
    //   440: lcmp
    //   441: ifle -> 175
    //   444: aload #15
    //   446: ifnonnull -> 157
    //   449: lload_0
    //   450: lconst_0
    //   451: lcmp
    //   452: iflt -> 164
    //   455: aload #16
    //   457: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #6	-> 86
    //   #7	-> 95
    //   #21	-> 104
    //   #19	-> 117
    //   #4	-> 126
    //   #17	-> 135
    //   #11	-> 144
    //   #22	-> 153
    //   #16	-> 164
    //   #10	-> 175
    //   #8	-> 191
    //   #5	-> 210
    //   #2	-> 219
    //   #3	-> 278
    //   #12	-> 336
    //   #9	-> 379
    //   #20	-> 402
    //   #1	-> 407
    //   #18	-> 421
    //   #13	-> 435
    //   #14	-> 449
    // Exception table:
    //   from	to	target	type
    //   235	252	255	aacinternal/v
    //   244	268	268	aacinternal/v
    //   352	366	369	aacinternal/v
    //   363	388	391	aacinternal/v
  }
  
  private static v a(v paramv) {
    return paramv;
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\k9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */