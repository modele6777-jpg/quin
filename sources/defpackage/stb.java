package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class stb extends wi1 {
    public final eyf a;
    public final List b;
    public final ud6 c;
    public final yb1 d;

    public stb(eyf eyfVar, List list, ud6 ud6Var, yb1 yb1Var) {
        this.a = eyfVar;
        this.b = list;
        this.c = ud6Var;
        this.d = yb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof stb) {
            stb stbVar = (stb) obj;
            return this.a == stbVar.a && this.b.equals(stbVar.b) && this.c == stbVar.c && this.d == stbVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.d((this.c.hashCode() + tec.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, false);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.a + ", sharedCameraIds=" + this.b + ", graphListener=" + this.c + ", isPrewarm=false, isForegroundObserver=" + this.d + ')';
    }
}
