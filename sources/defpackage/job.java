package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class job {
    public static final kob a;

    static {
        kob kobVar = null;
        try {
            kobVar = (kob) mob.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kobVar == null) {
            kobVar = new kob();
        }
        a = kobVar;
    }

    public static em7 a(Class cls) {
        return a.b(cls);
    }

    public static void b(q79 q79Var) {
        a.f(q79Var);
    }

    public static yn7 c(Class cls) {
        kob kobVar = a;
        return kobVar.l(kobVar.b(cls), Collections.EMPTY_LIST, false);
    }

    public static yn7 d(Class cls, do7 do7Var) {
        kob kobVar = a;
        return kobVar.l(kobVar.b(cls), Collections.singletonList(do7Var), false);
    }
}
