package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 implements hld, iv7 {
    public long a;
    public ArrayList b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hld
    public final Object a(xn2 xn2Var) throws Throwable {
        ml2 ml2Var;
        mmb mmbVar;
        Throwable th;
        b94 z84Var;
        if (xn2Var instanceof ml2) {
            ml2Var = (ml2) xn2Var;
            int i = ml2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ml2Var.label = i - Integer.MIN_VALUE;
            } else {
                ml2Var = new ml2(this, (zn2) xn2Var);
            }
        } else {
            ml2Var = new ml2(this, (zn2) xn2Var);
        }
        Object obj = ml2Var.result;
        int i2 = ml2Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            if (kl2.k(this.a)) {
                mmb mmbVar2 = new mmb();
                try {
                    ml2Var.L$0 = mmbVar2;
                    ml2Var.label = 1;
                    pl1 pl1Var = new pl1(1, k99.D(ml2Var));
                    pl1Var.v();
                    mmbVar2.element = pl1Var;
                    this.b.add(pl1Var);
                    Object objT = pl1Var.t();
                    bw2 bw2Var = bw2.a;
                    if (objT == bw2Var) {
                        return bw2Var;
                    }
                    mmbVar = mmbVar2;
                    ArrayList arrayList = this.b;
                    z7f.p(arrayList).remove(mmbVar.element);
                } catch (Throwable th2) {
                    mmbVar = mmbVar2;
                    th = th2;
                    ArrayList arrayList2 = this.b;
                    z7f.p(arrayList2).remove(mmbVar.element);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) ml2Var.L$0;
            try {
                jzb.q(obj);
                ArrayList arrayList3 = this.b;
                z7f.p(arrayList3).remove(mmbVar.element);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.b;
                z7f.p(arrayList4).remove(mmbVar.element);
                throw th;
            }
        }
        long j = this.a;
        int iH = kl2.h(j);
        b94 z84Var2 = a94.a;
        if (iH != Integer.MAX_VALUE) {
            z84.a(iH);
            z84Var = new z84(iH);
        } else {
            z84Var = z84Var2;
        }
        int iG = kl2.g(j);
        if (iG != Integer.MAX_VALUE) {
            z84.a(iG);
            z84Var2 = new z84(iG);
        }
        return new ykd(z84Var, z84Var2);
    }

    @Override // defpackage.iv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        e(j);
        cea ceaVarV = tn8Var.v(j);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 4));
    }

    public final void e(long j) {
        this.a = j;
        if (kl2.k(j)) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xn2) it.next()).g(wef.a);
        }
    }
}
