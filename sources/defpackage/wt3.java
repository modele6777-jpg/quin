package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wt3 extends yt3 implements Comparable {
    public final int X;
    public final boolean Y;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public wt3(int i, h1f h1fVar, int i2, vt3 vt3Var, int i3, String str, String str2) {
        int iG;
        super(i, h1fVar, i2);
        int i4 = 0;
        this.f = hu0.n(i3, false);
        int i5 = this.d.e;
        int i6 = vt3Var.u;
        jy6 jy6Var = vt3Var.r;
        int i7 = i5 & (~i6);
        this.g = (i7 & 1) != 0;
        this.v = (i7 & 2) != 0;
        jy6 jy6VarS = str2 != null ? jy6.s(str2) : jy6Var.isEmpty() ? jy6.s("") : jy6Var;
        int i8 = 0;
        while (true) {
            if (i8 >= jy6VarS.size()) {
                iG = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iG = au3.g(this.d, (String) jy6VarS.get(i8), false);
                if (iG > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.w = i8;
        this.x = iG;
        int i9 = str2 != null ? 1088 : 0;
        int i10 = this.d.f;
        is9 is9Var = au3.k;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.y = iBitCount;
        rr5 rr5Var = this.d;
        this.Y = (1088 & rr5Var.f) != 0;
        int iF = au3.f(rr5Var, vt3Var.s);
        this.z = iF;
        int iG2 = au3.g(this.d, str, au3.h(str) == null);
        this.X = iG2;
        boolean z = iG > 0 || (jy6Var.isEmpty() && iBitCount > 0) || ((jy6Var.isEmpty() && iF != Integer.MAX_VALUE) || this.g || (this.v && iG2 > 0));
        if (hu0.n(i3, vt3Var.C) && z) {
            i4 = 1;
        }
        this.e = i4;
    }

    @Override // defpackage.yt3
    public final int a() {
        return this.e;
    }

    @Override // defpackage.yt3
    public final boolean b(yt3 yt3Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wt3 wt3Var) {
        ta2 ta2VarC = ta2.a.c(this.f, wt3Var.f);
        Integer numValueOf = Integer.valueOf(this.w);
        Integer numValueOf2 = Integer.valueOf(wt3Var.w);
        Comparator comparator = k0c.a;
        ta2 ta2VarB = ta2VarC.b(numValueOf, numValueOf2, comparator);
        int i = wt3Var.x;
        int i2 = this.x;
        ta2 ta2VarA = ta2VarB.a(i2, i);
        int i3 = wt3Var.y;
        int i4 = this.y;
        ta2 ta2VarC2 = ta2VarA.a(i4, i3).b(Integer.valueOf(this.z), Integer.valueOf(wt3Var.z), comparator).c(this.g, wt3Var.g);
        Boolean boolValueOf = Boolean.valueOf(this.v);
        Boolean boolValueOf2 = Boolean.valueOf(wt3Var.v);
        if (i2 == 0) {
            comparator = ba9.a;
        }
        ta2 ta2VarA2 = ta2VarC2.b(boolValueOf, boolValueOf2, comparator).a(this.X, wt3Var.X);
        if (i4 == 0) {
            ta2VarA2 = ta2VarA2.d(this.Y, wt3Var.Y);
        }
        return ta2VarA2.e();
    }
}
