package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mp7 {
    public final String a;
    public final Map b;

    public mp7(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp7)) {
            return false;
        }
        mp7 mp7Var = (mp7) obj;
        return pa7.t(this.a, mp7Var.a) && this.b.equals(mp7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r2
  0x000a: PHI (r2v8 java.lang.Iterable) = (r2v0 java.lang.Iterable), (r2v0 java.lang.Iterable), (r2v6 java.lang.Iterable) binds: [B:3:0x0008, B:6:0x0018, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() throws IOException {
        Iterable iterable;
        Map map = this.b;
        int size = map.size();
        Iterable iterableH = pu4.a;
        if (size == 0) {
            iterable = iterableH;
        } else {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(map.size());
                    arrayList.add(new iy9(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new iy9(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    iterable = arrayList;
                } else {
                    iterableH = t72.H(new iy9(entry.getKey(), entry.getValue()));
                    iterable = iterableH;
                }
            } else {
                iterable = iterableH;
            }
        }
        return "@" + this.a + '(' + s72.D0(iterable, null, null, null, tj7.X, 31) + ')';
    }
}
