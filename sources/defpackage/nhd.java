package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nhd extends gbe implements l26 {
    final /* synthetic */ vhd $destination;
    final /* synthetic */ String $uid;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ohd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhd(ohd ohdVar, String str, vhd vhdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ohdVar;
        this.$uid = str;
        this.$destination = vhdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nhd nhdVar = new nhd(this.this$0, this.$uid, this.$destination, xn2Var);
        nhdVar.L$0 = obj;
        return nhdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.getClass();
        List<s7a> listA = ohd.a(p79Var);
        String str = this.$uid;
        vhd vhdVar = this.$destination;
        ArrayList arrayList = new ArrayList();
        for (s7a s7aVarA : listA) {
            if (pa7.t(s7aVarA.a, str)) {
                s7aVarA = s7a.a(s7aVarA, null, n3d.k(s7aVarA.f, vhdVar), 31);
                if (s7aVarA.f.isEmpty()) {
                    s7aVarA = null;
                }
            }
            if (s7aVarA != null) {
                arrayList.add(s7aVarA);
            }
        }
        this.this$0.getClass();
        ohd.f(p79Var, arrayList);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        nhd nhdVar = (nhd) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        nhdVar.r(wefVar);
        return wefVar;
    }
}
