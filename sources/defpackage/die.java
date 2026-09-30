package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class die {
    public final TarotSkinIdentify a;
    public final sp1 b;

    public die(TarotSkinIdentify tarotSkinIdentify, sp1 sp1Var) {
        tarotSkinIdentify.getClass();
        sp1Var.getClass();
        this.a = tarotSkinIdentify;
        this.b = sp1Var;
    }

    public static die a(die dieVar, TarotSkinIdentify tarotSkinIdentify) {
        sp1 sp1Var = dieVar.b;
        dieVar.getClass();
        tarotSkinIdentify.getClass();
        sp1Var.getClass();
        return new die(tarotSkinIdentify, sp1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof die)) {
            return false;
        }
        die dieVar = (die) obj;
        return this.a == dieVar.a && this.b == dieVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TarotCardSkinProvider(skin=" + this.a + ", cardCover=" + this.b + ")";
    }
}
