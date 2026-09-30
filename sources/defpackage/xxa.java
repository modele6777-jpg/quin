package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xxa {
    public bm3 a;
    public e09 b;
    public rz3 c;
    public int e;
    public final nw7 h;
    public final t99 i;
    public final tt7 j;
    public final /* synthetic */ yxa k;
    public wxa d = null;
    public o8f f = o8f.a;
    public boolean g = true;

    public xxa(yxa yxaVar) {
        this.k = yxaVar;
        this.a = yxaVar.k();
        this.b = yxaVar.i();
        this.c = yxaVar.getVisibility();
        this.e = yxaVar.g();
        this.h = yxaVar.J0;
        this.i = yxaVar.getName();
        this.j = yxaVar.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [c36, dya, uxa] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [zxa] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [dya] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable, yxa] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20, types: [uxa, zxa] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r4v10, types: [sc5] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [tt7] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r6v12, types: [sc5] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bm3, ca1, wxa, yxa] */
    public final yxa a() {
        nw7 nw7Var;
        nw7 nw7Var2;
        ?? zxaVar;
        ?? dyaVar;
        q8f q8fVar;
        x16 x16Var;
        nw7 nw7Var3;
        nw7 nw7Var4;
        tt7 tt7VarH;
        bm3 bm3Var = this.a;
        e09 e09Var = this.b;
        rz3 rz3Var = this.c;
        wxa wxaVar = this.d;
        int i = this.e;
        t99 t99Var = this.i;
        yxa yxaVar = this.k;
        ?? F0 = yxaVar.F0(bm3Var, e09Var, rz3Var, wxaVar, i, t99Var);
        List typeParameters = yxaVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        q8f q8fVarM = xo1.M(typeParameters, this.f, F0, arrayList);
        tt7 tt7Var = this.j;
        dsf dsfVar = dsf.OUT_VARIANCE;
        tt7 tt7VarH2 = q8fVarM.h(tt7Var, dsfVar);
        nw7 nw7Var5 = null;
        if (tt7VarH2 != null) {
            dsf dsfVar2 = dsf.IN_VARIANCE;
            tt7 tt7VarH3 = q8fVarM.h(tt7Var, dsfVar2);
            if (tt7VarH3 != null) {
                F0.J0(tt7VarH3);
            }
            nw7 nw7Var6 = this.h;
            if (nw7Var6 != null) {
                nw7 nw7VarD = nw7Var6.d(q8fVarM);
                if (nw7VarD != null) {
                    nw7Var = nw7VarD;
                }
            } else {
                nw7Var = null;
            }
            nw7 nw7Var7 = yxaVar.K0;
            if (nw7Var7 == null || (tt7VarH = q8fVarM.h(nw7Var7.getType(), dsfVar2)) == null) {
                nw7Var2 = null;
            } else {
                nw7Var7.D0();
                nw7Var2 = new nw7(F0, new j85(F0, tt7VarH), nw7Var7.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = yxaVar.I0.iterator();
            while (it.hasNext()) {
                nw7 nw7Var8 = (nw7) it.next();
                tt7 tt7VarH4 = q8fVarM.h(nw7Var8.getType(), dsfVar2);
                if (tt7VarH4 == null) {
                    nw7Var3 = nw7Var5;
                    nw7Var4 = nw7Var3;
                } else {
                    nw7Var4 = nw7Var5;
                    t99 t99VarB0 = ((in2) nw7Var8.D0()).B0();
                    nw7Var8.D0();
                    nw7Var3 = new nw7(F0, new in2((ca1) F0, tt7VarH4, t99VarB0), nw7Var8.getAnnotations());
                }
                if (nw7Var3 != null) {
                    arrayList2.add(nw7Var3);
                }
                it = it;
                nw7Var5 = nw7Var4;
            }
            ?? r19 = nw7Var5;
            F0.K0(tt7VarH2, arrayList, nw7Var, nw7Var2, arrayList2);
            zxa zxaVar2 = yxaVar.M0;
            yx4 yx4Var = ntd.T;
            if (zxaVar2 == null) {
                zxaVar = r19;
            } else {
                h10 annotations = zxaVar2.getAnnotations();
                e09 e09Var2 = this.b;
                rz3 visibility = yxaVar.M0.getVisibility();
                if (this.e == 2 && sz3.e(sz3.f(visibility.a.l()))) {
                    visibility = sz3.h;
                }
                rz3 rz3Var2 = visibility;
                zxa zxaVar3 = yxaVar.M0;
                boolean z = zxaVar3.f;
                boolean z2 = zxaVar3.g;
                boolean z3 = zxaVar3.x;
                int i2 = this.e;
                wxa wxaVar2 = this.d;
                zxaVar = new zxa(F0, annotations, e09Var2, rz3Var2, z, z2, z3, i2, wxaVar2 == null ? r19 : wxaVar2.b(), yx4Var);
            }
            if (zxaVar != 0) {
                zxa zxaVar4 = yxaVar.M0;
                tt7 tt7Var2 = zxaVar4.Y;
                zxaVar.X = yxa.G0(q8fVarM, zxaVar4);
                zxaVar.F0(tt7Var2 != null ? q8fVarM.h(tt7Var2, dsfVar) : r19);
            }
            dya dyaVar2 = yxaVar.N0;
            if (dyaVar2 == null) {
                dyaVar = r19;
            } else {
                h10 annotations2 = dyaVar2.getAnnotations();
                e09 e09Var3 = this.b;
                rz3 visibility2 = yxaVar.N0.getVisibility();
                if (this.e == 2 && sz3.e(sz3.f(visibility2.a.l()))) {
                    visibility2 = sz3.h;
                }
                rz3 rz3Var3 = visibility2;
                dya dyaVar3 = yxaVar.N0;
                boolean z4 = dyaVar3.f;
                boolean z5 = dyaVar3.g;
                boolean z6 = dyaVar3.x;
                int i3 = this.e;
                wxa wxaVar3 = this.d;
                dyaVar = new dya(F0, annotations2, e09Var3, rz3Var3, z4, z5, z6, i3, wxaVar3 == null ? r19 : wxaVar3.c(), yx4Var);
            }
            if (dyaVar != 0) {
                q8fVar = q8fVarM;
                List listH0 = e36.H0(dyaVar, yxaVar.N0.G(), q8fVar, false, false, null);
                if (listH0 == null) {
                    listH0 = Collections.singletonList(dya.E0(dyaVar, qz3.e(this.a).o(), ((xrf) yxaVar.N0.G().get(0)).getAnnotations()));
                }
                if (listH0.size() != 1) {
                    r3.l();
                    return r19;
                }
                dyaVar.X = yxa.G0(q8fVar, yxaVar.N0);
                xrf xrfVar = (xrf) listH0.get(0);
                if (xrfVar == null) {
                    dya.k0(6);
                    throw r19;
                }
                dyaVar.Y = xrfVar;
            } else {
                q8fVar = q8fVarM;
            }
            sc5 sc5Var = yxaVar.O0;
            ?? sc5Var2 = sc5Var == null ? r19 : new sc5(sc5Var.getAnnotations(), F0);
            sc5 sc5Var3 = yxaVar.P0;
            F0.H0(zxaVar, dyaVar, sc5Var2, sc5Var3 == null ? r19 : new sc5(sc5Var3.getAnnotations(), F0));
            if (this.g) {
                dqd dqdVar = new dqd();
                Iterator it2 = yxaVar.l().iterator();
                while (it2.hasNext()) {
                    dqdVar.add(((wxa) it2.next()).d(q8fVar));
                }
                F0.z = dqdVar;
            }
            if (yxaVar.q() && (x16Var = yxaVar.w) != null) {
                F0.I0(yxaVar.v, x16Var);
            }
            return F0;
        }
        return null;
    }
}
