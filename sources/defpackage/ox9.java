package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ox9 implements rz7 {
    public final yx9 a;
    public final qn4 b;
    public final os c;

    public ox9(yx9 yx9Var, nx9 nx9Var, os osVar) {
        this.a = yx9Var;
        this.b = nx9Var;
        this.c = osVar;
    }

    @Override // defpackage.rz7
    public final int a() {
        return this.b.D().b;
    }

    @Override // defpackage.rz7
    public final Object b(int i) {
        Object objI = this.c.i(i);
        return objI == null ? this.b.E(i) : objI;
    }

    @Override // defpackage.rz7
    public final void d(int i, Object obj, l46 l46Var, int i2) {
        int i3;
        Object obj2;
        l46 l46Var2;
        l46Var.h0(-1201380429);
        int i4 = (l46Var.e(i) ? 4 : 2) | i2 | (l46Var.i(obj) ? 32 : 16) | (l46Var.g(this) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            l46Var2 = l46Var;
            oa7.g(obj2, i3, this.a.z, af1.b0(1142237095, new st5(this, i, 5), l46Var), l46Var2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(this, i3, obj2, i2);
        }
    }

    @Override // defpackage.rz7
    public final int e(Object obj) {
        return this.c.h(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox9)) {
            return false;
        }
        return pa7.t(this.b, ((ox9) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
