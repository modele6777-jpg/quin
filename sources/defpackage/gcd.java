package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gcd extends gu7 implements x16 {
    final /* synthetic */ hcd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcd(hcd hcdVar) {
        super(0);
        this.this$0 = hcdVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        List listB = this.this$0.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            icd icdVar = (icd) listB.get(i);
            if (icdVar.i() && icdVar.k()) {
                break;
            }
        }
        return wef.a;
    }
}
