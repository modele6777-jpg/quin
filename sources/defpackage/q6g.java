package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q6g implements v6g {
    public final int a;

    public q6g(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6g) && this.a == ((q6g) obj).a;
    }

    @Override // defpackage.v6g
    public final String getType() {
        return "qd_draw";
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return tec.f(this.a, "QuickDecisionDraw(appWidgetId=", ")");
    }
}
