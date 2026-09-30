package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g9 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ long $generation;
    final /* synthetic */ o9 $this_run;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(o9 o9Var, String str, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_run = o9Var;
        this.$accountId = str;
        this.$generation = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g9(this.$this_run, this.$accountId, this.$generation, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        d99 d99Var;
        Throwable th;
        o9 o9Var;
        String str;
        o9 o9Var2;
        yof yofVar;
        d99 d99Var2;
        String str2;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                o9 o9Var3 = this.$this_run;
                String str3 = this.$accountId;
                long j = this.$generation;
                this.label = 1;
                int i2 = o9.z;
                obj = o9Var3.c(str3, j, this);
                if (obj == bw2Var) {
                }
                return bw2Var;
            }
            if (i == 1) {
                jzb.q(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.L$3;
                    o9Var = (o9) this.L$2;
                    d99Var = (d99) this.L$1;
                    th = (Throwable) this.L$0;
                    jzb.q(obj);
                    try {
                        o9Var.x = new d9(str, ((Number) o9Var.y.invoke()).longValue());
                        throw th;
                    } finally {
                        d99Var.h(null);
                    }
                }
                str2 = (String) this.L$3;
                o9Var2 = (o9) this.L$2;
                d99Var2 = (d99) this.L$1;
                yofVar = (yof) this.L$0;
                jzb.q(obj);
            }
            try {
                o9Var2.x = new d9(str2, ((Number) o9Var2.y.invoke()).longValue());
                return yofVar;
            } finally {
                d99Var2.h(null);
            }
            yof yofVar2 = (yof) obj;
            o9Var2 = this.$this_run;
            f99 f99Var = o9Var2.d;
            String str4 = this.$accountId;
            this.L$0 = yofVar2;
            this.L$1 = f99Var;
            this.L$2 = o9Var2;
            this.L$3 = str4;
            this.label = 2;
            if (f99Var.b(this) != bw2Var) {
                yofVar = yofVar2;
                d99Var2 = f99Var;
                str2 = str4;
                o9Var2.x = new d9(str2, ((Number) o9Var2.y.invoke()).longValue());
                return yofVar;
            }
        } catch (Throwable th2) {
            o9 o9Var4 = this.$this_run;
            d99Var = o9Var4.d;
            String str5 = this.$accountId;
            this.L$0 = th2;
            this.L$1 = d99Var;
            this.L$2 = o9Var4;
            this.L$3 = str5;
            this.label = 3;
            if (d99Var.b(this) != bw2Var) {
                th = th2;
                o9Var = o9Var4;
                str = str5;
            }
            return bw2Var;
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((g9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
