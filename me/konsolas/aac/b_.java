/*    */ package me.konsolas.aac;
/*    */ final class b_ extends bo implements fK { final a9 c;
/*  3 */   public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); } protected final int a(int paramInt) {
/*  4 */     return i7.a(this.c.b)[paramInt];
/*    */   }
/*    */   
/*    */   protected final b_ a(int paramInt1, int paramInt2) {
/*  8 */     return new b_(this.c, paramInt1, paramInt2);
/*  9 */   } public void forEachRemaining(IntConsumer paramIntConsumer) { int i = i7.a(this.c.b); try { while (this.a < i)
/* 10 */         paramIntConsumer.accept(i7.a(this.c.b)[this.a++]);  } catch (v v) { throw a(null); }  } protected fK a(int paramInt1, int paramInt2) { return a(paramInt1, paramInt2); } public int characteristics() {
/* 11 */     return 16721;
/*    */   }
/*    */   
/*    */   b_(a9 parama9, int paramInt1, int paramInt2) {
/*    */     super(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\b_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */