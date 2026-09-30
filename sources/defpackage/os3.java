package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class os3 implements zhc {
    public final a26 a;
    public final ns3 b = new ns3(this);
    public final b99 c = new b99();
    public final vz9 d;
    public final vz9 e;
    public final vz9 f;

    public os3(a26 a26Var) {
        this.a = a26Var;
        Boolean bool = Boolean.FALSE;
        this.d = q1c.f(bool);
        this.e = q1c.f(bool);
        this.f = q1c.f(bool);
    }

    @Override // defpackage.zhc
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.zhc
    public final Object b(s89 s89Var, l26 l26Var, zn2 zn2Var) {
        Object objO = jgb.O(new ms3(this, s89Var, l26Var, null), zn2Var);
        return objO == bw2.a ? objO : wef.a;
    }

    @Override // defpackage.zhc
    public final float e(float f) {
        return ((Number) this.a.d(Float.valueOf(f))).floatValue();
    }
}
