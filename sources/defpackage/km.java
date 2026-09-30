package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class km extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(mm mmVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mmVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        km kmVar = new km(this.this$0, xn2Var);
        kmVar.L$0 = obj;
        return kmVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object hmVar;
        hsb hsbVar = (hsb) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        mm mmVar = this.this$0;
        if (hsbVar instanceof gsb) {
            hmVar = gm.b;
        } else {
            if (!(hsbVar instanceof fsb)) {
                ap.c();
                return null;
            }
            hmVar = new hm(((fsb) hsbVar).a);
        }
        mmVar.c.setValue(hmVar);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        km kmVar = (km) k((xn2) obj2, (hsb) obj);
        wef wefVar = wef.a;
        kmVar.r(wefVar);
        return wefVar;
    }
}
