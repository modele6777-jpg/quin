package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ky7 extends ly7 {
    public static final /* synthetic */ int p = 0;
    public final enb n;
    public final rx7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky7(szc szcVar, enb enbVar, rx7 rx7Var) {
        super(szcVar, null);
        enbVar.getClass();
        this.n = enbVar;
        this.o = rx7Var;
    }

    public static wxa v(wxa wxaVar) {
        if (wxaVar.g() != 2) {
            return wxaVar;
        }
        Collection collectionL = wxaVar.l();
        collectionL.getClass();
        Collection<wxa> collection = collectionL;
        ArrayList arrayList = new ArrayList(t72.u(collection, 10));
        for (wxa wxaVar2 : collection) {
            wxaVar2.getClass();
            arrayList.add(v(wxaVar2));
        }
        return (wxa) s72.X0(s72.j1(s72.n1(arrayList)));
    }

    @Override // defpackage.er8, defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        return null;
    }

    @Override // defpackage.iy7
    public final Set h(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return xu4.a;
    }

    @Override // defpackage.iy7
    public final Set i(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        Set setN1 = s72.n1(((im3) this.e.invoke()).a());
        rx7 rx7Var = this.o;
        ky7 ky7VarQ = xxb.q(rx7Var);
        Set setC = ky7VarQ != null ? ky7VarQ.c() : null;
        if (setC == null) {
            setC = xu4.a;
        }
        setN1.addAll(setC);
        if (this.n.a.isEnum()) {
            setN1.addAll(t72.I(tyd.c, tyd.a));
        }
        szc szcVar = this.b;
        rx7Var.getClass();
        szcVar.getClass();
        setN1.addAll(new ArrayList());
        return setN1;
    }

    @Override // defpackage.iy7
    public final void j(t99 t99Var, ArrayList arrayList) {
        szc szcVar = this.b;
        this.o.getClass();
        szcVar.getClass();
    }

    @Override // defpackage.iy7
    public final im3 k() {
        return new c22(this.n, tj7.F0);
    }

    @Override // defpackage.iy7
    public final void m(LinkedHashSet linkedHashSet, t99 t99Var) {
        rx7 rx7Var = this.o;
        ky7 ky7VarQ = xxb.q(rx7Var);
        linkedHashSet.addAll(cn1.R(t99Var, ky7VarQ == null ? xu4.a : s72.o1(ky7VarQ.b(t99Var, lf9.e)), linkedHashSet, rx7Var, ((cf9) ((mf7) this.b.b).l).d));
        if (this.n.a.isEnum()) {
            if (t99Var.equals(tyd.c)) {
                linkedHashSet.add(af1.J(rx7Var));
            } else if (t99Var.equals(tyd.a)) {
                linkedHashSet.add(af1.K(rx7Var));
            }
        }
    }

    @Override // defpackage.ly7, defpackage.iy7
    public final void n(t99 t99Var, ArrayList arrayList) {
        yxa yxaVarI;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        x xVar = new x(24, t99Var);
        rx7 rx7Var = this.o;
        od4.m(t72.H(rx7Var), qk6.I0, new jy7(rx7Var, linkedHashSet, xVar));
        boolean zIsEmpty = arrayList.isEmpty();
        szc szcVar = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                wxa wxaVarV = v((wxa) obj);
                Object arrayList2 = linkedHashMap.get(wxaVarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(wxaVarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                x72.g0(arrayList3, cn1.R(t99Var, (Collection) ((Map.Entry) it.next()).getValue(), arrayList, rx7Var, ((cf9) ((mf7) szcVar.b).l).d));
            }
            arrayList.addAll(arrayList3);
        } else {
            arrayList.addAll(cn1.R(t99Var, linkedHashSet, arrayList, rx7Var, ((cf9) ((mf7) szcVar.b).l).d));
        }
        if (this.n.a.isEnum() && t99Var.equals(tyd.b) && (yxaVarI = af1.I(rx7Var)) != null) {
            arrayList.add(yxaVarI);
        }
    }

    @Override // defpackage.iy7
    public final Set o(ez3 ez3Var) {
        ez3Var.getClass();
        Set setN1 = s72.n1(((im3) this.e.invoke()).f());
        tj7 tj7Var = tj7.G0;
        rx7 rx7Var = this.o;
        od4.m(t72.H(rx7Var), qk6.I0, new jy7(rx7Var, setN1, tj7Var));
        if (this.n.a.isEnum()) {
            setN1.add(tyd.b);
        }
        return setN1;
    }

    @Override // defpackage.iy7
    public final bm3 q() {
        return this.o;
    }
}
