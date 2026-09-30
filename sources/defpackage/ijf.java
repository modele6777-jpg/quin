package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ijf extends gbe implements a26 {
    final /* synthetic */ ph2 $optionPriority;
    final /* synthetic */ zif $type;
    final /* synthetic */ Map<CaptureRequest.Key<?>, Object> $values;
    int label;
    final /* synthetic */ pjf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijf(pjf pjfVar, zif zifVar, Map map, ph2 ph2Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = pjfVar;
        this.$type = zifVar;
        this.$values = map;
        this.$optionPriority = ph2Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new ijf(this.this$0, this.$type, this.$values, this.$optionPriority, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        pjf pjfVar = this.this$0;
        zif zifVar = this.$type;
        Map<CaptureRequest.Key<?>, Object> map = this.$values;
        ph2 ph2Var = this.$optionPriority;
        this.label = 1;
        za2 za2Var = pjf.l;
        Object objO = pjfVar.o(zifVar, map, ph2Var, this);
        bw2 bw2Var = bw2.a;
        return objO == bw2Var ? bw2Var : objO;
    }
}
