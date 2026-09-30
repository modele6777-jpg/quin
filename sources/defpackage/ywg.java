package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ywg extends oxg {
    public final /* synthetic */ vxg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywg(vxg vxgVar) {
        super(vxgVar, true);
        Objects.requireNonNull(vxgVar);
        this.e = vxgVar;
    }

    @Override // defpackage.oxg
    public final void a() {
        vxg vxgVar = this.e;
        long j = vxgVar.g;
        mug mugVar = vxgVar.f;
        if (j >= 170) {
            oa7.A(mugVar);
            mugVar.resetAnalyticsDataWithElapsedTime(this.a, this.b);
        } else {
            oa7.A(mugVar);
            mugVar.resetAnalyticsData(this.a);
        }
    }
}
