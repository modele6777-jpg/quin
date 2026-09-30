package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 {
    public final rr5 a;
    public final cy6 b;
    public final gye c;
    public final zp8 d;

    public nk0(szc szcVar) {
        this.a = (rr5) szcVar.b;
        this.b = (cy6) szcVar.c;
        this.c = (gye) szcVar.d;
        this.d = (zp8) szcVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk0)) {
            return false;
        }
        nk0 nk0Var = (nk0) obj;
        return this.a.equals(nk0Var.a) && Objects.equals(this.b, nk0Var.b) && this.c.equals(nk0Var.c) && Objects.equals(this.d, nk0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        cy6 cy6Var = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (cy6Var == null ? 0 : cy6Var.hashCode())) * 31)) * 31;
        zp8 zp8Var = this.d;
        return iHashCode2 + (zp8Var != null ? zp8Var.hashCode() : 0);
    }
}
