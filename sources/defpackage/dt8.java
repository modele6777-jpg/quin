package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dt8 implements ot8 {
    public final String a;
    public final List b;

    public dt8(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt8)) {
            return false;
        }
        dt8 dt8Var = (dt8) obj;
        return pa7.t(this.a, dt8Var.a) && pa7.t(this.b, dt8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardChoices(question=" + this.a + ", cards=" + this.b + ")";
    }
}
