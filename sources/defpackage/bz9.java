package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bz9 extends n16 {
    public final Method J;
    public final int K;
    public final cu2 L;

    public bz9(Method method, int i, cu2 cu2Var) {
        this.J = method;
        this.K = i;
        this.L = cu2Var;
    }

    @Override // defpackage.n16
    public final void t(htb htbVar, Object obj) {
        int i = this.K;
        Method method = this.J;
        if (obj == null) {
            throw an1.I(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            htbVar.k = (ftb) this.L.v(obj);
        } catch (IOException e) {
            throw an1.J(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
