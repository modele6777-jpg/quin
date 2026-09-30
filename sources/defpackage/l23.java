package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l23 extends mh3 {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Serializable Q;

    public l23(mmb mmbVar, a26 a26Var) {
        this.O = 1;
        this.Q = mmbVar;
        this.P = a26Var;
    }

    @Override // defpackage.mh3
    public final Object U() {
        int i = this.O;
        Object obj = this.Q;
        switch (i) {
            case 0:
                return Boolean.valueOf(((boolean[]) obj)[0]);
            case 1:
                return (ea1) ((mmb) obj).element;
            default:
                ak7 ak7Var = (ak7) ((mmb) obj).element;
                return ak7Var == null ? ak7.d : ak7Var;
        }
    }

    @Override // defpackage.mh3
    public void h(Object obj) {
        switch (this.O) {
            case 1:
                ea1 ea1Var = (ea1) obj;
                ea1Var.getClass();
                mmb mmbVar = (mmb) this.Q;
                if (mmbVar.element == null && ((Boolean) ((a26) this.P).d(ea1Var)).booleanValue()) {
                    mmbVar.element = ea1Var;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mh3
    public final boolean i(Object obj) {
        int i = this.O;
        Object obj2 = this.P;
        Object obj3 = this.Q;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                if (((Boolean) ((a26) obj2).d(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                ((ea1) obj).getClass();
                return ((mmb) obj3).element == null;
            default:
                u09 u09Var = (u09) obj;
                mmb mmbVar = (mmb) obj3;
                u09Var.getClass();
                String str = (String) obj2;
                String str2 = qf7.a;
                j22 j22VarH = qf7.h(qz3.g(u09Var).a);
                String str3 = (j22VarH != null ? gk7.c(j22VarH) : y41.f(u09Var, gec.y)) + '.' + str;
                if (ek7.b.contains(str3)) {
                    mmbVar.element = ak7.a;
                } else if (ek7.d.contains(str3)) {
                    mmbVar.element = ak7.b;
                } else if (ek7.c.contains(str3)) {
                    mmbVar.element = ak7.c;
                } else if (ek7.a.contains(str3)) {
                    mmbVar.element = ak7.e;
                }
                return mmbVar.element == null;
        }
    }

    public /* synthetic */ l23(Object obj, Serializable serializable, int i) {
        this.O = i;
        this.P = obj;
        this.Q = serializable;
    }
}
