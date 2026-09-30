package defpackage;

import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wua implements yua {
    public final String a;
    public final UserPopupEvent b;
    public final String c;

    static {
        zmf zmfVar = UserPopupEvent.Companion;
    }

    public wua(String str, UserPopupEvent userPopupEvent) {
        str.getClass();
        userPopupEvent.getClass();
        this.a = str;
        this.b = userPopupEvent;
        this.c = ub3.j(str, ":", db6.N(userPopupEvent));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wua)) {
            return false;
        }
        wua wuaVar = (wua) obj;
        return pa7.t(this.a, wuaVar.a) && pa7.t(this.b, wuaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WeekendFreeCredit(accountId=" + this.a + ", data=" + this.b + ")";
    }
}
