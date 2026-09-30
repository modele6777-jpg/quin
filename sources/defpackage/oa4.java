package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oa4 extends i09 implements pn4 {
    public oz7 Z;

    @Override // defpackage.i09
    public final void d1() {
        this.Z.j = this;
    }

    @Override // defpackage.i09
    public final void e1() {
        oz7 oz7Var = this.Z;
        oz7Var.e();
        oz7Var.b = null;
        oz7Var.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oa4) && pa7.t(this.Z, ((oa4) obj).Z);
    }

    public final int hashCode() {
        return this.Z.hashCode();
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        ArrayList arrayList = this.Z.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kz7 kz7Var = (kz7) arrayList.get(i);
            ke6 ke6Var = kz7Var.o;
            if (ke6Var != null) {
                long j = kz7Var.m;
                long j2 = ke6Var.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                xl1 xl1Var = ((vv7) im2Var).a;
                ((vd9) xl1Var.b.c).I(f, f2);
                try {
                    i7h.r(im2Var, ke6Var);
                    ((vd9) xl1Var.b.c).I(-f, -f2);
                } catch (Throwable th) {
                    ((vd9) xl1Var.b.c).I(-f, -f2);
                    throw th;
                }
            }
        }
        ((vv7) im2Var).a();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.Z + ")";
    }
}
