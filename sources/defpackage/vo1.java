package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vo1 extends j2 implements fp1 {
    public final yn7 b;
    public final wo1 c;
    public final boolean d;

    public vo1(yn7 yn7Var, wo1 wo1Var, boolean z) {
        super(uo1.a);
        this.b = yn7Var;
        this.c = wo1Var;
        this.d = z;
    }

    @Override // defpackage.yn7
    public final List A() {
        return pu4.a;
    }

    @Override // defpackage.yn7
    public final um7 B() {
        return null;
    }

    @Override // defpackage.j2
    public final j2 C(boolean z) {
        return z == this.d ? this : new vo1(this.b, this.c, z);
    }

    @Override // defpackage.j2
    public final j2 F() {
        return null;
    }

    @Override // defpackage.j2
    public final yn7 d() {
        return null;
    }

    @Override // defpackage.j2
    public final boolean equals(Object obj) {
        if (!(obj instanceof vo1)) {
            return false;
        }
        vo1 vo1Var = (vo1) obj;
        return pa7.t(this.b, vo1Var.b) && this.c == vo1Var.c && this.d == vo1Var.d;
    }

    @Override // defpackage.j2
    public final em7 f() {
        return null;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return pu4.a;
    }

    @Override // defpackage.j2
    public final int hashCode() {
        yn7 yn7Var = this.b;
        int iHashCode = yn7Var != null ? yn7Var.hashCode() : 0;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // defpackage.j2
    public final boolean m() {
        return false;
    }

    @Override // defpackage.yn7
    public final boolean o() {
        return this.d;
    }

    @Override // defpackage.j2
    public final boolean t() {
        return false;
    }

    @Override // defpackage.j2
    public final String toString() {
        return this.c.toString();
    }

    @Override // defpackage.j2
    public final boolean u() {
        return false;
    }

    @Override // defpackage.j2
    public final boolean w() {
        return false;
    }

    @Override // defpackage.j2
    public final j2 y() {
        return null;
    }

    @Override // defpackage.j2
    public final j2 z(boolean z) {
        if (!z) {
            return this;
        }
        ho7.m(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }
}
