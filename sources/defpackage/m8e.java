package defpackage;

import tech.chatmind.api.RedeemPopup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m8e extends n8e {
    public final RedeemPopup a;
    public final String b;
    public final qlb c;

    public m8e(RedeemPopup redeemPopup, String str, qlb qlbVar) {
        str.getClass();
        this.a = redeemPopup;
        this.b = str;
        this.c = qlbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8e)) {
            return false;
        }
        m8e m8eVar = (m8e) obj;
        return this.a.equals(m8eVar.a) && pa7.t(this.b, m8eVar.b) && pa7.t(this.c, m8eVar.c);
    }

    public final int hashCode() {
        int iC = ub3.c(this.a.hashCode() * 31, 31, this.b);
        qlb qlbVar = this.c;
        return iC + (qlbVar == null ? 0 : qlbVar.hashCode());
    }

    public final String toString() {
        return "RedeemPopup(popup=" + this.a + ", type=" + this.b + ", destination=" + this.c + ")";
    }
}
