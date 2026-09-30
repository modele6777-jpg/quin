package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ejf extends gbe implements a26 {
    final /* synthetic */ int $captureMode;
    final /* synthetic */ List<im1> $captureSequence;
    final /* synthetic */ int $flashMode;
    final /* synthetic */ int $flashType;
    int label;
    final /* synthetic */ pjf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejf(pjf pjfVar, List list, int i, int i2, int i3, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = pjfVar;
        this.$captureSequence = list;
        this.$captureMode = i;
        this.$flashType = i2;
        this.$flashMode = i3;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new ejf(this.this$0, this.$captureSequence, this.$captureMode, this.$flashType, this.$flashMode, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControlImpl#issueSingleCaptureAsync");
            }
            pjf pjfVar = this.this$0;
            List<im1> list = this.$captureSequence;
            za2 za2Var = pjf.l;
            pjfVar.getClass();
            loop0: for (im1 im1Var : list) {
                if (!Collections.unmodifiableList(im1Var.a).isEmpty()) {
                    List listUnmodifiableList = Collections.unmodifiableList(im1Var.a);
                    listUnmodifiableList.getClass();
                    Iterator it = listUnmodifiableList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Map) pjfVar.c.f.getValue()).get((lu3) it.next()) == null) {
                            }
                        }
                    }
                }
                pjf pjfVar2 = this.this$0;
                int size = this.$captureSequence.size();
                pjfVar2.getClass();
                pjf.l(size, "Capture request failed due to invalid surface");
            }
            cjf cjfVarM = pjf.m(this.this$0.k);
            pjf pjfVar3 = this.this$0;
            List<im1> list2 = this.$captureSequence;
            int i2 = this.$captureMode;
            int i3 = this.$flashType;
            int i4 = this.$flashMode;
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControl: Submitting still captures to capture pipeline");
            }
            pm1 pm1Var = (pm1) pjfVar3.h.getValue();
            ttb ttbVar = cjfVarM.d;
            ttbVar.getClass();
            int i5 = ttbVar.a;
            od1 od1VarG = cjfVarM.a.g();
            this.label = 1;
            obj = pm1Var.c(list2, i5, od1VarG, i2, i3, i4, this);
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
        return (List) obj;
    }
}
