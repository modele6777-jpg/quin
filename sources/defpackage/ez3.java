package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ez3 {
    public static final m8c c = new m8c(26);
    public static int d = 1;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final ez3 m;
    public static final ez3 n;
    public static final ez3 o;
    public static final ez3 p;
    public static final ez3 q;
    public static final ace r;
    public static final ace s;
    public final List a;
    public final int b;

    static {
        int iZ = m8c.z();
        e = iZ;
        int iZ2 = m8c.z();
        f = iZ2;
        int iZ3 = m8c.z();
        g = iZ3;
        int iZ4 = m8c.z();
        h = iZ4;
        int iZ5 = m8c.z();
        i = iZ5;
        int iZ6 = m8c.z();
        j = iZ6;
        int iZ7 = m8c.z() - 1;
        k = iZ7;
        int i2 = iZ | iZ2 | iZ3;
        l = i2;
        m = new ez3(iZ7);
        n = new ez3(iZ5 | iZ6);
        new ez3(iZ);
        new ez3(iZ2);
        new ez3(iZ3);
        o = new ez3(i2);
        new ez3(iZ4);
        p = new ez3(iZ5);
        q = new ez3(iZ6);
        new ez3(iZ2 | iZ5 | iZ6);
        r = new ace(tq0.v);
        s = new ace(tq0.w);
    }

    public ez3(int i2, List list) {
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((cz3) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (this.b & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ez3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ez3 ez3Var = (ez3) obj;
        return pa7.t(this.a, ez3Var.a) && this.b == ez3Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = ((List) r.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((dz3) next).a != this.b);
        dz3 dz3Var = (dz3) next;
        String strD0 = dz3Var != null ? dz3Var.b : null;
        if (strD0 == null) {
            List<dz3> list = (List) s.getValue();
            ArrayList arrayList = new ArrayList();
            for (dz3 dz3Var2 : list) {
                String str = a(dz3Var2.a) ? dz3Var2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strD0 = s72.D0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbP = tec.p("DescriptorKindFilter(", strD0, ", ");
        sbP.append(this.a);
        sbP.append(')');
        return sbP.toString();
    }

    public /* synthetic */ ez3(int i2) {
        this(i2, pu4.a);
    }
}
