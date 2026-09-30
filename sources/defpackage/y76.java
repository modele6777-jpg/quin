package defpackage;

import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y76 {
    public final GiftCardItem a;
    public final GiftCardItem b;
    public final boolean c;

    public y76(GiftCardItem giftCardItem, GiftCardItem giftCardItem2, boolean z) {
        this.a = giftCardItem;
        this.b = giftCardItem2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y76)) {
            return false;
        }
        y76 y76Var = (y76) obj;
        return pa7.t(this.a, y76Var.a) && pa7.t(this.b, y76Var.b) && this.c == y76Var.c;
    }

    public final int hashCode() {
        GiftCardItem giftCardItem = this.a;
        int iHashCode = (giftCardItem == null ? 0 : giftCardItem.hashCode()) * 31;
        GiftCardItem giftCardItem2 = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (giftCardItem2 != null ? giftCardItem2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftCardDetail(sent=");
        sb.append(this.a);
        sb.append(", received=");
        sb.append(this.b);
        sb.append(", issuing=");
        return ub3.m(sb, this.c, ")");
    }
}
