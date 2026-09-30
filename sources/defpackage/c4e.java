package defpackage;

import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c4e extends gbe implements l26 {
    final /* synthetic */ l26 $makeObject;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4e(l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$makeObject = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        c4e c4eVar = new c4e(this.$makeObject, xn2Var);
        c4eVar.L$0 = obj;
        return c4eVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        StringWriter stringWriter = (StringWriter) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return obj;
        }
        jzb.q(obj);
        String string = stringWriter.toString();
        string.getClass();
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        l26 l26Var = this.$makeObject;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object objZ = l26Var.z(string, this);
        bw2 bw2Var = bw2.a;
        return objZ == bw2Var ? bw2Var : objZ;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c4e) k((xn2) obj2, (StringWriter) obj)).r(wef.a);
    }
}
