package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 {
    public final p31 a;
    public final pl1 b;

    public mm2(p31 p31Var, pl1 pl1Var) {
        this.a = p31Var;
        this.b = pl1Var;
    }

    public final String toString() {
        pl1 pl1Var = this.b;
        wv2 wv2Var = (wv2) pl1Var.e.F0(wv2.c);
        String str = wv2Var != null ? wv2Var.b : null;
        int iHashCode = hashCode();
        tq.o(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + (str != null ? ib8.j("[", str, "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + pl1Var + ")";
    }
}
