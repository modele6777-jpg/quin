package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rc5 {
    public final String a;
    public final Map b;

    public rc5(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static rc5 a(String str) {
        return new rc5(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc5)) {
            return false;
        }
        rc5 rc5Var = (rc5) obj;
        return this.a.equals(rc5Var.a) && this.b.equals(rc5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
