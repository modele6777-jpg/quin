package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u8a extends w8a implements wg2, tg2 {
    public static final u8a d = new u8a(p4f.e, 0);

    @Override // defpackage.w8a, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof b1b) {
            return super.containsKey((b1b) obj);
        }
        return false;
    }

    @Override // defpackage.r2, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof srf) {
            return super.containsValue((srf) obj);
        }
        return false;
    }

    @Override // defpackage.w8a
    public final z8a f() {
        t8a t8aVar = new t8a(this);
        t8aVar.g = this;
        return t8aVar;
    }

    @Override // defpackage.w8a
    public final z8a g() {
        t8a t8aVar = new t8a(this);
        t8aVar.g = this;
        return t8aVar;
    }

    @Override // defpackage.w8a, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof b1b) {
            return (srf) super.get((b1b) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof b1b) ? obj2 : (srf) super.getOrDefault((b1b) obj, (srf) obj2);
    }

    public final u8a i(b1b b1bVar, srf srfVar) {
        sug sugVarU = this.a.u(b1bVar, b1bVar.hashCode(), srfVar, 0);
        return sugVarU == null ? this : new u8a((p4f) sugVarU.c, this.b + sugVarU.b);
    }

    @Override // defpackage.tg2
    public final Object s0(b1b b1bVar) {
        return od4.B(this, b1bVar);
    }
}
