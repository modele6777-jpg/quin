package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u9h extends omg {
    private static final u9h zzj;
    private static volatile tng zzk;
    private int zzb;
    private long zzh;
    private hng zzi = hng.a;
    private String zze = "";
    private xlg zzf = xlg.a;
    private String zzg = "";

    static {
        u9h u9hVar = new u9h();
        zzj = u9hVar;
        omg.m(u9h.class, u9hVar);
    }

    public static u9h x(amg amgVar, hmg hmgVar) throws bng {
        omg omgVarG = zzj.g();
        try {
            yng yngVarA = vng.c.a(omgVarG.getClass());
            k01 k01Var = amgVar.c;
            if (k01Var == null) {
                k01Var = new k01(amgVar);
            }
            yngVarA.g(omgVarG, k01Var, hmgVar);
            yngVarA.c(omgVarG);
            omg.p(omgVarG);
            return (u9h) omgVarG;
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

    public static u9h y() {
        return zzj;
    }

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", t9h.a});
        }
        if (i2 == 3) {
            return new u9h();
        }
        if (i2 == 4) {
            return new oyg(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzk;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (u9h.class) {
            try {
                nmgVar = zzk;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzj);
                    zzk = nmgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nmgVar;
    }

    public final String r() {
        return this.zze;
    }

    public final xlg s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        return this.zzh;
    }

    public final int v() {
        return this.zzi.size();
    }

    public final Map w() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
