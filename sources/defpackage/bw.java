package defpackage;

import android.os.Trace;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bw implements mx6 {
    public Object a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    public bw(r23 r23Var, hbc hbcVar) {
        this.b = r23Var;
        this.a = hbcVar;
        int i = 3;
        this.c = qi4.a(new os(r23Var, this, 1, i));
        this.d = qi4.a(new os(r23Var, this, 2, i));
        this.e = new os(r23Var, this, 4, i);
        this.f = new os(r23Var, this, 5, i);
        this.g = new os(r23Var, this, 6, i);
        this.v = new os(r23Var, this, 7, i);
        this.w = new os(r23Var, this, 8, i);
        this.x = qi4.a(new os(r23Var, this, i, i));
        this.y = qi4.a(new os(r23Var, this, 0, i));
    }

    public static final boolean j(p46 p46Var, p89 p89Var) {
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            vpb vpbVar = ((p46) objArr[i2]).a;
            if (vpbVar instanceof q2a) {
                p89 p89Var2 = ((q2a) vpbVar).b;
                if (p89Var2.j(p46Var) || j(p46Var, p89Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mx6
    public int a() {
        return ((veh) this.b).a();
    }

    @Override // defpackage.mx6
    public long b(long j) {
        return ((veh) this.a).b(j);
    }

    @Override // defpackage.mx6
    public long c(long j) {
        return ((veh) this.a).c(j);
    }

    public void d() {
        this.a = null;
        this.b = null;
        p89 p89Var = (p89) this.c;
        p89Var.g();
        ((x79) this.d).f();
        this.e = p89Var;
        ((p89) this.f).g();
        ((p89) this.g).g();
        this.v = null;
        this.w = null;
        this.x = null;
    }

    public void e() {
        Set set = (Set) this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                vpb vpbVar = (vpb) it.next();
                it.remove();
                vpbVar.a();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            p89 r0 = (defpackage.p89) r0
            java.lang.Object r1 = r8.f
            p89 r1 = (defpackage.p89) r1
            java.lang.Object r2 = r8.a
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L10
            goto Lb3
        L10:
            r3 = 0
            r8.y = r3
            int r3 = r1.c
            r4 = 7
            if (r3 == 0) goto L72
            java.lang.String r3 = "Compose:onForgotten"
            android.os.Trace.beginSection(r3)
            java.lang.Object r3 = r8.v     // Catch: java.lang.Throwable -> L6d
            x79 r3 = (defpackage.x79) r3     // Catch: java.lang.Throwable -> L6d
            int r5 = r1.c     // Catch: java.lang.Throwable -> L6d
            int r5 = r5 + (-1)
        L25:
            r6 = -1
            if (r6 >= r5) goto L69
            java.lang.Object[] r6 = r1.a     // Catch: java.lang.Throwable -> L6d
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L6d
            boolean r7 = r6 instanceof defpackage.p46     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L3e
            r7 = r6
            p46 r7 = (defpackage.p46) r7     // Catch: java.lang.Throwable -> L3c
            vpb r7 = r7.a     // Catch: java.lang.Throwable -> L3c
            r2.remove(r7)     // Catch: java.lang.Throwable -> L3c
            r7.c()     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L5a
        L3e:
            boolean r7 = r6 instanceof defpackage.ue2     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L57
            if (r3 == 0) goto L51
            boolean r7 = r3.a(r6)     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L51
            r7 = r6
            ue2 r7 = (defpackage.ue2) r7     // Catch: java.lang.Throwable -> L3c
            r7.b()     // Catch: java.lang.Throwable -> L3c
            goto L57
        L51:
            r7 = r6
            ue2 r7 = (defpackage.ue2) r7     // Catch: java.lang.Throwable -> L3c
            r7.d()     // Catch: java.lang.Throwable -> L3c
        L57:
            int r5 = r5 + (-1)
            goto L25
        L5a:
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L6d
            og2 r8 = (defpackage.og2) r8     // Catch: java.lang.Throwable -> L6d
            if (r8 == 0) goto L68
            ad1 r1 = new ad1     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r4, r8, r6)     // Catch: java.lang.Throwable -> L6d
            defpackage.xo1.S(r0, r1)     // Catch: java.lang.Throwable -> L6d
        L68:
            throw r0     // Catch: java.lang.Throwable -> L6d
        L69:
            android.os.Trace.endSection()
            goto L72
        L6d:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        L72:
            int r1 = r0.c
            if (r1 == 0) goto Lb3
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r8.a     // Catch: java.lang.Throwable -> La8
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L82
            goto Lab
        L82:
            java.lang.Object[] r2 = r0.a     // Catch: java.lang.Throwable -> La8
            int r0 = r0.c     // Catch: java.lang.Throwable -> La8
            r3 = 0
        L87:
            if (r3 >= r0) goto Lab
            r5 = r2[r3]     // Catch: java.lang.Throwable -> La8
            p46 r5 = (defpackage.p46) r5     // Catch: java.lang.Throwable -> La8
            vpb r6 = r5.a     // Catch: java.lang.Throwable -> La8
            r1.remove(r6)     // Catch: java.lang.Throwable -> La8
            r6.d()     // Catch: java.lang.Throwable -> L98
            int r3 = r3 + 1
            goto L87
        L98:
            r0 = move-exception
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> La8
            og2 r8 = (defpackage.og2) r8     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto Laa
            ad1 r1 = new ad1     // Catch: java.lang.Throwable -> La8
            r1.<init>(r4, r8, r5)     // Catch: java.lang.Throwable -> La8
            defpackage.xo1.S(r0, r1)     // Catch: java.lang.Throwable -> La8
            goto Laa
        La8:
            r8 = move-exception
            goto Laf
        Laa:
            throw r0     // Catch: java.lang.Throwable -> La8
        Lab:
            android.os.Trace.endSection()
            return
        Laf:
            android.os.Trace.endSection()
            throw r8
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw.f():void");
    }

    public void g() {
        p89 p89Var = (p89) this.g;
        if (p89Var.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = p89Var.a;
                int i = p89Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((x16) objArr[i2]).invoke();
                }
                p89Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void h(a26 a26Var) {
        veh vehVar = (veh) this.a;
        vehVar.b++;
        ((p89) vehVar.e).b(a26Var);
        vehVar.e();
    }

    public void i(p46 p46Var) {
        p89 p89Var = (p89) this.c;
        if (!((x79) this.d).a(p46Var)) {
            lec lecVar = (lec) this.y;
            if (lecVar == null || !lecVar.a(p46Var)) {
                ((p89) this.f).b(p46Var);
                return;
            }
            return;
        }
        ((x79) this.d).m(p46Var);
        if (!((p89) this.e).j(p46Var) && !p89Var.j(p46Var)) {
            j(p46Var, p89Var);
        }
        Set set = (Set) this.a;
        if (set == null) {
            return;
        }
        set.add(p46Var.a);
    }

    public void k(Set set, og2 og2Var) {
        d();
        this.a = set;
        this.b = og2Var;
    }

    public bw(veh vehVar, z2f z2fVar, ne2 ne2Var, a26 a26Var, yib yibVar, c13 c13Var, ute uteVar, x16 x16Var, rvf rvfVar, a26 a26Var2) {
        this.b = vehVar;
        this.c = z2fVar;
        this.d = ne2Var;
        this.e = a26Var;
        this.g = yibVar;
        this.v = c13Var;
        this.w = uteVar;
        this.x = x16Var;
        this.y = rvfVar;
        this.f = a26Var2;
        this.a = vehVar;
    }

    public bw() {
        p89 p89Var = new p89(0, new p46[16]);
        this.c = p89Var;
        x79 x79Var = mec.a;
        this.d = new x79();
        this.e = p89Var;
        this.f = new p89(0, new Object[16]);
        this.g = new p89(0, new x16[16]);
    }
}
