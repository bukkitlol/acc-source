package me.konsolas.aac;

import aacinternal.v;
import com.comphenix.protocol.events.PacketEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public class cz extends ck {
  private long j;
  
  private final cm g;
  
  private final ca m;
  
  private final c7 i;
  
  private final cr f;
  
  private final ch a;
  
  private final ce l;
  
  private final cO h;
  
  private final cC k;
  
  private static final long n = nc.a(-1071833778291997770L, 8737235675731627774L, MethodHandles.lookup().lookupClass()).a(85372397997269L);
  
  private static final String[] o;
  
  private static final String[] p;
  
  private static final Map q = new HashMap<>(13);
  
  public void a(long paramLong1, long paramLong2) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/cz.n : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 24508128884372
    //   11: lxor
    //   12: lstore #5
    //   14: dup2
    //   15: ldc2_w 108530121840936
    //   18: lxor
    //   19: lstore #7
    //   21: dup2
    //   22: ldc2_w 117839433931080
    //   25: lxor
    //   26: lstore #9
    //   28: pop2
    //   29: ldc2_w -5757271922363778838
    //   32: lload_3
    //   33: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   38: aload_0
    //   39: dup
    //   40: getfield j : J
    //   43: lconst_1
    //   44: ladd
    //   45: putfield j : J
    //   48: astore #11
    //   50: aload_0
    //   51: aload #11
    //   53: ifnull -> 98
    //   56: getfield m : Lme/konsolas/aac/ca;
    //   59: ifnull -> 97
    //   62: goto -> 75
    //   65: ldc2_w -5755751818290723240
    //   68: lload_3
    //   69: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   74: athrow
    //   75: aload_0
    //   76: getfield m : Lme/konsolas/aac/ca;
    //   79: lload #5
    //   81: invokevirtual a : (J)V
    //   84: goto -> 97
    //   87: ldc2_w -5755751818290723240
    //   90: lload_3
    //   91: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   96: athrow
    //   97: aload_0
    //   98: aload #11
    //   100: ifnull -> 145
    //   103: getfield a : Lme/konsolas/aac/ch;
    //   106: ifnull -> 144
    //   109: goto -> 122
    //   112: ldc2_w -5755751818290723240
    //   115: lload_3
    //   116: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   121: athrow
    //   122: aload_0
    //   123: getfield a : Lme/konsolas/aac/ch;
    //   126: lload #7
    //   128: invokevirtual a : (J)V
    //   131: goto -> 144
    //   134: ldc2_w -5755751818290723240
    //   137: lload_3
    //   138: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   143: athrow
    //   144: aload_0
    //   145: getfield k : Lme/konsolas/aac/cC;
    //   148: lload_1
    //   149: lload #9
    //   151: invokevirtual a : (JJ)V
    //   154: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #8	-> 38
    //   #65	-> 50
    //   #83	-> 97
    //   #40	-> 144
    //   #9	-> 154
    // Exception table:
    //   from	to	target	type
    //   50	62	65	aacinternal/v
    //   56	84	87	aacinternal/v
    //   98	109	112	aacinternal/v
    //   103	131	134	aacinternal/v
  }
  
  public void a(long paramLong, Location paramLocation) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/cz.n : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: ldc2_w -713734798897742104
    //   9: lload_1
    //   10: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   15: astore #4
    //   17: aload_0
    //   18: getfield m : Lme/konsolas/aac/ca;
    //   21: aload #4
    //   23: ifnull -> 59
    //   26: ifnull -> 63
    //   29: goto -> 42
    //   32: ldc2_w -712355456449167270
    //   35: lload_1
    //   36: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   41: athrow
    //   42: aload_0
    //   43: getfield m : Lme/konsolas/aac/ca;
    //   46: goto -> 59
    //   49: ldc2_w -712355456449167270
    //   52: lload_1
    //   53: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   58: athrow
    //   59: aload_3
    //   60: invokevirtual a : (Lorg/bukkit/Location;)V
    //   63: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 17
    //   #52	-> 63
    // Exception table:
    //   from	to	target	type
    //   17	29	32	aacinternal/v
    //   26	46	49	aacinternal/v
  }
  
  public cz(long paramLong, AAC paramAAC, Player paramPlayer) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/cz.n : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 6026656832301
    //   11: lxor
    //   12: lstore #5
    //   14: dup2
    //   15: ldc2_w 35472662955639
    //   18: lxor
    //   19: dup2
    //   20: bipush #48
    //   22: lushr
    //   23: l2i
    //   24: istore #7
    //   26: dup2
    //   27: bipush #16
    //   29: lshl
    //   30: bipush #48
    //   32: lushr
    //   33: l2i
    //   34: istore #8
    //   36: dup2
    //   37: bipush #32
    //   39: lshl
    //   40: bipush #32
    //   42: lushr
    //   43: l2i
    //   44: istore #9
    //   46: pop2
    //   47: dup2
    //   48: ldc2_w 3016350518607
    //   51: lxor
    //   52: lstore #10
    //   54: dup2
    //   55: ldc2_w 5203577348700
    //   58: lxor
    //   59: lstore #12
    //   61: dup2
    //   62: ldc2_w 91345677294201
    //   65: lxor
    //   66: lstore #14
    //   68: dup2
    //   69: ldc2_w 25301333384053
    //   72: lxor
    //   73: lstore #16
    //   75: dup2
    //   76: ldc2_w 127026270366640
    //   79: lxor
    //   80: lstore #18
    //   82: dup2
    //   83: ldc2_w 130595068114573
    //   86: lxor
    //   87: lstore #20
    //   89: dup2
    //   90: ldc2_w 111100826457913
    //   93: lxor
    //   94: lstore #22
    //   96: pop2
    //   97: ldc2_w 5022090797438061890
    //   100: lload_1
    //   101: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   106: aload_0
    //   107: iload #7
    //   109: i2s
    //   110: iload #8
    //   112: i2s
    //   113: aload_3
    //   114: aload #4
    //   116: iload #9
    //   118: aconst_null
    //   119: invokespecial <init> : (SSLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;ILjava/lang/String;)V
    //   122: aload_0
    //   123: lconst_0
    //   124: putfield j : J
    //   127: astore #24
    //   129: aload_3
    //   130: aload #24
    //   132: ifnull -> 212
    //   135: invokevirtual a : ()Lme/konsolas/aac/kk;
    //   138: ifnull -> 198
    //   141: goto -> 154
    //   144: ldc2_w 5023613098017813488
    //   147: lload_1
    //   148: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   153: athrow
    //   154: aload_3
    //   155: aload #24
    //   157: ifnull -> 212
    //   160: goto -> 173
    //   163: ldc2_w 5023613098017813488
    //   166: lload_1
    //   167: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   172: athrow
    //   173: invokevirtual a : ()Lme/konsolas/aac/kk;
    //   176: invokevirtual a : ()Ljava/lang/String;
    //   179: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   182: ifne -> 226
    //   185: goto -> 198
    //   188: ldc2_w 5023613098017813488
    //   191: lload_1
    //   192: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   197: athrow
    //   198: aload_3
    //   199: goto -> 212
    //   202: ldc2_w 5023613098017813488
    //   205: lload_1
    //   206: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   211: athrow
    //   212: invokevirtual getServer : ()Lorg/bukkit/Server;
    //   215: invokeinterface getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   220: aload_3
    //   221: invokeinterface disablePlugin : (Lorg/bukkit/plugin/Plugin;)V
    //   226: aload_0
    //   227: aload_0
    //   228: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
    //   231: sipush #5949
    //   234: ldc2_w 871897098886287028
    //   237: lload_1
    //   238: lxor
    //   239: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   244: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   249: ifeq -> 277
    //   252: new me/konsolas/aac/cm
    //   255: dup
    //   256: lload #16
    //   258: aload_3
    //   259: aload #4
    //   261: invokespecial <init> : (JLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;)V
    //   264: goto -> 278
    //   267: ldc2_w 5023613098017813488
    //   270: lload_1
    //   271: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   276: athrow
    //   277: aconst_null
    //   278: putfield g : Lme/konsolas/aac/cm;
    //   281: aload_0
    //   282: aload_0
    //   283: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
    //   286: sipush #21919
    //   289: ldc2_w 8328852459241229330
    //   292: lload_1
    //   293: lxor
    //   294: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   299: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   304: ifeq -> 332
    //   307: new me/konsolas/aac/ca
    //   310: dup
    //   311: lload #5
    //   313: aload_3
    //   314: aload #4
    //   316: invokespecial <init> : (JLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;)V
    //   319: goto -> 333
    //   322: ldc2_w 5023613098017813488
    //   325: lload_1
    //   326: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   331: athrow
    //   332: aconst_null
    //   333: putfield m : Lme/konsolas/aac/ca;
    //   336: aload_0
    //   337: aload_0
    //   338: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
    //   341: sipush #7672
    //   344: ldc2_w 5455574571108140150
    //   347: lload_1
    //   348: lxor
    //   349: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   354: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   359: ifeq -> 387
    //   362: new me/konsolas/aac/c7
    //   365: dup
    //   366: aload_3
    //   367: aload #4
    //   369: lload #10
    //   371: invokespecial <init> : (Lme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;J)V
    //   374: goto -> 388
    //   377: ldc2_w 5023613098017813488
    //   380: lload_1
    //   381: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   386: athrow
    //   387: aconst_null
    //   388: putfield i : Lme/konsolas/aac/c7;
    //   391: aload_0
    //   392: aload_0
    //   393: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
    //   396: sipush #31916
    //   399: ldc2_w 2982131771964908835
    //   402: lload_1
    //   403: lxor
    //   404: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   409: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   414: ifeq -> 442
    //   417: new me/konsolas/aac/cr
    //   420: dup
    //   421: aload_3
    //   422: aload #4
    //   424: lload #12
    //   426: invokespecial <init> : (Lme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;J)V
    //   429: goto -> 443
    //   432: ldc2_w 5023613098017813488
    //   435: lload_1
    //   436: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   441: athrow
    //   442: aconst_null
    //   443: putfield f : Lme/konsolas/aac/cr;
    //   446: aload_0
    //   447: aload_0
    //   448: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
    //   451: sipush #16358
    //   454: ldc2_w 7995449657242756718
    //   457: lload_1
    //   458: lxor
    //   459: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   464: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   469: ifeq -> 497
    //   472: new me/konsolas/aac/ch
    //   475: dup
    //   476: lload #20
    //   478: aload_3
    //   479: aload #4
    //   481: invokespecial <init> : (JLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;)V
    //   484: goto -> 498
    //   487: ldc2_w 5023613098017813488
    //   490: lload_1
    //   491: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   496: athrow
    //   497: aconst_null
    //   498: putfield a : Lme/konsolas/aac/ch;
    //   501: aload_0
    //   502: aload_0
    //   503: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
    //   506: sipush #16549
    //   509: ldc2_w 6429040446415919406
    //   512: lload_1
    //   513: lxor
    //   514: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   519: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   524: ifeq -> 552
    //   527: new me/konsolas/aac/ce
    //   530: dup
    //   531: lload #22
    //   533: aload_3
    //   534: aload #4
    //   536: invokespecial <init> : (JLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;)V
    //   539: goto -> 553
    //   542: ldc2_w 5023613098017813488
    //   545: lload_1
    //   546: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   551: athrow
    //   552: aconst_null
    //   553: putfield l : Lme/konsolas/aac/ce;
    //   556: aload_0
    //   557: aload_0
    //   558: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
    //   561: sipush #30631
    //   564: ldc2_w 7373322631044099627
    //   567: lload_1
    //   568: lxor
    //   569: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   574: invokeinterface getBoolean : (Ljava/lang/String;)Z
    //   579: ifeq -> 607
    //   582: new me/konsolas/aac/cO
    //   585: dup
    //   586: aload_3
    //   587: lload #14
    //   589: aload #4
    //   591: invokespecial <init> : (Lme/konsolas/aac/AAC;JLorg/bukkit/entity/Player;)V
    //   594: goto -> 608
    //   597: ldc2_w 5023613098017813488
    //   600: lload_1
    //   601: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   606: athrow
    //   607: aconst_null
    //   608: putfield h : Lme/konsolas/aac/cO;
    //   611: aload_0
    //   612: new me/konsolas/aac/cC
    //   615: dup
    //   616: lload #18
    //   618: aload_3
    //   619: aload #4
    //   621: invokespecial <init> : (JLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;)V
    //   624: putfield k : Lme/konsolas/aac/cC;
    //   627: lload_1
    //   628: lconst_0
    //   629: lcmp
    //   630: iflt -> 651
    //   633: aload #24
    //   635: ifnonnull -> 664
    //   638: iconst_5
    //   639: anewarray me/konsolas/aac/aN
    //   642: ldc2_w 5036409714532654129
    //   645: lload_1
    //   646: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
    //   651: goto -> 664
    //   654: ldc2_w 5023613098017813488
    //   657: lload_1
    //   658: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   663: athrow
    //   664: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #22	-> 106
    //   #42	-> 122
    //   #12	-> 129
    //   #10	-> 198
    //   #55	-> 226
    //   #17	-> 281
    //   #7	-> 336
    //   #62	-> 391
    //   #31	-> 446
    //   #56	-> 501
    //   #87	-> 556
    //   #48	-> 611
    //   #77	-> 627
    // Exception table:
    //   from	to	target	type
    //   129	141	144	aacinternal/v
    //   135	160	163	aacinternal/v
    //   154	185	188	aacinternal/v
    //   173	199	202	aacinternal/v
    //   226	267	267	aacinternal/v
    //   278	322	322	aacinternal/v
    //   333	377	377	aacinternal/v
    //   388	432	432	aacinternal/v
    //   443	487	487	aacinternal/v
    //   498	542	542	aacinternal/v
    //   553	597	597	aacinternal/v
    //   608	651	654	aacinternal/v
  }
  
  public void b(Location paramLocation, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/cz.n : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 138892950627999
    //   11: lxor
    //   12: lstore #4
    //   14: pop2
    //   15: ldc2_w 4750826272216500510
    //   18: lload_2
    //   19: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   24: astore #6
    //   26: aload_0
    //   27: aload #6
    //   29: ifnull -> 73
    //   32: getfield m : Lme/konsolas/aac/ca;
    //   35: ifnull -> 72
    //   38: goto -> 51
    //   41: ldc2_w 4749937326683781036
    //   44: lload_2
    //   45: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   50: athrow
    //   51: aload_0
    //   52: getfield m : Lme/konsolas/aac/ca;
    //   55: aload_1
    //   56: invokevirtual b : (Lorg/bukkit/Location;)V
    //   59: goto -> 72
    //   62: ldc2_w 4749937326683781036
    //   65: lload_2
    //   66: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   71: athrow
    //   72: aload_0
    //   73: getfield i : Lme/konsolas/aac/c7;
    //   76: aload #6
    //   78: ifnull -> 114
    //   81: ifnull -> 120
    //   84: goto -> 97
    //   87: ldc2_w 4749937326683781036
    //   90: lload_2
    //   91: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   96: athrow
    //   97: aload_0
    //   98: getfield i : Lme/konsolas/aac/c7;
    //   101: goto -> 114
    //   104: ldc2_w 4749937326683781036
    //   107: lload_2
    //   108: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   113: athrow
    //   114: lload #4
    //   116: aload_1
    //   117: invokevirtual a : (JLorg/bukkit/Location;)V
    //   120: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #58	-> 26
    //   #25	-> 72
    //   #3	-> 120
    // Exception table:
    //   from	to	target	type
    //   26	38	41	aacinternal/v
    //   32	59	62	aacinternal/v
    //   73	84	87	aacinternal/v
    //   81	101	104	aacinternal/v
  }
  
  public void a(PacketEvent paramPacketEvent, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/cz.n : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 117335855511066
    //   11: lxor
    //   12: lstore #4
    //   14: dup2
    //   15: ldc2_w 41011636975663
    //   18: lxor
    //   19: lstore #6
    //   21: dup2
    //   22: ldc2_w 99513650468244
    //   25: lxor
    //   26: lstore #8
    //   28: dup2
    //   29: ldc2_w 126012229398163
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
    //   62: ldc2_w 24536730889256
    //   65: lxor
    //   66: lstore #13
    //   68: dup2
    //   69: ldc2_w 69198831075534
    //   72: lxor
    //   73: dup2
    //   74: bipush #48
    //   76: lushr
    //   77: l2i
    //   78: istore #15
    //   80: dup2
    //   81: bipush #16
    //   83: lshl
    //   84: bipush #32
    //   86: lushr
    //   87: l2i
    //   88: istore #16
    //   90: dup2
    //   91: bipush #48
    //   93: lshl
    //   94: bipush #48
    //   96: lushr
    //   97: l2i
    //   98: istore #17
    //   100: pop2
    //   101: dup2
    //   102: ldc2_w 78684169864397
    //   105: lxor
    //   106: lstore #18
    //   108: dup2
    //   109: ldc2_w 133452830753963
    //   112: lxor
    //   113: dup2
    //   114: bipush #32
    //   116: lushr
    //   117: l2i
    //   118: istore #20
    //   120: dup2
    //   121: bipush #32
    //   123: lshl
    //   124: bipush #48
    //   126: lushr
    //   127: l2i
    //   128: istore #21
    //   130: dup2
    //   131: bipush #48
    //   133: lshl
    //   134: bipush #48
    //   136: lushr
    //   137: l2i
    //   138: istore #22
    //   140: pop2
    //   141: dup2
    //   142: ldc2_w 78646155266048
    //   145: lxor
    //   146: dup2
    //   147: bipush #48
    //   149: lushr
    //   150: l2i
    //   151: istore #23
    //   153: dup2
    //   154: bipush #16
    //   156: lshl
    //   157: bipush #48
    //   159: lushr
    //   160: l2i
    //   161: istore #24
    //   163: dup2
    //   164: bipush #32
    //   166: lshl
    //   167: bipush #32
    //   169: lushr
    //   170: l2i
    //   171: istore #25
    //   173: pop2
    //   174: dup2
    //   175: ldc2_w 26739928443148
    //   178: lxor
    //   179: lstore #26
    //   181: dup2
    //   182: ldc2_w 40892348365900
    //   185: lxor
    //   186: lstore #28
    //   188: dup2
    //   189: ldc2_w 117734178428787
    //   192: lxor
    //   193: lstore #30
    //   195: dup2
    //   196: ldc2_w 65847405605160
    //   199: lxor
    //   200: lstore #32
    //   202: dup2
    //   203: ldc2_w 64160844205050
    //   206: lxor
    //   207: lstore #34
    //   209: dup2
    //   210: ldc2_w 59172599255379
    //   213: lxor
    //   214: dup2
    //   215: bipush #48
    //   217: lushr
    //   218: l2i
    //   219: istore #36
    //   221: dup2
    //   222: bipush #16
    //   224: lshl
    //   225: bipush #48
    //   227: lushr
    //   228: l2i
    //   229: istore #37
    //   231: dup2
    //   232: bipush #32
    //   234: lshl
    //   235: bipush #32
    //   237: lushr
    //   238: l2i
    //   239: istore #38
    //   241: pop2
    //   242: pop2
    //   243: ldc2_w -616949454106886272
    //   246: lload_2
    //   247: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   252: astore #39
    //   254: aload_0
    //   255: aload #39
    //   257: ifnull -> 303
    //   260: getfield m : Lme/konsolas/aac/ca;
    //   263: ifnull -> 302
    //   266: goto -> 279
    //   269: ldc2_w -615482167899569870
    //   272: lload_2
    //   273: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   278: athrow
    //   279: aload_0
    //   280: getfield m : Lme/konsolas/aac/ca;
    //   283: lload #8
    //   285: aload_1
    //   286: invokevirtual a : (JLcom/comphenix/protocol/events/PacketEvent;)V
    //   289: goto -> 302
    //   292: ldc2_w -615482167899569870
    //   295: lload_2
    //   296: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   301: athrow
    //   302: aload_0
    //   303: getfield a : Lme/konsolas/aac/ch;
    //   306: aload #39
    //   308: ifnull -> 344
    //   311: ifnull -> 350
    //   314: goto -> 327
    //   317: ldc2_w -615482167899569870
    //   320: lload_2
    //   321: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   326: athrow
    //   327: aload_0
    //   328: getfield a : Lme/konsolas/aac/ch;
    //   331: goto -> 344
    //   334: ldc2_w -615482167899569870
    //   337: lload_2
    //   338: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   343: athrow
    //   344: lload #34
    //   346: aload_1
    //   347: invokevirtual a : (JLcom/comphenix/protocol/events/PacketEvent;)V
    //   350: aload_1
    //   351: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   354: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   357: lload_2
    //   358: lconst_0
    //   359: lcmp
    //   360: iflt -> 565
    //   363: aload #39
    //   365: ifnull -> 565
    //   368: if_acmpne -> 521
    //   371: goto -> 384
    //   374: ldc2_w -615482167899569870
    //   377: lload_2
    //   378: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   383: athrow
    //   384: aload_1
    //   385: lload_2
    //   386: lconst_0
    //   387: lcmp
    //   388: ifle -> 1237
    //   391: aload #39
    //   393: ifnull -> 1237
    //   396: goto -> 409
    //   399: ldc2_w -615482167899569870
    //   402: lload_2
    //   403: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   408: athrow
    //   409: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   412: invokevirtual getPlayerActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   415: iconst_0
    //   416: invokevirtual read : (I)Ljava/lang/Object;
    //   419: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.STOP_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   422: if_acmpne -> 1236
    //   425: goto -> 438
    //   428: ldc2_w -615482167899569870
    //   431: lload_2
    //   432: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   437: athrow
    //   438: aload_0
    //   439: getfield g : Lme/konsolas/aac/cm;
    //   442: lload_2
    //   443: lconst_0
    //   444: lcmp
    //   445: iflt -> 499
    //   448: aload #39
    //   450: ifnull -> 499
    //   453: goto -> 466
    //   456: ldc2_w -615482167899569870
    //   459: lload_2
    //   460: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   465: athrow
    //   466: ifnull -> 1236
    //   469: goto -> 482
    //   472: ldc2_w -615482167899569870
    //   475: lload_2
    //   476: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   481: athrow
    //   482: aload_0
    //   483: getfield g : Lme/konsolas/aac/cm;
    //   486: goto -> 499
    //   489: ldc2_w -615482167899569870
    //   492: lload_2
    //   493: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   498: athrow
    //   499: iload #23
    //   501: i2c
    //   502: iload #24
    //   504: i2s
    //   505: iload #25
    //   507: invokevirtual b : (CSI)V
    //   510: lload_2
    //   511: lconst_0
    //   512: lcmp
    //   513: ifle -> 521
    //   516: aload #39
    //   518: ifnonnull -> 1236
    //   521: aload_1
    //   522: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   525: aload #39
    //   527: lload_2
    //   528: lconst_0
    //   529: lcmp
    //   530: iflt -> 775
    //   533: ifnull -> 767
    //   536: goto -> 549
    //   539: ldc2_w -615482167899569870
    //   542: lload_2
    //   543: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   548: athrow
    //   549: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   552: goto -> 565
    //   555: ldc2_w -615482167899569870
    //   558: lload_2
    //   559: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   564: athrow
    //   565: if_acmpne -> 750
    //   568: aload_1
    //   569: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   572: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   575: iconst_0
    //   576: invokevirtual read : (I)Ljava/lang/Object;
    //   579: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.RELEASE_USE_ITEM : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
    //   582: if_acmpne -> 664
    //   585: goto -> 598
    //   588: ldc2_w -615482167899569870
    //   591: lload_2
    //   592: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   597: athrow
    //   598: aload_0
    //   599: lload_2
    //   600: lconst_0
    //   601: lcmp
    //   602: ifle -> 665
    //   605: aload #39
    //   607: ifnull -> 665
    //   610: goto -> 623
    //   613: ldc2_w -615482167899569870
    //   616: lload_2
    //   617: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   622: athrow
    //   623: getfield g : Lme/konsolas/aac/cm;
    //   626: ifnull -> 664
    //   629: goto -> 642
    //   632: ldc2_w -615482167899569870
    //   635: lload_2
    //   636: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   641: athrow
    //   642: aload_0
    //   643: getfield g : Lme/konsolas/aac/cm;
    //   646: lload #32
    //   648: invokevirtual a : (J)V
    //   651: goto -> 664
    //   654: ldc2_w -615482167899569870
    //   657: lload_2
    //   658: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   663: athrow
    //   664: aload_0
    //   665: getfield f : Lme/konsolas/aac/cr;
    //   668: aload #39
    //   670: lload_2
    //   671: lconst_0
    //   672: lcmp
    //   673: ifle -> 723
    //   676: ifnull -> 712
    //   679: ifnull -> 1236
    //   682: goto -> 695
    //   685: ldc2_w -615482167899569870
    //   688: lload_2
    //   689: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   694: athrow
    //   695: aload_0
    //   696: getfield f : Lme/konsolas/aac/cr;
    //   699: goto -> 712
    //   702: ldc2_w -615482167899569870
    //   705: lload_2
    //   706: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   711: athrow
    //   712: aload_1
    //   713: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   716: invokevirtual getBlockPositionModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   719: iconst_0
    //   720: invokevirtual read : (I)Ljava/lang/Object;
    //   723: checkcast com/comphenix/protocol/wrappers/BlockPosition
    //   726: aload_1
    //   727: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   730: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   733: iconst_0
    //   734: invokevirtual read : (I)Ljava/lang/Object;
    //   737: checkcast com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType
    //   740: lload #28
    //   742: invokevirtual a : (Lcom/comphenix/protocol/wrappers/BlockPosition;Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;J)V
    //   745: aload #39
    //   747: ifnonnull -> 1236
    //   750: aload_1
    //   751: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   754: goto -> 767
    //   757: ldc2_w -615482167899569870
    //   760: lload_2
    //   761: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   766: athrow
    //   767: lload_2
    //   768: lconst_0
    //   769: lcmp
    //   770: ifle -> 981
    //   773: aload #39
    //   775: ifnull -> 981
    //   778: lload #26
    //   780: invokestatic a : (Lcom/comphenix/protocol/PacketType;J)Z
    //   783: ifeq -> 946
    //   786: goto -> 799
    //   789: ldc2_w -615482167899569870
    //   792: lload_2
    //   793: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   798: athrow
    //   799: aload_0
    //   800: lload_2
    //   801: lconst_0
    //   802: lcmp
    //   803: iflt -> 872
    //   806: aload #39
    //   808: ifnull -> 872
    //   811: goto -> 824
    //   814: ldc2_w -615482167899569870
    //   817: lload_2
    //   818: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   823: athrow
    //   824: getfield f : Lme/konsolas/aac/cr;
    //   827: ifnull -> 871
    //   830: goto -> 843
    //   833: ldc2_w -615482167899569870
    //   836: lload_2
    //   837: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   842: athrow
    //   843: aload_0
    //   844: getfield f : Lme/konsolas/aac/cr;
    //   847: iload #36
    //   849: i2s
    //   850: iload #37
    //   852: i2s
    //   853: iload #38
    //   855: invokevirtual c : (SSI)V
    //   858: goto -> 871
    //   861: ldc2_w -615482167899569870
    //   864: lload_2
    //   865: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   870: athrow
    //   871: aload_0
    //   872: getfield l : Lme/konsolas/aac/ce;
    //   875: lload_2
    //   876: lconst_0
    //   877: lcmp
    //   878: ifle -> 919
    //   881: aload #39
    //   883: ifnull -> 919
    //   886: ifnull -> 1236
    //   889: goto -> 902
    //   892: ldc2_w -615482167899569870
    //   895: lload_2
    //   896: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   901: athrow
    //   902: aload_0
    //   903: getfield l : Lme/konsolas/aac/ce;
    //   906: goto -> 919
    //   909: ldc2_w -615482167899569870
    //   912: lload_2
    //   913: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   918: athrow
    //   919: aload_1
    //   920: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   923: iload #20
    //   925: swap
    //   926: iload #21
    //   928: i2s
    //   929: iload #22
    //   931: i2c
    //   932: invokevirtual a : (ILcom/comphenix/protocol/events/PacketContainer;SC)V
    //   935: lload_2
    //   936: lconst_0
    //   937: lcmp
    //   938: iflt -> 946
    //   941: aload #39
    //   943: ifnonnull -> 1236
    //   946: aload_1
    //   947: aload #39
    //   949: ifnull -> 1041
    //   952: goto -> 965
    //   955: ldc2_w -615482167899569870
    //   958: lload_2
    //   959: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   964: athrow
    //   965: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   968: goto -> 981
    //   971: ldc2_w -615482167899569870
    //   974: lload_2
    //   975: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   980: athrow
    //   981: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_PLACE : Lcom/comphenix/protocol/PacketType;
    //   984: lload_2
    //   985: lconst_0
    //   986: lcmp
    //   987: ifle -> 1000
    //   990: if_acmpeq -> 1040
    //   993: aload_1
    //   994: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   997: getstatic me/konsolas/aac/gV.e : Lcom/comphenix/protocol/PacketType;
    //   1000: aload #39
    //   1002: lload_2
    //   1003: lconst_0
    //   1004: lcmp
    //   1005: iflt -> 1153
    //   1008: ifnull -> 1145
    //   1011: goto -> 1024
    //   1014: ldc2_w -615482167899569870
    //   1017: lload_2
    //   1018: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1023: athrow
    //   1024: if_acmpne -> 1125
    //   1027: goto -> 1040
    //   1030: ldc2_w -615482167899569870
    //   1033: lload_2
    //   1034: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1039: athrow
    //   1040: aload_1
    //   1041: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   1044: lload #30
    //   1046: invokestatic a : (Lcom/comphenix/protocol/events/PacketContainer;J)Lme/konsolas/aac/jm;
    //   1049: astore #40
    //   1051: lload_2
    //   1052: lconst_0
    //   1053: lcmp
    //   1054: ifle -> 1120
    //   1057: aload #40
    //   1059: ifnull -> 1120
    //   1062: aload_0
    //   1063: getfield f : Lme/konsolas/aac/cr;
    //   1066: aload #39
    //   1068: ifnull -> 1117
    //   1071: goto -> 1084
    //   1074: ldc2_w -615482167899569870
    //   1077: lload_2
    //   1078: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1083: athrow
    //   1084: ifnull -> 1120
    //   1087: goto -> 1100
    //   1090: ldc2_w -615482167899569870
    //   1093: lload_2
    //   1094: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1099: athrow
    //   1100: aload_0
    //   1101: getfield f : Lme/konsolas/aac/cr;
    //   1104: goto -> 1117
    //   1107: ldc2_w -615482167899569870
    //   1110: lload_2
    //   1111: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1116: athrow
    //   1117: invokevirtual d : ()V
    //   1120: aload #39
    //   1122: ifnonnull -> 1236
    //   1125: aload_1
    //   1126: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   1129: getstatic com/comphenix/protocol/PacketType$Play$Client.ABILITIES : Lcom/comphenix/protocol/PacketType;
    //   1132: goto -> 1145
    //   1135: ldc2_w -615482167899569870
    //   1138: lload_2
    //   1139: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1144: athrow
    //   1145: lload_2
    //   1146: lconst_0
    //   1147: lcmp
    //   1148: iflt -> 1261
    //   1151: aload #39
    //   1153: ifnull -> 1261
    //   1156: if_acmpne -> 1236
    //   1159: goto -> 1172
    //   1162: ldc2_w -615482167899569870
    //   1165: lload_2
    //   1166: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1171: athrow
    //   1172: aload_0
    //   1173: getfield h : Lme/konsolas/aac/cO;
    //   1176: aload #39
    //   1178: ifnull -> 1227
    //   1181: goto -> 1194
    //   1184: ldc2_w -615482167899569870
    //   1187: lload_2
    //   1188: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1193: athrow
    //   1194: ifnull -> 1236
    //   1197: goto -> 1210
    //   1200: ldc2_w -615482167899569870
    //   1203: lload_2
    //   1204: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1209: athrow
    //   1210: aload_0
    //   1211: getfield h : Lme/konsolas/aac/cO;
    //   1214: goto -> 1227
    //   1217: ldc2_w -615482167899569870
    //   1220: lload_2
    //   1221: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1226: athrow
    //   1227: aload_0
    //   1228: getfield j : J
    //   1231: lload #6
    //   1233: invokevirtual a : (JJ)V
    //   1236: aload_1
    //   1237: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   1240: aload #39
    //   1242: ifnull -> 1335
    //   1245: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   1248: goto -> 1261
    //   1251: ldc2_w -615482167899569870
    //   1254: lload_2
    //   1255: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1260: athrow
    //   1261: if_acmpeq -> 1311
    //   1264: aload_1
    //   1265: aload #39
    //   1267: lload_2
    //   1268: lconst_0
    //   1269: lcmp
    //   1270: ifle -> 1488
    //   1273: ifnull -> 1480
    //   1276: goto -> 1289
    //   1279: ldc2_w -615482167899569870
    //   1282: lload_2
    //   1283: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1288: athrow
    //   1289: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   1292: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   1295: if_acmpne -> 1479
    //   1298: goto -> 1311
    //   1301: ldc2_w -615482167899569870
    //   1304: lload_2
    //   1305: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1310: athrow
    //   1311: aload_1
    //   1312: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   1315: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1318: iconst_0
    //   1319: invokevirtual read : (I)Ljava/lang/Object;
    //   1322: goto -> 1335
    //   1325: ldc2_w -615482167899569870
    //   1328: lload_2
    //   1329: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1334: athrow
    //   1335: checkcast java/lang/Float
    //   1338: invokevirtual floatValue : ()F
    //   1341: fstore #40
    //   1343: aload_1
    //   1344: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   1347: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1350: iconst_1
    //   1351: invokevirtual read : (I)Ljava/lang/Object;
    //   1354: checkcast java/lang/Float
    //   1357: invokevirtual floatValue : ()F
    //   1360: fstore #41
    //   1362: aload_0
    //   1363: lload_2
    //   1364: lconst_0
    //   1365: lcmp
    //   1366: iflt -> 1425
    //   1369: aload #39
    //   1371: ifnull -> 1425
    //   1374: getfield i : Lme/konsolas/aac/c7;
    //   1377: ifnull -> 1424
    //   1380: goto -> 1393
    //   1383: ldc2_w -615482167899569870
    //   1386: lload_2
    //   1387: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1392: athrow
    //   1393: aload_0
    //   1394: getfield i : Lme/konsolas/aac/c7;
    //   1397: fload #41
    //   1399: iload #10
    //   1401: iload #11
    //   1403: iload #12
    //   1405: i2s
    //   1406: fload #40
    //   1408: invokevirtual b : (FIISF)V
    //   1411: goto -> 1424
    //   1414: ldc2_w -615482167899569870
    //   1417: lload_2
    //   1418: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1423: athrow
    //   1424: aload_0
    //   1425: getfield h : Lme/konsolas/aac/cO;
    //   1428: aload #39
    //   1430: ifnull -> 1466
    //   1433: ifnull -> 1479
    //   1436: goto -> 1449
    //   1439: ldc2_w -615482167899569870
    //   1442: lload_2
    //   1443: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1448: athrow
    //   1449: aload_0
    //   1450: getfield h : Lme/konsolas/aac/cO;
    //   1453: goto -> 1466
    //   1456: ldc2_w -615482167899569870
    //   1459: lload_2
    //   1460: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1465: athrow
    //   1466: aload_0
    //   1467: getfield j : J
    //   1470: fload #41
    //   1472: fload #40
    //   1474: lload #13
    //   1476: invokevirtual a : (JFFJ)V
    //   1479: aload_1
    //   1480: lload_2
    //   1481: lconst_0
    //   1482: lcmp
    //   1483: ifle -> 1639
    //   1486: aload #39
    //   1488: ifnull -> 1639
    //   1491: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   1494: lload #18
    //   1496: invokestatic a : (Lcom/comphenix/protocol/events/PacketContainer;J)Z
    //   1499: ifeq -> 1638
    //   1502: goto -> 1515
    //   1505: ldc2_w -615482167899569870
    //   1508: lload_2
    //   1509: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1514: athrow
    //   1515: aload_0
    //   1516: aload #39
    //   1518: lload_2
    //   1519: lconst_0
    //   1520: lcmp
    //   1521: ifle -> 1582
    //   1524: ifnull -> 1580
    //   1527: goto -> 1540
    //   1530: ldc2_w -615482167899569870
    //   1533: lload_2
    //   1534: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1539: athrow
    //   1540: getfield i : Lme/konsolas/aac/c7;
    //   1543: ifnull -> 1579
    //   1546: goto -> 1559
    //   1549: ldc2_w -615482167899569870
    //   1552: lload_2
    //   1553: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1558: athrow
    //   1559: aload_0
    //   1560: getfield i : Lme/konsolas/aac/c7;
    //   1563: invokevirtual a : ()V
    //   1566: goto -> 1579
    //   1569: ldc2_w -615482167899569870
    //   1572: lload_2
    //   1573: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1578: athrow
    //   1579: aload_0
    //   1580: aload #39
    //   1582: ifnull -> 1632
    //   1585: getfield f : Lme/konsolas/aac/cr;
    //   1588: ifnull -> 1631
    //   1591: goto -> 1604
    //   1594: ldc2_w -615482167899569870
    //   1597: lload_2
    //   1598: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1603: athrow
    //   1604: aload_0
    //   1605: getfield f : Lme/konsolas/aac/cr;
    //   1608: iload #15
    //   1610: i2s
    //   1611: iload #16
    //   1613: iload #17
    //   1615: invokevirtual b : (SII)V
    //   1618: goto -> 1631
    //   1621: ldc2_w -615482167899569870
    //   1624: lload_2
    //   1625: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1630: athrow
    //   1631: aload_0
    //   1632: getfield k : Lme/konsolas/aac/cC;
    //   1635: invokevirtual b : ()V
    //   1638: aload_1
    //   1639: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   1642: getstatic com/comphenix/protocol/PacketType$Play$Client.ARM_ANIMATION : Lcom/comphenix/protocol/PacketType;
    //   1645: if_acmpne -> 1708
    //   1648: aload_0
    //   1649: getfield f : Lme/konsolas/aac/cr;
    //   1652: aload #39
    //   1654: ifnull -> 1703
    //   1657: goto -> 1670
    //   1660: ldc2_w -615482167899569870
    //   1663: lload_2
    //   1664: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1669: athrow
    //   1670: ifnull -> 1708
    //   1673: goto -> 1686
    //   1676: ldc2_w -615482167899569870
    //   1679: lload_2
    //   1680: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1685: athrow
    //   1686: aload_0
    //   1687: getfield f : Lme/konsolas/aac/cr;
    //   1690: goto -> 1703
    //   1693: ldc2_w -615482167899569870
    //   1696: lload_2
    //   1697: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1702: athrow
    //   1703: lload #4
    //   1705: invokevirtual a : (J)V
    //   1708: lload_2
    //   1709: lconst_0
    //   1710: lcmp
    //   1711: ifle -> 1760
    //   1714: ldc2_w -640895197477489736
    //   1717: lload_2
    //   1718: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
    //   1723: ifnull -> 1773
    //   1726: ldc_w '丣膾旵⽍ഥ盓穚'
    //   1729: invokevirtual toCharArray : ()[C
    //   1732: dup
    //   1733: dup
    //   1734: iconst_0
    //   1735: dup_x1
    //   1736: caload
    //   1737: sipush #13644
    //   1740: ixor
    //   1741: i2c
    //   1742: castore
    //   1743: sipush #13664
    //   1746: iconst_0
    //   1747: iconst_2
    //   1748: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
    //   1751: ldc2_w -582057259024722445
    //   1754: lload_2
    //   1755: <illegal opcode> w : (Ljava/lang/String;JJ)V
    //   1760: goto -> 1773
    //   1763: ldc2_w -615482167899569870
    //   1766: lload_2
    //   1767: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1772: athrow
    //   1773: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #67	-> 254
    //   #33	-> 302
    //   #61	-> 350
    //   #85	-> 384
    //   #16	-> 438
    //   #80	-> 521
    //   #63	-> 568
    //   #82	-> 598
    //   #35	-> 664
    //   #68	-> 695
    //   #88	-> 727
    //   #41	-> 740
    //   #5	-> 750
    //   #78	-> 799
    //   #47	-> 871
    //   #15	-> 946
    //   #24	-> 994
    //   #27	-> 1040
    //   #13	-> 1051
    //   #73	-> 1062
    //   #51	-> 1120
    //   #79	-> 1172
    //   #71	-> 1236
    //   #37	-> 1265
    //   #36	-> 1311
    //   #70	-> 1343
    //   #21	-> 1362
    //   #43	-> 1424
    //   #11	-> 1479
    //   #75	-> 1515
    //   #81	-> 1579
    //   #20	-> 1631
    //   #46	-> 1638
    //   #23	-> 1648
    //   #38	-> 1708
    // Exception table:
    //   from	to	target	type
    //   254	266	269	aacinternal/v
    //   260	289	292	aacinternal/v
    //   303	314	317	aacinternal/v
    //   311	331	334	aacinternal/v
    //   350	371	374	aacinternal/v
    //   368	396	399	aacinternal/v
    //   384	425	428	aacinternal/v
    //   409	453	456	aacinternal/v
    //   438	469	472	aacinternal/v
    //   466	486	489	aacinternal/v
    //   499	536	539	aacinternal/v
    //   521	552	555	aacinternal/v
    //   565	585	588	aacinternal/v
    //   568	610	613	aacinternal/v
    //   598	629	632	aacinternal/v
    //   623	651	654	aacinternal/v
    //   665	682	685	aacinternal/v
    //   679	699	702	aacinternal/v
    //   712	754	757	aacinternal/v
    //   767	786	789	aacinternal/v
    //   778	811	814	aacinternal/v
    //   799	830	833	aacinternal/v
    //   824	858	861	aacinternal/v
    //   872	889	892	aacinternal/v
    //   886	906	909	aacinternal/v
    //   919	952	955	aacinternal/v
    //   946	968	971	aacinternal/v
    //   981	1011	1014	aacinternal/v
    //   993	1027	1030	aacinternal/v
    //   1051	1071	1074	aacinternal/v
    //   1062	1087	1090	aacinternal/v
    //   1084	1104	1107	aacinternal/v
    //   1120	1132	1135	aacinternal/v
    //   1145	1159	1162	aacinternal/v
    //   1156	1181	1184	aacinternal/v
    //   1172	1197	1200	aacinternal/v
    //   1194	1214	1217	aacinternal/v
    //   1237	1248	1251	aacinternal/v
    //   1261	1276	1279	aacinternal/v
    //   1264	1298	1301	aacinternal/v
    //   1289	1322	1325	aacinternal/v
    //   1362	1380	1383	aacinternal/v
    //   1374	1411	1414	aacinternal/v
    //   1425	1436	1439	aacinternal/v
    //   1433	1453	1456	aacinternal/v
    //   1480	1502	1505	aacinternal/v
    //   1491	1527	1530	aacinternal/v
    //   1515	1546	1549	aacinternal/v
    //   1540	1566	1569	aacinternal/v
    //   1580	1591	1594	aacinternal/v
    //   1585	1618	1621	aacinternal/v
    //   1639	1657	1660	aacinternal/v
    //   1648	1673	1676	aacinternal/v
    //   1670	1690	1693	aacinternal/v
    //   1708	1760	1763	aacinternal/v
  }
  
  public void a(Event paramEvent, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/cz.n : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 82572196148025
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore #4
    //   19: dup2
    //   20: bipush #16
    //   22: lshl
    //   23: bipush #32
    //   25: lushr
    //   26: l2i
    //   27: istore #5
    //   29: dup2
    //   30: bipush #48
    //   32: lshl
    //   33: bipush #48
    //   35: lushr
    //   36: l2i
    //   37: istore #6
    //   39: pop2
    //   40: dup2
    //   41: ldc2_w 39599807492696
    //   44: lxor
    //   45: lstore #7
    //   47: dup2
    //   48: ldc2_w 139185317712319
    //   51: lxor
    //   52: lstore #9
    //   54: dup2
    //   55: ldc2_w 109416174068202
    //   58: lxor
    //   59: dup2
    //   60: bipush #48
    //   62: lushr
    //   63: l2i
    //   64: istore #11
    //   66: dup2
    //   67: bipush #16
    //   69: lshl
    //   70: bipush #32
    //   72: lushr
    //   73: l2i
    //   74: istore #12
    //   76: dup2
    //   77: bipush #48
    //   79: lshl
    //   80: bipush #48
    //   82: lushr
    //   83: l2i
    //   84: istore #13
    //   86: pop2
    //   87: dup2
    //   88: ldc2_w 39270573658940
    //   91: lxor
    //   92: lstore #14
    //   94: dup2
    //   95: ldc2_w 63697072512246
    //   98: lxor
    //   99: lstore #16
    //   101: dup2
    //   102: ldc2_w 76476249665760
    //   105: lxor
    //   106: lstore #18
    //   108: dup2
    //   109: ldc2_w 23780198008978
    //   112: lxor
    //   113: dup2
    //   114: bipush #48
    //   116: lushr
    //   117: l2i
    //   118: istore #20
    //   120: dup2
    //   121: bipush #16
    //   123: lshl
    //   124: bipush #32
    //   126: lushr
    //   127: l2i
    //   128: istore #21
    //   130: dup2
    //   131: bipush #48
    //   133: lshl
    //   134: bipush #48
    //   136: lushr
    //   137: l2i
    //   138: istore #22
    //   140: pop2
    //   141: dup2
    //   142: ldc2_w 118623693764084
    //   145: lxor
    //   146: dup2
    //   147: bipush #56
    //   149: lushr
    //   150: l2i
    //   151: istore #23
    //   153: dup2
    //   154: bipush #8
    //   156: lshl
    //   157: bipush #32
    //   159: lushr
    //   160: l2i
    //   161: istore #24
    //   163: dup2
    //   164: bipush #40
    //   166: lshl
    //   167: bipush #40
    //   169: lushr
    //   170: l2i
    //   171: istore #25
    //   173: pop2
    //   174: pop2
    //   175: ldc2_w 4816389645479234087
    //   178: lload_2
    //   179: <illegal opcode> w : (JJ)Ljava/lang/String;
    //   184: astore #26
    //   186: aload_1
    //   187: instanceof org/bukkit/event/player/PlayerMoveEvent
    //   190: aload #26
    //   192: ifnull -> 235
    //   195: ifeq -> 231
    //   198: goto -> 211
    //   201: ldc2_w 4814974014382208149
    //   204: lload_2
    //   205: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   210: athrow
    //   211: aload_0
    //   212: getfield k : Lme/konsolas/aac/cC;
    //   215: invokevirtual a : ()V
    //   218: goto -> 231
    //   221: ldc2_w 4814974014382208149
    //   224: lload_2
    //   225: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   230: athrow
    //   231: aload_1
    //   232: instanceof org/bukkit/event/block/BlockPlaceEvent
    //   235: aload #26
    //   237: lload_2
    //   238: lconst_0
    //   239: lcmp
    //   240: iflt -> 372
    //   243: ifnull -> 370
    //   246: ifeq -> 353
    //   249: goto -> 262
    //   252: ldc2_w 4814974014382208149
    //   255: lload_2
    //   256: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   261: athrow
    //   262: aload_1
    //   263: checkcast org/bukkit/event/block/BlockPlaceEvent
    //   266: astore #27
    //   268: aload_0
    //   269: getfield g : Lme/konsolas/aac/cm;
    //   272: lload_2
    //   273: lconst_0
    //   274: lcmp
    //   275: ifle -> 316
    //   278: aload #26
    //   280: ifnull -> 316
    //   283: ifnull -> 348
    //   286: goto -> 299
    //   289: ldc2_w 4814974014382208149
    //   292: lload_2
    //   293: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   298: athrow
    //   299: aload_0
    //   300: getfield g : Lme/konsolas/aac/cm;
    //   303: goto -> 316
    //   306: ldc2_w 4814974014382208149
    //   309: lload_2
    //   310: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   315: athrow
    //   316: iload #23
    //   318: i2b
    //   319: iload #24
    //   321: iload #25
    //   323: invokevirtual a : (BII)Z
    //   326: ifeq -> 348
    //   329: aload #27
    //   331: iconst_1
    //   332: invokevirtual setCancelled : (Z)V
    //   335: goto -> 348
    //   338: ldc2_w 4814974014382208149
    //   341: lload_2
    //   342: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   347: athrow
    //   348: aload #26
    //   350: ifnonnull -> 1411
    //   353: aload_1
    //   354: instanceof org/bukkit/event/block/BlockDamageEvent
    //   357: goto -> 370
    //   360: ldc2_w 4814974014382208149
    //   363: lload_2
    //   364: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   369: athrow
    //   370: aload #26
    //   372: lload_2
    //   373: lconst_0
    //   374: lcmp
    //   375: iflt -> 516
    //   378: ifnull -> 514
    //   381: ifeq -> 497
    //   384: goto -> 397
    //   387: ldc2_w 4814974014382208149
    //   390: lload_2
    //   391: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   396: athrow
    //   397: aload_1
    //   398: checkcast org/bukkit/event/block/BlockDamageEvent
    //   401: astore #27
    //   403: aload_0
    //   404: getfield g : Lme/konsolas/aac/cm;
    //   407: lload_2
    //   408: lconst_0
    //   409: lcmp
    //   410: ifle -> 451
    //   413: aload #26
    //   415: ifnull -> 451
    //   418: ifnull -> 492
    //   421: goto -> 434
    //   424: ldc2_w 4814974014382208149
    //   427: lload_2
    //   428: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   433: athrow
    //   434: aload_0
    //   435: getfield g : Lme/konsolas/aac/cm;
    //   438: goto -> 451
    //   441: ldc2_w 4814974014382208149
    //   444: lload_2
    //   445: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   450: athrow
    //   451: aload #27
    //   453: invokevirtual getInstaBreak : ()Z
    //   456: iload #4
    //   458: i2c
    //   459: swap
    //   460: iload #5
    //   462: swap
    //   463: iload #6
    //   465: i2c
    //   466: swap
    //   467: invokevirtual a : (CICZ)Z
    //   470: ifeq -> 492
    //   473: aload #27
    //   475: iconst_1
    //   476: invokevirtual setCancelled : (Z)V
    //   479: goto -> 492
    //   482: ldc2_w 4814974014382208149
    //   485: lload_2
    //   486: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   491: athrow
    //   492: aload #26
    //   494: ifnonnull -> 1411
    //   497: aload_1
    //   498: instanceof org/bukkit/event/block/BlockBreakEvent
    //   501: goto -> 514
    //   504: ldc2_w 4814974014382208149
    //   507: lload_2
    //   508: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   513: athrow
    //   514: aload #26
    //   516: lload_2
    //   517: lconst_0
    //   518: lcmp
    //   519: iflt -> 749
    //   522: ifnull -> 747
    //   525: ifeq -> 730
    //   528: goto -> 541
    //   531: ldc2_w 4814974014382208149
    //   534: lload_2
    //   535: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   540: athrow
    //   541: aload_1
    //   542: checkcast org/bukkit/event/block/BlockBreakEvent
    //   545: astore #27
    //   547: aload_0
    //   548: aload #26
    //   550: ifnull -> 646
    //   553: getfield g : Lme/konsolas/aac/cm;
    //   556: ifnull -> 645
    //   559: goto -> 572
    //   562: ldc2_w 4814974014382208149
    //   565: lload_2
    //   566: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   571: athrow
    //   572: aload_0
    //   573: lload_2
    //   574: lconst_0
    //   575: lcmp
    //   576: ifle -> 646
    //   579: aload #26
    //   581: ifnull -> 646
    //   584: goto -> 597
    //   587: ldc2_w 4814974014382208149
    //   590: lload_2
    //   591: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   596: athrow
    //   597: getfield g : Lme/konsolas/aac/cm;
    //   600: aload #27
    //   602: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   605: lload #7
    //   607: invokevirtual a : (Lorg/bukkit/block/Block;J)Z
    //   610: ifeq -> 645
    //   613: goto -> 626
    //   616: ldc2_w 4814974014382208149
    //   619: lload_2
    //   620: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   625: athrow
    //   626: aload #27
    //   628: iconst_1
    //   629: invokevirtual setCancelled : (Z)V
    //   632: goto -> 645
    //   635: ldc2_w 4814974014382208149
    //   638: lload_2
    //   639: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   644: athrow
    //   645: aload_0
    //   646: getfield l : Lme/konsolas/aac/ce;
    //   649: lload_2
    //   650: lconst_0
    //   651: lcmp
    //   652: ifle -> 693
    //   655: aload #26
    //   657: ifnull -> 693
    //   660: ifnull -> 725
    //   663: goto -> 676
    //   666: ldc2_w 4814974014382208149
    //   669: lload_2
    //   670: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   675: athrow
    //   676: aload_0
    //   677: getfield l : Lme/konsolas/aac/ce;
    //   680: goto -> 693
    //   683: ldc2_w 4814974014382208149
    //   686: lload_2
    //   687: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   692: athrow
    //   693: aload #27
    //   695: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   698: lload #18
    //   700: invokevirtual a : (Lorg/bukkit/block/Block;J)Z
    //   703: ifeq -> 725
    //   706: aload #27
    //   708: iconst_1
    //   709: invokevirtual setCancelled : (Z)V
    //   712: goto -> 725
    //   715: ldc2_w 4814974014382208149
    //   718: lload_2
    //   719: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   724: athrow
    //   725: aload #26
    //   727: ifnonnull -> 1411
    //   730: aload_1
    //   731: instanceof org/bukkit/event/player/PlayerInteractEvent
    //   734: goto -> 747
    //   737: ldc2_w 4814974014382208149
    //   740: lload_2
    //   741: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   746: athrow
    //   747: aload #26
    //   749: lload_2
    //   750: lconst_0
    //   751: lcmp
    //   752: ifle -> 971
    //   755: ifnull -> 969
    //   758: ifeq -> 952
    //   761: goto -> 774
    //   764: ldc2_w 4814974014382208149
    //   767: lload_2
    //   768: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   773: athrow
    //   774: aload_1
    //   775: checkcast org/bukkit/event/player/PlayerInteractEvent
    //   778: astore #27
    //   780: aload_0
    //   781: aload #26
    //   783: lload_2
    //   784: lconst_0
    //   785: lcmp
    //   786: ifle -> 843
    //   789: ifnull -> 841
    //   792: getfield g : Lme/konsolas/aac/cm;
    //   795: ifnull -> 840
    //   798: goto -> 811
    //   801: ldc2_w 4814974014382208149
    //   804: lload_2
    //   805: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   810: athrow
    //   811: aload_0
    //   812: getfield g : Lme/konsolas/aac/cm;
    //   815: aload #27
    //   817: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   820: lload #16
    //   822: dup2_x1
    //   823: pop2
    //   824: invokevirtual a : (JLorg/bukkit/event/block/Action;)V
    //   827: goto -> 840
    //   830: ldc2_w 4814974014382208149
    //   833: lload_2
    //   834: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   839: athrow
    //   840: aload_0
    //   841: aload #26
    //   843: ifnull -> 941
    //   846: getfield l : Lme/konsolas/aac/ce;
    //   849: ifnull -> 940
    //   852: goto -> 865
    //   855: ldc2_w 4814974014382208149
    //   858: lload_2
    //   859: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   864: athrow
    //   865: aload_0
    //   866: lload_2
    //   867: lconst_0
    //   868: lcmp
    //   869: iflt -> 941
    //   872: aload #26
    //   874: ifnull -> 941
    //   877: goto -> 890
    //   880: ldc2_w 4814974014382208149
    //   883: lload_2
    //   884: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   889: athrow
    //   890: getfield l : Lme/konsolas/aac/ce;
    //   893: iload #20
    //   895: i2c
    //   896: iload #21
    //   898: iload #22
    //   900: aload #27
    //   902: invokevirtual a : (CIILorg/bukkit/event/player/PlayerInteractEvent;)Z
    //   905: ifeq -> 940
    //   908: goto -> 921
    //   911: ldc2_w 4814974014382208149
    //   914: lload_2
    //   915: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   920: athrow
    //   921: aload #27
    //   923: iconst_1
    //   924: invokevirtual setCancelled : (Z)V
    //   927: goto -> 940
    //   930: ldc2_w 4814974014382208149
    //   933: lload_2
    //   934: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   939: athrow
    //   940: aload_0
    //   941: getfield k : Lme/konsolas/aac/cC;
    //   944: invokevirtual c : ()V
    //   947: aload #26
    //   949: ifnonnull -> 1411
    //   952: aload_1
    //   953: instanceof org/bukkit/event/player/PlayerItemConsumeEvent
    //   956: goto -> 969
    //   959: ldc2_w 4814974014382208149
    //   962: lload_2
    //   963: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   968: athrow
    //   969: aload #26
    //   971: lload_2
    //   972: lconst_0
    //   973: lcmp
    //   974: ifle -> 1117
    //   977: ifnull -> 1115
    //   980: ifeq -> 1098
    //   983: goto -> 996
    //   986: ldc2_w 4814974014382208149
    //   989: lload_2
    //   990: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   995: athrow
    //   996: aload_1
    //   997: checkcast org/bukkit/event/player/PlayerItemConsumeEvent
    //   1000: astore #27
    //   1002: aload_0
    //   1003: getfield g : Lme/konsolas/aac/cm;
    //   1006: lload_2
    //   1007: lconst_0
    //   1008: lcmp
    //   1009: iflt -> 1050
    //   1012: aload #26
    //   1014: ifnull -> 1050
    //   1017: ifnull -> 1093
    //   1020: goto -> 1033
    //   1023: ldc2_w 4814974014382208149
    //   1026: lload_2
    //   1027: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1032: athrow
    //   1033: aload_0
    //   1034: getfield g : Lme/konsolas/aac/cm;
    //   1037: goto -> 1050
    //   1040: ldc2_w 4814974014382208149
    //   1043: lload_2
    //   1044: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1049: athrow
    //   1050: aload #27
    //   1052: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   1055: invokevirtual getType : ()Lorg/bukkit/Material;
    //   1058: iload #11
    //   1060: i2c
    //   1061: swap
    //   1062: iload #12
    //   1064: swap
    //   1065: iload #13
    //   1067: swap
    //   1068: invokevirtual a : (CIILorg/bukkit/Material;)Z
    //   1071: ifeq -> 1093
    //   1074: aload #27
    //   1076: iconst_1
    //   1077: invokevirtual setCancelled : (Z)V
    //   1080: goto -> 1093
    //   1083: ldc2_w 4814974014382208149
    //   1086: lload_2
    //   1087: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1092: athrow
    //   1093: aload #26
    //   1095: ifnonnull -> 1411
    //   1098: aload_1
    //   1099: instanceof org/bukkit/event/entity/EntityShootBowEvent
    //   1102: goto -> 1115
    //   1105: ldc2_w 4814974014382208149
    //   1108: lload_2
    //   1109: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1114: athrow
    //   1115: aload #26
    //   1117: ifnull -> 1322
    //   1120: ifeq -> 1287
    //   1123: goto -> 1136
    //   1126: ldc2_w 4814974014382208149
    //   1129: lload_2
    //   1130: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1135: athrow
    //   1136: aload_1
    //   1137: checkcast org/bukkit/event/entity/EntityShootBowEvent
    //   1140: astore #27
    //   1142: lload_2
    //   1143: lconst_0
    //   1144: lcmp
    //   1145: ifle -> 1276
    //   1148: aload_0
    //   1149: getfield g : Lme/konsolas/aac/cm;
    //   1152: ifnull -> 1276
    //   1155: aload #27
    //   1157: invokevirtual getBow : ()Lorg/bukkit/inventory/ItemStack;
    //   1160: lload_2
    //   1161: lconst_0
    //   1162: lcmp
    //   1163: iflt -> 1218
    //   1166: aload #26
    //   1168: ifnull -> 1218
    //   1171: goto -> 1184
    //   1174: ldc2_w 4814974014382208149
    //   1177: lload_2
    //   1178: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1183: athrow
    //   1184: ifnull -> 1276
    //   1187: goto -> 1200
    //   1190: ldc2_w 4814974014382208149
    //   1193: lload_2
    //   1194: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1199: athrow
    //   1200: aload #27
    //   1202: invokevirtual getBow : ()Lorg/bukkit/inventory/ItemStack;
    //   1205: goto -> 1218
    //   1208: ldc2_w 4814974014382208149
    //   1211: lload_2
    //   1212: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1217: athrow
    //   1218: invokevirtual getType : ()Lorg/bukkit/Material;
    //   1221: getstatic org/bukkit/Material.BOW : Lorg/bukkit/Material;
    //   1224: if_acmpne -> 1276
    //   1227: aload_0
    //   1228: getfield g : Lme/konsolas/aac/cm;
    //   1231: aload #27
    //   1233: invokevirtual getForce : ()F
    //   1236: lload #14
    //   1238: invokevirtual a : (FJ)Z
    //   1241: ifeq -> 1276
    //   1244: goto -> 1257
    //   1247: ldc2_w 4814974014382208149
    //   1250: lload_2
    //   1251: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1256: athrow
    //   1257: aload #27
    //   1259: iconst_1
    //   1260: invokevirtual setCancelled : (Z)V
    //   1263: goto -> 1276
    //   1266: ldc2_w 4814974014382208149
    //   1269: lload_2
    //   1270: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1275: athrow
    //   1276: lload_2
    //   1277: lconst_0
    //   1278: lcmp
    //   1279: ifle -> 1287
    //   1282: aload #26
    //   1284: ifnonnull -> 1411
    //   1287: aload_1
    //   1288: aload #26
    //   1290: ifnull -> 1326
    //   1293: goto -> 1306
    //   1296: ldc2_w 4814974014382208149
    //   1299: lload_2
    //   1300: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1305: athrow
    //   1306: instanceof org/bukkit/event/entity/EntityRegainHealthEvent
    //   1309: goto -> 1322
    //   1312: ldc2_w 4814974014382208149
    //   1315: lload_2
    //   1316: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1321: athrow
    //   1322: ifeq -> 1411
    //   1325: aload_1
    //   1326: checkcast org/bukkit/event/entity/EntityRegainHealthEvent
    //   1329: astore #27
    //   1331: aload_0
    //   1332: getfield g : Lme/konsolas/aac/cm;
    //   1335: lload_2
    //   1336: lconst_0
    //   1337: lcmp
    //   1338: iflt -> 1379
    //   1341: aload #26
    //   1343: ifnull -> 1379
    //   1346: ifnull -> 1411
    //   1349: goto -> 1362
    //   1352: ldc2_w 4814974014382208149
    //   1355: lload_2
    //   1356: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1361: athrow
    //   1362: aload_0
    //   1363: getfield g : Lme/konsolas/aac/cm;
    //   1366: goto -> 1379
    //   1369: ldc2_w 4814974014382208149
    //   1372: lload_2
    //   1373: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1378: athrow
    //   1379: aload #27
    //   1381: invokevirtual getRegainReason : ()Lorg/bukkit/event/entity/EntityRegainHealthEvent$RegainReason;
    //   1384: lload #9
    //   1386: invokevirtual a : (Lorg/bukkit/event/entity/EntityRegainHealthEvent$RegainReason;J)Z
    //   1389: ifeq -> 1411
    //   1392: aload #27
    //   1394: iconst_1
    //   1395: invokevirtual setCancelled : (Z)V
    //   1398: goto -> 1411
    //   1401: ldc2_w 4814974014382208149
    //   1404: lload_2
    //   1405: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   1410: athrow
    //   1411: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #86	-> 186
    //   #49	-> 211
    //   #69	-> 231
    //   #89	-> 262
    //   #60	-> 268
    //   #28	-> 348
    //   #45	-> 397
    //   #34	-> 403
    //   #64	-> 473
    //   #4	-> 492
    //   #50	-> 541
    //   #72	-> 547
    //   #2	-> 626
    //   #76	-> 645
    //   #44	-> 706
    //   #30	-> 725
    //   #29	-> 774
    //   #54	-> 780
    //   #19	-> 840
    //   #57	-> 921
    //   #53	-> 940
    //   #39	-> 947
    //   #1	-> 996
    //   #66	-> 1002
    //   #84	-> 1093
    //   #26	-> 1136
    //   #74	-> 1142
    //   #59	-> 1233
    //   #6	-> 1276
    //   #18	-> 1325
    //   #32	-> 1331
    //   #90	-> 1411
    // Exception table:
    //   from	to	target	type
    //   186	198	201	aacinternal/v
    //   195	218	221	aacinternal/v
    //   235	249	252	aacinternal/v
    //   268	286	289	aacinternal/v
    //   283	303	306	aacinternal/v
    //   316	335	338	aacinternal/v
    //   348	357	360	aacinternal/v
    //   370	384	387	aacinternal/v
    //   403	421	424	aacinternal/v
    //   418	438	441	aacinternal/v
    //   451	479	482	aacinternal/v
    //   492	501	504	aacinternal/v
    //   514	528	531	aacinternal/v
    //   547	559	562	aacinternal/v
    //   553	584	587	aacinternal/v
    //   572	613	616	aacinternal/v
    //   597	632	635	aacinternal/v
    //   646	663	666	aacinternal/v
    //   660	680	683	aacinternal/v
    //   693	712	715	aacinternal/v
    //   725	734	737	aacinternal/v
    //   747	761	764	aacinternal/v
    //   780	798	801	aacinternal/v
    //   792	827	830	aacinternal/v
    //   841	852	855	aacinternal/v
    //   846	877	880	aacinternal/v
    //   865	908	911	aacinternal/v
    //   890	927	930	aacinternal/v
    //   941	956	959	aacinternal/v
    //   969	983	986	aacinternal/v
    //   1002	1020	1023	aacinternal/v
    //   1017	1037	1040	aacinternal/v
    //   1050	1080	1083	aacinternal/v
    //   1093	1102	1105	aacinternal/v
    //   1115	1123	1126	aacinternal/v
    //   1142	1171	1174	aacinternal/v
    //   1155	1187	1190	aacinternal/v
    //   1184	1205	1208	aacinternal/v
    //   1218	1244	1247	aacinternal/v
    //   1227	1263	1266	aacinternal/v
    //   1276	1293	1296	aacinternal/v
    //   1287	1309	1312	aacinternal/v
    //   1331	1349	1352	aacinternal/v
    //   1346	1366	1369	aacinternal/v
    //   1379	1398	1401	aacinternal/v
  }
  
  static {
    long l = n ^ 0xA6955AA9AFL;
    "和ԝᩳ﫧ゑ虀欧躴硝⮂쾔㍕ấ⃹闧ᢢ?䀙恘㙋㨚".toCharArray()[12] = (char)("和ԝᩳ﫧ゑ虀欧躴硝⮂쾔㍕ấ⃹闧ᢢ?䀙恘㙋㨚".toCharArray()[12] ^ 0x2656);
    "촐碆ĭ".toCharArray()[0] = (char)("촐碆ĭ".toCharArray()[0] ^ 0x528D);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance(fW$gy.A("和ԝᩳ﫧ゑ虀欧躴硝⮂쾔㍕ấ⃹闧ᢢ?䀙恘㙋㨚".toCharArray(), (short)23392, true, 1))).init(2, SecretKeyFactory.getInstance(fW$gy.A("촐碆ĭ".toCharArray(), (short)16889, true, 1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    "魓豮ꃐ砨在쿆젋鯗䁂㢃ⴇ?ቂ혯詯￣敝灮㄀䚢Დ뗤혉驨눻裌㬗蟦ቑ䊙㡶穥햁駏᩸ዠꢨط㨐뱩얢똓Ｙ맵蕠㞟꒼댻⨱䒈鮦윱밭슔햒雫⒉慡굶觔鮿⋜ㄟ⨑듭䄈䪌紱짭镶炲료?ᦴ帕儡⋸᫄틌螦톖ߠᐺ㞸㛉녫?⣞妦䎡듸?ꊢ㧺㑵欵ꥋﰱꚒ볕?徤뤞溾稲體髸㴢볉귞얉Ἧ䋣㸀룫庝⃵╿埃珻?喳滧碎삩눫㦾刕䣩콽姢兩瘂䘟툕ᠮ㒼猰뺻ꊄ⨂Ş".toCharArray()[95] = (char)("魓豮ꃐ砨在쿆젋鯗䁂㢃ⴇ?ቂ혯詯￣敝灮㄀䚢Დ뗤혉驨눻裌㬗蟦ቑ䊙㡶穥햁駏᩸ዠꢨط㨐뱩얢똓Ｙ맵蕠㞟꒼댻⨱䒈鮦윱밭슔햒雫⒉慡굶觔鮿⋜ㄟ⨑듭䄈䪌紱짭镶炲료?ᦴ帕儡⋸᫄틌螦톖ߠᐺ㞸㛉녫?⣞妦䎡듸?ꊢ㧺㑵欵ꥋﰱꚒ볕?徤뤞溾稲體髸㴢볉귞얉Ἧ䋣㸀룫庝⃵╿埃珻?喳滧碎삩눫㦾刕䣩콽姢兩瘂䘟툕ᠮ㒼猰뺻ꊄ⨂Ş".toCharArray()[95] ^ 0x1D1C);
    String str;
    int i = (str = fW$gy.A("魓豮ꃐ砨在쿆젋鯗䁂㢃ⴇ?ቂ혯詯￣敝灮㄀䚢Დ뗤혉驨눻裌㬗蟦ቑ䊙㡶穥햁駏᩸ዠꢨط㨐뱩얢똓Ｙ맵蕠㞟꒼댻⨱䒈鮦윱밭슔햒雫⒉慡굶觔鮿⋜ㄟ⨑듭䄈䪌紱짭镶炲료?ᦴ帕儡⋸᫄틌螦톖ߠᐺ㞸㛉녫?⣞妦䎡듸?ꊢ㧺㑵欵ꥋﰱꚒ볕?徤뤞溾稲體髸㴢볉귞얉Ἧ䋣㸀룫庝⃵╿埃珻?喳滧碎삩눫㦾刕䣩콽姢兩瘂䘟툕ᠮ㒼猰뺻ꊄ⨂Ş".toCharArray(), (short)30041, true, 4)).length();
    byte b2 = 24;
    byte b = -1;
    while (true);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5D3F;
    if (p[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])q.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          "를ⱌᇺ೨䙌?薲姥㬲ж꺺稉㎢Ҷ๚⸴飻弥".toCharArray()[6] = (char)("를ⱌᇺ೨䙌?薲姥㬲ж꺺稉㎢Ҷ๚⸴飻弥".toCharArray()[6] ^ 0x57E5);
          arrayOfObject[0] = Cipher.getInstance(fW$gy.A("를ⱌᇺ೨䙌?薲姥㬲ж꺺稉㎢Ҷ๚⸴飻弥".toCharArray(), (short)18994, true, 0));
          "ዙ殛ꃋ⏶".toCharArray()[2] = (char)("ዙ殛ꃋ⏶".toCharArray()[2] ^ 0x6C1A);
          arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("ዙ殛ꃋ⏶".toCharArray(), (short)24700, false, 4));
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          q.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        "Ὀ厾쳔씨浒刵ʆ䞺肃ᘆꞱ薽髖Ữೀ⛬㽥Ⲁ".toCharArray()[5] = (char)("Ὀ厾쳔씨浒刵ʆ䞺肃ᘆꞱ薽髖Ữೀ⛬㽥Ⲁ".toCharArray()[5] ^ 0x4AFF);
        throw new RuntimeException(fW$gy.A("Ὀ厾쳔씨浒刵ʆ䞺肃ᘆꞱ薽髖Ữೀ⛬㽥Ⲁ".toCharArray(), (short)15320, false, 2), exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      "ݔ澨衕쓌摱ᓐ緩峢".toCharArray()[5] = (char)("ݔ澨衕쓌摱ᓐ緩峢".toCharArray()[5] ^ 0x1EBC);
      byte[] arrayOfByte2 = o[i].getBytes(fW$gy.A("ݔ澨衕쓌摱ᓐ緩峢".toCharArray(), (short)28926, true, 0));
      p[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return p[i];
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
    //   50: goto -> 171
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w '프눭㧭ౢỚ柺⸈齧⅛唚苾ᢄ㸮﫫亵⊖'
    //   69: invokevirtual toCharArray : ()[C
    //   72: dup
    //   73: dup
    //   74: bipush #8
    //   76: dup_x1
    //   77: caload
    //   78: sipush #7607
    //   81: ixor
    //   82: i2c
    //   83: castore
    //   84: sipush #7769
    //   87: iconst_1
    //   88: iconst_1
    //   89: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: ldc_w '듟褪ⅱ'
    //   98: invokevirtual toCharArray : ()[C
    //   101: dup
    //   102: dup
    //   103: iconst_1
    //   104: dup_x1
    //   105: caload
    //   106: sipush #15575
    //   109: ixor
    //   110: i2c
    //   111: castore
    //   112: sipush #21950
    //   115: iconst_1
    //   116: iconst_0
    //   117: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: aload_1
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: ldc_w '쏂靗෬ও'
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup
    //   134: dup
    //   135: iconst_1
    //   136: dup_x1
    //   137: caload
    //   138: sipush #2621
    //   141: ixor
    //   142: i2c
    //   143: castore
    //   144: sipush #10120
    //   147: iconst_0
    //   148: iconst_1
    //   149: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: aload_2
    //   156: invokevirtual toString : ()Ljava/lang/String;
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: invokevirtual toString : ()Ljava/lang/String;
    //   165: aload #4
    //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   170: athrow
    //   171: aload_3
    //   172: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */