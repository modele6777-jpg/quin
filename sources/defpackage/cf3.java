package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cf3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wf3 b;

    public /* synthetic */ cf3(wf3 wf3Var, int i) {
        this.a = i;
        this.b = wf3Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        wf3 wf3Var = this.b;
        switch (i) {
            case 0:
                ka4 ka4Var = (ka4) obj;
                int i2 = ka4Var.a;
                xf3 xf3Var = (xf3) wf3Var;
                Long lB = xf3Var.b();
                l91 l91Var = xf3Var.c;
                if (lB != null) {
                    n91 n91VarA = l91Var.a(l91Var.a(lB.longValue()).e);
                    if (xf3Var.a.e(n91VarA.a)) {
                        xf3Var.e.setValue(n91VarA);
                    }
                }
                xf3Var.g.setValue(ka4Var);
                break;
            case 1:
                ((xf3) wf3Var).c((Long) obj);
                break;
            default:
                xf3 xf3Var2 = (xf3) wf3Var;
                n91 n91VarA2 = xf3Var2.c.a(((Long) obj).longValue());
                if (xf3Var2.a.e(n91VarA2.a)) {
                    xf3Var2.e.setValue(n91VarA2);
                }
                break;
        }
        return wefVar;
    }
}
