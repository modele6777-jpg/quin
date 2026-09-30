package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l0e extends gbe implements l26 {
    final /* synthetic */ Set $useCasesSnapshot$inlined;
    int label;
    final /* synthetic */ n0e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0e(xn2 xn2Var, Set set, n0e n0eVar) {
        super(2, xn2Var);
        this.$useCasesSnapshot$inlined = set;
        this.this$0 = n0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l0e(xn2Var, this.$useCasesSnapshot$inlined, this.this$0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int iIntValue;
        n0e n0eVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!this.$useCasesSnapshot$inlined.isEmpty()) {
            n0e n0eVar2 = this.this$0;
            Set set = this.$useCasesSnapshot$inlined;
            n0eVar2.getClass();
            boolean z = true;
            c0d c0dVar = new c0d(set, true);
            zzc zzcVar = ((yzc) c0dVar.e.getValue()).c() ? (zzc) c0dVar.f.getValue() : null;
            if (zzcVar != null) {
                int i = zzcVar.g.c;
                Integer numValueOf = i != -1 ? Integer.valueOf(i) : null;
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 1;
                }
            } else {
                iIntValue = 1;
            }
            synchronized (this.this$0.d) {
                n0eVar = this.this$0;
                if (n0eVar.i != iIntValue) {
                    n0eVar.i = iIntValue;
                } else {
                    z = false;
                }
            }
            if (z) {
                n0eVar.f();
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l0e l0eVar = (l0e) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        l0eVar.r(wefVar);
        return wefVar;
    }
}
