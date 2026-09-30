package defpackage;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2e implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i2e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x034a  */
    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        zte zteVarA;
        zte zteVarA2;
        zte zteVarA3;
        ste steVar;
        zt ztVarL;
        Object dzbVar;
        int i = 4;
        int i2 = 7;
        int i3 = 3;
        int i4 = 24;
        int i5 = 8;
        xtd xtdVarD = null;
        xtdVarD = null;
        switch (this.a) {
            case 0:
                bo8 bo8Var = (bo8) this.b;
                q7d q7dVar = (q7d) this.c;
                bea beaVar = (bea) obj;
                beaVar.getClass();
                fdc.s(beaVar, bo8Var, q7dVar.b, q7dVar.c, 0.0d, 0.0d);
                return wef.a;
            case 1:
                HashMap map = (HashMap) this.b;
                ng1 ng1Var = (ng1) this.c;
                oif oifVar = (oif) obj;
                oifVar.getClass();
                Object obj2 = map.get(oifVar);
                if (obj2 == null) {
                    qc0.j("Required value was null.");
                    return null;
                }
                hk1 hk1Var = (hk1) obj2;
                xjf xjfVarO = oifVar.o(ng1Var, hk1Var.a, hk1Var.b);
                xjfVarO.getClass();
                return xjfVarO;
            case 2:
                mce mceVar = (mce) this.b;
                kce kceVar = (kce) this.c;
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                mceVar.b.Q(q8cVar, kceVar);
                return wef.a;
            case 3:
                x48 x48Var = (x48) this.b;
                bhe bheVar = (bhe) this.c;
                ((ra4) obj).getClass();
                y6 y6Var = new y6(i2, bheVar);
                x48Var.k().a(y6Var);
                if (((a58) x48Var.k()).i == g48.e) {
                    bheVar.b();
                }
                return new ozc(i3, x48Var, y6Var);
            case 4:
                trd trdVar = (trd) this.b;
                dne dneVar = (dne) this.c;
                i4f i4fVar = (i4f) obj;
                if (i4fVar instanceof ag) {
                    trdVar.d(((ag) i4fVar).Z);
                } else {
                    if (!(i4fVar instanceof se5)) {
                        qc0.p("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                        return null;
                    }
                    dneVar.d(((se5) i4fVar).Z);
                }
                return Boolean.TRUE;
            case 5:
                h81 h81Var = (h81) obj;
                return h81Var.a(new i2e(6, ((x4d) this.b).a(h81Var.a.f(), h81Var.a.getLayoutDirection(), h81Var), (cpe) this.c));
            case 6:
                rs0.w((sn4) obj, (vs9) this.b, ((cpe) this.c).a(), null, 60);
                return wef.a;
            case 7:
                h0e h0eVar = (h0e) this.b;
                e89 e89Var = (e89) this.c;
                ald aldVar = (ald) obj;
                float fFloatValue = ((Number) h0eVar.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (aldVar.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aldVar.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((ald) e89Var.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((ald) e89Var.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    e89Var.setValue(new ald((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)))));
                }
                return wef.a;
            case 8:
                return new ozc(i, (e89) this.b, (t69) this.c);
            case 9:
                j00 j00Var = (j00) this.b;
                sz9 sz9Var = ((r68) this.c).b;
                pme pmeVar = (pme) obj;
                l68 l68Var = (l68) j00Var.a;
                zte zteVarA4 = l68Var.a();
                xtd xtdVar = zteVarA4 != null ? zteVarA4.a : null;
                xtd xtdVarD2 = ((sz9Var.j() & 1) == 0 || (zteVarA3 = l68Var.a()) == null) ? null : zteVarA3.b;
                if (xtdVar != null) {
                    xtdVarD2 = xtdVar.d(xtdVarD2);
                }
                xtd xtdVarD3 = ((sz9Var.j() & 2) == 0 || (zteVarA2 = l68Var.a()) == null) ? null : zteVarA2.c;
                if (xtdVarD2 != null) {
                    xtdVarD3 = xtdVarD2.d(xtdVarD3);
                }
                if ((sz9Var.j() & 4) != 0 && (zteVarA = l68Var.a()) != null) {
                    xtdVarD = zteVarA.d;
                }
                if (xtdVarD3 != null) {
                    xtdVarD = xtdVarD3.d(xtdVarD);
                }
                pmeVar.b = pmeVar.a.c(new bv9(new imb(), j00Var, xtdVarD, 15));
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                yte yteVar = (yte) this.b;
                j00 j00Var2 = (j00) this.c;
                g0c g0cVar = (g0c) obj;
                k00 k00Var = yteVar.b;
                vz9 vz9Var = yteVar.a;
                ste steVar2 = (ste) vz9Var.getValue();
                if (pa7.t(k00Var, steVar2 != null ? steVar2.a.a : null) && (steVar = (ste) vz9Var.getValue()) != null) {
                    b59 b59Var = steVar.b;
                    j00 j00VarC = yte.c(j00Var2, steVar);
                    if (j00VarC == null) {
                        ztVarL = null;
                    } else {
                        int i6 = j00VarC.c;
                        int i7 = j00VarC.b;
                        ztVarL = steVar.l(i7, i6);
                        hkb hkbVarB = steVar.b(i7);
                        int i8 = i6 - 1;
                        ztVarL.m(((((long) Float.floatToRawIntBits(b59Var.d(i7) == b59Var.d(i8) ? Math.min(steVar.b(i8).a, hkbVarB.a) : 0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(hkbVarB.b)))) ^ (-9223372034707292160L));
                    }
                } else {
                    ztVarL = null;
                }
                xte xteVar = ztVarL != null ? new xte(ztVarL) : null;
                if (xteVar != null) {
                    g0cVar.w(xteVar);
                    g0cVar.g(true);
                }
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                List list = (List) this.b;
                List list2 = (List) this.c;
                bea beaVar2 = (bea) obj;
                if (list != null) {
                    int size = list.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        iy9 iy9Var = (iy9) list.get(i9);
                        bea.j(beaVar2, (cea) iy9Var.a(), ((w67) iy9Var.b()).a);
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        iy9 iy9Var2 = (iy9) list2.get(i10);
                        cea ceaVar = (cea) iy9Var2.a();
                        x16 x16Var = (x16) iy9Var2.b();
                        bea.j(beaVar2, ceaVar, x16Var != null ? ((w67) x16Var.invoke()).a : 0L);
                    }
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                lve lveVar = (lve) this.b;
                Context context = (Context) this.c;
                mfc mfcVar = (mfc) obj;
                mfcVar.getClass();
                String str = mfcVar == mfc.b ? "neo" : "classic";
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new alc(str, 12), 2);
                x1f.k(new r05("theme_changed"), new alc(str, 13), 2);
                x1fVar.f(new alc(str, 14));
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                lveVar.f(mfcVar, applicationContext);
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ynb.V((aw2) this.b, null, dw2.d, new l3f((n3f) this.c, null), 1);
                return new ou(i5);
            case 14:
                s3f s3fVar = (s3f) this.b;
                ((ltc) s3fVar).n(new nsd(new i2e(17, Thread.currentThread(), (aw2) this.c)));
                return new lf(i4, s3fVar);
            case 15:
                n3f n3fVar = (n3f) this.b;
                p3f p3fVar = (p3f) this.c;
                n3fVar.k.add(p3fVar);
                return new ozc(i2, n3fVar, p3fVar);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new ozc(i5, (n3f) this.b, (g3f) this.c);
            case 17:
                Object obj3 = this.b;
                aw2 aw2Var = (aw2) this.c;
                x16 x16Var2 = (x16) obj;
                if (obj3 == Thread.currentThread()) {
                    x16Var2.invoke();
                } else {
                    ynb.V(aw2Var, null, null, new q3f(x16Var2, null), 3);
                }
                return wef.a;
            case 18:
                n3f n3fVar2 = (n3f) this.b;
                k3f k3fVar = (k3f) this.c;
                n3fVar2.j.add(k3fVar);
                return new ozc(9, n3fVar2, k3fVar);
            case 19:
                lqb lqbVar = (lqb) this.b;
                i9f i9fVar = (i9f) this.c;
                l9f l9fVar = (l9f) obj;
                synchronized (((g3e) lqbVar.b)) {
                    try {
                        boolean zB = l9fVar.b();
                        ej8 ej8Var = (ej8) lqbVar.c;
                        if (zB) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return wef.a;
            case 20:
                pad padVar = (pad) this.b;
                pad padVar2 = (pad) this.c;
                ((ra4) obj).getClass();
                return new ozc(11, padVar, padVar2);
            case 21:
                x48 x48Var2 = (x48) this.b;
                vad vadVar = (vad) this.c;
                ((ra4) obj).getClass();
                y6 y6Var2 = new y6(i5, vadVar);
                x48Var2.k().a(y6Var2);
                return new ozc(10, x48Var2, y6Var2);
            case 22:
                vad vadVar2 = (vad) this.b;
                mmb mmbVar = (mmb) this.c;
                ued uedVar = (ued) obj;
                uedVar.getClass();
                if (uedVar == ued.a) {
                    try {
                        Object obj4 = mmbVar.element;
                        if (obj4 == null) {
                            pa7.g0("sheetState");
                            throw null;
                        }
                        dzbVar = Float.valueOf(((ted) obj4).d.f());
                        boolean z = dzbVar instanceof dzb;
                        Object obj5 = dzbVar;
                        if (z) {
                            obj5 = null;
                        }
                        Float f = (Float) obj5;
                        Object obj6 = mmbVar.element;
                        if (obj6 == null) {
                            pa7.g0("sheetState");
                            throw null;
                        }
                        i10 = ((ted) obj6).d.k.getValue() != null ? 1 : 0;
                        g5b g5bVar = vadVar2.c;
                        Float f2 = vadVar2.g;
                        if (((u6d) g5bVar.b) == null) {
                            u6d u6dVar = u6d.TapScrim;
                            if (i10 == 0 && f2 != null && f != null && f.floatValue() > f2.floatValue() + 0.5f) {
                                u6dVar = u6d.SwipeDown;
                            }
                            g5bVar.b = u6dVar;
                        }
                    } catch (Throwable th2) {
                        dzbVar = new dzb(th2);
                    }
                } else {
                    vadVar2.c.b = null;
                }
                return Boolean.TRUE;
            case 23:
                qad qadVar = (qad) this.b;
                cea ceaVar2 = (cea) this.c;
                bea beaVar3 = (bea) obj;
                beaVar3.getClass();
                if (qadVar.a == 1.0f) {
                    if (ceaVar2 != null) {
                        beaVar3.g(ceaVar2, qadVar.f, qadVar.g, 0.0f);
                    }
                } else if (ceaVar2 != null) {
                    bea.q(beaVar3, ceaVar2, qadVar.f, qadVar.g, new trd(i4, qadVar), 4);
                }
                return wef.a;
            case 24:
                pad padVar3 = (pad) this.b;
                Integer num = (Integer) this.c;
                oad oadVar = (oad) obj;
                oadVar.getClass();
                padVar3.getClass();
                padVar3.c.put(num, oadVar);
                return wef.a;
            case 25:
                lgf lgfVar = (lgf) this.b;
                a26 a26Var = (a26) this.c;
                ((Long) obj).getClass();
                float f3 = lgfVar.e;
                lgfVar.e = 0.0f;
                a26Var.d(Float.valueOf(f3));
                return wef.a;
            case 26:
                mhf mhfVar = (mhf) this.b;
                bwa bwaVar = (bwa) this.c;
                ((t7) obj).getClass();
                mhfVar.W0 = bwaVar;
                mhfVar.H(bwaVar, ((mo3) mhfVar.P0).a());
                return wef.a;
            case 27:
                ekf ekfVar = (ekf) this.b;
                rg7 rg7Var = (rg7) this.c;
                synchronized (ekfVar.k) {
                    ekfVar.w.remove(rg7Var);
                }
                return wef.a;
            case 28:
                qmf qmfVar = (qmf) this.b;
                a26 a26Var2 = (a26) this.c;
                String str2 = (String) obj;
                str2.getClass();
                smc smcVar = new smc(a26Var2, qmfVar, str2, i5);
                if (((Boolean) qmfVar.y.getValue()).booleanValue()) {
                    smcVar.invoke();
                } else {
                    qmfVar.z.setValue(smcVar);
                }
                return wef.a;
            default:
                xgd xgdVar = (xgd) this.b;
                String str3 = (String) this.c;
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a(((wgd) xgdVar).a.getId(), "uid");
                l1fVar.a(str3, "pathway");
                return wef.a;
        }
    }

    public /* synthetic */ i2e(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
    }
}
