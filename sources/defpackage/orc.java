package defpackage;

import java.util.ArrayList;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class orc extends ewf implements hf8 {
    public static final /* synthetic */ int H0 = 0;
    public final whb E0;
    public final s0e F0;
    public final whb G0;
    public final s0e X;
    public final whb Y;
    public final s0e Z;
    public final lqc b;
    public final ckc c;
    public frc d;
    public lyd e;
    public zqc f;
    public long g;
    public zqc v;
    public lyd w;
    public lyd x;
    public final s0e y;
    public final whb z;

    public orc(lqc lqcVar, ckc ckcVar) {
        this.b = lqcVar;
        this.c = ckcVar;
        s0e s0eVarA = t0e.a(null);
        this.y = s0eVarA;
        this.z = if9.n(s0eVarA);
        s0e s0eVarA2 = t0e.a(grc.a);
        this.X = s0eVarA2;
        this.Y = if9.n(s0eVarA2);
        s0e s0eVarA3 = t0e.a(ppc.a);
        this.Z = s0eVarA3;
        this.E0 = if9.n(s0eVarA3);
        s0e s0eVarA4 = t0e.a(crc.a);
        this.F0 = s0eVarA4;
        this.G0 = if9.n(s0eVarA4);
    }

    public final hrc f(int i, SolarTerm solarTerm) {
        mic.a.getClass();
        if (jy4.o(i, solarTerm) == null || n3d.e(i, solarTerm) == null) {
            return null;
        }
        zqc zqcVar = new zqc(i, solarTerm);
        if (!pa7.t(this.f, zqcVar)) {
            h();
            this.g++;
            this.f = zqcVar;
            this.v = null;
            this.d = null;
            this.y.m(null);
            this.X.n(null, grc.a);
            this.Z.n(null, ppc.a);
            this.F0.n(null, crc.a);
        }
        return new hrc(zqcVar, this.g);
    }

    public final hrc g(hrc hrcVar) {
        h();
        long j = this.g + 1;
        this.g = j;
        return new hrc(hrcVar.a, j);
    }

    public final void h() {
        lyd lydVar = this.w;
        if (lydVar != null) {
            lydVar.h(null);
        }
        lyd lydVar2 = this.e;
        if (lydVar2 != null) {
            lydVar2.h(null);
        }
        lyd lydVar3 = this.x;
        if (lydVar3 != null) {
            lydVar3.h(null);
        }
        this.w = null;
        this.e = null;
        this.x = null;
    }

    public final void i(int i, SolarTerm solarTerm) {
        solarTerm.getClass();
        hrc hrcVarF = f(i, solarTerm);
        if (hrcVarF == null) {
            return;
        }
        if (this.y.getValue() == null || !pa7.t(this.v, hrcVarF.a)) {
            hrc hrcVarG = g(hrcVarF);
            this.X.n(null, grc.b);
            this.w = ynb.V(hwf.a(this), null, null, new irc(this, i, solarTerm, hrcVarG, null), 3);
        }
    }

    public final void k(SolarTerm solarTerm, fpc fpcVar) {
        solarTerm.getClass();
        fpcVar.getClass();
        hrc hrcVarF = f(2026, solarTerm);
        if (hrcVarF != null) {
            hrc hrcVarG = g(hrcVarF);
            this.y.n(null, fpcVar);
            this.X.n(null, grc.a);
            this.v = hrcVarG.a;
        }
    }

    public final boolean l(hrc hrcVar) {
        return pa7.t(this.f, hrcVar.a) && this.g == hrcVar.b;
    }

    public final void m(int i, SolarTerm solarTerm) {
        hrc hrcVarF = f(i, solarTerm);
        s0e s0eVar = this.Z;
        if (hrcVarF == null) {
            s0eVar.n(null, new opc(null));
            return;
        }
        hrc hrcVarG = g(hrcVarF);
        s0eVar.n(null, ppc.a);
        this.e = ynb.V(hwf.a(this), null, null, new nrc(this, i, solarTerm, hrcVarG, null), 3);
    }

    public final void n(int i, SolarTerm solarTerm, SeasonalUserInfo seasonalUserInfo, ArrayList arrayList) {
        solarTerm.getClass();
        hrc hrcVarF = f(i, solarTerm);
        if (hrcVarF == null) {
            return;
        }
        this.d = new frc(hrcVarF.a, new arc(seasonalUserInfo, arrayList));
    }
}
