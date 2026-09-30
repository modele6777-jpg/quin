package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jch {
    public static final fnb h = new fnb(12);
    public static final rbh i;
    public volatile kv a;
    public final f8h b;
    public final String c;
    public final boolean d;
    public final ry6 e;
    public final uh0 f;
    public final gdh g;

    static {
        nog nogVar = nog.c;
        int i2 = ry6.c;
        i = new rbh(nogVar, false, fpb.x);
    }

    public jch(f8h f8hVar, rbh rbhVar) {
        this.b = f8hVar;
        Context context = f8hVar.b;
        String str = rbhVar.d;
        if (str == null) {
            str = (String) rbhVar.a.apply(context);
            rbhVar.d = str;
        }
        this.c = str;
        this.d = rbhVar.b;
        this.e = rbhVar.c;
        this.a = null;
        this.f = new uh0(1);
        this.g = new gdh(f8hVar, str);
    }

    public final kv a() {
        kv kvVar;
        kv kvVar2 = this.a;
        if (kvVar2 != null) {
            return kvVar2;
        }
        synchronized (this) {
            try {
                kvVar = this.a;
                if (kvVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        kv kvVarA = this.g.a();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i2 = ((h71) kvVarA.e).c - 2;
                        if (i2 == 15 || i2 == 16) {
                            kvVar = kvVarA;
                        } else {
                            f8h f8hVar = this.b;
                            f8hVar.g.a();
                            if (this.d || this.g.b() || !((String) kvVarA.b).isEmpty()) {
                                final int i3 = 2;
                                f8hVar.a().execute(new Runnable(this) { // from class: ubh
                                    public final /* synthetic */ jch b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hn5 hn5VarA;
                                        e0 e0VarB;
                                        int i4 = i3;
                                        jch jchVar = this.b;
                                        switch (i4) {
                                            case 0:
                                                jchVar.b();
                                                return;
                                            case 1:
                                                final bdh bdhVar = jchVar.b.i;
                                                mlg mlgVar = mlg.FILE;
                                                boolean z = jchVar.d;
                                                ach achVar = ach.a;
                                                final edh edhVar = (edh) bdhVar.c.get();
                                                if (edhVar == null && !z) {
                                                    ux6 ux6Var = ux6.b;
                                                    return;
                                                }
                                                int iB = 1 << mlgVar.b();
                                                if ((bdhVar.e & iB) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = bdhVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i5 = bdhVar.e;
                                                            if ((i5 & iB) == 0) {
                                                                copyOnWriteArrayList.add(achVar);
                                                                bdhVar.e = iB | i5;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (bdhVar.h == null) {
                                                    synchronized (bdhVar.g) {
                                                        try {
                                                            if (bdhVar.h == null) {
                                                                if (edhVar == null) {
                                                                    edhVar = zch.a;
                                                                }
                                                                Context context = bdhVar.a;
                                                                if (i7h.O(context)) {
                                                                    hn5VarA = ((s9h) bdhVar.d.get()).a(new adh(bdhVar, edhVar));
                                                                    bdhVar.h = hn5VarA;
                                                                } else {
                                                                    mt4 mt4Var = mt4.c;
                                                                    u8e u8eVar = bdhVar.b;
                                                                    hn5VarA = i5.r(i7h.N(context, Executors.callable(mt4Var, null), (Executor) u8eVar.get()), new sg0() { // from class: ych
                                                                        @Override // defpackage.sg0
                                                                        public final m88 apply(Object obj) {
                                                                            bdh bdhVar2 = bdhVar;
                                                                            return ((s9h) bdhVar2.d.get()).a(new adh(bdhVar2, edhVar));
                                                                        }
                                                                    }, (Executor) u8eVar.get());
                                                                    bdhVar.h = hn5VarA;
                                                                }
                                                                hn5VarA.b(new jfg(17, hn5VarA), (Executor) bdhVar.b.get());
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                kv kvVarA2 = jchVar.a();
                                                String str = (String) kvVarA2.b;
                                                f8h f8hVar2 = jchVar.b;
                                                u8e u8eVar2 = f8hVar2.d;
                                                fdh fdhVarB = f8hVar2.g.b();
                                                boolean z2 = fdhVarB.i;
                                                int i6 = 0;
                                                if (fdhVarB.j) {
                                                    if ((str == null || str.isEmpty()) && !z2) {
                                                        ux6 ux6Var2 = ux6.b;
                                                        return;
                                                    }
                                                    c9h c9hVarS = h9h.s();
                                                    h71 h71Var = (h71) kvVarA2.e;
                                                    int i7 = h71Var.b;
                                                    e9h e9hVarR = f9h.r();
                                                    e9hVarR.c();
                                                    ((f9h) e9hVarR.b).s(i7);
                                                    int i8 = h71Var.c;
                                                    e9hVarR.c();
                                                    ((f9h) e9hVarR.b).t(i8);
                                                    f9h f9hVar = (f9h) e9hVarR.e();
                                                    c9hVarS.c();
                                                    ((h9h) c9hVarS.b).u(f9hVar);
                                                    if (str != null && !str.isEmpty()) {
                                                        c9hVarS.c();
                                                        ((h9h) c9hVarS.b).t(str);
                                                    }
                                                    if (z2) {
                                                        String str2 = jchVar.c;
                                                        c9hVarS.c();
                                                        ((h9h) c9hVarS.b).v(str2);
                                                    }
                                                    s9h s9hVar = (s9h) u8eVar2.get();
                                                    h9h h9hVar = (h9h) c9hVarS.e();
                                                    w6h w6hVar = s9hVar.a;
                                                    j27 j27VarB = j27.b();
                                                    j27VarB.c = new vrb(18, h9hVar);
                                                    j27VarB.d = new za5[]{k99.j};
                                                    j27VarB.a = false;
                                                    e0VarB = s9h.b(w6hVar.b(0, j27VarB.a()).g(f94.a, new lqb(29, w6hVar, h9hVar)));
                                                } else {
                                                    if (str == null || str.isEmpty()) {
                                                        ux6 ux6Var3 = ux6.b;
                                                        return;
                                                    }
                                                    s9h s9hVar2 = (s9h) u8eVar2.get();
                                                    s9hVar2.getClass();
                                                    str.getClass();
                                                    e0VarB = s9h.b(s9hVar2.a.c(str));
                                                }
                                                xbh xbhVar = new xbh(i6, jchVar);
                                                i39 i39VarA = f8hVar2.a();
                                                int i9 = g0.z;
                                                e0 e0Var = new e0(e0VarB, o9h.class, xbhVar);
                                                e0VarB.b(e0Var, bzd.G(i39VarA, e0Var));
                                                return;
                                        }
                                    }
                                });
                                f8hVar.a.b((xlg) kvVarA.c, this.e, this.c);
                                if (this.g.b()) {
                                    final int i4 = 1;
                                    f8hVar.a().execute(new Runnable(this) { // from class: ubh
                                        public final /* synthetic */ jch b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            hn5 hn5VarA;
                                            e0 e0VarB;
                                            int i5 = i4;
                                            jch jchVar = this.b;
                                            switch (i5) {
                                                case 0:
                                                    jchVar.b();
                                                    return;
                                                case 1:
                                                    final bdh bdhVar = jchVar.b.i;
                                                    mlg mlgVar = mlg.FILE;
                                                    boolean z = jchVar.d;
                                                    ach achVar = ach.a;
                                                    final edh edhVar = (edh) bdhVar.c.get();
                                                    if (edhVar == null && !z) {
                                                        ux6 ux6Var = ux6.b;
                                                        return;
                                                    }
                                                    int iB = 1 << mlgVar.b();
                                                    if ((bdhVar.e & iB) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = bdhVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i6 = bdhVar.e;
                                                                if ((i6 & iB) == 0) {
                                                                    copyOnWriteArrayList.add(achVar);
                                                                    bdhVar.e = iB | i6;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (bdhVar.h == null) {
                                                        synchronized (bdhVar.g) {
                                                            try {
                                                                if (bdhVar.h == null) {
                                                                    if (edhVar == null) {
                                                                        edhVar = zch.a;
                                                                    }
                                                                    Context context = bdhVar.a;
                                                                    if (i7h.O(context)) {
                                                                        hn5VarA = ((s9h) bdhVar.d.get()).a(new adh(bdhVar, edhVar));
                                                                        bdhVar.h = hn5VarA;
                                                                    } else {
                                                                        mt4 mt4Var = mt4.c;
                                                                        u8e u8eVar = bdhVar.b;
                                                                        hn5VarA = i5.r(i7h.N(context, Executors.callable(mt4Var, null), (Executor) u8eVar.get()), new sg0() { // from class: ych
                                                                            @Override // defpackage.sg0
                                                                            public final m88 apply(Object obj) {
                                                                                bdh bdhVar2 = bdhVar;
                                                                                return ((s9h) bdhVar2.d.get()).a(new adh(bdhVar2, edhVar));
                                                                            }
                                                                        }, (Executor) u8eVar.get());
                                                                        bdhVar.h = hn5VarA;
                                                                    }
                                                                    hn5VarA.b(new jfg(17, hn5VarA), (Executor) bdhVar.b.get());
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    kv kvVarA2 = jchVar.a();
                                                    String str = (String) kvVarA2.b;
                                                    f8h f8hVar2 = jchVar.b;
                                                    u8e u8eVar2 = f8hVar2.d;
                                                    fdh fdhVarB = f8hVar2.g.b();
                                                    boolean z2 = fdhVarB.i;
                                                    int i7 = 0;
                                                    if (fdhVarB.j) {
                                                        if ((str == null || str.isEmpty()) && !z2) {
                                                            ux6 ux6Var2 = ux6.b;
                                                            return;
                                                        }
                                                        c9h c9hVarS = h9h.s();
                                                        h71 h71Var = (h71) kvVarA2.e;
                                                        int i8 = h71Var.b;
                                                        e9h e9hVarR = f9h.r();
                                                        e9hVarR.c();
                                                        ((f9h) e9hVarR.b).s(i8);
                                                        int i9 = h71Var.c;
                                                        e9hVarR.c();
                                                        ((f9h) e9hVarR.b).t(i9);
                                                        f9h f9hVar = (f9h) e9hVarR.e();
                                                        c9hVarS.c();
                                                        ((h9h) c9hVarS.b).u(f9hVar);
                                                        if (str != null && !str.isEmpty()) {
                                                            c9hVarS.c();
                                                            ((h9h) c9hVarS.b).t(str);
                                                        }
                                                        if (z2) {
                                                            String str2 = jchVar.c;
                                                            c9hVarS.c();
                                                            ((h9h) c9hVarS.b).v(str2);
                                                        }
                                                        s9h s9hVar = (s9h) u8eVar2.get();
                                                        h9h h9hVar = (h9h) c9hVarS.e();
                                                        w6h w6hVar = s9hVar.a;
                                                        j27 j27VarB = j27.b();
                                                        j27VarB.c = new vrb(18, h9hVar);
                                                        j27VarB.d = new za5[]{k99.j};
                                                        j27VarB.a = false;
                                                        e0VarB = s9h.b(w6hVar.b(0, j27VarB.a()).g(f94.a, new lqb(29, w6hVar, h9hVar)));
                                                    } else {
                                                        if (str == null || str.isEmpty()) {
                                                            ux6 ux6Var3 = ux6.b;
                                                            return;
                                                        }
                                                        s9h s9hVar2 = (s9h) u8eVar2.get();
                                                        s9hVar2.getClass();
                                                        str.getClass();
                                                        e0VarB = s9h.b(s9hVar2.a.c(str));
                                                    }
                                                    xbh xbhVar = new xbh(i7, jchVar);
                                                    i39 i39VarA = f8hVar2.a();
                                                    int i10 = g0.z;
                                                    e0 e0Var = new e0(e0VarB, o9h.class, xbhVar);
                                                    e0VarB.b(e0Var, bzd.G(i39VarA, e0Var));
                                                    return;
                                            }
                                        }
                                    });
                                }
                                kvVar = kvVarA;
                            } else {
                                final int i5 = 0;
                                f8hVar.a().execute(new Runnable(this) { // from class: ubh
                                    public final /* synthetic */ jch b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hn5 hn5VarA;
                                        e0 e0VarB;
                                        int i6 = i5;
                                        jch jchVar = this.b;
                                        switch (i6) {
                                            case 0:
                                                jchVar.b();
                                                return;
                                            case 1:
                                                final bdh bdhVar = jchVar.b.i;
                                                mlg mlgVar = mlg.FILE;
                                                boolean z = jchVar.d;
                                                ach achVar = ach.a;
                                                final edh edhVar = (edh) bdhVar.c.get();
                                                if (edhVar == null && !z) {
                                                    ux6 ux6Var = ux6.b;
                                                    return;
                                                }
                                                int iB = 1 << mlgVar.b();
                                                if ((bdhVar.e & iB) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = bdhVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i7 = bdhVar.e;
                                                            if ((i7 & iB) == 0) {
                                                                copyOnWriteArrayList.add(achVar);
                                                                bdhVar.e = iB | i7;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (bdhVar.h == null) {
                                                    synchronized (bdhVar.g) {
                                                        try {
                                                            if (bdhVar.h == null) {
                                                                if (edhVar == null) {
                                                                    edhVar = zch.a;
                                                                }
                                                                Context context = bdhVar.a;
                                                                if (i7h.O(context)) {
                                                                    hn5VarA = ((s9h) bdhVar.d.get()).a(new adh(bdhVar, edhVar));
                                                                    bdhVar.h = hn5VarA;
                                                                } else {
                                                                    mt4 mt4Var = mt4.c;
                                                                    u8e u8eVar = bdhVar.b;
                                                                    hn5VarA = i5.r(i7h.N(context, Executors.callable(mt4Var, null), (Executor) u8eVar.get()), new sg0() { // from class: ych
                                                                        @Override // defpackage.sg0
                                                                        public final m88 apply(Object obj) {
                                                                            bdh bdhVar2 = bdhVar;
                                                                            return ((s9h) bdhVar2.d.get()).a(new adh(bdhVar2, edhVar));
                                                                        }
                                                                    }, (Executor) u8eVar.get());
                                                                    bdhVar.h = hn5VarA;
                                                                }
                                                                hn5VarA.b(new jfg(17, hn5VarA), (Executor) bdhVar.b.get());
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                kv kvVarA2 = jchVar.a();
                                                String str = (String) kvVarA2.b;
                                                f8h f8hVar2 = jchVar.b;
                                                u8e u8eVar2 = f8hVar2.d;
                                                fdh fdhVarB = f8hVar2.g.b();
                                                boolean z2 = fdhVarB.i;
                                                int i8 = 0;
                                                if (fdhVarB.j) {
                                                    if ((str == null || str.isEmpty()) && !z2) {
                                                        ux6 ux6Var2 = ux6.b;
                                                        return;
                                                    }
                                                    c9h c9hVarS = h9h.s();
                                                    h71 h71Var = (h71) kvVarA2.e;
                                                    int i9 = h71Var.b;
                                                    e9h e9hVarR = f9h.r();
                                                    e9hVarR.c();
                                                    ((f9h) e9hVarR.b).s(i9);
                                                    int i10 = h71Var.c;
                                                    e9hVarR.c();
                                                    ((f9h) e9hVarR.b).t(i10);
                                                    f9h f9hVar = (f9h) e9hVarR.e();
                                                    c9hVarS.c();
                                                    ((h9h) c9hVarS.b).u(f9hVar);
                                                    if (str != null && !str.isEmpty()) {
                                                        c9hVarS.c();
                                                        ((h9h) c9hVarS.b).t(str);
                                                    }
                                                    if (z2) {
                                                        String str2 = jchVar.c;
                                                        c9hVarS.c();
                                                        ((h9h) c9hVarS.b).v(str2);
                                                    }
                                                    s9h s9hVar = (s9h) u8eVar2.get();
                                                    h9h h9hVar = (h9h) c9hVarS.e();
                                                    w6h w6hVar = s9hVar.a;
                                                    j27 j27VarB = j27.b();
                                                    j27VarB.c = new vrb(18, h9hVar);
                                                    j27VarB.d = new za5[]{k99.j};
                                                    j27VarB.a = false;
                                                    e0VarB = s9h.b(w6hVar.b(0, j27VarB.a()).g(f94.a, new lqb(29, w6hVar, h9hVar)));
                                                } else {
                                                    if (str == null || str.isEmpty()) {
                                                        ux6 ux6Var3 = ux6.b;
                                                        return;
                                                    }
                                                    s9h s9hVar2 = (s9h) u8eVar2.get();
                                                    s9hVar2.getClass();
                                                    str.getClass();
                                                    e0VarB = s9h.b(s9hVar2.a.c(str));
                                                }
                                                xbh xbhVar = new xbh(i8, jchVar);
                                                i39 i39VarA = f8hVar2.a();
                                                int i11 = g0.z;
                                                e0 e0Var = new e0(e0VarB, o9h.class, xbhVar);
                                                e0VarB.b(e0Var, bzd.G(i39VarA, e0Var));
                                                return;
                                        }
                                    }
                                });
                                kvVar = new kv(idh.y(), (h71) kvVarA.e);
                            }
                        }
                        if (!this.d || ((h71) kvVar.e).c != 17) {
                            this.a = kvVar;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kvVar;
    }

    public final void b() {
        gdh gdhVar = this.g;
        f8h f8hVar = gdhVar.a;
        s9h s9hVar = (s9h) f8hVar.d.get();
        String str = gdhVar.c;
        s9hVar.getClass();
        str.getClass();
        w6h w6hVar = s9hVar.a;
        j27 j27VarB = j27.b();
        j27VarB.c = new ue1(str, (char) 0);
        e0 e0VarB = s9h.b(w6hVar.b(0, j27VarB.a()).f(f94.a, new nwg(20)));
        nog nogVar = nog.d;
        i39 i39VarA = f8hVar.a();
        int i2 = i5.y;
        h5 h5Var = new h5(e0VarB, nogVar);
        e0VarB.b(h5Var, bzd.G(i39VarA, h5Var));
        xbh xbhVar = new xbh(1, gdhVar);
        f8h f8hVar2 = this.b;
        i5.r(h5Var, xbhVar, f8hVar2.a()).b(new n6h(this, h5Var, false, 9), f8hVar2.a());
    }
}
