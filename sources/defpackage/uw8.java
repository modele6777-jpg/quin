package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uw8 {
    public final Set a;
    public final Set b;
    public final Set c;

    public uw8(Set set, Set set2, Set set3) {
        set3.getClass();
        this.a = set;
        this.b = set2;
        this.c = set3;
    }

    public final LinkedHashSet a() {
        return s72.A0(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw8)) {
            return false;
        }
        uw8 uw8Var = (uw8) obj;
        return this.a.equals(uw8Var.a) && this.b.equals(uw8Var.b) && pa7.t(this.c, uw8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MixedDeckPool(participating=" + this.a + ", unlocked=" + this.b + ", darkBacks=" + this.c + ")";
    }
}
