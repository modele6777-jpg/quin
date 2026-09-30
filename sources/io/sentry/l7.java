package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l7 {
    public final q6 a;

    public l7(q6 q6Var) {
        this.a = q6Var;
    }

    public final w3 a(io.sentry.internal.debugmeta.c cVar) {
        Double d = (Double) cVar.c;
        m7 m7Var = (m7) cVar.b;
        w3 w3Var = m7Var.d;
        if (w3Var != null) {
            return io.sentry.util.b.b(w3Var);
        }
        q6 q6Var = this.a;
        q6Var.getProfilesSampler();
        Double profilesSampleRate = q6Var.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue());
        q6Var.getTracesSampler();
        w3 w3Var2 = m7Var.G0;
        if (w3Var2 != null) {
            return io.sentry.util.b.b(w3Var2);
        }
        Double tracesSampleRate = q6Var.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, q6Var.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new w3(Boolean.valueOf(dValueOf.doubleValue() >= d.doubleValue()), dValueOf, d, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new w3(bool, (Double) null, d, bool, (Double) null);
    }

    public final boolean b(double d) {
        Double profileSessionSampleRate = this.a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= d;
    }
}
