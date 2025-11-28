/*    */ package me.konsolas.aac;
/*    */ public class eo { public static final eo c;
/*    */   
/*  4 */   public eo a(double paramDouble1, double paramDouble2) { return new eo(this.b + paramDouble1, this.a + paramDouble2); } private final double b; private final double a; public eo a(double paramDouble) {
/*  5 */     return new eo(this.b * paramDouble, this.a * paramDouble); } public double b() {
/*  6 */     return this.b;
/*  7 */   } private static final long d = nc.a(-7345319465727358974L, -6495304539532289774L, MethodHandles.lookup().lookupClass()).a(252353406466297L); static { c = new eo(0.6D, 1.8D); }
/*    */    public eo(double paramDouble1, double paramDouble2) {
/*  9 */     this.b = paramDouble1;
/*    */     this.a = paramDouble2;
/*    */   }
/*    */   
/* 13 */   public static eo a(long paramLong, Entity paramEntity) { paramLong = d ^ paramLong; long l = paramLong ^ 0x27EA3D999895L; lq lq = lo.a().a(paramEntity, l);
/*    */     return new eo(Math.max(lq.b() - lq.c(), lq.f() - lq.d()), lq.a() - lq.e()); }
/* 15 */   public eo a(eo parameo) { return new eo(Math.max(this.b, parameo.b), Math.max(this.a, parameo.a)); } public double a() {
/* 16 */     return this.a;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\eo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */