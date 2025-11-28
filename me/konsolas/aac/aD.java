/*    */ package me.konsolas.aac;@FunctionalInterface public interface ad extends Comparator { public static final long b = nc.a(443309142753385968L, -4701635548308572800L, MethodHandles.lookup().lookupClass()).a(64188519973342L); @Deprecated
/*  2 */   default int compare(Object paramObject1, Object paramObject2) { return a((Short)paramObject1, (Short)paramObject2); }
/*    */   
/*  4 */   default ad a() { return jH.a(this); } default Comparator thenComparing(Comparator<?> paramComparator) { 
/*  5 */     try { if (paramComparator instanceof ad) return a((ad)paramComparator);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */ 
/*    */     
/*  8 */     return super.thenComparing(paramComparator); }
/*  9 */   default Comparator reversed() { return a(); }
/* 10 */   default ad a(ad paramad) { return (paramShort1, paramShort2) -> { int i = a(paramShort1, paramShort2); try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (i == 0) ? paramad.a(paramShort1, paramShort2) : i; }; } @Deprecated default int a(Short paramShort1, Short paramShort2) { return a(paramShort1.shortValue(), paramShort2.shortValue()); }
/*    */ 
/*    */   
/*    */   int a(short paramShort1, short paramShort2);
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */