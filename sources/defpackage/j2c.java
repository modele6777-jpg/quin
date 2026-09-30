package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j2c extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k2c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2c(k2c k2cVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = k2cVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        j2c j2cVar = new j2c(this.this$0, xn2Var);
        j2cVar.L$0 = obj;
        return j2cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            p1c p1cVar = this.this$0.a;
            this.L$0 = str;
            this.label = 1;
            obj = p1cVar.i(this, new z8b(p1cVar), str);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        k2c k2cVar = this.this$0;
        String str2 = (String) k2cVar.d.remove(str);
        if (str2 != null) {
            ConcurrentHashMap.KeySetView keySetView = k2cVar.c;
            keySetView.getClass();
            keySetView.remove(str2);
        }
        return obj;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j2c) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
