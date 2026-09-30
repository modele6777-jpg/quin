package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nmg implements tng {
    public final omg a;

    static {
        hmg hmgVar = hmg.a;
        int i = slg.a;
    }

    public nmg(omg omgVar) {
        this.a = omgVar;
    }

    public final omg a(InputStream inputStream, hmg hmgVar) throws bng {
        amg amgVarH = amg.h(inputStream, 4096);
        int i = omg.zzd;
        omg omgVarG = this.a.g();
        try {
            yng yngVarA = vng.c.a(omgVarG.getClass());
            k01 k01Var = amgVarH.c;
            if (k01Var == null) {
                k01Var = new k01(amgVarH);
            }
            yngVarA.g(omgVarG, k01Var, hmgVar);
            yngVarA.c(omgVarG);
            amgVarH.m(0);
            if (omg.o(omgVarG, true)) {
                return omgVarG;
            }
            throw new cog().a();
        } catch (bng e) {
            if (e.b()) {
                throw new bng(e.getMessage(), e);
            }
            throw e;
        } catch (cog e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof bng) {
                throw ((bng) e3.getCause());
            }
            throw new bng(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof bng) {
                throw ((bng) e4.getCause());
            }
            throw e4;
        }
    }
}
