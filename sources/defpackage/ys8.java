package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ys8 extends eg2 {
    public static final op8 s;
    public final fu0[] k;
    public final ArrayList l;
    public final gye[] m;
    public final ArrayList n;
    public final i8c o;
    public int p;
    public long[][] q;
    public ws8 r;

    static {
        d82 d82Var = new d82();
        new eu4();
        List list = Collections.EMPTY_LIST;
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        jp8 jp8Var = new jp8();
        s = new op8("MergingMediaSource", new ip8(d82Var), null, new kp8(jp8Var), rp8.C, mp8.a);
    }

    public ys8(fu0... fu0VarArr) {
        i8c i8cVar = new i8c(24);
        this.k = fu0VarArr;
        this.o = i8cVar;
        this.n = new ArrayList(Arrays.asList(fu0VarArr));
        this.p = -1;
        this.l = new ArrayList(fu0VarArr.length);
        for (int i = 0; i < fu0VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new gye[fu0VarArr.length];
        this.q = new long[0][];
        new HashMap();
        ynb.D(8, "expectedKeys");
        ynb.D(2, "expectedValuesPerKey");
        na2 na2VarB = na2.b();
        new b69();
        pa7.A(na2VarB.isEmpty());
    }

    @Override // defpackage.fu0
    public final up8 a(zp8 zp8Var, ta0 ta0Var, long j) {
        fu0[] fu0VarArr = this.k;
        int length = fu0VarArr.length;
        up8[] up8VarArr = new up8[length];
        gye[] gyeVarArr = this.m;
        int iB = gyeVarArr[0].b(zp8Var.a);
        for (int i = 0; i < length; i++) {
            zp8 zp8VarA = zp8Var.a(gyeVarArr[i].l(iB));
            up8VarArr[i] = fu0VarArr[i].a(zp8VarA, ta0Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new xs8(zp8VarA, up8VarArr[i]));
        }
        return new vs8(this.o, this.q[iB], up8VarArr);
    }

    @Override // defpackage.fu0
    public final op8 g() {
        fu0[] fu0VarArr = this.k;
        return fu0VarArr.length > 0 ? fu0VarArr[0].g() : s;
    }

    @Override // defpackage.eg2, defpackage.fu0
    public final void i() throws ws8 {
        ws8 ws8Var = this.r;
        if (ws8Var != null) {
            throw ws8Var;
        }
        super.i();
    }

    @Override // defpackage.fu0
    public final void k(lp3 lp3Var) {
        this.j = pqf.n(null);
        int i = 0;
        while (true) {
            fu0[] fu0VarArr = this.k;
            if (i >= fu0VarArr.length) {
                return;
            }
            w(Integer.valueOf(i), fu0VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.fu0
    public final void m(up8 up8Var) {
        vs8 vs8Var = (vs8) up8Var;
        int i = 0;
        while (true) {
            fu0[] fu0VarArr = this.k;
            if (i >= fu0VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = vs8Var.b;
            up8[] up8VarArr = vs8Var.a;
            up8 up8Var2 = zArr[i] ? ((xxe) up8VarArr[i]).a : up8VarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((xs8) list.get(i2)).b.equals(up8Var2)) {
                    list.remove(i2);
                    break;
                }
            }
            fu0VarArr[i].m(vs8Var.b[i] ? ((xxe) up8VarArr[i]).a : up8VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.eg2, defpackage.fu0
    public final void o() {
        super.o();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.fu0
    public final void r(op8 op8Var) {
        this.k[0].r(op8Var);
    }

    @Override // defpackage.eg2
    public final zp8 s(Object obj, zp8 zp8Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((xs8) list.get(i)).a.equals(zp8Var)) {
                return ((xs8) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.eg2
    public final void v(Object obj, fu0 fu0Var, gye gyeVar) {
        int iH;
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            iH = gyeVar.h();
            this.p = iH;
        } else {
            int iH2 = gyeVar.h();
            int i = this.p;
            if (iH2 != i) {
                this.r = new ws8();
                return;
            }
            iH = i;
        }
        int length = this.q.length;
        gye[] gyeVarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iH, gyeVarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(fu0Var);
        gyeVarArr[num.intValue()] = gyeVar;
        if (arrayList.isEmpty()) {
            l(gyeVarArr[0]);
        }
    }
}
