/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import aacinternal.v;
/*     */ import com.comphenix.protocol.events.PacketContainer;
/*     */ import java.lang.invoke.CallSite;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MethodType;
/*     */ import java.lang.invoke.MutableCallSite;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.SecretKeyFactory;
/*     */ import javax.crypto.spec.DESKeySpec;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.block.BlockFace;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.util.BlockVector;
/*     */ import org.bukkit.util.Vector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ce
/*     */   extends ck
/*     */ {
/*     */   private final O k;
/*     */   private final double f;
/*     */   private final Set l;
/*     */   private static final int g = 5;
/*     */   private final fa h;
/*     */   private static final double[] j;
/*     */   private static final Vector[] i;
/*     */   private static final Set a;
/*     */   private static final long m;
/*     */   private static final String[] n;
/*     */   private static final String[] o;
/*     */   private static final Map p;
/*     */   
/*     */   public void a(int paramInt, PacketContainer paramPacketContainer, short paramShort, char paramChar) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #4
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic me/konsolas/aac/ce.m : J
/*     */     //   27: lxor
/*     */     //   28: lstore #5
/*     */     //   30: lload #5
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 133888050215
/*     */     //   36: lxor
/*     */     //   37: dup2
/*     */     //   38: bipush #32
/*     */     //   40: lushr
/*     */     //   41: l2i
/*     */     //   42: istore #7
/*     */     //   44: dup2
/*     */     //   45: bipush #32
/*     */     //   47: lshl
/*     */     //   48: bipush #48
/*     */     //   50: lushr
/*     */     //   51: l2i
/*     */     //   52: istore #8
/*     */     //   54: dup2
/*     */     //   55: bipush #48
/*     */     //   57: lshl
/*     */     //   58: bipush #48
/*     */     //   60: lushr
/*     */     //   61: l2i
/*     */     //   62: istore #9
/*     */     //   64: pop2
/*     */     //   65: pop2
/*     */     //   66: ldc2_w -6692249470616215150
/*     */     //   69: lload #5
/*     */     //   71: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   76: aload_0
/*     */     //   77: getfield h : Lme/konsolas/aac/fa;
/*     */     //   80: invokevirtual a : ()Ljava/lang/Object;
/*     */     //   83: checkcast org/bukkit/Location
/*     */     //   86: astore #11
/*     */     //   88: astore #10
/*     */     //   90: aload #11
/*     */     //   92: aload #10
/*     */     //   94: ifnonnull -> 180
/*     */     //   97: ifnull -> 164
/*     */     //   100: goto -> 114
/*     */     //   103: ldc2_w -6678190657780488655
/*     */     //   106: lload #5
/*     */     //   108: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   113: athrow
/*     */     //   114: aload #11
/*     */     //   116: aload #10
/*     */     //   118: ifnonnull -> 246
/*     */     //   121: goto -> 135
/*     */     //   124: ldc2_w -6678190657780488655
/*     */     //   127: lload #5
/*     */     //   129: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   134: athrow
/*     */     //   135: invokevirtual getWorld : ()Lorg/bukkit/World;
/*     */     //   138: aload_0
/*     */     //   139: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   142: invokeinterface getWorld : ()Lorg/bukkit/World;
/*     */     //   147: if_acmpeq -> 234
/*     */     //   150: goto -> 164
/*     */     //   153: ldc2_w -6678190657780488655
/*     */     //   156: lload #5
/*     */     //   158: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   163: athrow
/*     */     //   164: aload #11
/*     */     //   166: goto -> 180
/*     */     //   169: ldc2_w -6678190657780488655
/*     */     //   172: lload #5
/*     */     //   174: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   179: athrow
/*     */     //   180: aload #10
/*     */     //   182: ifnonnull -> 232
/*     */     //   185: ifnull -> 223
/*     */     //   188: goto -> 202
/*     */     //   191: ldc2_w -6678190657780488655
/*     */     //   194: lload #5
/*     */     //   196: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   201: athrow
/*     */     //   202: aload_0
/*     */     //   203: getfield h : Lme/konsolas/aac/fa;
/*     */     //   206: invokevirtual a : ()V
/*     */     //   209: goto -> 223
/*     */     //   212: ldc2_w -6678190657780488655
/*     */     //   215: lload #5
/*     */     //   217: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   222: athrow
/*     */     //   223: aload_0
/*     */     //   224: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   227: invokeinterface getLocation : ()Lorg/bukkit/Location;
/*     */     //   232: astore #11
/*     */     //   234: aload_2
/*     */     //   235: iload #7
/*     */     //   237: iload #8
/*     */     //   239: iload #9
/*     */     //   241: aload #11
/*     */     //   243: invokestatic a : (Lcom/comphenix/protocol/events/PacketContainer;IIILorg/bukkit/Location;)Lorg/bukkit/Location;
/*     */     //   246: astore #12
/*     */     //   248: iload_1
/*     */     //   249: ifle -> 334
/*     */     //   252: aload_0
/*     */     //   253: aload #10
/*     */     //   255: ifnonnull -> 325
/*     */     //   258: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   261: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
/*     */     //   266: ifnull -> 324
/*     */     //   269: goto -> 283
/*     */     //   272: ldc2_w -6678190657780488655
/*     */     //   275: lload #5
/*     */     //   277: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   282: athrow
/*     */     //   283: aload_0
/*     */     //   284: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   287: invokeinterface getLocation : ()Lorg/bukkit/Location;
/*     */     //   292: astore #13
/*     */     //   294: aload #12
/*     */     //   296: aload #13
/*     */     //   298: invokevirtual getX : ()D
/*     */     //   301: invokevirtual setX : (D)V
/*     */     //   304: aload #12
/*     */     //   306: aload #13
/*     */     //   308: invokevirtual getY : ()D
/*     */     //   311: invokevirtual setY : (D)V
/*     */     //   314: aload #12
/*     */     //   316: aload #13
/*     */     //   318: invokevirtual getZ : ()D
/*     */     //   321: invokevirtual setZ : (D)V
/*     */     //   324: aload_0
/*     */     //   325: getfield h : Lme/konsolas/aac/fa;
/*     */     //   328: aload #12
/*     */     //   330: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   333: pop
/*     */     //   334: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #20	-> 76
/*     */     //   #81	-> 90
/*     */     //   #14	-> 164
/*     */     //   #27	-> 202
/*     */     //   #86	-> 223
/*     */     //   #54	-> 234
/*     */     //   #35	-> 248
/*     */     //   #129	-> 283
/*     */     //   #99	-> 294
/*     */     //   #58	-> 304
/*     */     //   #111	-> 314
/*     */     //   #101	-> 324
/*     */     //   #89	-> 334
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   90	100	103	aacinternal/v
/*     */     //   97	121	124	aacinternal/v
/*     */     //   114	150	153	aacinternal/v
/*     */     //   135	166	169	aacinternal/v
/*     */     //   180	188	191	aacinternal/v
/*     */     //   185	209	212	aacinternal/v
/*     */     //   248	269	272	aacinternal/v
/*     */   }
/*     */   
/*     */   private Collection a(BlockFace paramBlockFace, int paramInt1, int paramInt2, BlockVector paramBlockVector, Vector paramVector, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #6
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic me/konsolas/aac/ce.m : J
/*     */     //   27: lxor
/*     */     //   28: lstore #7
/*     */     //   30: lload #7
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 37937953092023
/*     */     //   36: lxor
/*     */     //   37: lstore #9
/*     */     //   39: dup2
/*     */     //   40: ldc2_w 23779311992493
/*     */     //   43: lxor
/*     */     //   44: lstore #11
/*     */     //   46: dup2
/*     */     //   47: ldc2_w 36123008596077
/*     */     //   50: lxor
/*     */     //   51: lstore #13
/*     */     //   53: pop2
/*     */     //   54: new java/util/ArrayList
/*     */     //   57: dup
/*     */     //   58: invokespecial <init> : ()V
/*     */     //   61: astore #16
/*     */     //   63: ldc2_w 7171445164151480628
/*     */     //   66: lload #7
/*     */     //   68: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   73: aload_0
/*     */     //   74: getfield h : Lme/konsolas/aac/fa;
/*     */     //   77: invokevirtual iterator : ()Ljava/util/Iterator;
/*     */     //   80: astore #17
/*     */     //   82: astore #15
/*     */     //   84: aload #17
/*     */     //   86: invokeinterface hasNext : ()Z
/*     */     //   91: ifeq -> 474
/*     */     //   94: aload #17
/*     */     //   96: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   101: checkcast org/bukkit/Location
/*     */     //   104: astore #18
/*     */     //   106: aload #18
/*     */     //   108: aload #15
/*     */     //   110: iload_3
/*     */     //   111: iflt -> 693
/*     */     //   114: iload_3
/*     */     //   115: ifle -> 123
/*     */     //   118: ifnonnull -> 691
/*     */     //   121: aload #15
/*     */     //   123: ifnonnull -> 163
/*     */     //   126: goto -> 140
/*     */     //   129: ldc2_w 7202382853114930839
/*     */     //   132: lload #7
/*     */     //   134: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   139: athrow
/*     */     //   140: ifnonnull -> 161
/*     */     //   143: goto -> 157
/*     */     //   146: ldc2_w 7202382853114930839
/*     */     //   149: lload #7
/*     */     //   151: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   156: athrow
/*     */     //   157: iload_3
/*     */     //   158: ifge -> 84
/*     */     //   161: aload #18
/*     */     //   163: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
/*     */     //   166: aload #5
/*     */     //   168: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
/*     */     //   171: astore #19
/*     */     //   173: aload_0
/*     */     //   174: getfield h : Lme/konsolas/aac/fa;
/*     */     //   177: invokevirtual iterator : ()Ljava/util/Iterator;
/*     */     //   180: astore #20
/*     */     //   182: aload #20
/*     */     //   184: invokeinterface hasNext : ()Z
/*     */     //   189: ifeq -> 469
/*     */     //   192: aload #20
/*     */     //   194: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   199: checkcast org/bukkit/Location
/*     */     //   202: astore #21
/*     */     //   204: aload #21
/*     */     //   206: aload #15
/*     */     //   208: iload_3
/*     */     //   209: ifle -> 693
/*     */     //   212: iload #6
/*     */     //   214: ifle -> 693
/*     */     //   217: ifnonnull -> 691
/*     */     //   220: aload #15
/*     */     //   222: ifnonnull -> 263
/*     */     //   225: goto -> 239
/*     */     //   228: ldc2_w 7202382853114930839
/*     */     //   231: lload #7
/*     */     //   233: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   238: athrow
/*     */     //   239: ifnonnull -> 261
/*     */     //   242: goto -> 256
/*     */     //   245: ldc2_w 7202382853114930839
/*     */     //   248: lload #7
/*     */     //   250: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   255: athrow
/*     */     //   256: iload #6
/*     */     //   258: ifge -> 182
/*     */     //   261: aload #21
/*     */     //   263: invokevirtual getDirection : ()Lorg/bukkit/util/Vector;
/*     */     //   266: astore #22
/*     */     //   268: invokestatic a : ()Lme/konsolas/aac/mJ;
/*     */     //   271: aload_0
/*     */     //   272: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   275: aload #19
/*     */     //   277: lload #11
/*     */     //   279: aload #22
/*     */     //   281: ldc2_w 5.0
/*     */     //   284: invokeinterface a : (Lorg/bukkit/entity/Entity;Lorg/bukkit/util/Vector;JLorg/bukkit/util/Vector;D)Lme/konsolas/aac/d7;
/*     */     //   289: astore #23
/*     */     //   291: aload #23
/*     */     //   293: lload #9
/*     */     //   295: invokevirtual a : (J)Z
/*     */     //   298: iload #6
/*     */     //   300: iflt -> 349
/*     */     //   303: aload #15
/*     */     //   305: ifnonnull -> 349
/*     */     //   308: ifeq -> 450
/*     */     //   311: goto -> 325
/*     */     //   314: ldc2_w 7202382853114930839
/*     */     //   317: lload #7
/*     */     //   319: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   324: athrow
/*     */     //   325: aload #23
/*     */     //   327: invokevirtual a : ()Lorg/bukkit/util/BlockVector;
/*     */     //   330: aload #4
/*     */     //   332: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   335: goto -> 349
/*     */     //   338: ldc2_w 7202382853114930839
/*     */     //   341: lload #7
/*     */     //   343: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   348: athrow
/*     */     //   349: ifeq -> 450
/*     */     //   352: aload_1
/*     */     //   353: iload #6
/*     */     //   355: ifle -> 413
/*     */     //   358: aload #15
/*     */     //   360: ifnonnull -> 413
/*     */     //   363: goto -> 377
/*     */     //   366: ldc2_w 7202382853114930839
/*     */     //   369: lload #7
/*     */     //   371: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   376: athrow
/*     */     //   377: ifnull -> 417
/*     */     //   380: goto -> 394
/*     */     //   383: ldc2_w 7202382853114930839
/*     */     //   386: lload #7
/*     */     //   388: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   393: athrow
/*     */     //   394: aload #23
/*     */     //   396: invokevirtual a : ()Lorg/bukkit/block/BlockFace;
/*     */     //   399: goto -> 413
/*     */     //   402: ldc2_w 7202382853114930839
/*     */     //   405: lload #7
/*     */     //   407: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   412: athrow
/*     */     //   413: aload_1
/*     */     //   414: if_acmpne -> 450
/*     */     //   417: aload #16
/*     */     //   419: aload #22
/*     */     //   421: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   426: pop
/*     */     //   427: aload #15
/*     */     //   429: iload_2
/*     */     //   430: ifle -> 471
/*     */     //   433: ifnull -> 469
/*     */     //   436: goto -> 450
/*     */     //   439: ldc2_w 7202382853114930839
/*     */     //   442: lload #7
/*     */     //   444: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   449: athrow
/*     */     //   450: aload #15
/*     */     //   452: ifnull -> 182
/*     */     //   455: goto -> 469
/*     */     //   458: ldc2_w 7202382853114930839
/*     */     //   461: lload #7
/*     */     //   463: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   468: athrow
/*     */     //   469: aload #15
/*     */     //   471: ifnull -> 84
/*     */     //   474: aload #16
/*     */     //   476: invokeinterface isEmpty : ()Z
/*     */     //   481: iload #6
/*     */     //   483: iflt -> 563
/*     */     //   486: aload #15
/*     */     //   488: ifnonnull -> 563
/*     */     //   491: ifne -> 639
/*     */     //   494: goto -> 508
/*     */     //   497: ldc2_w 7202382853114930839
/*     */     //   500: lload #7
/*     */     //   502: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   507: athrow
/*     */     //   508: aload_0
/*     */     //   509: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   512: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   515: aload_0
/*     */     //   516: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   519: aload #15
/*     */     //   521: iload_2
/*     */     //   522: iflt -> 633
/*     */     //   525: ifnonnull -> 591
/*     */     //   528: goto -> 542
/*     */     //   531: ldc2_w 7202382853114930839
/*     */     //   534: lload #7
/*     */     //   536: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   541: athrow
/*     */     //   542: lload #13
/*     */     //   544: dup2_x1
/*     */     //   545: pop2
/*     */     //   546: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*     */     //   549: goto -> 563
/*     */     //   552: ldc2_w 7202382853114930839
/*     */     //   555: lload #7
/*     */     //   557: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   562: athrow
/*     */     //   563: ifeq -> 636
/*     */     //   566: aload_0
/*     */     //   567: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   570: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   573: aload_0
/*     */     //   574: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   577: goto -> 591
/*     */     //   580: ldc2_w 7202382853114930839
/*     */     //   583: lload #7
/*     */     //   585: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   590: athrow
/*     */     //   591: new java/lang/StringBuilder
/*     */     //   594: dup
/*     */     //   595: invokespecial <init> : ()V
/*     */     //   598: sipush #24162
/*     */     //   601: ldc2_w 7711984265713044151
/*     */     //   604: lload #7
/*     */     //   606: lxor
/*     */     //   607: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   612: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   615: aload #16
/*     */     //   617: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   622: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   627: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   630: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   633: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*     */     //   636: aload #16
/*     */     //   638: areturn
/*     */     //   639: aload_0
/*     */     //   640: getfield h : Lme/konsolas/aac/fa;
/*     */     //   643: invokevirtual iterator : ()Ljava/util/Iterator;
/*     */     //   646: astore #17
/*     */     //   648: aload #17
/*     */     //   650: invokeinterface hasNext : ()Z
/*     */     //   655: ifeq -> 1001
/*     */     //   658: aload #17
/*     */     //   660: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   665: checkcast org/bukkit/Location
/*     */     //   668: astore #18
/*     */     //   670: aload #15
/*     */     //   672: ifnonnull -> 1110
/*     */     //   675: aload #18
/*     */     //   677: goto -> 691
/*     */     //   680: ldc2_w 7202382853114930839
/*     */     //   683: lload #7
/*     */     //   685: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   690: athrow
/*     */     //   691: aload #15
/*     */     //   693: ifnonnull -> 719
/*     */     //   696: ifnonnull -> 717
/*     */     //   699: goto -> 713
/*     */     //   702: ldc2_w 7202382853114930839
/*     */     //   705: lload #7
/*     */     //   707: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   712: athrow
/*     */     //   713: iload_2
/*     */     //   714: ifge -> 648
/*     */     //   717: aload #18
/*     */     //   719: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
/*     */     //   722: aload #5
/*     */     //   724: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
/*     */     //   727: astore #19
/*     */     //   729: getstatic me/konsolas/aac/ce.i : [Lorg/bukkit/util/Vector;
/*     */     //   732: astore #20
/*     */     //   734: aload #20
/*     */     //   736: arraylength
/*     */     //   737: istore #21
/*     */     //   739: iconst_0
/*     */     //   740: istore #22
/*     */     //   742: iload #22
/*     */     //   744: iload #21
/*     */     //   746: if_icmpge -> 992
/*     */     //   749: aload #20
/*     */     //   751: iload #22
/*     */     //   753: aaload
/*     */     //   754: astore #23
/*     */     //   756: aload #23
/*     */     //   758: invokevirtual clone : ()Lorg/bukkit/util/Vector;
/*     */     //   761: aload #4
/*     */     //   763: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
/*     */     //   766: aload #19
/*     */     //   768: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
/*     */     //   771: astore #24
/*     */     //   773: aload #15
/*     */     //   775: ifnonnull -> 987
/*     */     //   778: aload #24
/*     */     //   780: invokevirtual lengthSquared : ()D
/*     */     //   783: dconst_0
/*     */     //   784: dcmpl
/*     */     //   785: aload #15
/*     */     //   787: ifnonnull -> 655
/*     */     //   790: iload_3
/*     */     //   791: ifle -> 740
/*     */     //   794: goto -> 808
/*     */     //   797: ldc2_w 7202382853114930839
/*     */     //   800: lload #7
/*     */     //   802: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   807: athrow
/*     */     //   808: ifle -> 984
/*     */     //   811: invokestatic a : ()Lme/konsolas/aac/mJ;
/*     */     //   814: aload_0
/*     */     //   815: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   818: aload #19
/*     */     //   820: lload #11
/*     */     //   822: aload #24
/*     */     //   824: ldc2_w 5.0
/*     */     //   827: invokeinterface a : (Lorg/bukkit/entity/Entity;Lorg/bukkit/util/Vector;JLorg/bukkit/util/Vector;D)Lme/konsolas/aac/d7;
/*     */     //   832: astore #25
/*     */     //   834: aload #15
/*     */     //   836: iload #6
/*     */     //   838: iflt -> 989
/*     */     //   841: ifnonnull -> 987
/*     */     //   844: aload #25
/*     */     //   846: lload #9
/*     */     //   848: invokevirtual a : (J)Z
/*     */     //   851: ifeq -> 984
/*     */     //   854: goto -> 868
/*     */     //   857: ldc2_w 7202382853114930839
/*     */     //   860: lload #7
/*     */     //   862: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   867: athrow
/*     */     //   868: aload #25
/*     */     //   870: invokevirtual a : ()Lorg/bukkit/util/BlockVector;
/*     */     //   873: aload #4
/*     */     //   875: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   878: ifeq -> 984
/*     */     //   881: goto -> 895
/*     */     //   884: ldc2_w 7202382853114930839
/*     */     //   887: lload #7
/*     */     //   889: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   894: athrow
/*     */     //   895: aload_1
/*     */     //   896: iload #6
/*     */     //   898: iflt -> 956
/*     */     //   901: aload #15
/*     */     //   903: ifnonnull -> 956
/*     */     //   906: goto -> 920
/*     */     //   909: ldc2_w 7202382853114930839
/*     */     //   912: lload #7
/*     */     //   914: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   919: athrow
/*     */     //   920: ifnull -> 960
/*     */     //   923: goto -> 937
/*     */     //   926: ldc2_w 7202382853114930839
/*     */     //   929: lload #7
/*     */     //   931: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   936: athrow
/*     */     //   937: aload #25
/*     */     //   939: invokevirtual a : ()Lorg/bukkit/block/BlockFace;
/*     */     //   942: goto -> 956
/*     */     //   945: ldc2_w 7202382853114930839
/*     */     //   948: lload #7
/*     */     //   950: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   955: athrow
/*     */     //   956: aload_1
/*     */     //   957: if_acmpne -> 984
/*     */     //   960: aload #16
/*     */     //   962: aload #24
/*     */     //   964: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   969: pop
/*     */     //   970: goto -> 984
/*     */     //   973: ldc2_w 7202382853114930839
/*     */     //   976: lload #7
/*     */     //   978: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   983: athrow
/*     */     //   984: iinc #22, 1
/*     */     //   987: aload #15
/*     */     //   989: ifnull -> 742
/*     */     //   992: aload #15
/*     */     //   994: iload_3
/*     */     //   995: iflt -> 672
/*     */     //   998: ifnull -> 648
/*     */     //   1001: aload_0
/*     */     //   1002: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   1005: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   1008: aload_0
/*     */     //   1009: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   1012: aload #15
/*     */     //   1014: iload_2
/*     */     //   1015: ifle -> 1107
/*     */     //   1018: ifnonnull -> 1070
/*     */     //   1021: lload #13
/*     */     //   1023: dup2_x1
/*     */     //   1024: pop2
/*     */     //   1025: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*     */     //   1028: ifeq -> 1110
/*     */     //   1031: goto -> 1045
/*     */     //   1034: ldc2_w 7202382853114930839
/*     */     //   1037: lload #7
/*     */     //   1039: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1044: athrow
/*     */     //   1045: aload_0
/*     */     //   1046: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   1049: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   1052: aload_0
/*     */     //   1053: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   1056: goto -> 1070
/*     */     //   1059: ldc2_w 7202382853114930839
/*     */     //   1062: lload #7
/*     */     //   1064: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1069: athrow
/*     */     //   1070: new java/lang/StringBuilder
/*     */     //   1073: dup
/*     */     //   1074: invokespecial <init> : ()V
/*     */     //   1077: sipush #6311
/*     */     //   1080: ldc2_w 5187488711087459446
/*     */     //   1083: lload #7
/*     */     //   1085: lxor
/*     */     //   1086: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   1091: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1094: aload #16
/*     */     //   1096: invokeinterface size : ()I
/*     */     //   1101: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   1104: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1107: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*     */     //   1110: aload #16
/*     */     //   1112: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 54
/*     */     //   #33	-> 73
/*     */     //   #114	-> 106
/*     */     //   #44	-> 161
/*     */     //   #91	-> 173
/*     */     //   #82	-> 204
/*     */     //   #60	-> 261
/*     */     //   #119	-> 268
/*     */     //   #1	-> 291
/*     */     //   #13	-> 396
/*     */     //   #110	-> 417
/*     */     //   #53	-> 427
/*     */     //   #77	-> 450
/*     */     //   #80	-> 469
/*     */     //   #17	-> 474
/*     */     //   #52	-> 508
/*     */     //   #128	-> 566
/*     */     //   #130	-> 636
/*     */     //   #50	-> 639
/*     */     //   #64	-> 670
/*     */     //   #102	-> 717
/*     */     //   #132	-> 729
/*     */     //   #79	-> 756
/*     */     //   #34	-> 773
/*     */     //   #87	-> 811
/*     */     //   #3	-> 834
/*     */     //   #9	-> 939
/*     */     //   #126	-> 960
/*     */     //   #32	-> 984
/*     */     //   #56	-> 992
/*     */     //   #83	-> 1001
/*     */     //   #65	-> 1045
/*     */     //   #48	-> 1110
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   106	126	129	aacinternal/v
/*     */     //   121	143	146	aacinternal/v
/*     */     //   204	225	228	aacinternal/v
/*     */     //   220	242	245	aacinternal/v
/*     */     //   291	311	314	aacinternal/v
/*     */     //   308	335	338	aacinternal/v
/*     */     //   349	363	366	aacinternal/v
/*     */     //   352	380	383	aacinternal/v
/*     */     //   377	399	402	aacinternal/v
/*     */     //   413	436	439	aacinternal/v
/*     */     //   417	455	458	aacinternal/v
/*     */     //   474	494	497	aacinternal/v
/*     */     //   491	528	531	aacinternal/v
/*     */     //   508	549	552	aacinternal/v
/*     */     //   563	577	580	aacinternal/v
/*     */     //   670	677	680	aacinternal/v
/*     */     //   691	699	702	aacinternal/v
/*     */     //   773	790	797	aacinternal/v
/*     */     //   834	854	857	aacinternal/v
/*     */     //   844	881	884	aacinternal/v
/*     */     //   868	906	909	aacinternal/v
/*     */     //   895	923	926	aacinternal/v
/*     */     //   920	942	945	aacinternal/v
/*     */     //   956	970	973	aacinternal/v
/*     */     //   1001	1031	1034	aacinternal/v
/*     */     //   1021	1056	1059	aacinternal/v
/*     */   }
/*     */   
/*     */   public boolean a(char paramChar, int paramInt1, int paramInt2, PlayerInteractEvent paramPlayerInteractEvent) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/ce.m : J
/*     */     //   26: lxor
/*     */     //   27: lstore #5
/*     */     //   29: lload #5
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 55933147221567
/*     */     //   35: lxor
/*     */     //   36: lstore #7
/*     */     //   38: dup2
/*     */     //   39: ldc2_w 131504301861721
/*     */     //   42: lxor
/*     */     //   43: lstore #9
/*     */     //   45: dup2
/*     */     //   46: ldc2_w 10346329203950
/*     */     //   49: lxor
/*     */     //   50: lstore #11
/*     */     //   52: dup2
/*     */     //   53: ldc2_w 112926972903765
/*     */     //   56: lxor
/*     */     //   57: lstore #13
/*     */     //   59: pop2
/*     */     //   60: ldc2_w 1927066816106092556
/*     */     //   63: lload #5
/*     */     //   65: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   70: astore #15
/*     */     //   72: aload #4
/*     */     //   74: aload #15
/*     */     //   76: ifnonnull -> 118
/*     */     //   79: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
/*     */     //   82: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
/*     */     //   85: if_acmpne -> 625
/*     */     //   88: goto -> 102
/*     */     //   91: ldc2_w 1930996843098202031
/*     */     //   94: lload #5
/*     */     //   96: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   101: athrow
/*     */     //   102: aload #4
/*     */     //   104: goto -> 118
/*     */     //   107: ldc2_w 1930996843098202031
/*     */     //   110: lload #5
/*     */     //   112: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   117: athrow
/*     */     //   118: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
/*     */     //   121: ifnull -> 625
/*     */     //   124: aload_0
/*     */     //   125: getfield l : Ljava/util/Set;
/*     */     //   128: aload #4
/*     */     //   130: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
/*     */     //   133: invokeinterface getType : ()Lorg/bukkit/Material;
/*     */     //   138: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   143: aload #15
/*     */     //   145: ifnonnull -> 626
/*     */     //   148: goto -> 162
/*     */     //   151: ldc2_w 1930996843098202031
/*     */     //   154: lload #5
/*     */     //   156: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   161: athrow
/*     */     //   162: ifne -> 625
/*     */     //   165: goto -> 179
/*     */     //   168: ldc2_w 1930996843098202031
/*     */     //   171: lload #5
/*     */     //   173: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   178: athrow
/*     */     //   179: aload #4
/*     */     //   181: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
/*     */     //   184: invokeinterface isLiquid : ()Z
/*     */     //   189: aload #15
/*     */     //   191: ifnonnull -> 488
/*     */     //   194: goto -> 208
/*     */     //   197: ldc2_w 1930996843098202031
/*     */     //   200: lload #5
/*     */     //   202: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   207: athrow
/*     */     //   208: ifeq -> 472
/*     */     //   211: goto -> 225
/*     */     //   214: ldc2_w 1930996843098202031
/*     */     //   217: lload #5
/*     */     //   219: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   224: athrow
/*     */     //   225: aload #4
/*     */     //   227: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
/*     */     //   230: ifnull -> 472
/*     */     //   233: goto -> 247
/*     */     //   236: ldc2_w 1930996843098202031
/*     */     //   239: lload #5
/*     */     //   241: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   246: athrow
/*     */     //   247: getstatic me/konsolas/aac/ce.a : Ljava/util/Set;
/*     */     //   250: aload #4
/*     */     //   252: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
/*     */     //   255: invokevirtual getType : ()Lorg/bukkit/Material;
/*     */     //   258: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   263: aload #15
/*     */     //   265: iload_2
/*     */     //   266: ifle -> 490
/*     */     //   269: ifnonnull -> 488
/*     */     //   272: goto -> 286
/*     */     //   275: ldc2_w 1930996843098202031
/*     */     //   278: lload #5
/*     */     //   280: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   285: athrow
/*     */     //   286: ifeq -> 472
/*     */     //   289: goto -> 303
/*     */     //   292: ldc2_w 1930996843098202031
/*     */     //   295: lload #5
/*     */     //   297: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   302: athrow
/*     */     //   303: aload_0
/*     */     //   304: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   307: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   310: aload_0
/*     */     //   311: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   314: lload #13
/*     */     //   316: dup2_x1
/*     */     //   317: pop2
/*     */     //   318: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*     */     //   321: aload #15
/*     */     //   323: ifnonnull -> 471
/*     */     //   326: goto -> 340
/*     */     //   329: ldc2_w 1930996843098202031
/*     */     //   332: lload #5
/*     */     //   334: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   339: athrow
/*     */     //   340: ifeq -> 470
/*     */     //   343: goto -> 357
/*     */     //   346: ldc2_w 1930996843098202031
/*     */     //   349: lload #5
/*     */     //   351: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   356: athrow
/*     */     //   357: aload_0
/*     */     //   358: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   361: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   364: aload_0
/*     */     //   365: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   368: new java/lang/StringBuilder
/*     */     //   371: dup
/*     */     //   372: invokespecial <init> : ()V
/*     */     //   375: sipush #14999
/*     */     //   378: ldc2_w 1159705223652136829
/*     */     //   381: lload #5
/*     */     //   383: lxor
/*     */     //   384: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   389: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   392: aload #4
/*     */     //   394: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
/*     */     //   397: invokevirtual getType : ()Lorg/bukkit/Material;
/*     */     //   400: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   403: sipush #26478
/*     */     //   406: ldc2_w 8984038629223205505
/*     */     //   409: lload #5
/*     */     //   411: lxor
/*     */     //   412: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   420: aload #4
/*     */     //   422: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
/*     */     //   425: invokeinterface getType : ()Lorg/bukkit/Material;
/*     */     //   430: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   433: sipush #30513
/*     */     //   436: ldc2_w 8209138414480038618
/*     */     //   439: lload #5
/*     */     //   441: lxor
/*     */     //   442: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   447: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   450: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   453: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*     */     //   456: goto -> 470
/*     */     //   459: ldc2_w 1930996843098202031
/*     */     //   462: lload #5
/*     */     //   464: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   469: athrow
/*     */     //   470: iconst_0
/*     */     //   471: ireturn
/*     */     //   472: aload_0
/*     */     //   473: aload #4
/*     */     //   475: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
/*     */     //   478: aload #4
/*     */     //   480: invokevirtual getBlockFace : ()Lorg/bukkit/block/BlockFace;
/*     */     //   483: lload #11
/*     */     //   485: invokespecial a : (Lorg/bukkit/block/Block;Lorg/bukkit/block/BlockFace;J)Z
/*     */     //   488: aload #15
/*     */     //   490: ifnonnull -> 626
/*     */     //   493: ifeq -> 625
/*     */     //   496: goto -> 510
/*     */     //   499: ldc2_w 1930996843098202031
/*     */     //   502: lload #5
/*     */     //   504: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   509: athrow
/*     */     //   510: aload_0
/*     */     //   511: getfield k : Lme/konsolas/aac/O;
/*     */     //   514: fconst_1
/*     */     //   515: lload #9
/*     */     //   517: invokevirtual a : (FJ)Z
/*     */     //   520: aload #15
/*     */     //   522: ifnonnull -> 626
/*     */     //   525: goto -> 539
/*     */     //   528: ldc2_w 1930996843098202031
/*     */     //   531: lload #5
/*     */     //   533: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   538: athrow
/*     */     //   539: ifeq -> 625
/*     */     //   542: goto -> 556
/*     */     //   545: ldc2_w 1930996843098202031
/*     */     //   548: lload #5
/*     */     //   550: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   555: athrow
/*     */     //   556: aload #4
/*     */     //   558: invokevirtual isBlockInHand : ()Z
/*     */     //   561: ifeq -> 602
/*     */     //   564: goto -> 578
/*     */     //   567: ldc2_w 1930996843098202031
/*     */     //   570: lload #5
/*     */     //   572: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   577: athrow
/*     */     //   578: ldc2_w 1928614470413670060
/*     */     //   581: lload #5
/*     */     //   583: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*     */     //   588: goto -> 612
/*     */     //   591: ldc2_w 1930996843098202031
/*     */     //   594: lload #5
/*     */     //   596: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   601: athrow
/*     */     //   602: ldc2_w 1920989772624900284
/*     */     //   605: lload #5
/*     */     //   607: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*     */     //   612: astore #16
/*     */     //   614: aload_0
/*     */     //   615: aload #16
/*     */     //   617: fconst_1
/*     */     //   618: lload #7
/*     */     //   620: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*     */     //   623: iconst_1
/*     */     //   624: ireturn
/*     */     //   625: iconst_0
/*     */     //   626: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 72
/*     */     //   #88	-> 118
/*     */     //   #106	-> 179
/*     */     //   #68	-> 303
/*     */     //   #85	-> 357
/*     */     //   #107	-> 422
/*     */     //   #98	-> 453
/*     */     //   #8	-> 470
/*     */     //   #31	-> 472
/*     */     //   #76	-> 510
/*     */     //   #67	-> 556
/*     */     //   #43	-> 614
/*     */     //   #121	-> 623
/*     */     //   #24	-> 625
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   72	88	91	aacinternal/v
/*     */     //   79	104	107	aacinternal/v
/*     */     //   118	148	151	aacinternal/v
/*     */     //   124	165	168	aacinternal/v
/*     */     //   162	194	197	aacinternal/v
/*     */     //   179	211	214	aacinternal/v
/*     */     //   208	233	236	aacinternal/v
/*     */     //   225	272	275	aacinternal/v
/*     */     //   247	289	292	aacinternal/v
/*     */     //   286	326	329	aacinternal/v
/*     */     //   303	343	346	aacinternal/v
/*     */     //   340	456	459	aacinternal/v
/*     */     //   488	496	499	aacinternal/v
/*     */     //   493	525	528	aacinternal/v
/*     */     //   510	542	545	aacinternal/v
/*     */     //   539	564	567	aacinternal/v
/*     */     //   556	591	591	aacinternal/v
/*     */   }
/*     */   
/*     */   public ce(long paramLong, AAC paramAAC, Player paramPlayer) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/ce.m : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 81963085529472
/*     */     //   11: lxor
/*     */     //   12: dup2
/*     */     //   13: bipush #48
/*     */     //   15: lushr
/*     */     //   16: l2i
/*     */     //   17: istore #5
/*     */     //   19: dup2
/*     */     //   20: bipush #16
/*     */     //   22: lshl
/*     */     //   23: bipush #48
/*     */     //   25: lushr
/*     */     //   26: l2i
/*     */     //   27: istore #6
/*     */     //   29: dup2
/*     */     //   30: bipush #32
/*     */     //   32: lshl
/*     */     //   33: bipush #32
/*     */     //   35: lushr
/*     */     //   36: l2i
/*     */     //   37: istore #7
/*     */     //   39: pop2
/*     */     //   40: dup2
/*     */     //   41: ldc2_w 76195595751108
/*     */     //   44: lxor
/*     */     //   45: lstore #8
/*     */     //   47: pop2
/*     */     //   48: aload_0
/*     */     //   49: iload #5
/*     */     //   51: i2s
/*     */     //   52: iload #6
/*     */     //   54: i2s
/*     */     //   55: aload_3
/*     */     //   56: aload #4
/*     */     //   58: iload #7
/*     */     //   60: sipush #151
/*     */     //   63: ldc2_w 45352231589819836
/*     */     //   66: lload_1
/*     */     //   67: lxor
/*     */     //   68: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   73: invokespecial <init> : (SSLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;ILjava/lang/String;)V
/*     */     //   76: ldc2_w -4435925229409304382
/*     */     //   79: lload_1
/*     */     //   80: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   85: aload_0
/*     */     //   86: ldc org/bukkit/Material
/*     */     //   88: invokestatic noneOf : (Ljava/lang/Class;)Ljava/util/EnumSet;
/*     */     //   91: putfield l : Ljava/util/Set;
/*     */     //   94: aload_0
/*     */     //   95: new me/konsolas/aac/fa
/*     */     //   98: dup
/*     */     //   99: iconst_5
/*     */     //   100: invokespecial <init> : (I)V
/*     */     //   103: putfield h : Lme/konsolas/aac/fa;
/*     */     //   106: aload_0
/*     */     //   107: aload_0
/*     */     //   108: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*     */     //   111: lload #8
/*     */     //   113: dup2_x1
/*     */     //   114: pop2
/*     */     //   115: sipush #30418
/*     */     //   118: ldc2_w 4319447905573749746
/*     */     //   121: lload_1
/*     */     //   122: lxor
/*     */     //   123: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   128: invokestatic a : (JLorg/bukkit/configuration/ConfigurationSection;Ljava/lang/String;)Lme/konsolas/aac/O;
/*     */     //   131: putfield k : Lme/konsolas/aac/O;
/*     */     //   134: astore #10
/*     */     //   136: aload_0
/*     */     //   137: aload_0
/*     */     //   138: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*     */     //   141: sipush #29412
/*     */     //   144: ldc2_w 3456249255379879880
/*     */     //   147: lload_1
/*     */     //   148: lxor
/*     */     //   149: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   154: invokeinterface getDouble : (Ljava/lang/String;)D
/*     */     //   159: putfield f : D
/*     */     //   162: aload_0
/*     */     //   163: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*     */     //   166: sipush #17753
/*     */     //   169: ldc2_w 6571257528510017652
/*     */     //   172: lload_1
/*     */     //   173: lxor
/*     */     //   174: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   179: invokeinterface getStringList : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   184: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   189: astore #11
/*     */     //   191: aload #11
/*     */     //   193: invokeinterface hasNext : ()Z
/*     */     //   198: ifeq -> 237
/*     */     //   201: aload #11
/*     */     //   203: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   208: checkcast java/lang/String
/*     */     //   211: astore #12
/*     */     //   213: aload #12
/*     */     //   215: invokestatic matchMaterial : (Ljava/lang/String;)Lorg/bukkit/Material;
/*     */     //   218: astore #13
/*     */     //   220: aload_0
/*     */     //   221: getfield l : Ljava/util/Set;
/*     */     //   224: aload #13
/*     */     //   226: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   231: pop
/*     */     //   232: aload #10
/*     */     //   234: ifnull -> 191
/*     */     //   237: lload_1
/*     */     //   238: lconst_0
/*     */     //   239: lcmp
/*     */     //   240: iflt -> 294
/*     */     //   243: ldc2_w -4454529816747407731
/*     */     //   246: lload_1
/*     */     //   247: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   252: lload_1
/*     */     //   253: lconst_0
/*     */     //   254: lcmp
/*     */     //   255: iflt -> 208
/*     */     //   258: ifnull -> 307
/*     */     //   261: ldc '닎?墡衫墚'
/*     */     //   263: invokevirtual toCharArray : ()[C
/*     */     //   266: dup
/*     */     //   267: dup
/*     */     //   268: iconst_4
/*     */     //   269: dup_x1
/*     */     //   270: caload
/*     */     //   271: sipush #24447
/*     */     //   274: ixor
/*     */     //   275: i2c
/*     */     //   276: castore
/*     */     //   277: sipush #27755
/*     */     //   280: iconst_0
/*     */     //   281: iconst_3
/*     */     //   282: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   285: ldc2_w -4432249319210669045
/*     */     //   288: lload_1
/*     */     //   289: <illegal opcode> w : (Ljava/lang/String;JJ)V
/*     */     //   294: goto -> 307
/*     */     //   297: ldc2_w -4466871629709113503
/*     */     //   300: lload_1
/*     */     //   301: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   306: athrow
/*     */     //   307: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 48
/*     */     //   #26	-> 85
/*     */     //   #116	-> 94
/*     */     //   #19	-> 106
/*     */     //   #45	-> 136
/*     */     //   #40	-> 162
/*     */     //   #131	-> 213
/*     */     //   #73	-> 220
/*     */     //   #109	-> 232
/*     */     //   #42	-> 237
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   237	294	297	aacinternal/v
/*     */   }
/*     */   
/*     */   private boolean a(Block paramBlock, BlockFace paramBlockFace, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/ce.m : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 104687531088604
/*     */     //   11: lxor
/*     */     //   12: dup2
/*     */     //   13: bipush #56
/*     */     //   15: lushr
/*     */     //   16: l2i
/*     */     //   17: istore #5
/*     */     //   19: dup2
/*     */     //   20: bipush #8
/*     */     //   22: lshl
/*     */     //   23: bipush #32
/*     */     //   25: lushr
/*     */     //   26: l2i
/*     */     //   27: istore #6
/*     */     //   29: dup2
/*     */     //   30: bipush #40
/*     */     //   32: lshl
/*     */     //   33: bipush #40
/*     */     //   35: lushr
/*     */     //   36: l2i
/*     */     //   37: istore #7
/*     */     //   39: pop2
/*     */     //   40: dup2
/*     */     //   41: ldc2_w 101457009172519
/*     */     //   44: lxor
/*     */     //   45: dup2
/*     */     //   46: bipush #32
/*     */     //   48: lushr
/*     */     //   49: l2i
/*     */     //   50: istore #8
/*     */     //   52: dup2
/*     */     //   53: bipush #32
/*     */     //   55: lshl
/*     */     //   56: bipush #48
/*     */     //   58: lushr
/*     */     //   59: l2i
/*     */     //   60: istore #9
/*     */     //   62: dup2
/*     */     //   63: bipush #48
/*     */     //   65: lshl
/*     */     //   66: bipush #48
/*     */     //   68: lushr
/*     */     //   69: l2i
/*     */     //   70: istore #10
/*     */     //   72: pop2
/*     */     //   73: pop2
/*     */     //   74: ldc2_w -1252467280455947220
/*     */     //   77: lload_3
/*     */     //   78: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   83: aload_1
/*     */     //   84: invokeinterface getLocation : ()Lorg/bukkit/Location;
/*     */     //   89: astore #12
/*     */     //   91: aload #12
/*     */     //   93: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
/*     */     //   96: invokevirtual toBlockVector : ()Lorg/bukkit/util/BlockVector;
/*     */     //   99: astore #13
/*     */     //   101: astore #11
/*     */     //   103: getstatic me/konsolas/aac/mF.POSES : Ljava/util/List;
/*     */     //   106: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   111: astore #14
/*     */     //   113: aload #14
/*     */     //   115: invokeinterface hasNext : ()Z
/*     */     //   120: ifeq -> 240
/*     */     //   123: aload #14
/*     */     //   125: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   130: checkcast me/konsolas/aac/mF
/*     */     //   133: astore #15
/*     */     //   135: new org/bukkit/util/Vector
/*     */     //   138: dup
/*     */     //   139: fconst_0
/*     */     //   140: aload #15
/*     */     //   142: aload_0
/*     */     //   143: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   146: aload_0
/*     */     //   147: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   150: iload #5
/*     */     //   152: i2b
/*     */     //   153: swap
/*     */     //   154: iload #6
/*     */     //   156: swap
/*     */     //   157: iload #7
/*     */     //   159: invokevirtual a : (BILorg/bukkit/entity/Player;I)Lme/konsolas/aac/kP;
/*     */     //   162: invokevirtual a : (Lme/konsolas/aac/kP;)F
/*     */     //   165: fconst_0
/*     */     //   166: invokespecial <init> : (FFF)V
/*     */     //   169: astore #16
/*     */     //   171: aload_0
/*     */     //   172: aload_1
/*     */     //   173: iload #8
/*     */     //   175: aload_2
/*     */     //   176: aload #13
/*     */     //   178: aload #16
/*     */     //   180: iload #9
/*     */     //   182: i2c
/*     */     //   183: iload #10
/*     */     //   185: invokespecial a : (Lorg/bukkit/block/Block;ILorg/bukkit/block/BlockFace;Lorg/bukkit/util/BlockVector;Lorg/bukkit/util/Vector;CI)Z
/*     */     //   188: aload #11
/*     */     //   190: lload_3
/*     */     //   191: lconst_0
/*     */     //   192: lcmp
/*     */     //   193: ifle -> 201
/*     */     //   196: ifnonnull -> 241
/*     */     //   199: aload #11
/*     */     //   201: ifnonnull -> 234
/*     */     //   204: goto -> 217
/*     */     //   207: ldc2_w -1230536244746179697
/*     */     //   210: lload_3
/*     */     //   211: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   216: athrow
/*     */     //   217: ifne -> 235
/*     */     //   220: goto -> 233
/*     */     //   223: ldc2_w -1230536244746179697
/*     */     //   226: lload_3
/*     */     //   227: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   232: athrow
/*     */     //   233: iconst_0
/*     */     //   234: ireturn
/*     */     //   235: aload #11
/*     */     //   237: ifnull -> 113
/*     */     //   240: iconst_1
/*     */     //   241: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #96	-> 83
/*     */     //   #22	-> 91
/*     */     //   #11	-> 103
/*     */     //   #10	-> 135
/*     */     //   #117	-> 171
/*     */     //   #127	-> 233
/*     */     //   #72	-> 235
/*     */     //   #2	-> 240
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   171	204	207	aacinternal/v
/*     */     //   199	220	223	aacinternal/v
/*     */   }
/*     */   
/*     */   private static float a(Vector paramVector1, Vector paramVector2) {
/* 105 */     Vector vector1 = paramVector1.clone().setY(0), vector2 = paramVector2.clone().setY(0);
/*     */     double d3 = vector1.dot(vector2) / vector1.length() * vector2.length();
/*     */     d3 = Math.min(Math.max(d3, -1.0D), 1.0D);
/*     */     double d1 = Math.acos(d3);
/*     */     d3 = Math.sqrt(paramVector1.getX() * paramVector1.getX() + paramVector1.getZ() * paramVector1.getZ());
/*     */     double d4 = Math.sqrt(paramVector2.getX() * paramVector2.getX() + paramVector2.getZ() * paramVector2.getZ());
/*     */     double d2 = Math.abs(Math.atan(-paramVector1.getY() / d3) - Math.atan(-paramVector2.getY() / d4));
/*     */     return (float)Math.sqrt(d1 * d1 + d2 * d2);
/*     */   }
/*     */   
/*     */   public boolean a(Block paramBlock, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/ce.m : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 108783782049357
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 43658254635819
/*     */     //   18: lxor
/*     */     //   19: lstore #6
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 98157999840412
/*     */     //   25: lxor
/*     */     //   26: lstore #8
/*     */     //   28: pop2
/*     */     //   29: ldc2_w -6715991699153035138
/*     */     //   32: lload_2
/*     */     //   33: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   38: astore #10
/*     */     //   40: aload_0
/*     */     //   41: getfield l : Ljava/util/Set;
/*     */     //   44: aload_1
/*     */     //   45: invokeinterface getType : ()Lorg/bukkit/Material;
/*     */     //   50: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   55: aload #10
/*     */     //   57: ifnonnull -> 191
/*     */     //   60: ifne -> 190
/*     */     //   63: goto -> 76
/*     */     //   66: ldc2_w -6719907982585075747
/*     */     //   69: lload_2
/*     */     //   70: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   75: athrow
/*     */     //   76: aload_0
/*     */     //   77: aload_1
/*     */     //   78: aconst_null
/*     */     //   79: lload #8
/*     */     //   81: invokespecial a : (Lorg/bukkit/block/Block;Lorg/bukkit/block/BlockFace;J)Z
/*     */     //   84: aload #10
/*     */     //   86: ifnonnull -> 191
/*     */     //   89: goto -> 102
/*     */     //   92: ldc2_w -6719907982585075747
/*     */     //   95: lload_2
/*     */     //   96: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   101: athrow
/*     */     //   102: ifeq -> 190
/*     */     //   105: goto -> 118
/*     */     //   108: ldc2_w -6719907982585075747
/*     */     //   111: lload_2
/*     */     //   112: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   117: athrow
/*     */     //   118: aload_0
/*     */     //   119: getfield k : Lme/konsolas/aac/O;
/*     */     //   122: fconst_1
/*     */     //   123: lload #6
/*     */     //   125: invokevirtual a : (FJ)Z
/*     */     //   128: aload #10
/*     */     //   130: ifnonnull -> 191
/*     */     //   133: goto -> 146
/*     */     //   136: ldc2_w -6719907982585075747
/*     */     //   139: lload_2
/*     */     //   140: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   145: athrow
/*     */     //   146: ifeq -> 190
/*     */     //   149: goto -> 162
/*     */     //   152: ldc2_w -6719907982585075747
/*     */     //   155: lload_2
/*     */     //   156: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   161: athrow
/*     */     //   162: aload_0
/*     */     //   163: ldc2_w -6721038855919898601
/*     */     //   166: lload_2
/*     */     //   167: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*     */     //   172: fconst_1
/*     */     //   173: lload #4
/*     */     //   175: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*     */     //   178: iconst_1
/*     */     //   179: ireturn
/*     */     //   180: ldc2_w -6719907982585075747
/*     */     //   183: lload_2
/*     */     //   184: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   189: athrow
/*     */     //   190: iconst_0
/*     */     //   191: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 40
/*     */     //   #125	-> 118
/*     */     //   #118	-> 162
/*     */     //   #55	-> 178
/*     */     //   #15	-> 190
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   40	63	66	aacinternal/v
/*     */     //   60	89	92	aacinternal/v
/*     */     //   76	105	108	aacinternal/v
/*     */     //   102	133	136	aacinternal/v
/*     */     //   118	149	152	aacinternal/v
/*     */     //   146	180	180	aacinternal/v
/*     */   }
/*     */   
/*     */   private boolean a(Block paramBlock, int paramInt1, BlockFace paramBlockFace, BlockVector paramBlockVector, Vector paramVector, char paramChar, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload #6
/*     */     //   7: i2l
/*     */     //   8: bipush #48
/*     */     //   10: lshl
/*     */     //   11: bipush #32
/*     */     //   13: lushr
/*     */     //   14: lor
/*     */     //   15: iload #7
/*     */     //   17: i2l
/*     */     //   18: bipush #48
/*     */     //   20: lshl
/*     */     //   21: bipush #48
/*     */     //   23: lushr
/*     */     //   24: lor
/*     */     //   25: getstatic me/konsolas/aac/ce.m : J
/*     */     //   28: lxor
/*     */     //   29: lstore #8
/*     */     //   31: lload #8
/*     */     //   33: dup2
/*     */     //   34: ldc2_w 56738155857308
/*     */     //   37: lxor
/*     */     //   38: lstore #10
/*     */     //   40: dup2
/*     */     //   41: ldc2_w 31352658554175
/*     */     //   44: lxor
/*     */     //   45: dup2
/*     */     //   46: bipush #32
/*     */     //   48: lushr
/*     */     //   49: l2i
/*     */     //   50: istore #12
/*     */     //   52: dup2
/*     */     //   53: bipush #32
/*     */     //   55: lshl
/*     */     //   56: bipush #48
/*     */     //   58: lushr
/*     */     //   59: l2i
/*     */     //   60: istore #13
/*     */     //   62: dup2
/*     */     //   63: bipush #48
/*     */     //   65: lshl
/*     */     //   66: bipush #48
/*     */     //   68: lushr
/*     */     //   69: l2i
/*     */     //   70: istore #14
/*     */     //   72: pop2
/*     */     //   73: pop2
/*     */     //   74: ldc2_w 2195227885659839685
/*     */     //   77: lload #8
/*     */     //   79: <illegal opcode> w : (JJ)Ljava/lang/String;
/*     */     //   84: astore #15
/*     */     //   86: aload_0
/*     */     //   87: getfield h : Lme/konsolas/aac/fa;
/*     */     //   90: aload #15
/*     */     //   92: ifnonnull -> 304
/*     */     //   95: invokevirtual isEmpty : ()Z
/*     */     //   98: ifeq -> 289
/*     */     //   101: goto -> 115
/*     */     //   104: ldc2_w 2163155311014173542
/*     */     //   107: lload #8
/*     */     //   109: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   114: athrow
/*     */     //   115: aload_0
/*     */     //   116: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   119: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   122: aload_0
/*     */     //   123: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   126: lload #10
/*     */     //   128: dup2_x1
/*     */     //   129: pop2
/*     */     //   130: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*     */     //   133: aload #15
/*     */     //   135: ifnonnull -> 288
/*     */     //   138: goto -> 152
/*     */     //   141: ldc2_w 2163155311014173542
/*     */     //   144: lload #8
/*     */     //   146: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   151: athrow
/*     */     //   152: ifeq -> 287
/*     */     //   155: goto -> 169
/*     */     //   158: ldc2_w 2163155311014173542
/*     */     //   161: lload #8
/*     */     //   163: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   168: athrow
/*     */     //   169: aload_0
/*     */     //   170: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   173: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   176: aload_0
/*     */     //   177: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   180: new java/lang/StringBuilder
/*     */     //   183: dup
/*     */     //   184: invokespecial <init> : ()V
/*     */     //   187: sipush #15949
/*     */     //   190: ldc2_w 8113128971150874468
/*     */     //   193: lload #8
/*     */     //   195: lxor
/*     */     //   196: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   204: aload_1
/*     */     //   205: invokeinterface getType : ()Lorg/bukkit/Material;
/*     */     //   210: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   213: ldc_w '蠯㶮'
/*     */     //   216: invokevirtual toCharArray : ()[C
/*     */     //   219: dup
/*     */     //   220: dup
/*     */     //   221: iconst_0
/*     */     //   222: dup_x1
/*     */     //   223: caload
/*     */     //   224: sipush #7098
/*     */     //   227: ixor
/*     */     //   228: i2c
/*     */     //   229: castore
/*     */     //   230: sipush #21319
/*     */     //   233: iconst_1
/*     */     //   234: iconst_2
/*     */     //   235: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   241: aload_3
/*     */     //   242: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   245: sipush #24437
/*     */     //   248: ldc2_w 8789846921836443220
/*     */     //   251: lload #8
/*     */     //   253: lxor
/*     */     //   254: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   262: aload #4
/*     */     //   264: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   267: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   270: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*     */     //   273: goto -> 287
/*     */     //   276: ldc2_w 2163155311014173542
/*     */     //   279: lload #8
/*     */     //   281: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   286: athrow
/*     */     //   287: iconst_0
/*     */     //   288: ireturn
/*     */     //   289: aload_0
/*     */     //   290: aload_3
/*     */     //   291: iload #12
/*     */     //   293: iload #13
/*     */     //   295: aload #4
/*     */     //   297: aload #5
/*     */     //   299: iload #14
/*     */     //   301: invokespecial a : (Lorg/bukkit/block/BlockFace;IILorg/bukkit/util/BlockVector;Lorg/bukkit/util/Vector;I)Ljava/util/Collection;
/*     */     //   304: astore #16
/*     */     //   306: aload #16
/*     */     //   308: invokeinterface isEmpty : ()Z
/*     */     //   313: aload #15
/*     */     //   315: iload #7
/*     */     //   317: iflt -> 374
/*     */     //   320: ifnonnull -> 372
/*     */     //   323: ifeq -> 514
/*     */     //   326: goto -> 340
/*     */     //   329: ldc2_w 2163155311014173542
/*     */     //   332: lload #8
/*     */     //   334: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   339: athrow
/*     */     //   340: aload_0
/*     */     //   341: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   344: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   347: aload_0
/*     */     //   348: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   351: lload #10
/*     */     //   353: dup2_x1
/*     */     //   354: pop2
/*     */     //   355: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*     */     //   358: goto -> 372
/*     */     //   361: ldc2_w 2163155311014173542
/*     */     //   364: lload #8
/*     */     //   366: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   371: athrow
/*     */     //   372: aload #15
/*     */     //   374: ifnonnull -> 513
/*     */     //   377: ifeq -> 512
/*     */     //   380: goto -> 394
/*     */     //   383: ldc2_w 2163155311014173542
/*     */     //   386: lload #8
/*     */     //   388: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   393: athrow
/*     */     //   394: aload_0
/*     */     //   395: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   398: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   401: aload_0
/*     */     //   402: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   405: new java/lang/StringBuilder
/*     */     //   408: dup
/*     */     //   409: invokespecial <init> : ()V
/*     */     //   412: sipush #25950
/*     */     //   415: ldc2_w 8521757574771969142
/*     */     //   418: lload #8
/*     */     //   420: lxor
/*     */     //   421: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   429: aload_1
/*     */     //   430: invokeinterface getType : ()Lorg/bukkit/Material;
/*     */     //   435: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   438: ldc_w 'ᐢⵁ'
/*     */     //   441: invokevirtual toCharArray : ()[C
/*     */     //   444: dup
/*     */     //   445: dup
/*     */     //   446: iconst_0
/*     */     //   447: dup_x1
/*     */     //   448: caload
/*     */     //   449: sipush #30230
/*     */     //   452: ixor
/*     */     //   453: i2c
/*     */     //   454: castore
/*     */     //   455: sipush #15649
/*     */     //   458: iconst_1
/*     */     //   459: iconst_0
/*     */     //   460: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   463: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   466: aload_3
/*     */     //   467: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   470: sipush #19398
/*     */     //   473: ldc2_w 7182947329034953451
/*     */     //   476: lload #8
/*     */     //   478: lxor
/*     */     //   479: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   484: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   487: aload #4
/*     */     //   489: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   492: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   495: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*     */     //   498: goto -> 512
/*     */     //   501: ldc2_w 2163155311014173542
/*     */     //   504: lload #8
/*     */     //   506: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   511: athrow
/*     */     //   512: iconst_1
/*     */     //   513: ireturn
/*     */     //   514: ldc_w Infinity
/*     */     //   517: fstore #17
/*     */     //   519: aload #16
/*     */     //   521: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   526: astore #18
/*     */     //   528: aload #18
/*     */     //   530: invokeinterface hasNext : ()Z
/*     */     //   535: ifeq -> 701
/*     */     //   538: aload #18
/*     */     //   540: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   545: checkcast org/bukkit/util/Vector
/*     */     //   548: astore #19
/*     */     //   550: aload_0
/*     */     //   551: aload #15
/*     */     //   553: ifnonnull -> 707
/*     */     //   556: getfield h : Lme/konsolas/aac/fa;
/*     */     //   559: invokevirtual iterator : ()Ljava/util/Iterator;
/*     */     //   562: astore #20
/*     */     //   564: aload #20
/*     */     //   566: invokeinterface hasNext : ()Z
/*     */     //   571: ifeq -> 696
/*     */     //   574: aload #20
/*     */     //   576: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   581: checkcast org/bukkit/Location
/*     */     //   584: astore #21
/*     */     //   586: aload #21
/*     */     //   588: iload #6
/*     */     //   590: ifle -> 545
/*     */     //   593: aload #15
/*     */     //   595: ifnonnull -> 545
/*     */     //   598: aload #15
/*     */     //   600: iload_2
/*     */     //   601: iflt -> 595
/*     */     //   604: ifnonnull -> 631
/*     */     //   607: ifnonnull -> 629
/*     */     //   610: goto -> 624
/*     */     //   613: ldc2_w 2163155311014173542
/*     */     //   616: lload #8
/*     */     //   618: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   623: athrow
/*     */     //   624: iload #7
/*     */     //   626: ifge -> 564
/*     */     //   629: aload #21
/*     */     //   631: invokevirtual getDirection : ()Lorg/bukkit/util/Vector;
/*     */     //   634: aload #19
/*     */     //   636: invokestatic a : (Lorg/bukkit/util/Vector;Lorg/bukkit/util/Vector;)F
/*     */     //   639: fstore #22
/*     */     //   641: fload #22
/*     */     //   643: aload #15
/*     */     //   645: ifnonnull -> 684
/*     */     //   648: fload #17
/*     */     //   650: fcmpg
/*     */     //   651: ifge -> 686
/*     */     //   654: goto -> 668
/*     */     //   657: ldc2_w 2163155311014173542
/*     */     //   660: lload #8
/*     */     //   662: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   667: athrow
/*     */     //   668: fload #22
/*     */     //   670: goto -> 684
/*     */     //   673: ldc2_w 2163155311014173542
/*     */     //   676: lload #8
/*     */     //   678: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   683: athrow
/*     */     //   684: fstore #17
/*     */     //   686: aload #15
/*     */     //   688: iload #7
/*     */     //   690: ifle -> 698
/*     */     //   693: ifnull -> 564
/*     */     //   696: aload #15
/*     */     //   698: ifnull -> 528
/*     */     //   701: iload #6
/*     */     //   703: iflt -> 915
/*     */     //   706: aload_0
/*     */     //   707: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   710: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   713: aload_0
/*     */     //   714: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   717: lload #10
/*     */     //   719: dup2_x1
/*     */     //   720: pop2
/*     */     //   721: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*     */     //   724: aload #15
/*     */     //   726: iload #6
/*     */     //   728: iflt -> 891
/*     */     //   731: ifnonnull -> 889
/*     */     //   734: ifeq -> 881
/*     */     //   737: goto -> 751
/*     */     //   740: ldc2_w 2163155311014173542
/*     */     //   743: lload #8
/*     */     //   745: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   750: athrow
/*     */     //   751: aload_0
/*     */     //   752: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*     */     //   755: invokevirtual a : ()Lme/konsolas/aac/w;
/*     */     //   758: aload_0
/*     */     //   759: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*     */     //   762: new java/lang/StringBuilder
/*     */     //   765: dup
/*     */     //   766: invokespecial <init> : ()V
/*     */     //   769: sipush #25325
/*     */     //   772: ldc2_w 8165414644648676290
/*     */     //   775: lload #8
/*     */     //   777: lxor
/*     */     //   778: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   783: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   786: aload_1
/*     */     //   787: invokeinterface getType : ()Lorg/bukkit/Material;
/*     */     //   792: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   795: ldc_w '驟爙'
/*     */     //   798: invokevirtual toCharArray : ()[C
/*     */     //   801: dup
/*     */     //   802: dup
/*     */     //   803: iconst_0
/*     */     //   804: dup_x1
/*     */     //   805: caload
/*     */     //   806: sipush #20327
/*     */     //   809: ixor
/*     */     //   810: i2c
/*     */     //   811: castore
/*     */     //   812: sipush #9077
/*     */     //   815: iconst_1
/*     */     //   816: iconst_3
/*     */     //   817: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   820: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   823: aload_3
/*     */     //   824: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   827: sipush #19398
/*     */     //   830: ldc2_w 7182947329034953451
/*     */     //   833: lload #8
/*     */     //   835: lxor
/*     */     //   836: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   841: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   844: aload #4
/*     */     //   846: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   849: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   852: iconst_1
/*     */     //   853: anewarray java/lang/Object
/*     */     //   856: dup
/*     */     //   857: iconst_0
/*     */     //   858: fload #17
/*     */     //   860: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   863: aastore
/*     */     //   864: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   867: goto -> 881
/*     */     //   870: ldc2_w 2163155311014173542
/*     */     //   873: lload #8
/*     */     //   875: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   880: athrow
/*     */     //   881: fload #17
/*     */     //   883: f2d
/*     */     //   884: aload_0
/*     */     //   885: getfield f : D
/*     */     //   888: dcmpl
/*     */     //   889: aload #15
/*     */     //   891: ifnonnull -> 912
/*     */     //   894: ifle -> 915
/*     */     //   897: goto -> 911
/*     */     //   900: ldc2_w 2163155311014173542
/*     */     //   903: lload #8
/*     */     //   905: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   910: athrow
/*     */     //   911: iconst_1
/*     */     //   912: goto -> 916
/*     */     //   915: iconst_0
/*     */     //   916: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 86
/*     */     //   #115	-> 115
/*     */     //   #124	-> 169
/*     */     //   #47	-> 205
/*     */     //   #25	-> 270
/*     */     //   #29	-> 287
/*     */     //   #95	-> 289
/*     */     //   #122	-> 306
/*     */     //   #39	-> 340
/*     */     //   #36	-> 394
/*     */     //   #69	-> 430
/*     */     //   #18	-> 495
/*     */     //   #93	-> 512
/*     */     //   #41	-> 514
/*     */     //   #70	-> 519
/*     */     //   #113	-> 550
/*     */     //   #38	-> 586
/*     */     //   #12	-> 629
/*     */     //   #92	-> 641
/*     */     //   #23	-> 686
/*     */     //   #84	-> 696
/*     */     //   #59	-> 701
/*     */     //   #16	-> 751
/*     */     //   #6	-> 787
/*     */     //   #100	-> 864
/*     */     //   #49	-> 881
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   86	101	104	aacinternal/v
/*     */     //   95	138	141	aacinternal/v
/*     */     //   115	155	158	aacinternal/v
/*     */     //   152	273	276	aacinternal/v
/*     */     //   306	326	329	aacinternal/v
/*     */     //   323	358	361	aacinternal/v
/*     */     //   372	380	383	aacinternal/v
/*     */     //   377	498	501	aacinternal/v
/*     */     //   598	610	613	aacinternal/v
/*     */     //   641	654	657	aacinternal/v
/*     */     //   648	670	673	aacinternal/v
/*     */     //   707	737	740	aacinternal/v
/*     */     //   734	867	870	aacinternal/v
/*     */     //   889	897	900	aacinternal/v
/*     */   }
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: ldc2_w 891098825621589644
/*     */     //   3: ldc2_w -2609262136860274104
/*     */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*     */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*     */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*     */     //   15: ldc2_w 140541770539877
/*     */     //   18: invokeinterface a : (J)J
/*     */     //   23: putstatic me/konsolas/aac/ce.m : J
/*     */     //   26: getstatic me/konsolas/aac/ce.m : J
/*     */     //   29: ldc2_w 96824059028570
/*     */     //   32: lxor
/*     */     //   33: lstore #9
/*     */     //   35: new java/util/HashMap
/*     */     //   38: dup
/*     */     //   39: bipush #13
/*     */     //   41: invokespecial <init> : (I)V
/*     */     //   44: putstatic me/konsolas/aac/ce.p : Ljava/util/Map;
/*     */     //   47: ldc_w 'শ飫䒖鱂⍓펁ⵘ뭸메鉥ꚓ⣄쯰ᛚꓜ锌単鉯瀨俐癗'
/*     */     //   50: invokevirtual toCharArray : ()[C
/*     */     //   53: dup
/*     */     //   54: dup
/*     */     //   55: bipush #18
/*     */     //   57: dup_x1
/*     */     //   58: caload
/*     */     //   59: sipush #3090
/*     */     //   62: ixor
/*     */     //   63: i2c
/*     */     //   64: castore
/*     */     //   65: sipush #16786
/*     */     //   68: iconst_1
/*     */     //   69: iconst_2
/*     */     //   70: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   73: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*     */     //   76: dup
/*     */     //   77: astore_0
/*     */     //   78: iconst_2
/*     */     //   79: ldc_w '꣄㽠䢑䰘'
/*     */     //   82: invokevirtual toCharArray : ()[C
/*     */     //   85: dup
/*     */     //   86: dup
/*     */     //   87: iconst_0
/*     */     //   88: dup_x1
/*     */     //   89: caload
/*     */     //   90: sipush #18752
/*     */     //   93: ixor
/*     */     //   94: i2c
/*     */     //   95: castore
/*     */     //   96: sipush #24960
/*     */     //   99: iconst_0
/*     */     //   100: iconst_3
/*     */     //   101: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   104: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*     */     //   107: bipush #8
/*     */     //   109: newarray byte
/*     */     //   111: dup
/*     */     //   112: iconst_0
/*     */     //   113: lload #9
/*     */     //   115: bipush #56
/*     */     //   117: lushr
/*     */     //   118: l2i
/*     */     //   119: i2b
/*     */     //   120: bastore
/*     */     //   121: iconst_1
/*     */     //   122: istore_1
/*     */     //   123: iload_1
/*     */     //   124: bipush #8
/*     */     //   126: if_icmpge -> 150
/*     */     //   129: dup
/*     */     //   130: iload_1
/*     */     //   131: lload #9
/*     */     //   133: iload_1
/*     */     //   134: bipush #8
/*     */     //   136: imul
/*     */     //   137: lshl
/*     */     //   138: bipush #56
/*     */     //   140: lushr
/*     */     //   141: l2i
/*     */     //   142: i2b
/*     */     //   143: bastore
/*     */     //   144: iinc #1, 1
/*     */     //   147: goto -> 123
/*     */     //   150: new javax/crypto/spec/DESKeySpec
/*     */     //   153: dup_x1
/*     */     //   154: swap
/*     */     //   155: invokespecial <init> : ([B)V
/*     */     //   158: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*     */     //   161: new javax/crypto/spec/IvParameterSpec
/*     */     //   164: dup
/*     */     //   165: bipush #8
/*     */     //   167: newarray byte
/*     */     //   169: invokespecial <init> : ([B)V
/*     */     //   172: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*     */     //   175: bipush #15
/*     */     //   177: anewarray java/lang/String
/*     */     //   180: astore #7
/*     */     //   182: iconst_0
/*     */     //   183: istore #5
/*     */     //   185: ldc_w '劚㑪曏䅩刮?厉傔⌢ⅼ䎌짜苛筶﻾᜔⼳禯貊䘊壿虩濗䌏똴寀䤋뒙ーᵉ泰㼗ⴱ?ⰾ쀺빞猪㻟ꇛ⇩Œ鷾埓閤礽떍먓闡嚴⺈咂閆蒀첌窨儺?쟺ﮬ呚͡믆ώ觚?궉籲꠆ⵜ?샲㞌꫓괒隃࿼떕쨘骁㢺見㜲ﯖ喙䃡㵕礘኱漋ᦹꌤ훚俥濱ꢵ珄鿖͛ㅍ線⽫㝗⬲抰躾Ṳꎫ쒎㲓軲ꤢ󓦿羶氫눤秆叨鄒嘭킃䅇麙猺鱓㨹??ퟷꇝ豤舡璧؎ꯂ㐡ᖪ㶷ᑫ鶄ᓝ䅎䌅☒㇏碨᪾㰍㜫礎⼇듗梋嵮饑蟓∂탨륶ܐ歝詫屭㭊斢쯛慡ᑮ顒㐍顥ﾍꆱ娎췌ᦪ즀闁괛뒳?稊㚵뒭䫤꯹╗秳ꊣ寤왅竨㖸ȵᒣ떥撑ᙑ苮⸡褮셛侖闭घ隶ὐ扔?뤕挬哶?᧟潅蟲럁磑ﰞ㑹榃᪟쎇憎ꗡ쮫班갪텃쮄ࣕ偻靽땂?ᇲ᳐覶언⹻姑柒⟨톭孟絟블漠̧Ꭳ屃냀祢쓶沖䰡ᬍ阾잋ꇰ䳹ᘎꈶ俽揺錞骩푴汚득⅙ኇ뚙鉩룿똎ꐴ㒂㵱樓࿋頴恈?㳶뤡煢輷⼛䒞啎Ǻ葎鈪箑執䎱춰抶뗿ㆼ䓲ㅀ풏뇂ⴭ望䰛㸡᧋캹ᱧㄧ쭨꨷汴註彝㗤?鰒͢'
/*     */     //   188: invokevirtual toCharArray : ()[C
/*     */     //   191: dup
/*     */     //   192: dup
/*     */     //   193: iconst_4
/*     */     //   194: dup_x1
/*     */     //   195: caload
/*     */     //   196: sipush #31275
/*     */     //   199: ixor
/*     */     //   200: i2c
/*     */     //   201: castore
/*     */     //   202: sipush #12908
/*     */     //   205: iconst_1
/*     */     //   206: iconst_4
/*     */     //   207: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   210: dup
/*     */     //   211: astore #4
/*     */     //   213: invokevirtual length : ()I
/*     */     //   216: istore #6
/*     */     //   218: bipush #16
/*     */     //   220: istore_3
/*     */     //   221: iconst_m1
/*     */     //   222: istore_2
/*     */     //   223: iinc #2, 1
/*     */     //   226: aload #4
/*     */     //   228: iload_2
/*     */     //   229: dup
/*     */     //   230: iload_3
/*     */     //   231: iadd
/*     */     //   232: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   235: iconst_m1
/*     */     //   236: goto -> 370
/*     */     //   239: aload #7
/*     */     //   241: swap
/*     */     //   242: iload #5
/*     */     //   244: iinc #5, 1
/*     */     //   247: swap
/*     */     //   248: aastore
/*     */     //   249: iload_2
/*     */     //   250: iload_3
/*     */     //   251: iadd
/*     */     //   252: dup
/*     */     //   253: istore_2
/*     */     //   254: iload #6
/*     */     //   256: if_icmpge -> 269
/*     */     //   259: aload #4
/*     */     //   261: iload_2
/*     */     //   262: invokevirtual charAt : (I)C
/*     */     //   265: istore_3
/*     */     //   266: goto -> 223
/*     */     //   269: ldc_w '泛ꂵḴ㦇䱓좱㱝歒쉩ﯕ싨㣋꨻ꄚ虓¿퐷䤕嵨ⓕ삥꘥਱䱃㩹䐍╜盹Λ맟携瀑뽋繗辸⮤挌裭甏怐☎묾뮹̣汝띋︨ຑꎆ薛錊䢒턖ﷶ땄ﺃ餫癕銢鞢Ȿ沅䕢㫊?뙑鸳鸻཮橲苻霈厔'
/*     */     //   272: invokevirtual toCharArray : ()[C
/*     */     //   275: dup
/*     */     //   276: dup
/*     */     //   277: bipush #73
/*     */     //   279: dup_x1
/*     */     //   280: caload
/*     */     //   281: sipush #18182
/*     */     //   284: ixor
/*     */     //   285: i2c
/*     */     //   286: castore
/*     */     //   287: sipush #8442
/*     */     //   290: iconst_1
/*     */     //   291: iconst_3
/*     */     //   292: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   295: dup
/*     */     //   296: astore #4
/*     */     //   298: invokevirtual length : ()I
/*     */     //   301: istore #6
/*     */     //   303: bipush #24
/*     */     //   305: istore_3
/*     */     //   306: iconst_m1
/*     */     //   307: istore_2
/*     */     //   308: iinc #2, 1
/*     */     //   311: aload #4
/*     */     //   313: iload_2
/*     */     //   314: dup
/*     */     //   315: iload_3
/*     */     //   316: iadd
/*     */     //   317: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   320: iconst_0
/*     */     //   321: goto -> 370
/*     */     //   324: aload #7
/*     */     //   326: swap
/*     */     //   327: iload #5
/*     */     //   329: iinc #5, 1
/*     */     //   332: swap
/*     */     //   333: aastore
/*     */     //   334: iload_2
/*     */     //   335: iload_3
/*     */     //   336: iadd
/*     */     //   337: dup
/*     */     //   338: istore_2
/*     */     //   339: iload #6
/*     */     //   341: if_icmpge -> 354
/*     */     //   344: aload #4
/*     */     //   346: iload_2
/*     */     //   347: invokevirtual charAt : (I)C
/*     */     //   350: istore_3
/*     */     //   351: goto -> 308
/*     */     //   354: aload #7
/*     */     //   356: putstatic me/konsolas/aac/ce.n : [Ljava/lang/String;
/*     */     //   359: bipush #15
/*     */     //   361: anewarray java/lang/String
/*     */     //   364: putstatic me/konsolas/aac/ce.o : [Ljava/lang/String;
/*     */     //   367: goto -> 432
/*     */     //   370: swap
/*     */     //   371: ldc_w '册ㆯ矩ꍆਝ뼮⮃턗ᕋュ巭'
/*     */     //   374: invokevirtual toCharArray : ()[C
/*     */     //   377: dup
/*     */     //   378: dup
/*     */     //   379: iconst_3
/*     */     //   380: dup_x1
/*     */     //   381: caload
/*     */     //   382: sipush #18091
/*     */     //   385: ixor
/*     */     //   386: i2c
/*     */     //   387: castore
/*     */     //   388: sipush #11913
/*     */     //   391: iconst_0
/*     */     //   392: iconst_3
/*     */     //   393: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   396: invokevirtual getBytes : (Ljava/lang/String;)[B
/*     */     //   399: aload_0
/*     */     //   400: swap
/*     */     //   401: invokevirtual doFinal : ([B)[B
/*     */     //   404: astore #8
/*     */     //   406: aload #8
/*     */     //   408: invokestatic b : ([B)Ljava/lang/String;
/*     */     //   411: invokevirtual intern : ()Ljava/lang/String;
/*     */     //   414: swap
/*     */     //   415: tableswitch default -> 239, 0 -> 324
/*     */     //   432: iconst_3
/*     */     //   433: newarray double
/*     */     //   435: dup
/*     */     //   436: iconst_0
/*     */     //   437: dconst_0
/*     */     //   438: dastore
/*     */     //   439: dup
/*     */     //   440: iconst_1
/*     */     //   441: ldc2_w 0.5
/*     */     //   444: dastore
/*     */     //   445: dup
/*     */     //   446: iconst_2
/*     */     //   447: dconst_1
/*     */     //   448: dastore
/*     */     //   449: putstatic me/konsolas/aac/ce.j : [D
/*     */     //   452: new java/util/ArrayList
/*     */     //   455: dup
/*     */     //   456: invokespecial <init> : ()V
/*     */     //   459: astore #11
/*     */     //   461: getstatic me/konsolas/aac/ce.j : [D
/*     */     //   464: astore #12
/*     */     //   466: aload #12
/*     */     //   468: arraylength
/*     */     //   469: istore #13
/*     */     //   471: iconst_0
/*     */     //   472: istore #14
/*     */     //   474: iload #14
/*     */     //   476: iload #13
/*     */     //   478: if_icmpge -> 581
/*     */     //   481: aload #12
/*     */     //   483: iload #14
/*     */     //   485: daload
/*     */     //   486: dstore #15
/*     */     //   488: getstatic me/konsolas/aac/ce.j : [D
/*     */     //   491: astore #17
/*     */     //   493: aload #17
/*     */     //   495: arraylength
/*     */     //   496: istore #18
/*     */     //   498: iconst_0
/*     */     //   499: istore #19
/*     */     //   501: iload #19
/*     */     //   503: iload #18
/*     */     //   505: if_icmpge -> 575
/*     */     //   508: aload #17
/*     */     //   510: iload #19
/*     */     //   512: daload
/*     */     //   513: dstore #20
/*     */     //   515: getstatic me/konsolas/aac/ce.j : [D
/*     */     //   518: astore #22
/*     */     //   520: aload #22
/*     */     //   522: arraylength
/*     */     //   523: istore #23
/*     */     //   525: iconst_0
/*     */     //   526: istore #24
/*     */     //   528: iload #24
/*     */     //   530: iload #23
/*     */     //   532: if_icmpge -> 569
/*     */     //   535: aload #22
/*     */     //   537: iload #24
/*     */     //   539: daload
/*     */     //   540: dstore #25
/*     */     //   542: aload #11
/*     */     //   544: new org/bukkit/util/Vector
/*     */     //   547: dup
/*     */     //   548: dload #15
/*     */     //   550: dload #20
/*     */     //   552: dload #25
/*     */     //   554: invokespecial <init> : (DDD)V
/*     */     //   557: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   562: pop
/*     */     //   563: iinc #24, 1
/*     */     //   566: goto -> 528
/*     */     //   569: iinc #19, 1
/*     */     //   572: goto -> 501
/*     */     //   575: iinc #14, 1
/*     */     //   578: goto -> 474
/*     */     //   581: aload #11
/*     */     //   583: iconst_0
/*     */     //   584: anewarray org/bukkit/util/Vector
/*     */     //   587: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   592: checkcast [Lorg/bukkit/util/Vector;
/*     */     //   595: putstatic me/konsolas/aac/ce.i : [Lorg/bukkit/util/Vector;
/*     */     //   598: getstatic me/konsolas/aac/ei.LILY_PAD : Lme/konsolas/aac/ei;
/*     */     //   601: invokevirtual a : ()Lorg/bukkit/Material;
/*     */     //   604: invokestatic of : (Ljava/lang/Enum;)Ljava/util/EnumSet;
/*     */     //   607: putstatic me/konsolas/aac/ce.a : Ljava/util/Set;
/*     */     //   610: invokestatic values : ()[Lorg/bukkit/Material;
/*     */     //   613: astore #11
/*     */     //   615: aload #11
/*     */     //   617: arraylength
/*     */     //   618: istore #12
/*     */     //   620: iconst_0
/*     */     //   621: istore #13
/*     */     //   623: iload #13
/*     */     //   625: iload #12
/*     */     //   627: if_icmpge -> 693
/*     */     //   630: aload #11
/*     */     //   632: iload #13
/*     */     //   634: aaload
/*     */     //   635: astore #14
/*     */     //   637: aload #14
/*     */     //   639: invokevirtual name : ()Ljava/lang/String;
/*     */     //   642: sipush #23511
/*     */     //   645: ldc2_w 6784888717180164388
/*     */     //   648: lload #9
/*     */     //   650: lxor
/*     */     //   651: <illegal opcode> s : (IJ)Ljava/lang/String;
/*     */     //   656: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*     */     //   659: ifeq -> 687
/*     */     //   662: getstatic me/konsolas/aac/ce.a : Ljava/util/Set;
/*     */     //   665: aload #14
/*     */     //   667: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   672: pop
/*     */     //   673: goto -> 687
/*     */     //   676: ldc2_w -733191694974373712
/*     */     //   679: lload #9
/*     */     //   681: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   686: athrow
/*     */     //   687: iinc #13, 1
/*     */     //   690: goto -> 623
/*     */     //   693: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #7	-> 432
/*     */     //   #123	-> 452
/*     */     //   #94	-> 461
/*     */     //   #90	-> 488
/*     */     //   #21	-> 515
/*     */     //   #46	-> 542
/*     */     //   #30	-> 563
/*     */     //   #37	-> 569
/*     */     //   #108	-> 575
/*     */     //   #78	-> 581
/*     */     //   #66	-> 598
/*     */     //   #103	-> 610
/*     */     //   #62	-> 637
/*     */     //   #61	-> 687
/*     */     //   #4	-> 693
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   637	673	676	aacinternal/v
/*     */   }
/*     */   
/*     */   private static v a(v paramv) {
/*     */     return paramv;
/*     */   }
/*     */   
/*     */   private static String b(byte[] paramArrayOfbyte) {
/*     */     byte b1 = 0;
/*     */     int i;
/*     */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*     */     for (byte b2 = 0; b2 < i; b2++) {
/*     */       int j;
/*     */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*     */         arrayOfChar[b1++] = (char)j;
/*     */       } else if (j < 224) {
/*     */         char c = (char)((char)(j & 0x1F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } else if (b2 < i - 2) {
/*     */         char c = (char)((char)(j & 0xF) << 12);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } 
/*     */     } 
/*     */     return new String(arrayOfChar, 0, b1);
/*     */   }
/*     */   
/*     */   private static String b(int paramInt, long paramLong) {
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7663;
/*     */     if (o[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])p.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           "쎧輩ජ빽ﲦ䴖⊓☡뻚뗎㋡?楻ꥎᆿ罕㜃盂Ⴒ".toCharArray()[8] = (char)("쎧輩ජ빽ﲦ䴖⊓☡뻚뗎㋡?楻ꥎᆿ罕㜃盂Ⴒ".toCharArray()[8] ^ 0x48A9);
/*     */           arrayOfObject[0] = Cipher.getInstance(da$gx.U("쎧輩ජ빽ﲦ䴖⊓☡뻚뗎㋡?楻ꥎᆿ罕㜃盂Ⴒ".toCharArray(), (short)31742, true, false));
/*     */           "껂໲䄩".toCharArray()[1] = (char)("껂໲䄩".toCharArray()[1] ^ 0x5EEC);
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("껂໲䄩".toCharArray(), (short)23982, true, true));
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           p.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         "鷻粀춳鉕༞颥?⹁汉ᨰ쳻쥊཯仗嫽瀮磚".toCharArray()[0] = (char)("鷻粀춳鉕༞颥?⹁汉ᨰ쳻쥊཯仗嫽瀮磚".toCharArray()[0] ^ 0x19E3);
/*     */         throw new RuntimeException(da$gx.U("鷻粀춳鉕༞颥?⹁汉ᨰ쳻쥊཯仗嫽瀮磚".toCharArray(), (short)6395, false, false), exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       "?푥蹱턴ᘝ㛂玜耝漺㡵㸒".toCharArray()[9] = (char)("?푥蹱턴ᘝ㛂玜耝漺㡵㸒".toCharArray()[9] ^ 0x3CAC);
/*     */       byte[] arrayOfByte2 = n[i].getBytes(da$gx.U("?푥蹱턴ᘝ㛂玜耝漺㡵㸒".toCharArray(), (short)7519, false, true));
/*     */       o[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return o[i];
/*     */   }
/*     */   
/*     */   private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*     */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*     */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*     */     String str = b(i, l);
/*     */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*     */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*     */     return str;
/*     */   }
/*     */   
/*     */   private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*     */     // Byte code:
/*     */     //   0: new java/lang/invoke/MutableCallSite
/*     */     //   3: dup
/*     */     //   4: aload_2
/*     */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*     */     //   8: astore_3
/*     */     //   9: aload_3
/*     */     //   10: ldc_w
/*     */     //   13: ldc_w [Ljava/lang/Object;
/*     */     //   16: aload_2
/*     */     //   17: invokevirtual parameterCount : ()I
/*     */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*     */     //   23: iconst_0
/*     */     //   24: iconst_3
/*     */     //   25: anewarray java/lang/Object
/*     */     //   28: dup
/*     */     //   29: iconst_0
/*     */     //   30: aload_0
/*     */     //   31: aastore
/*     */     //   32: dup
/*     */     //   33: iconst_1
/*     */     //   34: aload_3
/*     */     //   35: aastore
/*     */     //   36: dup
/*     */     //   37: iconst_2
/*     */     //   38: aload_1
/*     */     //   39: aastore
/*     */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*     */     //   43: aload_2
/*     */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*     */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*     */     //   50: goto -> 171
/*     */     //   53: astore #4
/*     */     //   55: new java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: new java/lang/StringBuilder
/*     */     //   62: dup
/*     */     //   63: invokespecial <init> : ()V
/*     */     //   66: ldc_w 'ၖᏪ䝃埳㞦㩝丅ᾩ䒶堹꘬⼊䚆涸偬቉'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: bipush #9
/*     */     //   76: dup_x1
/*     */     //   77: caload
/*     */     //   78: sipush #6428
/*     */     //   81: ixor
/*     */     //   82: i2c
/*     */     //   83: castore
/*     */     //   84: sipush #3237
/*     */     //   87: iconst_0
/*     */     //   88: iconst_3
/*     */     //   89: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w '⦖針㫗'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_0
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #1177
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #19588
/*     */     //   115: iconst_0
/*     */     //   116: iconst_3
/*     */     //   117: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: aload_1
/*     */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   127: ldc_w '斩?眨ឥ'
/*     */     //   130: invokevirtual toCharArray : ()[C
/*     */     //   133: dup
/*     */     //   134: dup
/*     */     //   135: iconst_1
/*     */     //   136: dup_x1
/*     */     //   137: caload
/*     */     //   138: sipush #27168
/*     */     //   141: ixor
/*     */     //   142: i2c
/*     */     //   143: castore
/*     */     //   144: sipush #21867
/*     */     //   147: iconst_0
/*     */     //   148: iconst_3
/*     */     //   149: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   155: aload_2
/*     */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   165: aload #4
/*     */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   170: athrow
/*     */     //   171: aload_3
/*     */     //   172: areturn
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	50	53	java/lang/Exception
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */