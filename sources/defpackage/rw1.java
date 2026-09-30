package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rw1 {
    public static final qw1 b = new qw1();
    public final Object a;

    public /* synthetic */ rw1(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        pw1 pw1Var = obj instanceof pw1 ? (pw1) obj : null;
        if (pw1Var != null) {
            return pw1Var.a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof qw1) {
            return null;
        }
        return obj;
    }

    public static final void c(Object obj) throws Throwable {
        if (obj instanceof qw1) {
            if (!(obj instanceof pw1)) {
                qc0.p("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                return;
            }
            Throwable th = ((pw1) obj).a;
            if (th != null) {
                throw th;
            }
            qc0.p("Trying to call 'getOrThrow' on a channel closed without a cause");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rw1) {
            return pa7.t(this.a, ((rw1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof pw1) {
            return ((pw1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
