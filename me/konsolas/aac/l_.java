/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import org.bukkit.Location;
/*    */ 
/*    */ class l_ {
/*    */   private final int d;
/*    */   private final Location c;
/*    */   private Location b;
/*    */   
/* 11 */   private l_(int paramInt, Location paramLocation) { this.d = paramInt; this.c = paramLocation; }
/*    */   private boolean a; private static final long e = nc.a(-6185864105630517116L, 2332238599816698040L, MethodHandles.lookup().lookupClass()).a(125905865146116L); static void a(l_ paraml_, long paramLong, short paramShort, Location paramLocation) { // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: bipush #16
/*    */     //   3: lshl
/*    */     //   4: iload_3
/*    */     //   5: i2l
/*    */     //   6: bipush #48
/*    */     //   8: lshl
/*    */     //   9: bipush #48
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: getstatic me/konsolas/aac/l_.e : J
/*    */     //   16: lxor
/*    */     //   17: lstore #5
/*    */     //   19: lload #5
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 15469457158179
/*    */     //   25: lxor
/*    */     //   26: lstore #7
/*    */     //   28: pop2
/*    */     //   29: aload_0
/*    */     //   30: aload #4
/*    */     //   32: lload #7
/*    */     //   34: ldc2_w -2902457710585653217
/*    */     //   37: lload #5
/*    */     //   39: <illegal opcode> Ö : (Lme/konsolas/aac/l_;Lorg/bukkit/Location;JJJ)V
/*    */     //   44: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/* 12 */     //   #1	-> 29 } static Location a(l_ paraml_) { return paraml_.b; } static int a(l_ paraml_) { return paraml_.d; }
/*    */ 
/*    */   
/*    */   static boolean a(l_ paraml_, boolean paramBoolean) {
/*    */     return paraml_.a = paramBoolean;
/*    */   }
/*    */   
/*    */   static boolean a(l_ paraml_) {
/*    */     return paraml_.a;
/*    */   }
/*    */   
/*    */   static Location b(l_ paraml_) {
/*    */     return paraml_.c;
/*    */   }
/*    */   
/*    */   l_(int paramInt, Location paramLocation, mn parammn) {
/*    */     this(paramInt, paramLocation);
/*    */   }
/*    */   
/*    */   private void a(Location paramLocation, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/l_.e : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w -1534347556107020457
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   15: astore #4
/*    */     //   17: aload_0
/*    */     //   18: aload #4
/*    */     //   20: ifnonnull -> 56
/*    */     //   23: getfield b : Lorg/bukkit/Location;
/*    */     //   26: ifnonnull -> 60
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w -1538982296441014564
/*    */     //   35: lload_2
/*    */     //   36: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   41: athrow
/*    */     //   42: aload_0
/*    */     //   43: goto -> 56
/*    */     //   46: ldc2_w -1538982296441014564
/*    */     //   49: lload_2
/*    */     //   50: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   55: athrow
/*    */     //   56: aload_1
/*    */     //   57: putfield b : Lorg/bukkit/Location;
/*    */     //   60: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 17
/*    */     //   #3	-> 60
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	29	32	aacinternal/v
/*    */     //   23	43	46	aacinternal/v
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */