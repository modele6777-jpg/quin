package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fz9 extends n16 {
    public final /* synthetic */ int J = 1;
    public final Method K;
    public final int L;
    public final cu2 M;
    public final Object N;

    public fz9(Method method, int i, cu2 cu2Var, String str) {
        this.K = method;
        this.L = i;
        this.M = cu2Var;
        this.N = str;
    }

    @Override // defpackage.n16
    public final void t(htb htbVar, Object obj) {
        int i = this.J;
        cu2 cu2Var = this.M;
        Object obj2 = this.N;
        Method method = this.K;
        int i2 = this.L;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    htbVar.c((si6) obj2, (ftb) cu2Var.v(obj));
                    return;
                } catch (IOException e) {
                    throw an1.I(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw an1.I(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw an1.I(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw an1.I(method, i2, ib8.j("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", ib8.j("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    si6 si6Var = si6.b;
                    htbVar.c(y41.G(strArr), (ftb) cu2Var.v(value));
                }
                return;
        }
    }

    public fz9(Method method, int i, si6 si6Var, cu2 cu2Var) {
        this.K = method;
        this.L = i;
        this.N = si6Var;
        this.M = cu2Var;
    }
}
