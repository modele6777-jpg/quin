package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qid extends h36 implements a26 {
    final /* synthetic */ rid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qid(rid ridVar) {
        super(1, oa7.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
        this.this$0 = ridVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Iterator it = this.this$0.b.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            if (!pa7.t(((ol9) it.next()).a.a.get(obj), Boolean.TRUE)) {
                ypf ypfVar = (ypf) obj;
                ypfVar.getClass();
                Integer numW = ypfVar.w();
                if ((numW != null ? numW.intValue() : 0) == 0) {
                    Integer numX = ypfVar.x();
                    if ((numX != null ? numX.intValue() : 0) == 0) {
                        Integer numC = ypfVar.c();
                        if ((numC != null ? numC.intValue() : 0) == 0) {
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            z2 = true;
        }
        z = z2;
        return Boolean.valueOf(z);
    }
}
