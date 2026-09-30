package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l6f extends gbe implements l26 {
    final /* synthetic */ long $activeSession;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ t6f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6f(t6f t6fVar, String str, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = t6fVar;
        this.$chatId = str;
        this.$activeSession = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l6f(this.this$0, this.$chatId, this.$activeSession, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            i6f i6fVar = this.this$0.c;
            String str = this.$chatId;
            this.label = 1;
            if (i6fVar.a(str, this) != bw2Var) {
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        t6f t6fVar = this.this$0;
        String str2 = this.$chatId;
        long j = this.$activeSession;
        int i2 = t6f.F0;
        if (t6fVar.c(j, str2)) {
            t6f t6fVar2 = this.this$0;
            o8b o8bVar = t6fVar2.b;
            k6f k6fVar = new k6f(t6fVar2, this.$chatId, this.$activeSession, 0);
            this.label = 2;
            if (((bp3) o8bVar).l(false, k6fVar, this) == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l6f) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
