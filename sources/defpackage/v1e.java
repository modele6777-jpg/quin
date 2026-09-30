package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v1e implements w31 {
    public final x16 b;
    public final cv7 c;
    public final boolean d;
    public final w31 e;

    public v1e(x16 x16Var, cv7 cv7Var, boolean z, w31 w31Var) {
        this.b = x16Var;
        this.c = cv7Var;
        this.d = z;
        this.e = w31Var;
    }

    @Override // defpackage.w31
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.b.invoke()).intValue();
        boolean z = this.c == cv7.b;
        if (this.d || !z) {
            f -= fIntValue;
        }
        return this.e.a(f, f2, f3 - fIntValue);
    }
}
