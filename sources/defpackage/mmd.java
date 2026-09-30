package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mmd {
    public final TarotSkinIdentify a;
    public final n07 b;
    public final boolean c;
    public final gmd d;
    public final float e;

    static {
        new mmd(r8c.d(), null, true, gmd.a, 0.0f);
    }

    public mmd(TarotSkinIdentify tarotSkinIdentify, n07 n07Var, boolean z, gmd gmdVar, float f) {
        tarotSkinIdentify.getClass();
        gmdVar.getClass();
        this.a = tarotSkinIdentify;
        this.b = n07Var;
        this.c = z;
        this.d = gmdVar;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmd)) {
            return false;
        }
        mmd mmdVar = (mmd) obj;
        return this.a == mmdVar.a && pa7.t(this.b, mmdVar.b) && this.c == mmdVar.c && this.d == mmdVar.d && Float.compare(this.e, mmdVar.e) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        n07 n07Var = this.b;
        return Float.hashCode(this.e) + ((this.d.hashCode() + ub3.d((iHashCode + (n07Var == null ? 0 : n07Var.hashCode())) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "SkinInformation(id=" + this.a + ", product=" + this.b + ", purchased=" + this.c + ", downloadState=" + this.d + ", downloadProgress=" + this.e + ")";
    }
}
