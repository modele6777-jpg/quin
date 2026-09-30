package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o08 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r08 b;

    public /* synthetic */ o08(r08 r08Var, int i) {
        this.a = i;
        this.b = r08Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        r08 r08Var = this.b;
        switch (i) {
            case 0:
                rz7 rz7Var = (rz7) r08Var.Z.invoke();
                int iA = rz7Var.a();
                int i2 = 0;
                while (i2 < iA) {
                    if (rz7Var.b(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                rz7 rz7Var2 = (rz7) r08Var.Z.invoke();
                if (iIntValue < 0 || iIntValue >= rz7Var2.a()) {
                    l37.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + rz7Var2.a() + ")");
                }
                ynb.V(r08Var.Z0(), null, null, new q08(r08Var, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
