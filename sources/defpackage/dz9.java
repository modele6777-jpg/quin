package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dz9 extends n16 {
    public final /* synthetic */ int J;
    public final Method K;
    public final int L;
    public final cu2 M;
    public final boolean N;

    public /* synthetic */ dz9(Method method, int i, cu2 cu2Var, boolean z, int i2) {
        this.J = i2;
        this.K = method;
        this.L = i;
        this.M = cu2Var;
        this.N = z;
    }

    @Override // defpackage.n16
    public final void t(htb htbVar, Object obj) {
        int i = this.J;
        boolean z = this.N;
        Method method = this.K;
        int i2 = this.L;
        cu2 cu2Var = this.M;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw an1.I(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw an1.I(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw an1.I(method, i2, ib8.j("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String str2 = (String) cu2Var.v(value);
                    if (str2 == null) {
                        throw an1.I(method, i2, "Field map value '" + value + "' converted to null by " + cu2Var.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    htbVar.a(str, str2, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw an1.I(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (str3 == null) {
                        throw an1.I(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw an1.I(method, i2, ib8.j("Header map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    htbVar.b(str3, (String) cu2Var.v(value2), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw an1.I(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str4 = (String) entry3.getKey();
                    if (str4 == null) {
                        throw an1.I(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw an1.I(method, i2, ib8.j("Query map contained null value for key '", str4, "'."), new Object[0]);
                    }
                    String str5 = (String) cu2Var.v(value3);
                    if (str5 == null) {
                        throw an1.I(method, i2, "Query map value '" + value3 + "' converted to null by " + cu2Var.getClass().getName() + " for key '" + str4 + "'.", new Object[0]);
                    }
                    htbVar.d(str4, str5, z);
                }
                return;
        }
    }
}
