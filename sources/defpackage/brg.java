package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class brg {
    public final /* synthetic */ int a;
    public final Object b;

    public brg() {
        this.a = 1;
        this.b = new Object();
    }

    public static lq3 a(vd0 vd0Var) {
        new w84(12);
        vd0Var.getClass();
        new HashMap();
        throw null;
    }

    public Object b() {
        if (oa7.j == null) {
            oa7.j = new eog();
        }
        synchronized (oa7.i) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("[Result: <");
                sb.append("Value: " + this.b);
                sb.append(">]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ brg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
