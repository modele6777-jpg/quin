package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tw7 implements rz7 {
    public final jx7 a;
    public final sw7 b;
    public final os c;

    public tw7(jx7 jx7Var, sw7 sw7Var, os osVar) {
        this.a = jx7Var;
        this.b = sw7Var;
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
    public final Object c(int i) {
        return this.b.z(i);
    }

    @Override // defpackage.rz7
    public final void d(int i, Object obj, l46 l46Var, int i2) {
        l46Var.h0(1493551140);
        int i3 = (l46Var.e(i) ? 4 : 2) | i2 | (l46Var.i(obj) ? 32 : 16) | (l46Var.g(this) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            oa7.g(obj, i, this.a.q, af1.b0(726189336, new st5(this, i, 3), l46Var), l46Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(this, i, obj, i2, 27);
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
        if (!(obj instanceof tw7)) {
            return false;
        }
        return pa7.t(this.b, ((tw7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
