package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sch extends omg {
    private static final sch zzl;
    private static volatile tng zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private zmg zzg = wng.e;

    static {
        sch schVar = new sch();
        zzl = schVar;
        omg.m(sch.class, schVar);
    }

    public static sch t(InputStream inputStream, hmg hmgVar) throws bng {
        sch schVar = zzl;
        amg amgVarH = amg.h(inputStream, 4096);
        omg omgVarG = schVar.g();
        try {
            yng yngVarA = vng.c.a(omgVarG.getClass());
            k01 k01Var = amgVarH.c;
            if (k01Var == null) {
                k01Var = new k01(amgVarH);
            }
            yngVarA.g(omgVarG, k01Var, hmgVar);
            yngVarA.c(omgVarG);
            omg.p(omgVarG);
            return (sch) omgVarG;
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

    @Override // defpackage.omg
    public final Object q(int i) {
        tng nmgVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new xng(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", llg.b, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new sch();
        }
        if (i2 == 4) {
            return new oyg(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        tng tngVar = zzm;
        if (tngVar != null) {
            return tngVar;
        }
        synchronized (sch.class) {
            try {
                nmgVar = zzm;
                if (nmgVar == null) {
                    nmgVar = new nmg(zzl);
                    zzm = nmgVar;
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

    public final boolean s() {
        return this.zzf;
    }
}
