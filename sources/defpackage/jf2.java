package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jf2 implements js7 {
    public final ArrayList a;

    public jf2(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // defpackage.js7
    public is7 a(j22 j22Var) {
        return null;
    }

    public boolean b(int i, n46 n46Var, Object obj) {
        ArrayList arrayList = n46Var.a;
        if (arrayList == null) {
            c(i, n46Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof f46)) {
                if (!(obj2 instanceof n46)) {
                    pd4.i(obj2, "Unexpected child source info ");
                    break;
                }
                if (b(i, (n46) obj2, obj)) {
                    c(0, n46Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                c(0, n46Var, obj2);
                return true;
            }
        }
        return false;
    }

    public void c(int i, n46 n46Var, Object obj) {
        this.a.add(new kf2(i, null, null));
    }

    @Override // defpackage.js7
    public void d() {
        g((String[]) this.a.toArray(new String[0]));
    }

    public void e(int i, Object obj, n46 n46Var, Object obj2) {
        if (pa7.t(obj, sf2.a)) {
            c(i, n46Var, null);
        }
    }

    @Override // defpackage.js7
    public void f(Object obj) {
        if (obj instanceof String) {
            this.a.add((String) obj);
        }
    }

    public abstract void g(String[] strArr);

    @Override // defpackage.js7
    public void i(j22 j22Var, t99 t99Var) {
    }

    @Override // defpackage.js7
    public void v(m22 m22Var) {
    }
}
