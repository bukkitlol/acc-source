/*  1 */ package me.konsolas.aac;final class d3 extends dd implements ea { private final aI g = new aI(this.h); final ip h; private d3(ip paramip) {
/*  2 */     super(paramip, null);
/*    */   }
/*    */   
/*  5 */   d3(ip paramip, bu parambu) { this(paramip); }
/*  6 */   public Object next() { return a(); }
/*  7 */   public aI a() { this.g.a = a();
/*    */     return this.g; }
/*  9 */   void a(Object paramObject, int paramInt) { a((Consumer)paramObject, paramInt); }
/* 10 */   public void forEachRemaining(Consumer paramConsumer) { forEachRemaining(paramConsumer); } final void a(Consumer<aI> paramConsumer, int paramInt) {
/* 11 */     this.g.a = paramInt;
/*    */     paramConsumer.accept(this.g);
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\d3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */