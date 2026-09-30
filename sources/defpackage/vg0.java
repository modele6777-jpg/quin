package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vg0 {
    public static final vg0 a = new vg0();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof sw6) || !(obj2 instanceof sw6)) {
            return pa7.t(obj, obj2);
        }
        sw6 sw6Var = (sw6) obj;
        sw6 sw6Var2 = (sw6) obj2;
        return pa7.t(sw6Var.a, sw6Var2.a) && sw6Var.b.equals(sw6Var2.b) && sw6Var.d.equals(sw6Var2.d) && pa7.t(sw6Var.o, sw6Var2.o) && sw6Var.p == sw6Var2.p && sw6Var.q == sw6Var2.q;
    }

    public final int b(Object obj) {
        if (!(obj instanceof sw6)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        sw6 sw6Var = (sw6) obj;
        return sw6Var.q.hashCode() + ((sw6Var.p.hashCode() + ((sw6Var.o.hashCode() + ib8.c(sw6Var.d, (sw6Var.b.hashCode() + (sw6Var.a.hashCode() * 31)) * 961, 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
