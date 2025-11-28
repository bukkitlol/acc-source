/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface hq extends Comparator { default hq a(hq paramhq) { return (paramLong1, paramLong2) -> {
/*    */         int i = a(paramLong1, paramLong2);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*    */         try {
/*    */         
/* 10 */         } catch (IllegalArgumentException illegalArgumentException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return (i == 0) ? paramhq.a(paramLong1, paramLong2) : i;
/*    */       }; }
/*    */ 
/*    */   
/*    */   public static final long b = nc.a(853166995421722084L, 8959716801365967056L, MethodHandles.lookup().lookupClass()).a(242719083902036L);
/*    */   
/*    */   @Deprecated
/*    */   default int a(Long paramLong1, Long paramLong2) {
/*    */     return a(paramLong1.longValue(), paramLong2.longValue());
/*    */   }
/*    */   
/*    */   default hq a() {
/*    */     return f0.a(this);
/*    */   }
/*    */   
/*    */   default Comparator thenComparing(Comparator<?> paramComparator) {
/*    */     try {
/*    */       if (paramComparator instanceof hq)
/*    */         return a((hq)paramComparator); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return super.thenComparing(paramComparator);
/*    */   }
/*    */   
/*    */   default Comparator reversed() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default int compare(Object paramObject1, Object paramObject2) {
/*    */     return a((Long)paramObject1, (Long)paramObject2);
/*    */   }
/*    */   
/*    */   int a(long paramLong1, long paramLong2);
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */