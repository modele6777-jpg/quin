package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pdh {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final Context a;
    public final u8e b;
    public final u8e c;
    public final u8e d;
    public final u8e e;
    public final u8e f;
    public final Uri g;
    public volatile jah h;
    public final Uri i;

    public pdh(Context context, u8e u8eVar, u8e u8eVar2, u8e u8eVar3) {
        this.a = context;
        this.c = u8eVar;
        this.b = u8eVar3;
        this.d = u8eVar2;
        Pattern pattern = ceh.a;
        hbc hbcVar = new hbc(context, 17);
        hbcVar.V0("phenotype_storage_info");
        hbcVar.W0("storage-info.pb");
        this.g = hbcVar.X0();
        hbc hbcVar2 = new hbc(context, 17);
        hbcVar2.V0("phenotype_storage_info");
        hbcVar2.W0("device-encrypted-storage-info.pb");
        Set set = ceh.d;
        arb.o(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        hbcVar2.b = "directboot-files";
        this.i = hbcVar2.X0();
        int i = 1;
        this.e = vtb.r(new k8h(i, this));
        this.f = vtb.r(new p8h(u8eVar, i));
    }

    public final void a() {
        if (!i7h.O(this.a) || c().v() + 86400000 >= System.currentTimeMillis()) {
            ux6 ux6Var = ux6.b;
            return;
        }
        i39 i39Var = (i39) this.c.get();
        i39Var.getClass();
        m88 m88VarA0 = pa7.a0((m88) this.f.get());
        int i = in5.v;
        i5.r(m88VarA0 instanceof in5 ? (in5) m88VarA0 : new es5(m88VarA0), new xbh(2, this), i39Var);
    }

    public final fdh b() {
        jah jahVarC = c();
        return new fdh(jahVarC.t(), jy6.o(jahVarC.y()), jahVarC.s(), jahVarC.u(), (jahVarC.z() && jahVarC.A().s() == ((long) Build.VERSION.SDK_INT)) ? jahVarC.A().r() : "", jy6.o(jahVarC.w()), jy6.o(jahVarC.x()), jahVarC.r(), jahVarC.C(), jahVarC.B(), jahVarC.D());
    }

    public final jah c() {
        jah jahVarF;
        jah jahVar = this.h;
        if (jahVar != null) {
            return jahVar;
        }
        synchronized (j) {
            jahVarF = this.h;
            if (jahVarF == null) {
                jahVarF = jah.F();
                if (i7h.O(this.a)) {
                    tng tngVar = (tng) jahVarF.q(7);
                    hmg hmgVar = hmg.a;
                    int i = slg.a;
                    hmg hmgVar2 = hmg.b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamO = drb.o(((xdh) this.d.get()).b(this.g));
                        try {
                            omg omgVarA = ((nmg) tngVar).a(inputStreamO, hmgVar2);
                            if (inputStreamO != null) {
                                inputStreamO.close();
                            }
                            jah jahVar2 = (jah) omgVarA;
                            StrictMode.setThreadPolicy(threadPolicy);
                            jahVarF = jahVar2;
                            this.h = jahVarF;
                        } catch (Throwable th) {
                            if (inputStreamO != null) {
                                try {
                                    inputStreamO.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                }
            }
        }
        return jahVarF;
    }
}
