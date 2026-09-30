package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bod {
    public final TarotSkinIdentify a;
    public final nmd b;
    public final float c;

    public bod(TarotSkinIdentify tarotSkinIdentify, nmd nmdVar, float f) {
        tarotSkinIdentify.getClass();
        this.a = tarotSkinIdentify;
        this.b = nmdVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bod)) {
            return false;
        }
        bod bodVar = (bod) obj;
        return this.a == bodVar.a && this.b == bodVar.b && Float.compare(this.c, bodVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SkinThumbnailItem(skin=" + this.a + ", status=" + this.b + ", downloadProgress=" + this.c + ")";
    }

    public /* synthetic */ bod(TarotSkinIdentify tarotSkinIdentify, nmd nmdVar) {
        this(tarotSkinIdentify, nmdVar, 0.0f);
    }
}
