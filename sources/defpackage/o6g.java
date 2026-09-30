package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o6g implements v6g {
    public final int a;
    public final int b;

    public o6g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6g)) {
            return false;
        }
        o6g o6gVar = (o6g) obj;
        return this.a == o6gVar.a && this.b == o6gVar.b;
    }

    @Override // defpackage.v6g
    public final String getType() {
        return "qd_card_selected";
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.h(this.a, this.b, "QuickDecisionCardSelected(appWidgetId=", ", position=", ")");
    }
}
