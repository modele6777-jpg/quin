package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u33 {
    public final long a;
    public final TarotSkinIdentify b;
    public final w33 c;

    public u33(long j, TarotSkinIdentify tarotSkinIdentify, w33 w33Var) {
        tarotSkinIdentify.getClass();
        this.a = j;
        this.b = tarotSkinIdentify;
        this.c = w33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u33)) {
            return false;
        }
        u33 u33Var = (u33) obj;
        return this.a == u33Var.a && this.b == u33Var.b && this.c == u33Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DailyCardPickerNavigationResult(id=" + this.a + ", skin=" + this.b + ", trigger=" + this.c + ")";
    }
}
