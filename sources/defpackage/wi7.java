package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wi7 implements xn7 {
    public static final wi7 a = new wi7();
    public static final vi7 b = vi7.b;

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ti7 ti7Var = (ti7) obj;
        ti7Var.getClass();
        vd0.K(ev4Var);
        t72.m(p4e.a, qh7.a).a(ev4Var, ti7Var);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        vd0.J(om3Var);
        return new ti7((Map) t72.m(p4e.a, qh7.a).c(om3Var));
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
