/*    */ package me.konsolas.aac;
/*    */ @FunctionalInterface
/*  3 */ public interface kx extends Comparator { default Comparator reversed() { return a(); } public static final long b = nc.a(7522855570623326952L, -6423058266388615984L, MethodHandles.lookup().lookupClass()).a(181730668537945L); @Deprecated
/*    */   default int a(Integer paramInteger1, Integer paramInteger2) {
/*  5 */     return a(paramInteger1.intValue(), paramInteger2.intValue()); } @Deprecated
/*  6 */   default int compare(Object paramObject1, Object paramObject2) { return a((Integer)paramObject1, (Integer)paramObject2); }
/*  7 */   default kx a() { return iO.a(this); }
/*  8 */   default kx a(kx paramkx) { return (paramInt1, paramInt2) -> { int i = a(paramInt1, paramInt2); try {  }
/*  9 */         catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (i == 0) ? paramkx.a(paramInt1, paramInt2) : i;
/* 10 */       }; } default Comparator thenComparing(Comparator<?> paramComparator) { try { if (paramComparator instanceof kx) return a((kx)paramComparator);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */     
/*    */     return super.thenComparing(paramComparator); }
/*    */ 
/*    */   
/*    */   int a(int paramInt1, int paramInt2);
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */