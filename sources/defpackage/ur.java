package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ur {
    public final Context a;
    public final sw3 b;
    public final long c;
    public final bx9 d;

    public ur(Context context, sw3 sw3Var, long j, bx9 bx9Var) {
        this.a = context;
        this.b = sw3Var;
        this.c = j;
        this.d = bx9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ur urVar = (ur) obj;
        if (!pa7.t(this.a, urVar.a) || !pa7.t(this.b, urVar.b)) {
            return false;
        }
        long j = urVar.c;
        int i = y72.l;
        return faf.a(this.c, j) && this.d.equals(urVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = y72.l;
        return this.d.hashCode() + ib8.b(iHashCode, 31, this.c);
    }
}
