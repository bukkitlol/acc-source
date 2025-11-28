/*    */ package me.konsolas.aac;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.net.URLConnection;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ import java.util.concurrent.ConcurrentHashMap;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ 
/*    */ public class AAC extends JavaPlugin implements Listener {
/*    */   private static final Map s;
/*    */   private static final String[] r;
/*    */   private static final String[] q;
/*    */   
/*    */   public mi a() {
/* 22 */     return this.g;
/*    */   } private static final long p; private static String[] i; private w l; @EventHandler(priority = EventPriority.LOWEST)
/*    */   public void a(PlayerJoinEvent paramPlayerJoinEvent) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   3: ldc2_w 23148709226956
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 60757393424367
/*    */     //   13: lxor
/*    */     //   14: lstore #4
/*    */     //   16: dup2
/*    */     //   17: ldc2_w 11050445874255
/*    */     //   20: lxor
/*    */     //   21: lstore #6
/*    */     //   23: dup2
/*    */     //   24: ldc2_w 121071242761041
/*    */     //   27: lxor
/*    */     //   28: lstore #8
/*    */     //   30: pop2
/*    */     //   31: ldc2_w 2791257670225366279
/*    */     //   34: lload_2
/*    */     //   35: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   40: aload_0
/*    */     //   41: getfield h : Lme/konsolas/aac/iS;
/*    */     //   44: aload_1
/*    */     //   45: ldc2_w 2790067051307962456
/*    */     //   48: lload_2
/*    */     //   49: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerJoinEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   54: lload #6
/*    */     //   56: dup2_x1
/*    */     //   57: pop2
/*    */     //   58: ldc2_w 2795596548427273689
/*    */     //   61: lload_2
/*    */     //   62: <illegal opcode> b : (Lme/konsolas/aac/iS;JLorg/bukkit/entity/Player;JJ)V
/*    */     //   67: astore #10
/*    */     //   69: aload_0
/*    */     //   70: getfield o : Lme/konsolas/aac/fv;
/*    */     //   73: aload_1
/*    */     //   74: ldc2_w 2790067051307962456
/*    */     //   77: lload_2
/*    */     //   78: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerJoinEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   83: ldc2_w 2828285559220572351
/*    */     //   86: lload_2
/*    */     //   87: <illegal opcode> b : (Lme/konsolas/aac/fv;Lorg/bukkit/entity/Player;JJ)V
/*    */     //   92: aload_0
/*    */     //   93: aload_1
/*    */     //   94: ldc2_w 2790067051307962456
/*    */     //   97: lload_2
/*    */     //   98: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerJoinEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   103: aload #10
/*    */     //   105: ifnull -> 223
/*    */     //   108: ldc2_w 2840690639603373129
/*    */     //   111: lload_2
/*    */     //   112: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Ljava/util/UUID;
/*    */     //   117: lload #8
/*    */     //   119: ldc2_w 2834454888400808691
/*    */     //   122: lload_2
/*    */     //   123: <illegal opcode> b : (Lme/konsolas/aac/AAC;Ljava/util/UUID;JJJ)Lme/konsolas/aac/ef;
/*    */     //   128: ifnonnull -> 199
/*    */     //   131: goto -> 144
/*    */     //   134: ldc2_w 2795470020529951586
/*    */     //   137: lload_2
/*    */     //   138: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   143: athrow
/*    */     //   144: aload_0
/*    */     //   145: ldc2_w 2782213375322488058
/*    */     //   148: lload_2
/*    */     //   149: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   154: ldc2_w 2782897213084129290
/*    */     //   157: lload_2
/*    */     //   158: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/scheduler/BukkitScheduler;
/*    */     //   163: aload_0
/*    */     //   164: aload_0
/*    */     //   165: aload_1
/*    */     //   166: <illegal opcode> run : (Lme/konsolas/aac/AAC;Lorg/bukkit/event/player/PlayerJoinEvent;)Ljava/lang/Runnable;
/*    */     //   171: ldc2_w 2744782968310603072
/*    */     //   174: lload_2
/*    */     //   175: <illegal opcode> b : (Lorg/bukkit/scheduler/BukkitScheduler;Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;JJ)Lorg/bukkit/scheduler/BukkitTask;
/*    */     //   180: pop
/*    */     //   181: aload #10
/*    */     //   183: ifnonnull -> 274
/*    */     //   186: goto -> 199
/*    */     //   189: ldc2_w 2795470020529951586
/*    */     //   192: lload_2
/*    */     //   193: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   198: athrow
/*    */     //   199: aload_0
/*    */     //   200: aload_1
/*    */     //   201: ldc2_w 2790067051307962456
/*    */     //   204: lload_2
/*    */     //   205: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerJoinEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   210: goto -> 223
/*    */     //   213: ldc2_w 2795470020529951586
/*    */     //   216: lload_2
/*    */     //   217: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   222: athrow
/*    */     //   223: aload_0
/*    */     //   224: aload_1
/*    */     //   225: ldc2_w 2790067051307962456
/*    */     //   228: lload_2
/*    */     //   229: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerJoinEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   234: ldc2_w 2840690639603373129
/*    */     //   237: lload_2
/*    */     //   238: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Ljava/util/UUID;
/*    */     //   243: lload #8
/*    */     //   245: ldc2_w 2834454888400808691
/*    */     //   248: lload_2
/*    */     //   249: <illegal opcode> b : (Lme/konsolas/aac/AAC;Ljava/util/UUID;JJJ)Lme/konsolas/aac/ef;
/*    */     //   254: ldc2_w 2744557931119776732
/*    */     //   257: lload_2
/*    */     //   258: <illegal opcode> b : (Lme/konsolas/aac/ef;JJ)Z
/*    */     //   263: lload #4
/*    */     //   265: ldc2_w 2748662061587676295
/*    */     //   268: lload_2
/*    */     //   269: <illegal opcode> Ö : (Lme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;ZJJJ)V
/*    */     //   274: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 40
/*    */     //   #35	-> 69
/*    */     //   #31	-> 92
/*    */     //   #27	-> 144
/*    */     //   #46	-> 199
/*    */     //   #9	-> 274
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   69	131	134	java/lang/RuntimeException
/*    */     //   108	186	189	java/lang/RuntimeException
/*    */     //   144	210	213	java/lang/RuntimeException
/*    */   }
/*    */   public kP a(byte paramByte, int paramInt1, Player paramPlayer, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #56
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #8
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #40
/*    */     //   19: lshl
/*    */     //   20: bipush #40
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   27: lxor
/*    */     //   28: lstore #5
/*    */     //   30: aload_0
/*    */     //   31: getfield e : Ljava/util/Map;
/*    */     //   34: aload_3
/*    */     //   35: ldc2_w -4911356646389413646
/*    */     //   38: lload #5
/*    */     //   40: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Ljava/util/UUID;
/*    */     //   45: aload_0
/*    */     //   46: aload_3
/*    */     //   47: <illegal opcode> apply : (Lme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;)Ljava/util/function/Function;
/*    */     //   52: ldc2_w -5029802383889203795
/*    */     //   55: lload #5
/*    */     //   57: <illegal opcode> b : (Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;JJ)Ljava/lang/Object;
/*    */     //   62: checkcast me/konsolas/aac/kP
/*    */     //   65: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 30
/*    */   }
/* 30 */   private final Map e = new ConcurrentHashMap<>();
/*    */   public kk a() {
/* 32 */     return this.f;
/*    */   }
/*    */   @EventHandler(priority = EventPriority.MONITOR)
/*    */   public void a(AsyncPlayerPreLoginEvent paramAsyncPlayerPreLoginEvent) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   3: ldc2_w 121657229646778
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 16364523914693
/*    */     //   13: lxor
/*    */     //   14: lstore #4
/*    */     //   16: pop2
/*    */     //   17: aload_0
/*    */     //   18: aload_1
/*    */     //   19: ldc2_w 1460310067289167042
/*    */     //   22: lload_2
/*    */     //   23: <illegal opcode> b : (Lorg/bukkit/event/player/AsyncPlayerPreLoginEvent;JJ)Ljava/util/UUID;
/*    */     //   28: aload_1
/*    */     //   29: ldc2_w 1459494276789139043
/*    */     //   32: lload_2
/*    */     //   33: <illegal opcode> b : (Lorg/bukkit/event/player/AsyncPlayerPreLoginEvent;JJ)Ljava/net/InetAddress;
/*    */     //   38: lload #4
/*    */     //   40: ldc2_w 1527550970874219540
/*    */     //   43: lload_2
/*    */     //   44: <illegal opcode> b : (Lme/konsolas/aac/AAC;Ljava/util/UUID;Ljava/net/InetAddress;JJJ)V
/*    */     //   49: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 17
/*    */     //   #12	-> 49
/*    */   }
/*    */   
/* 39 */   private final Map m = new ConcurrentHashMap<>(); private BiFunction n;
/*    */   private AACAPI j;
/*    */   private kk f;
/*    */   private boolean d;
/*    */   private fv o;
/*    */   private iS h;
/*    */   private CheckTask k;
/*    */   private EntityTracker a;
/*    */   private TPSCounter c;
/*    */   private mi g;
/*    */   private jI b;
/*    */   
/*    */   public iS a() {
/* 52 */     return this.h;
/*    */   }
/*    */   
/*    */   public jI a() {
/* 56 */     return this.b;
/*    */   } public w a() {
/* 58 */     return this.l;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(Player paramPlayer, int paramInt, short paramShort1, short paramShort2) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   27: lxor
/*    */     //   28: lstore #5
/*    */     //   30: lload #5
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 120969885160012
/*    */     //   36: lxor
/*    */     //   37: lstore #7
/*    */     //   39: dup2
/*    */     //   40: ldc2_w 105703173461447
/*    */     //   43: lxor
/*    */     //   44: dup2
/*    */     //   45: bipush #48
/*    */     //   47: lushr
/*    */     //   48: l2i
/*    */     //   49: istore #9
/*    */     //   51: dup2
/*    */     //   52: bipush #16
/*    */     //   54: lshl
/*    */     //   55: bipush #48
/*    */     //   57: lushr
/*    */     //   58: l2i
/*    */     //   59: istore #10
/*    */     //   61: dup2
/*    */     //   62: bipush #32
/*    */     //   64: lshl
/*    */     //   65: bipush #32
/*    */     //   67: lushr
/*    */     //   68: l2i
/*    */     //   69: istore #11
/*    */     //   71: pop2
/*    */     //   72: dup2
/*    */     //   73: ldc2_w 23245327985574
/*    */     //   76: lxor
/*    */     //   77: lstore #12
/*    */     //   79: pop2
/*    */     //   80: aload_1
/*    */     //   81: ldc2_w -8444407281566303766
/*    */     //   84: lload #5
/*    */     //   86: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Ljava/util/UUID;
/*    */     //   91: astore #14
/*    */     //   93: aload_0
/*    */     //   94: getfield m : Ljava/util/Map;
/*    */     //   97: aload #14
/*    */     //   99: aload_0
/*    */     //   100: getfield m : Ljava/util/Map;
/*    */     //   103: aload #14
/*    */     //   105: ldc2_w -8405778257912732343
/*    */     //   108: lload #5
/*    */     //   110: <illegal opcode> b : (Ljava/util/Map;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*    */     //   115: checkcast me/konsolas/aac/ef
/*    */     //   118: lload #12
/*    */     //   120: ldc2_w -8401702548691705371
/*    */     //   123: lload #5
/*    */     //   125: <illegal opcode> b : (Lme/konsolas/aac/ef;JJJ)Lme/konsolas/aac/ef;
/*    */     //   130: ldc2_w -8434483482778172188
/*    */     //   133: lload #5
/*    */     //   135: <illegal opcode> b : (Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*    */     //   140: pop
/*    */     //   141: aload_0
/*    */     //   142: getfield m : Ljava/util/Map;
/*    */     //   145: aload #14
/*    */     //   147: ldc2_w -8405778257912732343
/*    */     //   150: lload #5
/*    */     //   152: <illegal opcode> b : (Ljava/util/Map;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*    */     //   157: checkcast me/konsolas/aac/ef
/*    */     //   160: ldc2_w -8379517053375955329
/*    */     //   163: lload #5
/*    */     //   165: <illegal opcode> b : (Lme/konsolas/aac/ef;JJ)Z
/*    */     //   170: istore #15
/*    */     //   172: aload_0
/*    */     //   173: getfield b : Lme/konsolas/aac/jI;
/*    */     //   176: iload #9
/*    */     //   178: i2s
/*    */     //   179: aload #14
/*    */     //   181: iload #10
/*    */     //   183: i2s
/*    */     //   184: iload #11
/*    */     //   186: iload #15
/*    */     //   188: ldc2_w -8382249635760250008
/*    */     //   191: lload #5
/*    */     //   193: <illegal opcode> b : (Lme/konsolas/aac/jI;SLjava/util/UUID;SIZJJ)V
/*    */     //   198: goto -> 236
/*    */     //   201: astore #16
/*    */     //   203: aload_0
/*    */     //   204: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*    */     //   207: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
/*    */     //   210: sipush #31934
/*    */     //   213: ldc2_w 3173876239905258368
/*    */     //   216: lload #5
/*    */     //   218: lxor
/*    */     //   219: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   224: aload #16
/*    */     //   226: ldc2_w -8394679424795030443
/*    */     //   229: lload #5
/*    */     //   231: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;JJ)V
/*    */     //   236: aload_0
/*    */     //   237: aload_1
/*    */     //   238: iload #15
/*    */     //   240: lload #7
/*    */     //   242: ldc2_w -8392901199156473564
/*    */     //   245: lload #5
/*    */     //   247: <illegal opcode> Ö : (Lme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;ZJJJ)V
/*    */     //   252: iload #15
/*    */     //   254: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #63	-> 80
/*    */     //   #66	-> 93
/*    */     //   #5	-> 141
/*    */     //   #91	-> 172
/*    */     //   #42	-> 198
/*    */     //   #20	-> 201
/*    */     //   #53	-> 203
/*    */     //   #54	-> 236
/*    */     //   #3	-> 252
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   172	198	201	java/sql/SQLException
/*    */   }
/*    */ 
/*    */   
/*    */   private void a(Player paramPlayer, boolean paramBoolean, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: ldc2_w 1664078905369967788
/*    */     //   9: lload_3
/*    */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   15: astore #5
/*    */     //   17: aload #5
/*    */     //   19: ifnull -> 69
/*    */     //   22: iload_2
/*    */     //   23: ifeq -> 80
/*    */     //   26: goto -> 39
/*    */     //   29: ldc2_w 1684616540368085705
/*    */     //   32: lload_3
/*    */     //   33: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   38: athrow
/*    */     //   39: aload_0
/*    */     //   40: getfield h : Lme/konsolas/aac/iS;
/*    */     //   43: aload_1
/*    */     //   44: getstatic me/konsolas/aac/iS.k : Lme/konsolas/aac/api/AACExemption;
/*    */     //   47: ldc2_w 1649222187387034796
/*    */     //   50: lload_3
/*    */     //   51: <illegal opcode> b : (Lme/konsolas/aac/iS;Lorg/bukkit/entity/Player;Lme/konsolas/aac/api/AACExemption;JJ)V
/*    */     //   56: goto -> 69
/*    */     //   59: ldc2_w 1684616540368085705
/*    */     //   62: lload_3
/*    */     //   63: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   68: athrow
/*    */     //   69: lload_3
/*    */     //   70: lconst_0
/*    */     //   71: lcmp
/*    */     //   72: ifle -> 97
/*    */     //   75: aload #5
/*    */     //   77: ifnonnull -> 110
/*    */     //   80: aload_0
/*    */     //   81: getfield h : Lme/konsolas/aac/iS;
/*    */     //   84: aload_1
/*    */     //   85: getstatic me/konsolas/aac/iS.k : Lme/konsolas/aac/api/AACExemption;
/*    */     //   88: ldc2_w 1682439647151683053
/*    */     //   91: lload_3
/*    */     //   92: <illegal opcode> b : (Lme/konsolas/aac/iS;Lorg/bukkit/entity/Player;Lme/konsolas/aac/api/AACExemption;JJ)V
/*    */     //   97: goto -> 110
/*    */     //   100: ldc2_w 1684616540368085705
/*    */     //   103: lload_3
/*    */     //   104: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   109: athrow
/*    */     //   110: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #67	-> 17
/*    */     //   #38	-> 80
/*    */     //   #85	-> 110
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	26	29	java/lang/RuntimeException
/*    */     //   22	56	59	java/lang/RuntimeException
/*    */     //   69	97	100	java/lang/RuntimeException
/*    */   }
/*    */ 
/*    */   
/*    */   public fv a() {
/* 74 */     return this.o;
/*    */   }
/*    */   
/*    */   public String a(Player paramPlayer, String paramString, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: aload_0
/*    */     //   7: getfield n : Ljava/util/function/BiFunction;
/*    */     //   10: aload_1
/*    */     //   11: aload_2
/*    */     //   12: ldc2_w 712793041364136304
/*    */     //   15: lload_3
/*    */     //   16: <illegal opcode> b : (Ljava/util/function/BiFunction;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*    */     //   21: checkcast java/lang/String
/*    */     //   24: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #75	-> 6
/*    */   }
/*    */   
/*    */   public void onEnable() {
/*    */     // Byte code:
/*    */     //   0: invokestatic loadConfig0 : ()V
/*    */     //   3: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   6: ldc2_w 80373439445161
/*    */     //   9: lxor
/*    */     //   10: lstore_1
/*    */     //   11: lload_1
/*    */     //   12: dup2
/*    */     //   13: ldc2_w 91928629498217
/*    */     //   16: lxor
/*    */     //   17: lstore_3
/*    */     //   18: dup2
/*    */     //   19: ldc2_w 37696372798118
/*    */     //   22: lxor
/*    */     //   23: dup2
/*    */     //   24: bipush #32
/*    */     //   26: lushr
/*    */     //   27: l2i
/*    */     //   28: istore #5
/*    */     //   30: dup2
/*    */     //   31: bipush #32
/*    */     //   33: lshl
/*    */     //   34: bipush #32
/*    */     //   36: lushr
/*    */     //   37: lstore #6
/*    */     //   39: pop2
/*    */     //   40: dup2
/*    */     //   41: ldc2_w 31396809027247
/*    */     //   44: lxor
/*    */     //   45: dup2
/*    */     //   46: bipush #32
/*    */     //   48: lushr
/*    */     //   49: l2i
/*    */     //   50: istore #8
/*    */     //   52: dup2
/*    */     //   53: bipush #32
/*    */     //   55: lshl
/*    */     //   56: bipush #48
/*    */     //   58: lushr
/*    */     //   59: l2i
/*    */     //   60: istore #9
/*    */     //   62: dup2
/*    */     //   63: bipush #48
/*    */     //   65: lshl
/*    */     //   66: bipush #48
/*    */     //   68: lushr
/*    */     //   69: l2i
/*    */     //   70: istore #10
/*    */     //   72: pop2
/*    */     //   73: dup2
/*    */     //   74: ldc2_w 136347385250200
/*    */     //   77: lxor
/*    */     //   78: dup2
/*    */     //   79: bipush #56
/*    */     //   81: lushr
/*    */     //   82: l2i
/*    */     //   83: istore #11
/*    */     //   85: dup2
/*    */     //   86: bipush #8
/*    */     //   88: lshl
/*    */     //   89: bipush #32
/*    */     //   91: lushr
/*    */     //   92: l2i
/*    */     //   93: istore #12
/*    */     //   95: dup2
/*    */     //   96: bipush #40
/*    */     //   98: lshl
/*    */     //   99: bipush #40
/*    */     //   101: lushr
/*    */     //   102: l2i
/*    */     //   103: istore #13
/*    */     //   105: pop2
/*    */     //   106: dup2
/*    */     //   107: ldc2_w 79633609233838
/*    */     //   110: lxor
/*    */     //   111: lstore #14
/*    */     //   113: dup2
/*    */     //   114: ldc2_w 73411056967887
/*    */     //   117: lxor
/*    */     //   118: lstore #16
/*    */     //   120: dup2
/*    */     //   121: ldc2_w 64610670642053
/*    */     //   124: lxor
/*    */     //   125: lstore #18
/*    */     //   127: dup2
/*    */     //   128: ldc2_w 128781983108693
/*    */     //   131: lxor
/*    */     //   132: lstore #20
/*    */     //   134: dup2
/*    */     //   135: ldc2_w 46400981704634
/*    */     //   138: lxor
/*    */     //   139: lstore #22
/*    */     //   141: dup2
/*    */     //   142: ldc2_w 94662106756394
/*    */     //   145: lxor
/*    */     //   146: lstore #24
/*    */     //   148: pop2
/*    */     //   149: aload_0
/*    */     //   150: ldc2_w -5326554293763533181
/*    */     //   153: lload_1
/*    */     //   154: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)V
/*    */     //   159: ldc2_w -5198888882656535454
/*    */     //   162: lload_1
/*    */     //   163: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   168: aload_0
/*    */     //   169: ldc2_w -5203369159556985357
/*    */     //   172: lload_1
/*    */     //   173: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)V
/*    */     //   178: astore #26
/*    */     //   180: aload_0
/*    */     //   181: aload #26
/*    */     //   183: ifnull -> 460
/*    */     //   186: ldc2_w -5192752241606406933
/*    */     //   189: lload_1
/*    */     //   190: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   195: sipush #836
/*    */     //   198: ldc2_w 4383355843893344428
/*    */     //   201: lload_1
/*    */     //   202: lxor
/*    */     //   203: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   208: ldc2_w -5224618288038058292
/*    */     //   211: lload_1
/*    */     //   212: <illegal opcode> b : (Lorg/bukkit/configuration/file/FileConfiguration;Ljava/lang/String;JJ)Z
/*    */     //   217: ifeq -> 459
/*    */     //   220: goto -> 233
/*    */     //   223: ldc2_w -5210984482254323193
/*    */     //   226: lload_1
/*    */     //   227: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   232: athrow
/*    */     //   233: aload_0
/*    */     //   234: ldc2_w -5192752241606406933
/*    */     //   237: lload_1
/*    */     //   238: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   243: sipush #21584
/*    */     //   246: ldc2_w 2168191518700662702
/*    */     //   249: lload_1
/*    */     //   250: lxor
/*    */     //   251: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   256: ldc2_w -5227023373572566851
/*    */     //   259: lload_1
/*    */     //   260: <illegal opcode> b : (Lorg/bukkit/configuration/file/FileConfiguration;Ljava/lang/String;JJ)Ljava/lang/String;
/*    */     //   265: astore #27
/*    */     //   267: aload_0
/*    */     //   268: ldc2_w -5192752241606406933
/*    */     //   271: lload_1
/*    */     //   272: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   277: sipush #30102
/*    */     //   280: ldc2_w 5159122515902352996
/*    */     //   283: lload_1
/*    */     //   284: lxor
/*    */     //   285: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   290: ldc2_w -5318703045708315642
/*    */     //   293: lload_1
/*    */     //   294: <illegal opcode> b : (Lorg/bukkit/configuration/file/FileConfiguration;Ljava/lang/String;JJ)I
/*    */     //   299: istore #28
/*    */     //   301: aload_0
/*    */     //   302: ldc2_w -5192752241606406933
/*    */     //   305: lload_1
/*    */     //   306: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   311: sipush #15345
/*    */     //   314: ldc2_w 2385261059311665163
/*    */     //   317: lload_1
/*    */     //   318: lxor
/*    */     //   319: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   324: ldc2_w -5227023373572566851
/*    */     //   327: lload_1
/*    */     //   328: <illegal opcode> b : (Lorg/bukkit/configuration/file/FileConfiguration;Ljava/lang/String;JJ)Ljava/lang/String;
/*    */     //   333: astore #29
/*    */     //   335: aload_0
/*    */     //   336: ldc2_w -5192752241606406933
/*    */     //   339: lload_1
/*    */     //   340: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   345: sipush #19378
/*    */     //   348: ldc2_w 4413100962284040277
/*    */     //   351: lload_1
/*    */     //   352: lxor
/*    */     //   353: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   358: ldc2_w -5227023373572566851
/*    */     //   361: lload_1
/*    */     //   362: <illegal opcode> b : (Lorg/bukkit/configuration/file/FileConfiguration;Ljava/lang/String;JJ)Ljava/lang/String;
/*    */     //   367: astore #30
/*    */     //   369: aload_0
/*    */     //   370: ldc2_w -5192752241606406933
/*    */     //   373: lload_1
/*    */     //   374: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   379: sipush #7932
/*    */     //   382: ldc2_w 8157915391110161672
/*    */     //   385: lload_1
/*    */     //   386: lxor
/*    */     //   387: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   392: ldc2_w -5227023373572566851
/*    */     //   395: lload_1
/*    */     //   396: <illegal opcode> b : (Lorg/bukkit/configuration/file/FileConfiguration;Ljava/lang/String;JJ)Ljava/lang/String;
/*    */     //   401: astore #31
/*    */     //   403: aload_0
/*    */     //   404: aload_0
/*    */     //   405: aload #27
/*    */     //   407: iload #28
/*    */     //   409: aload #29
/*    */     //   411: lload_3
/*    */     //   412: aload #30
/*    */     //   414: aload #31
/*    */     //   416: ldc2_w -5308916872593469352
/*    */     //   419: lload_1
/*    */     //   420: <illegal opcode> w : (Lme/konsolas/aac/AAC;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;JJ)Lme/konsolas/aac/jI;
/*    */     //   425: putfield b : Lme/konsolas/aac/jI;
/*    */     //   428: aload #26
/*    */     //   430: ifnonnull -> 512
/*    */     //   433: iconst_1
/*    */     //   434: anewarray me/konsolas/aac/aN
/*    */     //   437: ldc2_w -5207417140960792978
/*    */     //   440: lload_1
/*    */     //   441: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   446: goto -> 459
/*    */     //   449: ldc2_w -5210984482254323193
/*    */     //   452: lload_1
/*    */     //   453: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   458: athrow
/*    */     //   459: aload_0
/*    */     //   460: iload #8
/*    */     //   462: iload #9
/*    */     //   464: aload_0
/*    */     //   465: aload_0
/*    */     //   466: ldc2_w -5192752241606406933
/*    */     //   469: lload_1
/*    */     //   470: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   475: sipush #7917
/*    */     //   478: ldc2_w 3178149640962352396
/*    */     //   481: lload_1
/*    */     //   482: lxor
/*    */     //   483: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   488: ldc2_w -5227023373572566851
/*    */     //   491: lload_1
/*    */     //   492: <illegal opcode> b : (Lorg/bukkit/configuration/file/FileConfiguration;Ljava/lang/String;JJ)Ljava/lang/String;
/*    */     //   497: iload #10
/*    */     //   499: i2s
/*    */     //   500: ldc2_w -5220409125771443793
/*    */     //   503: lload_1
/*    */     //   504: <illegal opcode> w : (IILme/konsolas/aac/AAC;Ljava/lang/String;SJJ)Lme/konsolas/aac/jI;
/*    */     //   509: putfield b : Lme/konsolas/aac/jI;
/*    */     //   512: goto -> 527
/*    */     //   515: astore #27
/*    */     //   517: new java/lang/RuntimeException
/*    */     //   520: dup
/*    */     //   521: aload #27
/*    */     //   523: invokespecial <init> : (Ljava/lang/Throwable;)V
/*    */     //   526: athrow
/*    */     //   527: aload_0
/*    */     //   528: new me/konsolas/aac/timings/TPSCounter
/*    */     //   531: dup
/*    */     //   532: aload_0
/*    */     //   533: lload #14
/*    */     //   535: invokespecial <init> : (Lme/konsolas/aac/AAC;J)V
/*    */     //   538: putfield c : Lme/konsolas/aac/timings/TPSCounter;
/*    */     //   541: aload_0
/*    */     //   542: new me/konsolas/aac/timings/EntityTracker
/*    */     //   545: dup
/*    */     //   546: aload_0
/*    */     //   547: lload #22
/*    */     //   549: invokespecial <init> : (Lme/konsolas/aac/AAC;J)V
/*    */     //   552: putfield a : Lme/konsolas/aac/timings/EntityTracker;
/*    */     //   555: aload_0
/*    */     //   556: new me/konsolas/aac/timings/CheckTask
/*    */     //   559: dup
/*    */     //   560: aload_0
/*    */     //   561: invokespecial <init> : (Lme/konsolas/aac/AAC;)V
/*    */     //   564: putfield k : Lme/konsolas/aac/timings/CheckTask;
/*    */     //   567: aload_0
/*    */     //   568: new me/konsolas/aac/iS
/*    */     //   571: dup
/*    */     //   572: lload #16
/*    */     //   574: aload_0
/*    */     //   575: invokespecial <init> : (JLme/konsolas/aac/AAC;)V
/*    */     //   578: putfield h : Lme/konsolas/aac/iS;
/*    */     //   581: aload_0
/*    */     //   582: new me/konsolas/aac/fv
/*    */     //   585: dup
/*    */     //   586: iload #5
/*    */     //   588: aload_0
/*    */     //   589: lload #6
/*    */     //   591: invokespecial <init> : (ILme/konsolas/aac/AAC;J)V
/*    */     //   594: putfield o : Lme/konsolas/aac/fv;
/*    */     //   597: aload_0
/*    */     //   598: new me/konsolas/aac/mi
/*    */     //   601: dup
/*    */     //   602: lload #18
/*    */     //   604: aload_0
/*    */     //   605: invokespecial <init> : (JLme/konsolas/aac/AAC;)V
/*    */     //   608: putfield g : Lme/konsolas/aac/mi;
/*    */     //   611: aload_0
/*    */     //   612: sipush #1908
/*    */     //   615: ldc2_w 3593419386926972054
/*    */     //   618: lload_1
/*    */     //   619: lxor
/*    */     //   620: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   625: ldc2_w -5218784735083044601
/*    */     //   628: lload_1
/*    */     //   629: <illegal opcode> b : (Lme/konsolas/aac/AAC;Ljava/lang/String;JJ)Lorg/bukkit/command/PluginCommand;
/*    */     //   634: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   637: checkcast org/bukkit/command/PluginCommand
/*    */     //   640: aload_0
/*    */     //   641: getfield g : Lme/konsolas/aac/mi;
/*    */     //   644: ldc2_w -5226098763998774580
/*    */     //   647: lload_1
/*    */     //   648: <illegal opcode> b : (Lorg/bukkit/command/PluginCommand;Lorg/bukkit/command/CommandExecutor;JJ)V
/*    */     //   653: aload_0
/*    */     //   654: sipush #15946
/*    */     //   657: ldc2_w 6854297239005758906
/*    */     //   660: lload_1
/*    */     //   661: lxor
/*    */     //   662: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   667: ldc2_w -5218784735083044601
/*    */     //   670: lload_1
/*    */     //   671: <illegal opcode> b : (Lme/konsolas/aac/AAC;Ljava/lang/String;JJ)Lorg/bukkit/command/PluginCommand;
/*    */     //   676: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   679: checkcast org/bukkit/command/PluginCommand
/*    */     //   682: aload_0
/*    */     //   683: getfield g : Lme/konsolas/aac/mi;
/*    */     //   686: ldc2_w -5205888102809142859
/*    */     //   689: lload_1
/*    */     //   690: <illegal opcode> b : (Lorg/bukkit/command/PluginCommand;Lorg/bukkit/command/TabCompleter;JJ)V
/*    */     //   695: aload_0
/*    */     //   696: new me/konsolas/aac/kk
/*    */     //   699: dup
/*    */     //   700: lload #20
/*    */     //   702: aload_0
/*    */     //   703: invokespecial <init> : (JLme/konsolas/aac/AAC;)V
/*    */     //   706: putfield f : Lme/konsolas/aac/kk;
/*    */     //   709: aload_0
/*    */     //   710: ldc2_w -5190059619615609441
/*    */     //   713: lload_1
/*    */     //   714: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   719: invokeinterface getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
/*    */     //   724: aload_0
/*    */     //   725: aload_0
/*    */     //   726: ldc2_w -5221369670908741669
/*    */     //   729: lload_1
/*    */     //   730: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;JJ)V
/*    */     //   735: aload_0
/*    */     //   736: ldc2_w -5190059619615609441
/*    */     //   739: lload_1
/*    */     //   740: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   745: ldc2_w -5189526419353097590
/*    */     //   748: lload_1
/*    */     //   749: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Ljava/util/Collection;
/*    */     //   754: ldc2_w -5331169611827783639
/*    */     //   757: lload_1
/*    */     //   758: <illegal opcode> b : (Ljava/util/Collection;JJ)Z
/*    */     //   763: aload #26
/*    */     //   765: ifnull -> 1101
/*    */     //   768: ifne -> 1043
/*    */     //   771: goto -> 784
/*    */     //   774: ldc2_w -5210984482254323193
/*    */     //   777: lload_1
/*    */     //   778: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   783: athrow
/*    */     //   784: aload_0
/*    */     //   785: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*    */     //   788: sipush #10422
/*    */     //   791: ldc2_w 5852638593097208641
/*    */     //   794: lload_1
/*    */     //   795: lxor
/*    */     //   796: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   801: invokevirtual warning : (Ljava/lang/String;)V
/*    */     //   804: aload_0
/*    */     //   805: ldc2_w -5190059619615609441
/*    */     //   808: lload_1
/*    */     //   809: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   814: ldc2_w -5189526419353097590
/*    */     //   817: lload_1
/*    */     //   818: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Ljava/util/Collection;
/*    */     //   823: ldc2_w -5231958377786610103
/*    */     //   826: lload_1
/*    */     //   827: <illegal opcode> b : (Ljava/util/Collection;JJ)Ljava/util/Iterator;
/*    */     //   832: astore #27
/*    */     //   834: aload #27
/*    */     //   836: ldc2_w -5329108244870260681
/*    */     //   839: lload_1
/*    */     //   840: <illegal opcode> b : (Ljava/util/Iterator;JJ)Z
/*    */     //   845: ifeq -> 957
/*    */     //   848: aload #27
/*    */     //   850: ldc2_w -5194600776047055810
/*    */     //   853: lload_1
/*    */     //   854: <illegal opcode> b : (Ljava/util/Iterator;JJ)Ljava/lang/Object;
/*    */     //   859: checkcast org/bukkit/entity/Player
/*    */     //   862: astore #28
/*    */     //   864: aload_0
/*    */     //   865: ldc2_w -5190059619615609441
/*    */     //   868: lload_1
/*    */     //   869: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   874: ldc2_w -5189402062893069969
/*    */     //   877: lload_1
/*    */     //   878: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/scheduler/BukkitScheduler;
/*    */     //   883: aload_0
/*    */     //   884: aload_0
/*    */     //   885: aload #28
/*    */     //   887: <illegal opcode> run : (Lme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;)Ljava/lang/Runnable;
/*    */     //   892: ldc2_w -5228061766106510299
/*    */     //   895: lload_1
/*    */     //   896: <illegal opcode> b : (Lorg/bukkit/scheduler/BukkitScheduler;Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;JJ)Lorg/bukkit/scheduler/BukkitTask;
/*    */     //   901: pop
/*    */     //   902: aload_0
/*    */     //   903: getfield h : Lme/konsolas/aac/iS;
/*    */     //   906: lload #24
/*    */     //   908: aload #28
/*    */     //   910: ldc2_w -5211042815772375876
/*    */     //   913: lload_1
/*    */     //   914: <illegal opcode> b : (Lme/konsolas/aac/iS;JLorg/bukkit/entity/Player;JJ)V
/*    */     //   919: aload_0
/*    */     //   920: getfield o : Lme/konsolas/aac/fv;
/*    */     //   923: aload #28
/*    */     //   925: ldc2_w -5321765265222139430
/*    */     //   928: lload_1
/*    */     //   929: <illegal opcode> b : (Lme/konsolas/aac/fv;Lorg/bukkit/entity/Player;JJ)V
/*    */     //   934: aload #26
/*    */     //   936: ifnull -> 1079
/*    */     //   939: aload #26
/*    */     //   941: ifnonnull -> 834
/*    */     //   944: goto -> 957
/*    */     //   947: ldc2_w -5210984482254323193
/*    */     //   950: lload_1
/*    */     //   951: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   956: athrow
/*    */     //   957: aload_0
/*    */     //   958: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*    */     //   961: new java/lang/StringBuilder
/*    */     //   964: dup
/*    */     //   965: invokespecial <init> : ()V
/*    */     //   968: sipush #8027
/*    */     //   971: ldc2_w 2016187077293974712
/*    */     //   974: lload_1
/*    */     //   975: lxor
/*    */     //   976: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   981: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   984: aload_0
/*    */     //   985: ldc2_w -5190059619615609441
/*    */     //   988: lload_1
/*    */     //   989: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   994: ldc2_w -5189526419353097590
/*    */     //   997: lload_1
/*    */     //   998: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Ljava/util/Collection;
/*    */     //   1003: ldc2_w -5190357715847145581
/*    */     //   1006: lload_1
/*    */     //   1007: <illegal opcode> b : (Ljava/util/Collection;JJ)I
/*    */     //   1012: ldc2_w -5219005168894208629
/*    */     //   1015: lload_1
/*    */     //   1016: <illegal opcode> b : (Ljava/lang/StringBuilder;IJJ)Ljava/lang/StringBuilder;
/*    */     //   1021: sipush #8010
/*    */     //   1024: ldc2_w 5314753935428723897
/*    */     //   1027: lload_1
/*    */     //   1028: lxor
/*    */     //   1029: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   1034: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1037: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1040: invokevirtual warning : (Ljava/lang/String;)V
/*    */     //   1043: aload_0
/*    */     //   1044: aload_0
/*    */     //   1045: ldc2_w -5192752241606406933
/*    */     //   1048: lload_1
/*    */     //   1049: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   1054: sipush #24275
/*    */     //   1057: ldc2_w 6931656512701752623
/*    */     //   1060: lload_1
/*    */     //   1061: lxor
/*    */     //   1062: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   1067: ldc2_w -5224618288038058292
/*    */     //   1070: lload_1
/*    */     //   1071: <illegal opcode> b : (Lorg/bukkit/configuration/file/FileConfiguration;Ljava/lang/String;JJ)Z
/*    */     //   1076: putfield d : Z
/*    */     //   1079: aload_0
/*    */     //   1080: aload #26
/*    */     //   1082: ifnull -> 1320
/*    */     //   1085: getfield d : Z
/*    */     //   1088: goto -> 1101
/*    */     //   1091: ldc2_w -5210984482254323193
/*    */     //   1094: lload_1
/*    */     //   1095: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   1100: athrow
/*    */     //   1101: ifeq -> 1226
/*    */     //   1104: aload_0
/*    */     //   1105: ldc2_w -5190059619615609441
/*    */     //   1108: lload_1
/*    */     //   1109: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   1114: ldc2_w -5320176450077026722
/*    */     //   1117: lload_1
/*    */     //   1118: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/messaging/Messenger;
/*    */     //   1123: aload_0
/*    */     //   1124: sipush #2580
/*    */     //   1127: ldc2_w 262140265356112367
/*    */     //   1130: lload_1
/*    */     //   1131: lxor
/*    */     //   1132: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   1137: ldc2_w -5330267322096410308
/*    */     //   1140: lload_1
/*    */     //   1141: <illegal opcode> b : (Lorg/bukkit/plugin/messaging/Messenger;Lorg/bukkit/plugin/Plugin;Ljava/lang/String;JJ)V
/*    */     //   1146: aload_0
/*    */     //   1147: ldc2_w -5190059619615609441
/*    */     //   1150: lload_1
/*    */     //   1151: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   1156: ldc2_w -5320176450077026722
/*    */     //   1159: lload_1
/*    */     //   1160: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/messaging/Messenger;
/*    */     //   1165: aload_0
/*    */     //   1166: sipush #30122
/*    */     //   1169: ldc2_w 6328194282247605855
/*    */     //   1172: lload_1
/*    */     //   1173: lxor
/*    */     //   1174: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   1179: aload_0
/*    */     //   1180: getfield o : Lme/konsolas/aac/fv;
/*    */     //   1183: ldc2_w -5306899176691604391
/*    */     //   1186: lload_1
/*    */     //   1187: <illegal opcode> b : (Lorg/bukkit/plugin/messaging/Messenger;Lorg/bukkit/plugin/Plugin;Ljava/lang/String;Lorg/bukkit/plugin/messaging/PluginMessageListener;JJ)Lorg/bukkit/plugin/messaging/PluginMessageListenerRegistration;
/*    */     //   1192: pop
/*    */     //   1193: aload_0
/*    */     //   1194: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*    */     //   1197: sipush #7458
/*    */     //   1200: ldc2_w 2690041712980764381
/*    */     //   1203: lload_1
/*    */     //   1204: lxor
/*    */     //   1205: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   1210: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   1213: goto -> 1226
/*    */     //   1216: ldc2_w -5210984482254323193
/*    */     //   1219: lload_1
/*    */     //   1220: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   1225: athrow
/*    */     //   1226: aload_0
/*    */     //   1227: new me/konsolas/aac/dj
/*    */     //   1230: dup
/*    */     //   1231: aload_0
/*    */     //   1232: invokespecial <init> : (Lme/konsolas/aac/AAC;)V
/*    */     //   1235: putfield j : Lme/konsolas/aac/api/AACAPI;
/*    */     //   1238: aload_0
/*    */     //   1239: aload #26
/*    */     //   1241: ifnull -> 1384
/*    */     //   1244: ldc2_w -5190059619615609441
/*    */     //   1247: lload_1
/*    */     //   1248: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lorg/bukkit/Server;
/*    */     //   1253: ldc2_w -5188965179343976826
/*    */     //   1256: lload_1
/*    */     //   1257: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/ServicesManager;
/*    */     //   1262: ldc_w me/konsolas/aac/api/AACAPI
/*    */     //   1265: aload_0
/*    */     //   1266: getfield j : Lme/konsolas/aac/api/AACAPI;
/*    */     //   1269: aload_0
/*    */     //   1270: getstatic org/bukkit/plugin/ServicePriority.Normal : Lorg/bukkit/plugin/ServicePriority;
/*    */     //   1273: ldc2_w -5197569025108125228
/*    */     //   1276: lload_1
/*    */     //   1277: <illegal opcode> b : (Lorg/bukkit/plugin/ServicesManager;Ljava/lang/Class;Ljava/lang/Object;Lorg/bukkit/plugin/Plugin;Lorg/bukkit/plugin/ServicePriority;JJ)V
/*    */     //   1282: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
/*    */     //   1285: sipush #15103
/*    */     //   1288: ldc2_w 178211448298471702
/*    */     //   1291: lload_1
/*    */     //   1292: lxor
/*    */     //   1293: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   1298: ldc2_w -5314919355600172316
/*    */     //   1301: lload_1
/*    */     //   1302: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Ljava/lang/String;JJ)Lorg/bukkit/plugin/Plugin;
/*    */     //   1307: goto -> 1320
/*    */     //   1310: ldc2_w -5210984482254323193
/*    */     //   1313: lload_1
/*    */     //   1314: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   1319: athrow
/*    */     //   1320: ifnull -> 1370
/*    */     //   1323: aload_0
/*    */     //   1324: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*    */     //   1327: sipush #24459
/*    */     //   1330: ldc2_w 53855997176603766
/*    */     //   1333: lload_1
/*    */     //   1334: lxor
/*    */     //   1335: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   1340: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   1343: aload_0
/*    */     //   1344: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
/*    */     //   1349: putfield n : Ljava/util/function/BiFunction;
/*    */     //   1352: aload #26
/*    */     //   1354: ifnonnull -> 1392
/*    */     //   1357: goto -> 1370
/*    */     //   1360: ldc2_w -5210984482254323193
/*    */     //   1363: lload_1
/*    */     //   1364: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   1369: athrow
/*    */     //   1370: aload_0
/*    */     //   1371: goto -> 1384
/*    */     //   1374: ldc2_w -5210984482254323193
/*    */     //   1377: lload_1
/*    */     //   1378: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   1383: athrow
/*    */     //   1384: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
/*    */     //   1389: putfield n : Ljava/util/function/BiFunction;
/*    */     //   1392: aload_0
/*    */     //   1393: new me/konsolas/aac/w
/*    */     //   1396: dup
/*    */     //   1397: iload #11
/*    */     //   1399: i2b
/*    */     //   1400: iload #12
/*    */     //   1402: iload #13
/*    */     //   1404: aload_0
/*    */     //   1405: invokespecial <init> : (BIILme/konsolas/aac/AAC;)V
/*    */     //   1408: putfield l : Lme/konsolas/aac/w;
/*    */     //   1411: new me/konsolas/aac/MetricsLite
/*    */     //   1414: dup
/*    */     //   1415: aload_0
/*    */     //   1416: sipush #2267
/*    */     //   1419: invokespecial <init> : (Lorg/bukkit/plugin/Plugin;I)V
/*    */     //   1422: pop
/*    */     //   1423: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #77	-> 149
/*    */     //   #15	-> 168
/*    */     //   #79	-> 180
/*    */     //   #8	-> 233
/*    */     //   #16	-> 267
/*    */     //   #51	-> 301
/*    */     //   #55	-> 335
/*    */     //   #65	-> 369
/*    */     //   #45	-> 403
/*    */     //   #21	-> 428
/*    */     //   #83	-> 459
/*    */     //   #78	-> 512
/*    */     //   #48	-> 515
/*    */     //   #64	-> 517
/*    */     //   #11	-> 527
/*    */     //   #71	-> 541
/*    */     //   #95	-> 555
/*    */     //   #102	-> 567
/*    */     //   #73	-> 581
/*    */     //   #81	-> 597
/*    */     //   #41	-> 611
/*    */     //   #59	-> 653
/*    */     //   #18	-> 695
/*    */     //   #47	-> 709
/*    */     //   #50	-> 735
/*    */     //   #62	-> 784
/*    */     //   #80	-> 804
/*    */     //   #33	-> 864
/*    */     //   #23	-> 902
/*    */     //   #26	-> 919
/*    */     //   #57	-> 934
/*    */     //   #89	-> 957
/*    */     //   #43	-> 1043
/*    */     //   #86	-> 1079
/*    */     //   #13	-> 1104
/*    */     //   #1	-> 1146
/*    */     //   #97	-> 1193
/*    */     //   #49	-> 1226
/*    */     //   #60	-> 1238
/*    */     //   #6	-> 1282
/*    */     //   #28	-> 1323
/*    */     //   #2	-> 1343
/*    */     //   #92	-> 1370
/*    */     //   #14	-> 1392
/*    */     //   #90	-> 1411
/*    */     //   #4	-> 1423
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   180	220	223	java/sql/SQLException
/*    */     //   180	512	515	java/sql/SQLException
/*    */     //   403	446	449	java/sql/SQLException
/*    */     //   527	771	774	java/sql/SQLException
/*    */     //   864	944	947	java/sql/SQLException
/*    */     //   1079	1088	1091	java/sql/SQLException
/*    */     //   1101	1213	1216	java/sql/SQLException
/*    */     //   1226	1307	1310	java/sql/SQLException
/*    */     //   1320	1357	1360	java/sql/SQLException
/*    */     //   1323	1371	1374	java/sql/SQLException
/*    */   }
/*    */   
/*    */   public EntityTracker a()
/*    */   {
/* 87 */     return this.a; } public TPSCounter a() {
/* 88 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 93 */     return this.d;
/*    */   }
/*    */   
/*    */   @EventHandler(priority = EventPriority.MONITOR)
/*    */   public void a(PlayerQuitEvent paramPlayerQuitEvent) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   3: ldc2_w 54911301386579
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 66473386942816
/*    */     //   13: lxor
/*    */     //   14: lstore #4
/*    */     //   16: pop2
/*    */     //   17: aload_0
/*    */     //   18: getfield h : Lme/konsolas/aac/iS;
/*    */     //   21: aload_1
/*    */     //   22: ldc2_w 1039283841457110339
/*    */     //   25: lload_2
/*    */     //   26: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerQuitEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   31: ldc2_w 1039930120117464148
/*    */     //   34: lload_2
/*    */     //   35: <illegal opcode> b : (Lme/konsolas/aac/iS;Lorg/bukkit/entity/Player;JJ)V
/*    */     //   40: aload_0
/*    */     //   41: getfield o : Lme/konsolas/aac/fv;
/*    */     //   44: aload_1
/*    */     //   45: ldc2_w 1039283841457110339
/*    */     //   48: lload_2
/*    */     //   49: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerQuitEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   54: lload #4
/*    */     //   56: dup2_x1
/*    */     //   57: pop2
/*    */     //   58: ldc2_w 1011818435034469096
/*    */     //   61: lload_2
/*    */     //   62: <illegal opcode> b : (Lme/konsolas/aac/fv;JLorg/bukkit/entity/Player;JJ)V
/*    */     //   67: aload_0
/*    */     //   68: getfield m : Ljava/util/Map;
/*    */     //   71: aload_1
/*    */     //   72: ldc2_w 1039283841457110339
/*    */     //   75: lload_2
/*    */     //   76: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerQuitEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   81: ldc2_w 1149277631676169430
/*    */     //   84: lload_2
/*    */     //   85: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Ljava/util/UUID;
/*    */     //   90: ldc2_w 1141164628434379752
/*    */     //   93: lload_2
/*    */     //   94: <illegal opcode> b : (Ljava/util/Map;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*    */     //   99: pop
/*    */     //   100: aload_0
/*    */     //   101: getfield e : Ljava/util/Map;
/*    */     //   104: aload_1
/*    */     //   105: ldc2_w 1039283841457110339
/*    */     //   108: lload_2
/*    */     //   109: <illegal opcode> b : (Lorg/bukkit/event/player/PlayerQuitEvent;JJ)Lorg/bukkit/entity/Player;
/*    */     //   114: ldc2_w 1149277631676169430
/*    */     //   117: lload_2
/*    */     //   118: <illegal opcode> b : (Lorg/bukkit/entity/Player;JJ)Ljava/util/UUID;
/*    */     //   123: ldc2_w 1141164628434379752
/*    */     //   126: lload_2
/*    */     //   127: <illegal opcode> b : (Ljava/util/Map;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*    */     //   132: pop
/*    */     //   133: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #94	-> 17
/*    */     //   #100	-> 40
/*    */     //   #68	-> 67
/*    */     //   #40	-> 100
/*    */     //   #72	-> 133
/*    */   }
/*    */   
/*    */   public ef a(UUID paramUUID, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: aload_0
/*    */     //   7: getfield m : Ljava/util/Map;
/*    */     //   10: aload_1
/*    */     //   11: ldc2_w -293057434101443073
/*    */     //   14: lload_2
/*    */     //   15: <illegal opcode> b : (Ljava/util/Map;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*    */     //   20: checkcast me/konsolas/aac/ef
/*    */     //   23: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #96	-> 6
/*    */   }
/*    */   
/*    */   public void a(UUID paramUUID, InetAddress paramInetAddress, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: lload_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 110924013762270
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: aload_0
/*    */     //   16: getfield m : Ljava/util/Map;
/*    */     //   19: aload_1
/*    */     //   20: aload_0
/*    */     //   21: getfield b : Lme/konsolas/aac/jI;
/*    */     //   24: aload_1
/*    */     //   25: aload_2
/*    */     //   26: lload #5
/*    */     //   28: ldc2_w -6962192487998153510
/*    */     //   31: lload_3
/*    */     //   32: <illegal opcode> b : (Lme/konsolas/aac/jI;Ljava/util/UUID;Ljava/net/InetAddress;JJJ)Lme/konsolas/aac/ef;
/*    */     //   37: ldc2_w -7014674969095204688
/*    */     //   40: lload_3
/*    */     //   41: <illegal opcode> b : (Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*    */     //   46: pop
/*    */     //   47: goto -> 106
/*    */     //   50: astore #7
/*    */     //   52: aload_0
/*    */     //   53: invokevirtual getLogger : ()Ljava/util/logging/Logger;
/*    */     //   56: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: sipush #21969
/*    */     //   69: ldc2_w 5911578652104148658
/*    */     //   72: lload_3
/*    */     //   73: lxor
/*    */     //   74: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   82: aload_1
/*    */     //   83: ldc2_w -6920097280382208960
/*    */     //   86: lload_3
/*    */     //   87: <illegal opcode> b : (Ljava/lang/StringBuilder;Ljava/lang/Object;JJ)Ljava/lang/StringBuilder;
/*    */     //   92: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   95: aload #7
/*    */     //   97: ldc2_w -6929786140659165183
/*    */     //   100: lload_3
/*    */     //   101: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;JJ)V
/*    */     //   106: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #99	-> 15
/*    */     //   #98	-> 47
/*    */     //   #37	-> 50
/*    */     //   #84	-> 52
/*    */     //   #25	-> 106
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	47	50	java/sql/SQLException
/*    */   }
/*    */   
/*    */   public static void b(String[] paramArrayOfString) {
/*    */     i = paramArrayOfString;
/*    */   }
/*    */   
/*    */   public static String[] b() {
/*    */     return i;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w 6766898033251676346
/*    */     //   3: ldc2_w 2521870594764212218
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 193397107278626
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic me/konsolas/aac/AAC.p : J
/*    */     //   26: getstatic me/konsolas/aac/AAC.p : J
/*    */     //   29: ldc2_w 29301676083995
/*    */     //   32: lxor
/*    */     //   33: lstore #9
/*    */     //   35: iconst_3
/*    */     //   36: anewarray java/lang/String
/*    */     //   39: new java/util/HashMap
/*    */     //   42: dup
/*    */     //   43: bipush #13
/*    */     //   45: invokespecial <init> : (I)V
/*    */     //   48: putstatic me/konsolas/aac/AAC.s : Ljava/util/Map;
/*    */     //   51: ldc2_w -8917967411586893831
/*    */     //   54: lload #9
/*    */     //   56: <illegal opcode> w : ([Ljava/lang/String;JJ)V
/*    */     //   61: ldc_w '窏劌?婡줳댼榄ۻ볣鷃ꠤ㾔䁔㚸烃뭞쳞ા乊'
/*    */     //   64: invokevirtual toCharArray : ()[C
/*    */     //   67: dup
/*    */     //   68: dup
/*    */     //   69: iconst_4
/*    */     //   70: dup_x1
/*    */     //   71: caload
/*    */     //   72: sipush #4343
/*    */     //   75: ixor
/*    */     //   76: i2c
/*    */     //   77: castore
/*    */     //   78: sipush #2436
/*    */     //   81: iconst_1
/*    */     //   82: iconst_2
/*    */     //   83: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   86: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*    */     //   89: dup
/*    */     //   90: astore_0
/*    */     //   91: iconst_2
/*    */     //   92: ldc_w 'ᮕ蛭瓅Ԓ'
/*    */     //   95: invokevirtual toCharArray : ()[C
/*    */     //   98: dup
/*    */     //   99: dup
/*    */     //   100: iconst_2
/*    */     //   101: dup_x1
/*    */     //   102: caload
/*    */     //   103: sipush #17691
/*    */     //   106: ixor
/*    */     //   107: i2c
/*    */     //   108: castore
/*    */     //   109: sipush #13201
/*    */     //   112: iconst_1
/*    */     //   113: iconst_0
/*    */     //   114: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   117: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*    */     //   120: bipush #8
/*    */     //   122: newarray byte
/*    */     //   124: dup
/*    */     //   125: iconst_0
/*    */     //   126: lload #9
/*    */     //   128: bipush #56
/*    */     //   130: lushr
/*    */     //   131: l2i
/*    */     //   132: i2b
/*    */     //   133: bastore
/*    */     //   134: iconst_1
/*    */     //   135: istore_1
/*    */     //   136: iload_1
/*    */     //   137: bipush #8
/*    */     //   139: if_icmpge -> 163
/*    */     //   142: dup
/*    */     //   143: iload_1
/*    */     //   144: lload #9
/*    */     //   146: iload_1
/*    */     //   147: bipush #8
/*    */     //   149: imul
/*    */     //   150: lshl
/*    */     //   151: bipush #56
/*    */     //   153: lushr
/*    */     //   154: l2i
/*    */     //   155: i2b
/*    */     //   156: bastore
/*    */     //   157: iinc #1, 1
/*    */     //   160: goto -> 136
/*    */     //   163: new javax/crypto/spec/DESKeySpec
/*    */     //   166: dup_x1
/*    */     //   167: swap
/*    */     //   168: invokespecial <init> : ([B)V
/*    */     //   171: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*    */     //   174: new javax/crypto/spec/IvParameterSpec
/*    */     //   177: dup
/*    */     //   178: bipush #8
/*    */     //   180: newarray byte
/*    */     //   182: invokespecial <init> : ([B)V
/*    */     //   185: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*    */     //   188: bipush #26
/*    */     //   190: anewarray java/lang/String
/*    */     //   193: astore #7
/*    */     //   195: iconst_0
/*    */     //   196: istore #5
/*    */     //   198: ldc_w '覜᭑⭭ꕐ邰ႏ뤿ⲭꄡ⻑≝끁ࡒ椿쮆놤㫦❣뀚Ỏࠠ渳ҋⲽ嶶鞪ጧ꟠䡧伴⡲챔谤킪鴧槾嘙诊᪹缂ﮇ狯⭫荳톜銆䠯쯥븠ב芈䃀ᵫ?㲢녝㕦┈苦鋿ꯜ꣙쯄ၧ枧롰判㽐腑層忉㎃ሯやɧ쳈ᅷ㐞ब슣ᅇ⸴ꓴ둕腆ㆅ疱첝㗯팥꩔먾焌ꖒ俑똺웾兏띔㵀ဢ?䔤鰎◺擡훫㖽͟훗禊॥鐢塪ꨠ斨䩳黆紼䒵鶏耦ꋓ䅀鱇钎ﲉ鍗쎼?츍௣鋤ꑥ矆ꋼ쐟蛸初⑏髢ප艨㎟仍ザ뻥縌☉鄞띜끺ਙꗉ蜑吔畂̢筓ᤘ鬁彅系듁⋠⹔␻콍䉙ᆆ᫝嵓咺⢛췉撙폟坜㈗ˢ堚誗䇅칸紙鎹䯠쿅獰≂㙲㝥㟾읅쀽̴㩔犋澡䳯ᷕ⌠Ð已嗼漺࿙▝ṻ曈ؽ艟ꯟ汯馴舘魦狒ૢ櫦쟝谄皰묷ᕂ壽ਊꪶ睊⓪섃ꆈ㊯䣍즐Ⱉ汥炥㺖ဉ䦢쒹삢ઇᦖ녓ꒅꝚ㸫䦐Ǭ憫팢ᾫ䶖Ѩ꿆⾽龡ᶣ╵퐏擢鼜豄즣偠柄纰酈䯭듗霹熂?溣鹊嫒穑罛㵊嶫턓꧝땠𶠌桠痭ﴐㆆ࿦㍗瘳ᦒ⟳焪䚺銭䇾Ɖ䫮펾㭿∆?近뢒鉄슆計坴⸔轮㛎ȳ짫᪆龇⳪⩼禲ҝㅥ娲쨉ꁽ⩔颗ꧺγ瞤燙ꁊ제镌푔䛻搦鈓뾑嘡빺薜셩堪樵몌紎ნ㍝䅘ᒟ䢛⮴ꇯ穰͚蝬釲딢岶⩏㳯⵮ﹼ繫⿢䶑췯渚?­撩鋝漠?Ρ༊挶돲໅杷뜻덊迵뇰鬰먭ߏ报䞄܉ᒣἘ똗퓙絘萣拪吜磒┡靖퀢ꉟ䍤苦鹌柷䯉衳板?ꂫ㢖㜜癅ઓ떗慯?㾝㈟?꫏ꊱ巶颱퇙孹똗瑮盝襥솖匌줜㏤掉Ӄ㍌㞼큽⦇㯊㇜敔觥乡삡貪槯鍇໯ー즤τꖔ顮ơ核픫ᐋ惬酕⧛鑸꿷䋞끠෬ฅ꣗ꇹ?꣍⌎玩㟥䞁↪̈⤸좖ꡱ夗噷딉猪婃뢭趣怄噦퐐縁Ρ礐瞝ḉ㮮㻬ڜẚ⋦逩芤၊韺濌꧔慝?䐳䓱厬籙ᔣ喥ࢽ咚Դ⹊燀浦犔寺潐鮀䍲唕舄禅ﳫ隅넢码圌❟⑍?嚃ఞ悂꧶須δ榢?关裨?윺槁℻봪똿眎弼?便ක쨩ꃋ朩归骻ꨄ䵍ⳇ鱵㰁ೌ鯷랫Ⳉᒁ䚑ᅏ퓥Ꝡῧ鈅瞜꺐붘੡퍸䈻까瘜Є䉺㬠晴ʬ㩥᎟}犋᤬๑毝橅퍕?쇧棠甜륃啰吺襶찣〰㾈뭟륭征誇⳺塩㹉璦뤅박㏄꫞㳍绣ꔬꚵ᭛쯁묃謅鶫畼⒴퉫ﬆ﻿ࣘ⒓堝襉滫韗꣩ఒꏴ蠩䚶﬿斄鵥⥥旚缦쇇僚ꢷ가Ꙝ궷↳迏㞆ﳢऎ鰒鮡磰핤㊇䝁靬㩓঎１铿╢ᢆ裺폹㨐눣俱뉂浆쪴そ綅咼링鶿넎⚚骮㋠苟⠬≋?⛩됂럮ㅕ땞㴪ࠠ㘉촃ⵞ艇Ｓ猢쭢跱펇壪±퐸涿榏뫵㿭咞᝱ছ揱툜ꁢ餓暯迠탘韆表승▜쫍儏?嬸鈫俑츕햴째麍양덥妜鐩鬲孕큝쩨東䋢遲㋠ꯛ㑃럥䕟狨庾₯﮻渗쨋䩒⅃陰嘌瀽蔺ⱐ썹푔⫐㷑⥙⊘ף馠㲮ﰣ㸶早䕟ᆍ互ᱮ꾗梅邍੆뻪₨㡧붂孯'
/*    */     //   201: invokevirtual toCharArray : ()[C
/*    */     //   204: dup
/*    */     //   205: dup
/*    */     //   206: sipush #312
/*    */     //   209: dup_x1
/*    */     //   210: caload
/*    */     //   211: sipush #7641
/*    */     //   214: ixor
/*    */     //   215: i2c
/*    */     //   216: castore
/*    */     //   217: sipush #32766
/*    */     //   220: iconst_0
/*    */     //   221: iconst_2
/*    */     //   222: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   225: dup
/*    */     //   226: astore #4
/*    */     //   228: invokevirtual length : ()I
/*    */     //   231: istore #6
/*    */     //   233: bipush #24
/*    */     //   235: istore_3
/*    */     //   236: iconst_m1
/*    */     //   237: istore_2
/*    */     //   238: iinc #2, 1
/*    */     //   241: aload #4
/*    */     //   243: iload_2
/*    */     //   244: dup
/*    */     //   245: iload_3
/*    */     //   246: iadd
/*    */     //   247: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   250: iconst_m1
/*    */     //   251: goto -> 384
/*    */     //   254: aload #7
/*    */     //   256: swap
/*    */     //   257: iload #5
/*    */     //   259: iinc #5, 1
/*    */     //   262: swap
/*    */     //   263: aastore
/*    */     //   264: iload_2
/*    */     //   265: iload_3
/*    */     //   266: iadd
/*    */     //   267: dup
/*    */     //   268: istore_2
/*    */     //   269: iload #6
/*    */     //   271: if_icmpge -> 284
/*    */     //   274: aload #4
/*    */     //   276: iload_2
/*    */     //   277: invokevirtual charAt : (I)C
/*    */     //   280: istore_3
/*    */     //   281: goto -> 238
/*    */     //   284: ldc_w '?ⓞӌ붂鿟젥羽㟍켏딪枢ꄰ줁ת㞂㆑ۣ♮༲긫?෌쇊⠜刏돼챞炙ວ嚾㠵ꚇ举㋮᫔࣍죖儍닸?煉薕﹖箿瘖⛁뢭좿䟱狯榣톞⤡얇?་∼㔥'
/*    */     //   287: invokevirtual toCharArray : ()[C
/*    */     //   290: dup
/*    */     //   291: dup
/*    */     //   292: iconst_5
/*    */     //   293: dup_x1
/*    */     //   294: caload
/*    */     //   295: sipush #22863
/*    */     //   298: ixor
/*    */     //   299: i2c
/*    */     //   300: castore
/*    */     //   301: sipush #5387
/*    */     //   304: iconst_1
/*    */     //   305: iconst_1
/*    */     //   306: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   309: dup
/*    */     //   310: astore #4
/*    */     //   312: invokevirtual length : ()I
/*    */     //   315: istore #6
/*    */     //   317: bipush #32
/*    */     //   319: istore_3
/*    */     //   320: iconst_m1
/*    */     //   321: istore_2
/*    */     //   322: iinc #2, 1
/*    */     //   325: aload #4
/*    */     //   327: iload_2
/*    */     //   328: dup
/*    */     //   329: iload_3
/*    */     //   330: iadd
/*    */     //   331: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   334: iconst_0
/*    */     //   335: goto -> 384
/*    */     //   338: aload #7
/*    */     //   340: swap
/*    */     //   341: iload #5
/*    */     //   343: iinc #5, 1
/*    */     //   346: swap
/*    */     //   347: aastore
/*    */     //   348: iload_2
/*    */     //   349: iload_3
/*    */     //   350: iadd
/*    */     //   351: dup
/*    */     //   352: istore_2
/*    */     //   353: iload #6
/*    */     //   355: if_icmpge -> 368
/*    */     //   358: aload #4
/*    */     //   360: iload_2
/*    */     //   361: invokevirtual charAt : (I)C
/*    */     //   364: istore_3
/*    */     //   365: goto -> 322
/*    */     //   368: aload #7
/*    */     //   370: putstatic me/konsolas/aac/AAC.q : [Ljava/lang/String;
/*    */     //   373: bipush #26
/*    */     //   375: anewarray java/lang/String
/*    */     //   378: putstatic me/konsolas/aac/AAC.r : [Ljava/lang/String;
/*    */     //   381: goto -> 448
/*    */     //   384: swap
/*    */     //   385: ldc_w '⽩ᦌ쭚왥䌨썹穸㓛鲪䳫'
/*    */     //   388: invokevirtual toCharArray : ()[C
/*    */     //   391: dup
/*    */     //   392: dup
/*    */     //   393: iconst_5
/*    */     //   394: dup_x1
/*    */     //   395: caload
/*    */     //   396: sipush #31326
/*    */     //   399: ixor
/*    */     //   400: i2c
/*    */     //   401: castore
/*    */     //   402: sipush #16004
/*    */     //   405: iconst_0
/*    */     //   406: iconst_4
/*    */     //   407: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   410: invokevirtual getBytes : (Ljava/lang/String;)[B
/*    */     //   413: aload_0
/*    */     //   414: swap
/*    */     //   415: invokevirtual doFinal : ([B)[B
/*    */     //   418: astore #8
/*    */     //   420: aload #8
/*    */     //   422: invokestatic a : ([B)Ljava/lang/String;
/*    */     //   425: invokevirtual intern : ()Ljava/lang/String;
/*    */     //   428: swap
/*    */     //   429: tableswitch default -> 254, 0 -> 338
/*    */     //   448: return
/*    */   }
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   }
/*    */   
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xD1D;
/*    */     if (r[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])s.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "茺ᘉཐ솶䏝䦣ꌣ㚐ບ䢩⺚濍㽘่跈ｏ㌡᧌낀枭㪨".toCharArray()[0] = (char)("茺ᘉཐ솶䏝䦣ꌣ㚐ບ䢩⺚濍㽘่跈ｏ㌡᧌낀枭㪨".toCharArray()[0] ^ 0x7AB1);
/*    */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("茺ᘉཐ솶䏝䦣ꌣ㚐ບ䢩⺚濍㽘่跈ｏ㌡᧌낀枭㪨".toCharArray(), (short)18447, false, true));
/*    */           "ﾩ⛅鮣拞".toCharArray()[1] = (char)("ﾩ⛅鮣拞".toCharArray()[1] ^ 0x532B);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("ﾩ⛅鮣拞".toCharArray(), (short)30555, false, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           s.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "哱耇兂쀑띘种㢮퇡鮗␢ᐟ껣畫嫋᩸ퟣ冽衝ኟ".toCharArray()[0] = (char)("哱耇兂쀑띘种㢮퇡鮗␢ᐟ껣畫嫋᩸ퟣ冽衝ኟ".toCharArray()[0] ^ 0x796A);
/*    */         throw new RuntimeException(dP$dt.X("哱耇兂쀑띘种㢮퇡鮗␢ᐟ껣畫嫋᩸ퟣ冽衝ኟ".toCharArray(), (short)24202, false, true), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "厑돮隟쮷︞贲했푢矗惷糦".toCharArray()[1] = (char)("厑돮隟쮷︞贲했푢矗惷糦".toCharArray()[1] ^ 0xEB5);
/*    */       byte[] arrayOfByte2 = q[i].getBytes(dP$dt.X("厑돮隟쮷︞贲했푢矗惷糦".toCharArray(), (short)7460, false, false));
/*    */       r[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return r[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 170
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '勉??嵡儮땯?姬캼처癛殥뎄貑ⶲ'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: iconst_2
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #22549
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #14556
/*    */     //   86: iconst_1
/*    */     //   87: iconst_1
/*    */     //   88: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w 'ঐ滤㵕ٞ'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_1
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #12891
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #27934
/*    */     //   114: iconst_0
/*    */     //   115: iconst_1
/*    */     //   116: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w 'ﭼ?羃ᦐ'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_1
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #8233
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #9436
/*    */     //   146: iconst_1
/*    */     //   147: iconst_1
/*    */     //   148: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   154: aload_2
/*    */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   164: aload #4
/*    */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   169: athrow
/*    */     //   170: aload_3
/*    */     //   171: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\AAC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */