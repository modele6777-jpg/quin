package defpackage;

import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bt0 implements dt0 {
    public final TarotCardType a;
    public final int b;
    public final int c;
    public final boolean d;

    public bt0(TarotCardType tarotCardType, int i, int i2, boolean z) {
        tarotCardType.getClass();
        this.a = tarotCardType;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt0)) {
            return false;
        }
        bt0 bt0Var = (bt0) obj;
        return this.a == bt0Var.a && this.b == bt0Var.b && this.c == bt0Var.c && this.d == bt0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.b(this.c, ub3.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Drawn(card=" + this.a + ", index=" + this.b + ", choices=" + this.c + ", finished=" + this.d + ")";
    }
}
