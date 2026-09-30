package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bp3 implements o8b, hf8 {
    public static final /* synthetic */ int Y = 0;
    public final s0e X;
    public final Context a;
    public y45 b;
    public lyd c;
    public lyd d;
    public lyd e;
    public String f;
    public boolean g;
    public boolean v;
    public Long w;
    public long x;
    public final qn2 y;
    public x16 z;

    public bp3(Context context) {
        this.a = context;
        t8e t8eVarD = iqf.d();
        js3 js3Var = ga4.a;
        this.y = jgb.k(i7h.I(t8eVarD, mk8.a));
        this.X = t0e.a(new xha());
    }

    public static oxa a(String str) {
        sq3 sq3Var = new sq3();
        synchronized (sq3Var) {
            sq3Var.a = 2;
        }
        nxa nxaVar = new nxa(k55.d, sq3Var);
        nxaVar.d = new ff8(8, 6);
        int i = op8.g;
        d82 d82Var = new d82();
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        List list = Collections.EMPTY_LIST;
        ey6 ey6Var2 = jy6.b;
        yob yobVar2 = yob.e;
        jp8 jp8Var = new jp8();
        mp8 mp8Var = mp8.a;
        Uri uri = str == null ? null : Uri.parse(str);
        return nxaVar.d(new op8("", new ip8(d82Var), uri != null ? new lp8(uri, null, null, list, yobVar2, -9223372036854775807L) : null, new kp8(jp8Var), rp8.C, mp8Var));
    }

    public final boolean b() {
        s0e s0eVar;
        Object value;
        if (this.b != null) {
            return true;
        }
        try {
            long j = this.x + 1;
            this.x = j;
            y45 y45VarA = new h45(this.a).a();
            y45VarA.m.a(new uo3(j, this, y45VarA));
            this.b = y45VarA;
            return true;
        } catch (Exception e) {
            do {
                s0eVar = this.X;
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, xha.a((xha) value, false, false, 0L, 0L, 0L, ub3.i("Failed to create ExoPlayer: ", e.getMessage()), 31)));
            return false;
        }
    }

    public final void c(String str) {
        if (b()) {
            j();
            this.f = null;
            Uri uriFromFile = Uri.fromFile(new File(str));
            y45 y45Var = this.b;
            if (y45Var != null) {
                int i = op8.g;
                d82 d82Var = new d82();
                ey6 ey6Var = jy6.b;
                yob yobVar = yob.e;
                List list = Collections.EMPTY_LIST;
                ey6 ey6Var2 = jy6.b;
                yob yobVar2 = yob.e;
                jp8 jp8Var = new jp8();
                y45Var.M(new op8("", new ip8(d82Var), uriFromFile != null ? new lp8(uriFromFile, null, null, list, yobVar2, -9223372036854775807L) : null, new kp8(jp8Var), rp8.C, mp8.a));
                y45Var.D();
            }
        }
    }

    public final void e(String str) {
        str.getClass();
        if (b()) {
            j();
            this.f = str;
            this.v = false;
            oxa oxaVarA = a(str);
            y45 y45Var = this.b;
            if (y45Var != null) {
                y45Var.Z();
                List listSingletonList = Collections.singletonList(oxaVarA);
                y45Var.Z();
                y45Var.N(listSingletonList);
                y45Var.D();
            }
            m();
        }
    }

    public final void f() {
        s0e s0eVar;
        Object value;
        y45 y45Var = this.b;
        if (y45Var == null) {
            return;
        }
        long jK = y45Var.k();
        long j = jK < 0 ? 0L : jK;
        long jD = y45Var.d();
        long j2 = jD < j ? j : jD;
        lyd lydVar = this.e;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.e = null;
        this.w = null;
        this.v = false;
        this.g = true;
        y45Var.P(false);
        y45Var.T();
        do {
            s0eVar = this.X;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, xha.a((xha) value, false, false, j, j2, 0L, null, 48)));
        String str = this.f;
        if (str != null) {
            k55 k55Var = k55.a;
            this.d = k55.c.x(str, new h55(str, null));
        }
    }

    public final void g(x16 x16Var) {
        y45 y45Var;
        this.z = x16Var;
        if (!((xha) this.X.getValue()).b || (y45Var = this.b) == null || y45Var.x()) {
            return;
        }
        y45 y45Var2 = this.b;
        if (y45Var2 != null) {
            y45Var2.P(true);
        }
        m();
    }

    public final void h(lga lgaVar) {
        s0e s0eVar;
        Object value;
        do {
            s0eVar = this.X;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, xha.a((xha) value, false, false, 0L, 0L, 0L, ub3.i("Player Error: ", lgaVar.getMessage()), 28)));
    }

    public final void i() {
        lyd lydVar = this.c;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.c = null;
        this.z = null;
        lyd lydVar2 = this.e;
        if (lydVar2 != null) {
            lydVar2.h(null);
        }
        this.e = null;
        this.w = null;
        this.g = false;
        this.f = null;
        this.x++;
        y45 y45Var = this.b;
        if (y45Var != null) {
            y45Var.T();
        }
        y45 y45Var2 = this.b;
        if (y45Var2 != null) {
            y45Var2.E();
        }
        this.b = null;
        this.X.n(null, new xha());
    }

    public final void j() {
        s0e s0eVar;
        Object value;
        eia eiaVar;
        int i;
        int i2;
        Pair pairB;
        lyd lydVar = this.c;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.c = null;
        lyd lydVar2 = this.e;
        if (lydVar2 != null) {
            lydVar2.h(null);
        }
        this.e = null;
        this.w = null;
        this.g = false;
        y45 y45Var = this.b;
        if (y45Var != null) {
            y45Var.T();
        }
        y45 y45Var2 = this.b;
        if (y45Var2 != null) {
            ArrayList arrayList = y45Var2.p;
            y45Var2.Z();
            int size = arrayList.size();
            int iMin = Math.min(Integer.MAX_VALUE, size);
            if (size > 0 && iMin != 0) {
                mga mgaVar = y45Var2.n0;
                int iO = y45Var2.o(mgaVar);
                long jF = y45Var2.f(mgaVar);
                gye gyeVar = mgaVar.a;
                y45Var2.J++;
                for (int i3 = iMin - 1; i3 >= 0; i3--) {
                    arrayList.remove(i3);
                }
                ggd ggdVar = y45Var2.P;
                int[] iArr = ggdVar.b;
                int[] iArr2 = new int[iArr.length - iMin];
                int i4 = 0;
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    int i6 = iArr[i5];
                    if (i6 < 0 || i6 >= iMin) {
                        int i7 = i5 - i4;
                        if (i6 >= 0) {
                            i6 -= iMin;
                        }
                        iArr2[i7] = i6;
                    } else {
                        i4++;
                    }
                }
                y45Var2.P = new ggd(iArr2, new Random(ggdVar.a.nextLong()));
                eia eiaVar2 = new eia(arrayList, y45Var2.P);
                if (gyeVar.p() || eiaVar2.p()) {
                    eiaVar = eiaVar2;
                    i = -1;
                    i2 = 1;
                    boolean z = !gyeVar.p() && eiaVar.p();
                    pairB = y45Var2.B(eiaVar, z ? -1 : iO, z ? -9223372036854775807L : jF);
                } else {
                    Pair pairI = gyeVar.i(y45Var2.a, y45Var2.o, iO, pqf.H(jF));
                    Object obj = pairI.first;
                    if (eiaVar2.b(obj) != -1) {
                        pairB = pairI;
                        eiaVar = eiaVar2;
                        i = -1;
                        i2 = 1;
                    } else {
                        i2 = 1;
                        i = -1;
                        int iT = g55.T(y45Var2.a, y45Var2.o, y45Var2.H, y45Var2.I, obj, gyeVar, eiaVar2);
                        eiaVar = eiaVar2;
                        if (iT != -1) {
                            fye fyeVar = y45Var2.a;
                            eiaVar.m(iT, fyeVar, 0L);
                            pairB = y45Var2.B(eiaVar, iT, pqf.R(fyeVar.j));
                        } else {
                            pairB = y45Var2.B(eiaVar, -1, -9223372036854775807L);
                        }
                    }
                }
                mga mgaVarA = y45Var2.A(mgaVar, eiaVar, pairB);
                int i8 = mgaVarA.e;
                if (i8 != i2 && i8 != 4 && iO >= 0 && iO < iMin) {
                    if (g55.T(y45Var2.a, y45Var2.o, y45Var2.H, y45Var2.I, mgaVar.b.a, gyeVar, eiaVar) == i) {
                        mgaVarA = y45.z(mgaVarA, 4);
                    }
                }
                mga mgaVar2 = mgaVarA;
                g55 g55Var = y45Var2.l;
                ggd ggdVar2 = y45Var2.P;
                jce jceVar = g55Var.g;
                jceVar.getClass();
                ice iceVarD = jce.d();
                iceVarD.a = jceVar.a.obtainMessage(20, 0, iMin, ggdVar2);
                iceVarD.b();
                y45Var2.X(mgaVar2, 0, !mgaVar2.b.a.equals(y45Var2.n0.b.a), 4, y45Var2.l(mgaVar2), -1, false);
            }
        }
        do {
            s0eVar = this.X;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, new xha()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r8 == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r8 == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r7, defpackage.zn2 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.xo3
            if (r0 == 0) goto L13
            r0 = r8
            xo3 r0 = (defpackage.xo3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            xo3 r0 = new xo3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            defpackage.jzb.q(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            goto L77
        L2f:
            r8 = move-exception
            goto L7e
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r2
        L37:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            defpackage.jzb.q(r8)
            goto L51
        L3f:
            defpackage.jzb.q(r8)
            lyd r8 = r6.d
            if (r8 == 0) goto L53
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.U0(r0)
            if (r8 != r5) goto L51
            goto L76
        L51:
            wef r8 = (defpackage.wef) r8
        L53:
            k55 r8 = defpackage.k55.a     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            r0.label = r3     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            gg7 r8 = defpackage.k55.c     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            j55 r1 = new j55     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            r1.<init>(r7, r2)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            r8.getClass()     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            za2 r3 = new za2     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            r3.<init>()     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            zo7 r4 = new zo7     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            r4.<init>(r3, r2, r1)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            r8.x(r7, r4)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            java.lang.Object r8 = r3.s(r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            if (r8 != r5) goto L77
        L76:
            return r5
        L77:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            boolean r6 = r8.booleanValue()     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L99
            goto L94
        L7e:
            m8b r6 = r6.d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to restore complete TTS cache metadata for "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.h(r7, r8)
            r6 = 0
        L94:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L99:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp3.k(java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[PHI: r8 r9
  0x0080: PHI (r8v3 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v4 boolean) binds: [B:24:0x0066, B:26:0x006a, B:30:0x007b] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r9v3 x16) = (r9v1 x16), (r9v1 x16), (r9v4 x16) binds: [B:24:0x0066, B:26:0x006a, B:30:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r10 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r10 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (defpackage.ynb.p0(r10, r1, r0) == r6) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(boolean r8, defpackage.x16 r9, defpackage.zn2 r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.yo3
            if (r0 == 0) goto L13
            r0 = r10
            yo3 r0 = (defpackage.yo3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            yo3 r0 = new yo3
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L50
            if (r1 == r4) goto L46
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            java.lang.Object r7 = r0.L$0
            x16 r7 = (defpackage.x16) r7
            defpackage.jzb.q(r10)
            goto L9a
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r5
        L38:
            boolean r8 = r0.Z$0
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.L$0
            x16 r9 = (defpackage.x16) r9
            defpackage.jzb.q(r10)
            goto L7b
        L46:
            boolean r8 = r0.Z$0
            java.lang.Object r9 = r0.L$0
            x16 r9 = (defpackage.x16) r9
            defpackage.jzb.q(r10)
            goto L64
        L50:
            defpackage.jzb.q(r10)
            lyd r10 = r7.d
            if (r10 == 0) goto L66
            r0.L$0 = r9
            r0.Z$0 = r8
            r0.label = r4
            java.lang.Object r10 = r10.U0(r0)
            if (r10 != r6) goto L64
            goto L99
        L64:
            wef r10 = (defpackage.wef) r10
        L66:
            if (r8 == 0) goto L80
            java.lang.String r10 = r7.f
            if (r10 == 0) goto L80
            r0.L$0 = r9
            r0.L$1 = r5
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r7.k(r10, r0)
            if (r10 != r6) goto L7b
            goto L99
        L7b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.getClass()
        L80:
            js3 r10 = defpackage.ga4.a
            wg6 r10 = defpackage.mk8.a
            wg6 r10 = r10.f
            zo3 r1 = new zo3
            r1.<init>(r7, r9, r5)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.Z$0 = r8
            r0.label = r2
            java.lang.Object r7 = defpackage.ynb.p0(r10, r1, r0)
            if (r7 != r6) goto L9a
        L99:
            return r6
        L9a:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp3.l(boolean, x16, zn2):java.lang.Object");
    }

    public final void m() {
        lyd lydVar = this.c;
        if (lydVar == null || !lydVar.b()) {
            this.c = ynb.V(this.y, null, null, new ap3(this, null), 3);
        }
    }
}
