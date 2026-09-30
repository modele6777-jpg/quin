package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jc3 {
    public final /* synthetic */ d99 a;
    public final /* synthetic */ imb b;
    public final /* synthetic */ mmb c;
    public final /* synthetic */ od3 d;

    public jc3(d99 d99Var, imb imbVar, mmb mmbVar, od3 od3Var) {
        this.a = d99Var;
        this.b = imbVar;
        this.c = mmbVar;
        this.d = od3Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00ac, B:37:0x00b4), top: B:53:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ob3 ob3Var, zn2 zn2Var) throws Throwable {
        ic3 ic3Var;
        d99 d99Var;
        imb imbVar;
        mmb mmbVar;
        od3 od3Var;
        l26 l26Var;
        d99 d99Var2;
        d99 d99Var3;
        mmb mmbVar2;
        Object obj;
        if (zn2Var instanceof ic3) {
            ic3Var = (ic3) zn2Var;
            int i = ic3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ic3Var.label = i - Integer.MIN_VALUE;
            } else {
                ic3Var = new ic3(this, zn2Var);
            }
        } else {
            ic3Var = new ic3(this, zn2Var);
        }
        Object obj2 = ic3Var.result;
        int i2 = ic3Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj2);
                ic3Var.L$0 = ob3Var;
                d99Var = this.a;
                ic3Var.L$1 = d99Var;
                imbVar = this.b;
                ic3Var.L$2 = imbVar;
                mmbVar = this.c;
                ic3Var.L$3 = mmbVar;
                od3Var = this.d;
                ic3Var.L$4 = od3Var;
                ic3Var.label = 1;
                if (d99Var.b(ic3Var) != bw2Var) {
                }
                l26Var = ob3Var;
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = ic3Var.L$2;
                    mmbVar2 = (mmb) ic3Var.L$1;
                    d99Var2 = (d99) ic3Var.L$0;
                    try {
                        jzb.q(obj2);
                        mmbVar2.element = obj;
                        Object obj3 = mmbVar2.element;
                        d99Var2.h(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        d99Var2.h(null);
                        throw th;
                    }
                }
                od3Var = (od3) ic3Var.L$2;
                mmbVar2 = (mmb) ic3Var.L$1;
                d99Var3 = (d99) ic3Var.L$0;
                try {
                    jzb.q(obj2);
                    if (!pa7.t(obj2, mmbVar2.element)) {
                        ic3Var.L$0 = d99Var3;
                        ic3Var.L$1 = mmbVar2;
                        ic3Var.L$2 = obj2;
                        ic3Var.label = 3;
                        if (od3Var.i(obj2, false, ic3Var) != bw2Var) {
                            obj = obj2;
                            d99Var2 = d99Var3;
                            mmbVar2.element = obj;
                        }
                        l26Var = ob3Var;
                        return bw2Var;
                    }
                    d99Var2 = d99Var3;
                    Object obj4 = mmbVar2.element;
                    d99Var2.h(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2 = d99Var3;
                    d99Var2.h(null);
                    throw th;
                }
            }
            od3Var = (od3) ic3Var.L$4;
            mmb mmbVar3 = (mmb) ic3Var.L$3;
            imbVar = (imb) ic3Var.L$2;
            d99 d99Var4 = (d99) ic3Var.L$1;
            l26 l26Var2 = (l26) ic3Var.L$0;
            jzb.q(obj2);
            mmbVar = mmbVar3;
            l26Var = l26Var2;
            d99Var = d99Var4;
            l26Var = ob3Var;
            if (imbVar.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = mmbVar.element;
            ic3Var.L$0 = d99Var;
            ic3Var.L$1 = mmbVar;
            ic3Var.L$2 = od3Var;
            ic3Var.L$3 = null;
            ic3Var.L$4 = null;
            ic3Var.label = 2;
            Object objZ = l26Var.z(obj5, ic3Var);
            if (objZ != bw2Var) {
                d99Var3 = d99Var;
                obj2 = objZ;
                mmbVar2 = mmbVar;
                if (!pa7.t(obj2, mmbVar2.element)) {
                    ic3Var.L$0 = d99Var3;
                    ic3Var.L$1 = mmbVar2;
                    ic3Var.L$2 = obj2;
                    ic3Var.label = 3;
                    if (od3Var.i(obj2, false, ic3Var) != bw2Var) {
                        obj = obj2;
                        d99Var2 = d99Var3;
                        mmbVar2.element = obj;
                    }
                } else {
                    d99Var2 = d99Var3;
                }
                Object obj6 = mmbVar2.element;
                d99Var2.h(null);
                return obj6;
            }
            l26Var = ob3Var;
            return bw2Var;
        } catch (Throwable th3) {
            th = th3;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }
}
