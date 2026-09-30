package defpackage;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eah {
    public static final eah c = new eah(w9h.b, u9h.y());
    public final w9h a;
    public final u9h b;

    public eah(w9h w9hVar, u9h u9hVar) {
        w9hVar.getClass();
        this.a = w9hVar;
        this.b = u9hVar;
    }

    public static eah a(amg amgVar, boolean z) throws bng {
        w9h w9hVarA;
        int iC = amgVar.C();
        if (iC > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(iC);
            sb.append(". Current version is: 1");
            throw new bng(sb.toString());
        }
        amgVar.C();
        int iA = amgVar.a(amgVar.A());
        hmg hmgVar = hmg.a;
        int i = slg.a;
        u9h u9hVarX = u9h.x(amgVar, hmg.b);
        amgVar.b(iA);
        vr3 vr3Var = new vr3();
        Inflater inflater = (Inflater) vr3Var.b;
        try {
            if (z) {
                int iA2 = amgVar.a(amgVar.A());
                int iC2 = amgVar.c();
                try {
                    w9hVarA = w9h.a(amg.h(new InflaterInputStream(new e41(vr3Var, amgVar), inflater, iC2 < 0 ? 4096 : Math.min(iC2, 4096)), 4096));
                    inflater.reset();
                    if (amgVar.c() != 0) {
                        throw new bng("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    amgVar.b(iA2);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                inflater.setInput(amgVar.z());
                try {
                    w9hVarA = w9h.a(amg.h(new e41(vr3Var, 2), 4096));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            vr3Var.close();
            return new eah(w9hVarA, u9hVarX);
        } catch (Throwable th3) {
            try {
                vr3Var.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
