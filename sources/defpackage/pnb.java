package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pnb extends jnb implements td7 {
    public final dx5 a;

    public pnb(dx5 dx5Var) {
        dx5Var.getClass();
        this.a = dx5Var;
    }

    @Override // defpackage.td7
    public final tmb a(dx5 dx5Var) {
        dx5Var.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pnb) {
            return pa7.t(this.a, ((pnb) obj).a);
        }
        return false;
    }

    @Override // defpackage.td7
    public final Collection getAnnotations() {
        return pu4.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return pnb.class.getName() + ": " + this.a;
    }
}
