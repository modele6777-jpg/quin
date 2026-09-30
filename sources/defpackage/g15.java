package defpackage;

import tech.chatmind.api.events.model.EventType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g15 extends gbe implements l26 {
    final /* synthetic */ String $eventId;
    final /* synthetic */ EventType $eventType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g15(EventType eventType, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$eventType = eventType;
        this.$eventId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g15(this.$eventType, this.$eventId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int i = z05.a[this.$eventType.ordinal()];
        if (i == 1) {
            hs3 hs3Var = xqa.W;
            String str = this.$eventId;
            ynb.V(lw2.a, null, null, new c15(hs3Var.a, str, null), 3);
        } else if (i == 2) {
            hs3 hs3Var2 = xqa.X;
            String str2 = this.$eventId;
            ynb.V(lw2.a, null, null, new f15(hs3Var2.a, str2, null), 3);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        g15 g15Var = (g15) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        g15Var.r(wefVar);
        return wefVar;
    }
}
