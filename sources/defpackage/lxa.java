package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.q6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lxa implements up8, n95 {
    public static final Map i1;
    public static final rr5 j1;
    public final dxa E0;
    public final Handler F0;
    public tp8 G0;
    public nu6 H0;
    public gxa[] I0;
    public ncc[] J0;
    public jxa[] K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public kxa P0;
    public xsc Q0;
    public long R0;
    public boolean S0;
    public int T0;
    public boolean V0;
    public boolean W0;
    public final ta0 X;
    public boolean X0;
    public final nh2 Y;
    public boolean Y0;
    public final dxa Z;
    public int Z0;
    public final Uri a;
    public final ArrayList a1;
    public final ac3 b;
    public boolean b1;
    public final dq4 c;
    public long c1;
    public final ff8 d;
    public long d1;
    public final aq4 e;
    public boolean e1;
    public final aq4 f;
    public int f1;
    public final oxa g;
    public boolean g1;
    public boolean h1;
    public final ta0 v;
    public final rr5 x;
    public final long y;
    public final ta0 z;
    public final long w = q6.MAX_EVENT_SIZE_BYTES;
    public final long U0 = Long.MIN_VALUE;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        i1 = Collections.unmodifiableMap(map);
        qr5 qr5Var = new qr5();
        qr5Var.a = "icy";
        qr5Var.o = qv8.l("application/x-icy");
        j1 = new rr5(qr5Var);
    }

    public lxa(Uri uri, ac3 ac3Var, ta0 ta0Var, dq4 dq4Var, aq4 aq4Var, ff8 ff8Var, aq4 aq4Var2, oxa oxaVar, ta0 ta0Var2, rr5 rr5Var, long j, f39 f39Var) {
        this.a = uri;
        this.b = ac3Var;
        this.c = dq4Var;
        this.f = aq4Var;
        this.d = ff8Var;
        this.e = aq4Var2;
        this.g = oxaVar;
        this.v = ta0Var2;
        this.x = rr5Var;
        this.z = f39Var != null ? new ta0(2, f39Var) : new ta0("ProgressiveMediaPeriod");
        this.X = ta0Var;
        this.y = j;
        this.Y = new nh2(0);
        this.Z = new dxa(this, 1);
        this.E0 = new dxa(this, 2);
        this.F0 = pqf.n(null);
        this.K0 = new jxa[0];
        this.J0 = new ncc[0];
        this.I0 = new gxa[0];
        this.a1 = new ArrayList();
        this.d1 = -9223372036854775807L;
        this.T0 = 1;
    }

    public final k1f A(jxa jxaVar) {
        int length = this.J0.length;
        for (int i = 0; i < length; i++) {
            if (jxaVar.equals(this.K0[i])) {
                return this.J0[i];
            }
        }
        if (this.L0) {
            xo1.V("ProgressiveMediaPeriod", "Extractor added new track (id=" + jxaVar.a + ") after finishing tracks.");
            return new l94();
        }
        ncc nccVar = new ncc(this.v, this.c, this.f);
        gxa gxaVar = new gxa(nccVar);
        nccVar.f = this;
        int i2 = length + 1;
        jxa[] jxaVarArr = (jxa[]) Arrays.copyOf(this.K0, i2);
        jxaVarArr[length] = jxaVar;
        String str = pqf.a;
        this.K0 = jxaVarArr;
        ncc[] nccVarArr = (ncc[]) Arrays.copyOf(this.J0, i2);
        nccVarArr[length] = nccVar;
        this.J0 = nccVarArr;
        gxa[] gxaVarArr = (gxa[]) Arrays.copyOf(this.I0, i2);
        gxaVarArr[length] = gxaVar;
        this.I0 = gxaVarArr;
        return gxaVar;
    }

    public final void B(xsc xscVar) {
        this.Q0 = this.H0 == null ? xscVar : new ir0(-9223372036854775807L);
        this.R0 = xscVar.h();
        boolean z = !this.b1 && xscVar.h() == -9223372036854775807L;
        this.S0 = z;
        this.T0 = z ? 7 : 1;
        if (this.M0) {
            this.g.t(this.R0, xscVar, z);
        } else {
            v();
        }
    }

    public final void C() {
        hxa hxaVar = new hxa(this, this.a, this.b, this.X, this, this.Y);
        if (this.M0) {
            pa7.J(u());
            long j = this.U0;
            if (j == Long.MIN_VALUE) {
                j = this.R0;
            }
            if (j != -9223372036854775807L && this.d1 > j) {
                this.g1 = true;
                this.d1 = -9223372036854775807L;
                return;
            }
            xsc xscVar = this.Q0;
            xscVar.getClass();
            long j2 = xscVar.f(this.d1).a.b;
            long j3 = this.d1;
            hxaVar.g.b = j2;
            hxaVar.j = j3;
            hxaVar.i = true;
            hxaVar.m = false;
            for (ncc nccVar : this.J0) {
                nccVar.t = this.d1;
            }
            this.d1 = -9223372036854775807L;
        }
        this.f1 = s();
        int iJ = this.d.j(this.T0);
        ta0 ta0Var = this.z;
        ta0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ta0Var.b = null;
        x98 x98Var = new x98(ta0Var, looperMyLooper, hxaVar, this, iJ, SystemClock.elapsedRealtime());
        pa7.J(((x98) ta0Var.d) == null);
        ta0Var.d = x98Var;
        x98Var.b();
    }

    public final boolean D() {
        return this.W0 || u();
    }

    public final void a() {
        pa7.J(this.M0);
        this.P0.getClass();
        this.Q0.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0260  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    @Override // defpackage.up8
    public final long b(n55[] n55VarArr, boolean[] zArr, occ[] occVarArr, boolean[] zArr2, long j) throws Throwable {
        boolean z;
        boolean z2;
        byte[] bArr;
        ArrayList arrayList;
        byte[] bArr2;
        boolean[] zArr3;
        i1f i1fVar;
        yob yobVar;
        n55 n55Var;
        Object obj;
        boolean z3;
        boolean z4;
        n55[] n55VarArr2 = n55VarArr;
        long jG = j;
        a();
        kxa kxaVar = this.P0;
        i1f i1fVar2 = (i1f) kxaVar.a;
        yob yobVar2 = i1fVar2.b;
        boolean[] zArr4 = (boolean[]) kxaVar.c;
        int i = this.Z0;
        boolean z5 = false;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= n55VarArr2.length) {
                z2 = false;
                break;
            }
            n55 n55Var2 = n55VarArr2[i2];
            if (n55Var2 != null) {
                int iIndexOf = yobVar2.indexOf(n55Var2.b());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                if (Objects.equals(i1fVar2.a(iIndexOf).d[0].p, "application/x-itut-t35")) {
                    z2 = true;
                    break;
                }
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int length = n55VarArr2.length;
            bArr = null;
            arrayList = this.a1;
            if (i3 >= length) {
                break;
            }
            ?? r15 = occVarArr[i3];
            if (r15 == 0) {
                z4 = z5;
            } else {
                if (n55VarArr2[i3] == null || !zArr[i3]) {
                    z4 = z5;
                } else if (z2) {
                    z4 = z5;
                    if (r15 instanceof zs8) {
                    }
                } else {
                    z4 = z5;
                }
                if (r15 instanceof zs8) {
                    zs8 zs8Var = (zs8) r15;
                    arrayList.remove(zs8Var);
                    int i4 = zs8Var.a.a;
                    pa7.J(zArr4[i4]);
                    this.Z0--;
                    zArr4[i4] = z4;
                    int i5 = zs8Var.b.a;
                    pa7.J(zArr4[i5]);
                    this.Z0--;
                    zArr4[i5] = z4;
                } else {
                    int i6 = ((ixa) r15).a;
                    pa7.J(zArr4[i6]);
                    this.Z0--;
                    zArr4[i6] = z4;
                }
                occVarArr[i3] = 0;
            }
            i3++;
            z5 = z4;
        }
        boolean z6 = z5;
        boolean z7 = (!this.V0 ? !(jG == 0 || this.O0) : i == 0) ? z6 : true;
        boolean z8 = z6;
        boolean z9 = z8;
        ?? r9 = z8;
        while (r9 < n55VarArr2.length) {
            if (occVarArr[r9] != 0 || (n55Var = n55VarArr2[r9]) == null) {
                zArr3 = zArr4;
                i1fVar = i1fVar2;
                yobVar = yobVar2;
            } else {
                pa7.J(n55Var.length() == z ? z : z6);
                pa7.J(n55Var.e(z6 ? 1 : 0) == 0 ? z : false);
                int iIndexOf2 = yobVar2.indexOf(n55Var.b());
                if (iIndexOf2 < 0) {
                    iIndexOf2 = -1;
                }
                pa7.J(!zArr4[iIndexOf2]);
                boolean z10 = z;
                this.Z0++;
                zArr4[iIndexOf2] = z10;
                z9 = (z9 ? 1 : 0) | (n55Var.h().v ? 1 : 0);
                zArr3 = zArr4;
                ixa ixaVar = new ixa(this, iIndexOf2, n55Var.h().v);
                int i7 = iIndexOf2;
                if (Build.VERSION.SDK_INT < 37 || z2 || !qv8.k(n55Var.h().p)) {
                    i1fVar = i1fVar2;
                    yobVar = yobVar2;
                    obj = ixaVar;
                    break;
                }
                int i8 = 0;
                ?? r18 = z10;
                while (true) {
                    if (i8 >= i1fVar2.a) {
                        i1fVar = i1fVar2;
                        yobVar = yobVar2;
                        obj = ixaVar;
                        break;
                    }
                    rr5 rr5Var = i1fVar2.a(i8).d[0];
                    i1fVar = i1fVar2;
                    String str = rr5Var.p;
                    List list = rr5Var.s;
                    if (Objects.equals(str, "application/x-itut-t35") && !list.isEmpty()) {
                        byte[] bArr3 = (byte[]) list.get(0);
                        if (bArr3.length >= 5 && bArr3[0] == -75 && bArr3[r18] == 0 && bArr3[2] == -112 && bArr3[3] == 0 && bArr3[4] == (z3 = r18)) {
                            pa7.J((zArr3[i8] ? 1 : 0) ^ (z3 ? 1 : 0));
                            this.Z0 += z3 ? 1 : 0;
                            zArr3[i8] = z3;
                            yobVar = yobVar2;
                            zs8 zs8Var2 = new zs8(ixaVar, new ixa(this, i8, false), n55Var.h());
                            arrayList.add(zs8Var2);
                            obj = zs8Var2;
                            break;
                        }
                    }
                    i8++;
                    i1fVar2 = i1fVar;
                    yobVar2 = yobVar2;
                    r18 = 1;
                }
                occVarArr[r9] = obj;
                zArr2[r9] = true;
                if (!z7) {
                    ncc nccVar = this.J0[i7];
                    z7 = (nccVar.q + nccVar.s == 0 || nccVar.q(jG, true)) ? false : true;
                }
            }
            n55VarArr2 = n55VarArr;
            zArr4 = zArr3;
            i1fVar2 = i1fVar;
            yobVar2 = yobVar;
            z = true;
            z6 = false;
            r9++;
            z9 = z9;
        }
        if (this.X0 || !this.V0) {
            this.X0 = z9;
        }
        if (this.Z0 == 0) {
            this.e1 = false;
            this.W0 = false;
            this.X0 = false;
            ta0 ta0Var = this.z;
            if (ta0Var.I()) {
                for (ncc nccVar2 : this.J0) {
                    nccVar2.i();
                }
                x98 x98Var = (x98) ta0Var.d;
                x98Var.getClass();
                x98Var.a(false);
            } else {
                boolean z11 = false;
                this.g1 = false;
                ncc[] nccVarArr = this.J0;
                int length2 = nccVarArr.length;
                int i9 = 0;
                while (i9 < length2) {
                    nccVarArr[i9].p(z11);
                    i9++;
                    z11 = false;
                }
            }
        } else if (z7) {
            jG = g(jG);
            int i10 = 0;
            while (i10 < occVarArr.length) {
                ?? r5 = occVarArr[i10];
                if (r5 != 0) {
                    zArr2[i10] = true;
                    if (r5 instanceof zs8) {
                        zs8 zs8Var3 = (zs8) r5;
                        zs8Var3.e.clear();
                        bArr2 = bArr;
                        zs8Var3.g = bArr2;
                        zs8Var3.h = -9223372036854775807L;
                        zs8Var3.i = false;
                        zs8Var3.j = false;
                        zs8Var3.d.e();
                    } else {
                        bArr2 = bArr;
                    }
                } else {
                    bArr2 = bArr;
                }
                i10++;
                bArr = bArr2;
            }
        }
        this.V0 = true;
        return jG;
    }

    @Override // defpackage.up8
    public final void c() {
        this.Y0 = true;
    }

    @Override // defpackage.eyc
    public final long d() {
        return p();
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[RETURN] */
    @Override // defpackage.up8
    public final long e(long j, ysc yscVar) {
        a();
        if (!this.Q0.c()) {
            return 0L;
        }
        wsc wscVarF = this.Q0.f(j);
        long j2 = wscVarF.a.a;
        long j3 = wscVarF.b.a;
        long j4 = yscVar.b;
        long j5 = yscVar.a;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        String str = pqf.a;
        long j6 = j - j5;
        long j7 = Long.MAX_VALUE;
        long j8 = (((j5 ^ j) > 0L ? 1 : ((j5 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j8 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j8 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j8 = Long.MIN_VALUE;
        }
        long j9 = j + j4;
        long j10 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) < 0) | (((j ^ j9) > 0L ? 1 : ((j ^ j9) == 0L ? 0 : -1)) >= 0) ? j9 : ((j9 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j10 != Long.MIN_VALUE || j9 == Long.MIN_VALUE) && (j10 != Long.MAX_VALUE || j9 == Long.MAX_VALUE)) {
            j7 = j10;
        }
        boolean z = j8 <= j2 && j2 <= j7;
        boolean z2 = j8 <= j3 && j3 <= j7;
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j8;
        }
        return j2;
    }

    @Override // defpackage.up8
    public final void f() throws IOException {
        int iJ = this.d.j(this.T0);
        ta0 ta0Var = this.z;
        IOException iOException = (IOException) ta0Var.b;
        if (iOException != null) {
            throw iOException;
        }
        x98 x98Var = (x98) ta0Var.d;
        if (x98Var != null) {
            if (iJ == Integer.MIN_VALUE) {
                iJ = x98Var.a;
            }
            IOException iOException2 = x98Var.e;
            if (iOException2 != null && x98Var.f > iJ) {
                throw iOException2;
            }
        }
        if (this.g1 && !this.M0) {
            throw l0a.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2 A[LOOP:2: B:78:0x00f0->B:79:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111 A[LOOP:3: B:83:0x010f->B:84:0x0111, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x00ec, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x0107, please report this as an issue */
    @Override // defpackage.up8
    public final long g(long j) throws Throwable {
        int i;
        int i2;
        boolean zQ;
        for (zs8 zs8Var : this.a1) {
            zs8Var.e.clear();
            zs8Var.g = null;
            zs8Var.h = -9223372036854775807L;
            zs8Var.i = false;
            zs8Var.j = false;
            zs8Var.d.e();
        }
        a();
        boolean[] zArr = (boolean[]) this.P0.b;
        if (!this.Q0.c()) {
            j = 0;
        }
        this.W0 = false;
        boolean z = this.c1 == j;
        this.c1 = j;
        if (u()) {
            this.d1 = j;
            return j;
        }
        if (this.T0 == 7 || !(this.g1 || this.z.I())) {
            this.e1 = false;
            this.d1 = j;
            this.g1 = false;
            this.X0 = false;
            if (this.z.I()) {
                this.z.b = null;
                for (ncc nccVar : this.J0) {
                    nccVar.p(false);
                }
                break;
            }
            for (ncc nccVar2 : this.J0) {
                nccVar2.i();
            }
            x98 x98Var = (x98) this.z.d;
            x98Var.getClass();
            x98Var.a(false);
            return j;
        }
        int length = this.J0.length;
        for (int i3 = 0; i3 < length; i3++) {
            ncc nccVar3 = this.J0[i3];
            if (this.I0[i3].d.get() == fxa.a) {
                int i4 = nccVar3.q;
                if (nccVar3.s + i4 != 0 || !z) {
                    if (this.O0) {
                        synchronized (nccVar3) {
                            synchronized (nccVar3) {
                                nccVar3.s = 0;
                                lcc lccVar = nccVar3.a;
                                lccVar.e = lccVar.d;
                            }
                        }
                        int i5 = nccVar3.q;
                        if (i4 >= i5 && i4 <= nccVar3.p + i5) {
                            int i6 = nccVar3.x;
                            if (i6 == -1 || i4 < i6) {
                                int i7 = nccVar3.y;
                                if (i7 == -1 || i4 < i7) {
                                    nccVar3.t = Long.MIN_VALUE;
                                    nccVar3.s = i4 - i5;
                                    zQ = true;
                                }
                            }
                        }
                        zQ = false;
                    } else {
                        zQ = nccVar3.q(j, this.g1);
                    }
                    if (!zQ && (zArr[i3] || !this.N0)) {
                        this.e1 = false;
                        this.d1 = j;
                        this.g1 = false;
                        this.X0 = false;
                        if (this.z.I()) {
                            this.z.b = null;
                            while (i < r0) {
                                nccVar.p(false);
                            }
                            break;
                            break;
                        }
                        while (i2 < r1) {
                            nccVar2.i();
                        }
                        x98 x98Var2 = (x98) this.z.d;
                        x98Var2.getClass();
                        x98Var2.a(false);
                        return j;
                    }
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // defpackage.up8
    public final void h(long j) {
        long jH;
        long j2;
        int i;
        if (this.O0) {
            return;
        }
        a();
        if (u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.P0.c;
        int length = this.J0.length;
        int i2 = 0;
        while (i2 < length) {
            ncc nccVar = this.J0[i2];
            boolean z = zArr[i2];
            lcc lccVar = nccVar.a;
            synchronized (nccVar) {
                try {
                    int i3 = nccVar.p;
                    jH = -1;
                    if (i3 != 0) {
                        long[] jArr = nccVar.n;
                        int i4 = nccVar.r;
                        if (j < jArr[i4]) {
                            j2 = j;
                        } else {
                            j2 = j;
                            int iJ = nccVar.j(i4, (!z || (i = nccVar.s) == i3) ? i3 : i + 1, j2, false);
                            if (iJ != -1) {
                                jH = nccVar.h(iJ);
                            }
                        }
                    } else {
                        j2 = j;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            lccVar.a(jH);
            i2++;
            j = j2;
        }
    }

    @Override // defpackage.eyc
    public final boolean i() {
        boolean z;
        if (this.g1 || !this.z.I()) {
            return false;
        }
        nh2 nh2Var = this.Y;
        synchronized (nh2Var) {
            z = nh2Var.b;
        }
        return z;
    }

    @Override // defpackage.n95
    public final void j() {
        this.L0 = true;
        this.F0.post(this.Z);
    }

    @Override // defpackage.up8
    public final long k() {
        if (!this.Y0 && this.X0) {
            this.X0 = false;
            return this.c1;
        }
        if (!this.W0) {
            return -9223372036854775807L;
        }
        if (!this.g1 && s() <= this.f1) {
            return -9223372036854775807L;
        }
        this.W0 = false;
        return this.c1;
    }

    @Override // defpackage.up8
    public final void l(tp8 tp8Var, long j) {
        this.G0 = tp8Var;
        rr5 rr5Var = this.x;
        if (rr5Var == null) {
            this.Y.c();
            C();
        } else {
            n(0, 3).g(rr5Var);
            B(new j17(-9223372036854775807L, new long[]{0}, new long[]{0}));
            j();
            this.d1 = j;
        }
    }

    @Override // defpackage.up8
    public final i1f m() {
        a();
        return (i1f) this.P0.a;
    }

    @Override // defpackage.n95
    public final k1f n(int i, int i2) {
        return A(new jxa(i, false));
    }

    @Override // defpackage.eyc
    public final boolean o(da8 da8Var) {
        if (this.g1) {
            return false;
        }
        ta0 ta0Var = this.z;
        if (((IOException) ta0Var.b) != null || this.e1) {
            return false;
        }
        if ((this.M0 || this.x != null) && this.Z0 == 0) {
            return false;
        }
        boolean zC = this.Y.c();
        if (ta0Var.I()) {
            return zC;
        }
        C();
        return true;
    }

    @Override // defpackage.eyc
    public final long p() {
        long jT;
        boolean z;
        long j;
        a();
        if (this.g1 || this.Z0 == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.d1;
        }
        if (this.N0) {
            int length = this.J0.length;
            jT = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                kxa kxaVar = this.P0;
                if (((boolean[]) kxaVar.b)[i] && ((boolean[]) kxaVar.c)[i]) {
                    ncc nccVar = this.J0[i];
                    synchronized (nccVar) {
                        z = nccVar.z;
                    }
                    if (z) {
                        continue;
                    } else {
                        ncc nccVar2 = this.J0[i];
                        synchronized (nccVar2) {
                            j = nccVar2.w;
                        }
                        jT = Math.min(jT, j);
                    }
                }
            }
        } else {
            jT = Long.MAX_VALUE;
        }
        if (jT == Long.MAX_VALUE) {
            jT = t(false);
        }
        return jT == Long.MIN_VALUE ? this.c1 : jT;
    }

    @Override // defpackage.n95
    public final void q(xsc xscVar) {
        this.F0.post(new xu8(11, this, xscVar));
    }

    @Override // defpackage.eyc
    public final void r(long j) {
        boolean z;
        if (this.Z0 <= 0 || u()) {
            return;
        }
        boolean z2 = false;
        if (this.U0 != Long.MIN_VALUE) {
            a();
            boolean z3 = true;
            int i = 0;
            while (true) {
                ncc[] nccVarArr = this.J0;
                if (i >= nccVarArr.length) {
                    break;
                }
                kxa kxaVar = this.P0;
                if (((boolean[]) kxaVar.c)[i] && (((boolean[]) kxaVar.b)[i] || !this.N0)) {
                    ncc nccVar = nccVarArr[i];
                    synchronized (nccVar) {
                        z = nccVar.x != -1;
                    }
                    z3 &= z;
                }
                i++;
            }
            z2 = z3;
        }
        if (z2) {
            this.g1 = true;
        }
    }

    public final int s() {
        int i = 0;
        for (ncc nccVar : this.J0) {
            i += nccVar.q + nccVar.p;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long t(boolean z) {
        ncc nccVar;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.J0.length; i++) {
            if (z) {
                nccVar = this.J0[i];
                synchronized (nccVar) {
                    jMax = Math.max(jMax, nccVar.w);
                }
            } else {
                kxa kxaVar = this.P0;
                kxaVar.getClass();
                if (((boolean[]) kxaVar.c)[i]) {
                    nccVar = this.J0[i];
                    synchronized (nccVar) {
                    }
                    jMax = Math.max(jMax, nccVar.w);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    public final boolean u() {
        return this.d1 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        int i;
        int i2;
        su8 su8VarA;
        int i3;
        long j = this.y;
        if (this.h1 || this.M0 || !this.L0 || this.Q0 == null) {
            return;
        }
        int i4 = 0;
        for (ncc nccVar : this.J0) {
            if (nccVar.l() == null) {
                return;
            }
        }
        nh2 nh2Var = this.Y;
        synchronized (nh2Var) {
            nh2Var.b = false;
        }
        int length = this.J0.length;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = 1;
            if (i6 >= length) {
                break;
            }
            rr5 rr5VarL = this.J0[i6].l();
            rr5VarL.getClass();
            int iG = qv8.g(rr5VarL.p);
            if (iG == 1) {
                i3 = 3;
            } else if (iG == 2) {
                i3 = 4;
            } else if (iG != 3) {
                i3 = iG != 4 ? 0 : 2;
            } else {
                i3 = 1;
            }
            if (i5 == 1) {
                i = 3;
            } else if (i5 == 2) {
                i = 4;
            } else if (i5 != 3) {
                i = i5 != 4 ? 0 : 2;
            }
            if (i3 > i) {
                i7 = i6;
                i5 = iG;
            }
            i6++;
        }
        h1f[] h1fVarArr = new h1f[length];
        boolean[] zArr = new boolean[length];
        int i8 = 0;
        while (i8 < length) {
            rr5 rr5VarL2 = this.J0[i8].l();
            rr5VarL2.getClass();
            String str = rr5VarL2.p;
            boolean zH = qv8.h(str);
            boolean z = (zH || qv8.k(str)) ? i : i4;
            zArr[i8] = z;
            int i9 = i4;
            this.N0 = (this.N0 ? 1 : 0) | (z ? 1 : 0);
            this.O0 = (j != -9223372036854775807L && length == i && qv8.i(str)) ? i : i9;
            nu6 nu6Var = this.H0;
            if (nu6Var != null) {
                int i10 = nu6Var.a;
                if (zH || this.K0[i8].b) {
                    su8 su8Var = rr5VarL2.m;
                    if (su8Var == null) {
                        qu8[] qu8VarArr = new qu8[i];
                        qu8VarArr[i9] = nu6Var;
                        su8VarA = new su8(qu8VarArr);
                    } else {
                        qu8[] qu8VarArr2 = new qu8[i];
                        qu8VarArr2[i9] = nu6Var;
                        su8VarA = su8Var.a(qu8VarArr2);
                    }
                    qr5 qr5VarA = rr5VarL2.a();
                    qr5VarA.l = su8VarA;
                    rr5VarL2 = new rr5(qr5VarA);
                }
                if (zH && rr5VarL2.i == -1 && rr5VarL2.j == -1 && i10 != -1) {
                    qr5 qr5VarA2 = rr5VarL2.a();
                    qr5VarA2.i = i10;
                    rr5VarL2 = new rr5(qr5VarA2);
                }
            }
            int iE = this.c.e(rr5VarL2);
            qr5 qr5VarA3 = rr5VarL2.a();
            qr5VarA3.S = iE;
            rr5 rr5Var = new rr5(qr5VarA3);
            if (i8 != i7) {
                qr5 qr5VarA4 = rr5Var.a();
                qr5VarA4.m = Integer.toString(i7);
                rr5Var = new rr5(qr5VarA4);
            }
            h1fVarArr[i8] = new h1f(Integer.toString(i8), rr5Var);
            ncc nccVar2 = this.J0[i8];
            long j2 = this.U0;
            synchronized (nccVar2) {
                if (j2 != nccVar2.u) {
                    nccVar2.u = j2;
                    nccVar2.x = -1;
                    nccVar2.y = -1;
                    if (j2 == Long.MIN_VALUE || j2 > nccVar2.w) {
                        i2 = i8;
                        break;
                    }
                    int i11 = i9;
                    while (true) {
                        if (i11 >= nccVar2.p) {
                            i2 = i8;
                            break;
                        }
                        int iK = nccVar2.k(i11);
                        i2 = i8;
                        nccVar2.r(nccVar2.q + i11, nccVar2.m[iK], nccVar2.n[iK]);
                        if (nccVar2.x != -1) {
                            break;
                        }
                        i11++;
                        i8 = i2;
                    }
                } else {
                    i2 = i8;
                }
            }
            i8 = i2 + 1;
            i4 = i9;
            i = 1;
        }
        i1f i1fVar = new i1f(h1fVarArr);
        kxa kxaVar = new kxa();
        kxaVar.a = i1fVar;
        kxaVar.b = zArr;
        int i12 = i1fVar.a;
        kxaVar.c = new boolean[i12];
        kxaVar.d = new boolean[i12];
        this.P0 = kxaVar;
        if (this.O0 && this.R0 == -9223372036854775807L) {
            this.R0 = j;
            this.Q0 = new exa(this, this.Q0);
        }
        this.g.t(this.R0, this.Q0, this.S0);
        this.M0 = true;
        tp8 tp8Var = this.G0;
        tp8Var.getClass();
        tp8Var.a(this);
    }

    public final void w(int i) {
        a();
        kxa kxaVar = this.P0;
        boolean[] zArr = (boolean[]) kxaVar.d;
        if (zArr[i]) {
            return;
        }
        rr5 rr5Var = ((i1f) kxaVar.a).a(i).d[0];
        qp8 qp8Var = new qp8(qv8.g(rr5Var.p), rr5Var, pqf.R(this.c1), -9223372036854775807L);
        aq4 aq4Var = this.e;
        aq4Var.a(new bo1(16, aq4Var, qp8Var));
        zArr[i] = true;
    }

    public final void x(int i) {
        a();
        if (this.e1) {
            if ((!this.N0 || ((boolean[]) this.P0.b)[i]) && !this.J0[i].m(false)) {
                this.d1 = 0L;
                this.e1 = false;
                this.W0 = true;
                this.c1 = 0L;
                this.f1 = 0;
                for (ncc nccVar : this.J0) {
                    nccVar.p(false);
                }
                tp8 tp8Var = this.G0;
                tp8Var.getClass();
                tp8Var.j(this);
            }
        }
    }

    public final void y(hxa hxaVar, long j, long j2, boolean z) {
        r1e r1eVar = hxaVar.c;
        u98 u98Var = new u98(hxaVar.a, hxaVar.k, j);
        u98Var.f = r1eVar.c;
        u98Var.g = r1eVar.d;
        u98Var.c = j2;
        u98Var.d = r1eVar.b;
        v98 v98Var = new v98(u98Var);
        this.d.getClass();
        qp8 qp8Var = new qp8(-1, null, pqf.R(hxaVar.j), pqf.R(this.R0));
        aq4 aq4Var = this.e;
        aq4Var.a(new cq8(aq4Var, v98Var, qp8Var, 1));
        if (z) {
            return;
        }
        for (ncc nccVar : this.J0) {
            nccVar.p(false);
        }
        if (this.Z0 > 0) {
            tp8 tp8Var = this.G0;
            tp8Var.getClass();
            tp8Var.j(this);
        }
    }

    public final void z(hxa hxaVar, long j, long j2) {
        if (this.R0 == -9223372036854775807L && this.Q0 != null) {
            long jT = t(true);
            long j3 = jT == Long.MIN_VALUE ? 0L : jT + 10000;
            this.R0 = j3;
            this.g.t(j3, this.Q0, this.S0);
        }
        r1e r1eVar = hxaVar.c;
        u98 u98Var = new u98(hxaVar.a, hxaVar.k, j);
        u98Var.f = r1eVar.c;
        u98Var.g = r1eVar.d;
        u98Var.c = j2;
        u98Var.d = r1eVar.b;
        v98 v98Var = new v98(u98Var);
        this.d.getClass();
        qp8 qp8Var = new qp8(-1, null, pqf.R(hxaVar.j), pqf.R(this.R0));
        aq4 aq4Var = this.e;
        aq4Var.a(new cq8(aq4Var, v98Var, qp8Var, 0));
        this.g1 = true;
        tp8 tp8Var = this.G0;
        tp8Var.getClass();
        tp8Var.j(this);
    }
}
