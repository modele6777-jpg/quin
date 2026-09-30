package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xtd implements g00 {
    public final bte a;
    public final long b;
    public final ar5 c;
    public final wq5 d;
    public final xq5 e;
    public final yp5 f;
    public final String g;
    public final long h;
    public final ou0 i;
    public final cte j;
    public final sd8 k;
    public final long l;
    public final mne m;
    public final o4d n;
    public final aga o;
    public final un4 p;

    public xtd(long j, long j2, ar5 ar5Var, wq5 wq5Var, xq5 xq5Var, yp5 yp5Var, String str, long j3, ou0 ou0Var, cte cteVar, sd8 sd8Var, long j4, mne mneVar, o4d o4dVar, int i) {
        this((i & 1) != 0 ? y72.k : j, (i & 2) != 0 ? wue.c : j2, (i & 4) != 0 ? null : ar5Var, (i & 8) != 0 ? null : wq5Var, (i & 16) != 0 ? null : xq5Var, (i & 32) != 0 ? null : yp5Var, (i & 64) != 0 ? null : str, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? wue.c : j3, (i & 256) != 0 ? null : ou0Var, (i & 512) != 0 ? null : cteVar, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : sd8Var, (i & 2048) != 0 ? y72.k : j4, (i & 4096) != 0 ? null : mneVar, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : o4dVar, (aga) null, (un4) null);
    }

    public static xtd a(xtd xtdVar, long j, int i) {
        long jB = (i & 1) != 0 ? xtdVar.a.b() : j;
        long j2 = xtdVar.b;
        ar5 ar5Var = xtdVar.c;
        wq5 wq5Var = xtdVar.d;
        xq5 xq5Var = xtdVar.e;
        yp5 yp5Var = (i & 32) != 0 ? xtdVar.f : null;
        String str = xtdVar.g;
        long j3 = xtdVar.h;
        ou0 ou0Var = xtdVar.i;
        cte cteVar = xtdVar.j;
        sd8 sd8Var = xtdVar.k;
        long j4 = xtdVar.l;
        mne mneVar = xtdVar.m;
        o4d o4dVar = xtdVar.n;
        aga agaVar = xtdVar.o;
        un4 un4Var = xtdVar.p;
        bte u82Var = xtdVar.a;
        long jB2 = u82Var.b();
        int i2 = y72.l;
        if (!faf.a(jB, jB2)) {
            u82Var = jB != 16 ? new u82(jB) : ate.a;
        }
        return new xtd(u82Var, j2, ar5Var, wq5Var, xq5Var, yp5Var, str, j3, ou0Var, cteVar, sd8Var, j4, mneVar, o4dVar, agaVar, un4Var);
    }

    public final boolean b(xtd xtdVar) {
        if (this == xtdVar) {
            return true;
        }
        if (!wue.a(this.b, xtdVar.b) || !pa7.t(this.c, xtdVar.c) || !pa7.t(this.d, xtdVar.d) || !pa7.t(this.e, xtdVar.e) || !pa7.t(this.f, xtdVar.f) || !pa7.t(this.g, xtdVar.g) || !wue.a(this.h, xtdVar.h) || !pa7.t(this.i, xtdVar.i) || !pa7.t(this.j, xtdVar.j) || !pa7.t(this.k, xtdVar.k)) {
            return false;
        }
        long j = xtdVar.l;
        int i = y72.l;
        return faf.a(this.l, j) && pa7.t(this.o, xtdVar.o);
    }

    public final boolean c(xtd xtdVar) {
        return pa7.t(this.a, xtdVar.a) && pa7.t(this.m, xtdVar.m) && pa7.t(this.n, xtdVar.n) && pa7.t(this.p, xtdVar.p);
    }

    public final xtd d(xtd xtdVar) {
        if (xtdVar == null) {
            return this;
        }
        bte bteVar = xtdVar.a;
        return ytd.a(this, bteVar.b(), bteVar.c(), bteVar.a(), xtdVar.b, xtdVar.c, xtdVar.d, xtdVar.e, xtdVar.f, xtdVar.g, xtdVar.h, xtdVar.i, xtdVar.j, xtdVar.k, xtdVar.l, xtdVar.m, xtdVar.n, xtdVar.o, xtdVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtd)) {
            return false;
        }
        xtd xtdVar = (xtd) obj;
        return b(xtdVar) && c(xtdVar);
    }

    public final int hashCode() {
        bte bteVar = this.a;
        long jB = bteVar.b();
        int i = y72.l;
        int iHashCode = Long.hashCode(jB) * 31;
        b41 b41VarC = bteVar.c();
        int iHashCode2 = (Float.hashCode(bteVar.a()) + ((iHashCode + (b41VarC != null ? b41VarC.hashCode() : 0)) * 31)) * 31;
        xue[] xueVarArr = wue.b;
        int iB = ib8.b(iHashCode2, 31, this.b);
        ar5 ar5Var = this.c;
        int i2 = (iB + (ar5Var != null ? ar5Var.a : 0)) * 31;
        wq5 wq5Var = this.d;
        int iHashCode3 = (i2 + (wq5Var != null ? Integer.hashCode(wq5Var.a) : 0)) * 31;
        xq5 xq5Var = this.e;
        int iHashCode4 = (iHashCode3 + (xq5Var != null ? Integer.hashCode(xq5Var.a) : 0)) * 31;
        yp5 yp5Var = this.f;
        int iHashCode5 = (iHashCode4 + (yp5Var != null ? yp5Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iB2 = ib8.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        ou0 ou0Var = this.i;
        int iHashCode6 = (iB2 + (ou0Var != null ? Float.hashCode(ou0Var.a) : 0)) * 31;
        cte cteVar = this.j;
        int iHashCode7 = (iHashCode6 + (cteVar != null ? cteVar.hashCode() : 0)) * 31;
        sd8 sd8Var = this.k;
        int iB3 = ib8.b((iHashCode7 + (sd8Var != null ? sd8Var.a.hashCode() : 0)) * 31, 31, this.l);
        mne mneVar = this.m;
        int i3 = (iB3 + (mneVar != null ? mneVar.a : 0)) * 31;
        o4d o4dVar = this.n;
        int iHashCode8 = (i3 + (o4dVar != null ? o4dVar.hashCode() : 0)) * 31;
        aga agaVar = this.o;
        int iHashCode9 = (iHashCode8 + (agaVar != null ? agaVar.hashCode() : 0)) * 31;
        un4 un4Var = this.p;
        return iHashCode9 + (un4Var != null ? un4Var.hashCode() : 0);
    }

    public final String toString() {
        bte bteVar = this.a;
        String strH = y72.h(bteVar.b());
        b41 b41VarC = bteVar.c();
        float fA = bteVar.a();
        String strE = wue.e(this.b);
        String strE2 = wue.e(this.h);
        String strH2 = y72.h(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(b41VarC);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strE);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        ub3.v(sb, this.g, ", letterSpacing=", strE2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public xtd(bte bteVar, long j, ar5 ar5Var, wq5 wq5Var, xq5 xq5Var, yp5 yp5Var, String str, long j2, ou0 ou0Var, cte cteVar, sd8 sd8Var, long j3, mne mneVar, o4d o4dVar, aga agaVar, un4 un4Var) {
        this.a = bteVar;
        this.b = j;
        this.c = ar5Var;
        this.d = wq5Var;
        this.e = xq5Var;
        this.f = yp5Var;
        this.g = str;
        this.h = j2;
        this.i = ou0Var;
        this.j = cteVar;
        this.k = sd8Var;
        this.l = j3;
        this.m = mneVar;
        this.n = o4dVar;
        this.o = agaVar;
        this.p = un4Var;
    }

    public xtd(long j, long j2, ar5 ar5Var, wq5 wq5Var, xq5 xq5Var, yp5 yp5Var, String str, long j3, ou0 ou0Var, cte cteVar, sd8 sd8Var, long j4, mne mneVar, o4d o4dVar, aga agaVar, un4 un4Var) {
        bte u82Var;
        if (j != 16) {
            u82Var = new u82(j);
        } else {
            u82Var = ate.a;
        }
        this(u82Var, j2, ar5Var, wq5Var, xq5Var, yp5Var, str, j3, ou0Var, cteVar, sd8Var, j4, mneVar, o4dVar, agaVar, un4Var);
    }
}
