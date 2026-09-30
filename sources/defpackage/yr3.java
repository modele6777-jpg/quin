package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yr3 implements yp8 {
    public static final /* synthetic */ int j = 0;
    public final a82 a;
    public final a90 b;
    public qfc c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public yr3(a90 a90Var, sq3 sq3Var) {
        qfc qfcVar = new qfc();
        this.b = a90Var;
        this.c = qfcVar;
        a82 a82Var = new a82(sq3Var, qfcVar);
        this.a = a82Var;
        if (a90Var != ((a90) a82Var.e)) {
            a82Var.e = a90Var;
            ((HashMap) a82Var.d).clear();
            ((HashMap) a82Var.b).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static yp8 e(Class cls, yb3 yb3Var) {
        try {
            return (yp8) cls.getConstructor(yb3.class).newInstance(yb3Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.yp8
    public final void a() {
        this.i = true;
        a82 a82Var = this.a;
        synchronized (((sq3) a82Var.c)) {
        }
        Iterator it = ((HashMap) a82Var.b).values().iterator();
        while (it.hasNext()) {
            ((yp8) it.next()).a();
        }
    }

    @Override // defpackage.yp8
    public final void b(qfc qfcVar) {
        this.c = qfcVar;
        a82 a82Var = this.a;
        a82Var.f = qfcVar;
        sq3 sq3Var = (sq3) a82Var.c;
        synchronized (sq3Var) {
            sq3Var.c = qfcVar;
        }
        Iterator it = ((HashMap) a82Var.b).values().iterator();
        while (it.hasNext()) {
            ((yp8) it.next()).b(qfcVar);
        }
    }

    @Override // defpackage.yp8
    public final void c() {
        synchronized (((sq3) this.a.c)) {
        }
    }

    @Override // defpackage.yp8
    public final fu0 d(op8 op8Var) {
        op8 op8Var2;
        List list;
        Uri uri;
        String str;
        long j2;
        op8Var.b.getClass();
        String scheme = op8Var.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(op8Var.b.b, "application/x-image-uri");
        lp8 lp8Var = op8Var.b;
        if (zEquals) {
            long j3 = lp8Var.e;
            String str2 = pqf.a;
            throw null;
        }
        int iB = pqf.B(lp8Var.a, lp8Var.b);
        if (op8Var.b.e != -9223372036854775807L) {
            sq3 sq3Var = (sq3) this.a.c;
            synchronized (sq3Var) {
                sq3Var.d = 1;
            }
            sq3 sq3Var2 = (sq3) this.a.c;
            synchronized (sq3Var2) {
                sq3Var2.e = 1;
            }
        }
        try {
            a82 a82Var = this.a;
            HashMap map = (HashMap) a82Var.b;
            yp8 yp8Var = (yp8) map.get(Integer.valueOf(iB));
            if (yp8Var == null) {
                yp8Var = (yp8) a82Var.I(iB).get();
                yp8Var.b((qfc) a82Var.f);
                yp8Var.a();
                yp8Var.c();
                map.put(Integer.valueOf(iB), yp8Var);
            }
            jp8 jp8VarA = op8Var.c.a();
            kp8 kp8Var = op8Var.c;
            if (kp8Var.a == -9223372036854775807L) {
                jp8VarA.a = this.d;
            }
            if (kp8Var.d == -3.4028235E38f) {
                jp8VarA.d = this.g;
            }
            if (kp8Var.e == -3.4028235E38f) {
                jp8VarA.e = this.h;
            }
            if (kp8Var.b == -9223372036854775807L) {
                jp8VarA.b = this.e;
            }
            if (kp8Var.c == -9223372036854775807L) {
                jp8VarA.c = this.f;
            }
            kp8 kp8Var2 = new kp8(jp8VarA);
            if (kp8Var2.equals(op8Var.c)) {
                op8Var2 = op8Var;
            } else {
                new eu4();
                List list2 = Collections.EMPTY_LIST;
                ey6 ey6Var = jy6.b;
                jy6 jy6Var = yob.e;
                mp8 mp8Var = mp8.a;
                d82 d82VarA = op8Var.e.a();
                String str3 = op8Var.a;
                rp8 rp8Var = op8Var.d;
                op8Var.c.a();
                mp8 mp8Var2 = op8Var.f;
                lp8 lp8Var2 = op8Var.b;
                if (lp8Var2 != null) {
                    String str4 = lp8Var2.b;
                    Uri uri2 = lp8Var2.a;
                    List list3 = lp8Var2.c;
                    jy6Var = lp8Var2.d;
                    new eu4();
                    str = str4;
                    uri = uri2;
                    list = list3;
                    j2 = lp8Var2.e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j2 = -9223372036854775807L;
                }
                jy6 jy6Var2 = jy6Var;
                jp8 jp8VarA2 = kp8Var2.a();
                lp8 lp8Var3 = uri != null ? new lp8(uri, str, null, list, jy6Var2, j2) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                ip8 ip8Var = new ip8(d82VarA);
                kp8 kp8Var3 = new kp8(jp8VarA2);
                if (rp8Var == null) {
                    rp8Var = rp8.C;
                }
                op8Var2 = new op8(str5, ip8Var, lp8Var3, kp8Var3, rp8Var, mp8Var2);
            }
            fu0 fu0VarD = yp8Var.d(op8Var2);
            jy6 jy6Var3 = op8Var2.b.d;
            if (!jy6Var3.isEmpty()) {
                fu0[] fu0VarArr = new fu0[jy6Var3.size() + 1];
                fu0VarArr[0] = fu0VarD;
                if (jy6Var3.size() > 0) {
                    if (!this.i) {
                        this.b.getClass();
                        np8 np8Var = (np8) jy6Var3.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        new eu4();
                        List list4 = Collections.EMPTY_LIST;
                        ey6 ey6Var2 = jy6.b;
                        yob yobVar = yob.e;
                        mp8 mp8Var3 = mp8.a;
                        Uri uri3 = Uri.EMPTY;
                        np8Var.getClass();
                        throw null;
                    }
                    qr5 qr5Var = new qr5();
                    ((np8) jy6Var3.get(0)).getClass();
                    ArrayList arrayList = qv8.a;
                    qr5Var.o = null;
                    ((np8) jy6Var3.get(0)).getClass();
                    qr5Var.d = null;
                    ((np8) jy6Var3.get(0)).getClass();
                    qr5Var.e = 0;
                    ((np8) jy6Var3.get(0)).getClass();
                    qr5Var.f = 0;
                    ((np8) jy6Var3.get(0)).getClass();
                    qr5Var.b = null;
                    ((np8) jy6Var3.get(0)).getClass();
                    qr5Var.a = null;
                    rr5 rr5Var = new rr5(qr5Var);
                    new brg();
                    if (this.c.c(rr5Var)) {
                        qr5 qr5VarA = rr5Var.a();
                        qr5VarA.o = qv8.l("application/x-media3-cues");
                        qr5VarA.k = rr5Var.p;
                        qr5VarA.P = this.c.w0(rr5Var);
                        new rr5(qr5VarA);
                    }
                    ((np8) jy6Var3.get(0)).getClass();
                    throw null;
                }
                fu0VarD = new ys8(fu0VarArr);
            }
            if (op8Var2.e.a != Long.MIN_VALUE) {
                egh eghVar = new egh(fu0VarD);
                ip8 ip8Var2 = op8Var2.e;
                pa7.J(!eghVar.b);
                eghVar.d = ip8Var2.a();
                pa7.J(!eghVar.b);
                eghVar.b = true;
                fu0VarD = new i52(eghVar);
            }
            op8Var2.b.getClass();
            op8Var2.b.getClass();
            return fu0VarD;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
