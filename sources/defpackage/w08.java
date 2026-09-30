package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w08 implements rz7 {
    public final j18 a;
    public final v08 b;
    public final mx7 c;
    public final os d;

    public w08(j18 j18Var, v08 v08Var, mx7 mx7Var, os osVar) {
        this.a = j18Var;
        this.b = v08Var;
        this.c = mx7Var;
        this.d = osVar;
    }

    @Override // defpackage.rz7
    public final int a() {
        return this.b.D().b;
    }

    @Override // defpackage.rz7
    public final Object b(int i) {
        Object objI = this.d.i(i);
        return objI == null ? this.b.E(i) : objI;
    }

    @Override // defpackage.rz7
    public final Object c(int i) {
        return this.b.z(i);
    }

    @Override // defpackage.rz7
    public final void d(int i, Object obj, l46 l46Var, int i2) {
        l46Var.h0(-462424778);
        int i3 = 4;
        int i4 = (l46Var.e(i) ? 4 : 2) | i2 | (l46Var.i(obj) ? 32 : 16) | (l46Var.g(this) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            oa7.g(obj, i, this.a.s, af1.b0(-824725566, new st5(this, i, i3), l46Var), l46Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(this, i, obj, i2, 29);
        }
    }

    @Override // defpackage.rz7
    public final int e(Object obj) {
        return this.d.h(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w08)) {
            return false;
        }
        return pa7.t(this.b, ((w08) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
