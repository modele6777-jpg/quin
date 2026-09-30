package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kc3 extends gbe implements a26 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ od3 this$0;
    final /* synthetic */ lc3 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc3(od3 od3Var, lc3 lc3Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = od3Var;
        this.this$1 = lc3Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new kc3(this.this$0, this.this$1, (xn2) obj).r(wef.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a1->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        d99 f99Var;
        imb imbVar;
        mmb mmbVar;
        mmb mmbVar2;
        imb imbVar2;
        d99 d99Var;
        Iterator it;
        d99 d99Var2;
        imb imbVar3;
        mmb mmbVar3;
        jc3 jc3Var;
        mmb mmbVar4;
        l26 l26Var;
        Object obj2;
        int iHashCode;
        Object objA;
        Object obj3;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            f99Var = new f99();
            imbVar = new imb();
            mmbVar = new mmb();
            od3 od3Var = this.this$0;
            this.L$0 = f99Var;
            this.L$1 = imbVar;
            this.L$2 = mmbVar;
            this.L$3 = mmbVar;
            this.label = 1;
            obj = od3Var.h(true, this);
            if (obj != bw2Var) {
                mmbVar2 = mmbVar;
            }
            return bw2Var;
        }
        if (i == 1) {
            mmbVar = (mmb) this.L$3;
            mmbVar2 = (mmb) this.L$2;
            imbVar = (imb) this.L$1;
            f99Var = (d99) this.L$0;
            jzb.q(obj);
        } else {
            if (i == 2) {
                it = (Iterator) this.L$4;
                jc3Var = (jc3) this.L$3;
                mmbVar3 = (mmb) this.L$2;
                imbVar3 = (imb) this.L$1;
                d99Var2 = (d99) this.L$0;
                jzb.q(obj);
                while (it.hasNext()) {
                    l26Var = (l26) it.next();
                    this.L$0 = d99Var2;
                    this.L$1 = imbVar3;
                    this.L$2 = mmbVar3;
                    this.L$3 = jc3Var;
                    this.L$4 = it;
                    this.label = 2;
                    if (l26Var.z(jc3Var, this) == bw2Var) {
                        return bw2Var;
                    }
                }
                mmbVar2 = mmbVar3;
                imbVar2 = imbVar3;
                d99Var = d99Var2;
                this.this$1.c = null;
                this.L$0 = imbVar2;
                this.L$1 = mmbVar2;
                this.L$2 = d99Var;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (d99Var.b(this) != bw2Var) {
                    mmbVar4 = mmbVar2;
                    imbVar2.element = true;
                    d99Var.h(null);
                    obj2 = mmbVar4.element;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    k77 k77VarC = this.this$0.c();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    objA = k77VarC.a(this);
                    if (objA != bw2Var) {
                        obj = objA;
                        obj3 = obj2;
                    }
                }
                return bw2Var;
            }
            if (i == 3) {
                d99Var = (d99) this.L$2;
                mmbVar4 = (mmb) this.L$1;
                imbVar2 = (imb) this.L$0;
                jzb.q(obj);
                try {
                    imbVar2.element = true;
                    d99Var.h(null);
                    obj2 = mmbVar4.element;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    k77 k77VarC2 = this.this$0.c();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    objA = k77VarC2.a(this);
                    if (objA != bw2Var) {
                        obj = objA;
                        obj3 = obj2;
                    }
                    return bw2Var;
                } catch (Throwable th) {
                    d99Var.h(null);
                    throw th;
                }
            }
            if (i != 4) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iHashCode = this.I$0;
            obj3 = this.L$0;
            jzb.q(obj);
        }
        return new cb3(obj3, iHashCode, ((Number) obj).intValue());
        mmbVar.element = ((cb3) obj).b;
        jc3 jc3Var2 = new jc3(f99Var, imbVar, mmbVar2, this.this$0);
        List list = this.this$1.c;
        if (list != null) {
            it = list.iterator();
            d99Var2 = f99Var;
            imbVar3 = imbVar;
            mmbVar3 = mmbVar2;
            jc3Var = jc3Var2;
            while (it.hasNext()) {
                l26Var = (l26) it.next();
                this.L$0 = d99Var2;
                this.L$1 = imbVar3;
                this.L$2 = mmbVar3;
                this.L$3 = jc3Var;
                this.L$4 = it;
                this.label = 2;
                if (l26Var.z(jc3Var, this) == bw2Var) {
                    return bw2Var;
                }
            }
            mmbVar2 = mmbVar3;
            imbVar2 = imbVar3;
            d99Var = d99Var2;
        } else {
            imbVar2 = imbVar;
            d99Var = f99Var;
        }
        this.this$1.c = null;
        this.L$0 = imbVar2;
        this.L$1 = mmbVar2;
        this.L$2 = d99Var;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (d99Var.b(this) != bw2Var) {
            mmbVar4 = mmbVar2;
            imbVar2.element = true;
            d99Var.h(null);
            obj2 = mmbVar4.element;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            k77 k77VarC3 = this.this$0.c();
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = iHashCode;
            this.label = 4;
            objA = k77VarC3.a(this);
            if (objA != bw2Var) {
                obj = objA;
                obj3 = obj2;
                return new cb3(obj3, iHashCode, ((Number) obj).intValue());
            }
        }
        return bw2Var;
    }
}
