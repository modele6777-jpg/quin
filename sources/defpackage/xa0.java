package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xa0 {
    public static final ace a = new ace(new p10(22));

    public static void a() {
        wa0 wa0Var = (wa0) a.getValue();
        h48 h48Var = wa0Var.a;
        if (wa0Var.c.compareAndSet(false, true)) {
            h48Var.a(wa0Var);
        }
        if (((a58) h48Var).i.compareTo(g48.d) < 0 || !wa0Var.d.compareAndSet(false, true)) {
            return;
        }
        wa0Var.b.invoke();
    }
}
