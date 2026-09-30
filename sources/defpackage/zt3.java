package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zt3 extends yt3 {
    public final int E0;
    public final boolean F0;
    public final int G0;
    public final boolean H0;
    public final int I0;
    public final boolean J0;
    public final boolean K0;
    public final boolean L0;
    public final int M0;
    public final boolean N0;
    public final String O0;
    public final int X;
    public final int Y;
    public final int Z;
    public final boolean e;
    public final vt3 f;
    public final boolean g;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Code duplicated, block: B:109:0x0144  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    public zt3(int i, h1f h1fVar, int i2, vt3 vt3Var, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iG;
        int i6;
        boolean z4;
        String strC;
        int i7;
        rr5 rr5Var;
        int i8;
        int i9;
        int i10;
        rr5 rr5Var2;
        int i11;
        int i12;
        int i13;
        super(i, h1fVar, i2);
        this.f = vt3Var;
        boolean z5 = vt3Var.y;
        jy6 jy6Var = vt3Var.i;
        jy6 jy6Var2 = vt3Var.k;
        int i14 = z5 ? 24 : 16;
        int i15 = 0;
        this.H0 = false;
        if (!z || (((i11 = (rr5Var2 = this.d).w) != -1 && i11 > vt3Var.a) || ((i12 = rr5Var2.x) != -1 && i12 > vt3Var.b))) {
            z2 = false;
        } else {
            float f = rr5Var2.B;
            if ((f == -1.0f || f <= vt3Var.c) && ((i13 = rr5Var2.k) == -1 || i13 <= vt3Var.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.e = z2;
        if (!z || (((i8 = (rr5Var = this.d).w) != -1 && i8 < 0) || ((i9 = rr5Var.x) != -1 && i9 < 0))) {
            z3 = false;
        } else {
            float f2 = rr5Var.B;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i10 = rr5Var.k) == -1 || i10 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.g = z3;
        this.v = hu0.n(i3, false);
        rr5 rr5Var3 = this.d;
        float f3 = rr5Var3.B;
        this.w = f3 != -1.0f && f3 >= 10.0f;
        this.x = rr5Var3.k;
        int i16 = rr5Var3.w;
        this.y = (i16 == -1 || (i7 = rr5Var3.x) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= jy6Var2.size()) {
                iG = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iG = au3.g(this.d, (String) jy6Var2.get(i17), false);
                if (iG > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.X = i17;
        this.Y = iG;
        int i18 = this.d.f;
        is9 is9Var = au3.k;
        this.Z = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i19 = this.d.f;
        this.F0 = i19 == 0 || (i19 & 1) != 0;
        this.G0 = au3.g(this.d, str, au3.h(str) == null);
        rr5 rr5Var4 = this.d;
        String str2 = rr5Var4.p;
        int i20 = i3 & 384;
        if (i20 == 256 && (strC = ap8.c(rr5Var4)) != null) {
            str2 = strC;
        }
        for (int i21 = 0; i21 < jy6Var.size(); i21++) {
            if (str2 != null && str2.equals(jy6Var.get(i21))) {
                i5 = i21;
                break;
            }
        }
        this.z = i5;
        this.E0 = au3.f(this.d, vt3Var.j);
        this.J0 = i20 == 128 || i20 == 256;
        boolean z6 = i20 == 128;
        this.K0 = z6;
        this.L0 = (i3 & 64) == 64;
        this.O0 = str2;
        if (str2 != null) {
            i6 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.M0 = i6;
        if (z6) {
            e82 e82Var = this.d.H;
            if (e82Var != null) {
                int i22 = e82Var.c;
                z4 = (i22 == 7 || i22 == 6) ? true : z4;
            } else {
                e82 e82Var2 = e82.h;
            }
            z4 = false;
        } else {
            z4 = false;
        }
        this.N0 = z4;
        boolean z7 = this.e;
        vt3 vt3Var2 = this.f;
        rr5 rr5Var5 = this.d;
        if ((rr5Var5.f & 16384) == 0 && hu0.n(i3, vt3Var2.C) && (z7 || vt3Var2.x)) {
            i15 = (hu0.n(i3, false) && this.g && z7 && rr5Var5.k != -1 && (i14 & i3) != 0) ? 2 : 1;
        }
        this.I0 = i15;
    }

    public static int c(zt3 zt3Var, zt3 zt3Var2) {
        ta2 ta2VarC = ta2.a.c(zt3Var.v, zt3Var2.v);
        Integer numValueOf = Integer.valueOf(zt3Var.X);
        Integer numValueOf2 = Integer.valueOf(zt3Var2.X);
        k0c k0cVar = k0c.a;
        return ta2VarC.b(numValueOf, numValueOf2, k0cVar).a(zt3Var.Y, zt3Var2.Y).a(zt3Var.Z, zt3Var2.Z).b(Integer.valueOf(zt3Var.E0), Integer.valueOf(zt3Var2.E0), k0cVar).c(zt3Var.F0, zt3Var2.F0).a(zt3Var.G0, zt3Var2.G0).c(zt3Var.w, zt3Var2.w).c(zt3Var.e, zt3Var2.e).c(zt3Var.g, zt3Var2.g).b(Integer.valueOf(zt3Var.z), Integer.valueOf(zt3Var2.z), k0cVar).c(zt3Var.J0, zt3Var2.J0).c(zt3Var.L0, zt3Var2.L0).e();
    }

    @Override // defpackage.yt3
    public final int a() {
        return this.I0;
    }

    @Override // defpackage.yt3
    public final boolean b(yt3 yt3Var) {
        zt3 zt3Var = (zt3) yt3Var;
        if (!this.H0 && !Objects.equals(this.O0, zt3Var.O0)) {
            return false;
        }
        this.f.getClass();
        return this.J0 == zt3Var.J0 && this.L0 == zt3Var.L0;
    }
}
