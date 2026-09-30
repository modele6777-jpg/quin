package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pmd implements rmd {
    public final TarotSkinIdentify a;

    public pmd(TarotSkinIdentify tarotSkinIdentify) {
        this.a = tarotSkinIdentify;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pmd) && this.a == ((pmd) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnItemClick(tarotSkinIdentify=" + this.a + ")";
    }
}
