package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n0a {
    public final List a;
    public final List b;

    public n0a(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(s72.D0(this.a, ", ", null, null, null, 62));
        sb.append('(');
        return ub3.l(sb, s72.D0(this.b, ";", null, null, null, 62), ')');
    }
}
