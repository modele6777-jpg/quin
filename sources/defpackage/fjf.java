package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fjf extends gbe implements a26 {
    final /* synthetic */ List<CaptureRequest.Key<?>> $keys;
    final /* synthetic */ zif $type;
    int label;
    final /* synthetic */ pjf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjf(pjf pjfVar, zif zifVar, List list, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = pjfVar;
        this.$type = zifVar;
        this.$keys = list;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new fjf(this.this$0, this.$type, this.$keys, (xn2) obj).r(wef.a);
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
        zif zifVar = this.$type;
        List<CaptureRequest.Key<?>> list = this.$keys;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#removeParametersAsync: [" + zifVar + "] keys = " + list);
        }
        LinkedHashMap linkedHashMap = this.this$0.k;
        zif zifVar2 = this.$type;
        Object cjfVar = linkedHashMap.get(zifVar2);
        if (cjfVar == null) {
            cjfVar = new cjf((vd9) null, (LinkedHashMap) null, (ttb) null, 15);
            linkedHashMap.put(zifVar2, cjfVar);
        }
        cjf cjfVar2 = (cjf) cjfVar;
        LinkedHashMap linkedHashMap2 = this.this$0.k;
        zif zifVar3 = this.$type;
        List<CaptureRequest.Key<?>> list2 = this.$keys;
        vd9 vd9Var = new vd9(8);
        vd9Var.y((k79) cjfVar2.a.b);
        list2.getClass();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((k79) vd9Var.b).w(af1.D((CaptureRequest.Key) it.next()));
        }
        linkedHashMap2.put(zifVar3, new cjf(vd9Var, bm8.Y(cjfVar2.b), s72.n1(cjfVar2.c), cjfVar2.d));
        pjf pjfVar = this.this$0;
        cjf cjfVarM = pjf.m(pjfVar.k);
        this.label = 1;
        Object objP = pjfVar.p(cjfVarM, null, this);
        bw2 bw2Var = bw2.a;
        return objP == bw2Var ? bw2Var : objP;
    }
}
