package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xp3 implements aq3 {
    public final boolean a;
    public final String b;

    public xp3(boolean z, String str) {
        str.getClass();
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.aq3
    public final ya2 a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp3)) {
            return false;
        }
        xp3 xp3Var = (xp3) obj;
        return this.a == xp3Var.a && pa7.t(this.b, xp3Var.b);
    }

    public final int hashCode() {
        return ub3.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Feedback(hasFeedback=" + this.a + ", chatId=" + this.b + ", completion=null)";
    }
}
