package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class age {
    public final TarotSkinIdentify a;
    public final float b;
    public final float c;
    public final boolean d;

    public age(TarotSkinIdentify tarotSkinIdentify, float f, float f2, boolean z) {
        this.a = tarotSkinIdentify;
        this.b = f;
        this.c = f2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof age)) {
            return false;
        }
        age ageVar = (age) obj;
        return this.a == ageVar.a && Float.compare(0.0f, 0.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.b, ageVar.b) == 0 && Float.compare(this.c, ageVar.c) == 0 && this.d == ageVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.a(this.c, ub3.a(this.b, ub3.a(1.0f, ub3.a(1.0f, ub3.a(0.0f, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TarotBoxItem(skin=" + this.a + ", offsetX=0.0, scale=1.0, dim=1.0, rotationX=" + this.b + ", rotationY=" + this.c + ", locked=" + this.d + ")";
    }
}
