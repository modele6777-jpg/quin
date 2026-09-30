package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class osa extends v56 {
    private static final osa DEFAULT_INSTANCE;
    private static volatile k0a PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private rl8 preferences_ = rl8.a;

    static {
        osa osaVar = new osa();
        DEFAULT_INSTANCE = osaVar;
        v56.i(osa.class, osaVar);
    }

    public static msa n() {
        return (msa) ((m56) DEFAULT_INSTANCE.b(5));
    }

    public static osa o(InputStream inputStream) {
        osa osaVar = DEFAULT_INSTANCE;
        f72 f72Var = new f72(inputStream);
        p85 p85VarA = p85.a();
        v56 v56VarH = osaVar.h();
        try {
            v0b v0bVar = v0b.c;
            v0bVar.getClass();
            gfc gfcVarA = v0bVar.a(v56VarH.getClass());
            i72 i72Var = (i72) f72Var.b;
            if (i72Var == null) {
                i72Var = new i72(f72Var);
            }
            gfcVarA.f(v56VarH, i72Var, p85VarA);
            gfcVarA.b(v56VarH);
            if (v56.e(v56VarH, true)) {
                return (osa) v56VarH;
            }
            ya7 ya7Var = new ya7(new ref().getMessage());
            ya7Var.h(v56VarH);
            throw ya7Var;
        } catch (ya7 e) {
            e = e;
            if (e.a()) {
                e = new ya7(e);
            }
            e.h(v56VarH);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof ya7) {
                throw ((ya7) e2.getCause());
            }
            ya7 ya7Var2 = new ya7(e2);
            ya7Var2.h(v56VarH);
            throw ya7Var2;
        } catch (ref e3) {
            ya7 ya7Var3 = new ya7(e3.getMessage());
            ya7Var3.h(v56VarH);
            throw ya7Var3;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ya7) {
                throw ((ya7) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.v56
    public final Object b(int i) {
        k0a o56Var;
        switch (kv2.B(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new idb(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", nsa.a});
            case 3:
                return new osa();
            case 4:
                return new msa(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                k0a k0aVar = PARSER;
                if (k0aVar != null) {
                    return k0aVar;
                }
                synchronized (osa.class) {
                    try {
                        o56Var = PARSER;
                        if (o56Var == null) {
                            o56Var = new o56();
                            PARSER = o56Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return o56Var;
            default:
                cva.f();
                return null;
        }
    }

    public final Map l() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final rl8 m() {
        if (!this.preferences_.c()) {
            this.preferences_ = this.preferences_.e();
        }
        return this.preferences_;
    }
}
