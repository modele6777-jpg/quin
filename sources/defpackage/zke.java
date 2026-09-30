package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zke {
    public final List a;
    public final List b;

    public zke(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zke)) {
            return false;
        }
        zke zkeVar = (zke) obj;
        return pa7.t(this.a, zkeVar.a) && pa7.t(this.b, zkeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TarotSkinShareUiState(purchasedSkins=" + this.a + ", skins=" + this.b + ")";
    }
}
