package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class hwg {
    public static final /* synthetic */ int a = 0;

    static {
        int i = kwg.D0;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = zsg.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static p5h b(z5h z5hVar, int i, tx0 tx0Var, String str, j6h j6hVar) {
        try {
            w5h w5hVarQ = d6h.q();
            int i2 = tx0Var.a;
            w5hVarQ.b();
            d6h.p((d6h) w5hVarQ.b, i2);
            String str2 = tx0Var.c;
            w5hVarQ.b();
            d6h.s((d6h) w5hVarQ.b, str2);
            int i3 = tx0Var.b;
            if (i3 != 0) {
                w5hVarQ.b();
                d6h.u((d6h) w5hVarQ.b, i3);
            }
            if (z5hVar != null) {
                w5hVarQ.b();
                d6h.v((d6h) w5hVarQ.b, z5hVar);
            }
            if (str != null) {
                w5hVarQ.b();
                d6h.r((d6h) w5hVarQ.b, str);
            }
            l5h l5hVarS = p5h.s();
            l5hVarS.c(w5hVarQ);
            l5hVarS.b();
            p5h.r((p5h) l5hVarS.b, i);
            if (!j6hVar.equals(j6h.BROADCAST_ACTION_UNSPECIFIED)) {
                l5hVarS.b();
                p5h.v((p5h) l5hVarS.b, j6hVar);
            }
            return (p5h) l5hVarS.a();
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static v5h c(int i, j6h j6hVar) {
        try {
            t5h t5hVarQ = v5h.q();
            t5hVarQ.b();
            v5h.p((v5h) t5hVarQ.b, i);
            if (!j6hVar.equals(j6h.BROADCAST_ACTION_UNSPECIFIED)) {
                t5hVarQ.b();
                v5h.s((v5h) t5hVarQ.b, j6hVar);
            }
            return (v5h) t5hVarQ.a();
        } catch (Exception e) {
            zsg.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
