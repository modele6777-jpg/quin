package defpackage;

import android.content.Context;
import android.net.Uri;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jbh implements u8e {
    public final String a;
    public final gn2 b;
    public volatile int c = -1;
    public uh0 d;

    public jbh(String str, gn2 gn2Var) {
        this.a = str;
        this.b = gn2Var;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    @Override // defpackage.u8e
    public final Object get() {
        jch jchVarB;
        Object objA;
        wid widVar;
        f8h f8hVar;
        if (bm8.Q == null) {
            Object obj = f8h.j;
            bm8.Q = new r8h();
        }
        Context context = (Context) f8h.k.get();
        Object objC = null;
        if (context == null) {
            synchronized (bm8.O) {
            }
            qc0.p("Must call PhenotypeContext.setContext() first");
            return null;
        }
        f8h f8hVar2 = f8h.l;
        if (f8hVar2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (f8h.j) {
                    try {
                        if (f8h.l != null) {
                            f8hVar = f8h.l;
                        } else {
                            f8hVar = (f8h) new i8h(applicationContext, 0).get();
                            f8h.l = f8hVar;
                            sfc.n(Level.CONFIG, f8hVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        f8hVar2 = f8hVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        int i = this.c;
        if (i == -1 || i < this.d.a.get()) {
            synchronized (this) {
                try {
                    int i2 = this.c;
                    if (i2 == -1) {
                        f8h.b();
                        f8hVar2.getClass();
                        jchVarB = this.b.b(f8hVar2);
                        this.d = jchVarB.f;
                    } else {
                        jchVarB = null;
                    }
                    int i3 = this.d.a.get();
                    if (i2 < i3) {
                        f8h.b();
                        f8hVar2.getClass();
                        vr9 vr9VarZ = y7h.Z(f8hVar2.b);
                        if (vr9VarZ.b()) {
                            x7h x7hVar = (x7h) vr9VarZ.a();
                            Uri uriA = a8h.a();
                            String str = this.a;
                            if (uriA != null) {
                                widVar = (wid) x7hVar.a.get(uriA.toString());
                            } else {
                                x7hVar.getClass();
                                widVar = null;
                            }
                            String str2 = widVar == null ? null : (String) widVar.get(str);
                            if (str2 == null) {
                                objA = null;
                            } else {
                                try {
                                    objA = b(str2);
                                } catch (IOException | IllegalArgumentException e) {
                                    b1.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.a), e);
                                    objA = null;
                                }
                            }
                        } else {
                            objA = null;
                        }
                        if (jchVarB == null) {
                            jchVarB = this.b.b(f8hVar2);
                        }
                        String str3 = jchVarB.c;
                        int i4 = 1;
                        if (!f8hVar2.b.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            m88 m88VarB = f8hVar2.a().b(new w36(29, f8hVar2, str3));
                            m88VarB.b(new u36(m88VarB, i4), f94.a);
                        }
                        Object obj2 = ((dpb) jchVarB.a().d).get(this.a);
                        if (obj2 != null) {
                            try {
                                objC = c(obj2);
                            } catch (IOException | ClassCastException e2) {
                                b1.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.a), e2);
                            }
                        }
                        if (true != vr9VarZ.b()) {
                            objA = objC;
                        }
                        if (objA == null) {
                            objA = a();
                        }
                        if (objA != null) {
                            e(objA);
                            this.c = i3;
                        }
                    } else {
                        objA = d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objA = d();
        }
        objA.getClass();
        return objA;
    }
}
