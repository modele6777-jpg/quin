package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cxg extends oxg {
    public final /* synthetic */ int e;
    public final /* synthetic */ fug f;
    public final /* synthetic */ vxg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxg(vxg vxgVar, fug fugVar, int i) {
        super(vxgVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = fugVar;
                Objects.requireNonNull(vxgVar);
                this.g = vxgVar;
                super(vxgVar, true);
                break;
            case 2:
                this.f = fugVar;
                Objects.requireNonNull(vxgVar);
                this.g = vxgVar;
                super(vxgVar, true);
                break;
            default:
                this.f = fugVar;
                Objects.requireNonNull(vxgVar);
                this.g = vxgVar;
                break;
        }
    }

    @Override // defpackage.oxg
    public final void a() {
        switch (this.e) {
            case 0:
                mug mugVar = this.g.f;
                oa7.A(mugVar);
                mugVar.getGmpAppId(this.f);
                break;
            case 1:
                mug mugVar2 = this.g.f;
                oa7.A(mugVar2);
                mugVar2.getCachedAppInstanceId(this.f);
                break;
            case 2:
                mug mugVar3 = this.g.f;
                oa7.A(mugVar3);
                mugVar3.generateEventId(this.f);
                break;
            case 3:
                mug mugVar4 = this.g.f;
                oa7.A(mugVar4);
                mugVar4.getCurrentScreenName(this.f);
                break;
            default:
                mug mugVar5 = this.g.f;
                oa7.A(mugVar5);
                mugVar5.getCurrentScreenClass(this.f);
                break;
        }
    }

    @Override // defpackage.oxg
    public final void b() {
        int i = this.e;
        fug fugVar = this.f;
        switch (i) {
            case 0:
                fugVar.x(null);
                break;
            case 1:
                fugVar.x(null);
                break;
            case 2:
                fugVar.x(null);
                break;
            case 3:
                fugVar.x(null);
                break;
            default:
                fugVar.x(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxg(vxg vxgVar, fug fugVar, int i, boolean z) {
        super(vxgVar, true);
        this.e = i;
        this.f = fugVar;
        this.g = vxgVar;
    }
}
