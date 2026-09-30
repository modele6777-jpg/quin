package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m8a extends t56 {
    private static final m8a DEFAULT_INSTANCE;
    private static volatile j0a PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final m87 sessionVerbosity_converter_ = new jy4(17);
    private int bitField0_;
    private String sessionId_ = "";
    private l87 sessionVerbosity_ = l67.d;

    static {
        m8a m8aVar = new m8a();
        DEFAULT_INSTANCE = m8aVar;
        t56.o(m8a.class, m8aVar);
    }

    public static l8a u() {
        return (l8a) DEFAULT_INSTANCE.h();
    }

    @Override // defpackage.t56
    public final Object i(int i) {
        j0a n56Var;
        switch (kv2.B(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new hdb(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", i8c.d});
            case 3:
                return new m8a();
            case 4:
                return new l8a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j0a j0aVar = PARSER;
                if (j0aVar != null) {
                    return j0aVar;
                }
                synchronized (m8a.class) {
                    try {
                        n56Var = PARSER;
                        if (n56Var == null) {
                            n56Var = new n56();
                            PARSER = n56Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return n56Var;
            default:
                cva.f();
                return null;
        }
    }

    public final void r() {
        RandomAccess randomAccess = this.sessionVerbosity_;
        if (!((l4) randomAccess).a) {
            l67 l67Var = (l67) randomAccess;
            int i = l67Var.c;
            int i2 = i == 0 ? 10 : i * 2;
            if (i2 < i) {
                cva.s();
                return;
            } else {
                l67 l67Var2 = new l67(Arrays.copyOf(l67Var.b, i2), l67Var.c, true);
                this.sessionVerbosity_ = l67Var2;
                randomAccess = l67Var2;
            }
        }
        ((l67) randomAccess).c(j1d.GAUGES_AND_SYSTEM_EVENTS.a());
    }

    public final j1d s() {
        j1d j1dVar;
        int iE = ((l67) this.sessionVerbosity_).e(0);
        j1d j1dVar2 = j1d.SESSION_VERBOSITY_NONE;
        if (iE != 0) {
            j1dVar = iE != 1 ? null : j1d.GAUGES_AND_SYSTEM_EVENTS;
        } else {
            j1dVar = j1dVar2;
        }
        return j1dVar == null ? j1dVar2 : j1dVar;
    }

    public final int t() {
        return ((l67) this.sessionVerbosity_).size();
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
