package defpackage;

import android.os.Trace;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l46 {
    public int A;
    public int B;
    public boolean C;
    public final k46 D;
    public final ArrayList E;
    public boolean F;
    public kpd G;
    public lpd H;
    public opd I;
    public boolean J;
    public u8a K;
    public uv1 L;
    public final tf2 M;
    public f46 N;
    public wh5 O;
    public cfd P;
    public final og2 Q;
    public final pv2 R;
    public boolean S;
    public long T;
    public m46 U;
    public final taf a;
    public final lg2 b;
    public final lpd c;
    public final a89 d;
    public final uv1 e;
    public final uv1 f;
    public final kb6 g;
    public final rg2 h;
    public o46 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public o69 p;
    public boolean q;
    public boolean r;
    public q69 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final f77 n = new f77(1, false);
    public final ArrayList s = new ArrayList();
    public final f77 t = new f77(1, false);
    public u8a u = u8a.d;
    public final f77 x = new f77(1, false);
    public int z = -1;

    public l46(taf tafVar, lg2 lg2Var, lpd lpdVar, a89 a89Var, uv1 uv1Var, uv1 uv1Var2, kb6 kb6Var, rg2 rg2Var) {
        this.a = tafVar;
        this.b = lg2Var;
        this.c = lpdVar;
        this.d = a89Var;
        this.e = uv1Var;
        this.f = uv1Var2;
        this.g = kb6Var;
        this.h = rg2Var;
        this.C = lg2Var.g() || lg2Var.e();
        this.D = new k46(0, this);
        this.E = new ArrayList();
        kpd kpdVarG = lpdVar.g();
        kpdVarG.c();
        this.G = kpdVarG;
        lpd lpdVar2 = new lpd();
        if (lg2Var.g()) {
            lpdVar2.d();
        }
        if (lg2Var.e()) {
            lpdVar2.y = new q69();
        }
        this.H = lpdVar2;
        opd opdVarI = lpdVar2.i();
        opdVarI.e(true);
        this.I = opdVarI;
        this.M = new tf2(this, uv1Var);
        kpd kpdVarG2 = this.H.g();
        try {
            f46 f46VarA = kpdVarG2.a(0);
            kpdVarG2.c();
            this.N = f46VarA;
            this.O = new wh5();
            this.Q = new og2(this);
            pv2 pv2VarK = lg2Var.k();
            pv2 pv2VarD = D();
            this.R = pv2VarK.p0(pv2VarD == null ? nu4.a : pv2VarD);
        } catch (Throwable th) {
            kpdVarG2.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public static final g49 T(int i, l46 l46Var) {
        ArrayList arrayList;
        int i2 = l46Var.G.i(i);
        kpd kpdVar = l46Var.G;
        Object objP = kpdVar.p(kpdVar.b, i);
        if (i2 != 126665345 || !(objP instanceof e49)) {
            return null;
        }
        if (l46Var.G.d(i)) {
            ArrayList arrayList2 = new ArrayList();
            U(l46Var, arrayList2, i);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        kpd kpdVar2 = l46Var.G;
        Object objP2 = kpdVar2.p(kpdVar2.b, i);
        objP2.getClass();
        e49 e49Var = (e49) objP2;
        Object objH = l46Var.G.h(i, 0);
        f46 f46VarA = l46Var.G.a(i);
        int i3 = l46Var.G.b[(i * 5) + 3] + i;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = l46Var.s;
        int iH = ynb.H(i, arrayList4);
        if (iH < 0) {
            iH = -(iH + 1);
        }
        while (iH < arrayList4.size()) {
            db7 db7Var = (db7) arrayList4.get(iH);
            if (db7Var.b >= i3) {
                break;
            }
            arrayList3.add(new iy9(db7Var.a, db7Var.c));
            iH++;
        }
        return new g49(e49Var, objH, l46Var.h, l46Var.c, f46VarA, arrayList3, l46Var.n(i), arrayList);
    }

    public static final void U(l46 l46Var, ArrayList arrayList, int i) {
        int i2 = l46Var.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (l46Var.G.j(i3)) {
                g49 g49VarT = T(i3, l46Var);
                if (g49VarT != null) {
                    arrayList.add(g49VarT);
                }
            } else if (l46Var.G.d(i3)) {
                U(l46Var, arrayList, i3);
            }
            i3 += l46Var.G.b[(i3 * 5) + 3];
        }
    }

    public static final int V(l46 l46Var, int i, int i2, boolean z, int i3) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        Object[] objArr2;
        int i6;
        kpd kpdVar = l46Var.G;
        int i7 = 0;
        if (kpdVar.j(i2)) {
            int i8 = kpdVar.i(i2);
            Object objP = kpdVar.p(kpdVar.b, i2);
            if (i8 == 126665345 && (objP instanceof e49)) {
                g49 g49VarT = T(i2, l46Var);
                if (g49VarT != null) {
                    l46Var.b.c(g49VarT);
                    l46Var.M.e();
                    tf2 tf2Var = l46Var.M;
                    rg2 rg2Var = l46Var.h;
                    lg2 lg2Var = l46Var.b;
                    rr9 rr9Var = tf2Var.b.l;
                    rr9Var.U(ar9.d);
                    vfh.N(rr9Var, rg2Var, lg2Var, g49VarT);
                }
                if (!z || i2 == i) {
                    return kpdVar.o(i2);
                }
                tf2 tf2Var2 = l46Var.M;
                tf2Var2.c();
                tf2Var2.b();
                l46 l46Var2 = tf2Var2.a;
                int iO = l46Var2.G.l(i2) ? 1 : l46Var2.G.o(i2);
                if (iO > 0) {
                    tf2Var2.f(i3, iO);
                }
                return 0;
            }
            if (i8 == 206 && pa7.t(objP, wf2.e)) {
                Object objH = kpdVar.h(i2, 0);
                p46 p46Var = objH instanceof p46 ? (p46) objH : null;
                vpb vpbVar = p46Var != null ? p46Var.a : null;
                i46 i46Var = vpbVar instanceof i46 ? (i46) vpbVar : null;
                if (i46Var != null) {
                    x79 x79Var = i46Var.a.e;
                    Object[] objArr3 = x79Var.b;
                    long[] jArr2 = x79Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr2[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        l46 l46Var3 = (l46) objArr3[(i9 << 3) + i12];
                                        lpd lpdVar = l46Var3.c;
                                        if (lpdVar.b <= 0 || (lpdVar.a[1] & 67108864) == 0) {
                                            objArr2 = objArr3;
                                            i6 = i7;
                                        } else {
                                            rg2 rg2Var2 = l46Var3.h;
                                            synchronized (rg2Var2.d) {
                                                rg2Var2.s();
                                                w79 w79Var = rg2Var2.Y;
                                                rg2Var2.Y = rfc.j();
                                                try {
                                                    rg2Var2.K0.m0(w79Var);
                                                } catch (Throwable th) {
                                                    rg2Var2.Y = w79Var;
                                                    throw th;
                                                }
                                            }
                                            uv1 uv1Var = new uv1();
                                            l46Var3.L = uv1Var;
                                            kpd kpdVarG = l46Var3.c.g();
                                            try {
                                                l46Var3.G = kpdVarG;
                                                tf2 tf2Var3 = l46Var3.M;
                                                uv1 uv1Var2 = tf2Var3.b;
                                                try {
                                                    tf2Var3.b = uv1Var;
                                                    l46Var3.S(0);
                                                    tf2 tf2Var4 = l46Var3.M;
                                                    tf2Var4.b();
                                                    if (tf2Var4.c) {
                                                        objArr2 = objArr3;
                                                        tf2Var4.b.l.U(hr9.d);
                                                        if (tf2Var4.c) {
                                                            tf2Var4.d(false);
                                                            tf2Var4.d(false);
                                                            tf2Var4.b.l.U(qq9.d);
                                                            i6 = 0;
                                                            tf2Var4.c = false;
                                                        }
                                                        tf2Var3.b = uv1Var2;
                                                        kpdVarG.c();
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i6 = 0;
                                                    tf2Var3.b = uv1Var2;
                                                    kpdVarG.c();
                                                } catch (Throwable th2) {
                                                    tf2Var3.b = uv1Var2;
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                kpdVarG.c();
                                                throw th3;
                                            }
                                        }
                                        l46Var.b.u(l46Var3.h);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr3;
                                        i6 = i7;
                                        i10 = i10;
                                    }
                                    j >>= i10;
                                    i12++;
                                    i10 = i10;
                                    objArr3 = objArr2;
                                    i7 = i6;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            objArr3 = objArr;
                            i7 = i5;
                            jArr2 = jArr;
                        }
                    }
                }
                return kpdVar.o(i2);
            }
            i4 = 1;
            if (!kpdVar.l(i2)) {
                return kpdVar.o(i2);
            }
        } else {
            i4 = 1;
            if (kpdVar.d(i2)) {
                int i13 = kpdVar.b[(i2 * 5) + 3] + i2;
                int iV = 0;
                for (int i14 = i2 + 1; i14 < i13; i14 += kpdVar.b[(i14 * 5) + 3]) {
                    boolean zL = kpdVar.l(i14);
                    if (zL) {
                        l46Var.M.c();
                        tf2 tf2Var5 = l46Var.M;
                        Object objN = kpdVar.n(i14);
                        tf2Var5.c();
                        tf2Var5.h.add(objN);
                    }
                    iV += V(l46Var, i, i14, zL || z, zL ? 0 : i3 + iV);
                    if (zL) {
                        l46Var.M.c();
                        l46Var.M.a();
                    }
                }
                if (!kpdVar.l(i2)) {
                    return iV;
                }
            } else if (!kpdVar.l(i2)) {
                return kpdVar.o(i2);
            }
        }
        return i4;
    }

    public final u8a A() {
        return m();
    }

    public final ojb B() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ojb) ks0.f(1, arrayList);
    }

    public final boolean C() {
        if (!F() || this.w) {
            return true;
        }
        ojb ojbVarB = B();
        return (ojbVarB == null || (ojbVarB.b & 4) == 0) ? false : true;
    }

    public final og2 D() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        return this.S;
    }

    public final boolean F() {
        ojb ojbVarB;
        return (this.S || this.y || this.w || (ojbVarB = B()) == null || (ojbVarB.b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0132 A[Catch: all -> 0x00b1, TryCatch #9 {all -> 0x00b1, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0057, B:14:0x006a, B:23:0x00a7, B:84:0x020f, B:28:0x00b7, B:29:0x00ba, B:10:0x005c, B:12:0x0062, B:13:0x0067, B:30:0x00bb, B:32:0x00c1, B:35:0x00cb, B:38:0x00d5, B:40:0x00d9, B:41:0x00de, B:45:0x00e8, B:47:0x00f5, B:53:0x0115, B:55:0x0129, B:57:0x0132, B:59:0x013d, B:61:0x014e, B:66:0x0166, B:83:0x020c, B:112:0x0260, B:113:0x0263, B:64:0x0153, B:115:0x0265, B:116:0x0268, B:52:0x0113, B:48:0x0103, B:44:0x00e3, B:117:0x0269, B:54:0x0122), top: B:140:0x000a, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013d A[Catch: all -> 0x00b1, TryCatch #9 {all -> 0x00b1, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0057, B:14:0x006a, B:23:0x00a7, B:84:0x020f, B:28:0x00b7, B:29:0x00ba, B:10:0x005c, B:12:0x0062, B:13:0x0067, B:30:0x00bb, B:32:0x00c1, B:35:0x00cb, B:38:0x00d5, B:40:0x00d9, B:41:0x00de, B:45:0x00e8, B:47:0x00f5, B:53:0x0115, B:55:0x0129, B:57:0x0132, B:59:0x013d, B:61:0x014e, B:66:0x0166, B:83:0x020c, B:112:0x0260, B:113:0x0263, B:64:0x0153, B:115:0x0265, B:116:0x0268, B:52:0x0113, B:48:0x0103, B:44:0x00e3, B:117:0x0269, B:54:0x0122), top: B:140:0x000a, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153 A[Catch: all -> 0x00b1, TryCatch #9 {all -> 0x00b1, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0057, B:14:0x006a, B:23:0x00a7, B:84:0x020f, B:28:0x00b7, B:29:0x00ba, B:10:0x005c, B:12:0x0062, B:13:0x0067, B:30:0x00bb, B:32:0x00c1, B:35:0x00cb, B:38:0x00d5, B:40:0x00d9, B:41:0x00de, B:45:0x00e8, B:47:0x00f5, B:53:0x0115, B:55:0x0129, B:57:0x0132, B:59:0x013d, B:61:0x014e, B:66:0x0166, B:83:0x020c, B:112:0x0260, B:113:0x0263, B:64:0x0153, B:115:0x0265, B:116:0x0268, B:52:0x0113, B:48:0x0103, B:44:0x00e3, B:117:0x0269, B:54:0x0122), top: B:140:0x000a, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0164  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fa A[Catch: all -> 0x0222, TRY_LEAVE, TryCatch #1 {all -> 0x0222, blocks: (B:79:0x01ed, B:81:0x01fa, B:104:0x024e, B:105:0x0250), top: B:124:0x01ed }] */
    public final void G(ArrayList arrayList) {
        f49 f49Var;
        f46 f46Var;
        f46 f46VarL;
        ArrayList arrayList2;
        kpd kpdVarG;
        kpd kpdVarG2;
        kpd kpdVar;
        kpd kpdVar2;
        int[] iArr;
        q69 q69Var;
        q69 q69Var2;
        int[] iArr2;
        uv1 uv1Var;
        uv1 uv1Var2;
        uv1 uv1Var3;
        boolean z;
        boolean z2;
        uv1 uv1Var4;
        lpd lpdVar;
        kpd kpdVar3;
        l46 l46Var = this;
        lg2 lg2Var = l46Var.b;
        uv1 uv1Var5 = l46Var.f;
        tf2 tf2Var = l46Var.M;
        uv1 uv1Var6 = tf2Var.b;
        try {
            tf2Var.b = uv1Var5;
            uv1Var5.l.U(fr9.d);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                iy9 iy9Var = (iy9) arrayList.get(i2);
                g49 g49Var = (g49) iy9Var.a();
                g49 g49Var2 = (g49) iy9Var.b();
                f46 f46VarL2 = nk8.l(g49Var.e);
                lpd lpdVarA = npd.a(g49Var.d);
                int iC = lpdVarA.c(f46VarL2);
                b77 b77Var = new b77();
                tf2Var.b();
                rr9 rr9Var = tf2Var.b.l;
                rr9Var.U(nq9.d);
                vfh.M(rr9Var, i, b77Var, 1, f46VarL2);
                if (g49Var2 == null) {
                    if (lpdVarA == l46Var.H) {
                        if (!l46Var.I.w) {
                            wf2.a("Check failed");
                        }
                        l46Var.y();
                    }
                    kpd kpdVarG3 = lpdVarA.g();
                    try {
                        kpdVarG3.r(iC);
                        tf2Var.f = iC;
                        uv1 uv1Var7 = new uv1();
                        jr jrVar = new jr(l46Var, uv1Var7, kpdVarG3, g49Var, 15);
                        kpdVar3 = kpdVarG3;
                        try {
                            l46Var = this;
                            l46Var.M(null, null, null, pu4.a, jrVar);
                            uv1 uv1Var8 = tf2Var.b;
                            uv1Var8.getClass();
                            if (!uv1Var7.l.T()) {
                                rr9 rr9Var2 = uv1Var8.l;
                                rr9Var2.U(jq9.d);
                                vfh.M(rr9Var2, i, uv1Var7, 1, b77Var);
                            }
                            kpdVar3.c();
                            lg2Var = lg2Var;
                        } catch (Throwable th) {
                            th = th;
                            kpdVar3.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        kpdVar3 = kpdVarG3;
                    }
                } else {
                    f49 f49VarP = lg2Var.p(g49Var2);
                    lpd lpdVarA2 = f49VarP != null ? npd.a(f49VarP.a) : null;
                    lpd lpdVarA3 = lpdVarA2 == null ? npd.a(g49Var2.d) : lpdVarA2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (lpdVarA2 != null) {
                                                                    if (lpdVarA2.g) {
                                                                        wf2.a("use active SlotWriter to create an anchor location instead");
                                                                    }
                                                                    if (lpdVarA2.b <= 0) {
                                                                        epa.a("Parameter index is out of range");
                                                                    }
                                                                    ArrayList arrayList3 = lpdVarA2.w;
                                                                    f49Var = f49VarP;
                                                                    int iC2 = npd.c(arrayList3, 0, lpdVarA2.b);
                                                                    if (iC2 < 0) {
                                                                        f46Var = new f46(0);
                                                                        arrayList3.add(-(iC2 + 1), f46Var);
                                                                    } else {
                                                                        f46Var = (f46) arrayList3.get(iC2);
                                                                    }
                                                                    if (f46Var != null) {
                                                                    }
                                                                    f46VarL = nk8.l(f46Var);
                                                                    arrayList2 = new ArrayList();
                                                                    kpdVarG = lpdVarA3.g();
                                                                    ynb.F(kpdVarG, arrayList2, lpdVarA3.c(f46VarL));
                                                                    kpdVarG.c();
                                                                    if (arrayList2.isEmpty()) {
                                                                        f46VarL = f46VarL;
                                                                    } else {
                                                                        uv1Var4 = tf2Var.b;
                                                                        uv1Var4.getClass();
                                                                        if (!arrayList2.isEmpty()) {
                                                                            rr9 rr9Var3 = uv1Var4.l;
                                                                            rr9Var3.U(kq9.d);
                                                                            vfh.M(rr9Var3, 1, arrayList2, 0, b77Var);
                                                                        }
                                                                        lpdVar = l46Var.c;
                                                                        if (lpdVarA != lpdVar) {
                                                                            int iC3 = lpdVar.c(f46VarL2);
                                                                            l46Var.n0(iC3, l46Var.r0(iC3) + arrayList2.size());
                                                                        }
                                                                    }
                                                                    rr9 rr9Var4 = tf2Var.b.l;
                                                                    rr9Var4.U(lq9.d);
                                                                    int i3 = rr9Var4.q - rr9Var4.l[rr9Var4.m - 1].c;
                                                                    Object[] objArr = rr9Var4.p;
                                                                    objArr[i3] = f49Var;
                                                                    objArr[i3 + 1] = lg2Var;
                                                                    objArr[i3 + 3] = g49Var;
                                                                    objArr[i3 + 2] = g49Var2;
                                                                    kpdVarG2 = lpdVarA3.g();
                                                                    kpdVar2 = l46Var.G;
                                                                    iArr = l46Var.o;
                                                                    q69Var = l46Var.v;
                                                                    l46Var.o = null;
                                                                    l46Var.v = null;
                                                                    l46Var.G = kpdVarG2;
                                                                    int iC4 = lpdVarA3.c(nk8.l(f46VarL));
                                                                    kpdVarG2.r(iC4);
                                                                    tf2Var.f = iC4;
                                                                    uv1Var = new uv1();
                                                                    uv1Var2 = tf2Var.b;
                                                                    tf2Var.b = uv1Var;
                                                                    z = tf2Var.e;
                                                                    tf2Var.e = false;
                                                                    rg2 rg2Var = g49Var2.c;
                                                                    rg2 rg2Var2 = g49Var.c;
                                                                    Integer numValueOf = Integer.valueOf(kpdVarG2.g);
                                                                    kpdVar = kpdVarG2;
                                                                    iArr2 = iArr;
                                                                    q69Var2 = q69Var;
                                                                    z2 = z;
                                                                    uv1Var3 = uv1Var2;
                                                                    l46Var.M(rg2Var, rg2Var2, numValueOf, g49Var2.f, new jt3(26, l46Var, g49Var));
                                                                    tf2Var.e = z2;
                                                                    tf2Var.b = uv1Var3;
                                                                    uv1Var3.getClass();
                                                                    if (!uv1Var.l.T()) {
                                                                        rr9 rr9Var5 = uv1Var3.l;
                                                                        rr9Var5.U(jq9.d);
                                                                        vfh.M(rr9Var5, 0, uv1Var, 1, b77Var);
                                                                    }
                                                                    l46Var.G = kpdVar2;
                                                                    l46Var.o = iArr2;
                                                                    l46Var.v = q69Var2;
                                                                    kpdVar.c();
                                                                } else {
                                                                    f49Var = f49VarP;
                                                                    lg2Var = lg2Var;
                                                                }
                                                                l46Var.G = kpdVar2;
                                                                l46Var.o = iArr2;
                                                                l46Var.v = q69Var2;
                                                                kpdVar.c();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                kpdVar.c();
                                                                throw th;
                                                            }
                                                            tf2Var.b = uv1Var3;
                                                            uv1Var3.getClass();
                                                            if (!uv1Var.l.T()) {
                                                                rr9 rr9Var6 = uv1Var3.l;
                                                                rr9Var6.U(jq9.d);
                                                                vfh.M(rr9Var6, 0, uv1Var, 1, b77Var);
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            l46Var.G = kpdVar2;
                                                            l46Var.o = iArr2;
                                                            l46Var.v = q69Var2;
                                                            throw th;
                                                        }
                                                        tf2Var.e = z2;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        tf2Var.b = uv1Var3;
                                                        throw th;
                                                    }
                                                    l46Var.M(rg2Var, rg2Var2, numValueOf, g49Var2.f, new jt3(26, l46Var, g49Var));
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    tf2Var.e = z2;
                                                    throw th;
                                                }
                                                kpdVar = kpdVarG2;
                                                iArr2 = iArr;
                                                q69Var2 = q69Var;
                                                z2 = z;
                                                uv1Var3 = uv1Var2;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                uv1Var3 = uv1Var2;
                                                kpdVar = kpdVarG2;
                                                iArr2 = iArr;
                                                q69Var2 = q69Var;
                                                z2 = z;
                                            }
                                            rg2 rg2Var3 = g49Var.c;
                                            Integer numValueOf2 = Integer.valueOf(kpdVarG2.g);
                                        } catch (Throwable th8) {
                                            th = th8;
                                            uv1Var3 = uv1Var2;
                                            z2 = z;
                                            kpdVar = kpdVarG2;
                                            iArr2 = iArr;
                                            q69Var2 = q69Var;
                                        }
                                        tf2Var.e = false;
                                        rg2 rg2Var4 = g49Var2.c;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        q69Var2 = q69Var;
                                        uv1Var3 = uv1Var2;
                                        z2 = z;
                                        kpdVar = kpdVarG2;
                                        iArr2 = iArr;
                                    }
                                    tf2Var.b = uv1Var;
                                    z = tf2Var.e;
                                } catch (Throwable th10) {
                                    th = th10;
                                    q69Var2 = q69Var;
                                    uv1Var3 = uv1Var2;
                                    kpdVar = kpdVarG2;
                                    iArr2 = iArr;
                                }
                                l46Var.G = kpdVarG2;
                                int iC5 = lpdVarA3.c(nk8.l(f46VarL));
                                kpdVarG2.r(iC5);
                                tf2Var.f = iC5;
                                uv1Var = new uv1();
                                uv1Var2 = tf2Var.b;
                            } catch (Throwable th11) {
                                th = th11;
                                q69Var2 = q69Var;
                                kpdVar = kpdVarG2;
                                iArr2 = iArr;
                            }
                            kpdVar2 = l46Var.G;
                            iArr = l46Var.o;
                            q69Var = l46Var.v;
                            l46Var.o = null;
                            l46Var.v = null;
                        } catch (Throwable th12) {
                            th = th12;
                            kpdVar = kpdVarG2;
                        }
                        ynb.F(kpdVarG, arrayList2, lpdVarA3.c(f46VarL));
                        kpdVarG.c();
                        if (arrayList2.isEmpty()) {
                            uv1Var4 = tf2Var.b;
                            uv1Var4.getClass();
                            if (!arrayList2.isEmpty()) {
                                rr9 rr9Var7 = uv1Var4.l;
                                rr9Var7.U(kq9.d);
                                vfh.M(rr9Var7, 1, arrayList2, 0, b77Var);
                            }
                            lpdVar = l46Var.c;
                            if (lpdVarA != lpdVar) {
                                int iC6 = lpdVar.c(f46VarL2);
                                l46Var.n0(iC6, l46Var.r0(iC6) + arrayList2.size());
                            }
                        } else {
                            f46VarL = f46VarL;
                        }
                        rr9 rr9Var8 = tf2Var.b.l;
                        rr9Var8.U(lq9.d);
                        int i4 = rr9Var8.q - rr9Var8.l[rr9Var8.m - 1].c;
                        Object[] objArr2 = rr9Var8.p;
                        objArr2[i4] = f49Var;
                        objArr2[i4 + 1] = lg2Var;
                        objArr2[i4 + 3] = g49Var;
                        objArr2[i4 + 2] = g49Var2;
                        kpdVarG2 = lpdVarA3.g();
                    } catch (Throwable th13) {
                        kpdVarG.c();
                        throw th13;
                    }
                    f46Var = g49Var2.e;
                    f46VarL = nk8.l(f46Var);
                    arrayList2 = new ArrayList();
                    kpdVarG = lpdVarA3.g();
                }
                tf2Var.b.l.U(hr9.d);
                i2++;
                size = size;
                lg2Var = lg2Var;
                i = 0;
            }
            tf2Var.b();
            tf2Var.b.l.U(rq9.d);
            tf2Var.f = 0;
            tf2Var.b = uv1Var6;
        } catch (Throwable th14) {
            tf2Var.b = uv1Var6;
            throw th14;
        }
    }

    public final void H(e49 e49Var, u8a u8aVar, Object obj, boolean z) {
        d0(126665345, e49Var);
        J();
        q0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                opd.y(this.I);
            }
            boolean z2 = (this.S || pa7.t(this.G.f(), u8aVar)) ? false : true;
            if (z2) {
                P(u8aVar);
            }
            a0(wf2.c, 202, u8aVar, 0);
            this.K = null;
            if (!this.S || z) {
                boolean z3 = this.w;
                this.w = z2;
                cgg.F(this, new dd2(new o14(23, e49Var, obj), true, -59194059));
                this.w = z3;
            } else {
                this.J = true;
                opd opdVar = this.I;
                this.b.m(new g49(e49Var, obj, this.h, this.H, opdVar.b(opdVar.F(opdVar.b, opdVar.v)), pu4.a, m(), null));
            }
            r(false);
            this.K = null;
            this.T = j;
            r(false);
        } catch (Throwable th) {
            try {
                xo1.S(th, new h46(1, this));
                throw th;
            } catch (Throwable th2) {
                r(false);
                this.K = null;
                this.T = j;
                r(false);
                throw th2;
            }
        }
    }

    public final Object I(Object obj, Object obj2) {
        kpd kpdVar = this.G;
        int i = kpdVar.g;
        Object objL = ynb.L(i < kpdVar.h ? kpdVar.p(kpdVar.b, i) : null, obj, obj2);
        return objL == null ? new tg7(obj, obj2) : objL;
    }

    public final Object J() {
        boolean z = this.S;
        i8c i8cVar = sf2.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof f0c)) {
                return objM;
            }
        } else if (this.r) {
            wf2.a("A call to createNode(), emitNode() or useNode() expected");
            return i8cVar;
        }
        return i8cVar;
    }

    public final List K() {
        lg2 lg2Var = this.b;
        kg2 kg2VarI = lg2Var.i();
        rg2 rg2Var = kg2VarI != null ? (rg2) kg2VarI : null;
        if (rg2Var != null) {
            lpd lpdVar = rg2Var.f;
            kpd kpdVarG = npd.a(lpdVar).g();
            try {
                Integer numV = cn1.v(kpdVarG, lg2Var, 0, kpdVarG.c);
                kpdVarG.c();
                if (numV != null) {
                    kpd kpdVarG2 = npd.a(lpdVar).g();
                    try {
                        return s72.Q0(cn1.W(kpdVarG2, numV.intValue(), 0), rg2Var.K0.K());
                    } finally {
                        kpdVarG2.c();
                    }
                }
            } catch (Throwable th) {
                kpdVarG.c();
                throw th;
            }
        }
        return pu4.a;
    }

    public final int L(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0024, B:12:0x002d, B:11:0x002a, B:15:0x0034, B:20:0x0040, B:22:0x0048, B:24:0x004e, B:25:0x0052, B:26:0x0053, B:28:0x0059, B:21:0x0044), top: B:33:0x0005, inners: #1 }] */
    public final Object M(rg2 rg2Var, rg2 rg2Var2, Integer num, List list, x16 x16Var) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                iy9 iy9Var = (iy9) list.get(i2);
                ojb ojbVar = (ojb) iy9Var.a();
                Object objB = iy9Var.b();
                if (objB != null) {
                    l0(ojbVar, objB);
                } else {
                    l0(ojbVar, null);
                }
            }
            if (rg2Var == null) {
                objInvoke = x16Var.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (rg2Var2 == null || rg2Var2 == rg2Var || iIntValue < 0) {
                    objInvoke = x16Var.invoke();
                } else {
                    rg2Var.G0 = rg2Var2;
                    rg2Var.H0 = iIntValue;
                    try {
                        objInvoke = x16Var.invoke();
                        rg2Var.G0 = null;
                        rg2Var.H0 = 0;
                    } catch (Throwable th) {
                        rg2Var.G0 = null;
                        rg2Var.H0 = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = x16Var.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l46.N():void");
    }

    public final void O() {
        S(this.G.g);
        tf2 tf2Var = this.M;
        tf2Var.d(false);
        tf2Var.e();
        tf2Var.b.l.U(dr9.d);
        int i = tf2Var.f;
        kpd kpdVar = tf2Var.a.G;
        tf2Var.f = kpdVar.b[(kpdVar.g * 5) + 3] + i;
    }

    public final void P(u8a u8aVar) {
        q69 q69Var = this.v;
        if (q69Var == null) {
            q69Var = new q69();
            this.v = q69Var;
        }
        q69Var.i(this.G.g, u8aVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void Q(int i, int i2, int i3) {
        kpd kpdVar = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (kpdVar.q(i) == i2) {
                i3 = i2;
            } else if (kpdVar.q(i2) == i) {
                i3 = i;
            } else if (kpdVar.q(i) == kpdVar.q(i2)) {
                i3 = kpdVar.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = kpdVar.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = kpdVar.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = kpdVar.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = kpdVar.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = kpdVar.q(iQ5)) {
                    i3 = kpdVar.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (kpdVar.l(i)) {
                this.M.a();
            }
            i = kpdVar.q(i);
        }
        q(i2, i3);
    }

    public final Object R() {
        boolean z = this.S;
        i8c i8cVar = sf2.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof f0c)) {
                return objM instanceof p46 ? ((p46) objM).a : objM;
            }
        } else if (this.r) {
            wf2.a("A call to createNode(), emitNode() or useNode() expected");
            return i8cVar;
        }
        return i8cVar;
    }

    public final void S(int i) {
        boolean zL = this.G.l(i);
        tf2 tf2Var = this.M;
        if (zL) {
            tf2Var.c();
            Object objN = this.G.n(i);
            tf2Var.c();
            tf2Var.h.add(objN);
        }
        V(this, i, i, zL, 0);
        tf2Var.c();
        if (zL) {
            tf2Var.a();
        }
    }

    public final boolean W(int i, boolean z) {
        ojb ojbVarB;
        if ((i & 1) == 0 && (this.S || this.y)) {
            cfd cfdVar = this.P;
            if (cfdVar != null && (ojbVarB = B()) != null && cfdVar.b()) {
                int i2 = ojbVarB.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                ojbVarB.b = i3;
                ojbVarB.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                rr9 rr9Var = this.M.b.l;
                rr9Var.U(cr9.d);
                vfh.L(rr9Var, 0, ojbVarB);
                this.b.t(ojbVarB);
                return false;
            }
        } else if (!z && F()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void X() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        kpd kpdVar = this.G;
        int iG = kpdVar.g();
        int[] iArr = kpdVar.b;
        int i = kpdVar.g;
        Object objP = i < kpdVar.h ? kpdVar.p(iArr, i) : null;
        Object objF = kpdVar.f();
        int i2 = this.m;
        i8c i8cVar = sf2.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(i8cVar)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            e0(null, (iArr[(kpdVar.g * 5) + 1] & 1073741824) != 0);
            N();
            kpdVar.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(i8cVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        e0(null, (iArr[(kpdVar.g * 5) + 1] & 1073741824) != 0);
        N();
        kpdVar.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void Y() {
        kpd kpdVar = this.G;
        int i = kpdVar.i;
        this.l = i >= 0 ? kpdVar.b[(i * 5) + 1] & 67108863 : 0;
        kpdVar.t();
    }

    public final void Z() {
        if (this.l != 0) {
            wf2.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        ojb ojbVarB = B();
        if (ojbVarB != null) {
            int i = ojbVarB.b;
            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                ojbVarB.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            Y();
        } else {
            N();
        }
    }

    public final void a() {
        j();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        wh5 wh5Var = this.O;
        wh5Var.m.R();
        wh5Var.l.R();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        kpd kpdVar = this.G;
        if (!kpdVar.f) {
            kpdVar.c();
        }
        if (this.I.w) {
            return;
        }
        y();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x0315  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0321  */
    /* JADX WARN: Code duplicated, block: B:174:0x0328  */
    /* JADX WARN: Code duplicated, block: B:176:0x032b  */
    /* JADX WARN: Code duplicated, block: B:177:0x032d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0359  */
    /* JADX WARN: Code duplicated, block: B:182:0x035b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void a0(Object obj, int i, Object obj2, int i2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        o46 o46Var;
        o46 o46Var2;
        ArrayList arrayList;
        q69 q69Var;
        int i3;
        Object objValueOf;
        w79 w79Var;
        Object objG;
        i79 i79Var;
        opd opdVar;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        kpd kpdVar;
        int[] iArr;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        kpd kpdVar2;
        int i12;
        Object objP;
        opd opdVar2;
        int i13;
        o46 o46Var3;
        Object obj4 = obj;
        if (this.r) {
            wf2.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i14 = this.m;
        Object obj5 = sf2.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i14);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i14);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                opdVar2 = this.I;
                i13 = opdVar2.t;
                if (z) {
                    opdVar2.R(obj5, obj5, true, i);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    opdVar2.R(obj4, obj2, false, i);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    opdVar2.R(obj4, obj5, false, i);
                }
                o46Var3 = this.j;
                if (o46Var3 != null) {
                    int i15 = (-2) - i13;
                    oo7 oo7Var = new oo7(-1, i, i15, -1);
                    o46Var3.e.i(i15, new ef6(-1, this.k - o46Var3.b, 0));
                    o46Var3.d.add(oo7Var);
                }
                x(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    kpdVar2 = this.G;
                    i12 = kpdVar2.g;
                    if (i12 < kpdVar2.h) {
                        objP = kpdVar2.p(kpdVar2.b, i12);
                    } else {
                        objP = null;
                    }
                    if (pa7.t(obj4, objP)) {
                        e0(obj2, z);
                        z3 = z2;
                    }
                }
                kpdVar = this.G;
                iArr = kpdVar.b;
                arrayList2 = new ArrayList();
                if (kpdVar.k <= 0) {
                    i9 = kpdVar.g;
                    while (i9 < kpdVar.h) {
                        int i16 = i9 * 5;
                        int i17 = iArr[i16];
                        Object objP2 = kpdVar.p(iArr, i9);
                        i10 = iArr[i16 + 1];
                        if ((i10 & 1073741824) != 0) {
                            i11 = 1;
                        } else {
                            i11 = i10 & 67108863;
                        }
                        arrayList2.add(new oo7(objP2, i17, i9, i11));
                        i9 += iArr[i16 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new o46(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            o46Var = this.j;
            if (o46Var != null) {
                arrayList = o46Var.d;
                q69Var = o46Var.e;
                i3 = o46Var.b;
                if (obj4 != null) {
                    objValueOf = new tg7(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                w79Var = ((w59) o46Var.f.getValue()).a;
                objG = w79Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof i79) {
                    i79Var = (i79) objG;
                    Object objM = i79Var.m(0);
                    if (i79Var.d()) {
                        w79Var.k(objValueOf);
                    }
                    if (i79Var.b == 1) {
                        w79Var.m(objValueOf, i79Var.a());
                    }
                    objG = objM;
                } else {
                    w79Var.k(objValueOf);
                }
                oo7 oo7Var2 = (oo7) objG;
                if (!z3 || oo7Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        opd opdVarI = this.H.i();
                        this.I = opdVarI;
                        opdVarI.N();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    opdVar = this.I;
                    int i18 = opdVar.t;
                    if (z) {
                        opdVar.R(obj5, obj5, true, i);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        opdVar.R(obj5, obj2, false, i);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        opdVar.R(obj3, obj5, false, i);
                    }
                    this.N = this.I.b(i18);
                    int i19 = (-2) - i18;
                    oo7 oo7Var3 = new oo7(-1, i, i19, -1);
                    q69Var.i(i19, new ef6(-1, this.k - i3, i4));
                    arrayList.add(oo7Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    o46Var2 = new o46(i5, arrayList3);
                } else {
                    int i20 = oo7Var2.c;
                    arrayList.add(oo7Var2);
                    ef6 ef6Var = (ef6) q69Var.b(i20);
                    this.k = (ef6Var != null ? ef6Var.b : -1) + i3;
                    ef6 ef6Var2 = (ef6) q69Var.b(i20);
                    int i21 = ef6Var2 != null ? ef6Var2.a : -1;
                    int i22 = o46Var.c;
                    int i23 = i21 - i22;
                    int i24 = 8;
                    if (i21 <= i22) {
                        i6 = i23;
                        if (i22 > i21) {
                            Object[] objArr3 = q69Var.c;
                            long[] jArr = q69Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                ef6 ef6Var3 = (ef6) objArr3[(i25 << 3) + i27];
                                                int i28 = ef6Var3.a;
                                                if (i28 == i21) {
                                                    ef6Var3.a = i22;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i21 + 1 <= i28 && i28 < i22) {
                                                        ef6Var3.a = i28 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i27++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i26 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = q69Var.c;
                        long[] jArr2 = q69Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i29 = 0;
                            while (true) {
                                long j2 = jArr2[i29];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if ((j2 & 255) < 128) {
                                            i8 = i24;
                                            ef6 ef6Var4 = (ef6) objArr4[(i29 << 3) + i31];
                                            i7 = i23;
                                            int i32 = ef6Var4.a;
                                            if (i32 == i21) {
                                                ef6Var4.a = i22;
                                            } else if (i22 <= i32 && i32 < i21) {
                                                ef6Var4.a = i32 + 1;
                                            }
                                        } else {
                                            i7 = i23;
                                            i8 = i24;
                                        }
                                        j2 >>= i8;
                                        i31++;
                                        i24 = i8;
                                        i23 = i7;
                                    }
                                    i6 = i23;
                                    if (i30 != i24) {
                                        break;
                                    }
                                } else {
                                    i6 = i23;
                                }
                                if (i29 == length2) {
                                    break;
                                }
                                i29++;
                                i23 = i6;
                                i24 = 8;
                            }
                        } else {
                            i6 = i23;
                        }
                    }
                    tf2 tf2Var = this.M;
                    tf2Var.f = (i20 - tf2Var.a.G.g) + tf2Var.f;
                    this.G.r(i20);
                    if (i6 > 0) {
                        tf2Var.d(false);
                        tf2Var.e();
                        rr9 rr9Var = tf2Var.b.l;
                        rr9Var.U(yq9.d);
                        rr9Var.n[rr9Var.o - rr9Var.l[rr9Var.m - 1].b] = i6;
                    }
                    e0(obj2, z);
                    o46Var2 = null;
                }
            } else {
                o46Var2 = null;
            }
            x(z, o46Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            opdVar2 = this.I;
            i13 = opdVar2.t;
            if (z) {
                opdVar2.R(obj5, obj5, true, i);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                opdVar2.R(obj4, obj2, false, i);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                opdVar2.R(obj4, obj5, false, i);
            }
            o46Var3 = this.j;
            if (o46Var3 != null) {
                int i110 = (-2) - i13;
                oo7 oo7Var4 = new oo7(-1, i, i110, -1);
                o46Var3.e.i(i110, new ef6(-1, this.k - o46Var3.b, 0));
                o46Var3.d.add(oo7Var4);
            }
            x(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                kpdVar2 = this.G;
                i12 = kpdVar2.g;
                if (i12 < kpdVar2.h) {
                    objP = kpdVar2.p(kpdVar2.b, i12);
                } else {
                    objP = null;
                }
                if (pa7.t(obj4, objP)) {
                    e0(obj2, z);
                    z3 = z2;
                }
            }
            kpdVar = this.G;
            iArr = kpdVar.b;
            arrayList2 = new ArrayList();
            if (kpdVar.k <= 0) {
                i9 = kpdVar.g;
                while (i9 < kpdVar.h) {
                    int i111 = i9 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = kpdVar.p(iArr, i9);
                    i10 = iArr[i111 + 1];
                    if ((i10 & 1073741824) != 0) {
                        i11 = 1;
                    } else {
                        i11 = i10 & 67108863;
                    }
                    arrayList2.add(new oo7(objP3, i112, i9, i11));
                    i9 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new o46(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        o46Var = this.j;
        if (o46Var != null) {
            arrayList = o46Var.d;
            q69Var = o46Var.e;
            i3 = o46Var.b;
            if (obj4 != null) {
                objValueOf = new tg7(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            w79Var = ((w59) o46Var.f.getValue()).a;
            objG = w79Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof i79) {
                i79Var = (i79) objG;
                Object objM2 = i79Var.m(0);
                if (i79Var.d()) {
                    w79Var.k(objValueOf);
                }
                if (i79Var.b == 1) {
                    w79Var.m(objValueOf, i79Var.a());
                }
                objG = objM2;
            } else {
                w79Var.k(objValueOf);
            }
            oo7 oo7Var5 = (oo7) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                opd opdVarI2 = this.H.i();
                this.I = opdVarI2;
                opdVarI2.N();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            opdVar = this.I;
            int i113 = opdVar.t;
            if (z) {
                opdVar.R(obj5, obj5, true, i);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                opdVar.R(obj5, obj2, false, i);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                opdVar.R(obj3, obj5, false, i);
            }
            this.N = this.I.b(i113);
            int i114 = (-2) - i113;
            oo7 oo7Var6 = new oo7(-1, i, i114, -1);
            q69Var.i(i114, new ef6(-1, this.k - i3, i4));
            arrayList.add(oo7Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            o46Var2 = new o46(i5, arrayList4);
        } else {
            o46Var2 = null;
        }
        x(z, o46Var2);
    }

    public final void b(l26 l26Var, Object obj) {
        if (this.S) {
            rr9 rr9Var = this.O.l;
            rr9Var.U(nr9.d);
            vfh.L(rr9Var, 0, obj);
            z7f.t(2, l26Var);
            vfh.L(rr9Var, 1, l26Var);
            return;
        }
        tf2 tf2Var = this.M;
        tf2Var.b();
        rr9 rr9Var2 = tf2Var.b.l;
        rr9Var2.U(nr9.d);
        z7f.t(2, l26Var);
        vfh.M(rr9Var2, 0, obj, 1, l26Var);
    }

    public final void b0() {
        a0(null, -127, null, 0);
    }

    public final boolean c(char c) {
        Object objJ = J();
        if ((objJ instanceof Character) && c == ((Character) objJ).charValue()) {
            return false;
        }
        q0(Character.valueOf(c));
        return true;
    }

    public final void c0(int i, dq9 dq9Var) {
        a0(dq9Var, i, null, 0);
    }

    public final boolean d(float f) {
        Object objJ = J();
        if ((objJ instanceof Float) && f == ((Number) objJ).floatValue()) {
            return false;
        }
        q0(Float.valueOf(f));
        return true;
    }

    public final void d0(int i, Object obj) {
        a0(obj, i, null, 0);
    }

    public final boolean e(int i) {
        Object objJ = J();
        if ((objJ instanceof Integer) && i == ((Number) objJ).intValue()) {
            return false;
        }
        q0(Integer.valueOf(i));
        return true;
    }

    public final void e0(Object obj, boolean z) {
        if (z) {
            kpd kpdVar = this.G;
            if (kpdVar.k <= 0) {
                if ((kpdVar.b[(kpdVar.g * 5) + 1] & 1073741824) == 0) {
                    epa.a("Expected a node group");
                }
                kpdVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            tf2 tf2Var = this.M;
            tf2Var.getClass();
            tf2Var.d(false);
            rr9 rr9Var = tf2Var.b.l;
            rr9Var.U(mr9.d);
            vfh.L(rr9Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean f(long j) {
        Object objJ = J();
        if ((objJ instanceof Long) && j == ((Number) objJ).longValue()) {
            return false;
        }
        q0(Long.valueOf(j));
        return true;
    }

    public final void f0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            a0(null, i, null, 0);
            return;
        }
        if (this.r) {
            wf2.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        kpd kpdVar = this.G;
        boolean z = this.S;
        i8c i8cVar = sf2.a;
        if (z) {
            kpdVar.k++;
            this.I.R(i8cVar, i8cVar, false, i);
            x(false, null);
            return;
        }
        if (kpdVar.g() == i && ((i3 = kpdVar.g) >= kpdVar.h || (kpdVar.b[(i3 * 5) + 1] & 536870912) == 0)) {
            kpdVar.u();
            x(false, null);
            return;
        }
        if (kpdVar.k <= 0 && (i2 = kpdVar.g) != kpdVar.h) {
            int i4 = this.k;
            O();
            this.M.f(i4, kpdVar.s());
            ynb.g0(i2, kpdVar.g, this.s);
        }
        kpdVar.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            opd opdVarI = this.H.i();
            this.I = opdVarI;
            opdVarI.N();
            this.J = false;
            this.K = null;
        }
        opd opdVar = this.I;
        opdVar.d();
        int i5 = opdVar.t;
        opdVar.R(i8cVar, i8cVar, false, i);
        this.N = opdVar.b(i5);
        x(false, null);
    }

    public final boolean g(Object obj) {
        if (pa7.t(J(), obj)) {
            return false;
        }
        q0(obj);
        return true;
    }

    public final void g0(int i) {
        a0(null, i, null, 0);
    }

    public final boolean h(boolean z) {
        Object objJ = J();
        if ((objJ instanceof Boolean) && z == ((Boolean) objJ).booleanValue()) {
            return false;
        }
        q0(Boolean.valueOf(z));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final l46 h0(int i) {
        ojb ojbVar;
        boolean z;
        f0(i);
        boolean z2 = this.S;
        kb6 kb6Var = this.g;
        ArrayList arrayList = this.E;
        rg2 rg2Var = this.h;
        if (z2) {
            ojb ojbVar2 = new ojb(rg2Var);
            arrayList.add(ojbVar2);
            q0(ojbVar2);
            ojbVar2.e = this.B;
            ojbVar2.b &= -17;
            kb6Var.l();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iH = ynb.H(i2, arrayList2);
        db7 db7Var = iH >= 0 ? (db7) arrayList2.remove(iH) : null;
        Object objM = this.G.m();
        if (pa7.t(objM, sf2.a)) {
            ojbVar = new ojb(rg2Var);
            q0(ojbVar);
        } else {
            objM.getClass();
            ojbVar = (ojb) objM;
        }
        if (db7Var == null) {
            int i3 = ojbVar.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                ojbVar.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = ojbVar.b;
        ojbVar.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(ojbVar);
        ojbVar.e = this.B;
        ojbVar.b &= -17;
        kb6Var.l();
        int i5 = ojbVar.b;
        if ((i5 & 256) != 0) {
            ojbVar.b = (i5 & (-257)) | 512;
            rr9 rr9Var = this.M.b.l;
            rr9Var.U(ir9.d);
            vfh.L(rr9Var, 0, ojbVar);
            if (!this.y) {
                int i6 = ojbVar.b;
                if ((i6 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    ojbVar.b = i6 | UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
            }
        }
        return this;
    }

    public final boolean i(Object obj) {
        if (J() == obj) {
            return false;
        }
        q0(obj);
        return true;
    }

    public final void i0(Object obj) {
        if (!this.S && this.G.g() == 207 && !pa7.t(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        a0(null, 207, obj, 0);
    }

    public final void j() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        tf2 tf2Var = this.M;
        tf2Var.c = false;
        tf2Var.d.b = 0;
        tf2Var.f = 0;
        tf2Var.e = true;
        tf2Var.g = 0;
        tf2Var.h.clear();
        tf2Var.i = -1;
        tf2Var.j = -1;
        tf2Var.k = -1;
        tf2Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void j0() {
        a0(null, 125, null, 2);
        this.r = true;
    }

    public final Object k(b1b b1bVar) {
        return od4.B(m(), b1bVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void k0() {
        this.m = 0;
        this.G = this.c.g();
        a0(null, 100, null, 0);
        lg2 lg2Var = this.b;
        lg2Var.w();
        u8a u8aVarJ = lg2Var.j();
        this.x.e(this.w ? 1 : 0);
        this.w = g(u8aVarJ);
        this.K = null;
        if (!this.q) {
            this.q = lg2Var.f();
        }
        boolean zG = this.C;
        if (!zG) {
            zG = lg2Var.g();
            this.C = zG;
        }
        if (zG) {
            pr4 pr4Var = qg2.a;
            pr4Var.getClass();
            u8aVarJ = u8aVarJ.i(pr4Var, new q1e(D()));
        }
        this.u = u8aVarJ;
        Set set = (Set) od4.B(u8aVarJ, i57.a);
        if (set != null) {
            set.add(z());
            lg2Var.r(set);
        }
        a0(null, Long.hashCode(lg2Var.h()), null, 0);
    }

    public final void l(x16 x16Var) {
        if (!this.r) {
            wf2.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            wf2.a("createNode() can only be called when inserting");
        }
        f77 f77Var = this.n;
        int i = f77Var.a[f77Var.b - 1];
        opd opdVar = this.I;
        f46 f46VarB = opdVar.b(opdVar.v);
        this.l++;
        wh5 wh5Var = this.O;
        rr9 rr9Var = wh5Var.l;
        rr9Var.U(vq9.e);
        vfh.L(rr9Var, 0, x16Var);
        rr9Var.n[rr9Var.o - rr9Var.l[rr9Var.m - 1].b] = i;
        vfh.L(rr9Var, 1, f46VarB);
        rr9 rr9Var2 = wh5Var.m;
        rr9Var2.U(vq9.f);
        rr9Var2.n[rr9Var2.o - rr9Var2.l[rr9Var2.m - 1].b] = i;
        vfh.L(rr9Var2, 0, f46VarB);
    }

    public final boolean l0(ojb ojbVar, Object obj) {
        f46 f46Var = ojbVar.c;
        if (f46Var == null) {
            return false;
        }
        int iC = this.G.a.c(nk8.l(f46Var));
        if (!this.F || iC < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iH = ynb.H(iC, arrayList);
        if (iH < 0) {
            int i = -(iH + 1);
            if (!(obj instanceof mx3)) {
                obj = null;
            }
            arrayList.add(i, new db7(ojbVar, iC, obj));
            return true;
        }
        db7 db7Var = (db7) arrayList.get(iH);
        if (!(obj instanceof mx3)) {
            db7Var.c = null;
            return true;
        }
        Object obj2 = db7Var.c;
        if (obj2 == null) {
            db7Var.c = obj;
            return true;
        }
        if (obj2 instanceof x79) {
            ((x79) obj2).e(obj);
            return true;
        }
        x79 x79Var = mec.a;
        x79 x79Var2 = new x79(2);
        x79Var2.l(obj2);
        x79Var2.l(obj);
        db7Var.c = x79Var2;
        return true;
    }

    public final u8a m() {
        u8a u8aVar = this.K;
        return u8aVar != null ? u8aVar : n(this.G.i);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void m0(w79 w79Var) {
        ArrayList arrayList = this.s;
        for (int iE = t72.E(arrayList); -1 < iE; iE--) {
            db7 db7Var = (db7) arrayList.get(iE);
            f46 f46Var = db7Var.a.c;
            f46 f46VarL = f46Var != null ? nk8.l(f46Var) : null;
            if (f46VarL == null || !f46VarL.a()) {
                arrayList.remove(iE);
            } else {
                int i = db7Var.b;
                int i2 = f46VarL.a;
                if (i != i2) {
                    db7Var.b = i2;
                }
            }
        }
        Object[] objArr = w79Var.b;
        Object[] objArr2 = w79Var.c;
        long[] jArr = w79Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            ojb ojbVar = (ojb) obj;
                            f46 f46Var2 = ojbVar.c;
                            if (f46Var2 != null) {
                                int i7 = nk8.l(f46Var2).a;
                                if (obj2 == qfc.a) {
                                    obj2 = null;
                                }
                                arrayList.add(new db7(ojbVar, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        w72.f0(arrayList, ynb.h);
    }

    public final u8a n(int i) {
        u8a u8aVar;
        boolean z = this.S;
        dq9 dq9Var = wf2.c;
        if (z && this.J) {
            int iF = this.I.v;
            while (iF > 0) {
                if (this.I.r(iF) == 202 && pa7.t(this.I.s(iF), dq9Var)) {
                    Object objP = this.I.p(iF);
                    objP.getClass();
                    u8a u8aVar2 = (u8a) objP;
                    this.K = u8aVar2;
                    return u8aVar2;
                }
                opd opdVar = this.I;
                iF = opdVar.F(opdVar.b, iF);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    kpd kpdVar = this.G;
                    if (pa7.t(kpdVar.p(kpdVar.b, i), dq9Var)) {
                        q69 q69Var = this.v;
                        if (q69Var == null || (u8aVar = (u8a) q69Var.b(i)) == null) {
                            kpd kpdVar2 = this.G;
                            Object objB = kpdVar2.b(kpdVar2.b, i);
                            objB.getClass();
                            u8aVar = (u8a) objB;
                        }
                        this.K = u8aVar;
                        return u8aVar;
                    }
                }
                i = this.G.q(i);
            }
        }
        u8a u8aVar3 = this.u;
        this.K = u8aVar3;
        return u8aVar3;
    }

    public final void n0(int i, int i2) {
        if (r0(i) != i2) {
            if (i < 0) {
                o69 o69Var = this.p;
                if (o69Var == null) {
                    o69Var = new o69();
                    this.p = o69Var;
                }
                o69Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final if2 o() {
        Collection collection;
        if (!this.b.l()) {
            return null;
        }
        c78 c78VarW = t72.w();
        opd opdVar = this.I;
        c78VarW.addAll(cn1.p(opdVar, null, opdVar.t, null));
        kpd kpdVar = this.G;
        boolean z = kpdVar.f;
        int[] iArr = kpdVar.b;
        if (z || kpdVar.c == 0) {
            collection = pu4.a;
        } else {
            wdb wdbVar = new wdb(kpdVar);
            int iQ = kpdVar.i;
            Object objValueOf = Integer.valueOf(kpdVar.l - npd.d(iArr, iQ));
            while (iQ >= 0) {
                wdbVar.e(kpdVar.i(iQ), kpdVar.k(iQ) ? kpdVar.p(iArr, iQ) : sf2.a, kpdVar.a.k(iQ), objValueOf);
                objValueOf = kpdVar.a(iQ);
                iQ = kpdVar.q(iQ);
            }
            collection = wdbVar.a;
        }
        c78VarW.addAll(collection);
        c78VarW.addAll(K());
        return new if2(c78VarW.n(), this.C);
    }

    public final void o0(int i, int i2) {
        int iR0 = r0(i);
        if (iR0 != i2) {
            int i3 = i2 - iR0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iR1 = r0(i) + i3;
                n0(i, iR1);
                for (int i4 = size; -1 < i4; i4--) {
                    o46 o46Var = (o46) arrayList.get(i4);
                    if (o46Var != null && o46Var.a(i, iR1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                kpd kpdVar = this.G;
                if (i < 0) {
                    i = kpdVar.i;
                } else if (kpdVar.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void p(w79 w79Var, l26 l26Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            wf2.a("Reentrant composition is not supported");
        }
        this.g.l();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(qrd.h().g());
            this.v = null;
            m0(w79Var);
            this.k = 0;
            this.F = true;
            try {
                k0();
                Object objJ = J();
                if (objJ != l26Var && l26Var != null) {
                    q0(l26Var);
                }
                k46 k46Var = this.D;
                p89 p89VarA = zrd.a();
                try {
                    p89VarA.b(k46Var);
                    dq9 dq9Var = wf2.a;
                    if (l26Var != null) {
                        c0(200, dq9Var);
                        cgg.F(this, l26Var);
                        r(false);
                    } else if (!this.w || objJ == null || objJ.equals(sf2.a)) {
                        X();
                    } else {
                        c0(200, dq9Var);
                        z7f.t(2, objJ);
                        cgg.F(this, (l26) objJ);
                        r(false);
                    }
                    p89VarA.k(p89VarA.c - 1);
                    w();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        wf2.a("Check failed");
                    }
                    y();
                    Trace.endSection();
                } catch (Throwable th) {
                    p89VarA.k(p89VarA.c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    xo1.S(th2, new h46(0, this));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        wf2.a("Check failed");
                    }
                    y();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void p0(Object obj) {
        if (obj instanceof vpb) {
            p46 p46Var = new p46((vpb) obj, this.m - 1);
            if (this.S) {
                rr9 rr9Var = this.M.b.l;
                rr9Var.U(br9.d);
                vfh.L(rr9Var, 0, p46Var);
            }
            this.d.add(obj);
            obj = p46Var;
        }
        q0(obj);
    }

    public final void q(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        q(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            tf2 tf2Var = this.M;
            tf2Var.c();
            tf2Var.h.add(objN);
        }
    }

    public final void q0(Object obj) {
        if (this.S) {
            this.I.T(obj);
            return;
        }
        kpd kpdVar = this.G;
        boolean z = kpdVar.n;
        tf2 tf2Var = this.M;
        if (!z) {
            f46 f46VarA = kpdVar.a(kpdVar.i);
            rr9 rr9Var = tf2Var.b.l;
            rr9Var.U(iq9.d);
            vfh.M(rr9Var, 0, f46VarA, 1, obj);
            return;
        }
        int iD = (kpdVar.l - npd.d(kpdVar.b, kpdVar.i)) - 1;
        if (tf2Var.a.G.i - tf2Var.f >= 0) {
            tf2Var.d(true);
            rr9 rr9Var2 = tf2Var.b.l;
            rr9Var2.U(vq9.h);
            vfh.L(rr9Var2, 0, obj);
            rr9Var2.n[rr9Var2.o - rr9Var2.l[rr9Var2.m - 1].b] = iD;
            return;
        }
        kpd kpdVar2 = this.G;
        f46 f46VarA2 = kpdVar2.a(kpdVar2.i);
        rr9 rr9Var3 = tf2Var.b.l;
        rr9Var3.U(vq9.g);
        vfh.M(rr9Var3, 0, obj, 1, f46VarA2);
        rr9Var3.n[rr9Var3.o - rr9Var3.l[rr9Var3.m - 1].b] = iD;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r(boolean z) {
        long jRotateRight;
        f77 f77Var;
        int i;
        ArrayList arrayList;
        int i2;
        ?? r5;
        int i3;
        f77 f77Var2;
        int i4;
        x79 x79Var;
        int i5;
        int i6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i7;
        int i8;
        Object[] objArr;
        long[] jArr;
        int i9;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        Object[] objArr3;
        long[] jArr3;
        int i11;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        f77 f77Var3 = this.n;
        int i12 = f77Var3.a[f77Var3.b - 2] - 1;
        boolean z2 = this.S;
        i8c i8cVar = sf2.a;
        if (z2) {
            opd opdVar = this.I;
            int i13 = opdVar.v;
            int iR = opdVar.r(i13);
            Object objS = this.I.s(i13);
            Object objP = this.I.p(i13);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode()));
            } else if (objP == null || iR != 207 || objP.equals(i8cVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) iR);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            kpd kpdVar = this.G;
            int i14 = kpdVar.i;
            int i15 = kpdVar.i(i14);
            kpd kpdVar2 = this.G;
            Object objP2 = kpdVar2.p(kpdVar2.b, i14);
            kpd kpdVar3 = this.G;
            Object objB = kpdVar3.b(kpdVar3.b, i14);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i15 != 207 || objB.equals(i8cVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i16 = this.l;
        o46 o46Var = this.j;
        ArrayList arrayList4 = this.s;
        tf2 tf2Var = this.M;
        if (o46Var != null) {
            q69 q69Var = o46Var.e;
            int i17 = o46Var.b;
            ArrayList arrayList5 = o46Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = o46Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i18 = 0; i18 < size; i18++) {
                    hashSet2.add(arrayList6.get(i18));
                }
                i2 = -1;
                x79 x79Var2 = mec.a;
                x79 x79Var3 = new x79();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                i = 1;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                while (i19 < size3) {
                    oo7 oo7Var = (oo7) arrayList5.get(i19);
                    if (hashSet2.contains(oo7Var)) {
                        f77Var2 = f77Var3;
                        i4 = i19;
                        if (!x79Var3.a(oo7Var)) {
                            int i22 = i20;
                            if (i22 < size2) {
                                oo7 oo7Var2 = (oo7) arrayList6.get(i22);
                                if (oo7Var2 != oo7Var) {
                                    ef6 ef6Var = (ef6) q69Var.b(oo7Var2.c);
                                    int i23 = ef6Var != null ? ef6Var.b : -1;
                                    x79Var3.e(oo7Var2);
                                    i7 = i21;
                                    if (i23 != i7) {
                                        ef6 ef6Var2 = (ef6) q69Var.b(oo7Var2.c);
                                        int i24 = ef6Var2 != null ? ef6Var2.c : oo7Var2.d;
                                        x79Var = x79Var3;
                                        int i25 = i23 + i17;
                                        i5 = size2;
                                        int i26 = i7 + i17;
                                        if (i24 > 0) {
                                            i6 = i17;
                                            int i27 = tf2Var.l;
                                            if (i27 > 0) {
                                                arrayList2 = arrayList5;
                                                if (tf2Var.j == i25 - i27 && tf2Var.k == i26 - i27) {
                                                    tf2Var.l = i27 + i24;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            tf2Var.c();
                                            tf2Var.j = i25;
                                            tf2Var.k = i26;
                                            tf2Var.l = i24;
                                        } else {
                                            i6 = i17;
                                            arrayList2 = arrayList5;
                                            tf2Var.getClass();
                                        }
                                        if (i23 <= i7) {
                                            int i28 = i24;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i7 > i23) {
                                                Object[] objArr5 = q69Var.c;
                                                long[] jArr5 = q69Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i29 = 0;
                                                    while (true) {
                                                        long j = jArr5[i29];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i30 = 8 - ((~(i29 - length)) >>> 31);
                                                            int i31 = 0;
                                                            while (i31 < i30) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    ef6 ef6Var3 = (ef6) objArr5[(i29 << 3) + i31];
                                                                    jArr2 = jArr5;
                                                                    int i32 = ef6Var3.b;
                                                                    i10 = i23;
                                                                    if (i23 <= i32 && i32 < i10 + i28) {
                                                                        ef6Var3.b = (i32 - i10) + i7;
                                                                    } else if (i10 + 1 <= i32 && i32 < i7) {
                                                                        ef6Var3.b = i32 - i28;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i10 = i23;
                                                                }
                                                                j >>= 8;
                                                                i31++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i23 = i10;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i9 = i23;
                                                            if (i30 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i9 = i23;
                                                        }
                                                        if (i29 == length) {
                                                            break;
                                                        }
                                                        i29++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i23 = i9;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = q69Var.c;
                                            long[] jArr6 = q69Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i33 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i33];
                                                    int i34 = i24;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i33 - length2)) >>> 31);
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j2 & 255) < 128) {
                                                                i11 = i36;
                                                                ef6 ef6Var4 = (ef6) objArr6[(i33 << 3) + i36];
                                                                objArr4 = objArr6;
                                                                int i37 = ef6Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i23 <= i37 && i37 < i23 + i34) {
                                                                    ef6Var4.b = (i37 - i23) + i7;
                                                                } else if (i7 <= i37 && i37 < i23) {
                                                                    ef6Var4.b = i37 + i34;
                                                                }
                                                            } else {
                                                                i11 = i36;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i36 = i11 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i33 == length2) {
                                                        break;
                                                    }
                                                    i33++;
                                                    arrayList4 = arrayList4;
                                                    i24 = i34;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i8 = i4;
                                    } else {
                                        x79Var = x79Var3;
                                        i5 = size2;
                                        i6 = i17;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i8 = i4;
                                } else {
                                    arrayList4 = arrayList4;
                                    x79Var = x79Var3;
                                    i5 = size2;
                                    i6 = i17;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i7 = i21;
                                    i8 = i4 + 1;
                                }
                                i20 = i22 + 1;
                                ef6 ef6Var5 = (ef6) q69Var.b(oo7Var2.c);
                                int i38 = i7 + (ef6Var5 != null ? ef6Var5.c : oo7Var2.d);
                                i19 = i8;
                                o46Var = o46Var;
                                x79Var3 = x79Var;
                                size2 = i5;
                                i17 = i6;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i21 = i38;
                                f77Var3 = f77Var2;
                            } else {
                                i20 = i22;
                                f77Var3 = f77Var2;
                                i19 = i4;
                            }
                        }
                    } else {
                        f77Var2 = f77Var3;
                        ef6 ef6Var6 = (ef6) q69Var.b(oo7Var.c);
                        int i39 = ef6Var6 != null ? ef6Var6.b : -1;
                        int i40 = oo7Var.c;
                        i4 = i19;
                        tf2Var.f(i39 + i17, oo7Var.d);
                        o46Var.a(i40, 0);
                        tf2Var.f = (i40 - tf2Var.a.G.g) + tf2Var.f;
                        this.G.r(i40);
                        O();
                        this.G.s();
                        ynb.g0(i40, this.G.b[(i40 * 5) + 3] + i40, arrayList4);
                    }
                    i19 = i4 + 1;
                    f77Var3 = f77Var2;
                }
                f77Var = f77Var3;
                arrayList = arrayList4;
                tf2Var.c();
                if (arrayList5.size() > 0) {
                    kpd kpdVar4 = this.G;
                    tf2Var.f = (kpdVar4.h - tf2Var.a.G.g) + tf2Var.f;
                    kpdVar4.t();
                }
            } else {
                f77Var = f77Var3;
                i = 1;
                arrayList = arrayList4;
                i2 = -1;
            }
        } else {
            f77Var = f77Var3;
            i = 1;
            arrayList = arrayList4;
            i2 = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            kpd kpdVar5 = this.G;
            int i41 = kpdVar5.m - kpdVar5.l;
            if (i41 > 0) {
                if (i41 > 0) {
                    tf2Var.d(false);
                    tf2Var.e();
                    rr9 rr9Var = tf2Var.b.l;
                    rr9Var.U(lr9.d);
                    rr9Var.n[rr9Var.o - rr9Var.l[rr9Var.m - 1].b] = i41;
                } else {
                    tf2Var.getClass();
                }
            }
        }
        int i42 = this.k;
        while (true) {
            kpd kpdVar6 = this.G;
            if (kpdVar6.k > 0 || (i3 = kpdVar6.g) == kpdVar6.h) {
                break;
            }
            O();
            tf2Var.f(i42, this.G.s());
            ynb.g0(i3, this.G.g, arrayList);
        }
        if (z3) {
            if (z) {
                wh5 wh5Var = this.O;
                rr9 rr9Var2 = wh5Var.m;
                if (rr9Var2.m == 0) {
                    wf2.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                rr9 rr9Var3 = wh5Var.l;
                ni5[] ni5VarArr = rr9Var2.l;
                int i43 = rr9Var2.m - 1;
                rr9Var2.m = i43;
                ni5 ni5Var = ni5VarArr[i43];
                ni5VarArr[i43] = null;
                rr9Var3.U(ni5Var);
                Object[] objArr7 = rr9Var2.p;
                Object[] objArr8 = rr9Var3.p;
                int i44 = rr9Var3.q;
                int i45 = ni5Var.c;
                int i46 = rr9Var2.q;
                int i47 = i46 - i45;
                System.arraycopy(objArr7, i47, objArr8, i44 - i45, i46 - i47);
                Object[] objArr9 = rr9Var2.p;
                int i48 = rr9Var2.q;
                Arrays.fill(objArr9, i48 - i45, i48, (Object) null);
                int[] iArr = rr9Var2.n;
                int[] iArr2 = rr9Var3.n;
                int i49 = rr9Var3.o;
                int i50 = ni5Var.b;
                int i51 = rr9Var2.o;
                qd0.Y(i49 - i50, i51 - i50, i51, iArr, iArr2);
                rr9Var2.q -= i45;
                rr9Var2.o -= i50;
                i16 = i;
            }
            kpd kpdVar7 = this.G;
            if (kpdVar7.k <= 0) {
                epa.a("Unbalanced begin/end empty");
            }
            kpdVar7.k--;
            opd opdVar2 = this.I;
            int i52 = opdVar2.v;
            opdVar2.i();
            if (this.G.k <= 0) {
                int i53 = (-2) - i52;
                this.I.j();
                this.I.e(i);
                f46 f46Var = this.N;
                boolean zT = this.O.l.T();
                lpd lpdVar = this.H;
                if (zT) {
                    tf2Var.b();
                    r5 = 0;
                    tf2Var.d(false);
                    tf2Var.e();
                    tf2Var.c();
                    rr9 rr9Var4 = tf2Var.b.l;
                    rr9Var4.U(wq9.d);
                    vfh.M(rr9Var4, 0, f46Var, 1, lpdVar);
                } else {
                    wh5 wh5Var2 = this.O;
                    tf2Var.b();
                    tf2Var.d(false);
                    tf2Var.e();
                    tf2Var.c();
                    rr9 rr9Var5 = tf2Var.b.l;
                    rr9Var5.U(xq9.d);
                    vfh.N(rr9Var5, f46Var, lpdVar, wh5Var2);
                    this.O = new wh5();
                    r5 = 0;
                }
                this.S = r5;
                if (this.c.b != 0) {
                    n0(i53, r5);
                    o0(i53, i16);
                }
            }
        } else {
            if (z) {
                tf2Var.a();
            }
            int i54 = tf2Var.a.G.i;
            f77 f77Var4 = tf2Var.d;
            int i55 = i2;
            if (f77Var4.c(i55) > i54) {
                wf2.a("Missed recording an endGroup");
            }
            if (f77Var4.c(i55) == i54) {
                tf2Var.d(false);
                f77Var4.d();
                tf2Var.b.l.U(qq9.d);
            }
            int i56 = this.G.i;
            if (i16 != r0(i56)) {
                o0(i56, i16);
            }
            if (z) {
                i16 = 1;
            }
            this.G.e();
            tf2Var.c();
        }
        ArrayList arrayList7 = this.i;
        o46 o46Var2 = (o46) arrayList7.remove(arrayList7.size() - 1);
        if (o46Var2 != null && !z3) {
            o46Var2.c++;
        }
        this.j = o46Var2;
        this.k = f77Var.d() + i16;
        this.m = f77Var.d();
        this.l = f77Var.d() + i16;
    }

    public final int r0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        o69 o69Var = this.p;
        if (o69Var != null && o69Var.c(i) >= 0) {
            int iC = o69Var.c(i);
            if (iC >= 0) {
                return o69Var.c[iC];
            }
            r3.n(tec.e(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final void s() {
        r(false);
        ojb ojbVarB = B();
        if (ojbVarB != null) {
            int i = ojbVarB.b;
            if ((i & 1) != 0) {
                ojbVarB.b = i | 2;
            }
        }
    }

    public final void s0() {
        if (!this.r) {
            wf2.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            wf2.a("useNode() called while inserting");
        }
        kpd kpdVar = this.G;
        Object objN = kpdVar.n(kpdVar.i);
        tf2 tf2Var = this.M;
        tf2Var.c();
        tf2Var.h.add(objN);
        if (this.y && (objN instanceof ue2)) {
            tf2Var.b();
            tf2Var.b.l.U(pr9.d);
        }
    }

    public final void t() {
        r(true);
    }

    public final void u() {
        r(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[LOOP:0: B:15:0x003e->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:29:0x0084 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0083 A[SYNTHETIC] */
    public final ojb v() {
        ojb ojbVar;
        f46 f46VarA;
        g01 g01Var;
        ArrayList arrayList = this.E;
        ojb ojbVar2 = !arrayList.isEmpty() ? (ojb) arrayList.remove(arrayList.size() - 1) : null;
        if (ojbVar2 != null) {
            ojbVar2.b &= -9;
            this.g.l();
            int i = this.B;
            e79 e79Var = ojbVar2.f;
            if (e79Var == null || (ojbVar2.b & 16) != 0) {
                g01Var = null;
                break;
            }
            Object[] objArr = e79Var.b;
            int[] iArr = e79Var.c;
            long[] jArr = e79Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                g01Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                g01Var = new g01(ojbVar2, i, e79Var, 3);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    g01Var = null;
                    break;
                }
                if (i2 == length) {
                    g01Var = null;
                    break;
                }
                i2++;
            }
            tf2 tf2Var = this.M;
            if (g01Var != null) {
                rr9 rr9Var = tf2Var.b.l;
                rr9Var.U(pq9.d);
                vfh.M(rr9Var, 0, g01Var, 1, this.h);
            }
            int i6 = ojbVar2.b;
            if ((i6 & 512) != 0) {
                ojbVar2.b = i6 & (-513);
                rr9 rr9Var2 = tf2Var.b.l;
                rr9Var2.U(sq9.d);
                vfh.L(rr9Var2, 0, ojbVar2);
                int i7 = ojbVar2.b;
                ojbVar2.b = i7 & (-129);
                if ((i7 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    ojbVar2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (ojbVar2 != null) {
            int i8 = ojbVar2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (ojbVar2.c == null) {
                    if (this.S) {
                        opd opdVar = this.I;
                        f46VarA = opdVar.b(opdVar.v);
                    } else {
                        kpd kpdVar = this.G;
                        f46VarA = kpdVar.a(kpdVar.i);
                    }
                    ojbVar2.c = f46VarA;
                }
                ojbVar2.b &= -5;
                ojbVar = ojbVar2;
            } else {
                ojbVar = null;
            }
        } else {
            ojbVar = null;
        }
        r(false);
        return ojbVar;
    }

    public final void w() {
        r(false);
        this.b.d();
        r(false);
        tf2 tf2Var = this.M;
        if (tf2Var.c) {
            tf2Var.d(false);
            tf2Var.d(false);
            tf2Var.b.l.U(qq9.d);
            tf2Var.c = false;
        }
        tf2Var.b();
        if (tf2Var.d.b != 0) {
            wf2.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            wf2.a("Start/end imbalance");
        }
        j();
        this.G.c();
        this.w = this.x.d() != 0;
    }

    public final void x(boolean z, o46 o46Var) {
        this.i.add(this.j);
        this.j = o46Var;
        int i = this.l;
        f77 f77Var = this.n;
        f77Var.e(i);
        f77Var.e(this.m);
        f77Var.e(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void y() {
        lpd lpdVar = new lpd();
        if (this.C) {
            lpdVar.d();
        }
        if (this.b.e()) {
            lpdVar.y = new q69();
        }
        this.H = lpdVar;
        opd opdVarI = lpdVar.i();
        opdVarI.e(true);
        this.I = opdVarI;
    }

    public final ng2 z() {
        m46 m46Var = this.U;
        if (m46Var != null) {
            return m46Var;
        }
        m46 m46Var2 = new m46(this.h);
        this.U = m46Var2;
        return m46Var2;
    }
}
