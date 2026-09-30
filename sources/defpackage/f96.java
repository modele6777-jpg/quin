package defpackage;

import java.util.Map;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f96 {
    public final GiftCardSku a;
    public final String b;
    public final String c;
    public final Map d;
    public final e96 e;
    public final GiftCardItem f;
    public final Throwable g;

    public /* synthetic */ f96(Map map, e96 e96Var, IllegalStateException illegalStateException, int i) {
        this(GiftCardSku.OneMonth, "", "", (i & 8) != 0 ? qu4.a : map, (i & 16) != 0 ? b96.a : e96Var, null, (i & 64) != 0 ? null : illegalStateException);
    }

    public static f96 a(f96 f96Var, GiftCardSku giftCardSku, String str, String str2, Map map, e96 e96Var, GiftCardItem giftCardItem, Throwable th, int i) {
        if ((i & 1) != 0) {
            giftCardSku = f96Var.a;
        }
        GiftCardSku giftCardSku2 = giftCardSku;
        if ((i & 2) != 0) {
            str = f96Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = f96Var.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            map = f96Var.d;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            e96Var = f96Var.e;
        }
        e96 e96Var2 = e96Var;
        if ((i & 32) != 0) {
            giftCardItem = f96Var.f;
        }
        GiftCardItem giftCardItem2 = giftCardItem;
        if ((i & 64) != 0) {
            th = f96Var.g;
        }
        f96Var.getClass();
        giftCardSku2.getClass();
        str3.getClass();
        str4.getClass();
        map2.getClass();
        e96Var2.getClass();
        return new f96(giftCardSku2, str3, str4, map2, e96Var2, giftCardItem2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f96)) {
            return false;
        }
        f96 f96Var = (f96) obj;
        return this.a == f96Var.a && pa7.t(this.b, f96Var.b) && pa7.t(this.c, f96Var.c) && pa7.t(this.d, f96Var.d) && pa7.t(this.e, f96Var.e) && pa7.t(this.f, f96Var.f) && pa7.t(this.g, f96Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ib8.c(this.d, ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31;
        GiftCardItem giftCardItem = this.f;
        int iHashCode2 = (iHashCode + (giftCardItem == null ? 0 : giftCardItem.hashCode())) * 31;
        Throwable th = this.g;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "GiftCardPurchaseState(selectedSku=" + this.a + ", nickname=" + this.b + ", blessing=" + this.c + ", products=" + this.d + ", phase=" + this.e + ", issuedCard=" + this.f + ", error=" + this.g + ")";
    }

    public f96(GiftCardSku giftCardSku, String str, String str2, Map map, e96 e96Var, GiftCardItem giftCardItem, Throwable th) {
        giftCardSku.getClass();
        map.getClass();
        e96Var.getClass();
        this.a = giftCardSku;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = e96Var;
        this.f = giftCardItem;
        this.g = th;
    }
}
