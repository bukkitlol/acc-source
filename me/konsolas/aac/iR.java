/*  1 */ package me.konsolas.aac;public class ir extends iU implements c5, Serializable, Cloneable { private static final long serialVersionUID = -7046029254386353129L; protected transient hy f; public hy a() { try { if (this.f == null) this.f = e9.a(new h2(this.d, this.c));  } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }  return this.f; } protected transient kQ g; protected transient jM e; private static final long h = nc.a(4844578651395997780L, 201166206420328482L, MethodHandles.lookup().lookupClass()).a(183954016203806L); public jM a() { 
/*  2 */     try { if (this.e == null) this.e = e9.a(this.c);  } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }  return this.e; } protected ir(int paramInt, Object paramObject) {
/*  3 */     super(paramInt, paramObject);
/*    */   }
/*  5 */   public boolean isEmpty() { return false; } @Deprecated
/*  6 */   public Set entrySet() { return b(); }
/*  7 */   public String toString() { long l = h ^ 0x8983C7BB39L; "瞳".toCharArray()[0] = (char)("瞳".toCharArray()[0] ^ 0x906); "䠢䯖廄".toCharArray()[1] = (char)("䠢䯖廄".toCharArray()[1] ^ 0x40D); "慱溚".toCharArray()[0] = (char)("慱溚".toCharArray()[0] ^ 0x6B01); return dP$dt.X("瞳".toCharArray(), (short)31154, true, true) + this.d + dP$dt.X("䠢䯖廄".toCharArray(), (short)10839, false, true) + this.c + dP$dt.X("慱溚".toCharArray(), (short)26781, false, false); } public boolean equals(Object paramObject) { 
/*  8 */     try { if (paramObject == this) return true;  } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }
/*    */ 
/*    */     
/*    */     try {
/*    */       if (!(paramObject instanceof Map)) {
/*    */         return false;
/*    */       }
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw c(null);
/*    */     } 
/* 18 */     Map map = (Map)paramObject; try { if (map.size() != 1)
/* 19 */         return false;  } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }  return ((Map.Entry)map.entrySet().iterator().next()).equals(b().b().next()); } public boolean containsValue(Object paramObject) { return Objects.equals(this.c, paramObject); }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw c(null);
/*    */     } 
/*    */     return this.d ^ ((this.c == null) ? 0 : this.c.hashCode());
/*    */   }
/*    */   
/*    */   public Collection values() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public Set keySet() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public hy b() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public kQ a() {
/*    */     try {
/*    */       if (this.g == null)
/*    */         this.g = aU.c(this.d); 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw c(null);
/*    */     } 
/*    */     return this.g;
/*    */   }
/*    */   
/*    */   public void putAll(Map paramMap) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   private static UnsupportedOperationException c(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */