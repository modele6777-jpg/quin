package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ma extends zn2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(cb cbVar, zn2 zn2Var) {
        super(zn2Var);
        this.this$0 = cbVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable serializableB = this.this$0.b(this);
        return serializableB == bw2.a ? serializableB : new ezb(serializableB);
    }
}
