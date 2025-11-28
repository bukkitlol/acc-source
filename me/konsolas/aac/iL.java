/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface il extends Comparator { @Deprecated default int compare(Object paramObject1, Object paramObject2) { return a((Float)paramObject1, (Float)paramObject2); }
/*    */    public static final long b = nc.a(-3101883637695363878L, -4457774711389702588L, MethodHandles.lookup().lookupClass()).a(230888377987523L); default il a(il paramil) {
/*  3 */     return (paramFloat1, paramFloat2) -> {
/*    */         int i = a(paramFloat1, paramFloat2);
/*    */ 
/*    */ 
/*    */         
/*    */         try {
/*    */         
/* 10 */         } catch (IllegalArgumentException illegalArgumentException) {
/*    */           throw a(null);
/*    */         } 
/*    */         return (i == 0) ? paramil.a(paramFloat1, paramFloat2) : i;
/*    */       };
/*    */   }
/*    */   
/*    */   default Comparator reversed() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   default il a() {
/*    */     return lO.a(this);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default int a(Float paramFloat1, Float paramFloat2) {
/*    */     return a(paramFloat1.floatValue(), paramFloat2.floatValue());
/*    */   }
/*    */   
/*    */   default Comparator thenComparing(Comparator<?> paramComparator) {
/*    */     try {
/*    */       if (paramComparator instanceof il)
/*    */         return a((il)paramComparator); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return super.thenComparing(paramComparator);
/*    */   }
/*    */   
/*    */   int a(float paramFloat1, float paramFloat2);
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\il.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */