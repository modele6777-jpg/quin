package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hib {
    public final Context a;
    public final qw6 b;
    public final lw7 c;
    public final lw7 d;
    public final lw7 e;
    public final l81 f;
    public final ec2 g;

    public hib(Context context, qw6 qw6Var, lw7 lw7Var, lw7 lw7Var2, lw7 lw7Var3, l81 l81Var, ec2 ec2Var) {
        this.a = context;
        this.b = qw6Var;
        this.c = lw7Var;
        this.d = lw7Var2;
        this.e = lw7Var3;
        this.f = l81Var;
        this.g = ec2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hib) {
            hib hibVar = (hib) obj;
            return pa7.t(this.a, hibVar.a) && this.b.equals(hibVar.b) && this.c.equals(hibVar.c) && this.d.equals(hibVar.d) && this.e.equals(hibVar.e) && this.f.equals(hibVar.f) && this.g == hibVar.g;
        }
        return false;
    }

    public final int hashCode() {
        return (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + this.f + ", componentRegistry=" + this.g + ", logger=null)";
    }
}
