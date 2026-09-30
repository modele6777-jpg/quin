package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 extends gbe implements l26 {
    final /* synthetic */ use $text;
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft2(r0 r0Var, use useVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = r0Var;
        this.$text = useVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ft2(this.$vm, this.$text, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int length = ((String) this.$vm.e1.getValue()).length();
        use useVar = this.$text;
        if (length == 0) {
            n3d.g(useVar);
        } else {
            String str = (String) this.$vm.e1.getValue();
            une uneVarH = useVar.h();
            q0a q0aVar = uneVarH.c;
            try {
                uneVarH.c(0, q0aVar.length(), str);
                uneVarH.h(u3c.b(0, q0aVar.length()));
                useVar.a(uneVarH);
            } finally {
                useVar.c();
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ft2 ft2Var = (ft2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ft2Var.r(wefVar);
        return wefVar;
    }
}
