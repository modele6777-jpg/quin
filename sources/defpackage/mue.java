package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mue {
    public static final mue d = new mue(0, 0, null, null, null, 0, 0, 0, 0, 0, null, null, 16777215);
    public final xtd a;
    public final ty9 b;
    public final iga c;

    /* JADX WARN: Illegal instructions before constructor call */
    public mue(long j, long j2, ar5 ar5Var, wq5 wq5Var, yp5 yp5Var, long j3, long j4, int i, int i2, long j5, iga igaVar, y58 y58Var, int i3) {
        long j6 = (i3 & 1) != 0 ? y72.k : j;
        long j7 = (i3 & 2) != 0 ? wue.c : j2;
        ar5 ar5Var2 = (i3 & 4) != 0 ? null : ar5Var;
        wq5 wq5Var2 = (i3 & 8) != 0 ? null : wq5Var;
        yp5 yp5Var2 = (i3 & 32) != 0 ? null : yp5Var;
        long j8 = (i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? wue.c : j3;
        long j9 = (i3 & 2048) != 0 ? y72.k : j4;
        int i4 = (32768 & i3) != 0 ? 0 : i;
        int i5 = (65536 & i3) != 0 ? 0 : i2;
        long j10 = (131072 & i3) != 0 ? wue.c : j5;
        iga igaVar2 = (524288 & i3) != 0 ? null : igaVar;
        y58 y58Var2 = (i3 & 1048576) != 0 ? null : y58Var;
        iga igaVar3 = igaVar2;
        this(new xtd(j6, j7, ar5Var2, wq5Var2, (xq5) null, yp5Var2, (String) null, j8, (ou0) null, (cte) null, (sd8) null, j9, (mne) null, (o4d) null, igaVar2 != null ? igaVar2.a : null, (un4) null), new ty9(i4, i5, j10, null, igaVar3 != null ? igaVar3.b : null, y58Var2, 0, 0, null), igaVar3);
    }

    public static mue a(mue mueVar, long j, long j2, ar5 ar5Var, yp5 yp5Var, long j3, o4d o4dVar, int i, long j4, iga igaVar, y58 y58Var, int i2) {
        bte u82Var;
        long jB = (i2 & 1) != 0 ? mueVar.a.a.b() : j;
        long j5 = (i2 & 2) != 0 ? mueVar.a.b : j2;
        ar5 ar5Var2 = (i2 & 4) != 0 ? mueVar.a.c : ar5Var;
        xtd xtdVar = mueVar.a;
        wq5 wq5Var = xtdVar.d;
        xq5 xq5Var = xtdVar.e;
        yp5 yp5Var2 = (i2 & 32) != 0 ? xtdVar.f : yp5Var;
        String str = xtdVar.g;
        long j6 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? xtdVar.h : j3;
        ou0 ou0Var = xtdVar.i;
        cte cteVar = xtdVar.j;
        sd8 sd8Var = xtdVar.k;
        long j7 = xtdVar.l;
        mne mneVar = (i2 & 4096) != 0 ? xtdVar.m : mne.d;
        o4d o4dVar2 = (i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? xtdVar.n : o4dVar;
        un4 un4Var = xtdVar.p;
        int i3 = (32768 & i2) != 0 ? mueVar.b.a : i;
        int i4 = (65536 & i2) != 0 ? mueVar.b.b : 1;
        long j8 = (131072 & i2) != 0 ? mueVar.b.c : j4;
        ty9 ty9Var = mueVar.b;
        ete eteVar = ty9Var.d;
        iga igaVar2 = (i2 & 524288) != 0 ? mueVar.c : igaVar;
        y58 y58Var2 = (i2 & 1048576) != 0 ? ty9Var.f : y58Var;
        int i5 = ty9Var.g;
        int i6 = ty9Var.h;
        cue cueVar = ty9Var.i;
        long jB2 = xtdVar.a.b();
        int i7 = y72.l;
        if (faf.a(jB, jB2)) {
            u82Var = xtdVar.a;
        } else {
            u82Var = jB != 16 ? new u82(jB) : ate.a;
        }
        return new mue(new xtd(u82Var, j5, ar5Var2, wq5Var, xq5Var, yp5Var2, str, j6, ou0Var, cteVar, sd8Var, j7, mneVar, o4dVar2, igaVar2 != null ? igaVar2.a : null, un4Var), new ty9(i3, i4, j8, eteVar, igaVar2 != null ? igaVar2.b : null, y58Var2, i5, i6, cueVar), igaVar2);
    }

    public static mue f(mue mueVar, long j, long j2, ar5 ar5Var, yp5 yp5Var, long j3, mne mneVar, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? wue.c : j2;
        ar5 ar5Var2 = (i2 & 4) != 0 ? null : ar5Var;
        yp5 yp5Var2 = (i2 & 32) != 0 ? null : yp5Var;
        long j6 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? wue.c : j3;
        long j7 = y72.k;
        mne mneVar2 = (i2 & 4096) != 0 ? null : mneVar;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? wue.c : j4;
        xtd xtdVarA = ytd.a(mueVar.a, j, null, Float.NaN, j5, ar5Var2, null, null, yp5Var2, null, j6, null, null, null, j7, mneVar2, null, null, null);
        ty9 ty9VarA = uy9.a(mueVar.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (mueVar.a == xtdVarA && mueVar.b == ty9VarA) ? mueVar : new mue(xtdVarA, ty9VarA);
    }

    public final b41 b() {
        return this.a.a.c();
    }

    public final long c() {
        return this.a.a.b();
    }

    public final boolean d(mue mueVar) {
        if (this != mueVar) {
            return pa7.t(this.b, mueVar.b) && this.a.b(mueVar.a);
        }
        return true;
    }

    public final mue e(mue mueVar) {
        return (mueVar == null || mueVar.equals(d)) ? this : new mue(this.a.d(mueVar.a), this.b.a(mueVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mue)) {
            return false;
        }
        mue mueVar = (mue) obj;
        return pa7.t(this.a, mueVar.a) && pa7.t(this.b, mueVar.b) && pa7.t(this.c, mueVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        iga igaVar = this.c;
        return iHashCode + (igaVar != null ? igaVar.hashCode() : 0);
    }

    public final String toString() {
        String strH = y72.h(c());
        b41 b41VarB = b();
        xtd xtdVar = this.a;
        float fA = xtdVar.a.a();
        String strE = wue.e(xtdVar.b);
        ar5 ar5Var = xtdVar.c;
        wq5 wq5Var = xtdVar.d;
        xq5 xq5Var = xtdVar.e;
        yp5 yp5Var = xtdVar.f;
        String str = xtdVar.g;
        String strE2 = wue.e(xtdVar.h);
        ou0 ou0Var = xtdVar.i;
        cte cteVar = xtdVar.j;
        sd8 sd8Var = xtdVar.k;
        String strH2 = y72.h(xtdVar.l);
        mne mneVar = xtdVar.m;
        o4d o4dVar = xtdVar.n;
        un4 un4Var = xtdVar.p;
        ty9 ty9Var = this.b;
        String strA = jme.a(ty9Var.a);
        String strA2 = pne.a(ty9Var.b);
        String strE3 = wue.e(ty9Var.c);
        ete eteVar = ty9Var.d;
        y58 y58Var = ty9Var.f;
        String strA3 = q58.a(ty9Var.g);
        String strA4 = ft6.a(ty9Var.h);
        cue cueVar = ty9Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(b41VarB);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strE);
        sb.append(", fontWeight=");
        sb.append(ar5Var);
        sb.append(", fontStyle=");
        sb.append(wq5Var);
        sb.append(", fontSynthesis=");
        sb.append(xq5Var);
        sb.append(", fontFamily=");
        sb.append(yp5Var);
        sb.append(", fontFeatureSettings=");
        ub3.v(sb, str, ", letterSpacing=", strE2, ", baselineShift=");
        sb.append(ou0Var);
        sb.append(", textGeometricTransform=");
        sb.append(cteVar);
        sb.append(", localeList=");
        sb.append(sd8Var);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(mneVar);
        sb.append(", shadow=");
        sb.append(o4dVar);
        sb.append(", drawStyle=");
        sb.append(un4Var);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        ub3.v(sb, strA2, ", lineHeight=", strE3, ", textIndent=");
        sb.append(eteVar);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(y58Var);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(cueVar);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mue(xtd xtdVar, ty9 ty9Var) {
        aga agaVar = xtdVar.o;
        ofa ofaVar = ty9Var.e;
        this(xtdVar, ty9Var, (agaVar == null && ofaVar == null) ? null : new iga(agaVar, ofaVar));
    }

    public mue(xtd xtdVar, ty9 ty9Var, iga igaVar) {
        this.a = xtdVar;
        this.b = ty9Var;
        this.c = igaVar;
    }
}
