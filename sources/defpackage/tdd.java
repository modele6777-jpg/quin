package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tdd extends gu7 implements x16 {
    final /* synthetic */ xdd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdd(xdd xddVar) {
        super(0);
        this.this$0 = xddVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Collection<hcd> collectionValues = this.this$0.w.e().c.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (hcd hcdVar : collectionValues) {
                if (hcdVar.d() || hcdVar.e()) {
                    break;
                }
            }
        }
        return wef.a;
    }
}
