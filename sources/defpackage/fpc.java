package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fpc {
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    public fpc(String str, List list, List list2, List list3) {
        list2.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpc)) {
            return false;
        }
        fpc fpcVar = (fpc) obj;
        return this.a.equals(fpcVar.a) && this.b.equals(fpcVar.b) && pa7.t(this.c, fpcVar.c) && this.d.equals(fpcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tec.a(tec.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SeasonalReadingUi(summary=" + this.a + ", cards=" + this.b + ", guides=" + this.c + ", followUps=" + this.d + ")";
    }
}
