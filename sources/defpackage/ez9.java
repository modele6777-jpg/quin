package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ez9 extends n16 {
    public final /* synthetic */ int J;
    public final Method K;
    public final int L;

    public /* synthetic */ ez9(Method method, int i, int i2) {
        this.J = i2;
        this.K = method;
        this.L = i;
    }

    @Override // defpackage.n16
    public final void t(htb htbVar, Object obj) {
        int i = this.J;
        int i2 = this.L;
        Method method = this.K;
        switch (i) {
            case 0:
                si6 si6Var = (si6) obj;
                if (si6Var == null) {
                    throw an1.I(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                qi6 qi6Var = htbVar.f;
                qi6Var.getClass();
                int size = si6Var.size();
                for (int i3 = 0; i3 < size; i3++) {
                    xdc.g(qi6Var, xdc.i(si6Var, i3), xdc.k(si6Var, i3));
                }
                return;
            default:
                if (obj == null) {
                    throw an1.I(method, i2, "@Url parameter is null.", new Object[0]);
                }
                htbVar.c = obj.toString();
                return;
        }
    }
}
