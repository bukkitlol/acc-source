package me.konsolas.aac;

import java.io.File;
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
import org.bukkit.plugin.Plugin;

public class i6 {
  private static final long a = nc.a(-8261957998286190586L, -794818235348296314L, MethodHandles.lookup().lookupClass()).a(245083500201258L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public static void a(long paramLong, AAC paramAAC, File paramFile) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/i6.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 135727518189734
    //   11: lxor
    //   12: lstore #4
    //   14: pop2
    //   15: ldc2_w 2703957171762635302
    //   18: lload_0
    //   19: <illegal opcode> w : (JJ)[Ljava/lang/String;
    //   24: astore #6
    //   26: aload_2
    //   27: invokevirtual getClass : ()Ljava/lang/Class;
    //   30: invokevirtual getProtectionDomain : ()Ljava/security/ProtectionDomain;
    //   33: invokevirtual getCodeSource : ()Ljava/security/CodeSource;
    //   36: invokevirtual getLocation : ()Ljava/net/URL;
    //   39: invokevirtual toURI : ()Ljava/net/URI;
    //   42: invokestatic get : (Ljava/net/URI;)Ljava/nio/file/Path;
    //   45: astore #7
    //   47: goto -> 75
    //   50: astore #8
    //   52: new java/lang/RuntimeException
    //   55: dup
    //   56: sipush #12285
    //   59: ldc2_w 4990802239846282848
    //   62: lload_0
    //   63: lxor
    //   64: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   69: aload #8
    //   71: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   74: athrow
    //   75: aload_2
    //   76: lload #4
    //   78: invokestatic a : (Lorg/bukkit/plugin/Plugin;J)V
    //   81: aload #7
    //   83: new java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: aload #7
    //   92: invokeinterface getFileName : ()Ljava/nio/file/Path;
    //   97: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   100: sipush #18467
    //   103: ldc2_w 6170884868085060028
    //   106: lload_0
    //   107: lxor
    //   108: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: invokevirtual toString : ()Ljava/lang/String;
    //   119: invokeinterface resolveSibling : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   124: astore #8
    //   126: aload #8
    //   128: invokestatic deleteIfExists : (Ljava/nio/file/Path;)Z
    //   131: pop
    //   132: aload #7
    //   134: aload #8
    //   136: iconst_0
    //   137: anewarray java/nio/file/CopyOption
    //   140: invokestatic move : (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    //   143: pop
    //   144: goto -> 172
    //   147: astore #8
    //   149: new java/lang/RuntimeException
    //   152: dup
    //   153: sipush #27518
    //   156: ldc2_w 5037382081437577952
    //   159: lload_0
    //   160: lxor
    //   161: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   166: aload #8
    //   168: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   171: athrow
    //   172: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   175: aload_3
    //   176: invokeinterface loadPlugin : (Ljava/io/File;)Lorg/bukkit/plugin/Plugin;
    //   181: astore #8
    //   183: aload #8
    //   185: ifnonnull -> 206
    //   188: new java/lang/IllegalStateException
    //   191: dup
    //   192: invokespecial <init> : ()V
    //   195: athrow
    //   196: ldc2_w 2678371409849665562
    //   199: lload_0
    //   200: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   205: athrow
    //   206: goto -> 221
    //   209: astore #9
    //   211: new java/lang/RuntimeException
    //   214: dup
    //   215: aload #9
    //   217: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   220: athrow
    //   221: aload #8
    //   223: invokeinterface onLoad : ()V
    //   228: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   231: aload #8
    //   233: invokeinterface enablePlugin : (Lorg/bukkit/plugin/Plugin;)V
    //   238: lload_0
    //   239: lconst_0
    //   240: lcmp
    //   241: iflt -> 262
    //   244: aload #6
    //   246: ifnonnull -> 275
    //   249: iconst_4
    //   250: anewarray me/konsolas/aac/aN
    //   253: ldc2_w 2735252665619381280
    //   256: lload_0
    //   257: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
    //   262: goto -> 275
    //   265: ldc2_w 2678371409849665562
    //   268: lload_0
    //   269: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   274: athrow
    //   275: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #47	-> 26
    //   #28	-> 47
    //   #2	-> 50
    //   #59	-> 52
    //   #20	-> 75
    //   #49	-> 81
    //   #78	-> 126
    //   #76	-> 132
    //   #4	-> 144
    //   #68	-> 147
    //   #25	-> 149
    //   #85	-> 172
    //   #21	-> 183
    //   #13	-> 206
    //   #23	-> 209
    //   #35	-> 211
    //   #81	-> 221
    //   #50	-> 228
    //   #33	-> 238
    // Exception table:
    //   from	to	target	type
    //   26	47	50	java/net/URISyntaxException
    //   81	144	147	java/io/IOException
    //   172	206	209	org/bukkit/plugin/InvalidPluginException
    //   172	206	209	org/bukkit/plugin/InvalidDescriptionException
    //   183	196	196	java/net/URISyntaxException
    //   221	262	265	java/net/URISyntaxException
  }
  
  public static void a(Plugin paramPlugin, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/i6.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: ldc2_w -6692578032757791553
    //   9: lload_1
    //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
    //   15: aload_0
    //   16: invokeinterface getName : ()Ljava/lang/String;
    //   21: astore #4
    //   23: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   26: astore #5
    //   28: aconst_null
    //   29: astore #6
    //   31: aconst_null
    //   32: astore #7
    //   34: aconst_null
    //   35: astore #8
    //   37: aconst_null
    //   38: astore #9
    //   40: aconst_null
    //   41: astore #10
    //   43: astore_3
    //   44: iconst_1
    //   45: istore #11
    //   47: aload #5
    //   49: aload_3
    //   50: ifnull -> 80
    //   53: ifnull -> 318
    //   56: goto -> 69
    //   59: ldc2_w -6651199140308103549
    //   62: lload_1
    //   63: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload #5
    //   71: aload_0
    //   72: invokeinterface disablePlugin : (Lorg/bukkit/plugin/Plugin;)V
    //   77: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   80: invokevirtual getClass : ()Ljava/lang/Class;
    //   83: sipush #11337
    //   86: ldc2_w 4089821082445771587
    //   89: lload_1
    //   90: lxor
    //   91: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   96: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   99: astore #12
    //   101: aload #12
    //   103: iconst_1
    //   104: invokevirtual setAccessible : (Z)V
    //   107: aload #12
    //   109: aload #5
    //   111: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   114: checkcast java/util/List
    //   117: astore #7
    //   119: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   122: invokevirtual getClass : ()Ljava/lang/Class;
    //   125: sipush #4376
    //   128: ldc2_w 411483846017076765
    //   131: lload_1
    //   132: lxor
    //   133: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   138: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   141: astore #13
    //   143: aload #13
    //   145: iconst_1
    //   146: invokevirtual setAccessible : (Z)V
    //   149: aload #13
    //   151: aload #5
    //   153: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   156: checkcast java/util/Map
    //   159: astore #8
    //   161: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   164: invokevirtual getClass : ()Ljava/lang/Class;
    //   167: sipush #31987
    //   170: ldc2_w 4118436061503988723
    //   173: lload_1
    //   174: lxor
    //   175: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   180: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   183: astore #14
    //   185: aload #14
    //   187: iconst_1
    //   188: invokevirtual setAccessible : (Z)V
    //   191: aload #14
    //   193: aload #5
    //   195: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   198: checkcast java/util/Map
    //   201: astore #10
    //   203: goto -> 211
    //   206: astore #14
    //   208: iconst_0
    //   209: istore #11
    //   211: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   214: invokevirtual getClass : ()Ljava/lang/Class;
    //   217: sipush #7571
    //   220: ldc2_w 4154907177009791634
    //   223: lload_1
    //   224: lxor
    //   225: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   230: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   233: astore #14
    //   235: aload #14
    //   237: iconst_1
    //   238: invokevirtual setAccessible : (Z)V
    //   241: aload #14
    //   243: aload #5
    //   245: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   248: checkcast org/bukkit/command/SimpleCommandMap
    //   251: astore #6
    //   253: ldc org/bukkit/command/SimpleCommandMap
    //   255: sipush #25037
    //   258: ldc2_w 3405014922935189198
    //   261: lload_1
    //   262: lxor
    //   263: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   268: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   271: astore #15
    //   273: aload #15
    //   275: iconst_1
    //   276: invokevirtual setAccessible : (Z)V
    //   279: aload #15
    //   281: aload #6
    //   283: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   286: checkcast java/util/Map
    //   289: astore #9
    //   291: goto -> 318
    //   294: astore #12
    //   296: new java/lang/RuntimeException
    //   299: dup
    //   300: aload #12
    //   302: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   305: athrow
    //   306: astore #12
    //   308: new java/lang/RuntimeException
    //   311: dup
    //   312: aload #12
    //   314: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   317: athrow
    //   318: aload #5
    //   320: aload_0
    //   321: invokeinterface disablePlugin : (Lorg/bukkit/plugin/Plugin;)V
    //   326: aload #7
    //   328: lload_1
    //   329: lconst_0
    //   330: lcmp
    //   331: iflt -> 356
    //   334: aload_3
    //   335: ifnull -> 356
    //   338: ifnull -> 404
    //   341: goto -> 354
    //   344: ldc2_w -6651199140308103549
    //   347: lload_1
    //   348: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   353: athrow
    //   354: aload #7
    //   356: aload_0
    //   357: invokeinterface contains : (Ljava/lang/Object;)Z
    //   362: aload_3
    //   363: ifnull -> 403
    //   366: ifeq -> 404
    //   369: goto -> 382
    //   372: ldc2_w -6651199140308103549
    //   375: lload_1
    //   376: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   381: athrow
    //   382: aload #7
    //   384: aload_0
    //   385: invokeinterface remove : (Ljava/lang/Object;)Z
    //   390: goto -> 403
    //   393: ldc2_w -6651199140308103549
    //   396: lload_1
    //   397: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   402: athrow
    //   403: pop
    //   404: aload #8
    //   406: aload_3
    //   407: ifnull -> 499
    //   410: ifnull -> 497
    //   413: goto -> 426
    //   416: ldc2_w -6651199140308103549
    //   419: lload_1
    //   420: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   425: athrow
    //   426: aload #8
    //   428: lload_1
    //   429: lconst_0
    //   430: lcmp
    //   431: iflt -> 499
    //   434: aload_3
    //   435: ifnull -> 499
    //   438: goto -> 451
    //   441: ldc2_w -6651199140308103549
    //   444: lload_1
    //   445: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   450: athrow
    //   451: aload #4
    //   453: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   458: ifeq -> 497
    //   461: goto -> 474
    //   464: ldc2_w -6651199140308103549
    //   467: lload_1
    //   468: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   473: athrow
    //   474: aload #8
    //   476: aload #4
    //   478: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   483: pop
    //   484: goto -> 497
    //   487: ldc2_w -6651199140308103549
    //   490: lload_1
    //   491: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   496: athrow
    //   497: aload #10
    //   499: ifnull -> 651
    //   502: iload #11
    //   504: ifeq -> 651
    //   507: goto -> 520
    //   510: ldc2_w -6651199140308103549
    //   513: lload_1
    //   514: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   519: athrow
    //   520: aload #10
    //   522: invokeinterface values : ()Ljava/util/Collection;
    //   527: invokeinterface iterator : ()Ljava/util/Iterator;
    //   532: astore #12
    //   534: aload #12
    //   536: invokeinterface hasNext : ()Z
    //   541: ifeq -> 651
    //   544: aload #12
    //   546: invokeinterface next : ()Ljava/lang/Object;
    //   551: checkcast java/util/SortedSet
    //   554: astore #13
    //   556: aload #13
    //   558: invokeinterface iterator : ()Ljava/util/Iterator;
    //   563: aload_3
    //   564: ifnull -> 687
    //   567: astore #14
    //   569: aload #14
    //   571: invokeinterface hasNext : ()Z
    //   576: ifeq -> 641
    //   579: aload #14
    //   581: invokeinterface next : ()Ljava/lang/Object;
    //   586: checkcast org/bukkit/plugin/RegisteredListener
    //   589: astore #15
    //   591: aload #15
    //   593: invokevirtual getPlugin : ()Lorg/bukkit/plugin/Plugin;
    //   596: aload_3
    //   597: ifnull -> 831
    //   600: aload_0
    //   601: if_acmpne -> 637
    //   604: goto -> 617
    //   607: ldc2_w -6651199140308103549
    //   610: lload_1
    //   611: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   616: athrow
    //   617: aload #14
    //   619: invokeinterface remove : ()V
    //   624: goto -> 637
    //   627: ldc2_w -6651199140308103549
    //   630: lload_1
    //   631: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   636: athrow
    //   637: aload_3
    //   638: ifnonnull -> 569
    //   641: aload_3
    //   642: lload_1
    //   643: lconst_0
    //   644: lcmp
    //   645: ifle -> 586
    //   648: ifnonnull -> 534
    //   651: lload_1
    //   652: lconst_0
    //   653: lcmp
    //   654: iflt -> 830
    //   657: aload #6
    //   659: ifnull -> 830
    //   662: aload #9
    //   664: invokeinterface entrySet : ()Ljava/util/Set;
    //   669: invokeinterface iterator : ()Ljava/util/Iterator;
    //   674: goto -> 687
    //   677: ldc2_w -6651199140308103549
    //   680: lload_1
    //   681: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   686: athrow
    //   687: astore #12
    //   689: aload #12
    //   691: invokeinterface hasNext : ()Z
    //   696: ifeq -> 830
    //   699: aload #12
    //   701: invokeinterface next : ()Ljava/lang/Object;
    //   706: checkcast java/util/Map$Entry
    //   709: astore #13
    //   711: aload #13
    //   713: invokeinterface getValue : ()Ljava/lang/Object;
    //   718: aload_3
    //   719: ifnull -> 761
    //   722: instanceof org/bukkit/command/PluginCommand
    //   725: ifeq -> 826
    //   728: goto -> 741
    //   731: ldc2_w -6651199140308103549
    //   734: lload_1
    //   735: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   740: athrow
    //   741: aload #13
    //   743: invokeinterface getValue : ()Ljava/lang/Object;
    //   748: goto -> 761
    //   751: ldc2_w -6651199140308103549
    //   754: lload_1
    //   755: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   760: athrow
    //   761: checkcast org/bukkit/command/PluginCommand
    //   764: astore #14
    //   766: lload_1
    //   767: lconst_0
    //   768: lcmp
    //   769: ifle -> 819
    //   772: aload #14
    //   774: aload_3
    //   775: ifnull -> 813
    //   778: invokevirtual getPlugin : ()Lorg/bukkit/plugin/Plugin;
    //   781: aload_0
    //   782: if_acmpne -> 826
    //   785: goto -> 798
    //   788: ldc2_w -6651199140308103549
    //   791: lload_1
    //   792: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   797: athrow
    //   798: aload #14
    //   800: goto -> 813
    //   803: ldc2_w -6651199140308103549
    //   806: lload_1
    //   807: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   812: athrow
    //   813: aload #6
    //   815: invokevirtual unregister : (Lorg/bukkit/command/CommandMap;)Z
    //   818: pop
    //   819: aload #12
    //   821: invokeinterface remove : ()V
    //   826: aload_3
    //   827: ifnonnull -> 689
    //   830: aload_0
    //   831: invokevirtual getClass : ()Ljava/lang/Class;
    //   834: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   837: astore #12
    //   839: lload_1
    //   840: lconst_0
    //   841: lcmp
    //   842: iflt -> 985
    //   845: aload_3
    //   846: ifnull -> 985
    //   849: aload #12
    //   851: instanceof java/net/URLClassLoader
    //   854: ifeq -> 982
    //   857: goto -> 870
    //   860: ldc2_w -6651199140308103549
    //   863: lload_1
    //   864: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   869: athrow
    //   870: aload #12
    //   872: invokevirtual getClass : ()Ljava/lang/Class;
    //   875: sipush #25517
    //   878: ldc2_w 4834336712977956006
    //   881: lload_1
    //   882: lxor
    //   883: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   888: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   891: astore #13
    //   893: aload #13
    //   895: iconst_1
    //   896: invokevirtual setAccessible : (Z)V
    //   899: aload #13
    //   901: aload #12
    //   903: aconst_null
    //   904: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   907: aload #12
    //   909: invokevirtual getClass : ()Ljava/lang/Class;
    //   912: sipush #31202
    //   915: ldc2_w 1017936753887520480
    //   918: lload_1
    //   919: lxor
    //   920: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   925: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   928: astore #14
    //   930: aload #14
    //   932: iconst_1
    //   933: invokevirtual setAccessible : (Z)V
    //   936: aload #14
    //   938: aload #12
    //   940: aconst_null
    //   941: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   944: goto -> 959
    //   947: astore #13
    //   949: new java/lang/RuntimeException
    //   952: dup
    //   953: aload #13
    //   955: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   958: athrow
    //   959: aload #12
    //   961: checkcast java/net/URLClassLoader
    //   964: invokevirtual close : ()V
    //   967: goto -> 982
    //   970: astore #13
    //   972: new java/lang/RuntimeException
    //   975: dup
    //   976: aload #13
    //   978: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   981: athrow
    //   982: invokestatic gc : ()V
    //   985: lload_1
    //   986: lconst_0
    //   987: lcmp
    //   988: iflt -> 1016
    //   991: ldc2_w -6678546557160331278
    //   994: lload_1
    //   995: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
    //   1000: ifnull -> 1029
    //   1003: iconst_3
    //   1004: anewarray java/lang/String
    //   1007: ldc2_w -6674558351633574222
    //   1010: lload_1
    //   1011: <illegal opcode> w : ([Ljava/lang/String;JJ)V
    //   1016: goto -> 1029
    //   1019: ldc2_w -6651199140308103549
    //   1022: lload_1
    //   1023: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   1028: athrow
    //   1029: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #57	-> 15
    //   #19	-> 23
    //   #32	-> 28
    //   #8	-> 31
    //   #40	-> 34
    //   #60	-> 37
    //   #89	-> 40
    //   #18	-> 44
    //   #1	-> 47
    //   #5	-> 69
    //   #42	-> 77
    //   #87	-> 101
    //   #10	-> 107
    //   #82	-> 119
    //   #54	-> 143
    //   #9	-> 149
    //   #52	-> 161
    //   #12	-> 185
    //   #80	-> 191
    //   #74	-> 203
    //   #3	-> 206
    //   #92	-> 208
    //   #62	-> 211
    //   #88	-> 235
    //   #26	-> 241
    //   #24	-> 253
    //   #44	-> 273
    //   #15	-> 279
    //   #90	-> 291
    //   #41	-> 294
    //   #73	-> 296
    //   #7	-> 306
    //   #39	-> 308
    //   #38	-> 318
    //   #58	-> 326
    //   #61	-> 382
    //   #86	-> 404
    //   #67	-> 474
    //   #46	-> 497
    //   #69	-> 520
    //   #63	-> 556
    //   #27	-> 579
    //   #77	-> 591
    //   #72	-> 617
    //   #22	-> 637
    //   #56	-> 641
    //   #66	-> 651
    //   #79	-> 662
    //   #53	-> 699
    //   #34	-> 711
    //   #6	-> 741
    //   #31	-> 766
    //   #45	-> 798
    //   #14	-> 819
    //   #75	-> 826
    //   #83	-> 830
    //   #43	-> 839
    //   #30	-> 870
    //   #51	-> 893
    //   #71	-> 899
    //   #91	-> 907
    //   #64	-> 930
    //   #55	-> 936
    //   #48	-> 944
    //   #17	-> 947
    //   #11	-> 949
    //   #36	-> 959
    //   #16	-> 967
    //   #70	-> 970
    //   #65	-> 972
    //   #29	-> 982
    //   #84	-> 985
    // Exception table:
    //   from	to	target	type
    //   47	56	59	java/lang/Exception
    //   77	291	294	java/lang/NoSuchFieldException
    //   77	291	306	java/lang/IllegalAccessException
    //   161	203	206	java/lang/Exception
    //   318	341	344	java/lang/Exception
    //   356	369	372	java/lang/Exception
    //   366	390	393	java/lang/Exception
    //   404	413	416	java/lang/Exception
    //   410	438	441	java/lang/Exception
    //   426	461	464	java/lang/Exception
    //   451	484	487	java/lang/Exception
    //   499	507	510	java/lang/Exception
    //   591	604	607	java/lang/Exception
    //   600	624	627	java/lang/Exception
    //   651	674	677	java/lang/Exception
    //   711	728	731	java/lang/Exception
    //   722	748	751	java/lang/Exception
    //   766	785	788	java/lang/Exception
    //   778	800	803	java/lang/Exception
    //   839	857	860	java/lang/Exception
    //   870	944	947	java/lang/NoSuchFieldException
    //   870	944	947	java/lang/SecurityException
    //   870	944	947	java/lang/IllegalArgumentException
    //   870	944	947	java/lang/IllegalAccessException
    //   959	967	970	java/io/IOException
    //   985	1016	1019	java/lang/Exception
  }
  
  static {
    long l = a ^ 0x2B1B597C121BL;
    "먜쉲ٷ?☥뭜?줪퀣컂멫ꖟᱼ?ꔹ酃⩒磌".toCharArray()[14] = (char)("먜쉲ٷ?☥뭜?줪퀣컂멫ꖟᱼ?ꔹ酃⩒磌".toCharArray()[14] ^ 0x206F);
    "❌洎⓼糈".toCharArray()[1] = (char)("❌洎⓼糈".toCharArray()[1] ^ 0x329);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance(dP$dt.X("먜쉲ٷ?☥뭜?줪퀣컂멫ꖟᱼ?ꔹ酃⩒磌".toCharArray(), (short)4881, false, true))).init(2, SecretKeyFactory.getInstance(dP$dt.X("❌洎⓼糈".toCharArray(), (short)14255, false, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[10];
    boolean bool = false;
    "Ӵ춷韔殛攢ౄམ紲맠䫂劈텞嵅⎑턮᱇䒰刋库쬫曮㶔杞ԡ뺔荂᪪笃⫪퇟լ奧⣳莂㧿힑?ᒾ䜳잓᭹Դ㷑맺쯨跭廗℥즄Ⲱ┪浠ㅒ⢥ː䬥鹈ꯜ蜔?爄列돻挶?⅜崙鮀ᕪꑆᘨ㵢飮쩱䆌釅蕏ۋᨛᅃბ၁荽で칲霩傗떓傘飣?讜ꆅ扡땎㽋꾏蟱닔縒ᢏᄱ扸䧢嬺意佈蜊뻔鸑糩⻫ੱ䨦?님輩?鹚皝?냚熳০᥉ሤ㫿ੁ볚ᾌ꘡꬞ﰴ納楤㓙䙉譝ﾈＢ젙렶绪溫惖푱䭝궡㍤蒫雭ᚳᯘ霿㭛穦츟⟰㺑몟ꯪ뚜쮯䏇⣜쐴詐ℬﯱ㛻줯ो鼃ᔭ茬챷槰䗚힀푡䦠θ쮏堜≝Ε봅軽ഽ놉?綉?䡕禜镠䕑諅徤耙꨸苌辗Дꂝÿ忱ꇳ솿⊏唦ꦥ떖şᯌ㖑ꗆ≎ᐌꜜ俚ꗟ좔텞갰䡭ꯦ氰䒈뱐穳廆뱈鄊ﺭ⇫".toCharArray()[6] = (char)("Ӵ춷韔殛攢ౄམ紲맠䫂劈텞嵅⎑턮᱇䒰刋库쬫曮㶔杞ԡ뺔荂᪪笃⫪퇟լ奧⣳莂㧿힑?ᒾ䜳잓᭹Դ㷑맺쯨跭廗℥즄Ⲱ┪浠ㅒ⢥ː䬥鹈ꯜ蜔?爄列돻挶?⅜崙鮀ᕪꑆᘨ㵢飮쩱䆌釅蕏ۋᨛᅃბ၁荽で칲霩傗떓傘飣?讜ꆅ扡땎㽋꾏蟱닔縒ᢏᄱ扸䧢嬺意佈蜊뻔鸑糩⻫ੱ䨦?님輩?鹚皝?냚熳০᥉ሤ㫿ੁ볚ᾌ꘡꬞ﰴ納楤㓙䙉譝ﾈＢ젙렶绪溫惖푱䭝궡㍤蒫雭ᚳᯘ霿㭛穦츟⟰㺑몟ꯪ뚜쮯䏇⣜쐴詐ℬﯱ㛻줯ो鼃ᔭ茬챷槰䗚힀푡䦠θ쮏堜≝Ε봅軽ഽ놉?綉?䡕禜镠䕑諅徤耙꨸苌辗Дꂝÿ忱ꇳ솿⊏唦ꦥ떖şᯌ㖑ꗆ≎ᐌꜜ俚ꗟ좔텞갰䡭ꯦ氰䒈뱐穳廆뱈鄊ﺭ⇫".toCharArray()[6] ^ 0x7771);
    String str;
    int i = (str = dP$dt.X("Ӵ춷韔殛攢ౄམ紲맠䫂劈텞嵅⎑턮᱇䒰刋库쬫曮㶔杞ԡ뺔荂᪪笃⫪퇟լ奧⣳莂㧿힑?ᒾ䜳잓᭹Դ㷑맺쯨跭廗℥즄Ⲱ┪浠ㅒ⢥ː䬥鹈ꯜ蜔?爄列돻挶?⅜崙鮀ᕪꑆᘨ㵢飮쩱䆌釅蕏ۋᨛᅃბ၁荽で칲霩傗떓傘飣?讜ꆅ扡땎㽋꾏蟱닔縒ᢏᄱ扸䧢嬺意佈蜊뻔鸑糩⻫ੱ䨦?님輩?鹚皝?냚熳০᥉ሤ㫿ੁ볚ᾌ꘡꬞ﰴ納楤㓙䙉譝ﾈＢ젙렶绪溫惖푱䭝궡㍤蒫雭ᚳᯘ霿㭛穦츟⟰㺑몟ꯪ뚜쮯䏇⣜쐴詐ℬﯱ㛻줯ो鼃ᔭ茬챷槰䗚힀푡䦠θ쮏堜≝Ε봅軽ഽ놉?綉?䡕禜镠䕑諅徤耙꨸苌辗Дꂝÿ忱ꇳ솿⊏唦ꦥ떖şᯌ㖑ꗆ≎ᐌꜜ俚ꗟ좔텞갰䡭ꯦ氰䒈뱐穳廆뱈鄊ﺭ⇫".toCharArray(), (short)1912, false, false)).length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
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
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7D39;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          "趄㘳糔猪穓줼쟟ꒀ넅敒㼘頠?硣䉊嶼⌕".toCharArray()[9] = (char)("趄㘳糔猪穓줼쟟ꒀ넅敒㼘頠?硣䉊嶼⌕".toCharArray()[9] ^ 0x179E);
          arrayOfObject[0] = Cipher.getInstance(da$gx.U("趄㘳糔猪穓줼쟟ꒀ넅敒㼘頠?硣䉊嶼⌕".toCharArray(), (short)7763, false, true));
          "ᾇ쨾鏥爮".toCharArray()[0] = (char)("ᾇ쨾鏥爮".toCharArray()[0] ^ 0x744C);
          arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("ᾇ쨾鏥爮".toCharArray(), (short)23800, true, false));
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        "墛넯衄谶ꐵ䱝睬壵赙茚ꀍЅ嫨镾滑?处".toCharArray()[4] = (char)("墛넯衄谶ꐵ䱝睬壵赙茚ꀍЅ嫨镾滑?处".toCharArray()[4] ^ 0x1838);
        throw new RuntimeException(da$gx.U("墛넯衄谶ꐵ䱝睬壵赙茚ꀍЅ嫨镾滑?处".toCharArray(), (short)26403, false, true), exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      "Ĝꬫ෌뮧萌釳瓩邐랊礡༱".toCharArray()[0] = (char)("Ĝꬫ෌뮧萌釳瓩邐랊礡༱".toCharArray()[0] ^ 0x272);
      byte[] arrayOfByte2 = b[i].getBytes(da$gx.U("Ĝꬫ෌뮧萌釳瓩邐랊礡༱".toCharArray(), (short)2082, false, false));
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'Ꮃ?㞻?輞ヒ瑙仾鷟瑖꺅?સ ش䟐堤㣿Р'
    //   69: invokevirtual toCharArray : ()[C
    //   72: dup
    //   73: dup
    //   74: iconst_4
    //   75: dup_x1
    //   76: caload
    //   77: sipush #25135
    //   80: ixor
    //   81: i2c
    //   82: castore
    //   83: sipush #3035
    //   86: iconst_0
    //   87: iconst_0
    //   88: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w '鐤蓠⾉'
    //   97: invokevirtual toCharArray : ()[C
    //   100: dup
    //   101: dup
    //   102: iconst_2
    //   103: dup_x1
    //   104: caload
    //   105: sipush #367
    //   108: ixor
    //   109: i2c
    //   110: castore
    //   111: sipush #23010
    //   114: iconst_1
    //   115: iconst_0
    //   116: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_1
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc_w 'ᦄ톞ꛨ㢦'
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup
    //   133: dup
    //   134: iconst_2
    //   135: dup_x1
    //   136: caload
    //   137: sipush #31305
    //   140: ixor
    //   141: i2c
    //   142: castore
    //   143: sipush #14470
    //   146: iconst_1
    //   147: iconst_1
    //   148: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */