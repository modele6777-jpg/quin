package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r2g implements Serializable {
    private final List<v2g> days;

    public r2g(ArrayList arrayList) {
        this.days = arrayList;
    }

    public final List a() {
        return this.days;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r2g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r2g r2gVar = (r2g) obj;
        return pa7.t(s72.v0(this.days), s72.v0(r2gVar.days)) && pa7.t(s72.F0(this.days), s72.F0(r2gVar.days));
    }

    public final int hashCode() {
        return ((v2g) s72.F0(this.days)).hashCode() + (((v2g) s72.v0(this.days)).hashCode() * 31);
    }

    public final String toString() {
        return "Week { first = " + s72.v0(this.days) + ", last = " + s72.F0(this.days) + " } ";
    }
}
