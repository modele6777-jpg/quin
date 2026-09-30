package defpackage;

import com.adjust.sdk.sig.r3;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qsa extends v56 {
    private static final qsa DEFAULT_INSTANCE;
    private static volatile k0a PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private o87 strings_ = x0b.d;

    static {
        qsa qsaVar = new qsa();
        DEFAULT_INSTANCE = qsaVar;
        v56.i(qsa.class, qsaVar);
    }

    public static qsa m() {
        return DEFAULT_INSTANCE;
    }

    public static psa o() {
        return (psa) ((m56) DEFAULT_INSTANCE.b(5));
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
                return new idb(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new qsa();
            case 4:
                return new psa(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                k0a k0aVar = PARSER;
                if (k0aVar != null) {
                    return k0aVar;
                }
                synchronized (qsa.class) {
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

    public final void l(Iterable iterable) {
        o87 o87VarD = this.strings_;
        if (!((x0b) o87VarD).a) {
            x0b x0bVar = (x0b) o87VarD;
            int i = x0bVar.c;
            o87VarD = x0bVar.d(i == 0 ? 10 : i * 2);
            this.strings_ = o87VarD;
        }
        Charset charset = r87.a;
        if (iterable instanceof x18) {
            ((x18) iterable).h();
            r3.f();
            return;
        }
        if (iterable instanceof gua) {
            ((x0b) o87VarD).addAll((Collection) iterable);
            return;
        }
        if ((o87VarD instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) o87VarD).ensureCapacity(((Collection) iterable).size() + ((x0b) o87VarD).c);
        }
        x0b x0bVar2 = (x0b) o87VarD;
        int i2 = x0bVar2.c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (x0bVar2.c - i2) + " is null.";
                for (int i3 = x0bVar2.c - 1; i3 >= i2; i3--) {
                    x0bVar2.remove(i3);
                }
                r82.g(str);
                return;
            }
            x0bVar2.add(obj);
        }
    }

    public final o87 n() {
        return this.strings_;
    }
}
