package defpackage;

import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rsb implements xj5 {
    public final /* synthetic */ xj5 a;

    public rsb(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) throws jzc {
        qsb qsbVar;
        if (xn2Var instanceof qsb) {
            qsbVar = (qsb) xn2Var;
            int i = qsbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsbVar.label = i - Integer.MIN_VALUE;
            } else {
                qsbVar = new qsb(this, xn2Var);
            }
        } else {
            qsbVar = new qsb(this, xn2Var);
        }
        Object obj2 = qsbVar.result;
        int i2 = qsbVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            hsb hsbVar = (hsb) obj;
            if (hsbVar instanceof gsb) {
                throw new jzc(Constants.MINIMAL_ERROR_STATUS_CODE, 110002, null, null, null, 252);
            }
            if (!(hsbVar instanceof fsb)) {
                ap.c();
                return null;
            }
            v16 v16Var = ((fsb) hsbVar).a;
            qsbVar.L$0 = null;
            qsbVar.L$1 = null;
            qsbVar.L$2 = null;
            qsbVar.L$3 = null;
            qsbVar.label = 1;
            Object objA = this.a.a(v16Var, qsbVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
