package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class scd {
    public final vz9 a;
    public final vz9 b;
    public final di2 c;
    public final long d;
    public bv7 e;
    public long f;
    public float g;
    public float h;
    public long i;
    public long j;
    public float k;
    public btf l;

    public scd() {
        Boolean bool = Boolean.FALSE;
        this.a = q1c.f(bool);
        this.b = q1c.f(bool);
        this.c = new di2(3);
        this.d = a19.a();
        this.f = y72.j;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = r2f.b;
        this.j = 0L;
        this.k = 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final xz a() {
        float fFloatValue;
        if (!c()) {
            return null;
        }
        btf btfVar = this.l;
        if (btfVar != null) {
            float fB = btfVar.b();
            Float fValueOf = Float.isNaN(fB) ? null : Float.valueOf(fB);
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
        } else {
            fFloatValue = 0.0f;
        }
        return new xz(fFloatValue);
    }

    public final yz b() {
        if (!c()) {
            return null;
        }
        float fB = zsf.b(0L);
        Float fValueOf = Float.valueOf(fB);
        if (Float.isNaN(fB)) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        float fC = zsf.c(0L);
        Float fValueOf2 = Float.isNaN(fC) ? null : Float.valueOf(fC);
        return new yz(fFloatValue, fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
    }

    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void e(boolean z) {
        vz9 vz9Var = this.a;
        boolean zBooleanValue = ((Boolean) vz9Var.getValue()).booleanValue();
        vz9 vz9Var2 = this.b;
        if (zBooleanValue && !z) {
            vz9Var2.setValue(Boolean.TRUE);
        } else if (z) {
            vz9Var2.setValue(Boolean.FALSE);
        }
        vz9Var.setValue(Boolean.valueOf(z));
    }
}
