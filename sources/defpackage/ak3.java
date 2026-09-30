package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ak3 implements bk3 {
    public final TarotSkinIdentify a;
    public final boolean b;
    public final gmd c;
    public final float d;

    public ak3(TarotSkinIdentify tarotSkinIdentify, gmd gmdVar, float f, int i) {
        boolean z = (i & 2) == 0;
        gmdVar = (i & 4) != 0 ? gmd.a : gmdVar;
        f = (i & 8) != 0 ? 0.0f : f;
        this.a = tarotSkinIdentify;
        this.b = z;
        this.c = gmdVar;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak3)) {
            return false;
        }
        ak3 ak3Var = (ak3) obj;
        return this.a == ak3Var.a && this.b == ak3Var.b && this.c == ak3Var.c && Float.compare(this.d, ak3Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + ub3.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "Skin(id=" + this.a + ", isLocked=" + this.b + ", downloadState=" + this.c + ", downloadProgress=" + this.d + ")";
    }
}
