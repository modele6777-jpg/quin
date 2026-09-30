package defpackage;

import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xmf {
    public final String a;
    public final UserPopupEvent b;
    public final boolean c;

    public xmf(String str, UserPopupEvent userPopupEvent, boolean z) {
        this.a = str;
        this.b = userPopupEvent;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmf)) {
            return false;
        }
        xmf xmfVar = (xmf) obj;
        return pa7.t(this.a, xmfVar.a) && pa7.t(this.b, xmfVar.b) && this.c == xmfVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserPopupEvent userPopupEvent = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (userPopupEvent != null ? userPopupEvent.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserPopupEvaluation(accountId=");
        sb.append(this.a);
        sb.append(", popup=");
        sb.append(this.b);
        sb.append(", stateKnown=");
        return ub3.m(sb, this.c, ")");
    }
}
