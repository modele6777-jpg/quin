package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m7 extends e7 {
    public static final io.sentry.protocol.h0 H0 = io.sentry.protocol.h0.CUSTOM;
    public String E0;
    public io.sentry.protocol.h0 F0;
    public final w3 G0;

    public m7(String str, io.sentry.protocol.h0 h0Var, String str2, w3 w3Var) {
        super(new io.sentry.protocol.w(), new g7(), str2, null);
        this.E0 = str;
        this.F0 = h0Var;
        a(w3Var);
        this.X = io.sentry.util.b.h(null, w3Var == null ? null : (Boolean) w3Var.a, w3Var == null ? null : (Double) w3Var.b, w3Var == null ? null : (Double) w3Var.c);
    }

    public static m7 b(w3 w3Var) {
        w3 w3Var2;
        Boolean bool = (Boolean) w3Var.a;
        c cVar = (c) w3Var.e;
        Double d = cVar.c;
        if (bool == null) {
            w3Var2 = null;
        } else {
            Double d2 = cVar.d;
            w3Var2 = new w3(bool, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
        }
        return new m7((io.sentry.protocol.w) w3Var.b, (g7) w3Var.c, (g7) w3Var.d, w3Var2, cVar);
    }

    public m7(io.sentry.protocol.w wVar, g7 g7Var, g7 g7Var2, w3 w3Var, c cVar) {
        super(wVar, g7Var, "default", g7Var2);
        this.E0 = "<unlabeled transaction>";
        this.G0 = w3Var;
        this.F0 = H0;
        this.X = io.sentry.util.b.h(cVar, w3Var == null ? null : (Boolean) w3Var.a, w3Var == null ? null : (Double) w3Var.b, w3Var != null ? (Double) w3Var.c : null);
    }
}
