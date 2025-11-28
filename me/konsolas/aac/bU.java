/*  1 */ package me.konsolas.aac;class bu extends aN { public void forEach(Consumer<Object> paramConsumer) { try { if (this.b.k) paramConsumer.accept(this.b.q[this.b.o]);  } catch (v v) { throw b(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 11 */     int i = this.b.o; while (true) { try { while (i-- != 0) { if (this.b.t[i] != 0)
/* 12 */             paramConsumer.accept(this.b.q[i]);  }  } catch (v v) { throw b(null); }  break; }  } final ip b; public ea b() { return new dz(this.b); }
/*    */ 
/*    */   
/*    */   public Spliterator spliterator() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public void clear() {
/*    */     this.b.clear();
/*    */   }
/*    */   
/*    */   public boolean contains(Object paramObject) {
/*    */     return this.b.containsValue(paramObject);
/*    */   }
/*    */   
/*    */   public ae a() {
/*    */     return new gx(this.b);
/*    */   }
/*    */   
/*    */   bu(ip paramip) {}
/*    */   
/*    */   public int size() {
/*    */     return this.b.r;
/*    */   }
/*    */   
/*    */   public Iterator iterator() {
/*    */     return b();
/*    */   }
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */