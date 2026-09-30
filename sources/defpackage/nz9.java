package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class nz9 {
    public final List a;
    public int b;

    public nz9(int i, ArrayList arrayList) {
        this.a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004b A[RETURN] */
    public Object a(em7 em7Var) {
        em7Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Object obj = list.get(this.b);
        if (!em7Var.D(obj)) {
            obj = null;
        }
        if (obj == null) {
            obj = null;
        }
        if (obj != null && this.b < list.size() - 1) {
            this.b++;
        }
        if (obj != null) {
            return obj;
        }
        for (Object obj2 : list) {
            if (em7Var.D(obj2)) {
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nz9) {
            return this.a.equals(((nz9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + s72.j1(this.a);
    }
}
