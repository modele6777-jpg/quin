package defpackage;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dne extends h36 implements a26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dne(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        Integer numA;
        lo7 lo7VarH;
        Object value;
        int i = this.a;
        boolean z = true;
        boolean z2 = true;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((rme) this.receiver).b.h((a26) obj);
                return wefVar;
            case 1:
                KeyEvent keyEvent = ((mo7) obj).a;
                npe npeVar = (npe) this.receiver;
                due dueVar = npeVar.f;
                boolean z3 = npeVar.d;
                ba2 ba2Var = (hfc.f(keyEvent) && (numA = npeVar.i.a(keyEvent)) != null) ? new ba2(new StringBuilder().appendCodePoint(numA.intValue()).toString(), 1) : null;
                if (ba2Var != null) {
                    if (z3) {
                        npeVar.a(t72.H(ba2Var));
                        dueVar.a = null;
                    } else {
                        z = false;
                    }
                } else if (nk8.r(keyEvent) != 2 || (lo7VarH = to7.a.h(keyEvent)) == null || (lo7VarH.a() && !z3)) {
                    z = false;
                } else {
                    imb imbVar = new imb();
                    imbVar.element = true;
                    bv9 bv9Var = new bv9(lo7VarH, npeVar, imbVar, 17);
                    zse zseVar = npeVar.c;
                    iqe iqeVar = new iqe(zseVar, npeVar.g, npeVar.a.d(), dueVar);
                    bv9Var.d(iqeVar);
                    boolean zC = eue.c(iqeVar.f, zseVar.b);
                    k00 k00Var = iqeVar.g;
                    if (!zC || !pa7.t(k00Var, zseVar.a)) {
                        npeVar.j.d(zse.a(zseVar, k00Var, iqeVar.f, 4));
                    }
                    npeVar.h.e = true;
                    z = imbVar.element;
                }
                return Boolean.valueOf(z);
            case 2:
                ((rcf) this.receiver).p(Integer.valueOf(((Number) obj).intValue()));
                return wefVar;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                bad badVar = (bad) this.receiver;
                l7a l7aVar = (l7a) badVar.i.getValue();
                if (l7aVar != null && s72.y0(iIntValue, badVar.c.c) == l7aVar.a.getFormat()) {
                    badVar.m();
                }
                return wefVar;
            case 4:
                return (Integer) ((txa) this.receiver).a(obj);
            case 5:
                bwa bwaVar = (bwa) obj;
                bwaVar.getClass();
                mhf mhfVar = (mhf) this.receiver;
                s0e s0eVar = mhfVar.S0;
                if (!mhfVar.q() && !((jhf) s0eVar.getValue()).f && ((jhf) s0eVar.getValue()).a.contains(bwaVar)) {
                    do {
                        value = s0eVar.getValue();
                    } while (!s0eVar.l(value, jhf.a((jhf) value, null, bwaVar, false, false, false, false, 253)));
                }
                return wefVar;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qmf qmfVar = (qmf) this.receiver;
                vz9 vz9Var = qmfVar.z;
                vz9 vz9Var2 = qmfVar.y;
                if (zBooleanValue) {
                    vz9Var2.setValue(Boolean.TRUE);
                    x16 x16Var = (x16) vz9Var.getValue();
                    if (x16Var != null) {
                        x16Var.invoke();
                    }
                } else {
                    vz9Var2.setValue(Boolean.FALSE);
                }
                vz9Var.setValue(null);
                return wefVar;
            case 7:
                String str = (String) obj;
                str.getClass();
                ((x1f) this.receiver).getClass();
                Iterator it = ((List) x1f.g.getValue()).iterator();
                while (it.hasNext()) {
                    ((o05) it.next()).f(str);
                }
                return wefVar;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                qmf qmfVar2 = (qmf) this.receiver;
                qmfVar2.getClass();
                qmfVar2.k(true);
                ynb.V(hwf.a(qmfVar2), null, null, new amf(qmfVar2, str2, null), 3).E(new ykf(qmfVar2, z2 ? 1 : 0));
                return wefVar;
            case 9:
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                gd7 gd7Var = (gd7) this.receiver;
                gd7Var.getClass();
                gd7Var.b = bv7Var;
                gd7Var.a();
                return wefVar;
            default:
                bv7 bv7Var2 = (bv7) obj;
                bv7Var2.getClass();
                gd7 gd7Var2 = (gd7) this.receiver;
                gd7Var2.getClass();
                gd7Var2.c = bv7Var2;
                gd7Var2.a();
                return wefVar;
        }
    }
}
