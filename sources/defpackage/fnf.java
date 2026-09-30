package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fnf extends gbe implements l26 {
    final /* synthetic */ String $exposureId;
    final /* synthetic */ Long $generation;
    final /* synthetic */ cnf $key;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ inf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnf(inf infVar, cnf cnfVar, Long l, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = infVar;
        this.$key = cnfVar;
        this.$generation = l;
        this.$exposureId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fnf(this.this$0, this.$key, this.$generation, this.$exposureId, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [cnf] */
    /* JADX WARN: Type inference failed for: r12v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8, types: [long] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        fnf fnfVar;
        inf infVar;
        long jLongValue;
        cnf cnfVar;
        boolean z;
        String str = "Timed out persisting user popup exposure: ";
        String strLongValue = "Failed to persist user popup exposure: ";
        bw2 bw2Var = bw2.a;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        jzb.q(obj);
                        dg7 dg7VarZ = tq.z(getContext());
                        inf infVar2 = this.this$0;
                        Object obj2 = infVar2.a;
                        cnf cnfVar2 = this.$key;
                        Long l = this.$generation;
                        synchronized (obj2) {
                            Long l2 = (Long) infVar2.c.get(cnfVar2);
                            long jLongValue2 = l.longValue();
                            if (l2 != null && l2.longValue() == jLongValue2) {
                                infVar2.d.put(cnfVar2, dg7VarZ);
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (!z) {
                            return wef.a;
                        }
                        inf infVar3 = this.this$0;
                        cnf cnfVar3 = this.$key;
                        long jLongValue3 = this.$generation.longValue();
                        this.L$0 = null;
                        this.Z$0 = z;
                        this.label = 1;
                        if (infVar3.f(cnfVar3, jLongValue3, this) == bw2Var) {
                            return bw2Var;
                        }
                    } else {
                        if (i != 1) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jzb.q(obj);
                    }
                    inf infVar4 = this.this$0;
                    str = this.$key;
                    strLongValue = this.$generation.longValue();
                    this = inf.g;
                    cnfVar = str;
                    jLongValue = strLongValue;
                    infVar = infVar4;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    this.this$0.d().c(strLongValue + this.$exposureId, e2);
                    fnfVar = this;
                    inf infVar5 = fnfVar.this$0;
                    cnfVar = fnfVar.$key;
                    jLongValue = fnfVar.$generation.longValue();
                    infVar = infVar5;
                }
            } catch (kye e3) {
                this.this$0.d().c(str + this.$exposureId, e3);
                fnfVar = this;
                inf infVar6 = fnfVar.this$0;
                cnfVar = fnfVar.$key;
                jLongValue = fnfVar.$generation.longValue();
                infVar = infVar6;
            }
            infVar.g(cnfVar, jLongValue);
            return wef.a;
        } catch (Throwable th) {
            inf infVar7 = this.this$0;
            cnf cnfVar4 = this.$key;
            long jLongValue4 = this.$generation.longValue();
            int i2 = inf.g;
            infVar7.g(cnfVar4, jLongValue4);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fnf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
