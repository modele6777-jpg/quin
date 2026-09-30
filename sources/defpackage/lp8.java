package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lp8 {
    public final Uri a;
    public final String b;
    public final List c;
    public final jy6 d;
    public final long e;

    static {
        kv2.v(0, 1, 2, 3, 4);
        pqf.D(5);
        pqf.D(6);
        pqf.D(7);
    }

    public lp8(Uri uri, String str, vd0 vd0Var, List list, jy6 jy6Var, long j) {
        this.a = uri;
        this.b = qv8.l(str);
        this.c = list;
        this.d = jy6Var;
        dy6 dy6VarM = jy6.m();
        for (int i = 0; i < jy6Var.size(); i++) {
            ((np8) jy6Var.get(i)).getClass();
            dy6VarM.b(new np8());
        }
        dy6VarM.g();
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp8)) {
            return false;
        }
        lp8 lp8Var = (lp8) obj;
        return this.a.equals(lp8Var.a) && Objects.equals(this.b, lp8Var.b) && Objects.equals(null, null) && this.c.equals(lp8Var.c) && this.d.equals(lp8Var.d) && this.e == lp8Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (int) ((((long) ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.e);
    }
}
