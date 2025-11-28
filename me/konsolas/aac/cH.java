package me.konsolas.aac;

import aacinternal.v;
import com.comphenix.protocol.events.PacketEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class ch extends ck {
  private static final double n = 3.0D;
  
  private static final Vector o;
  
  private static final Vector j;
  
  private static final Vector l;
  
  private final BlockingQueue f;
  
  private Location k;
  
  private final iV g;
  
  private final O i;
  
  private final boolean m;
  
  private static String h;
  
  private static final long p;
  
  private static final String[] q;
  
  private static final String[] r;
  
  private static final Map s;
  
  private ke a(int paramInt, Location paramLocation, Iterable paramIterable, long paramLong, Vector paramVector) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: lload #4
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: getstatic me/konsolas/aac/ch.p : J
    //   17: lxor
    //   18: lstore #7
    //   20: lload #7
    //   22: dup2
    //   23: ldc2_w 36612527154037
    //   26: lxor
    //   27: lstore #9
    //   29: dup2
    //   30: ldc2_w 56606148241045
    //   33: lxor
    //   34: lstore #11
    //   36: dup2
    //   37: ldc2_w 4785501481359
    //   40: lxor
    //   41: lstore #13
    //   43: pop2
    //   44: ldc2_w 8360258118557305318
    //   47: lload #7
    //   49: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   54: aload_2
    //   55: ldc2_w 8458822582492034198
    //   58: lload #7
    //   60: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/util/Vector;
    //   65: astore #16
    //   67: aload_2
    //   68: ldc2_w 8451567399110584933
    //   71: lload #7
    //   73: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/util/Vector;
    //   78: astore #17
    //   80: astore #15
    //   82: aload_0
    //   83: getfield m : Z
    //   86: ifeq -> 218
    //   89: ldc2_w 8451713787053094064
    //   92: lload #7
    //   94: <illegal opcode> w : (JJ)Lme/konsolas/aac/mJ;
    //   99: aload_0
    //   100: ldc2_w 8462129062724499736
    //   103: lload #7
    //   105: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   110: aload #17
    //   112: lload #13
    //   114: aload #16
    //   116: ldc2_w 4.5
    //   119: ldc2_w 8401314087154986970
    //   122: lload #7
    //   124: <illegal opcode> b : (Lme/konsolas/aac/mJ;Lorg/bukkit/entity/Entity;Lorg/bukkit/util/Vector;JLorg/bukkit/util/Vector;DJJ)Lme/konsolas/aac/d7;
    //   129: astore #20
    //   131: aload #20
    //   133: aload #15
    //   135: ifnonnull -> 183
    //   138: lload #11
    //   140: ldc2_w 8368797779044991205
    //   143: lload #7
    //   145: <illegal opcode> b : (Lme/konsolas/aac/d7;JJJ)Z
    //   150: ifeq -> 208
    //   153: goto -> 167
    //   156: ldc2_w 8365305893927682397
    //   159: lload #7
    //   161: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   166: athrow
    //   167: aload #20
    //   169: goto -> 183
    //   172: ldc2_w 8365305893927682397
    //   175: lload #7
    //   177: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   182: athrow
    //   183: ldc2_w 8366565999711409403
    //   186: lload #7
    //   188: <illegal opcode> b : (Lme/konsolas/aac/d7;JJ)Lorg/bukkit/util/Vector;
    //   193: aload #17
    //   195: ldc2_w 8458583034571132686
    //   198: lload #7
    //   200: <illegal opcode> b : (Lorg/bukkit/util/Vector;Lorg/bukkit/util/Vector;JJ)D
    //   205: goto -> 211
    //   208: ldc2_w Infinity
    //   211: dstore #18
    //   213: aload #15
    //   215: ifnull -> 226
    //   218: aconst_null
    //   219: astore #20
    //   221: ldc2_w Infinity
    //   224: dstore #18
    //   226: ldc2_w Infinity
    //   229: dstore #21
    //   231: aload_3
    //   232: ldc2_w 8372937717181415663
    //   235: lload #7
    //   237: <illegal opcode> b : (Ljava/lang/Iterable;JJ)Ljava/util/Iterator;
    //   242: astore #23
    //   244: aload #23
    //   246: invokeinterface hasNext : ()Z
    //   251: ifeq -> 389
    //   254: aload #23
    //   256: invokeinterface next : ()Ljava/lang/Object;
    //   261: checkcast me/konsolas/aac/lq
    //   264: astore #24
    //   266: aload #24
    //   268: aload #15
    //   270: ifnonnull -> 318
    //   273: ifnull -> 384
    //   276: goto -> 290
    //   279: ldc2_w 8365305893927682397
    //   282: lload #7
    //   284: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   289: athrow
    //   290: aload #24
    //   292: aload #6
    //   294: ldc2_w 8369652516369875684
    //   297: lload #7
    //   299: <illegal opcode> b : (Lme/konsolas/aac/lq;Lorg/bukkit/util/Vector;JJ)Lme/konsolas/aac/lq;
    //   304: goto -> 318
    //   307: ldc2_w 8365305893927682397
    //   310: lload #7
    //   312: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   317: athrow
    //   318: aload #17
    //   320: lload #9
    //   322: aload #16
    //   324: ldc2_w 8442342979629387471
    //   327: lload #7
    //   329: <illegal opcode> b : (Lme/konsolas/aac/lq;Lorg/bukkit/util/Vector;JLorg/bukkit/util/Vector;JJ)D
    //   334: dstore #25
    //   336: dload #25
    //   338: dload #21
    //   340: dcmpg
    //   341: aload #15
    //   343: ifnonnull -> 378
    //   346: ifge -> 384
    //   349: goto -> 363
    //   352: ldc2_w 8365305893927682397
    //   355: lload #7
    //   357: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   362: athrow
    //   363: dload #25
    //   365: dstore #21
    //   367: dload #21
    //   369: ldc2_w 3.0
    //   372: dload #18
    //   374: invokestatic min : (DD)D
    //   377: dcmpg
    //   378: ifge -> 384
    //   381: goto -> 389
    //   384: aload #15
    //   386: ifnull -> 244
    //   389: new me/konsolas/aac/ke
    //   392: dup
    //   393: dload #21
    //   395: dload #18
    //   397: aload #20
    //   399: aconst_null
    //   400: invokespecial <init> : (DDLme/konsolas/aac/d7;Lme/konsolas/aac/mn;)V
    //   403: lload #4
    //   405: lconst_0
    //   406: lcmp
    //   407: ifle -> 261
    //   410: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 54
    //   #105	-> 67
    //   #68	-> 82
    //   #74	-> 89
    //   #109	-> 131
    //   #113	-> 218
    //   #41	-> 221
    //   #49	-> 226
    //   #92	-> 231
    //   #82	-> 266
    //   #31	-> 290
    //   #37	-> 336
    //   #64	-> 363
    //   #46	-> 367
    //   #54	-> 384
    //   #53	-> 389
    // Exception table:
    //   from	to	target	type
    //   131	153	156	aacinternal/v
    //   138	169	172	aacinternal/v
    //   266	276	279	aacinternal/v
    //   273	304	307	aacinternal/v
    //   336	349	352	aacinternal/v
  }
  
  public void a(long paramLong, PacketEvent paramPacketEvent) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/ch.p : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 86648646031536
    //   11: lxor
    //   12: lstore #4
    //   14: dup2
    //   15: ldc2_w 77529103810489
    //   18: lxor
    //   19: lstore #6
    //   21: dup2
    //   22: ldc2_w 12690515410390
    //   25: lxor
    //   26: lstore #8
    //   28: dup2
    //   29: ldc2_w 131463600106294
    //   32: lxor
    //   33: dup2
    //   34: bipush #32
    //   36: lushr
    //   37: l2i
    //   38: istore #10
    //   40: dup2
    //   41: bipush #32
    //   43: lshl
    //   44: bipush #48
    //   46: lushr
    //   47: l2i
    //   48: istore #11
    //   50: dup2
    //   51: bipush #48
    //   53: lshl
    //   54: bipush #48
    //   56: lushr
    //   57: l2i
    //   58: istore #12
    //   60: pop2
    //   61: dup2
    //   62: ldc2_w 97743236503047
    //   65: lxor
    //   66: dup2
    //   67: bipush #16
    //   69: lushr
    //   70: lstore #13
    //   72: dup2
    //   73: bipush #48
    //   75: lshl
    //   76: bipush #48
    //   78: lushr
    //   79: l2i
    //   80: istore #15
    //   82: pop2
    //   83: dup2
    //   84: ldc2_w 29293195319258
    //   87: lxor
    //   88: lstore #16
    //   90: dup2
    //   91: ldc2_w 27775228449400
    //   94: lxor
    //   95: lstore #18
    //   97: pop2
    //   98: ldc2_w 5517105199452991859
    //   101: lload_1
    //   102: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   107: aload_3
    //   108: ldc2_w 5502401372433888621
    //   111: lload_1
    //   112: <illegal opcode> b : (Lcom/comphenix/protocol/events/PacketEvent;JJ)Lcom/comphenix/protocol/events/PacketContainer;
    //   117: astore #21
    //   119: astore #20
    //   121: aload #21
    //   123: ldc2_w 5481924840286927009
    //   126: lload_1
    //   127: <illegal opcode> b : (Lcom/comphenix/protocol/events/PacketContainer;JJ)Lcom/comphenix/protocol/PacketType;
    //   132: lload #18
    //   134: ldc2_w 5611911452470349028
    //   137: lload_1
    //   138: <illegal opcode> w : (Lcom/comphenix/protocol/PacketType;JJJ)Z
    //   143: aload #20
    //   145: ifnonnull -> 605
    //   148: ifeq -> 579
    //   151: goto -> 164
    //   154: ldc2_w 5513148010365630920
    //   157: lload_1
    //   158: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   163: athrow
    //   164: aload_0
    //   165: aload #20
    //   167: ifnonnull -> 300
    //   170: goto -> 183
    //   173: ldc2_w 5513148010365630920
    //   176: lload_1
    //   177: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   182: athrow
    //   183: lload_1
    //   184: lconst_0
    //   185: lcmp
    //   186: ifle -> 287
    //   189: getfield k : Lorg/bukkit/Location;
    //   192: ifnull -> 286
    //   195: goto -> 208
    //   198: ldc2_w 5513148010365630920
    //   201: lload_1
    //   202: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   207: athrow
    //   208: aload_0
    //   209: aload #20
    //   211: lload_1
    //   212: lconst_0
    //   213: lcmp
    //   214: ifle -> 353
    //   217: ifnonnull -> 351
    //   220: goto -> 233
    //   223: ldc2_w 5513148010365630920
    //   226: lload_1
    //   227: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   232: athrow
    //   233: lload_1
    //   234: lconst_0
    //   235: lcmp
    //   236: ifle -> 323
    //   239: getfield k : Lorg/bukkit/Location;
    //   242: ldc2_w 5500857460306826536
    //   245: lload_1
    //   246: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/World;
    //   251: aload_0
    //   252: ldc2_w 5618994835316261261
    //   255: lload_1
    //   256: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   261: ldc2_w 5515205211792998724
    //   264: lload_1
    //   265: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Lorg/bukkit/World;
    //   270: if_acmpeq -> 322
    //   273: goto -> 286
    //   276: ldc2_w 5513148010365630920
    //   279: lload_1
    //   280: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   285: athrow
    //   286: aload_0
    //   287: goto -> 300
    //   290: ldc2_w 5513148010365630920
    //   293: lload_1
    //   294: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   299: athrow
    //   300: aload_0
    //   301: ldc2_w 5618994835316261261
    //   304: lload_1
    //   305: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   310: ldc2_w 5619874469582352606
    //   313: lload_1
    //   314: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Lorg/bukkit/Location;
    //   319: putfield k : Lorg/bukkit/Location;
    //   322: aload_0
    //   323: aload #21
    //   325: aload_0
    //   326: getfield k : Lorg/bukkit/Location;
    //   329: iload #10
    //   331: swap
    //   332: iload #11
    //   334: swap
    //   335: iload #12
    //   337: swap
    //   338: ldc2_w 5517742876243179326
    //   341: lload_1
    //   342: <illegal opcode> w : (Lcom/comphenix/protocol/events/PacketContainer;IIILorg/bukkit/Location;JJ)Lorg/bukkit/Location;
    //   347: putfield k : Lorg/bukkit/Location;
    //   350: aload_0
    //   351: aload #20
    //   353: ifnonnull -> 484
    //   356: ldc2_w 5618994835316261261
    //   359: lload_1
    //   360: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   365: ldc2_w 5477661548044697624
    //   368: lload_1
    //   369: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Lorg/bukkit/entity/Entity;
    //   374: ifnull -> 483
    //   377: goto -> 390
    //   380: ldc2_w 5513148010365630920
    //   383: lload_1
    //   384: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   389: athrow
    //   390: aload_0
    //   391: ldc2_w 5618994835316261261
    //   394: lload_1
    //   395: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   400: ldc2_w 5619874469582352606
    //   403: lload_1
    //   404: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Lorg/bukkit/Location;
    //   409: astore #22
    //   411: aload_0
    //   412: getfield k : Lorg/bukkit/Location;
    //   415: aload #22
    //   417: ldc2_w 5494368631151739430
    //   420: lload_1
    //   421: <illegal opcode> b : (Lorg/bukkit/Location;JJ)D
    //   426: ldc2_w 5511488496794265371
    //   429: lload_1
    //   430: <illegal opcode> b : (Lorg/bukkit/Location;DJJ)V
    //   435: aload_0
    //   436: getfield k : Lorg/bukkit/Location;
    //   439: aload #22
    //   441: ldc2_w 5528602014796864361
    //   444: lload_1
    //   445: <illegal opcode> b : (Lorg/bukkit/Location;JJ)D
    //   450: ldc2_w 5480053399276715238
    //   453: lload_1
    //   454: <illegal opcode> b : (Lorg/bukkit/Location;DJJ)V
    //   459: aload_0
    //   460: getfield k : Lorg/bukkit/Location;
    //   463: aload #22
    //   465: ldc2_w 5508161188317615141
    //   468: lload_1
    //   469: <illegal opcode> b : (Lorg/bukkit/Location;JJ)D
    //   474: ldc2_w 5495547894957818041
    //   477: lload_1
    //   478: <illegal opcode> b : (Lorg/bukkit/Location;DJJ)V
    //   483: aload_0
    //   484: getfield f : Ljava/util/concurrent/BlockingQueue;
    //   487: invokeinterface iterator : ()Ljava/util/Iterator;
    //   492: astore #22
    //   494: aload #22
    //   496: invokeinterface hasNext : ()Z
    //   501: ifeq -> 574
    //   504: aload #22
    //   506: invokeinterface next : ()Ljava/lang/Object;
    //   511: checkcast me/konsolas/aac/l_
    //   514: astore #23
    //   516: aload #23
    //   518: aload_0
    //   519: getfield k : Lorg/bukkit/Location;
    //   522: lload #13
    //   524: dup2_x1
    //   525: pop2
    //   526: iload #15
    //   528: i2s
    //   529: swap
    //   530: ldc2_w 5480903379739698416
    //   533: lload_1
    //   534: <illegal opcode> w : (Lme/konsolas/aac/l_;JSLorg/bukkit/Location;JJ)V
    //   539: aload #20
    //   541: lload_1
    //   542: lconst_0
    //   543: lcmp
    //   544: iflt -> 552
    //   547: ifnonnull -> 1017
    //   550: aload #20
    //   552: ifnull -> 494
    //   555: lload_1
    //   556: lconst_0
    //   557: lcmp
    //   558: iflt -> 539
    //   561: goto -> 574
    //   564: ldc2_w 5513148010365630920
    //   567: lload_1
    //   568: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   573: athrow
    //   574: aload #20
    //   576: ifnull -> 1017
    //   579: aload #21
    //   581: lload #6
    //   583: ldc2_w 5489925267707364158
    //   586: lload_1
    //   587: <illegal opcode> w : (Lcom/comphenix/protocol/events/PacketContainer;JJJ)Z
    //   592: goto -> 605
    //   595: ldc2_w 5513148010365630920
    //   598: lload_1
    //   599: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   604: athrow
    //   605: aload #20
    //   607: ifnonnull -> 672
    //   610: ifeq -> 1017
    //   613: goto -> 626
    //   616: ldc2_w 5513148010365630920
    //   619: lload_1
    //   620: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   625: athrow
    //   626: aload #21
    //   628: ldc2_w 5618296948826921742
    //   631: lload_1
    //   632: <illegal opcode> b : (Lcom/comphenix/protocol/events/PacketContainer;JJ)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   637: iconst_0
    //   638: ldc2_w 5602921034279308075
    //   641: lload_1
    //   642: <illegal opcode> b : (Lcom/comphenix/protocol/reflect/StructureModifier;IJJ)Ljava/lang/Object;
    //   647: checkcast java/lang/Integer
    //   650: ldc2_w 5600511778751404917
    //   653: lload_1
    //   654: <illegal opcode> b : (Ljava/lang/Integer;JJ)I
    //   659: goto -> 672
    //   662: ldc2_w 5513148010365630920
    //   665: lload_1
    //   666: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   671: athrow
    //   672: istore #22
    //   674: iload #22
    //   676: aload #20
    //   678: lload_1
    //   679: lconst_0
    //   680: lcmp
    //   681: iflt -> 903
    //   684: ifnonnull -> 895
    //   687: ifge -> 868
    //   690: goto -> 703
    //   693: ldc2_w 5513148010365630920
    //   696: lload_1
    //   697: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   702: athrow
    //   703: aload_0
    //   704: ldc2_w 5608042978784227696
    //   707: lload_1
    //   708: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   713: ldc2_w 5520712372870748809
    //   716: lload_1
    //   717: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   722: aload_0
    //   723: ldc2_w 5618994835316261261
    //   726: lload_1
    //   727: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   732: aload #20
    //   734: lload_1
    //   735: lconst_0
    //   736: lcmp
    //   737: ifle -> 858
    //   740: ifnonnull -> 827
    //   743: goto -> 756
    //   746: ldc2_w 5513148010365630920
    //   749: lload_1
    //   750: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   755: athrow
    //   756: lload #16
    //   758: dup2_x1
    //   759: pop2
    //   760: ldc2_w 5529830763166585251
    //   763: lload_1
    //   764: <illegal opcode> b : (Lme/konsolas/aac/w;JLorg/bukkit/entity/Player;JJ)Z
    //   769: ifeq -> 867
    //   772: goto -> 785
    //   775: ldc2_w 5513148010365630920
    //   778: lload_1
    //   779: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   784: athrow
    //   785: aload_0
    //   786: ldc2_w 5608042978784227696
    //   789: lload_1
    //   790: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   795: ldc2_w 5520712372870748809
    //   798: lload_1
    //   799: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   804: aload_0
    //   805: ldc2_w 5618994835316261261
    //   808: lload_1
    //   809: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   814: goto -> 827
    //   817: ldc2_w 5513148010365630920
    //   820: lload_1
    //   821: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   826: athrow
    //   827: new java/lang/StringBuilder
    //   830: dup
    //   831: invokespecial <init> : ()V
    //   834: sipush #2175
    //   837: ldc2_w 5331896106101329019
    //   840: lload_1
    //   841: lxor
    //   842: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   847: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   850: iload #22
    //   852: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   855: invokevirtual toString : ()Ljava/lang/String;
    //   858: ldc2_w 5490927602145994462
    //   861: lload_1
    //   862: <illegal opcode> b : (Lme/konsolas/aac/w;Lorg/bukkit/entity/Player;Ljava/lang/String;JJ)V
    //   867: return
    //   868: aload_0
    //   869: getfield f : Ljava/util/concurrent/BlockingQueue;
    //   872: new me/konsolas/aac/l_
    //   875: dup
    //   876: iload #22
    //   878: aload_0
    //   879: getfield k : Lorg/bukkit/Location;
    //   882: aconst_null
    //   883: invokespecial <init> : (ILorg/bukkit/Location;Lme/konsolas/aac/mn;)V
    //   886: ldc2_w 5607462309890553378
    //   889: lload_1
    //   890: <illegal opcode> b : (Ljava/util/concurrent/BlockingQueue;Ljava/lang/Object;JJ)Z
    //   895: lload_1
    //   896: lconst_0
    //   897: lcmp
    //   898: iflt -> 990
    //   901: aload #20
    //   903: ifnonnull -> 990
    //   906: ifne -> 974
    //   909: goto -> 922
    //   912: ldc2_w 5513148010365630920
    //   915: lload_1
    //   916: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   921: athrow
    //   922: aload_0
    //   923: getfield i : Lme/konsolas/aac/O;
    //   926: fconst_1
    //   927: lload #8
    //   929: ldc2_w 5517280242931083361
    //   932: lload_1
    //   933: <illegal opcode> b : (Lme/konsolas/aac/O;FJJJ)Z
    //   938: pop
    //   939: aload_0
    //   940: ldc2_w 5496494238011723226
    //   943: lload_1
    //   944: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
    //   949: fconst_1
    //   950: lload #4
    //   952: ldc2_w 5513085820580628694
    //   955: lload_1
    //   956: <illegal opcode> b : (Lme/konsolas/aac/ck;Lme/konsolas/aac/eA;FJJJ)V
    //   961: goto -> 974
    //   964: ldc2_w 5513148010365630920
    //   967: lload_1
    //   968: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   973: athrow
    //   974: aload_0
    //   975: getfield i : Lme/konsolas/aac/O;
    //   978: fconst_0
    //   979: lload #8
    //   981: ldc2_w 5517280242931083361
    //   984: lload_1
    //   985: <illegal opcode> b : (Lme/konsolas/aac/O;FJJJ)Z
    //   990: ifeq -> 1017
    //   993: aload_3
    //   994: iconst_1
    //   995: ldc2_w 5602507768050320818
    //   998: lload_1
    //   999: <illegal opcode> b : (Lcom/comphenix/protocol/events/PacketEvent;ZJJ)V
    //   1004: goto -> 1017
    //   1007: ldc2_w 5513148010365630920
    //   1010: lload_1
    //   1011: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1016: athrow
    //   1017: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #35	-> 107
    //   #9	-> 121
    //   #40	-> 164
    //   #11	-> 322
    //   #99	-> 350
    //   #65	-> 390
    //   #57	-> 411
    //   #44	-> 435
    //   #47	-> 459
    //   #83	-> 483
    //   #69	-> 516
    //   #59	-> 539
    //   #77	-> 579
    //   #12	-> 626
    //   #39	-> 674
    //   #5	-> 703
    //   #66	-> 785
    //   #102	-> 867
    //   #95	-> 868
    //   #55	-> 922
    //   #112	-> 939
    //   #17	-> 974
    //   #91	-> 1017
    // Exception table:
    //   from	to	target	type
    //   121	151	154	aacinternal/v
    //   148	170	173	aacinternal/v
    //   164	195	198	aacinternal/v
    //   183	220	223	aacinternal/v
    //   208	273	276	aacinternal/v
    //   233	287	290	aacinternal/v
    //   351	377	380	aacinternal/v
    //   516	555	564	aacinternal/v
    //   574	592	595	aacinternal/v
    //   605	613	616	aacinternal/v
    //   610	659	662	aacinternal/v
    //   674	690	693	aacinternal/v
    //   687	743	746	aacinternal/v
    //   703	772	775	aacinternal/v
    //   756	814	817	aacinternal/v
    //   895	909	912	aacinternal/v
    //   906	961	964	aacinternal/v
    //   990	1004	1007	aacinternal/v
  }
  
  public ch(long paramLong, AAC paramAAC, Player paramPlayer) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/ch.p : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 120723892928628
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore #5
    //   19: dup2
    //   20: bipush #16
    //   22: lshl
    //   23: bipush #48
    //   25: lushr
    //   26: l2i
    //   27: istore #6
    //   29: dup2
    //   30: bipush #32
    //   32: lshl
    //   33: bipush #32
    //   35: lushr
    //   36: l2i
    //   37: istore #7
    //   39: pop2
    //   40: dup2
    //   41: ldc2_w 123950240037007
    //   44: lxor
    //   45: dup2
    //   46: bipush #48
    //   48: lushr
    //   49: l2i
    //   50: istore #8
    //   52: dup2
    //   53: bipush #16
    //   55: lshl
    //   56: bipush #48
    //   58: lushr
    //   59: l2i
    //   60: istore #9
    //   62: dup2
    //   63: bipush #32
    //   65: lshl
    //   66: bipush #32
    //   68: lushr
    //   69: l2i
    //   70: istore #10
    //   72: pop2
    //   73: dup2
    //   74: ldc2_w 107799773384496
    //   77: lxor
    //   78: lstore #11
    //   80: pop2
    //   81: ldc2_w -4384863181974552890
    //   84: lload_1
    //   85: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   90: aload_0
    //   91: iload #5
    //   93: i2s
    //   94: iload #6
    //   96: i2s
    //   97: aload_3
    //   98: aload #4
    //   100: iload #7
    //   102: sipush #25633
    //   105: ldc2_w 9002198628412108703
    //   108: lload_1
    //   109: lxor
    //   110: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   115: invokespecial <init> : (SSLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;ILjava/lang/String;)V
    //   118: astore #13
    //   120: aload_0
    //   121: new java/util/concurrent/ArrayBlockingQueue
    //   124: dup
    //   125: bipush #10
    //   127: invokespecial <init> : (I)V
    //   130: putfield f : Ljava/util/concurrent/BlockingQueue;
    //   133: aload_0
    //   134: new me/konsolas/aac/iV
    //   137: dup
    //   138: iload #8
    //   140: i2s
    //   141: iload #9
    //   143: i2c
    //   144: iload #10
    //   146: ldc2_w 100
    //   149: invokespecial <init> : (SCIJ)V
    //   152: putfield g : Lme/konsolas/aac/iV;
    //   155: aload_0
    //   156: aload_0
    //   157: ldc2_w -4465728212525958257
    //   160: lload_1
    //   161: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/configuration/ConfigurationSection;
    //   166: sipush #7205
    //   169: ldc2_w 827755640964667280
    //   172: lload_1
    //   173: lxor
    //   174: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   179: ldc2_w -4463840973024989339
    //   182: lload_1
    //   183: <illegal opcode> b : (Lorg/bukkit/configuration/ConfigurationSection;Ljava/lang/String;JJ)Z
    //   188: putfield m : Z
    //   191: aload_0
    //   192: aload_0
    //   193: ldc2_w -4465728212525958257
    //   196: lload_1
    //   197: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/configuration/ConfigurationSection;
    //   202: lload #11
    //   204: dup2_x1
    //   205: pop2
    //   206: sipush #16741
    //   209: ldc2_w 5131552572456569553
    //   212: lload_1
    //   213: lxor
    //   214: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   219: ldc2_w -4345944127189304872
    //   222: lload_1
    //   223: <illegal opcode> w : (JLorg/bukkit/configuration/ConfigurationSection;Ljava/lang/String;JJ)Lme/konsolas/aac/O;
    //   228: putfield i : Lme/konsolas/aac/O;
    //   231: aload #13
    //   233: ifnull -> 262
    //   236: iconst_3
    //   237: anewarray me/konsolas/aac/aN
    //   240: ldc2_w -4330309462273091022
    //   243: lload_1
    //   244: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
    //   249: goto -> 262
    //   252: ldc2_w -4379815240375585155
    //   255: lload_1
    //   256: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   261: athrow
    //   262: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #103	-> 90
    //   #21	-> 120
    //   #88	-> 133
    //   #50	-> 155
    //   #80	-> 191
    //   #3	-> 231
    // Exception table:
    //   from	to	target	type
    //   120	249	252	aacinternal/v
  }
  
  public void a(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/ch.p : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 105757754056099
    //   11: lxor
    //   12: dup2
    //   13: bipush #32
    //   15: lushr
    //   16: l2i
    //   17: istore_3
    //   18: dup2
    //   19: bipush #32
    //   21: lshl
    //   22: bipush #32
    //   24: lushr
    //   25: lstore #4
    //   27: pop2
    //   28: dup2
    //   29: ldc2_w 107959357780290
    //   32: lxor
    //   33: lstore #6
    //   35: dup2
    //   36: ldc2_w 93936686755275
    //   39: lxor
    //   40: dup2
    //   41: bipush #56
    //   43: lushr
    //   44: l2i
    //   45: istore #8
    //   47: dup2
    //   48: bipush #8
    //   50: lshl
    //   51: bipush #32
    //   53: lushr
    //   54: l2i
    //   55: istore #9
    //   57: dup2
    //   58: bipush #40
    //   60: lshl
    //   61: bipush #40
    //   63: lushr
    //   64: l2i
    //   65: istore #10
    //   67: pop2
    //   68: dup2
    //   69: ldc2_w 63024829813377
    //   72: lxor
    //   73: dup2
    //   74: bipush #32
    //   76: lushr
    //   77: l2i
    //   78: istore #11
    //   80: dup2
    //   81: bipush #32
    //   83: lshl
    //   84: bipush #48
    //   86: lushr
    //   87: l2i
    //   88: istore #12
    //   90: dup2
    //   91: bipush #48
    //   93: lshl
    //   94: bipush #48
    //   96: lushr
    //   97: l2i
    //   98: istore #13
    //   100: pop2
    //   101: dup2
    //   102: ldc2_w 68359059197192
    //   105: lxor
    //   106: lstore #14
    //   108: dup2
    //   109: ldc2_w 52960767460442
    //   112: lxor
    //   113: dup2
    //   114: bipush #56
    //   116: lushr
    //   117: l2i
    //   118: istore #16
    //   120: dup2
    //   121: bipush #8
    //   123: lshl
    //   124: bipush #32
    //   126: lushr
    //   127: l2i
    //   128: istore #17
    //   130: dup2
    //   131: bipush #40
    //   133: lshl
    //   134: bipush #40
    //   136: lushr
    //   137: l2i
    //   138: istore #18
    //   140: pop2
    //   141: dup2
    //   142: ldc2_w 135690316490862
    //   145: lxor
    //   146: lstore #19
    //   148: dup2
    //   149: ldc2_w 16323487949665
    //   152: lxor
    //   153: lstore #21
    //   155: dup2
    //   156: ldc2_w 116849856791138
    //   159: lxor
    //   160: lstore #23
    //   162: dup2
    //   163: ldc2_w 123414477326777
    //   166: lxor
    //   167: dup2
    //   168: bipush #48
    //   170: lushr
    //   171: l2i
    //   172: istore #25
    //   174: dup2
    //   175: bipush #16
    //   177: lshl
    //   178: bipush #32
    //   180: lushr
    //   181: l2i
    //   182: istore #26
    //   184: dup2
    //   185: bipush #48
    //   187: lshl
    //   188: bipush #48
    //   190: lushr
    //   191: l2i
    //   192: istore #27
    //   194: pop2
    //   195: pop2
    //   196: ldc2_w -2798774890433370933
    //   199: lload_1
    //   200: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   205: astore #29
    //   207: aload_0
    //   208: getfield f : Ljava/util/concurrent/BlockingQueue;
    //   211: invokeinterface isEmpty : ()Z
    //   216: ifeq -> 230
    //   219: return
    //   220: ldc2_w -2793689696972428176
    //   223: lload_1
    //   224: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   229: athrow
    //   230: new java/util/ArrayList
    //   233: dup
    //   234: invokespecial <init> : ()V
    //   237: astore #30
    //   239: aload_0
    //   240: getfield f : Ljava/util/concurrent/BlockingQueue;
    //   243: invokeinterface isEmpty : ()Z
    //   248: ifne -> 440
    //   251: aload_0
    //   252: getfield f : Ljava/util/concurrent/BlockingQueue;
    //   255: lload_1
    //   256: lconst_0
    //   257: lcmp
    //   258: iflt -> 275
    //   261: aload #29
    //   263: ifnonnull -> 444
    //   266: ldc2_w -2809895882344518748
    //   269: lload_1
    //   270: <illegal opcode> b : (Ljava/util/concurrent/BlockingQueue;JJ)Ljava/lang/Object;
    //   275: checkcast me/konsolas/aac/l_
    //   278: ldc2_w -2808247226129051920
    //   281: lload_1
    //   282: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   287: lload_1
    //   288: lconst_0
    //   289: lcmp
    //   290: ifle -> 371
    //   293: aload #29
    //   295: ifnonnull -> 371
    //   298: goto -> 311
    //   301: ldc2_w -2793689696972428176
    //   304: lload_1
    //   305: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   310: athrow
    //   311: ifnonnull -> 392
    //   314: goto -> 327
    //   317: ldc2_w -2793689696972428176
    //   320: lload_1
    //   321: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   326: athrow
    //   327: aload_0
    //   328: getfield f : Ljava/util/concurrent/BlockingQueue;
    //   331: aload #29
    //   333: ifnonnull -> 444
    //   336: goto -> 349
    //   339: ldc2_w -2793689696972428176
    //   342: lload_1
    //   343: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   348: athrow
    //   349: ldc2_w -2809895882344518748
    //   352: lload_1
    //   353: <illegal opcode> b : (Ljava/util/concurrent/BlockingQueue;JJ)Ljava/lang/Object;
    //   358: goto -> 371
    //   361: ldc2_w -2793689696972428176
    //   364: lload_1
    //   365: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   370: athrow
    //   371: checkcast me/konsolas/aac/l_
    //   374: ldc2_w -2792410525521427228
    //   377: lload_1
    //   378: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Z
    //   383: lload_1
    //   384: lconst_0
    //   385: lcmp
    //   386: iflt -> 415
    //   389: ifeq -> 440
    //   392: aload #30
    //   394: aload_0
    //   395: getfield f : Ljava/util/concurrent/BlockingQueue;
    //   398: ldc2_w -2794267231297027909
    //   401: lload_1
    //   402: <illegal opcode> b : (Ljava/util/concurrent/BlockingQueue;JJ)Ljava/lang/Object;
    //   407: checkcast me/konsolas/aac/l_
    //   410: invokeinterface add : (Ljava/lang/Object;)Z
    //   415: pop
    //   416: aload #29
    //   418: ifnull -> 239
    //   421: lload_1
    //   422: lconst_0
    //   423: lcmp
    //   424: iflt -> 440
    //   427: goto -> 440
    //   430: ldc2_w -2793689696972428176
    //   433: lload_1
    //   434: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   439: athrow
    //   440: aload_0
    //   441: getfield f : Ljava/util/concurrent/BlockingQueue;
    //   444: invokeinterface iterator : ()Ljava/util/Iterator;
    //   449: astore #31
    //   451: aload #31
    //   453: invokeinterface hasNext : ()Z
    //   458: ifeq -> 491
    //   461: aload #31
    //   463: invokeinterface next : ()Ljava/lang/Object;
    //   468: checkcast me/konsolas/aac/l_
    //   471: astore #32
    //   473: aload #32
    //   475: iconst_1
    //   476: ldc2_w -2805191314730095805
    //   479: lload_1
    //   480: <illegal opcode> w : (Lme/konsolas/aac/l_;ZJJ)Z
    //   485: pop
    //   486: aload #29
    //   488: ifnull -> 451
    //   491: aload_0
    //   492: ldc2_w -2851986369004559160
    //   495: lload_1
    //   496: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   501: aload_0
    //   502: ldc2_w -2863481315083987915
    //   505: lload_1
    //   506: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   511: iload #8
    //   513: i2b
    //   514: swap
    //   515: iload #9
    //   517: swap
    //   518: iload #10
    //   520: ldc2_w -2857673419269680529
    //   523: lload_1
    //   524: <illegal opcode> b : (Lme/konsolas/aac/AAC;BILorg/bukkit/entity/Player;IJJ)Lme/konsolas/aac/kP;
    //   529: lload_1
    //   530: lconst_0
    //   531: lcmp
    //   532: iflt -> 468
    //   535: astore #31
    //   537: new java/util/ArrayList
    //   540: dup
    //   541: invokespecial <init> : ()V
    //   544: astore #32
    //   546: aload #30
    //   548: invokeinterface iterator : ()Ljava/util/Iterator;
    //   553: astore #33
    //   555: aload #33
    //   557: invokeinterface hasNext : ()Z
    //   562: ifeq -> 2746
    //   565: aload #33
    //   567: invokeinterface next : ()Ljava/lang/Object;
    //   572: checkcast me/konsolas/aac/l_
    //   575: astore #34
    //   577: lload_1
    //   578: lconst_0
    //   579: lcmp
    //   580: iflt -> 610
    //   583: aload #34
    //   585: ldc2_w -2765899307495109089
    //   588: lload_1
    //   589: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   594: ifnonnull -> 610
    //   597: goto -> 555
    //   600: ldc2_w -2793689696972428176
    //   603: lload_1
    //   604: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   609: athrow
    //   610: lload_1
    //   611: lconst_0
    //   612: lcmp
    //   613: iflt -> 654
    //   616: aload_0
    //   617: ldc2_w -2863481315083987915
    //   620: lload_1
    //   621: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   626: ldc2_w -2757081732666501728
    //   629: lload_1
    //   630: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Lorg/bukkit/entity/Entity;
    //   635: ifnull -> 654
    //   638: getstatic me/konsolas/aac/ch.l : Lorg/bukkit/util/Vector;
    //   641: goto -> 687
    //   644: ldc2_w -2793689696972428176
    //   647: lload_1
    //   648: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   653: athrow
    //   654: aload #34
    //   656: ldc2_w -2808247226129051920
    //   659: lload_1
    //   660: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   665: ifnonnull -> 684
    //   668: getstatic me/konsolas/aac/ch.j : Lorg/bukkit/util/Vector;
    //   671: goto -> 687
    //   674: ldc2_w -2793689696972428176
    //   677: lload_1
    //   678: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   683: athrow
    //   684: getstatic me/konsolas/aac/ch.o : Lorg/bukkit/util/Vector;
    //   687: astore #35
    //   689: ldc2_w -2797585835267899268
    //   692: lload_1
    //   693: <illegal opcode> w : (JJ)Lcom/comphenix/protocol/ProtocolManager;
    //   698: aload_0
    //   699: ldc2_w -2863481315083987915
    //   702: lload_1
    //   703: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   708: ldc2_w -2796312017009732356
    //   711: lload_1
    //   712: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Lorg/bukkit/World;
    //   717: aload #34
    //   719: ldc2_w -2775088399187438630
    //   722: lload_1
    //   723: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)I
    //   728: ldc2_w -2862446849057390110
    //   731: lload_1
    //   732: <illegal opcode> b : (Lcom/comphenix/protocol/ProtocolManager;Lorg/bukkit/World;IJJ)Lorg/bukkit/entity/Entity;
    //   737: astore #36
    //   739: aload #36
    //   741: instanceof org/bukkit/entity/LivingEntity
    //   744: aload #29
    //   746: ifnonnull -> 783
    //   749: ifeq -> 2741
    //   752: goto -> 765
    //   755: ldc2_w -2793689696972428176
    //   758: lload_1
    //   759: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   764: athrow
    //   765: aload #36
    //   767: instanceof org/bukkit/entity/Enderman
    //   770: goto -> 783
    //   773: ldc2_w -2793689696972428176
    //   776: lload_1
    //   777: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   782: athrow
    //   783: ifne -> 2741
    //   786: aload_0
    //   787: ldc2_w -2851986369004559160
    //   790: lload_1
    //   791: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   796: ldc2_w -2755666403290600495
    //   799: lload_1
    //   800: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/timings/EntityTracker;
    //   805: lload #21
    //   807: aload #36
    //   809: checkcast org/bukkit/entity/LivingEntity
    //   812: ldc2_w -2808953310258513272
    //   815: lload_1
    //   816: <illegal opcode> b : (Lme/konsolas/aac/timings/EntityTracker;JLorg/bukkit/entity/LivingEntity;JJ)V
    //   821: aload_0
    //   822: ldc2_w -2851986369004559160
    //   825: lload_1
    //   826: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   831: ldc2_w -2755666403290600495
    //   834: lload_1
    //   835: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/timings/EntityTracker;
    //   840: iload #11
    //   842: aload #36
    //   844: checkcast org/bukkit/entity/LivingEntity
    //   847: iload #12
    //   849: i2c
    //   850: iload #13
    //   852: i2s
    //   853: ldc2_w -2752518263310826583
    //   856: lload_1
    //   857: <illegal opcode> b : (Lme/konsolas/aac/timings/EntityTracker;ILorg/bukkit/entity/LivingEntity;CSJJ)Ljava/util/List;
    //   862: astore #37
    //   864: aload #29
    //   866: lload_1
    //   867: lconst_0
    //   868: lcmp
    //   869: iflt -> 934
    //   872: ifnonnull -> 932
    //   875: aload #37
    //   877: ifnull -> 2514
    //   880: goto -> 893
    //   883: ldc2_w -2793689696972428176
    //   886: lload_1
    //   887: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   892: athrow
    //   893: aload #32
    //   895: invokeinterface clear : ()V
    //   900: aload #32
    //   902: aload #34
    //   904: ldc2_w -2765899307495109089
    //   907: lload_1
    //   908: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   913: invokeinterface add : (Ljava/lang/Object;)Z
    //   918: pop
    //   919: goto -> 932
    //   922: ldc2_w -2793689696972428176
    //   925: lload_1
    //   926: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   931: athrow
    //   932: aload #29
    //   934: ifnonnull -> 1053
    //   937: aload #34
    //   939: ldc2_w -2808247226129051920
    //   942: lload_1
    //   943: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   948: ifnull -> 1110
    //   951: goto -> 964
    //   954: ldc2_w -2793689696972428176
    //   957: lload_1
    //   958: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   963: athrow
    //   964: aload #32
    //   966: aload #34
    //   968: ldc2_w -2808247226129051920
    //   971: lload_1
    //   972: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   977: invokeinterface add : (Ljava/lang/Object;)Z
    //   982: pop
    //   983: aload #32
    //   985: aload #34
    //   987: ldc2_w -2808247226129051920
    //   990: lload_1
    //   991: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   996: ldc2_w -2750125838206255081
    //   999: lload_1
    //   1000: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/Location;
    //   1005: aload #34
    //   1007: ldc2_w -2765899307495109089
    //   1010: lload_1
    //   1011: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   1016: ldc2_w -2860175864971273797
    //   1019: lload_1
    //   1020: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/util/Vector;
    //   1025: ldc2_w -2803395550378976040
    //   1028: lload_1
    //   1029: <illegal opcode> b : (Lorg/bukkit/Location;Lorg/bukkit/util/Vector;JJ)Lorg/bukkit/Location;
    //   1034: invokeinterface add : (Ljava/lang/Object;)Z
    //   1039: pop
    //   1040: goto -> 1053
    //   1043: ldc2_w -2793689696972428176
    //   1046: lload_1
    //   1047: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1052: athrow
    //   1053: aload #32
    //   1055: aload #34
    //   1057: ldc2_w -2765899307495109089
    //   1060: lload_1
    //   1061: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   1066: ldc2_w -2750125838206255081
    //   1069: lload_1
    //   1070: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/Location;
    //   1075: aload #34
    //   1077: ldc2_w -2808247226129051920
    //   1080: lload_1
    //   1081: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   1086: ldc2_w -2860175864971273797
    //   1089: lload_1
    //   1090: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/util/Vector;
    //   1095: ldc2_w -2803395550378976040
    //   1098: lload_1
    //   1099: <illegal opcode> b : (Lorg/bukkit/Location;Lorg/bukkit/util/Vector;JJ)Lorg/bukkit/Location;
    //   1104: invokeinterface add : (Ljava/lang/Object;)Z
    //   1109: pop
    //   1110: aconst_null
    //   1111: astore #38
    //   1113: getstatic me/konsolas/aac/mF.POSES : Ljava/util/List;
    //   1116: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1121: astore #39
    //   1123: aload #39
    //   1125: invokeinterface hasNext : ()Z
    //   1130: ifeq -> 1313
    //   1133: aload #39
    //   1135: invokeinterface next : ()Ljava/lang/Object;
    //   1140: checkcast me/konsolas/aac/mF
    //   1143: astore #40
    //   1145: aload #40
    //   1147: aload #31
    //   1149: ldc2_w -2804357338658387933
    //   1152: lload_1
    //   1153: <illegal opcode> b : (Lme/konsolas/aac/mF;Lme/konsolas/aac/kP;JJ)F
    //   1158: f2d
    //   1159: dstore #41
    //   1161: aload #32
    //   1163: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1168: aload #29
    //   1170: ifnonnull -> 557
    //   1173: astore #43
    //   1175: aload #43
    //   1177: invokeinterface hasNext : ()Z
    //   1182: ifeq -> 1302
    //   1185: aload #43
    //   1187: invokeinterface next : ()Ljava/lang/Object;
    //   1192: checkcast org/bukkit/Location
    //   1195: astore #44
    //   1197: aload #44
    //   1199: ldc2_w -2750125838206255081
    //   1202: lload_1
    //   1203: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/Location;
    //   1208: dconst_0
    //   1209: dload #41
    //   1211: dconst_0
    //   1212: ldc2_w -2805176830737505834
    //   1215: lload_1
    //   1216: <illegal opcode> b : (Lorg/bukkit/Location;DDDJJ)Lorg/bukkit/Location;
    //   1221: astore #44
    //   1223: aload_0
    //   1224: iload_3
    //   1225: aload #44
    //   1227: aload #37
    //   1229: lload #4
    //   1231: aload #35
    //   1233: ldc2_w -2743758304064173106
    //   1236: lload_1
    //   1237: <illegal opcode> Ö : (Lme/konsolas/aac/ch;ILorg/bukkit/Location;Ljava/lang/Iterable;JLorg/bukkit/util/Vector;JJ)Lme/konsolas/aac/ke;
    //   1242: astore #45
    //   1244: aload #45
    //   1246: aload #29
    //   1248: ifnonnull -> 1295
    //   1251: aload #38
    //   1253: lload #6
    //   1255: dup2_x2
    //   1256: pop2
    //   1257: ldc2_w -2797756685930031505
    //   1260: lload_1
    //   1261: <illegal opcode> w : (JLme/konsolas/aac/ke;Lme/konsolas/aac/ke;JJ)Z
    //   1266: aload #29
    //   1268: ifnonnull -> 1130
    //   1271: lload_1
    //   1272: lconst_0
    //   1273: lcmp
    //   1274: ifle -> 562
    //   1277: goto -> 1290
    //   1280: ldc2_w -2793689696972428176
    //   1283: lload_1
    //   1284: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1289: athrow
    //   1290: ifeq -> 1297
    //   1293: aload #45
    //   1295: astore #38
    //   1297: aload #29
    //   1299: ifnull -> 1175
    //   1302: aload #29
    //   1304: lload_1
    //   1305: lconst_0
    //   1306: lcmp
    //   1307: iflt -> 1192
    //   1310: ifnull -> 1123
    //   1313: getstatic me/konsolas/aac/ch.a : Z
    //   1316: aload #29
    //   1318: lload_1
    //   1319: lconst_0
    //   1320: lcmp
    //   1321: ifle -> 746
    //   1324: lload_1
    //   1325: lconst_0
    //   1326: lcmp
    //   1327: ifle -> 1425
    //   1330: ifnonnull -> 1423
    //   1333: ifne -> 1403
    //   1336: goto -> 1349
    //   1339: ldc2_w -2793689696972428176
    //   1342: lload_1
    //   1343: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1348: athrow
    //   1349: aload #38
    //   1351: aload #29
    //   1353: ifnonnull -> 1405
    //   1356: goto -> 1369
    //   1359: ldc2_w -2793689696972428176
    //   1362: lload_1
    //   1363: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1368: athrow
    //   1369: ifnonnull -> 1403
    //   1372: goto -> 1385
    //   1375: ldc2_w -2793689696972428176
    //   1378: lload_1
    //   1379: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1384: athrow
    //   1385: new java/lang/AssertionError
    //   1388: dup
    //   1389: invokespecial <init> : ()V
    //   1392: athrow
    //   1393: ldc2_w -2793689696972428176
    //   1396: lload_1
    //   1397: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1402: athrow
    //   1403: aload #38
    //   1405: ldc2_w -2846349011476665746
    //   1408: lload_1
    //   1409: <illegal opcode> w : (Lme/konsolas/aac/ke;JJ)D
    //   1414: ldc2_w -2744294076331028780
    //   1417: lload_1
    //   1418: <illegal opcode> w : (DJJ)Z
    //   1423: aload #29
    //   1425: ifnonnull -> 1766
    //   1428: ifne -> 1725
    //   1431: goto -> 1444
    //   1434: ldc2_w -2793689696972428176
    //   1437: lload_1
    //   1438: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1443: athrow
    //   1444: iload #16
    //   1446: i2b
    //   1447: aload #38
    //   1449: iload #17
    //   1451: iload #18
    //   1453: ldc2_w -2745563699747411901
    //   1456: lload_1
    //   1457: <illegal opcode> w : (BLme/konsolas/aac/ke;IIJJ)F
    //   1462: fstore #39
    //   1464: aload_0
    //   1465: ldc2_w -2851986369004559160
    //   1468: lload_1
    //   1469: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   1474: ldc2_w -2799565213754192079
    //   1477: lload_1
    //   1478: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   1483: aload_0
    //   1484: ldc2_w -2863481315083987915
    //   1487: lload_1
    //   1488: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   1493: lload #23
    //   1495: dup2_x1
    //   1496: pop2
    //   1497: ldc2_w -2808672605242473445
    //   1500: lload_1
    //   1501: <illegal opcode> b : (Lme/konsolas/aac/w;JLorg/bukkit/entity/Player;JJ)Z
    //   1506: aload #29
    //   1508: ifnonnull -> 1696
    //   1511: ifeq -> 1634
    //   1514: goto -> 1527
    //   1517: ldc2_w -2793689696972428176
    //   1520: lload_1
    //   1521: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1526: athrow
    //   1527: aload_0
    //   1528: ldc2_w -2851986369004559160
    //   1531: lload_1
    //   1532: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   1537: ldc2_w -2799565213754192079
    //   1540: lload_1
    //   1541: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   1546: aload_0
    //   1547: ldc2_w -2863481315083987915
    //   1550: lload_1
    //   1551: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   1556: sipush #22787
    //   1559: ldc2_w 5472198891562436793
    //   1562: lload_1
    //   1563: lxor
    //   1564: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1569: iconst_2
    //   1570: anewarray java/lang/Object
    //   1573: dup
    //   1574: iconst_0
    //   1575: aload_0
    //   1576: getfield i : Lme/konsolas/aac/O;
    //   1579: ldc2_w -2801609596046021376
    //   1582: lload_1
    //   1583: <illegal opcode> b : (Lme/konsolas/aac/O;JJ)F
    //   1588: ldc2_w -2877803090694811453
    //   1591: lload_1
    //   1592: <illegal opcode> w : (FJJ)Ljava/lang/Float;
    //   1597: aastore
    //   1598: dup
    //   1599: iconst_1
    //   1600: fload #39
    //   1602: ldc2_w -2877803090694811453
    //   1605: lload_1
    //   1606: <illegal opcode> w : (FJJ)Ljava/lang/Float;
    //   1611: aastore
    //   1612: ldc2_w -2773849129512441850
    //   1615: lload_1
    //   1616: <illegal opcode> b : (Lme/konsolas/aac/w;Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;JJ)V
    //   1621: goto -> 1634
    //   1624: ldc2_w -2793689696972428176
    //   1627: lload_1
    //   1628: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1633: athrow
    //   1634: aload_0
    //   1635: getfield i : Lme/konsolas/aac/O;
    //   1638: fload #39
    //   1640: lload #19
    //   1642: ldc2_w -2798668566419423783
    //   1645: lload_1
    //   1646: <illegal opcode> b : (Lme/konsolas/aac/O;FJJJ)Z
    //   1651: lload_1
    //   1652: lconst_0
    //   1653: lcmp
    //   1654: ifle -> 1683
    //   1657: pop
    //   1658: aload_0
    //   1659: aload #29
    //   1661: ifnonnull -> 1700
    //   1664: getfield g : Lme/konsolas/aac/iV;
    //   1667: iload #25
    //   1669: i2c
    //   1670: iload #26
    //   1672: iload #27
    //   1674: ldc2_w -2765438154279713313
    //   1677: lload_1
    //   1678: <illegal opcode> b : (Lme/konsolas/aac/iV;CIIJJ)Z
    //   1683: goto -> 1696
    //   1686: ldc2_w -2793689696972428176
    //   1689: lload_1
    //   1690: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1695: athrow
    //   1696: ifeq -> 1722
    //   1699: aload_0
    //   1700: ldc2_w -2796069071351127046
    //   1703: lload_1
    //   1704: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
    //   1709: fload #39
    //   1711: lload #14
    //   1713: ldc2_w -2793891230528365202
    //   1716: lload_1
    //   1717: <illegal opcode> b : (Lme/konsolas/aac/ck;Lme/konsolas/aac/eA;FJJJ)V
    //   1722: goto -> 2503
    //   1725: aload #38
    //   1727: aload #29
    //   1729: ifnonnull -> 2206
    //   1732: ldc2_w -2846349011476665746
    //   1735: lload_1
    //   1736: <illegal opcode> w : (Lme/konsolas/aac/ke;JJ)D
    //   1741: aload #38
    //   1743: ldc2_w -2795110885778028333
    //   1746: lload_1
    //   1747: <illegal opcode> w : (Lme/konsolas/aac/ke;JJ)D
    //   1752: dcmpl
    //   1753: goto -> 1766
    //   1756: ldc2_w -2793689696972428176
    //   1759: lload_1
    //   1760: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1765: athrow
    //   1766: ifle -> 2204
    //   1769: iload #16
    //   1771: i2b
    //   1772: aload #38
    //   1774: iload #17
    //   1776: iload #18
    //   1778: ldc2_w -2745563699747411901
    //   1781: lload_1
    //   1782: <illegal opcode> w : (BLme/konsolas/aac/ke;IIJJ)F
    //   1787: fstore #39
    //   1789: aload_0
    //   1790: ldc2_w -2851986369004559160
    //   1793: lload_1
    //   1794: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   1799: ldc2_w -2799565213754192079
    //   1802: lload_1
    //   1803: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   1808: aload_0
    //   1809: ldc2_w -2863481315083987915
    //   1812: lload_1
    //   1813: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   1818: lload #23
    //   1820: dup2_x1
    //   1821: pop2
    //   1822: ldc2_w -2808672605242473445
    //   1825: lload_1
    //   1826: <illegal opcode> b : (Lme/konsolas/aac/w;JLorg/bukkit/entity/Player;JJ)Z
    //   1831: aload #29
    //   1833: ifnonnull -> 2175
    //   1836: ifeq -> 2113
    //   1839: goto -> 1852
    //   1842: ldc2_w -2793689696972428176
    //   1845: lload_1
    //   1846: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1851: athrow
    //   1852: getstatic me/konsolas/aac/ch.a : Z
    //   1855: ifne -> 1916
    //   1858: goto -> 1871
    //   1861: ldc2_w -2793689696972428176
    //   1864: lload_1
    //   1865: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1870: athrow
    //   1871: aload #38
    //   1873: ldc2_w -2858831613026029900
    //   1876: lload_1
    //   1877: <illegal opcode> w : (Lme/konsolas/aac/ke;JJ)Lme/konsolas/aac/d7;
    //   1882: ifnonnull -> 1916
    //   1885: goto -> 1898
    //   1888: ldc2_w -2793689696972428176
    //   1891: lload_1
    //   1892: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1897: athrow
    //   1898: new java/lang/AssertionError
    //   1901: dup
    //   1902: invokespecial <init> : ()V
    //   1905: athrow
    //   1906: ldc2_w -2793689696972428176
    //   1909: lload_1
    //   1910: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1915: athrow
    //   1916: aload_0
    //   1917: ldc2_w -2851986369004559160
    //   1920: lload_1
    //   1921: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   1926: ldc2_w -2799565213754192079
    //   1929: lload_1
    //   1930: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   1935: aload_0
    //   1936: ldc2_w -2863481315083987915
    //   1939: lload_1
    //   1940: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   1945: sipush #619
    //   1948: ldc2_w 5893288052375442388
    //   1951: lload_1
    //   1952: lxor
    //   1953: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1958: iconst_5
    //   1959: anewarray java/lang/Object
    //   1962: dup
    //   1963: iconst_0
    //   1964: aload #38
    //   1966: ldc2_w -2858831613026029900
    //   1969: lload_1
    //   1970: <illegal opcode> w : (Lme/konsolas/aac/ke;JJ)Lme/konsolas/aac/d7;
    //   1975: ldc2_w -2803831719945364645
    //   1978: lload_1
    //   1979: <illegal opcode> b : (Lme/konsolas/aac/d7;JJ)Lorg/bukkit/util/BlockVector;
    //   1984: aload_0
    //   1985: ldc2_w -2863481315083987915
    //   1988: lload_1
    //   1989: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   1994: ldc2_w -2796312017009732356
    //   1997: lload_1
    //   1998: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Lorg/bukkit/World;
    //   2003: ldc2_w -2798064636456916186
    //   2006: lload_1
    //   2007: <illegal opcode> b : (Lorg/bukkit/util/BlockVector;Lorg/bukkit/World;JJ)Lorg/bukkit/Location;
    //   2012: ldc2_w -2761116262765979634
    //   2015: lload_1
    //   2016: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/block/Block;
    //   2021: ldc2_w -2805671938160337494
    //   2024: lload_1
    //   2025: <illegal opcode> b : (Lorg/bukkit/block/Block;JJ)Lorg/bukkit/Material;
    //   2030: aastore
    //   2031: dup
    //   2032: iconst_1
    //   2033: aload #38
    //   2035: ldc2_w -2846349011476665746
    //   2038: lload_1
    //   2039: <illegal opcode> w : (Lme/konsolas/aac/ke;JJ)D
    //   2044: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2047: aastore
    //   2048: dup
    //   2049: iconst_2
    //   2050: aload #38
    //   2052: ldc2_w -2795110885778028333
    //   2055: lload_1
    //   2056: <illegal opcode> w : (Lme/konsolas/aac/ke;JJ)D
    //   2061: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2064: aastore
    //   2065: dup
    //   2066: iconst_3
    //   2067: aload_0
    //   2068: getfield i : Lme/konsolas/aac/O;
    //   2071: ldc2_w -2801609596046021376
    //   2074: lload_1
    //   2075: <illegal opcode> b : (Lme/konsolas/aac/O;JJ)F
    //   2080: ldc2_w -2877803090694811453
    //   2083: lload_1
    //   2084: <illegal opcode> w : (FJJ)Ljava/lang/Float;
    //   2089: aastore
    //   2090: dup
    //   2091: iconst_4
    //   2092: fload #39
    //   2094: ldc2_w -2877803090694811453
    //   2097: lload_1
    //   2098: <illegal opcode> w : (FJJ)Ljava/lang/Float;
    //   2103: aastore
    //   2104: ldc2_w -2773849129512441850
    //   2107: lload_1
    //   2108: <illegal opcode> b : (Lme/konsolas/aac/w;Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;JJ)V
    //   2113: aload_0
    //   2114: getfield i : Lme/konsolas/aac/O;
    //   2117: fload #39
    //   2119: lload #19
    //   2121: ldc2_w -2798668566419423783
    //   2124: lload_1
    //   2125: <illegal opcode> b : (Lme/konsolas/aac/O;FJJJ)Z
    //   2130: lload_1
    //   2131: lconst_0
    //   2132: lcmp
    //   2133: ifle -> 2162
    //   2136: pop
    //   2137: aload_0
    //   2138: aload #29
    //   2140: ifnonnull -> 2179
    //   2143: getfield g : Lme/konsolas/aac/iV;
    //   2146: iload #25
    //   2148: i2c
    //   2149: iload #26
    //   2151: iload #27
    //   2153: ldc2_w -2765438154279713313
    //   2156: lload_1
    //   2157: <illegal opcode> b : (Lme/konsolas/aac/iV;CIIJJ)Z
    //   2162: goto -> 2175
    //   2165: ldc2_w -2793689696972428176
    //   2168: lload_1
    //   2169: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   2174: athrow
    //   2175: ifeq -> 2201
    //   2178: aload_0
    //   2179: ldc2_w -2757657269556274013
    //   2182: lload_1
    //   2183: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
    //   2188: fload #39
    //   2190: lload #14
    //   2192: ldc2_w -2793891230528365202
    //   2195: lload_1
    //   2196: <illegal opcode> b : (Lme/konsolas/aac/ck;Lme/konsolas/aac/eA;FJJJ)V
    //   2201: goto -> 2503
    //   2204: aload #38
    //   2206: astore #28
    //   2208: iload #16
    //   2210: i2b
    //   2211: aload #28
    //   2213: iload #17
    //   2215: iload #18
    //   2217: ldc2_w -2745563699747411901
    //   2220: lload_1
    //   2221: <illegal opcode> w : (BLme/konsolas/aac/ke;IIJJ)F
    //   2226: fstore #39
    //   2228: aload_0
    //   2229: ldc2_w -2851986369004559160
    //   2232: lload_1
    //   2233: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   2238: ldc2_w -2799565213754192079
    //   2241: lload_1
    //   2242: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   2247: aload_0
    //   2248: ldc2_w -2863481315083987915
    //   2251: lload_1
    //   2252: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   2257: lload #23
    //   2259: dup2_x1
    //   2260: pop2
    //   2261: ldc2_w -2808672605242473445
    //   2264: lload_1
    //   2265: <illegal opcode> b : (Lme/konsolas/aac/w;JLorg/bukkit/entity/Player;JJ)Z
    //   2270: aload #29
    //   2272: ifnonnull -> 2477
    //   2275: ifeq -> 2415
    //   2278: goto -> 2291
    //   2281: ldc2_w -2793689696972428176
    //   2284: lload_1
    //   2285: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   2290: athrow
    //   2291: aload_0
    //   2292: ldc2_w -2851986369004559160
    //   2295: lload_1
    //   2296: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   2301: ldc2_w -2799565213754192079
    //   2304: lload_1
    //   2305: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   2310: aload_0
    //   2311: ldc2_w -2863481315083987915
    //   2314: lload_1
    //   2315: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   2320: sipush #15416
    //   2323: ldc2_w 3490053916041276805
    //   2326: lload_1
    //   2327: lxor
    //   2328: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2333: iconst_3
    //   2334: anewarray java/lang/Object
    //   2337: dup
    //   2338: iconst_0
    //   2339: aload #38
    //   2341: ldc2_w -2846349011476665746
    //   2344: lload_1
    //   2345: <illegal opcode> w : (Lme/konsolas/aac/ke;JJ)D
    //   2350: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2353: aastore
    //   2354: dup
    //   2355: iconst_1
    //   2356: aload_0
    //   2357: getfield i : Lme/konsolas/aac/O;
    //   2360: ldc2_w -2801609596046021376
    //   2363: lload_1
    //   2364: <illegal opcode> b : (Lme/konsolas/aac/O;JJ)F
    //   2369: ldc2_w -2877803090694811453
    //   2372: lload_1
    //   2373: <illegal opcode> w : (FJJ)Ljava/lang/Float;
    //   2378: aastore
    //   2379: dup
    //   2380: iconst_2
    //   2381: fload #39
    //   2383: ldc2_w -2877803090694811453
    //   2386: lload_1
    //   2387: <illegal opcode> w : (FJJ)Ljava/lang/Float;
    //   2392: aastore
    //   2393: ldc2_w -2773849129512441850
    //   2396: lload_1
    //   2397: <illegal opcode> b : (Lme/konsolas/aac/w;Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;JJ)V
    //   2402: goto -> 2415
    //   2405: ldc2_w -2793689696972428176
    //   2408: lload_1
    //   2409: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   2414: athrow
    //   2415: aload_0
    //   2416: getfield i : Lme/konsolas/aac/O;
    //   2419: fload #39
    //   2421: lload #19
    //   2423: ldc2_w -2798668566419423783
    //   2426: lload_1
    //   2427: <illegal opcode> b : (Lme/konsolas/aac/O;FJJJ)Z
    //   2432: lload_1
    //   2433: lconst_0
    //   2434: lcmp
    //   2435: ifle -> 2464
    //   2438: pop
    //   2439: aload_0
    //   2440: aload #29
    //   2442: ifnonnull -> 2481
    //   2445: getfield g : Lme/konsolas/aac/iV;
    //   2448: iload #25
    //   2450: i2c
    //   2451: iload #26
    //   2453: iload #27
    //   2455: ldc2_w -2765438154279713313
    //   2458: lload_1
    //   2459: <illegal opcode> b : (Lme/konsolas/aac/iV;CIIJJ)Z
    //   2464: goto -> 2477
    //   2467: ldc2_w -2793689696972428176
    //   2470: lload_1
    //   2471: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   2476: athrow
    //   2477: ifeq -> 2503
    //   2480: aload_0
    //   2481: ldc2_w -2764258063170034313
    //   2484: lload_1
    //   2485: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
    //   2490: fload #39
    //   2492: lload #14
    //   2494: ldc2_w -2793891230528365202
    //   2497: lload_1
    //   2498: <illegal opcode> b : (Lme/konsolas/aac/ck;Lme/konsolas/aac/eA;FJJJ)V
    //   2503: aload #29
    //   2505: lload_1
    //   2506: lconst_0
    //   2507: lcmp
    //   2508: iflt -> 2743
    //   2511: ifnull -> 2741
    //   2514: aload_0
    //   2515: ldc2_w -2851986369004559160
    //   2518: lload_1
    //   2519: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   2524: ldc2_w -2799565213754192079
    //   2527: lload_1
    //   2528: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   2533: aload_0
    //   2534: ldc2_w -2863481315083987915
    //   2537: lload_1
    //   2538: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   2543: aload #29
    //   2545: lload_1
    //   2546: lconst_0
    //   2547: lcmp
    //   2548: ifle -> 2732
    //   2551: ifnonnull -> 2638
    //   2554: goto -> 2567
    //   2557: ldc2_w -2793689696972428176
    //   2560: lload_1
    //   2561: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   2566: athrow
    //   2567: lload #23
    //   2569: dup2_x1
    //   2570: pop2
    //   2571: ldc2_w -2808672605242473445
    //   2574: lload_1
    //   2575: <illegal opcode> b : (Lme/konsolas/aac/w;JLorg/bukkit/entity/Player;JJ)Z
    //   2580: ifeq -> 2741
    //   2583: goto -> 2596
    //   2586: ldc2_w -2793689696972428176
    //   2589: lload_1
    //   2590: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   2595: athrow
    //   2596: aload_0
    //   2597: ldc2_w -2851986369004559160
    //   2600: lload_1
    //   2601: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lme/konsolas/aac/AAC;
    //   2606: ldc2_w -2799565213754192079
    //   2609: lload_1
    //   2610: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/w;
    //   2615: aload_0
    //   2616: ldc2_w -2863481315083987915
    //   2619: lload_1
    //   2620: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/entity/Player;
    //   2625: goto -> 2638
    //   2628: ldc2_w -2793689696972428176
    //   2631: lload_1
    //   2632: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   2637: athrow
    //   2638: new java/lang/StringBuilder
    //   2641: dup
    //   2642: invokespecial <init> : ()V
    //   2645: sipush #10523
    //   2648: ldc2_w 1714826318950103200
    //   2651: lload_1
    //   2652: lxor
    //   2653: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2658: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2661: aload #34
    //   2663: ldc2_w -2775088399187438630
    //   2666: lload_1
    //   2667: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)I
    //   2672: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2675: sipush #13900
    //   2678: ldc2_w 7627522318007035890
    //   2681: lload_1
    //   2682: lxor
    //   2683: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2688: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2691: aload #34
    //   2693: ldc2_w -2765899307495109089
    //   2696: lload_1
    //   2697: <illegal opcode> w : (Lme/konsolas/aac/l_;JJ)Lorg/bukkit/Location;
    //   2702: ldc2_w -2743105223276773232
    //   2705: lload_1
    //   2706: <illegal opcode> b : (Lorg/bukkit/Location;JJ)Lorg/bukkit/World;
    //   2711: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2714: checkcast org/bukkit/World
    //   2717: ldc2_w -2878186860128126962
    //   2720: lload_1
    //   2721: <illegal opcode> b : (Lorg/bukkit/World;JJ)Ljava/lang/String;
    //   2726: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2729: invokevirtual toString : ()Ljava/lang/String;
    //   2732: ldc2_w -2770908468633652378
    //   2735: lload_1
    //   2736: <illegal opcode> b : (Lme/konsolas/aac/w;Lorg/bukkit/entity/Player;Ljava/lang/String;JJ)V
    //   2741: aload #29
    //   2743: ifnull -> 555
    //   2746: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #108	-> 207
    //   #62	-> 230
    //   #29	-> 239
    //   #100	-> 392
    //   #84	-> 440
    //   #56	-> 473
    //   #28	-> 486
    //   #43	-> 491
    //   #93	-> 537
    //   #71	-> 546
    //   #38	-> 577
    //   #70	-> 610
    //   #13	-> 654
    //   #15	-> 689
    //   #101	-> 739
    //   #42	-> 786
    //   #45	-> 821
    //   #73	-> 864
    //   #111	-> 893
    //   #32	-> 900
    //   #79	-> 932
    //   #106	-> 964
    //   #67	-> 983
    //   #114	-> 1053
    //   #94	-> 1110
    //   #61	-> 1113
    //   #4	-> 1145
    //   #33	-> 1161
    //   #60	-> 1197
    //   #89	-> 1223
    //   #104	-> 1244
    //   #87	-> 1297
    //   #97	-> 1302
    //   #107	-> 1313
    //   #6	-> 1403
    //   #98	-> 1444
    //   #30	-> 1464
    //   #72	-> 1527
    //   #14	-> 1634
    //   #26	-> 1658
    //   #63	-> 1722
    //   #48	-> 1769
    //   #24	-> 1789
    //   #8	-> 1852
    //   #19	-> 1916
    //   #86	-> 1966
    //   #16	-> 2035
    //   #58	-> 2104
    //   #20	-> 2113
    //   #7	-> 2137
    //   #110	-> 2201
    //   #85	-> 2204
    //   #52	-> 2228
    //   #27	-> 2291
    //   #34	-> 2341
    //   #115	-> 2393
    //   #81	-> 2415
    //   #10	-> 2439
    //   #23	-> 2503
    //   #36	-> 2514
    //   #75	-> 2596
    //   #78	-> 2663
    //   #51	-> 2693
    //   #18	-> 2732
    //   #25	-> 2741
    //   #22	-> 2746
    // Exception table:
    //   from	to	target	type
    //   207	220	220	aacinternal/v
    //   251	298	301	aacinternal/v
    //   266	314	317	aacinternal/v
    //   311	336	339	aacinternal/v
    //   327	358	361	aacinternal/v
    //   371	421	430	aacinternal/v
    //   577	600	600	aacinternal/v
    //   610	644	644	aacinternal/v
    //   654	674	674	aacinternal/v
    //   739	752	755	aacinternal/v
    //   749	770	773	aacinternal/v
    //   864	880	883	aacinternal/v
    //   875	919	922	aacinternal/v
    //   932	951	954	aacinternal/v
    //   937	1040	1043	aacinternal/v
    //   1244	1271	1280	aacinternal/v
    //   1313	1336	1339	aacinternal/v
    //   1333	1356	1359	aacinternal/v
    //   1349	1372	1375	aacinternal/v
    //   1369	1393	1393	aacinternal/v
    //   1423	1431	1434	aacinternal/v
    //   1464	1514	1517	aacinternal/v
    //   1511	1621	1624	aacinternal/v
    //   1634	1683	1686	aacinternal/v
    //   1725	1753	1756	aacinternal/v
    //   1789	1839	1842	aacinternal/v
    //   1836	1858	1861	aacinternal/v
    //   1852	1885	1888	aacinternal/v
    //   1871	1906	1906	aacinternal/v
    //   2113	2162	2165	aacinternal/v
    //   2228	2278	2281	aacinternal/v
    //   2275	2402	2405	aacinternal/v
    //   2415	2464	2467	aacinternal/v
    //   2503	2554	2557	aacinternal/v
    //   2514	2583	2586	aacinternal/v
    //   2567	2625	2628	aacinternal/v
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -4298585669467206303
    //   3: ldc2_w -7969214960876919332
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
    //   15: ldc2_w 100396857828711
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/konsolas/aac/ch.p : J
    //   26: getstatic me/konsolas/aac/ch.p : J
    //   29: ldc2_w 70359895206162
    //   32: lxor
    //   33: lstore #9
    //   35: aconst_null
    //   36: new java/util/HashMap
    //   39: dup
    //   40: bipush #13
    //   42: invokespecial <init> : (I)V
    //   45: putstatic me/konsolas/aac/ch.s : Ljava/util/Map;
    //   48: ldc2_w 1791588448420424318
    //   51: lload #9
    //   53: <illegal opcode> w : (Ljava/lang/String;JJ)V
    //   58: ldc_w '⑧▾莮雦姭⭖㈖吔嶹뙸陻?ｈ?傳໅ᚺ᧤妰戴筦'
    //   61: invokevirtual toCharArray : ()[C
    //   64: dup
    //   65: dup
    //   66: bipush #17
    //   68: dup_x1
    //   69: caload
    //   70: sipush #29626
    //   73: ixor
    //   74: i2c
    //   75: castore
    //   76: sipush #11359
    //   79: iconst_1
    //   80: iconst_1
    //   81: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   84: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   87: dup
    //   88: astore_0
    //   89: iconst_2
    //   90: ldc_w '巈쨷ᖒ'
    //   93: invokevirtual toCharArray : ()[C
    //   96: dup
    //   97: dup
    //   98: iconst_2
    //   99: dup_x1
    //   100: caload
    //   101: sipush #263
    //   104: ixor
    //   105: i2c
    //   106: castore
    //   107: sipush #13516
    //   110: iconst_0
    //   111: iconst_0
    //   112: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   115: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
    //   118: bipush #8
    //   120: newarray byte
    //   122: dup
    //   123: iconst_0
    //   124: lload #9
    //   126: bipush #56
    //   128: lushr
    //   129: l2i
    //   130: i2b
    //   131: bastore
    //   132: iconst_1
    //   133: istore_1
    //   134: iload_1
    //   135: bipush #8
    //   137: if_icmpge -> 161
    //   140: dup
    //   141: iload_1
    //   142: lload #9
    //   144: iload_1
    //   145: bipush #8
    //   147: imul
    //   148: lshl
    //   149: bipush #56
    //   151: lushr
    //   152: l2i
    //   153: i2b
    //   154: bastore
    //   155: iinc #1, 1
    //   158: goto -> 134
    //   161: new javax/crypto/spec/DESKeySpec
    //   164: dup_x1
    //   165: swap
    //   166: invokespecial <init> : ([B)V
    //   169: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    //   172: new javax/crypto/spec/IvParameterSpec
    //   175: dup
    //   176: bipush #8
    //   178: newarray byte
    //   180: invokespecial <init> : ([B)V
    //   183: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   186: bipush #9
    //   188: anewarray java/lang/String
    //   191: astore #7
    //   193: iconst_0
    //   194: istore #5
    //   196: ldc_w '߽❒僫蕯읻ᅏ鬯鮜嵻꛼攗⊘葿㾰᫃튝Ѫ吉に㎸㷇㺄ⷎ鍘Ჭ믩ިମ師￣㹱켟扌ၱ瀭㪗㯶?ᎄꖍ헗଴ﱤ군潬舾륑鶹ꯉ嶋劻ᕎ흠둨셭㣁拥䛛뱶⭺沽뷃醁౵缰⬴⸀ྸ㶠珞囨讫첑⤛꠶夺奛錮陖?⣣縡趒れ⿎娯嵡葶䍬ẛ⦫᱀땭聁꣇쟹梨ﾖ蛖帩꾺㹄爰뇫翂왭ǂ쎝컋檩빣㶰霿湎禩?殁뜕誕風힌╛엠캰祱蛟稬㎺빼塞쿉뚻癙⾰憌ㄖᨁ̫감ꂀ毗蝱㗤ŭ찠얆쳖경?鞉↓䅭쯛ꮛ侊퀌4驭ꁄ뷽嫴쁒捓⪝꘴㙢搼幬뒇⡉?ˊ臡ᮩ春紁﷾䟽狷﷘䓣⡡棝앾鸲퉰绯?ꚼ耵蟓遙涰稪?뮿?䋦僀牂䪘䈞ꒊ濉?ꕲ뼗慶劔弮쪹얰疆鳠Ἔ겔↤菠叶庣뺍作죥ﮢ훐琁◂⇳뺋믛谵靲仧븀?淄㝓郇[賽꭪㔾퉩쇢プ෧뿱歯ꬎﵦๆ砒퓬켫ᮌꎟ愛鈤ㅚ鿺ﺫ趬퓖銠긲価儒壆葟ឺ薶럈蛴鋰䩌?暴ꑁ怼羱慧跮왳븜᭖絾吏엌ᶢ牫嫋ⴧ䗄ⓞ훲ᦿ'
    //   199: invokevirtual toCharArray : ()[C
    //   202: dup
    //   203: dup
    //   204: bipush #59
    //   206: dup_x1
    //   207: caload
    //   208: sipush #10570
    //   211: ixor
    //   212: i2c
    //   213: castore
    //   214: sipush #31954
    //   217: iconst_0
    //   218: iconst_0
    //   219: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   222: dup
    //   223: astore #4
    //   225: invokevirtual length : ()I
    //   228: istore #6
    //   230: bipush #56
    //   232: istore_3
    //   233: iconst_m1
    //   234: istore_2
    //   235: iinc #2, 1
    //   238: aload #4
    //   240: iload_2
    //   241: dup
    //   242: iload_3
    //   243: iadd
    //   244: invokevirtual substring : (II)Ljava/lang/String;
    //   247: iconst_m1
    //   248: goto -> 382
    //   251: aload #7
    //   253: swap
    //   254: iload #5
    //   256: iinc #5, 1
    //   259: swap
    //   260: aastore
    //   261: iload_2
    //   262: iload_3
    //   263: iadd
    //   264: dup
    //   265: istore_2
    //   266: iload #6
    //   268: if_icmpge -> 281
    //   271: aload #4
    //   273: iload_2
    //   274: invokevirtual charAt : (I)C
    //   277: istore_3
    //   278: goto -> 235
    //   281: ldc_w '歺醝⽻扦ၥꁁຽ臹ꄌ懲䚷﷈貾됪퓡豙凱疏껊얠?벭鵣?更줝Ë橩㱅Ǌ셡㾠樠ᛆ䎵ّ行伛슙낑䖊γ쑚ꂙ᧛㜞箐䨉㩹狤?뿛广쫼跸钔愠娺莨㑞㧵'
    //   284: invokevirtual toCharArray : ()[C
    //   287: dup
    //   288: dup
    //   289: bipush #44
    //   291: dup_x1
    //   292: caload
    //   293: sipush #5289
    //   296: ixor
    //   297: i2c
    //   298: castore
    //   299: sipush #13798
    //   302: iconst_1
    //   303: iconst_1
    //   304: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   307: dup
    //   308: astore #4
    //   310: invokevirtual length : ()I
    //   313: istore #6
    //   315: bipush #48
    //   317: istore_3
    //   318: iconst_m1
    //   319: istore_2
    //   320: iinc #2, 1
    //   323: aload #4
    //   325: iload_2
    //   326: dup
    //   327: iload_3
    //   328: iadd
    //   329: invokevirtual substring : (II)Ljava/lang/String;
    //   332: iconst_0
    //   333: goto -> 382
    //   336: aload #7
    //   338: swap
    //   339: iload #5
    //   341: iinc #5, 1
    //   344: swap
    //   345: aastore
    //   346: iload_2
    //   347: iload_3
    //   348: iadd
    //   349: dup
    //   350: istore_2
    //   351: iload #6
    //   353: if_icmpge -> 366
    //   356: aload #4
    //   358: iload_2
    //   359: invokevirtual charAt : (I)C
    //   362: istore_3
    //   363: goto -> 320
    //   366: aload #7
    //   368: putstatic me/konsolas/aac/ch.q : [Ljava/lang/String;
    //   371: bipush #9
    //   373: anewarray java/lang/String
    //   376: putstatic me/konsolas/aac/ch.r : [Ljava/lang/String;
    //   379: goto -> 444
    //   382: swap
    //   383: ldc_w '⳾徠⛙纜钹뤗靧罈뢢ຸ'
    //   386: invokevirtual toCharArray : ()[C
    //   389: dup
    //   390: dup
    //   391: iconst_4
    //   392: dup_x1
    //   393: caload
    //   394: sipush #5510
    //   397: ixor
    //   398: i2c
    //   399: castore
    //   400: sipush #13875
    //   403: iconst_0
    //   404: iconst_1
    //   405: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   408: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   411: aload_0
    //   412: swap
    //   413: invokevirtual doFinal : ([B)[B
    //   416: astore #8
    //   418: aload #8
    //   420: invokestatic b : ([B)Ljava/lang/String;
    //   423: invokevirtual intern : ()Ljava/lang/String;
    //   426: swap
    //   427: tableswitch default -> 251, 0 -> 336
    //   444: ldc me/konsolas/aac/ch
    //   446: invokevirtual desiredAssertionStatus : ()Z
    //   449: ifne -> 467
    //   452: iconst_1
    //   453: goto -> 468
    //   456: ldc2_w 1736952273544998224
    //   459: lload #9
    //   461: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   466: athrow
    //   467: iconst_0
    //   468: putstatic me/konsolas/aac/ch.a : Z
    //   471: new org/bukkit/util/Vector
    //   474: dup
    //   475: ldc2_w 0.1
    //   478: ldc2_w 0.1
    //   481: ldc2_w 0.1
    //   484: invokespecial <init> : (DDD)V
    //   487: putstatic me/konsolas/aac/ch.o : Lorg/bukkit/util/Vector;
    //   490: new org/bukkit/util/Vector
    //   493: dup
    //   494: ldc2_w 0.13
    //   497: ldc2_w 0.13
    //   500: ldc2_w 0.13
    //   503: invokespecial <init> : (DDD)V
    //   506: putstatic me/konsolas/aac/ch.j : Lorg/bukkit/util/Vector;
    //   509: new org/bukkit/util/Vector
    //   512: dup
    //   513: ldc2_w 0.5
    //   516: ldc2_w 0.5
    //   519: ldc2_w 0.5
    //   522: invokespecial <init> : (DDD)V
    //   525: putstatic me/konsolas/aac/ch.l : Lorg/bukkit/util/Vector;
    //   528: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #96	-> 444
    //   #76	-> 471
    //   #2	-> 490
    //   #90	-> 509
    // Exception table:
    //   from	to	target	type
    //   444	456	456	aacinternal/v
  }
  
  public static void a(String paramString) {
    h = paramString;
  }
  
  public static String a() {
    return h;
  }
  
  private static v a(v paramv) {
    return paramv;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String b(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x907;
    if (r[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])s.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          "卖큱瓊瞾ꭟ븦䁗旛?꜀莆殪믜㯇絚࣬愪悽筞".toCharArray()[12] = (char)("卖큱瓊瞾ꭟ븦䁗旛?꜀莆殪믜㯇絚࣬愪悽筞".toCharArray()[12] ^ 0x3F42);
          arrayOfObject[0] = Cipher.getInstance(dP$dt.X("卖큱瓊瞾ꭟ븦䁗旛?꜀莆殪믜㯇絚࣬愪悽筞".toCharArray(), (short)32150, true, true));
          "簈ゞ飸⎍".toCharArray()[1] = (char)("簈ゞ飸⎍".toCharArray()[1] ^ 0x3E07);
          arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("簈ゞ飸⎍".toCharArray(), (short)28679, false, false));
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          s.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        "麍⒂㕈ိഄ퀝篟굡셔?⯓⋛⼇ᨊ⽄鈠ᄹ".toCharArray()[9] = (char)("麍⒂㕈ိഄ퀝篟굡셔?⯓⋛⼇ᨊ⽄鈠ᄹ".toCharArray()[9] ^ 0x9D6);
        throw new RuntimeException(dP$dt.X("麍⒂㕈ိഄ퀝篟굡셔?⯓⋛⼇ᨊ⽄鈠ᄹ".toCharArray(), (short)2077, true, false), exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      "㤤銑펯큖凸㙞㗂攈䦜".toCharArray()[3] = (char)("㤤銑펯큖凸㙞㗂攈䦜".toCharArray()[3] ^ 0x6626);
      byte[] arrayOfByte2 = q[i].getBytes(dP$dt.X("㤤銑펯큖凸㙞㗂攈䦜".toCharArray(), (short)17110, false, true));
      r[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return r[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = b(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 170
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w '諠渶?頺?頩ढ़嚣뇒⥼㠑颃莽ᵒ䌌밠õ'
    //   69: invokevirtual toCharArray : ()[C
    //   72: dup
    //   73: dup
    //   74: iconst_0
    //   75: dup_x1
    //   76: caload
    //   77: sipush #14259
    //   80: ixor
    //   81: i2c
    //   82: castore
    //   83: sipush #32008
    //   86: iconst_1
    //   87: iconst_0
    //   88: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w 'ꭆﲽ䫸ª'
    //   97: invokevirtual toCharArray : ()[C
    //   100: dup
    //   101: dup
    //   102: iconst_0
    //   103: dup_x1
    //   104: caload
    //   105: sipush #26971
    //   108: ixor
    //   109: i2c
    //   110: castore
    //   111: sipush #24111
    //   114: iconst_1
    //   115: iconst_0
    //   116: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_1
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc_w '䗁ꮨᴩ嫍'
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup
    //   133: dup
    //   134: iconst_1
    //   135: dup_x1
    //   136: caload
    //   137: sipush #16720
    //   140: ixor
    //   141: i2c
    //   142: castore
    //   143: sipush #29390
    //   146: iconst_1
    //   147: iconst_0
    //   148: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: aload_2
    //   155: invokevirtual toString : ()Ljava/lang/String;
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: invokevirtual toString : ()Ljava/lang/String;
    //   164: aload #4
    //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   169: athrow
    //   170: aload_3
    //   171: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */