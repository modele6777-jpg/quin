package defpackage;

import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zhe {
    public final TarotCardType a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public zhe(TarotCardType tarotCardType, int i, boolean z, boolean z2) {
        tarotCardType.getClass();
        this.a = tarotCardType;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static zhe a(zhe zheVar, int i, boolean z, boolean z2, int i2) {
        TarotCardType tarotCardType = zheVar.a;
        if ((i2 & 4) != 0) {
            z = zheVar.c;
        }
        tarotCardType.getClass();
        return new zhe(tarotCardType, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhe)) {
            return false;
        }
        zhe zheVar = (zhe) obj;
        return this.a == zheVar.a && this.b == zheVar.b && this.c == zheVar.c && this.d == zheVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.d(ub3.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "TarotCardItem(cardType=" + this.a + ", index=" + this.b + ", isReversed=" + this.c + ", isOccupied=" + this.d + ")";
    }
}
