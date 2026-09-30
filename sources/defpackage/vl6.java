package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vl6 implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vl6(float f, jx jxVar) {
        this.b = f;
        this.c = jxVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        float fN = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Float.valueOf(fN > 0.0f ? mh3.n(((Number) ((jx) obj).e()).floatValue() / fN, 0.0f, 1.0f) : 0.0f);
            default:
                j18 j18Var = (j18) obj;
                if (j18Var.e.b.j() <= 0) {
                    fN = mh3.n(j18Var.e.c.j(), 0.0f, fN);
                }
                return Float.valueOf(fN);
        }
    }

    public /* synthetic */ vl6(j18 j18Var, float f) {
        this.c = j18Var;
        this.b = f;
    }
}
