package defpackage;

import tech.chatmind.api.credits.GuestPassPendingGrant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pua implements yua {
    public final String a;
    public final GuestPassPendingGrant b;
    public final int c;
    public final int d;
    public final boolean e;
    public final String f;

    static {
        wf6 wf6Var = GuestPassPendingGrant.Companion;
    }

    public pua(String str, GuestPassPendingGrant guestPassPendingGrant, int i, int i2, boolean z, String str2) {
        str.getClass();
        guestPassPendingGrant.getClass();
        this.a = str;
        this.b = guestPassPendingGrant;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pua)) {
            return false;
        }
        pua puaVar = (pua) obj;
        return pa7.t(this.a, puaVar.a) && pa7.t(this.b, puaVar.b) && this.c == puaVar.c && this.d == puaVar.d && this.e == puaVar.e && pa7.t(this.f, puaVar.f);
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.b(this.d, ub3.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendCouponGrant(accountId=");
        sb.append(this.a);
        sb.append(", grant=");
        sb.append(this.b);
        sb.append(", creditsPerPass=");
        ub3.u(sb, this.c, ", validDays=", this.d, ", afterPurchase=");
        sb.append(this.e);
        sb.append(", noticeAccountId=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ pua(String str, GuestPassPendingGrant guestPassPendingGrant, int i, int i2, String str2, int i3) {
        this(str, guestPassPendingGrant, i, i2, false, (i3 & 32) != 0 ? null : str2);
    }
}
