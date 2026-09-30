package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dwe {
    public static final ig4 a = new ig4("NO_THREAD_ELEMENTS", 2);
    public static final mle b = new mle(29);
    public static final cwe c = new cwe(0);
    public static final cwe d = new cwe(1);

    public static final void a(pv2 pv2Var, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof kwe)) {
            Object objV0 = pv2Var.V0(c, null);
            objV0.getClass();
            ((fwe) objV0).a(obj);
            return;
        }
        kwe kweVar = (kwe) obj;
        fwe[] fweVarArr = kweVar.c;
        int length = fweVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            fwe fweVar = fweVarArr[length];
            fweVar.getClass();
            fweVar.a(kweVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(pv2 pv2Var) {
        Object objV0 = pv2Var.V0(b, 0);
        objV0.getClass();
        return objV0;
    }

    public static final Object c(pv2 pv2Var, Object obj) {
        if (obj == null) {
            obj = b(pv2Var);
        }
        if (obj == 0) {
            return a;
        }
        if (!(obj instanceof Integer)) {
            return ((fwe) obj).c();
        }
        return pv2Var.V0(d, new kwe(((Number) obj).intValue(), pv2Var));
    }
}
