package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vpe implements h0e, c1e {
    public aue c;
    public final vz9 a = new vz9(null, upe.f);
    public final vz9 b = new vz9(null, tpe.g);
    public spe d = new spe();

    @Override // defpackage.c1e
    public final f1e c() {
        return this.d;
    }

    @Override // defpackage.c1e
    public final void f(f1e f1eVar) {
        this.d = (spe) f1eVar;
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        tpe tpeVar;
        upe upeVar = (upe) this.a.getValue();
        if (upeVar == null || (tpeVar = (tpe) this.b.getValue()) == null) {
            return null;
        }
        return h(upeVar, tpeVar);
    }

    public final ste h(upe upeVar, tpe tpeVar) {
        ArrayList arrayList;
        rd8 rd8Var;
        CharSequence charSequence;
        mue mueVar;
        Object objB;
        vne vneVarD = upeVar.a.d();
        List listN = vneVarD.a;
        xse xseVar = vneVarD.b;
        if (xseVar != null) {
            nue nueVar = xseVar.a;
            arrayList = new ArrayList();
            p67 p67Var = nueVar.b;
            if (p67Var.d != p67Var.e) {
                int i = 4;
                while (true) {
                    x69 x69Var = p67Var.b;
                    if (i >= x69Var.b) {
                        break;
                    }
                    if (!ok8.I(x69Var.d(i)) && (objB = p67Var.a.b(i / 4)) != null) {
                        long jN = p67Var.n(i);
                        int iJ = ok8.J(jN);
                        if (iJ > nueVar.c) {
                            iJ -= nueVar.c();
                        }
                        int iC = (int) (jN & 2147483647L);
                        if (iC > nueVar.c) {
                            iC -= nueVar.c();
                        }
                        arrayList.add(new j00(objB, iJ, iC));
                    }
                    i += 4;
                }
            }
        } else {
            arrayList = null;
        }
        if ((listN == null || listN.isEmpty()) && (arrayList == null || arrayList.isEmpty())) {
            listN = null;
        } else if (listN == null || listN.isEmpty()) {
            listN = arrayList;
        } else if (arrayList != null && !arrayList.isEmpty()) {
            c78 c78VarW = t72.w();
            c78VarW.addAll(listN);
            c78VarW.addAll(arrayList);
            listN = c78VarW.n();
        }
        spe speVar = (spe) qrd.f(this.d);
        ste steVar = speVar.n;
        if (steVar != null && (charSequence = speVar.c) != null && c5e.t(charSequence, vneVarD) && pa7.t(speVar.d, listN) && pa7.t(speVar.e, vneVarD.e) && speVar.g == upeVar.c && speVar.h == upeVar.d && speVar.k == tpeVar.b && speVar.i == tpeVar.a.getDensity() && speVar.j == tpeVar.a.h0() && kl2.b(speVar.m, tpeVar.d) && pa7.t(speVar.l, tpeVar.c) && !steVar.b.a.e()) {
            mue mueVar2 = speVar.f;
            boolean zD = mueVar2 != null ? mueVar2.d(upeVar.b) : false;
            mue mueVar3 = speVar.f;
            boolean z = mueVar3 != null && (mueVar3 == (mueVar = upeVar.b) || mueVar3.a.c(mueVar.a));
            if (zD && z) {
                return steVar;
            }
            if (zD) {
                rte rteVar = steVar.a;
                return new ste(new rte(rteVar.a, upeVar.b, rteVar.c, rteVar.d, rteVar.e, rteVar.f, rteVar.g, rteVar.h, rteVar.i, rteVar.j), steVar.b, steVar.c);
            }
        }
        aue aueVar = this.c;
        if (aueVar == null) {
            aueVar = new aue(tpeVar.c, tpeVar.a, tpeVar.b, 1);
            this.c = aueVar;
        }
        aue aueVar2 = aueVar;
        boolean z2 = upeVar.e;
        mue mueVarE = upeVar.b;
        if (z2) {
            sd8 sd8Var = mueVarE.a.k;
            if (sd8Var == null || (rd8Var = (rd8) sd8Var.a.get(0)) == null) {
                rd8Var = (rd8) cfa.a.s().a.get(0);
            }
            byte bV = Build.VERSION.SDK_INT >= 28 ? s.V(rd8Var) : Character.getDirectionality(DecimalFormatSymbols.getInstance(rd8Var.a).getZeroDigit());
            mueVarE = mueVarE.e(new mue(0L, 0L, null, null, null, 0L, 0L, 0, (bV == 1 || bV == 2) ? 2 : 1, 0L, null, null, 16711679));
        }
        ste steVarB = aue.b(aueVar2, new k00(vneVarD.c.toString(), listN == null ? pu4.a : listN), mueVarE, 0, upeVar.d, upeVar.c ? 1 : Integer.MAX_VALUE, tpeVar.d, tpeVar.b, tpeVar.a, tpeVar.c, 1060);
        if (!steVarB.equals(steVar)) {
            ird irdVarH = qrd.h();
            if (!irdVarH.f()) {
                spe speVar2 = this.d;
                synchronized (qrd.c) {
                    spe speVar3 = (spe) qrd.w(speVar2, this, irdVarH);
                    speVar3.c = vneVarD;
                    speVar3.d = listN;
                    speVar3.e = vneVarD.e;
                    speVar3.g = upeVar.c;
                    speVar3.h = upeVar.d;
                    speVar3.f = upeVar.b;
                    speVar3.k = tpeVar.b;
                    speVar3.i = tpeVar.e;
                    speVar3.j = tpeVar.f;
                    speVar3.m = tpeVar.d;
                    speVar3.l = tpeVar.c;
                    speVar3.n = steVarB;
                }
                qrd.l(irdVarH, this);
                return steVarB;
            }
        }
        return steVarB;
    }

    @Override // defpackage.c1e
    public final f1e d(f1e f1eVar, f1e f1eVar2, f1e f1eVar3) {
        return f1eVar3;
    }
}
