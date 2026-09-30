package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w27 implements z27 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public w27(String str, String str2, String str3, String str4) {
        tec.x(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w27)) {
            return false;
        }
        w27 w27Var = (w27) obj;
        return pa7.t(this.a, w27Var.a) && pa7.t(this.b, w27Var.b) && pa7.t(this.c, w27Var.c) && pa7.t(this.d, w27Var.d);
    }

    public final int hashCode() {
        int iC = ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ks0.m(ib8.o("FollowUpConversation(parentChatId=", this.a, ", triggerMessageId=", this.b, ", prefilledQuestion="), this.c, ", childChatId=", this.d, ")");
    }
}
