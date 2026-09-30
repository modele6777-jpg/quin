package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r3g implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z67 b;
    public final /* synthetic */ h0e c;
    public final /* synthetic */ h0e d;
    public final /* synthetic */ h0e e;

    public r3g(int i, z67 z67Var, h0e h0eVar, h0e h0eVar2, h0e h0eVar3) {
        this.a = i;
        this.b = z67Var;
        this.c = h0eVar;
        this.d = h0eVar2;
        this.e = h0eVar3;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int iIntValue;
        iy9 iy9Var = (iy9) obj;
        Boolean bool = (Boolean) iy9Var.a();
        boolean zBooleanValue = bool.booleanValue();
        Integer num = (Integer) iy9Var.b();
        a26 a26Var = (a26) this.c.getValue();
        if (a26Var != null) {
            a26Var.d(bool);
        }
        if (!zBooleanValue && num != null && (iIntValue = num.intValue()) >= 0 && iIntValue < this.a) {
            int iIntValue2 = num.intValue() + this.b.a;
            if (iIntValue2 != ((Number) this.d.getValue()).intValue()) {
                ((a26) this.e.getValue()).d(new Integer(iIntValue2));
            }
        }
        return wef.a;
    }
}
