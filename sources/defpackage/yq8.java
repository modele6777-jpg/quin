package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yq8 {
    public final lp0 a;
    public final a90 b;

    public yq8(lp0 lp0Var) {
        this.a = lp0Var;
        tz3 tz3Var = (tz3) lp0Var.b;
        this.b = new a90(tz3Var.b, tz3Var.l);
    }

    public final m0b a(bm3 bm3Var) {
        if (bm3Var instanceof kw9) {
            dx5 dx5Var = ((lw9) ((kw9) bm3Var)).f;
            lp0 lp0Var = this.a;
            return new l0b(dx5Var, (u99) lp0Var.c, (bu3) lp0Var.e, (f04) lp0Var.v);
        }
        if (bm3Var instanceof d04) {
            return ((d04) bm3Var).J0;
        }
        return null;
    }

    public final ArrayList b(List list, List list2, ut8 ut8Var, int i) {
        yq8 yq8Var = this;
        lp0 lp0Var = yq8Var.a;
        bm3 bm3Var = (bm3) lp0Var.d;
        bm3Var.getClass();
        ca1 ca1Var = (ca1) bm3Var;
        bm3 bm3VarK = ca1Var.k();
        bm3VarK.getClass();
        m0b m0bVarA = yq8Var.a(bm3VarK);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                t72.Z();
                throw null;
            }
            vza vzaVar = (vza) obj;
            d0b d0bVar = (d0b) s72.y0(i2, list2);
            nw7 nw7VarF = af1.F(ca1Var, ((o7f) lp0Var.w).g(vzaVar), null, (m0bVarA == null || !oi5.c.e((d0bVar == null || !d0bVar.O()) ? 0 : d0bVar.H()).booleanValue()) ? hj6.c : new ig9(((tz3) lp0Var.b).a, new xq8(yq8Var, m0bVarA, ut8Var, i, i2, d0bVar, 1)), i2);
            if (nw7VarF != null) {
                arrayList.add(nw7VarF);
            }
            yq8Var = this;
            i2 = i3;
        }
        return arrayList;
    }

    public final h10 c(ut8 ut8Var, int i, int i2) {
        return !oi5.c.e(i).booleanValue() ? hj6.c : new ig9(((tz3) this.a.b).a, new vq8(this, ut8Var, i2, 0));
    }

    public final h10 d(kza kzaVar, boolean z) {
        return !oi5.c.e(kzaVar.p0()).booleanValue() ? hj6.c : new ig9(((tz3) this.a.b).a, new wq8(this, z, kzaVar));
    }

    public final wz3 e(qya qyaVar, boolean z) {
        rz3 rz3Var;
        lp0 lp0Var = this.a;
        bm3 bm3Var = (bm3) lp0Var.d;
        bm3Var.getClass();
        u09 u09Var = (u09) bm3Var;
        wz3 wz3Var = new wz3(u09Var, null, c(qyaVar, qyaVar.H(), 1), z, 1, qyaVar, (u99) lp0Var.c, (bu3) lp0Var.e, (otf) lp0Var.f, (f04) lp0Var.v, null);
        yq8 yq8Var = (yq8) lp0Var.b(wz3Var, pu4.a, (u99) lp0Var.c, (bu3) lp0Var.e, (otf) lp0Var.f, (ay0) lp0Var.g).x;
        List listI = qyaVar.I();
        listI.getClass();
        List listH = yq8Var.h(listI, qyaVar, 1);
        j0b j0bVar = (j0b) oi5.d.e(qyaVar.H());
        switch (j0bVar == null ? -1 : r0b.b[j0bVar.ordinal()]) {
            case 1:
                rz3Var = sz3.d;
                rz3Var.getClass();
                break;
            case 2:
                rz3Var = sz3.a;
                rz3Var.getClass();
                break;
            case 3:
                rz3Var = sz3.b;
                rz3Var.getClass();
                break;
            case 4:
                rz3Var = sz3.c;
                rz3Var.getClass();
                break;
            case 5:
                rz3Var = sz3.e;
                rz3Var.getClass();
                break;
            case 6:
                rz3Var = sz3.f;
                rz3Var.getClass();
                break;
            default:
                rz3Var = sz3.a;
                rz3Var.getClass();
                break;
        }
        wz3Var.R0(listH, rz3Var);
        wz3Var.M0(u09Var.S());
        wz3Var.H0 = u09Var.w();
        wz3Var.L0 = !oi5.o.e(qyaVar.H()).booleanValue();
        return wz3Var;
    }

    public final r04 f(dza dzaVar) {
        int iF0;
        tt7 tt7VarG;
        lp0 lp0Var = this.a;
        u99 u99Var = (u99) lp0Var.c;
        bu3 bu3Var = (bu3) lp0Var.e;
        if (dzaVar.r0()) {
            iF0 = dzaVar.f0();
        } else {
            int iH0 = dzaVar.h0();
            iF0 = ((iH0 >> 8) << 6) + (iH0 & 63);
        }
        int i = iF0;
        int i2 = 1;
        h10 h10VarC = c(dzaVar, i, 1);
        h10 uz3Var = (dzaVar.u0() || dzaVar.v0()) ? new uz3(((tz3) lp0Var.b).a, new vq8(this, dzaVar, i2, i2)) : hj6.c;
        r04 r04Var = new r04((bm3) lp0Var.d, null, h10VarC, i7h.v(u99Var, dzaVar.g0()), abg.U((eza) oi5.q.e(i)), dzaVar, (u99) lp0Var.c, bu3Var, qz3.g((bm3) lp0Var.d).a(i7h.v(u99Var, dzaVar.g0())).equals(ebe.a) ? otf.b : (otf) lp0Var.f, (f04) lp0Var.v, null);
        List listM0 = dzaVar.m0();
        listM0.getClass();
        lp0 lp0VarB = lp0Var.b(r04Var, listM0, (u99) lp0Var.c, (bu3) lp0Var.e, (otf) lp0Var.f, (ay0) lp0Var.g);
        yq8 yq8Var = (yq8) lp0VarB.x;
        o7f o7fVar = (o7f) lp0VarB.w;
        vza vzaVarP = feg.P(dzaVar, bu3Var);
        nw7 nw7VarL = (vzaVarP == null || (tt7VarG = o7fVar.g(vzaVarP)) == null) ? null : af1.L(r04Var, tt7VarG, uz3Var);
        bm3 bm3Var = (bm3) lp0Var.d;
        u09 u09Var = bm3Var instanceof u09 ? (u09) bm3Var : null;
        nw7 nw7VarI0 = u09Var != null ? u09Var.i0() : null;
        List listB = feg.B(dzaVar, bu3Var);
        List listA0 = dzaVar.a0();
        listA0.getClass();
        ArrayList arrayListB = yq8Var.b(listB, listA0, dzaVar, 1);
        List listB2 = o7fVar.b();
        List listO0 = dzaVar.o0();
        listO0.getClass();
        r04Var.Q0(nw7VarL, nw7VarI0, arrayListB, listB2, yq8Var.h(listO0, dzaVar, 1), o7fVar.g(feg.R(dzaVar, bu3Var)), qk6.y0((fza) oi5.e.e(i)), abg.u((j0b) oi5.d.e(i)), qu4.a);
        r04Var.Y = oi5.r.e(i).booleanValue();
        r04Var.Z = oi5.s.e(i).booleanValue();
        r04Var.E0 = oi5.v.e(i).booleanValue();
        r04Var.F0 = oi5.t.e(i).booleanValue();
        r04Var.G0 = oi5.u.e(i).booleanValue();
        r04Var.K0 = oi5.w.e(i).booleanValue();
        r04Var.H0 = oi5.x.e(i).booleanValue();
        r04Var.L0 = !oi5.y.e(i).booleanValue();
        ((tz3) lp0Var.b).m.getClass();
        return r04Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [u09] */
    public final q04 g(kza kzaVar, boolean z) {
        int iP0;
        h10 h10VarC;
        q04 q04Var;
        zxa zxaVarG;
        de8 de8Var;
        dya dyaVarH;
        boolean z2;
        ?? r0;
        Object objE;
        u09 u09Var;
        tt7 tt7VarG;
        g10 g10Var = hj6.c;
        lp0 lp0Var = this.a;
        u99 u99Var = (u99) lp0Var.c;
        bu3 bu3Var = (bu3) lp0Var.e;
        if (kzaVar.F0()) {
            iP0 = kzaVar.p0();
        } else {
            int iU0 = kzaVar.u0();
            iP0 = ((iU0 >> 8) << 6) + (iU0 & 63);
        }
        if (z) {
            List<kya> listG0 = kzaVar.g0();
            listG0.getClass();
            ArrayList arrayList = new ArrayList(t72.u(listG0, 10));
            for (kya kyaVar : listG0) {
                kyaVar.getClass();
                arrayList.add(this.b.C(kyaVar, u99Var));
            }
            h10VarC = arrayList.isEmpty() ? g10Var : new j10(0, arrayList);
        } else {
            h10VarC = null;
        }
        bm3 bm3Var = (bm3) lp0Var.d;
        if (h10VarC == null) {
            h10VarC = c(kzaVar, iP0, 2);
        }
        mi5 mi5Var = oi5.e;
        e09 e09VarY0 = qk6.y0((fza) mi5Var.e(iP0));
        mi5 mi5Var2 = oi5.d;
        int i = iP0;
        q04 q04Var2 = new q04(bm3Var, null, h10VarC, e09VarY0, abg.u((j0b) mi5Var2.e(iP0)), oi5.A.e(iP0).booleanValue(), i7h.v(u99Var, kzaVar.t0()), abg.U((eza) oi5.q.e(iP0)), oi5.E.e(iP0).booleanValue(), oi5.D.e(iP0).booleanValue(), oi5.G.e(iP0).booleanValue(), oi5.H.e(iP0).booleanValue(), oi5.I.e(iP0).booleanValue(), kzaVar, (u99) lp0Var.c, bu3Var, (otf) lp0Var.f, (f04) lp0Var.v);
        List listD0 = kzaVar.D0();
        listD0.getClass();
        lp0 lp0VarB = lp0Var.b(q04Var2, listD0, (u99) lp0Var.c, (bu3) lp0Var.e, (otf) lp0Var.f, (ay0) lp0Var.g);
        o7f o7fVar = (o7f) lp0VarB.w;
        boolean zBooleanValue = oi5.B.e(i).booleanValue();
        int i2 = 1;
        h10 uz3Var = (zBooleanValue && (kzaVar.K0() || kzaVar.L0())) ? new uz3(((tz3) lp0Var.b).a, new vq8(this, kzaVar, 3, i2)) : g10Var;
        tt7 tt7VarG2 = o7fVar.g(feg.S(kzaVar, bu3Var));
        List listB = o7fVar.b();
        bm3 bm3Var2 = (bm3) lp0Var.d;
        u09 u09Var2 = bm3Var2 instanceof u09 ? (u09) bm3Var2 : null;
        nw7 nw7VarI0 = u09Var2 != null ? u09Var2.i0() : null;
        vza vzaVarQ = feg.Q(kzaVar, bu3Var);
        nw7 nw7VarL = (vzaVarQ == null || (tt7VarG = o7fVar.g(vzaVarQ)) == null) ? null : af1.L(q04Var2, tt7VarG, uz3Var);
        yq8 yq8Var = (yq8) lp0VarB.x;
        List listC = feg.C(kzaVar, bu3Var);
        List listK0 = kzaVar.k0();
        listK0.getClass();
        q04Var2.K0(tt7VarG2, listB, nw7VarI0, nw7VarL, yq8Var.b(listC, listK0, kzaVar, 3));
        int iB = oi5.b(oi5.c.e(i).booleanValue(), (j0b) mi5Var2.e(i), (fza) mi5Var.e(i));
        yx4 yx4Var = ntd.T;
        if (zBooleanValue) {
            int iS0 = kzaVar.H0() ? kzaVar.s0() : iB;
            boolean zBooleanValue2 = oi5.N.e(iS0).booleanValue();
            boolean zBooleanValue3 = oi5.O.e(iS0).booleanValue();
            boolean zBooleanValue4 = oi5.P.e(iS0).booleanValue();
            h10 h10VarC2 = c(kzaVar, iS0, 3);
            if (zBooleanValue2) {
                zxa zxaVar = new zxa(q04Var2, h10VarC2, qk6.y0((fza) mi5Var.e(iS0)), abg.u((j0b) mi5Var2.e(iS0)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, q04Var2.g(), null, yx4Var);
                q04Var = q04Var2;
                zxaVarG = zxaVar;
            } else {
                q04Var = q04Var2;
                zxaVarG = af1.G(q04Var, h10VarC2);
            }
            zxaVarG.F0(q04Var.getReturnType());
        } else {
            q04Var = q04Var2;
            zxaVarG = null;
        }
        if (oi5.C.e(i).booleanValue()) {
            if (kzaVar.P0()) {
                iB = kzaVar.B0();
            }
            boolean zBooleanValue5 = oi5.N.e(iB).booleanValue();
            boolean zBooleanValue6 = oi5.O.e(iB).booleanValue();
            boolean zBooleanValue7 = oi5.P.e(iB).booleanValue();
            h10 h10VarC3 = c(kzaVar, iB, 4);
            if (zBooleanValue5) {
                dyaVarH = new dya(q04Var, h10VarC3, qk6.y0((fza) mi5Var.e(iB)), abg.u((j0b) mi5Var2.e(iB)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, q04Var.g(), null, yx4Var);
                xrf xrfVar = (xrf) s72.X0(((yq8) lp0VarB.b(dyaVarH, pu4.a, (u99) lp0VarB.c, (bu3) lp0VarB.e, (otf) lp0VarB.f, (ay0) lp0VarB.g).x).h(t72.H(kzaVar.C0()), kzaVar, 4));
                if (xrfVar == null) {
                    dya.k0(6);
                    throw null;
                }
                dyaVarH.Y = xrfVar;
                de8Var = null;
            } else {
                de8Var = null;
                dyaVarH = af1.H(q04Var, h10VarC3);
            }
        } else {
            de8Var = null;
            dyaVarH = null;
        }
        if (oi5.F.e(i).booleanValue()) {
            z2 = false;
            q04Var.I0(de8Var, new uq8(this, kzaVar, q04Var, false ? 1 : 0));
        } else {
            z2 = false;
        }
        bm3 bm3Var3 = (bm3) lp0Var.d;
        if (bm3Var3 instanceof u09) {
            u09Var = (u09) bm3Var3;
        } else {
            r0 = de8Var;
        }
        if (r0 != 0) {
            r0 = u09Var;
            objE = r0.E();
        } else {
            r0 = u09Var;
            objE = de8Var;
        }
        if (objE == l22.ANNOTATION_CLASS) {
            q04Var.I0(de8Var, new uq8(this, kzaVar, q04Var, i2));
        }
        q04Var.H0(zxaVarG, dyaVarH, new sc5(d(kzaVar, z2)), new sc5(d(kzaVar, true)));
        return q04Var;
    }

    public final List h(List list, ut8 ut8Var, int i) {
        int i2;
        tt7 tt7Var;
        h10 ig9Var;
        yq8 yq8Var = this;
        lp0 lp0Var = yq8Var.a;
        bu3 bu3Var = (bu3) lp0Var.e;
        o7f o7fVar = (o7f) lp0Var.w;
        bm3 bm3Var = (bm3) lp0Var.d;
        bm3Var.getClass();
        ca1 ca1Var = (ca1) bm3Var;
        bm3 bm3VarK = ca1Var.k();
        bm3VarK.getClass();
        m0b m0bVarA = yq8Var.a(bm3VarK);
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                t72.Z();
                throw null;
            }
            d0b d0bVar = (d0b) obj;
            int iH = d0bVar.O() ? d0bVar.H() : 0;
            if (m0bVarA == null || !oi5.c.e(iH).booleanValue()) {
                i2 = i3;
                tt7Var = null;
                ig9Var = hj6.c;
            } else {
                i2 = i3;
                tt7Var = null;
                ig9Var = new ig9(((tz3) lp0Var.b).a, new xq8(yq8Var, m0bVarA, ut8Var, i, i2, d0bVar, 0));
            }
            t99 t99VarV = i7h.v((u99) lp0Var.c, d0bVar.I());
            tt7 tt7VarG = o7fVar.g(feg.Y(d0bVar, bu3Var));
            boolean zBooleanValue = oi5.K.e(iH).booleanValue();
            boolean zBooleanValue2 = oi5.L.e(iH).booleanValue();
            boolean zBooleanValue3 = oi5.M.e(iH).booleanValue();
            vza vzaVarB0 = feg.b0(d0bVar, bu3Var);
            tt7 tt7VarG2 = vzaVarB0 != null ? o7fVar.g(vzaVarB0) : tt7Var;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new xrf(ca1Var, null, i2, ig9Var, t99VarV, tt7VarG, zBooleanValue, zBooleanValue2, zBooleanValue3, tt7VarG2, ntd.T));
            arrayList = arrayList2;
            i3 = i4;
            yq8Var = this;
        }
        return s72.j1(arrayList);
    }
}
