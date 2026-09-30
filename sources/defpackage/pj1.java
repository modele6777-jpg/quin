package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pj1 {
    public final a90 a;
    public final rd1 b;
    public final nd1 c;
    public final sd1 d;
    public final uce e;
    public final ch1 f;
    public final qwe g;
    public final za2 h;

    public pj1(a90 a90Var, rd1 rd1Var, nd1 nd1Var, sd1 sd1Var, uce uceVar, ch1 ch1Var, qwe qweVar) {
        rd1Var.getClass();
        nd1Var.getClass();
        sd1Var.getClass();
        uceVar.getClass();
        qweVar.getClass();
        this.a = a90Var;
        this.b = rd1Var;
        this.c = nd1Var;
        this.d = sd1Var;
        this.e = uceVar;
        this.f = ch1Var;
        this.g = qweVar;
        this.h = new za2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(String str, int i, long j, hd1 hd1Var, lk0 lk0Var, zn2 zn2Var) throws Throwable {
        ej1 ej1Var;
        hd1 hd1Var2;
        lk0 lk0Var2;
        long j2;
        int i2;
        String str2;
        if (zn2Var instanceof ej1) {
            ej1Var = (ej1) zn2Var;
            int i3 = ej1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ej1Var.label = i3 - Integer.MIN_VALUE;
            } else {
                ej1Var = new ej1(this, zn2Var);
            }
        } else {
            ej1Var = new ej1(this, zn2Var);
        }
        Object objP0 = ej1Var.result;
        bw2 bw2Var = bw2.a;
        int i4 = ej1Var.label;
        if (i4 == 0) {
            jzb.q(objP0);
            rd1 rd1Var = this.b;
            ej1Var.L$0 = str;
            ej1Var.L$1 = hd1Var;
            ej1Var.L$2 = lk0Var;
            ej1Var.I$0 = i;
            ej1Var.J$0 = j;
            ej1Var.label = 1;
            qd1 qd1Var = (qd1) rd1Var;
            synchronized (qd1Var.f) {
                yg1 yg1Var = (yg1) qd1Var.f.get(str);
                objP0 = yg1Var != null ? yg1Var : ynb.p0(qd1Var.b.f, new pd1(qd1Var, str, null), ej1Var);
            }
            if (objP0 != bw2Var) {
                hd1Var2 = hd1Var;
                lk0Var2 = lk0Var;
                j2 = j;
                i2 = i;
                str2 = str;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                jzb.q(objP0);
                return objP0;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = ej1Var.J$0;
        int i5 = ej1Var.I$0;
        lk0 lk0Var3 = (lk0) ej1Var.L$2;
        hd1 hd1Var3 = (hd1) ej1Var.L$1;
        String str3 = (String) ej1Var.L$0;
        jzb.q(objP0);
        lk0Var2 = lk0Var3;
        j2 = j3;
        hd1Var2 = hd1Var3;
        str2 = str3;
        i2 = i5;
        yg1 yg1Var2 = (yg1) objP0;
        uce uceVar = this.e;
        nd1 nd1Var = this.c;
        sd1 sd1Var = this.d;
        qwe qweVar = this.g;
        ch1 ch1Var = this.f;
        oj1 oj1Var = new oj1(this, str2, new kp(str2, yg1Var2, i2, j2, uceVar, nd1Var, hd1Var2, sd1Var, qweVar, lk0Var2, ch1Var.a, ch1Var.b), null);
        ej1Var.L$0 = null;
        ej1Var.L$1 = null;
        ej1Var.L$2 = null;
        ej1Var.label = 2;
        s8e s8eVar = new s8e(ej1Var, ej1Var.getContext());
        Object objC = gcc.C(s8eVar, true, s8eVar, oj1Var);
        return objC == bw2Var ? bw2Var : objC;
    }
}
