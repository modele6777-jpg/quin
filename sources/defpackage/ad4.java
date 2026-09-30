package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ad4 implements dd4 {
    public final zc4 a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;

    public ad4(zc4 zc4Var, List list, String str, String str2, String str3) {
        zc4Var.getClass();
        list.getClass();
        this.a = zc4Var;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad4)) {
            return false;
        }
        ad4 ad4Var = (ad4) obj;
        return pa7.t(this.a, ad4Var.a) && pa7.t(this.b, ad4Var.b) && pa7.t(this.c, ad4Var.c) && pa7.t(this.d, ad4Var.d) && pa7.t(this.e, ad4Var.e);
    }

    public final int hashCode() {
        int iA = tec.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardsDecided(analysis=");
        sb.append(this.a);
        sb.append(", cards=");
        sb.append(this.b);
        sb.append(", postDrawAdditionalInfo=");
        ub3.v(sb, this.c, ", postDrawAudioChatId=", this.d, ", postDrawAudioAssetId=");
        return ks0.l(sb, this.e, ")");
    }
}
