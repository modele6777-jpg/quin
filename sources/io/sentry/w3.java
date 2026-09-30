package io.sentry;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 {
    public final Serializable a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w3(Boolean bool, Double d, Double d2, Boolean bool2, Double d3) {
        this.a = bool;
        this.b = d;
        this.c = d2;
        this.d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.e = d3;
    }

    public static w3 a(w6 w6Var, c cVar, q6 q6Var) {
        if (q6Var != null) {
            String effectiveOrgId = q6Var.getEffectiveOrgId();
            String strB = cVar.b("sentry-org_id");
            String strTrim = (strB == null || strB.trim().isEmpty()) ? null : strB.trim();
            if ((effectiveOrgId != null && strTrim != null && !effectiveOrgId.equals(strTrim)) || (q6Var.isStrictTraceContinuation() && ((effectiveOrgId != null || strTrim != null) && (effectiveOrgId == null || !effectiveOrgId.equals(strTrim))))) {
                q6Var.getLogger().i(q5.DEBUG, "Not continuing trace due to strict org ID validation failure.", new Object[0]);
                return new w3();
            }
        }
        return new w3(w6Var.a, new g7(), w6Var.b, cVar, w6Var.c);
    }

    public w3(Boolean bool, Double d, Double d2) {
        this(bool, d, d2, Boolean.FALSE, (Double) null);
    }

    public w3(Boolean bool, Double d) {
        this(bool, d, (Double) null, Boolean.FALSE, (Double) null);
    }

    public w3() {
        this(new io.sentry.protocol.w(), new g7(), (g7) null, (c) null, (Boolean) null);
    }

    public w3(io.sentry.protocol.w wVar, g7 g7Var, g7 g7Var2, c cVar, Boolean bool) {
        this.b = wVar;
        this.c = g7Var;
        this.d = g7Var2;
        this.e = io.sentry.util.b.h(cVar, bool, null, null);
        this.a = bool;
    }

    public w3(w3 w3Var) {
        this((io.sentry.protocol.w) w3Var.b, (g7) w3Var.c, (g7) w3Var.d, (c) w3Var.e, (Boolean) w3Var.a);
    }

    public w3(io.sentry.android.core.d0 d0Var) {
        this.b = d0Var;
        this.c = null;
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public w3(io.sentry.android.core.d0 d0Var, byte[] bArr) {
        this.b = d0Var;
        this.c = bArr;
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public w3(io.sentry.android.core.d0 d0Var, byte[] bArr, ArrayList arrayList, ArrayList arrayList2, io.sentry.protocol.c cVar) {
        this.b = d0Var;
        this.c = bArr;
        this.d = arrayList;
        this.a = arrayList2;
        this.e = cVar;
    }
}
