package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mhe {
    public final TarotSkinIdentify a;
    public final boolean b;

    public mhe(TarotSkinIdentify tarotSkinIdentify, boolean z) {
        tarotSkinIdentify.getClass();
        this.a = tarotSkinIdentify;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhe)) {
            return false;
        }
        mhe mheVar = (mhe) obj;
        return this.a == mheVar.a && this.b == mheVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TarotBoxThumbnailRequest(skin=" + this.a + ", locked=" + this.b + ")";
    }
}
