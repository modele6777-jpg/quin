package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cod {
    public final TarotSkinIdentify a;
    public final omd b;
    public final float c;

    public cod(TarotSkinIdentify tarotSkinIdentify, omd omdVar, float f) {
        tarotSkinIdentify.getClass();
        this.a = tarotSkinIdentify;
        this.b = omdVar;
        this.c = f;
    }

    public static cod a(cod codVar, omd omdVar) {
        TarotSkinIdentify tarotSkinIdentify = codVar.a;
        float f = codVar.c;
        tarotSkinIdentify.getClass();
        return new cod(tarotSkinIdentify, omdVar, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cod)) {
            return false;
        }
        cod codVar = (cod) obj;
        return this.a == codVar.a && this.b == codVar.b && Float.compare(this.c, codVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SkinThumbnailItem(skin=" + this.a + ", status=" + this.b + ", downloadProgress=" + this.c + ")";
    }

    public /* synthetic */ cod(TarotSkinIdentify tarotSkinIdentify, omd omdVar) {
        this(tarotSkinIdentify, omdVar, 0.0f);
    }
}
