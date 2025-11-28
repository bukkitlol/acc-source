/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ final class ek extends ed {
/*    */   final bQ c;
/*    */   
/*    */   ek(bQ parambQ) {
/* 10 */     super(parambQ.c, parambQ.f);
/*    */   } protected final Object a(int paramInt) { return this.c.e[paramInt]; }
/* 12 */   protected ae a(int paramInt1, int paramInt2) { return a(paramInt1, paramInt2); }
/* 13 */   protected final ek a(int paramInt1, int paramInt2) { return new ek(this.c, paramInt1, paramInt2); } public boolean tryAdvance(Consumer<Object> paramConsumer) { 
/* 14 */     try { if (this.a >= this.b) return false;  } catch (v v) { throw a(null); }
/* 15 */      paramConsumer.accept(this.c.e[this.a++]); return true; } public void forEachRemaining(Consumer<Object> paramConsumer) { int i = this.b; try { while (this.a < i)
/*    */         paramConsumer.accept(this.c.e[this.a++]);  } catch (v v) { throw a(null); }
/* 17 */      } public int characteristics() { return 17488; }
/*    */ 
/*    */   
/*    */   private ek(bQ parambQ, int paramInt1, int paramInt2) {
/*    */     super(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */