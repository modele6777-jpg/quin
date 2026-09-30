package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rt3 extends yt3 implements Comparable {
    public final int E0;
    public final int F0;
    public final boolean G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final boolean L0;
    public final boolean M0;
    public final boolean N0;
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final int e;
    public final boolean f;
    public final String g;
    public final vt3 v;
    public final boolean w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Code duplicated, block: B:109:0x0179  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    public rt3(int i, h1f h1fVar, int i2, vt3 vt3Var, int i3, boolean z, pt3 pt3Var, int i4) {
        int i5;
        int iG;
        boolean z2;
        int iG2;
        boolean z3;
        boolean z4;
        boolean z5;
        p1f p1fVar;
        super(i, h1fVar, i2);
        this.v = vt3Var;
        boolean z6 = vt3Var.A;
        jy6 jy6Var = vt3Var.p;
        jy6 jy6Var2 = vt3Var.l;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.Y = false;
        this.g = au3.h(this.d.d);
        this.w = hu0.n(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= jy6Var2.size()) {
                iG = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iG = au3.g(this.d, (String) jy6Var2.get(i8), false);
                if (iG > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.y = i8;
        this.x = iG;
        int i9 = this.d.f;
        this.z = (i9 == 0 || i9 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.X = au3.f(this.d, vt3Var.m);
        rr5 rr5Var = this.d;
        int i10 = rr5Var.f;
        this.Z = i10 == 0 || (i10 & 1) != 0;
        this.G0 = (rr5Var.e & 1) != 0;
        String str = rr5Var.p;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.N0 = z2;
        int i11 = rr5Var.J;
        this.H0 = i11;
        this.I0 = rr5Var.L;
        int i12 = rr5Var.k;
        this.J0 = i12;
        this.f = (i12 == -1 || i12 <= vt3Var.o) && (i11 == -1 || i11 <= vt3Var.n) && pt3Var.apply(rr5Var);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = pqf.I(strArrSplit[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 < strArrSplit.length) {
                iG2 = au3.g(this.d, strArrSplit[i14], false);
                if (iG2 <= 0) {
                    i14++;
                }
            } else {
                iG2 = 0;
                i14 = Integer.MAX_VALUE;
            }
        }
        this.E0 = i14;
        this.F0 = iG2;
        for (int i15 = 0; i15 < jy6Var.size(); i15++) {
            String str2 = this.d.p;
            if (str2 != null && str2.equals(jy6Var.get(i15))) {
                i5 = i15;
                this.K0 = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.L0 = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.M0 = z4;
                boolean z7 = this.f;
                vt3 vt3Var2 = this.v;
                z5 = vt3Var2.C;
                p1fVar = vt3Var2.q;
                if (hu0.n(i3, z5) && (z7 || vt3Var2.z)) {
                    p1fVar.getClass();
                    if (hu0.n(i3, false) || !z7 || this.d.k == -1 || ((!vt3Var2.D && z) || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.e = i7;
            }
        }
        this.K0 = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.L0 = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.M0 = z4;
        boolean z8 = this.f;
        vt3 vt3Var3 = this.v;
        z5 = vt3Var3.C;
        p1fVar = vt3Var3.q;
        if (hu0.n(i3, z5)) {
            p1fVar.getClass();
            if (hu0.n(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.e = i7;
    }

    @Override // defpackage.yt3
    public final int a() {
        return this.e;
    }

    @Override // defpackage.yt3
    public final boolean b(yt3 yt3Var) {
        int i;
        String str;
        rt3 rt3Var = (rt3) yt3Var;
        rr5 rr5Var = rt3Var.d;
        this.v.getClass();
        rr5 rr5Var2 = this.d;
        int i2 = rr5Var2.J;
        if (i2 == -1 || i2 != rr5Var.J) {
            return false;
        }
        return (this.Y || ((str = rr5Var2.p) != null && TextUtils.equals(str, rr5Var.p))) && (i = rr5Var2.L) != -1 && i == rr5Var.L && this.L0 == rt3Var.L0 && this.M0 == rt3Var.M0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rt3 rt3Var) {
        boolean z = this.w;
        boolean z2 = this.f;
        is9 is9VarA = (z2 && z) ? au3.k : au3.k.a();
        boolean z3 = rt3Var.w;
        int i = rt3Var.J0;
        ta2 ta2VarC = ta2.a.c(z, z3);
        Integer numValueOf = Integer.valueOf(this.y);
        Integer numValueOf2 = Integer.valueOf(rt3Var.y);
        k0c k0cVar = k0c.a;
        ta2 ta2VarB = ta2VarC.b(numValueOf, numValueOf2, k0cVar).a(this.x, rt3Var.x).a(this.z, rt3Var.z).b(Integer.valueOf(this.X), Integer.valueOf(rt3Var.X), k0cVar).c(this.G0, rt3Var.G0).c(this.Z, rt3Var.Z).b(Integer.valueOf(this.E0), Integer.valueOf(rt3Var.E0), k0cVar).a(this.F0, rt3Var.F0).c(z2, rt3Var.f).b(Integer.valueOf(this.K0), Integer.valueOf(rt3Var.K0), k0cVar);
        this.v.getClass();
        ta2 ta2VarB2 = ta2VarB.c(this.L0, rt3Var.L0).c(this.M0, rt3Var.M0).c(this.N0, rt3Var.N0).b(Integer.valueOf(this.H0), Integer.valueOf(rt3Var.H0), is9VarA).b(Integer.valueOf(this.I0), Integer.valueOf(rt3Var.I0), is9VarA);
        if (Objects.equals(this.g, rt3Var.g)) {
            ta2VarB2 = ta2VarB2.b(Integer.valueOf(this.J0), Integer.valueOf(i), is9VarA);
        }
        return ta2VarB2.e();
    }
}
